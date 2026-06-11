import java.util.StringTokenizer;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public final class AutoLocDoPanel extends Form implements CommandListener {
   private ChoiceGroup modeGroup;
   private TextField minSellField;
   private TextField keepRulesField;
   private Command saveCmd;
   private Command cancelCmd;

   public static boolean isSellAtVillageOn = mResources.d("ald_sell_village") == 1;
   public static int minSellYen = getInt("ald_min_sell", 5);
   public static String keepRules = getString("ald_keep_rules");
   private static long lastCleanTime;
   private static long lastFullBagReturnTime;

   public AutoLocDoPanel() {
      super("Loc do");
      this.append(this.modeGroup = new ChoiceGroup("Che do", ChoiceGroup.EXCLUSIVE, new String[]{"Ban tai truong/lang", "Khong loc"}, (Image[])null));
      this.modeGroup.setSelectedIndex(isSellAtVillageOn ? 0 : 1, true);
      this.append(this.minSellField = new TextField("Ban neu gia yen >", String.valueOf(minSellYen), 6, TextField.NUMERIC));
      this.append(this.keepRulesField = new TextField("Giu lai id:option>=value", keepRules, 240, TextField.ANY));
      this.append("Luat cach nhau bang ; vi du: 123:73>=100,82>=50 hoac 456 de giu toan bo item id 456.");
      this.addCommand(this.saveCmd = new Command("Luu", Command.OK, 0));
      this.addCommand(this.cancelCmd = new Command("Huy", Command.CANCEL, 0));
      this.setCommandListener(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.saveCmd) {
         try {
            isSellAtVillageOn = this.modeGroup.getSelectedIndex() == 0;
            minSellYen = parseInt(this.minSellField.getString(), 5);
            if (minSellYen < 0) {
               minSellYen = 0;
            }

            keepRules = this.keepRulesField.getString();
            save();
            GameCanvas.a("Luu cai dat Loc do thanh cong");
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Loi", "Co loi xay ra. Hay xem lai cai dat loc do!", (Image)null, AlertType.ERROR));
            return;
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }

   public static void processBag() {
      if (!isSellAtVillageOn || Char.getMyChar() == null || Char.getMyChar().arrItemBag == null) {
         return;
      }

      if (!TileMap.f(TileMap.mapID) && !TileMap.d(TileMap.mapID)) {
         processFullBagReturn();
         return;
      }

      long var0 = System.currentTimeMillis();
      if (var0 - lastCleanTime < 1500L) {
         return;
      }

      Item[] var2 = Char.getMyChar().arrItemBag;
      for(int var3 = 0; var3 < var2.length; ++var3) {
         Item var4 = var2[var3];
         if (canProcess(var4) && !shouldKeep(var4)) {
            lastCleanTime = var0;
            if (var4.saleCoinLock > minSellYen) {
               Service.gI().saleItem(var3, var4.quantity > 1 ? var4.quantity : 1);
            } else {
               Service.gI().throwItem(var3);
            }

            return;
         }
      }

   }

   private static boolean canProcess(Item var0) {
      return var0 != null && var0.template != null && !var0.isLock;
   }

   private static void processFullBagReturn() {
      if (NSOT_MOB.b == null || !isBagAlmostFull()) {
         return;
      }

      long var0 = System.currentTimeMillis();
      if (var0 - lastFullBagReturnTime < 8000L) {
         return;
      }

      lastFullBagReturnTime = var0;
      Char var2 = Char.getMyChar();
      if (var2.cHp <= 0 || var2.statusMe == 14 || var2.statusMe == 5) {
         GameScr.addChatPopup("Tui day, ve lang de loc do");
         Service.gI().returnTownFromDead();
         return;
      }

      GameScr.addChatPopup("Tui day, tu ve lang ban do");
      NSOT_MOB.o();
   }

   private static boolean isBagAlmostFull() {
      Item[] var0 = Char.getMyChar().arrItemBag;
      int var1 = 0;
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == null) {
            ++var1;
         }
      }

      return var1 <= 2;
   }

   private static boolean shouldKeep(Item var0) {
      return matchesKeepRules(var0);
   }

   private static boolean matchesKeepRules(Item var0) {
      if (keepRules == null || keepRules.trim().length() == 0) {
         return false;
      }

      StringTokenizer var1 = new StringTokenizer(keepRules, ";\n");
      while(var1.hasMoreTokens()) {
         String var2 = var1.nextToken().trim();
         if (matchesRule(var0, var2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean matchesRule(Item var0, String var1) {
      if (var1 == null || var1.length() == 0) {
         return false;
      }

      int var2 = var1.indexOf(58);
      String var3 = var2 >= 0 ? var1.substring(0, var2).trim() : var1.trim();
      if (parseInt(var3, -1) != var0.template.id) {
         return false;
      }

      if (var2 < 0) {
         return true;
      }

      String var4 = var1.substring(var2 + 1);
      StringTokenizer var5 = new StringTokenizer(var4, ",");
      boolean var6 = false;

      while(var5.hasMoreTokens()) {
         String var7 = var5.nextToken().trim();
         if (var7.length() > 0) {
            var6 = true;
            if (!matchesOptionCondition(var0, var7)) {
               return false;
            }
         }
      }

      return var6;
   }

   private static boolean matchesOptionCondition(Item var0, String var1) {
      int var2 = var1.indexOf(">=");
      int var3 = 2;
      byte var4 = 1;
      if (var2 < 0) {
         var2 = var1.indexOf("<=");
         var4 = 2;
      }

      if (var2 < 0) {
         var2 = var1.indexOf(62);
         var3 = 1;
         var4 = 3;
      }

      if (var2 < 0) {
         var2 = var1.indexOf(60);
         var3 = 1;
         var4 = 4;
      }

      if (var2 < 0) {
         var2 = var1.indexOf(61);
         var3 = 1;
         var4 = 5;
      }

      if (var2 < 0) {
         return getOptionParam(var0, parseInt(var1, -1)) != -2147483648;
      }

      int var5 = parseInt(var1.substring(0, var2).trim(), -1);
      int var6 = parseInt(var1.substring(var2 + var3).trim(), 0);
      int var7 = getOptionParam(var0, var5);
      if (var7 == -2147483648) {
         return false;
      }

      if (var4 == 1) {
         return var7 >= var6;
      } else if (var4 == 2) {
         return var7 <= var6;
      } else if (var4 == 3) {
         return var7 > var6;
      } else if (var4 == 4) {
         return var7 < var6;
      } else {
         return var7 == var6;
      }
   }

   private static int getOptionParam(Item var0, int var1) {
      if (var1 < 0 || var0.options == null) {
         return -2147483648;
      }

      for(int var2 = 0; var2 < var0.options.size(); ++var2) {
         ItemOption var3 = (ItemOption)var0.options.elementAt(var2);
         if (var3 != null && var3.optionTemplate != null && var3.optionTemplate.id == var1) {
            return var3.param;
         }
      }

      return -2147483648;
   }

   private static String getString(String var0) {
      String var1 = mResources.c(var0);
      return var1 == null ? "" : var1;
   }

   private static int getInt(String var0, int var1) {
      String var2 = mResources.c(var0);
      return var2 == null ? var1 : parseInt(var2, var1);
   }

   private static int parseInt(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var3) {
         return var1;
      }
   }

   private static void save() {
      mResources.a("ald_sell_village", isSellAtVillageOn ? 1 : -1);
      mResources.a("ald_min_sell", String.valueOf(minSellYen));
      mResources.a("ald_keep_rules", keepRules == null ? "" : keepRules);
   }
}

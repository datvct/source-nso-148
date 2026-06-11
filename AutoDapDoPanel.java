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

public final class AutoDapDoPanel extends Form implements CommandListener {
   private ChoiceGroup enableGroup;
   private ChoiceGroup sourceGroup;
   private ChoiceGroup targetGroup;
   private ChoiceGroup optionGroup;
   private TextField bagIndexField;
   private Command saveCmd;
   private Command cancelCmd;

   public static boolean isOn = mResources.d("add_on") == 1;
   public static boolean useFocusedItem = mResources.b("add_use_focus") == null || mResources.d("add_use_focus") == 1;
   public static boolean useBuaItem = mResources.d("add_use_bua") == 1;
   public static boolean useLuongInsurance = mResources.d("add_use_luong") == 1;
   public static int bagIndex = getInt("add_bag_index", 0);
   public static int targetLevel = getInt("add_target_level", 8);
   private static long lastUpgradeTime;

   public AutoDapDoPanel() {
      super("Auto dap do");
      String var1 = getFocusedInfo();
      this.append(var1);
      this.append(this.enableGroup = new ChoiceGroup("Trang thai", ChoiceGroup.EXCLUSIVE, new String[]{"Bat", "Tat"}, (Image[])null));
      this.enableGroup.setSelectedIndex(isOn ? 0 : 1, true);
      this.append(this.sourceGroup = new ChoiceGroup("Chon do", ChoiceGroup.EXCLUSIVE, new String[]{"Do dang tro", "Nhap index tui"}, (Image[])null));
      this.sourceGroup.setSelectedIndex(useFocusedItem ? 0 : 1, true);
      this.append(this.bagIndexField = new TextField("Index tui", String.valueOf(bagIndex), 3, TextField.NUMERIC));
      this.append(this.targetGroup = new ChoiceGroup("Dap toi cap", ChoiceGroup.EXCLUSIVE, buildLevels(), (Image[])null));
      this.targetGroup.setSelectedIndex(clamp(targetLevel, 1, 16) - 1, true);
      this.append(this.optionGroup = new ChoiceGroup("Tuy chon", ChoiceGroup.MULTIPLE, new String[]{"Dung bua/type 28 neu co", "Dung bao hiem luong"}, (Image[])null));
      this.optionGroup.setSelectedIndex(0, useBuaItem);
      this.optionGroup.setSelectedIndex(1, useLuongInsurance);
      this.addCommand(this.saveCmd = new Command("Luu", Command.OK, 0));
      this.addCommand(this.cancelCmd = new Command("Huy", Command.CANCEL, 0));
      this.setCommandListener(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.saveCmd) {
         try {
            isOn = this.enableGroup.getSelectedIndex() == 0;
            useFocusedItem = this.sourceGroup.getSelectedIndex() == 0;
            bagIndex = useFocusedItem ? GameScr.indexSelect : parseInt(this.bagIndexField.getString(), bagIndex);
            targetLevel = this.targetGroup.getSelectedIndex() + 1;
            useBuaItem = this.optionGroup.isSelected(0);
            useLuongInsurance = this.optionGroup.isSelected(1);
            save();
            GameCanvas.a("Luu Auto dap do thanh cong");
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Loi", "Hay xem lai cai dat Auto dap do!", (Image)null, AlertType.ERROR));
            return;
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }

   public static void process() {
      if (!isOn || Char.getMyChar() == null || Char.getMyChar().arrItemBag == null) {
         return;
      }

      if (!(NSOT_MOB.b instanceof AutoDapDo)) {
         NSOT_MOB.a((Auto)(new AutoDapDo()));
      }
   }

   public static void processUpgrade() {
      if (!isOn || Char.getMyChar() == null || Char.getMyChar().arrItemBag == null) {
         finish((String)null);
         return;
      }

      long var0 = System.currentTimeMillis();
      if (var0 - lastUpgradeTime < 2500L) {
         return;
      }

      Item var2 = getTargetItem();
      if (var2 == null) {
         finish("Khong tim thay do dap");
         return;
      }

      if (!canUpgrade(var2)) {
         finish("Do nay khong the dap");
         return;
      }

      int var3 = clamp(targetLevel, 1, var2.getUpMax());
      if (var2.upgrade >= var3) {
         finish("Da dat cap +" + var2.upgrade);
         return;
      }

      Item[] var4 = buildMaterials(var2.indexUI);
      if (!hasStone(var4)) {
         finish("Het da dap do");
         return;
      }

      lastUpgradeTime = var0;
      Service.gI().upgradeItem(var2, var4, useLuongInsurance);
   }

   private static Item getTargetItem() {
      Item[] var0 = Char.getMyChar().arrItemBag;
      int var1 = bagIndex;
      if (var1 < 0 || var1 >= var0.length) {
         return null;
      }

      return var0[var1];
   }

   private static boolean canUpgrade(Item var0) {
      return var0 != null && var0.template != null && var0.isTypeBody() && var0.template.level >= 10 && var0.template.type < 10 && var0.upgrade < var0.getUpMax();
   }

   private static Item[] buildMaterials(int var0) {
      Item[] var1 = new Item[18];
      Item[] var2 = Char.getMyChar().arrItemBag;
      int var3 = 0;
      if (useBuaItem) {
         for(int var4 = 0; var4 < var2.length && var3 < var1.length; ++var4) {
            if (var2[var4] != null && var2[var4].indexUI != var0 && var2[var4].template != null && var2[var4].template.type == 28) {
               var1[var3++] = var2[var4];
               break;
            }
         }
      }

      for(int var5 = 0; var5 < var2.length && var3 < var1.length; ++var5) {
         if (var2[var5] != null && var2[var5].indexUI != var0 && var2[var5].template != null && var2[var5].template.type == 26) {
            var1[var3++] = var2[var5];
         }
      }

      return var1;
   }

   private static boolean hasStone(Item[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (var0[var1] != null && var0[var1].template != null && var0[var1].template.type == 26) {
            return true;
         }
      }

      return false;
   }

   public static void finish(String var0) {
      isOn = false;
      save();
      if (var0 != null) {
         GameScr.addChatPopup(var0);
      }

      if (NSOT_MOB.b instanceof AutoDapDo) {
         NSOT_MOB.d();
      }
   }

   private static String[] buildLevels() {
      String[] var0 = new String[16];
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1] = "+" + (var1 + 1);
      }

      return var0;
   }

   private static String getFocusedInfo() {
      Item[] var0 = Char.getMyChar() == null ? null : Char.getMyChar().arrItemBag;
      int var1 = GameScr.indexSelect;
      if (var0 != null && var1 >= 0 && var1 < var0.length && var0[var1] != null && var0[var1].template != null) {
         return "Dang tro index: " + var1 + " - " + var0[var1].template.name + " +" + var0[var1].upgrade;
      }

      return "Dang tro index: " + var1;
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

   private static int clamp(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public static void save() {
      mResources.a("add_on", isOn ? 1 : -1);
      mResources.a("add_use_focus", useFocusedItem ? 1 : -1);
      mResources.a("add_use_bua", useBuaItem ? 1 : -1);
      mResources.a("add_use_luong", useLuongInsurance ? 1 : -1);
      mResources.a("add_bag_index", String.valueOf(bagIndex));
      mResources.a("add_target_level", String.valueOf(targetLevel));
   }
}

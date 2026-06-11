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

public final class AutoKichYenPanel extends Form implements CommandListener {
   private ChoiceGroup optionsGroup;
   private TextField normalHpField;
   private TextField normalPercentField;
   private TextField eliteHpField;
   private TextField elitePercentField;
   private TextField chiefHpField;
   private TextField chiefPercentField;
   private Command saveCmd;
   private Command cancelCmd;

   public static boolean isAutoKichYenOn = mResources.d("aky_on") == 1;
   public static boolean isNormalOn = mResources.d("aky_normal_on") == 1;
   public static boolean isEliteOn = mResources.d("aky_elite_on") == 1;
   public static boolean isChiefOn = mResources.d("aky_chief_on") == 1;
   public static boolean isFastOptimizeOn = mResources.d("aky_fast_on") == 1;
   public static int normalHp = getInt("aky_normal_hp", 0);
   public static int normalPercent = getInt("aky_normal_percent", -1);
   public static int eliteHp = getInt("aky_elite_hp", 0);
   public static int elitePercent = getInt("aky_elite_percent", -1);
   public static int chiefHp = getInt("aky_chief_hp", 0);
   public static int chiefPercent = getInt("aky_chief_percent", -1);
   private static long lastAttackPacketTime;
   private static long lastMovePacketTime;

   public AutoKichYenPanel() {
      super("Auto Kích Yên Nhóm");
      this.append(this.optionsGroup = new ChoiceGroup("Tùy chọn", ChoiceGroup.MULTIPLE, new String[]{"Kích Yên Nhóm", "Quái thường", "Tinh anh", "Thủ lĩnh", "Đánh nhanh tối ưu"}, (Image[])null));
      this.optionsGroup.setSelectedIndex(0, isAutoKichYenOn);
      this.optionsGroup.setSelectedIndex(1, isNormalOn);
      this.optionsGroup.setSelectedIndex(2, isEliteOn);
      this.optionsGroup.setSelectedIndex(3, isChiefOn);
      this.optionsGroup.setSelectedIndex(4, isFastOptimizeOn);
      this.append(this.normalHpField = new TextField("Quái thường HP dừng (-1 nếu dùng %):", String.valueOf(normalHp), 9, TextField.ANY));
      this.append(this.normalPercentField = new TextField("Quái thường % dừng (-1 nếu dùng HP):", String.valueOf(normalPercent), 4, TextField.ANY));
      this.append(this.eliteHpField = new TextField("Tinh anh HP dừng (-1 nếu dùng %):", String.valueOf(eliteHp), 9, TextField.ANY));
      this.append(this.elitePercentField = new TextField("Tinh anh % dừng (-1 nếu dùng HP):", String.valueOf(elitePercent), 4, TextField.ANY));
      this.append(this.chiefHpField = new TextField("Thủ lĩnh HP dừng (-1 nếu dùng %):", String.valueOf(chiefHp), 9, TextField.ANY));
      this.append(this.chiefPercentField = new TextField("Thủ lĩnh % dừng (-1 nếu dùng HP):", String.valueOf(chiefPercent), 4, TextField.ANY));
      this.addCommand(this.saveCmd = new Command("Lưu", Command.OK, 0));
      this.addCommand(this.cancelCmd = new Command("Hủy", Command.CANCEL, 0));
      this.setCommandListener(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.saveCmd) {
         try {
            isAutoKichYenOn = this.optionsGroup.isSelected(0);
            isNormalOn = this.optionsGroup.isSelected(1);
            isEliteOn = this.optionsGroup.isSelected(2);
            isChiefOn = this.optionsGroup.isSelected(3);
            isFastOptimizeOn = this.optionsGroup.isSelected(4);
            normalHp = parseInt(this.normalHpField.getString(), 0);
            normalPercent = parsePercent(this.normalPercentField.getString());
            eliteHp = parseInt(this.eliteHpField.getString(), 0);
            elitePercent = parsePercent(this.elitePercentField.getString());
            chiefHp = parseInt(this.chiefHpField.getString(), 0);
            chiefPercent = parsePercent(this.chiefPercentField.getString());
            save();
            GameCanvas.a("Lưu cài đặt Kích Yên thành công");
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
            return;
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }

   public static boolean canAttack(Mob var0) {
      if (!isAutoKichYenOn || var0 == null || var0.maxHp <= 0) {
         return true;
      }

      int var1 = var0.levelBoss;
      if (var1 <= 0) {
         return !isNormalOn || var0.hp > getStopHp(normalHp, normalPercent, var0.maxHp);
      }

      if (var1 == 1) {
         return !isEliteOn || var0.hp > getStopHp(eliteHp, elitePercent, var0.maxHp);
      }

      if (var1 == 2 || var0.isBoss) {
         return !isChiefOn || var0.hp > getStopHp(chiefHp, chiefPercent, var0.maxHp);
      }

      return true;
   }

   public static long attackDelay(long var0) {
      if (!isFastOptimizeOn) {
         return var0;
      }

      long var2 = var0 * 3L / 5L;
      return var2 < 60L ? 60L : var2;
   }

   public static long cooldownDelay(long var0) {
      return isFastOptimizeOn ? var0 / 2L : var0;
   }

   public static long retargetDelay(long var0) {
      return isFastOptimizeOn ? var0 * 7L / 10L : var0;
   }

   public static void waitAttackWindow() {
      if (!isFastOptimizeOn) {
         return;
      }

      long var0 = System.currentTimeMillis();
      long var2 = 260L + var0 % 90L;
      long var4 = var0 - lastAttackPacketTime;
      if (var4 < var2) {
         try {
            Thread.sleep(var2 - var4);
         } catch (Exception var7) {
         }
      }

      lastAttackPacketTime = System.currentTimeMillis();
   }

   public static void waitMoveWindow() {
      if (!isFastOptimizeOn) {
         return;
      }

      long var0 = System.currentTimeMillis();
      long var2 = 180L + var0 % 70L;
      long var4 = var0 - lastMovePacketTime;
      if (var4 < var2) {
         try {
            Thread.sleep(var2 - var4);
         } catch (Exception var7) {
         }
      }

      lastMovePacketTime = System.currentTimeMillis();
   }

   private static int getStopHp(int var0, int var1, int var2) {
      if (var0 >= 0) {
         return var0;
      }

      if (var1 >= 0) {
         return var2 * var1 / 100;
      }

      return -1;
   }

   private static int getInt(String var0, int var1) {
      String var2 = mResources.c(var0);
      return var2 == null ? var1 : parseInt(var2, var1);
   }

   private static int parsePercent(String var0) {
      int var1 = parseInt(var0, -1);
      if (var1 > 100) {
         var1 = 100;
      }

      return var1;
   }

   private static int parseInt(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var3) {
         return var1;
      }
   }

   private static void save() {
      mResources.a("aky_on", isAutoKichYenOn ? 1 : -1);
      mResources.a("aky_normal_on", isNormalOn ? 1 : -1);
      mResources.a("aky_elite_on", isEliteOn ? 1 : -1);
      mResources.a("aky_chief_on", isChiefOn ? 1 : -1);
      mResources.a("aky_fast_on", isFastOptimizeOn ? 1 : -1);
      mResources.a("aky_normal_hp", String.valueOf(normalHp));
      mResources.a("aky_normal_percent", String.valueOf(normalPercent));
      mResources.a("aky_elite_hp", String.valueOf(eliteHp));
      mResources.a("aky_elite_percent", String.valueOf(elitePercent));
      mResources.a("aky_chief_hp", String.valueOf(chiefHp));
      mResources.a("aky_chief_percent", String.valueOf(chiefPercent));
   }
}

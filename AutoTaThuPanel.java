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

public final class AutoTaThuPanel extends Form implements CommandListener {
   private ChoiceGroup toggleGroup;
   private TextField startHourField;
   private TextField startMinuteField;
   private Command saveCmd;
   public static boolean isPartyTaThuOn = mResources.d("auto_party_tathu_on") == 1;
   public static int startHour = getInt("auto_party_tathu_start_hour", 0);
   public static int startMinute = getInt("auto_party_tathu_start_minute", 0);

   public AutoTaThuPanel() {
      super("Cài đặt tà thú nhóm");
      this.append(this.toggleGroup = new ChoiceGroup("Auto Tà thú nhóm", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.startHourField = new TextField("Giờ bắt đầu (0-23): ", String.valueOf(startHour), 2, TextField.NUMERIC));
      this.append(this.startMinuteField = new TextField("Phút bắt đầu (0-59): ", String.valueOf(startMinute), 2, TextField.NUMERIC));
      this.addCommand(this.saveCmd = new Command("Save", 4, 0));
      this.addCommand(new Command("Cancel", 7, 0));
      this.setCommandListener(this);
      this.toggleGroup.setSelectedIndex(isPartyTaThuOn ? 0 : 1, true);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.saveCmd) {
         try {
            isPartyTaThuOn = this.toggleGroup.getSelectedIndex() == 0;
            startHour = clamp(parseInt(this.startHourField.getString(), startHour), 0, 23);
            startMinute = clamp(parseInt(this.startMinuteField.getString(), startMinute), 0, 59);
            mResources.a("auto_party_tathu_on", isPartyTaThuOn ? 1 : -1);
            mResources.a("auto_party_tathu_start_hour", String.valueOf(startHour));
            mResources.a("auto_party_tathu_start_minute", String.valueOf(startMinute));
            if (isPartyTaThuOn) {
               // Lưu map/zone tập hợp là map/zone hiện tại
               TaskTaThuAuto.partyGatherMapId = TileMap.mapID;
               TaskTaThuAuto.partyGatherZoneId = TileMap.zoneID;
               TaskTaThuAuto.partyQuestCount = 0; // Reset số lần nhận nhiệm vụ
               mResources.a("auto_party_tathu_map", String.valueOf(TaskTaThuAuto.partyGatherMapId));
               mResources.a("auto_party_tathu_zone", String.valueOf(TaskTaThuAuto.partyGatherZoneId));
            }
            GameCanvas.a("Lưu cài đặt thành công");
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }

   public static boolean isStartTime(int var0, int var1) {
      return var0 == startHour && var1 >= startMinute;
   }

   public static boolean hasGatherPoint() {
      return TaskTaThuAuto.partyGatherMapId >= 0 && TaskTaThuAuto.partyGatherZoneId >= 0;
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
}

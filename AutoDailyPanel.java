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

public final class AutoDailyPanel extends Form implements CommandListener {
   private TextField hourField;
   private TextField minuteField;
   private ChoiceGroup toggleGroup;
   private ChoiceGroup optionsGroup;
   private Command saveCmd;
   public static boolean isAutoDailyOn = mResources.d("auto_daily_on") == 1;
   public static boolean isAutoDHDOn = mResources.d("auto_dhd_on") == 1;
   public static int autoDailyHour = getInt("auto_daily_time", 0);
   public static int autoDailyMinute = getInt("auto_daily_minute", 0);

   public AutoDailyPanel() {
      super("Cài đặt hẹn giờ nhiệm vụ hằng ngày");
      this.append(this.toggleGroup = new ChoiceGroup("Tự động NV hằng ngày", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.hourField = new TextField("Giờ bắt đầu (0-23): ", String.valueOf(autoDailyHour), 2, TextField.NUMERIC));
      this.append(this.minuteField = new TextField("Phút bắt đầu (0-59): ", String.valueOf(autoDailyMinute), 2, TextField.NUMERIC));
      this.addCommand(this.saveCmd = new Command("Save", 4, 0));
      this.addCommand(new Command("Cancel", 7, 0));
      this.setCommandListener(this);
      this.toggleGroup.setSelectedIndex(isAutoDailyOn ? 0 : 1, true);

      this.append(this.optionsGroup = new ChoiceGroup("Tùy chọn thêm", ChoiceGroup.MULTIPLE, new String[]{"Tự động cày DHD (Treo Login->NVHN->TT->Off)"}, (Image[])null));
      this.optionsGroup.setSelectedIndex(0, isAutoDHDOn);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.saveCmd) {
         try {
            autoDailyHour = Integer.parseInt(this.hourField.getString());
            if (autoDailyHour < 0) autoDailyHour = 0;
            if (autoDailyHour > 23) autoDailyHour = 23;
            autoDailyMinute = Integer.parseInt(this.minuteField.getString());
            if (autoDailyMinute < 0) autoDailyMinute = 0;
            if (autoDailyMinute > 59) autoDailyMinute = 59;
            isAutoDailyOn = this.toggleGroup.getSelectedIndex() == 0;
            isAutoDHDOn = this.optionsGroup.isSelected(0);
            mResources.a("auto_daily_on", isAutoDailyOn ? 1 : -1);
            mResources.a("auto_dhd_on", isAutoDHDOn ? 1 : -1);
            mResources.a("auto_daily_time", String.valueOf(autoDailyHour));
            mResources.a("auto_daily_minute", String.valueOf(autoDailyMinute));
            GameCanvas.a("Lưu cài đặt thành công");
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }

   private static int getInt(String var0, int var1) {
      String var2 = mResources.c(var0);
      if (var2 == null) {
         return var1;
      }

      try {
         return Integer.parseInt(var2.trim());
      } catch (Exception var4) {
         return var1;
      }
   }
}

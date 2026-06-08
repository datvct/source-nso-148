import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;

public final class AutoTaThuPanel extends Form implements CommandListener {
   private ChoiceGroup toggleGroup;
   private Command saveCmd;
   public static boolean isPartyTaThuOn = mResources.d("auto_party_tathu_on") == 1;

   public AutoTaThuPanel() {
      super("Cài đặt tà thú nhóm");
      this.append(this.toggleGroup = new ChoiceGroup("Auto Tà thú nhóm", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.addCommand(this.saveCmd = new Command("Save", 4, 0));
      this.addCommand(new Command("Cancel", 7, 0));
      this.setCommandListener(this);
      this.toggleGroup.setSelectedIndex(isPartyTaThuOn ? 0 : 1, true);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.saveCmd) {
         try {
            isPartyTaThuOn = this.toggleGroup.getSelectedIndex() == 0;
            mResources.a("auto_party_tathu_on", isPartyTaThuOn ? 1 : -1);
            if (isPartyTaThuOn) {
               // Lưu map/zone tập hợp là map/zone hiện tại
               TaskTaThuAuto.partyGatherMapId = TileMap.mapID;
               TaskTaThuAuto.partyGatherZoneId = TileMap.zoneID;
               TaskTaThuAuto.partyQuestCount = 0; // Reset số lần nhận nhiệm vụ
            }
            GameCanvas.a("Lưu cài đặt thành công");
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }
}

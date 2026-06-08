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

public final class AutoPartyPanel extends Form implements CommandListener {
   private ChoiceGroup optionsGroup;
   private ChoiceGroup roleGroup;
   private TextField leaderField;
   private TextField member1Field;
   private TextField member2Field;
   private TextField member3Field;
   private TextField member4Field;
   private TextField member5Field;
   private Command saveCmd;
   private Command cancelCmd;

   public static boolean isAutoPartyOn = mResources.d("auto_party_on") == 1;
   public static boolean isAutoFriendOn = mResources.d("auto_friend_on") == 1;
   public static int partyRole = mResources.d("auto_party_role"); // 0 = leader, 1 = member
   public static String leaderName = mResources.c("auto_party_leader");
   public static String member1Name = mResources.c("auto_party_member1");
   public static String member2Name = mResources.c("auto_party_member2");
   public static String member3Name = mResources.c("auto_party_member3");
   public static String member4Name = mResources.c("auto_party_member4");
   public static String member5Name = mResources.c("auto_party_member5");

   public AutoPartyPanel() {
      super("Tự động vào nhóm");
      
      this.append(this.optionsGroup = new ChoiceGroup("Tùy chọn", ChoiceGroup.MULTIPLE, new String[]{"Bật Auto Nhóm", "Tự động kết bạn khi party"}, (Image[])null));
      this.optionsGroup.setSelectedIndex(0, isAutoPartyOn);
      this.optionsGroup.setSelectedIndex(1, isAutoFriendOn);

      this.append(this.roleGroup = new ChoiceGroup("Vai trò", ChoiceGroup.EXCLUSIVE, new String[]{"Làm trưởng nhóm", "Làm thành viên"}, (Image[])null));
      this.roleGroup.setSelectedIndex(partyRole, true);

      if (leaderName == null || leaderName.equals("null")) leaderName = "";
      this.append(this.leaderField = new TextField("Trưởng nhóm:", leaderName, 20, TextField.ANY));

      if (member1Name == null || member1Name.equals("null")) member1Name = "";
      this.append(this.member1Field = new TextField("Mời TV1:", member1Name, 20, TextField.ANY));

      if (member2Name == null || member2Name.equals("null")) member2Name = "";
      this.append(this.member2Field = new TextField("Mời TV2:", member2Name, 20, TextField.ANY));

      if (member3Name == null || member3Name.equals("null")) member3Name = "";
      this.append(this.member3Field = new TextField("Mời TV3:", member3Name, 20, TextField.ANY));

      if (member4Name == null || member4Name.equals("null")) member4Name = "";
      this.append(this.member4Field = new TextField("Mời TV4:", member4Name, 20, TextField.ANY));

      if (member5Name == null || member5Name.equals("null")) member5Name = "";
      this.append(this.member5Field = new TextField("Mời TV5:", member5Name, 20, TextField.ANY));

      this.addCommand(this.saveCmd = new Command("Lưu", Command.OK, 0));
      this.addCommand(this.cancelCmd = new Command("Hủy", Command.CANCEL, 0));
      this.setCommandListener(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.saveCmd) {
         try {
            isAutoPartyOn = this.optionsGroup.isSelected(0);
            isAutoFriendOn = this.optionsGroup.isSelected(1);
            partyRole = this.roleGroup.getSelectedIndex();
            leaderName = this.leaderField.getString().trim();
            member1Name = this.member1Field.getString().trim();
            member2Name = this.member2Field.getString().trim();
            member3Name = this.member3Field.getString().trim();
            member4Name = this.member4Field.getString().trim();
            member5Name = this.member5Field.getString().trim();

            mResources.a("auto_party_on", isAutoPartyOn ? 1 : -1);
            mResources.a("auto_friend_on", isAutoFriendOn ? 1 : -1);
            mResources.a("auto_party_role", partyRole);
            mResources.a("auto_party_leader", leaderName);
            mResources.a("auto_party_member1", member1Name);
            mResources.a("auto_party_member2", member2Name);
            mResources.a("auto_party_member3", member3Name);
            mResources.a("auto_party_member4", member4Name);
            mResources.a("auto_party_member5", member5Name);

            GameCanvas.a("Lưu cài đặt thành công");
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }
}

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public final class AutoLoginPanel extends Form implements CommandListener {
   private TextField a;
   private TextField b;
   private TextField c;
   private TextField d;
   private Command e;
   private static AutoLoginPanel f;
   private ChoiceGroup g;

   public AutoLoginPanel() {
      super("nsotiensv4.com");
      this.append(this.g = new ChoiceGroup("Bật ON/OFF ?", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.c = new TextField("Giờ Thoát Ra", "2", 3, 2));
      this.append(this.d = new TextField("Phút Thoát Ra", "55", 3, 2));
      this.append(this.a = new TextField("Giờ Đăng Nhập", "3", 3, 2));
      this.append(this.b = new TextField("Phút Đăng Nhập", "13", 3, 2));
      this.addCommand(this.e = new Command("Lưu", 4, 0));
      this.addCommand(new Command("Thoát", 7, 0));
      this.setCommandListener(this);
      this.g.setSelectedIndex(NSOT_MOB.as ? 0 : 1, true);
   }

   public static AutoLoginPanel a() {
      if (f == null) {
         f = new AutoLoginPanel();
      }

      return f;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.e) {
         try {
            if (Integer.parseInt(this.c.getString()) == 0 && Integer.parseInt(this.d.getString()) == 0 && Integer.parseInt(this.a.getString()) == 0 && Integer.parseInt(this.b.getString()) == 0) {
               NSOT_MOB.v = 3;
               NSOT_MOB.w = 0;
               NSOT_MOB.x = 3;
               NSOT_MOB.y = 45;
               GameScr.addChatPopup("Đã cài về giờ mặc định");
            } else {
               NSOT_MOB.v = Integer.parseInt(this.c.getString());
               NSOT_MOB.w = Integer.parseInt(this.d.getString());
               NSOT_MOB.x = Integer.parseInt(this.a.getString());
               NSOT_MOB.y = Integer.parseInt(this.b.getString());
               NSOT_MOB.as = this.g.getSelectedIndex() == 0;
            }
         } catch (NumberFormatException var4) {
         }

         Char.b();
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      MotherCanvas.instance.setFullScreenMode(true);
   }

   public static void b() {
      f = null;
   }
}

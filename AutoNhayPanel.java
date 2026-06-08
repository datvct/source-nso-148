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

public final class AutoNhayPanel extends Form implements CommandListener {
   private TextField b;
   private ChoiceGroup c;
   private Command d;
   public static boolean a = mResources.d("nhaynhay") == 1;

   public AutoNhayPanel() {
      super("C\u00e0i khu ch\u1edd pk v\u00e0 \u0111\u00e1nh pk");
      this.append(this.c = new ChoiceGroup("T\u1ef1 \u0111\u1ed9ng nh\u1ea3y", 1, new String[]{"B\u1eadt", "T\u1eaft"}, (Image[])null));
      this.append(this.b = new TextField("Th\u1eddi gian nh\u1ea3y(mili gi\u00e2y): ", String.valueOf(NSOT_MOB.at), 9, 2));
      this.addCommand(this.d = new Command("Save", 4, 0));
      this.addCommand(new Command("Cancel", 7, 0));
      this.setCommandListener(this);
      this.c.setSelectedIndex(a ? 0 : 1, true);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.d) {
         try {
            NSOT_MOB.at = Long.parseLong(this.b.getString());
            a = this.c.getSelectedIndex() == 0;
            mResources.a("nhaynhay", a ? 1 : -1);
            mResources.a("time_nhay", String.valueOf(NSOT_MOB.at));
            GameCanvas.a("L\u01b0u c\u00e0i \u0111\u1eb7t th\u00e0nh c\u00f4ng");
         } catch (Exception var4) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("L\u1ed7i", "C\u00f3 l\u1ed7i x\u1ea3y ra. H\u00e3y xem l\u1ea1i c\u00e0i \u0111\u1eb7t!", (Image)null, AlertType.ERROR));
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }
}

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class RemoteAccPanel extends Form implements CommandListener {
   private static TextField a;
   private static Command b;
   private static Command c;

   public RemoteAccPanel() {
      super("C\u00e0i \u0111\u1eb7t");
      a = new TextField("T\u00ean ig \u0111i\u1ec1u khi\u1ec3n off: L\u01b0u \u00fd c\u00f9ng 1 server ", NSOT_MOB.ae, 100, 0);
      b = new Command("\u0110\u1eb7t gi\u00e1 tr\u1ecb", 4, 1);
      c = new Command("Tho\u00e1t", 3, 1);
      super.append(a);
      super.addCommand(b);
      super.addCommand(c);
      super.setCommandListener(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == c) {
         Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      }

      if (var1 == b) {
         if (a == null) {
            GameScr.addChatPopup("B\u1ea1n ch\u01b0a \u0111\u1eb7t gi\u00e1 tr\u1ecb");
            return;
         }

         NSOT_MOB.ae = a.getString().trim();
         NSOT_MOB.h();
         Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      }

   }

   public static void a() {
   }

   public static void b() {
      a = null;
      b = null;
      c = null;
   }

   static {
      Main.main(20);
      a();
   }
}

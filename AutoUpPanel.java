import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class AutoUpPanel extends Form implements CommandListener {
   private TextField a;
   private TextField b;
   private TextField c;
   private Command d;
   private static AutoUpPanel e;

   public AutoUpPanel() {
      super("C\u00e0i up time - C\u00e0i all 0 \u0111\u1ec3 up full time");
      this.append(this.a = new TextField("Ng\u00e0y up", "", 3, 2));
      this.append(this.b = new TextField("Gi\u1edd up", "", 3, 2));
      this.append(this.c = new TextField("Ph\u00fat up", "", 3, 2));
      this.addCommand(this.d = new Command("L\u01b0u", 4, 0));
      this.addCommand(new Command("Tho\u00e1t", 7, 0));
      this.setCommandListener(this);
   }

   public static AutoUpPanel a() {
      if (e == null) {
         e = new AutoUpPanel();
      }

      return e;
   }

   public final void b() {
      long var1 = NSOT_MOB.ah / 60000L;
      this.c.setString(String.valueOf(var1 % 60L));
      var1 /= 60L;
      this.b.setString(String.valueOf(var1 % 60L));
      var1 /= 60L;
      this.a.setString(String.valueOf(var1));
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.d) {
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;

         try {
            var3 = Integer.parseInt(this.a.getString());
            var4 = Integer.parseInt(this.b.getString());
            var5 = Integer.parseInt(this.c.getString());
         } catch (Exception var7) {
         }

         NSOT_MOB.ah = ((long)(var3 * 24 + var4) * 60L + (long)var5) * 60L * 1000L;
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      MotherCanvas.instance.setFullScreenMode(true);
   }

   public static void c() {
   }

   public static void d() {
      e = null;
   }

   static {
      Main.main(41);
      c();
   }
}

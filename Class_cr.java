import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

public final class Class_cr implements CommandListener {
   private TField a;
   private final TextBox b;

   Class_cr(TField var1, TextBox var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getLabel().equals(mResources.ch)) {
         this.a.a(this.b.getString());
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      MotherCanvas.instance.setFullScreenMode(true);
      this.a.i = true;
   }
}

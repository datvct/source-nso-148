import javax.microedition.lcdui.Graphics;

public abstract class TCanvas {
   protected abstract void paint(Graphics var1);

   protected abstract void update();

   protected abstract void keyPressed(int var1);

   protected abstract void keyReleased(int var1);

   protected abstract void pointerDragged(int var1, int var2);

   protected abstract void pointerPressed(int var1, int var2);

   protected abstract void pointerReleased(int var1, int var2);
}

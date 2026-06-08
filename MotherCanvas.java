import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class MotherCanvas extends Canvas implements Runnable {
   public static MotherCanvas instance;
   public TCanvas tCanvas;
   private int zoomLevel = 1;
   public static boolean c;

   public MotherCanvas() {
      this.setFullScreenMode(true);
      mGraphics.b = this.zoomLevel = 1;
   }

   public static MotherCanvas gI() {
      if (instance == null) {
         instance = new MotherCanvas();
      }

      return instance;
   }

   protected final void paint(Graphics var1) {
      this.tCanvas.paint(var1);
   }

   protected final void keyPressed(int var1) {
      this.tCanvas.keyPressed(var1);
   }

   protected final void keyReleased(int var1) {
      this.tCanvas.keyReleased(var1);
   }

   protected final void pointerDragged(int var1, int var2) {
      var1 /= this.zoomLevel;
      var2 /= this.zoomLevel;
      this.tCanvas.pointerDragged(var1, var2);
   }

   protected final void pointerPressed(int var1, int var2) {
      var1 /= this.zoomLevel;
      var2 /= this.zoomLevel;
      this.tCanvas.pointerPressed(var1, var2);
   }

   protected final void pointerReleased(int var1, int var2) {
      var1 /= this.zoomLevel;
      var2 /= this.zoomLevel;
      this.tCanvas.pointerReleased(var1, var2);
   }

   public final int getWidths() {
      return this.zoomLevel == 1 ? this.getHeight() : 0;
   }

   public final int getHeights() {
      return this.zoomLevel == 1 ? this.getWidth() : 0;
   }

   public final void run() {
      try {
         Thread.sleep(10L);
      } catch (InterruptedException var9) {
      }

      c = true;

      while(c) {
         try {
            long var1 = System.currentTimeMillis();
            this.tCanvas.update();
            long var3 = System.currentTimeMillis() - var1;

            try {
               Thread.sleep(var3 < (long)NSOT_MOB.t ? (long)NSOT_MOB.t - var3 : 1L);
            } catch (InterruptedException var7) {
            }
         } catch (Exception var8) {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var6) {
               var6.printStackTrace();
            }

            var8.printStackTrace();
         }
      }

   }

   public static void d() {
   }

   public static void e() {
      instance = null;
      c = false;
   }

   static {
      Main.main(13);
      d();
   }
}

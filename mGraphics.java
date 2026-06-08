import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mGraphics {
   public Graphics a;
   public static int b;

   public static void a() {
      b = 1;
   }

   public mGraphics(Graphics var1) {
      this.a = var1;
   }

   public mGraphics() {
   }

   public final void a(Image var1, int var2, int var3, int var4) {
      var2 *= b;
      var3 *= b;
      this.a.drawImage(var1, var2, var3, var4);
   }

   public final void a(int var1, int var2, int var3, int var4) {
      var1 *= b;
      var2 *= b;
      var3 *= b;
      var4 *= b;
      this.a.drawLine(var1, var2, var3, var4);
   }

   public final void b(int var1, int var2, int var3, int var4) {
      var1 *= b;
      var2 *= b;
      var3 *= b;
      var4 *= b;
      this.a.drawRect(var1, var2, var3, var4);
   }

   public final void a(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var7 *= b;
      var8 *= b;
      var2 *= b;
      var3 *= b;
      var4 *= b;
      var5 *= b;
      this.a.drawRegion(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 *= b;
      var2 *= b;
      var3 *= b;
      var4 *= b;
      var5 *= b;
      var6 *= b;
      this.a.drawRoundRect(var1, var2, var3, var4, var5, var6);
   }

   public final void c(int var1, int var2, int var3, int var4) {
      var1 *= b;
      var2 *= b;
      var3 *= b;
      var4 *= b;
      this.a.fillRect(var1, var2, var3, var4);
   }

   public final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 *= b;
      var2 *= b;
      var3 *= b;
      var4 *= b;
      var5 *= b;
      var6 *= b;
      this.a.fillRoundRect(var1, var2, var3, var4, var5, var6);
   }

   public final int b() {
      return this.a.getTranslateX() / b;
   }

   public final int c() {
      return this.a.getTranslateY() / b;
   }

   public final void d(int var1, int var2, int var3, int var4) {
      var1 *= b;
      var2 *= b;
      var3 *= b;
      var4 *= b;
      this.a.setClip(var1, var2, var3, var4);
   }

   public final void a(int var1) {
      this.a.setColor(var1);
   }

   public final void translate(int var1, int var2) {
      var1 *= b;
      var2 *= b;
      this.a.translate(var1, var2);
   }

   public static int a(Image var0) {
      return var0.getWidth() / b;
   }

   public static int b(Image var0) {
      return var0.getHeight() / b;
   }

   public final void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 *= b;
      var2 *= b;
      var3 *= b;
      var4 *= b;
      this.a.drawArc(var1, var2, var3, var4, 0, 360);
   }

   public static void d() {
      b = 0;
   }

   static {
      Main.main(60);
      a();
   }
}

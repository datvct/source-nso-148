import javax.microedition.lcdui.Image;

public final class Command1 {
   public String caption;
   public String[] subCaption;
   public IActionListener c;
   public int idAction;
   public Image img;
   public int x = 0;
   public int y = 0;
   public int w;
   public int h;
   private boolean isFocus;
   public Object p;

   public Command1(String var1, IActionListener var2, int var3, Object var4, int var5, int var6) {
      this.w = mScreen.fo;
      this.h = mScreen.fp;
      this.isFocus = false;
      this.caption = var1;
      this.idAction = var3;
      this.c = var2;
      this.p = null;
      this.x = var5;
      this.y = var6;
      this.w = mScreen.fo;
      this.h = mScreen.fp;
   }

   public Command1(String var1, IActionListener var2, int var3, Object var4) {
      this.w = mScreen.fo;
      this.h = mScreen.fp;
      this.isFocus = false;
      this.caption = var1;
      this.idAction = var3;
      this.c = var2;
      this.p = var4;
   }

   public Command1(String var1, int var2, Object var3) {
      this.w = mScreen.fo;
      this.h = mScreen.fp;
      this.isFocus = false;
      this.caption = var1;
      this.idAction = var2;
      this.p = var3;
   }

   public Command1(String var1, int var2) {
      this.w = mScreen.fo;
      this.h = mScreen.fp;
      this.isFocus = false;
      this.caption = var1;
      this.idAction = var2;
   }

   public Command1(String var1, int var2, int var3) {
      this.w = mScreen.fo;
      this.h = mScreen.fp;
      this.isFocus = false;
      this.caption = var1;
      this.idAction = 0;
      this.x = var2;
      this.y = var3;
   }

   public final void a() {
      if (this.idAction > 0) {
         if (this.c != null) {
            this.c.perform(this.idAction, this.p);
            return;
         }

         GameScr.gI().b(this.idAction, this.p);
      }

   }

   public final void a(mGraphics var1) {
      if (this.img != null) {
         var1.a(this.img, this.x + mGraphics.a(this.img) / 2, this.y + mGraphics.b(this.img) / 2, 3);
      } else {
         if (this.caption != "") {
            if (!this.isFocus) {
               var1.a(GameScr.dr, this.x, this.y, 0);
            } else {
               var1.a(GameScr.ds, this.x, this.y, 0);
            }
         }

         mFont.tahoma_7b_yellow.a(var1, this.caption, this.x + 36, this.y + 6, 2);
      }

   }

   public final boolean b() {
      this.isFocus = false;
      if (GameCanvas.b(this.x - 3, this.y - 3, this.w + 6, this.h + 6)) {
         if (GameCanvas.m) {
            this.isFocus = true;
         }

         if (GameCanvas.o && GameCanvas.n) {
            return true;
         }
      }

      return false;
   }

   public final void c() {
      if (this.x > 0 && this.y > 0 && this.b()) {
         this.a();
         GameCanvas.m = false;
         this.isFocus = false;
      }

   }
}

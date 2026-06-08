import javax.microedition.lcdui.Image;

public final class Input2Dlg extends Dialog implements IActionListener {
   private String[] info;
   public TField tfInput;
   public TField tfInput2;
   private int padLeft;
   private int focus;
   private int line;
   private int titleLenght;

   public Input2Dlg() {
      new Command1("", 1000, (Object)null);
      this.tfInput = new TField();
      this.tfInput2 = new TField();
   }

   public final void a(String var1, String var2) {
      this.titleLenght = mFont.tahoma_8b.a(var1) > mFont.tahoma_8b.a(var2) ? mFont.tahoma_8b.a(var1) : mFont.tahoma_8b.a(var2);
      this.padLeft = 40;
      this.focus = 0;
      if (GameCanvas.z <= 176) {
         this.padLeft = 10;
      }

      this.tfInput.a = this.padLeft + this.titleLenght + 10;
      this.tfInput.b = GameCanvas.aa - 2 * mScreen.fn - 50;
      this.tfInput.c = GameCanvas.z - 2 * this.padLeft - this.titleLenght - 20;
      this.tfInput.d = mScreen.fn + 2;
      this.tfInput.e = true;
      this.tfInput.f = var1;
      this.tfInput2.a = this.padLeft + this.titleLenght + 10;
      this.tfInput2.b = GameCanvas.aa - mScreen.fn - 43;
      this.tfInput2.c = GameCanvas.z - 2 * this.padLeft - this.titleLenght - 20;
      this.tfInput2.d = mScreen.fn + 2;
      this.tfInput2.f = var2;
      super.right = this.tfInput.k;
   }

   public final void a(String var1, Command1 var2, Command1 var3, int var4, int var5) {
      this.tfInput.a("");
      this.tfInput.c(var4);
      this.tfInput2.a("");
      this.tfInput2.c(var5);
      this.info = mFont.tahoma_8b.splitFontArray(var1, GameCanvas.z - this.padLeft * 3);
      MyVector var6 = mFont.tahoma_8b.a(var1, GameCanvas.z - this.padLeft * 3);
      this.line = var6.size();
      super.left = var2;
      super.center = var3;
      GameCanvas.currentDialog = this;
   }

   public final void a(mGraphics var1) {
      Paint var2 = GameCanvas.paintz;
      Paint.a(var1, this.padLeft, GameCanvas.aa - 85 - mScreen.fp - this.line * 13, GameCanvas.z - (this.padLeft << 1), 80 + this.line * 13, this.info, (Image)null);
      mFont.tahoma_8b.a(var1, this.tfInput.f + ": ", this.tfInput.a - this.titleLenght - 5, this.tfInput.b + 5, 0);
      this.tfInput.a(var1);
      var1.d(0, 0, GameCanvas.z, GameCanvas.aa);
      mFont.tahoma_8b.a(var1, this.tfInput2.f + ": ", this.tfInput2.a - this.titleLenght - 5, this.tfInput2.b + 5, 0);
      this.tfInput2.a(var1);
      super.a(var1);
   }

   public final void a(int var1) {
      if (this.focus == 0) {
         this.tfInput.keyPress(var1);
      } else {
         this.tfInput2.keyPress(var1);
      }

      super.a(var1);
   }

   public final void a() {
      if (GameCanvas.k[2]) {
         this.focus = 0;
      }

      if (GameCanvas.k[8]) {
         this.focus = 1;
      }

      if (this.focus == 0) {
         this.tfInput.e = true;
         this.tfInput2.e = false;
         super.right = this.tfInput.k;
         this.tfInput.d();
      } else {
         this.tfInput.e = false;
         this.tfInput2.e = true;
         super.right = this.tfInput2.k;
         this.tfInput2.d();
      }

      if (GameCanvas.isTouch && GameCanvas.o && GameCanvas.n) {
         if (GameCanvas.b(this.tfInput.a, this.tfInput.b, this.tfInput.c, this.tfInput.d)) {
            this.focus = 0;
         }

         if (GameCanvas.b(this.tfInput2.a, this.tfInput2.b, this.tfInput2.c, this.tfInput2.d)) {
            this.focus = 1;
         }
      }

      if (super.left != null) {
         super.left.x = GameCanvas.z / 2 - 160;
         super.left.y = GameCanvas.aa - 26;
      }

      if (super.center != null) {
         super.center.x = GameCanvas.z / 2 - 35;
         super.center.y = GameCanvas.aa - 26;
      }

      if (super.right != null) {
         super.right.x = GameCanvas.z / 2 + 88;
         super.right.y = GameCanvas.aa - 26;
      }

      super.a();
   }

   public final void perform(int var1, Object var2) {
   }
}

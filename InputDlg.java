import javax.microedition.lcdui.Image;

public final class InputDlg extends Dialog {
   private String[] info;
   public TField tfInput;
   private int padLeft = 40;

   public InputDlg() {
      if (GameCanvas.z <= 176) {
         this.padLeft = 10;
      }

      this.tfInput = new TField();
      this.tfInput.a = this.padLeft + 10;
      this.tfInput.b = GameCanvas.aa - mScreen.fn - 43;
      this.tfInput.c = GameCanvas.z - 2 * (this.padLeft + 10);
      this.tfInput.d = mScreen.fn + 2;
      this.tfInput.e = true;
      super.right = this.tfInput.k;
   }

   public final void a(String var1, Command1 var2, int var3) {
      try {
         this.tfInput.a("");
         this.tfInput.c(var3);
         this.info = mFont.tahoma_8b.splitFontArray(var1, GameCanvas.z - (this.padLeft << 1));
         super.left = new Command1(mResources.aq, GameCanvas.c(), 8882, (Object)null);
         super.center = var2;
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

         GameCanvas.currentDialog = this;
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public final void a(mGraphics var1) {
      Paint var2 = GameCanvas.paintz;
      Paint.a(var1, this.padLeft, GameCanvas.aa - 77 - mScreen.fp, GameCanvas.z - (this.padLeft << 1), 69, this.info, (Image)null);
      this.tfInput.a(var1);
      super.a(var1);
   }

   public final void a(int var1) {
      this.tfInput.keyPress(var1);
      super.a(var1);
   }

   public final void a() {
      this.tfInput.d();
      super.a();
   }
}

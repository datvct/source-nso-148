public abstract class Dialog {
   public Command1 left;
   public Command1 center;
   public Command1 right;

   public void a(mGraphics var1) {
      var1.translate(-var1.b(), -var1.c());
      var1.d(0, 0, GameCanvas.z, GameCanvas.aa);
      Paint.a(var1);
      Paint.a(var1, this.left, this.center, this.right);
   }

   public void a(int var1) {
      switch (var1) {
         case -39:
         case -2:
            GameCanvas.l[8] = true;
            GameCanvas.k[8] = true;
            return;
         case -38:
         case -1:
            GameCanvas.l[2] = true;
            GameCanvas.k[2] = true;
            return;
         case -22:
         case -7:
            GameCanvas.l[13] = true;
            GameCanvas.k[13] = true;
            return;
         case -21:
         case -6:
            GameCanvas.l[12] = true;
            GameCanvas.k[12] = true;
            return;
         case -5:
         case 10:
            GameCanvas.l[5] = true;
            GameCanvas.k[5] = true;
            return;
         default:
      }
   }

   public void a() {
      if (this.center != null && (GameCanvas.k[5] || mScreen.a(this.center))) {
         GameCanvas.k[5] = false;
         GameCanvas.n = false;
         mScreen.fq = -1;
         GameCanvas.o = false;
         if (this.center != null) {
            this.center.a();
         }

         mScreen.fq = -1;
      }

      if (this.left != null && (GameCanvas.k[12] || mScreen.a(this.left))) {
         GameCanvas.k[12] = false;
         GameCanvas.n = false;
         mScreen.fq = -1;
         GameCanvas.o = false;
         if (this.left != null) {
            this.left.a();
         }

         mScreen.fq = -1;
      }

      if (this.right != null && (GameCanvas.k[13] || mScreen.a(this.right))) {
         GameCanvas.k[13] = false;
         GameCanvas.n = false;
         GameCanvas.o = false;
         mScreen.fq = -1;
         if (this.right != null) {
            this.right.a();
         }

         mScreen.fq = -1;
      }

      GameCanvas.l();
      GameCanvas.m();
   }
}

public final class Domsang {
   private int xS;
   private int yS;
   public int frame = 0;
   private int typeEff;
   private int dem = 0;

   public Domsang(int var1, int var2, int var3) {
      this.xS = var1;
      this.yS = var2;
      this.typeEff = var3;
   }

   public final void a() {
      if (this.typeEff == 1) {
         ++this.dem;
         if (this.dem % 2 == 0) {
            ++this.frame;
            return;
         }
      } else {
         if (this.typeEff == 0) {
            ++this.frame;
            return;
         }

         if (this.typeEff == 2 || this.typeEff == 3 || this.typeEff == 4 || this.typeEff == 5) {
            ++this.dem;
            if (this.dem % 2 == 0) {
               ++this.frame;
            }
         }
      }

   }

   public final void a(mGraphics var1) {
      if (this.typeEff == 0) {
         var1.a(GameScr.dt, 0, this.frame * 3, 3, 3, 0, this.xS, this.yS, 0);
      } else if (this.typeEff == 1) {
         var1.a(GameScr.du, 0, this.frame * 20, 20, 20, 0, this.xS, this.yS, 33);
      } else if (this.typeEff == 2) {
         var1.a(GameScr.em, 0, this.frame * 15, 14, 15, 0, this.xS + 20, this.yS + 4, 20);
      } else if (this.typeEff == 3) {
         var1.a(GameScr.ej, 0, this.frame << 3, 8, 8, 0, this.xS + 20, this.yS + 4, 20);
      } else if (this.typeEff == 4) {
         var1.a(GameScr.ek, 0, this.frame << 3, 8, 8, 0, this.xS + 20, this.yS + 4, 20);
      } else if (this.typeEff == 5) {
         var1.a(GameScr.el, 0, this.frame * 14, 14, 14, 0, this.xS + 20, this.yS + 4, 20);
      }

   }
}

public final class EggMonters {
   public int x;
   public int y;
   public int frame = 0;
   public byte status = 0;
   public int vy;
   public static Mob ownerEgg;

   public final boolean isPaint() {
      if (this.x < GameScr.gW23) {
         return false;
      } else if (this.x > GameScr.gW23 + GameScr.gW) {
         return false;
      } else if (this.y < GameScr.gH2) {
         return false;
      } else if (this.y > GameScr.gH2 + GameScr.gH + 30) {
         return false;
      } else {
         return ownerEgg == null || ownerEgg.status != 8;
      }
   }

   public EggMonters(int var1, int var2) {
      this.x = var1;
      this.y = var2;
   }

   public static void b() {
   }

   public static void c() {
      ownerEgg = null;
   }

   static {
      Main.main(33);
      b();
   }
}

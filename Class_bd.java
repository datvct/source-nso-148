public final class Class_bd implements Runnable {
   private final int a;

   Class_bd(GameScr class_az, int var2) {
      this.a = var2;
   }

   public final void run() {
      Npc var1;
      if ((var1 = GameScr.i(13)) != null) {
         if (Math.abs(var1.cx - Char.getMyChar().cx) > 22 || Math.abs(var1.cy - Char.getMyChar().cy) > 22) {
            Char.b(var1.cx, var1.cy);
         }

         Service.gI().openUIZone();
         Class_cl.f();
         if (TileMap.zoneID == this.a || this.a < 0 || this.a >= GameScr.gI().cx.length) {
            return;
         }

         Service.gI().requestChangeZone((int)this.a, (int)-1);
         TileMap.h();

         try {
            Thread.sleep(100L);
            return;
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

   }
}

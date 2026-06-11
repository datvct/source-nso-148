public final class Class_af extends Auto {
   private long o;
   private static String p;

   public static void a() {
      p = "datvct";
   }

   public final void a(int var1, int var2) {
      super.g();
      super.b = NSOT_MOB.nst_idMap;
      super.c = NSOT_MOB.nst_khuCho;
      super.d = TileMap.g(NSOT_MOB.nst_idMap);
   }

   public final void update() {
      if (Auto.i()) {
         Auto.a(true);
      } else if (super.b == TileMap.mapID && super.c == TileMap.zoneID) {
         if (Char.getMyChar().cx != NSOT_MOB.nst_x || Char.getMyChar().cy != NSOT_MOB.nst_y) {
            Char.b(NSOT_MOB.nst_x, NSOT_MOB.nst_y);
            NSOT_MOB.a(500L);
            return;
         }

         if (System.currentTimeMillis() - this.o >= 60000L) {
            Service.gI().chat("Tools code by datvct");
            this.o = System.currentTimeMillis();
            return;
         }
      } else {
         this.a(super.b, super.c, super.e, super.f);
      }

   }

   public final String toString() {
      return p + " Auto \u0111\u1ee9ng ch\u1edd pk";
   }

   public static void c() {
      p = null;
   }

   static {
      Main.main(25);
      a();
   }
}

public final class AutoAttack extends Auto {
   private static String o;

   public static void a() {
      o = "nsotiensv4.com";
   }

   public final void g() {
      super.g();
      super.b = TileMap.mapID;
      super.c = TileMap.zoneID;
      super.e = Char.getMyChar().cx;
      super.f = Char.getMyChar().cy;
   }

   public final void update() {
      long var1 = Char.getMyChar().ae * 100L / GameScr.exps[Char.getMyChar().clevel];
      if (Auto.i()) {
         if (Char.du) {
            long var3;
            NSOT_MOB.a(var3 = 100L * (long)NSOT_MOB.u / 10L);
            Auto.a(true);
            NSOT_MOB.a(var3);
            return;
         }
      } else {
         if (var1 >= PK_AM_PANEL.c && NSOT_MOB.ad) {
            NSOT_MOB.mod_nst.i();
            NSOT_MOB.a(500L);
            return;
         }

         if (super.b == TileMap.mapID && (super.d || super.c == TileMap.zoneID)) {
            this.c(-1);
            this.c(-1, this.a(Char.eb, Char.ec, Char.ed, false));
            return;
         }

         if (Char.du) {
            this.a(super.b, super.c, super.e, super.f);
         }
      }

   }

   protected final Mob a(Char var1, int var2, int var3, Char var4, boolean var5) {
      if (NSOT_MOB.l && NSOT_MOB.n.size() > 0) {
         this.a(var3, var5);
      }

      return Auto.b(var1.cx, var1.cy);
   }

   public final String toString() {
      return o + " T\u1ef1 \u0111\u00e1nh";
   }

   public static void c() {
      o = null;
   }

   static {
      Main.main(7);
      a();
   }
}

public final class AutoAttackPk extends Auto {
   private long o;
   private static long p;
   private static String q;

   public static void a() {
      q = "datvct";
   }

   public final void a(int var1) {
      super.g();
      super.b = NSOT_MOB.nst_idMap;
      super.c = NSOT_MOB.nst_khuDanh;
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

         if (System.currentTimeMillis() - p >= 300L) {
            MyVector var1 = new MyVector();

            for(int var2 = 0; var2 < GameScr.vCharInMap.size(); ++var2) {
               Char var3;
               if ((var3 = (Char)GameScr.vCharInMap.elementAt(var2)).cHp > 0 && var3.cTypePk == 3 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50 && Math.abs(Char.getMyChar().cy - var3.cy) <= 50 && var1.size() <= Auto.g.maxFight) {
                  var1.addElement(var3);
                  if (var3.cHp > 0 && var3.cTypePk == 3 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50) {
                     Service.gI().sendPlayerAttack((MyVector)(new MyVector()), (MyVector)var1, (int)2);
                     p = System.currentTimeMillis();
                  }
               }
            }
         }

         NSOT_MOB.a(100L);
         if (System.currentTimeMillis() - this.o >= 30000L) {
            Service.gI().chat("Tool code by datvct");
            this.o = System.currentTimeMillis();
            return;
         }
      } else {
         this.a(super.b, super.c, super.e, super.f);
      }

   }

   public final String toString() {
      return q + " Auto \u0111\u00e1nh pk";
   }

   public static void c() {
      p = 0L;
      q = null;
   }

   static {
      Main.main(32);
      a();
   }
}

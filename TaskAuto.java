public final class TaskAuto extends Auto {
   public static boolean o;
   private static String[] p;
   private static int q;
   private TaskOrder r;

   public static void a() {
      o = false;
      p = new String[]{"H\u00f4m nay con \u0111\u00e3 l\u00e0m h\u1ebft nhi\u1ec7m v\u1ee5 ta giao. H\u00e3y quay l\u1ea1i v\u00e0o ng\u00e0y h\u00f4m sau.", "\u0110\u00e2y l\u00e0 l\u1ea7n nh\u1eadn nhi\u1ec7m v\u1ee5 th\u1ee9 ", " trong ng\u00e0y h\u00f4m nay. M\u1ed7i ng\u00e0y \u0111\u01b0\u1ee3c nh\u1eadn t\u1ed1i \u0111a 20 l\u1ea7n con nh\u00e9."};
   }

   public static void a(String var0) {
      if (var0.equals(p[0])) {
         q = 21;
         Class_cl.m();
      } else {
         int var1;
         if ((var1 = var0.indexOf(p[1])) >= 0) {
            var0 = var0.substring(var1 + p[1].length(), var0.indexOf(p[2])).trim();

            try {
               q = Integer.parseInt(var0);
               return;
            } catch (NumberFormatException var3) {
            }
         }
      }

   }

   public final void g() {
      q = 0;
      this.r = Char.j(0);
      super.g();
   }

   public final void h() {
      this.r = Char.j(0);
      super.h();
   }

   public final void update() {
      if (q <= 20) {
         if (Char.getMyChar().cHp <= 0) {
            long var1;
            NSOT_MOB.a(var1 = 100L * (long)NSOT_MOB.u / 10L);
            Auto.a(true);
            NSOT_MOB.a(var1);
            return;
         }

         if (TileMap.f(TileMap.mapID)) {
            if (this.r == null) {
               GameScr.addChatPopup("Nh\u1eadn NV " + (q + 1) + "/20");
               GameScr.b(25, GameScr.fi, 0);
               Class_cl.l();
               this.r = Char.j(0);
               return;
            }

            if (this.r.count >= this.r.maxCount) {
               if (Char.af() <= 0) {
                  GameScr.addChatPopup("H\u00e0nh trang \u0111\u1ea7y");
                  return;
               }

               GameScr.addChatPopup("Ho\u00e0n th\u00e0nh NV " + q + "/20");
               GameScr.b(25, GameScr.fi, 2);
               this.r = null;
               return;
            }

            GameScr.addChatPopup("\u0110i l\u00e0m NV " + q + "/20");
            GameScr.b(25, GameScr.fi, 3);
            TileMap.h();
            this.b(super.c);
            return;
         }

         if (this.r != null && TileMap.mapID == this.r.mapId) {
            if (this.r.count >= this.r.maxCount) {
               Auto.j();
               return;
            }

            this.c(this.r.killId, 1);
            this.c(-1);
            if (o) {
               GameScr.addChatPopup("Nhi\u1ec7m v\u1ee5 " + q + "/20: " + this.r.count + "/" + this.r.maxCount + " " + Mob.arrMobTemplate[this.r.killId].name);
               o = false;
               return;
            }
         }
      } else {
         GameScr.addChatPopup("Ho\u00e0n th\u00e0nh!");
         NSOT_MOB var3 = NSOT_MOB.mod_nst;
         NSOT_MOB.d();
      }

   }

   public final String toString() {
      return "Auto Nhi\u1ec7m v\u1ee5 h\u1eb1ng ng\u00e0y: " + q + "/20";
   }

   public static void c() {
      o = false;
      p = null;
      q = 0;
   }

   static {
      Main.main(10);
      a();
   }
}

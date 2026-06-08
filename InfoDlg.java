public class InfoDlg {
   int a;
   int b;
   int c;
   int d;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k = 28;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private boolean q = false;
   static boolean isShow;
   private static String title;
   private static String subtitke;
   private static int delay;
   public static boolean isLock;

   private static boolean g() {
      if (Char.getMyChar().statusMe != 3) {
         for(int var0 = 2; var0 > 0; --var0) {
            int var1;
            try {
               if (Res.abs(GameCanvas.t[var0].x - GameCanvas.t[var0 - 1].x) <= 2) {
                  continue;
               }

               var1 = Res.abs(GameCanvas.t[var0].y - GameCanvas.t[var0 - 1].y);
            } catch (Exception var3) {
               var3.printStackTrace();
               return true;
            }

            if (var1 > 2) {
               return false;
            }
         }
      }

      return true;
   }

   private static void h() {
      GameCanvas.l[1] = false;
      GameCanvas.l[2] = false;
      GameCanvas.l[3] = false;
      GameCanvas.l[4] = false;
      GameCanvas.l[6] = false;
   }

   public final void a() {
      if (GameCanvas.m && !GameCanvas.o) {
         this.g = GameCanvas.r;
         this.h = GameCanvas.s;
         if (this.g <= (GameCanvas.z >> 1) - 100 && this.h >= GameCanvas.aa >> 1) {
            if (!this.q) {
               this.a = this.c = this.g;
               this.b = this.d = this.h;
            }

            this.q = true;
            this.m = GameCanvas.p - this.a;
            this.n = GameCanvas.q - this.b;
            this.o = this.m * this.m + this.n * this.n;
            this.l = Res.sqrt(this.o);
            if (Math.abs(this.m) > 4 || Math.abs(this.n) > 4) {
               this.p = Res.tan(this.m, this.n);
               if (!GameCanvas.b(this.a - this.k, this.b - this.k, this.k << 1, this.k << 1)) {
                  if (this.l != 0) {
                     this.d = this.n * this.k / this.l;
                     this.c = this.m * this.k / this.l;
                     this.c += this.a;
                     this.d += this.b;
                     if (!Res.inRect(this.a - this.k, this.b - this.k, this.k << 1, this.k << 1, this.c, this.d)) {
                        this.c = this.i;
                        this.d = this.j;
                     } else {
                        this.i = this.c;
                        this.j = this.d;
                     }
                  } else {
                     this.c = this.i;
                     this.d = this.j;
                  }
               } else {
                  this.c = GameCanvas.p;
                  this.d = GameCanvas.q;
               }

               h();
               if (!g()) {
                  h();
                  return;
               }

               if (this.p <= 360 && this.p > 340 || this.p > 0 && this.p <= 90) {
                  GameScr.er = 0;
                  GameCanvas.l[6] = true;
                  GameCanvas.k[6] = true;
                  return;
               }

               if (this.p > 290 && this.p <= 340) {
                  GameScr.er = 0;
                  GameCanvas.l[3] = true;
                  GameCanvas.k[3] = true;
                  return;
               }

               if (this.p > 250 && this.p <= 290) {
                  GameScr.er = 0;
                  GameCanvas.l[2] = true;
                  GameCanvas.k[2] = true;
                  return;
               }

               if (this.p > 200 && this.p <= 250) {
                  GameScr.er = 0;
                  GameCanvas.l[1] = true;
                  GameCanvas.k[1] = true;
                  return;
               }

               if (this.p > 90 && this.p <= 200) {
                  GameScr.er = 0;
                  GameCanvas.l[4] = true;
                  GameCanvas.k[4] = true;
                  return;
               }
            }
         }
      } else {
         this.a = this.c = 50;
         this.b = this.d = GameCanvas.aa - 50;
         this.q = false;
         h();
      }

   }

   public static void show(String var0, String var1, int var2) {
      if (var0 != null) {
         isShow = true;
         title = var0;
         subtitke = var1;
         delay = var2;
      }

   }

   public static void showWait() {
      show(mResources.ag, (String)null, 5000);
      isLock = true;
   }

   public static void showWait(String var0) {
      show(var0, (String)null, 5000);
      isLock = true;
   }

   public static void paint(mGraphics var0) {
      String var1 = title;
      if (TileMap.j != null) {
         var1 = TileMap.j;
      }

      if (isShow && (!isLock || delay <= 4990) && !GameScr.isPaintAlert) {
         Paint.a(GameCanvas.ab - 64, 10, 128, 40, var0);
         if (isLock) {
            GameCanvas.a(GameCanvas.ab - mFont.tahoma_8b.a(var1) / 2 - 10, 30, var0);
            mFont.tahoma_8b.a(var0, var1, GameCanvas.ab + 5, 23, 2);
            return;
         }

         if (subtitke != null) {
            mFont.tahoma_8b.a(var0, var1, GameCanvas.ab, 18, 2);
            mFont.tahoma_7_white.a(var0, subtitke, GameCanvas.ab, 32, 2);
            return;
         }

         mFont.tahoma_8b.a(var0, var1, GameCanvas.ab, 23, 2);
      }

   }

   public static void update() {
      if (delay > 0 && --delay == 0) {
         hide();
      }

   }

   public static void hide() {
      title = "";
      subtitke = null;
      isLock = false;
      delay = 0;
      isShow = false;
   }

   public static void e() {
   }

   public static void f() {
      isShow = false;
      title = null;
      subtitke = null;
      delay = 0;
      isLock = false;
   }

   static {
      Main.main(16);
      e();
   }
}

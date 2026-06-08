public final class Scroll {
   private int i;
   private int j;
   public int a;
   public int b;
   private int k;
   private int l;
   private int m;
   private int n;
   public int c;
   public int d;
   public int e;
   public int f;
   private int o;
   private int p;
   public static Scroll me;
   private int q;
   private int r;
   private int[] s = new int[3];
   private boolean t;
   private boolean u;
   private int v;
   private int w;
   public int h;
   private int x;
   private boolean y = true;

   public final void clear() {
      this.i = 0;
      this.j = 0;
      this.a = 0;
      this.b = 0;
      this.k = 0;
      this.l = 0;
      this.m = 0;
      this.n = 0;
      this.o = 0;
      this.p = 0;
      this.e = 0;
      this.f = 0;
   }

   public final void a(mGraphics var1, int var2, int var3, int var4, int var5) {
      var1.d(var2, var3, var4, var5 - 1);
      var1.translate(-var1.b(), -var1.c());
      var1.translate(-this.a, -this.b);
   }

   public final void a(mGraphics var1) {
      var1.d(this.c, this.d, this.e, this.f - 1);
      var1.translate(-var1.b(), -var1.c());
      var1.translate(-this.a, -this.b);
   }

   public final ScrollResult b() {
      Scroll var1;
      int var2;
      int var3;
      int var4;
      int var5;
      byte var6;
      ScrollResult var7;
      boolean var8;
      if (this.y) {
         var1 = this;
         var2 = this.c;
         var3 = this.d;
         var4 = this.e;
         var5 = this.f;
         if (GameCanvas.m) {
            if (!this.t && GameCanvas.c(var2, var3, var4, var5)) {
               for(var4 = 0; var4 < var1.s.length; ++var4) {
                  var1.s[0] = GameCanvas.q;
               }

               var1.r = GameCanvas.q;
               var1.t = true;
               var1.w = -1;
               var1.u = var1.v != 0;
               var1.v = 0;
            } else if (this.t) {
               ++this.q;
               if (this.q > 5 && this.r == GameCanvas.q && !this.u) {
                  this.r = -1000;
                  if (this.x > 1) {
                     var4 = (this.j + GameCanvas.q - var3) / this.h;
                     var5 = (this.i + GameCanvas.p - var2) / this.h;
                     this.w = var4 * this.x + var5;
                  } else {
                     this.w = (this.j + GameCanvas.q - var3) / this.h;
                  }
               }

               if ((var4 = GameCanvas.q - this.s[0]) != 0 && this.w != -1) {
                  this.w = -1;
               }

               for(var5 = this.s.length - 1; var5 > 0; --var5) {
                  var1.s[var5] = var1.s[var5 - 1];
               }

               var1.s[0] = GameCanvas.q;
               var1.j -= var4;
               if (var1.j < 0) {
                  var1.j = 0;
               }

               if (var1.j > var1.p) {
                  var1.j = var1.p;
               }

               if (var1.b < 0 || var1.b > var1.p) {
                  var4 /= 2;
               }

               var1.b -= var4;
            }
         }

         var8 = false;
         if (GameCanvas.o && var1.t) {
            var5 = GameCanvas.q - var1.s[0];
            GameCanvas.o = false;
            if (Res.abs(var5) < 20 && Res.abs(GameCanvas.q - var1.r) < 20 && !var1.u) {
               var1.v = 0;
               var1.j = var1.b;
               var1.r = -1000;
               if (var1.x > 1) {
                  var3 = (var1.j + GameCanvas.q - var3) / var1.h;
                  var2 = (var1.i + GameCanvas.p - var2) / var1.h;
                  var1.w = var3 * var1.x + var2;
               } else {
                  var1.w = (var1.j + GameCanvas.q - var3) / var1.h;
               }

               var1.q = 0;
               var8 = true;
            } else if (var1.w != -1 && var1.q > 5) {
               var1.q = 0;
               var8 = true;
            } else if (var1.w == -1 && !var1.u) {
               if (var1.b < 0) {
                  var1.j = 0;
               } else if (var1.b > var1.p) {
                  var1.j = var1.p;
               } else {
                  if ((var3 = GameCanvas.q - var1.s[0] + (var1.s[0] - var1.s[1]) + (var1.s[1] - var1.s[2])) > 10) {
                     var6 = 10;
                  } else if (var3 < -10) {
                     var6 = -10;
                  } else {
                     var6 = 0;
                  }

                  var1.v = -var6 * 100;
               }
            }

            var1.t = false;
            var1.q = 0;
            GameCanvas.o = false;
         }

         (var7 = new ScrollResult()).selected = var1.w;
         var7.isFinish = var8;
         var7.isDowning = var1.t;
         return var7;
      } else {
         var1 = this;
         var2 = this.c;
         var3 = this.d;
         var4 = this.e;
         var5 = this.f;
         if (GameCanvas.m) {
            if (!this.t && GameCanvas.c(var2, var3, var4, var5)) {
               for(var4 = 0; var4 < var1.s.length; ++var4) {
                  var1.s[0] = GameCanvas.p;
               }

               var1.r = GameCanvas.p;
               var1.t = true;
               var1.w = -1;
               var1.u = var1.v != 0;
               var1.v = 0;
            } else if (this.t) {
               ++this.q;
               if (this.q > 5 && this.r == GameCanvas.p && !this.u) {
                  this.r = -1000;
                  this.w = (this.i + GameCanvas.p - var2) / this.h;
               }

               if ((var4 = GameCanvas.p - this.s[0]) != 0 && this.w != -1) {
                  this.w = -1;
               }

               for(var5 = this.s.length - 1; var5 > 0; --var5) {
                  var1.s[var5] = var1.s[var5 - 1];
               }

               var1.s[0] = GameCanvas.p;
               var1.i -= var4;
               if (var1.i < 0) {
                  var1.i = 0;
               }

               if (var1.i > var1.o) {
                  var1.i = var1.o;
               }

               if (var1.a < 0 || var1.a > var1.o) {
                  var4 /= 2;
               }

               var1.a -= var4;
            }
         }

         var8 = false;
         if (GameCanvas.o && var1.t) {
            var5 = GameCanvas.p - var1.s[0];
            GameCanvas.o = false;
            if (Res.abs(var5) < 20 && Res.abs(GameCanvas.p - var1.r) < 20 && !var1.u) {
               var1.v = 0;
               var1.i = var1.a;
               var1.r = -1000;
               var1.w = (var1.i + GameCanvas.p - var2) / var1.h;
               var1.q = 0;
               var8 = true;
            } else if (var1.w != -1 && var1.q > 5) {
               var1.q = 0;
               var8 = true;
            } else if (var1.w == -1 && !var1.u) {
               if (var1.a < 0) {
                  var1.i = 0;
               } else if (var1.a > var1.o) {
                  var1.i = var1.o;
               } else {
                  if ((var3 = GameCanvas.p - var1.s[0] + (var1.s[0] - var1.s[1]) + (var1.s[1] - var1.s[2])) > 10) {
                     var6 = 10;
                  } else if (var3 < -10) {
                     var6 = -10;
                  } else {
                     var6 = 0;
                  }

                  var1.v = -var6 * 100;
               }
            }

            var1.t = false;
            var1.q = 0;
            GameCanvas.o = false;
         }

         (var7 = new ScrollResult()).selected = var1.w;
         var7.isFinish = var8;
         var7.isDowning = var1.t;
         return var7;
      }
   }

   public final void c() {
      if (this.v != 0 && !this.t) {
         if (this.y) {
            this.j += this.v / 100;
            if (this.j < 0) {
               this.j = 0;
            } else if (this.j > this.p) {
               this.j = this.p;
            } else {
               this.b = this.j;
            }
         } else {
            this.i += this.v / 100;
            if (this.i < 0) {
               this.i = 0;
            } else if (this.i > this.o) {
               this.i = this.o;
            } else {
               this.a = this.i;
            }
         }

         this.v = this.v * 9 / 10;
         if (this.v < 100 && this.v > -100) {
            this.v = 0;
         }
      }

      if (this.a != this.i && !this.t) {
         this.k = this.i - this.a << 2;
         this.m += this.k;
         this.a += this.m >> 4;
         this.m &= 15;
      }

      if (this.b != this.j && !this.t) {
         this.l = this.j - this.b << 2;
         this.n += this.l;
         this.b += this.n >> 4;
         this.n &= 15;
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
      this.c = var3;
      this.d = var4;
      this.h = var2;
      this.e = var5;
      this.f = var6;
      this.y = var7;
      this.x = var8;
      if (var7) {
         this.p = var1 * var2 - var6;
      } else {
         this.o = var1 * var2 - var5;
      }

      if (this.p < 0) {
         this.p = 0;
      }

      if (this.o < 0) {
         this.o = 0;
      }

   }

   public final void a(int var1) {
      if (this.y) {
         var1 -= (this.f - this.h) / 2;
         this.j = var1;
         if (this.j < 0) {
            this.j = 0;
         }

         if (this.j > this.p) {
            this.j = this.p;
            return;
         }
      } else {
         var1 -= (this.e - this.h) / 2;
         this.i = var1;
         if (this.i < 0) {
            this.i = 0;
         }

         if (this.i > this.o) {
            this.i = this.o;
         }
      }

   }

   public static void d() {
   }

   public static void e() {
      me = null;
   }

   static {
      Main.main(59);
      d();
   }
}

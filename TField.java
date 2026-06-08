import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;

public final class TField implements IActionListener {
   public int a;
   public int b;
   public int c;
   public int d;
   public boolean e;
   private static int l;
   private static int[] m;
   private static int n;
   private static String[] o;
   private static String[] p;
   public String f = "";
   public String g = "";
   private String q = "";
   private String r = "";
   private String s = "";
   private int t = 0;
   private int u = 0;
   private int v = 500;
   private int w = 0;
   private int x = -1984;
   private int y = 0;
   private int z = 0;
   private int aa = 10;
   private int ab = 0;
   public static boolean h;
   private int ac = 0;
   private static int ad;
   public boolean i;
   public String j = "";
   public Command1 k;

   public static void a() {
      l = 2;
      m = new int[]{18, 14, 11, 9, 6, 4, 2};
      n = 0;
      o = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb72", "def3\u0111\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec73", "ghi4\u00ed\u00ec\u1ec9\u0129\u1ecb4", "jkl5", "mno6\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee36", "pqrs7", "tuv8\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef18", "wxyz9\u00fd\u1ef3\u1ef7\u1ef9\u1ef59", "*", "#"};
      p = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
      ad = 11;
   }

   public final void b() {
      TextBox var1;
      (var1 = new TextBox(this.j, "", this.v, 0)).addCommand(new Command(mResources.ch, 4, 0));
      var1.addCommand(new Command("Cancel", 3, 0));
      var1.setCommandListener(new Class_cr(this, var1));

      try {
         if (this.ab == 2) {
            var1.setConstraints(65536);
         } else if (this.ab == 1) {
            var1.setConstraints(2);
         } else {
            var1.setConstraints(0);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      var1.setString(this.q);
      var1.setMaxSize(this.v);
      Display.getDisplay(GameMidlet.instance).setCurrent(var1);
   }

   public static boolean a(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public TField() {
      this.q = "";
      n = mFont.tahoma_8b.d() + 1;
      this.k = new Command1(mResources.bf, this, 1000, (Object)null);
      if (mResources.d("qwerty") == 1) {
         h = true;
      }

   }

   public final void c() {
      if (this.t > 0 && this.q.length() > 0) {
         this.q = this.q.substring(0, this.t - 1) + this.q.substring(this.t, this.q.length());
         --this.t;
         this.g();
         this.h();
      }

   }

   private void g() {
      if (this.ab == 2) {
         this.s = this.r;
      } else {
         this.s = this.q;
      }

      if (this.w < 0 && mFont.tahoma_8b.a(this.s) + this.w < this.c - 4 - 13) {
         this.w = this.c - 10 - mFont.tahoma_8b.a(this.s);
      }

      if (this.w + mFont.tahoma_8b.a(this.s.substring(0, this.t)) <= 0) {
         this.w = -mFont.tahoma_8b.a(this.s.substring(0, this.t));
         this.w += 40;
      } else if (this.w + mFont.tahoma_8b.a(this.s.substring(0, this.t)) >= this.c - 12) {
         this.w = this.c - 10 - mFont.tahoma_8b.a(this.s.substring(0, this.t)) - 8;
      }

      if (this.w > 0) {
         this.w = 0;
      }

   }

   private void d(int var1) {
      if ((this.ab != 2 && this.ab != 3 || var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 90 || var1 >= 97 && var1 <= 122) && this.q.length() < this.v) {
         String var2 = this.q.substring(0, this.t) + (char)var1;
         if (this.t < this.q.length()) {
            var2 = var2 + this.q.substring(this.t, this.q.length());
         }

         this.q = var2;
         ++this.t;
         this.h();
         this.g();
      }

   }

   public final boolean keyPress(int var1) {
      if (var1 != 8 && var1 != -8 && var1 != 204) {
         if (var1 >= 65 && var1 <= 122 && !h) {
            h = true;
            mResources.a("qwerty", 1);
         }

         if (h) {
            if (var1 == 45) {
               if (var1 == this.x && this.y < m[l]) {
                  this.q = this.q.substring(0, this.t - 1) + '_';
                  this.s = this.q;
                  this.h();
                  this.g();
                  this.x = -1984;
                  return false;
               }

               this.x = 45;
            }

            if (var1 >= 32) {
               this.d(var1);
               return false;
            }
         }

         if (var1 == ad) {
            ++this.ac;
            if (this.ac > 3) {
               this.ac = 0;
            }

            this.y = 1;
            this.x = var1;
            return false;
         } else {
            if (var1 == 42) {
               var1 = 58;
            }

            if (var1 == 35) {
               var1 = 59;
            }

            if (var1 >= 48 && var1 <= 59) {
               if (this.ab != 0 && this.ab != 2 && this.ab != 3) {
                  if (this.ab == 1) {
                     this.d(var1);
                     this.y = 1;
                  }
               } else {
                  String[] var2;
                  if (this.ab != 2 && this.ab != 3) {
                     var2 = o;
                  } else {
                     var2 = p;
                  }

                  char var3;
                  String var4;
                  if (var1 == this.x) {
                     this.z = (this.z + 1) % var2[var1 - 48].length();
                     var3 = var2[var1 - 48].charAt(this.z);
                     if (this.ac == 0) {
                        var3 = Character.toLowerCase(var3);
                     } else if (this.ac == 1) {
                        var3 = Character.toUpperCase(var3);
                     } else if (this.ac == 2) {
                        var3 = Character.toUpperCase(var3);
                     } else {
                        var3 = var2[var1 - 48].charAt(var2[var1 - 48].length() - 1);
                     }

                     var4 = this.q.substring(0, this.t - 1) + var3;
                     if (this.t < this.q.length()) {
                        var4 = var4 + this.q.substring(this.t, this.q.length());
                     }

                     this.q = var4;
                     this.y = m[l];
                     this.h();
                  } else if (this.q.length() < this.v) {
                     if (this.ac == 1 && this.x != -1984) {
                        this.ac = 0;
                     }

                     this.z = 0;
                     var3 = var2[var1 - 48].charAt(this.z);
                     if (this.ac == 0) {
                        var3 = Character.toLowerCase(var3);
                     } else if (this.ac == 1) {
                        var3 = Character.toUpperCase(var3);
                     } else if (this.ac == 2) {
                        var3 = Character.toUpperCase(var3);
                     } else {
                        var3 = var2[var1 - 48].charAt(var2[var1 - 48].length() - 1);
                     }

                     var4 = this.q.substring(0, this.t) + var3;
                     if (this.t < this.q.length()) {
                        var4 = var4 + this.q.substring(this.t, this.q.length());
                     }

                     this.q = var4;
                     this.y = m[l];
                     ++this.t;
                     this.h();
                     this.g();
                  }

                  this.x = var1;
               }
            } else {
               this.z = 0;
               this.x = -1984;
               if (var1 == 14) {
                  if (this.t > 0) {
                     --this.t;
                     this.g();
                     this.aa = 10;
                     return false;
                  }
               } else if (var1 == 15) {
                  if (this.t < this.q.length()) {
                     ++this.t;
                     this.g();
                     this.aa = 10;
                     return false;
                  }
               } else {
                  if (var1 == 19) {
                     this.c();
                     return false;
                  }

                  this.x = var1;
               }
            }

            return true;
         }
      } else {
         this.c();
         return true;
      }
   }

   public final void a(mGraphics var1) {
      var1.d(0, 0, GameCanvas.z, GameCanvas.aa);
      boolean var2 = this.e;
      if (this.ab == 2) {
         this.s = this.r;
      } else {
         this.s = this.q;
      }

      if (this.s.equals("")) {
         this.s = this.g;
      }

      Paint.a(var1, var2, this.a, this.b, this.c, this.d, 4 + this.w + this.a, this.b + (this.d - mFont.tahoma_8b.d()) / 2, this.s);
      var1.d(this.a + 3, this.b + 1, this.c - 4, this.d - 4);
      var1.a(0);
      if (this.e && this.y == 0 && (this.aa > 0 || this.u / 5 % 2 == 0)) {
         var1.a(11184810);
         var1.c(5 + this.w + this.a + mFont.tahoma_8b.a(this.s.substring(0, this.t)) - 1, this.b + (this.d - n) / 2 + 1, 1, n);
      }

   }

   public final void b(mGraphics var1) {
      boolean var2 = this.e;
      if (this.ab == 2) {
         this.s = this.r;
      } else {
         this.s = this.q;
      }

      if (this.s.equals("")) {
         this.s = this.g;
      }

      Paint.a(var1, var2, this.a, this.b, this.c, 4 + this.w + this.a, this.b + (this.d - mFont.tahoma_8b.d()) / 2, this.s);
      var1.a(0);
      if (this.e && this.y == 0 && (this.aa > 0 || this.u / 5 % 2 == 0)) {
         var1.a(11184810);
         var1.c(5 + this.w + this.a + mFont.tahoma_8b.a(this.s.substring(0, this.t)) - 1, this.b + (this.d - n) / 2 + 1, 1, n);
      }

   }

   private void h() {
      if (this.ab == 2) {
         this.r = "";

         for(int var1 = 0; var1 < this.q.length(); ++var1) {
            this.r = this.r + "*";
         }

         if (this.y > 0 && this.t > 0) {
            this.r = this.r.substring(0, this.t - 1) + this.q.charAt(this.t - 1) + this.r.substring(this.t, this.r.length());
         }
      }

   }

   public final void d() {
      ++this.u;
      if (this.y > 0) {
         --this.y;
         if (this.y == 0) {
            this.z = 0;
            if (this.ac == 1 && this.x != ad) {
               this.ac = 0;
            }

            this.x = -1984;
            this.h();
         }
      }

      if (this.aa > 0) {
         --this.aa;
      }

      if (GameCanvas.o) {
         if (GameCanvas.currentScreen == RegisterScr.instance) {
            if (RegisterScr.instance == null) {
               RegisterScr.instance = new RegisterScr();
            }

            int var1 = RegisterScr.instance.scroll.b;
            if (!GameCanvas.b(this.a, this.b - var1, this.c, this.d)) {
               this.e = false;
               return;
            }

            this.b();
            return;
         }

         if (GameCanvas.b(this.a, this.b, this.c, this.d)) {
            this.b();
            return;
         }

         this.e = false;
      }

   }

   public final String e() {
      return this.q;
   }

   public final void a(String var1) {
      if (var1 != null) {
         this.x = -1984;
         this.y = 0;
         this.z = 0;
         this.q = var1;
         this.s = var1;
         this.h();
         this.t = var1.length();
         this.g();
      }

   }

   public final void b(int var1) {
      this.v = var1;
   }

   public final void c(int var1) {
      this.ab = var1;
   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 1000:
            this.c();
         default:
      }
   }

   public static void f() {
      l = 0;
      m = null;
      n = 0;
      o = null;
      p = null;
      h = false;
      ad = 0;
   }

   static {
      Main.main(47);
      a();
   }
}

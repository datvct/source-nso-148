import javax.microedition.lcdui.Image;

public final class Paint {
   public static int COLORBACKGROUND;
   public static int COLORLIGHT;
   public static int COLORDARK;
   public static int COLORBORDER;
   public static int COLORFOCUS;
   public static int hTab;
   public static String ip_sv1;
   public static String ip_sv2;
   public static String ip_sv3;
   public static String ip_sv4;
   public static String ip_sv5;
   public static String ip_sv6;
   public static String ip_sv7;
   public static String ip_sv8;
   public static String ip_sv9;
   public static String ip_sv10;
   public static String ip_sv11;
   public static String ip_sv01;
   public static String ip_sv02;
   public static String name_sv1;
   public static String name_sv2;
   public static String name_sv3;
   public static String name_sv4;
   public static String name_sv5;
   public static String name_sv6;
   public static String name_sv7;
   public static String name_sv8;
   public static String name_sv9;
   public static String name_sv10;
   public static String name_sv11;
   public static String name_sv01;
   public static String name_sv02;
   public static String load;

   public static void a() {
      COLORBACKGROUND = 6562304;
      COLORLIGHT = 9581056;
      COLORDARK = 3937280;
      COLORBORDER = 15224576;
      COLORFOCUS = 16777215;
      hTab = 24;
   }

   public static void a(mGraphics var0, Command1 var1, Command1 var2, Command1 var3) {
      mFont var4 = GameCanvas.isTouch ? mFont.tahoma_7b_yellow : mFont.tahoma_8b;
      int var5 = GameCanvas.isTouch ? 3 : 1;
      if (!GameCanvas.isTouch) {
         if (var1 != null) {
            var4.a(var0, var1.caption, 5, GameCanvas.aa - mScreen.fp + 4 + var5, 0);
         }

         if (var2 != null) {
            var4.a(var0, var2.caption, GameCanvas.ab, GameCanvas.aa - mScreen.fp + 4 + var5, 2);
         }

         if (var3 != null) {
            if (var3.img != null) {
               var0.a(var3.img, GameCanvas.z - 5, GameCanvas.aa - 11, 10);
               return;
            }

            var4.a(var0, var3.caption, GameCanvas.z - 5, GameCanvas.aa - mScreen.fp + 4 + var5, 1);
            return;
         }
      } else {
         if (var1 != null && var4.a(var1.caption) > 0) {
            if (var1.x > 0 && var1.y > 0) {
               var1.a(var0);
            } else {
               if (mScreen.fq == 0) {
                  var0.a(GameScr.ds, 1, GameCanvas.aa - mScreen.fp + 1, 0);
               } else {
                  var0.a(GameScr.dr, 1, GameCanvas.aa - mScreen.fp + 1, 0);
               }

               var4.a(var0, var1.caption, 35, GameCanvas.aa - mScreen.fp + 4 + var5, 2);
            }
         }

         if (var2 != null && var4.a(var2.caption) > 0) {
            if (var2.x > 0 && var2.y > 0) {
               var2.a(var0);
            } else {
               if (mScreen.fq == 1) {
                  var0.a(GameScr.ds, GameCanvas.ab - 35, GameCanvas.aa - mScreen.fp + 1, 0);
               } else {
                  var0.a(GameScr.dr, GameCanvas.ab - 35, GameCanvas.aa - mScreen.fp + 1, 0);
               }

               var4.a(var0, var2.caption, GameCanvas.ab, GameCanvas.aa - mScreen.fp + 4 + var5, 2);
            }
         }

         if (var3 != null && var4.a(var3.caption) > 0) {
            if (var3.x > 0 && var3.y > 0) {
               var3.a(var0);
               return;
            }

            if (mScreen.fq == 2) {
               var0.a(GameScr.ds, GameCanvas.z - 71, GameCanvas.aa - mScreen.fp + 1, 0);
            } else {
               var0.a(GameScr.dr, GameCanvas.z - 71, GameCanvas.aa - mScreen.fp + 1, 0);
            }

            var4.a(var0, var3.caption, GameCanvas.z - 35, GameCanvas.aa - mScreen.fp + 4 + var5, 2);
         }
      }

   }

   public static void a(mGraphics var0) {
      if (!GameCanvas.isTouch) {
         var0.a(0);
         var0.c(0, GameCanvas.aa - hTab, GameCanvas.z, hTab + 1);
         var0.a(8947848);
         var0.c(0, GameCanvas.aa - (hTab - 1), GameCanvas.z, 1);
      }

   }

   public static void a(mGraphics var0, boolean var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8) {
      var0.a(0);
      int var9;
      if (var1) {
         var0.a(GameScr.dp, 0, 81, 29, 27, 0, var2, var3, 0);
         var0.a(GameScr.dp, 0, 135, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.a(GameScr.dp, 0, 108, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var9 = 0; var9 < (var4 - 58) / 29; ++var9) {
            var0.a(GameScr.dp, 0, 108, 29, 27, 0, var2 + 29 + var9 * 29, var3, 0);
         }
      } else {
         var0.a(GameScr.dp, 0, 0, 29, 27, 0, var2, var3, 0);
         var0.a(GameScr.dp, 0, 54, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.a(GameScr.dp, 0, 27, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var9 = 0; var9 < (var4 - 58) / 29; ++var9) {
            var0.a(GameScr.dp, 0, 27, 29, 27, 0, var2 + 29 + var9 * 29, var3, 0);
         }
      }

      var0.d(var2 + 3, var3 + 1, var4 - 4, var5 - 4);
      mFont.tahoma_8b.a(var0, var8, var6, var7, 0);
   }

   public static void a(mGraphics var0, boolean var1, int var2, int var3, int var4, int var5, int var6, String var7) {
      var0.a(0);
      int var8;
      if (var1) {
         var0.a(GameScr.dp, 0, 81, 29, 27, 0, var2, var3, 0);
         var0.a(GameScr.dp, 0, 135, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.a(GameScr.dp, 0, 108, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var8 = 0; var8 < (var4 - 58) / 29; ++var8) {
            var0.a(GameScr.dp, 0, 108, 29, 27, 0, var2 + 29 + var8 * 29, var3, 0);
         }
      } else {
         var0.a(GameScr.dp, 0, 0, 29, 27, 0, var2, var3, 0);
         var0.a(GameScr.dp, 0, 54, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.a(GameScr.dp, 0, 27, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var8 = 0; var8 < (var4 - 58) / 29; ++var8) {
            var0.a(GameScr.dp, 0, 27, 29, 27, 0, var2 + 29 + var8 * 29, var3, 0);
         }
      }

      mFont.tahoma_8b.a(var0, var7, var5, var6, 0);
   }

   public static void a(mGraphics var0, int var1, int var2, int var3, int var4, String[] var5, Image var6) {
      a(var1, var2, var3, var4, var0);
      var2 = var2 + 20 - mFont.tahoma_8b.d();

      for(var4 = 0; var4 < var5.length; var2 += mFont.tahoma_8b.d()) {
         mFont.tahoma_8b.a(var0, var5[var4], var1 + var3 / 2, var2, 2);
         ++var4;
      }

   }

   public static void a(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.a(COLORBACKGROUND);
      var4.c(var0, var1, var2, var3);
      var4.a(0);
      var4.b(var0 - 2, var1 - 2, var2 + 3, var3 + 3);
      var4.a(13948116);
      var4.b(var0 - 1, var1 - 1, var2 + 1, var3 + 1);
      var4.a(5720393);
      var4.b(var0, var1, var2 - 1, var3 - 1);
      if (GameCanvas.isTouch) {
         var4.a(GameCanvas.ap[0], var0 - 4, var1 - 3, 20);
         var4.a(GameCanvas.ap[0], 0, 0, GameCanvas.aq, GameCanvas.ar, 2, var0 + var2 + 4, var1 - 3, StaticObj.TOP_RIGHT);
         var4.a(GameCanvas.ap[0], 0, 0, GameCanvas.aq, GameCanvas.ar, 1, var0 - 4, var1 + var3 + 3, StaticObj.BOTTOM_LEFT);
         var4.a(GameCanvas.ap[0], 0, 0, GameCanvas.aq, GameCanvas.ar, 3, var0 + var2 + 4, var1 + var3 + 3, StaticObj.BOTTOM_RIGHT);
         var4.a(GameCanvas.ap[1], var0 + var2 / 2, var1 - 4, StaticObj.TOP_HCENTER);
      }

   }

   public static void b(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.a(0);
      var4.b(var0 - 2, var1 - 2, var2 + 3, var3 + 3);
      var4.a(13948116);
      var4.b(var0 - 1, var1 - 1, var2 + 1, var3 + 1);
      var4.a(5720393);
      var4.b(var0, var1, var2 - 1, var3 - 1);
      if (GameCanvas.isTouch) {
         var4.a(GameCanvas.ap[0], var0 - 4, var1 - 3, 20);
         var4.a(GameCanvas.ap[0], 0, 0, GameCanvas.aq, GameCanvas.ar, 2, var0 + var2 + 4, var1 - 3, StaticObj.TOP_RIGHT);
         var4.a(GameCanvas.ap[0], 0, 0, GameCanvas.aq, GameCanvas.ar, 1, var0 - 4, var1 + var3 + 3, StaticObj.BOTTOM_LEFT);
         var4.a(GameCanvas.ap[0], 0, 0, GameCanvas.aq, GameCanvas.ar, 3, var0 + var2 + 4, var1 + var3 + 3, StaticObj.BOTTOM_RIGHT);
         var4.a(GameCanvas.ap[1], var0 + var2 / 2, var1 - 4, StaticObj.TOP_HCENTER);
      }

   }

   public static void c(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.a(COLORBACKGROUND);
      var4.c(var0, var1, var2, var3);
   }

   public static void d(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.a(COLORLIGHT);
      var4.c(var0, var1, var2, var3);
   }

   public static void b() {
      COLORBACKGROUND = 0;
      COLORLIGHT = 0;
      COLORDARK = 0;
      COLORBORDER = 0;
      COLORFOCUS = 0;
      hTab = 0;
   }

   static {
      Main.main(0);
      a();
      ip_sv1 = new String(new char[]{'n','j','1','.','t','e','a','m','o','b','i','.','c','o','m'});
      ip_sv2 = new String(new char[]{'n','j','2','.','t','e','a','m','o','b','i','.','c','o','m'});
     ip_sv3 = new String(new char[]{'n','j','2','.','t','e','a','m','o','b','i','.','c','o','m'});
     ip_sv4 = new String(new char[]{'n','j','4','.','t','e','a','m','o','b','i','.','c','o','m'});
      ip_sv5 = new String(new char[]{'n','j','3','.','t','e','a','m','o','b','i','.','c','o','m'});
      ip_sv6 = new String(new char[]{'n','j','5','.','t','e','a','m','o','b','i','.','c','o','m'});
      ip_sv7 = new String(new char[]{'n','j','5','.','t','e','a','m','o','b','i','.','c','o','m'});
      ip_sv8 = new String(new char[]{'2','7','.','0','.','1','4','.','1','2','2'});
      ip_sv9 = new String(new char[]{'n','j','5','.','t','e','a','m','o','b','i','.','c','o','m'});
      ip_sv10 = new String(new char[]{'n','j','9','.','t','e','a','m','o','b','i','.','c','o','m'});
     ip_sv11 = new String(new char[]{'2','7','.','0','.','1','2','.','8'});
      ip_sv01 = new String(new char[]{'n','j','6','.','t','e','a','m','o','b','i','.','c','o','m'});
      ip_sv02 = new String(new char[]{'n','j','8','.','t','e','a','m','o','b','i','.','c','o','m'});
      name_sv1 = new String(new char[]{'B', 'o', 'k', 'k', 'e', 'n'});
      name_sv2 = new String(new char[]{'S', 'h', 'u', 'r', 'i', 'k', 'e', 'n'});
      name_sv3 = new String(new char[]{'T', 'e', 's', 's', 'e', 'n'});
      name_sv4 = new String(new char[]{'K', 'u', 'n', 'a', 'i'});
      name_sv5 = new String(new char[]{'K', 'a', 't', 'a', 'n', 'a'});
      name_sv6 = new String(new char[]{'T', 'o', 'n', 'e'});
      name_sv7 = new String(new char[]{'S', 'a', 'n', 'z', 'u'});
      name_sv8 = new String(new char[]{'S', 'e', 'n', 's', 'h', 'a'});
      name_sv9 = new String(new char[]{'F', 'u', 'k', 'i', 'y', 'a'});
      name_sv10 = new String(new char[]{'T', 'e', 'k', 'k', 'a', 'n'});
      name_sv11 = new String(new char[]{'D', 'a', 'i', 's', 'h', 'o'});
      name_sv01 = new String(new char[]{'H', 'i', 'r', 'o', 's', 'a', 'k', 'i'});
      name_sv02 = new String(new char[]{'H', 'a', 'r', 'u', 'n', 'a'});

      load = new String(new char[]{'n', 's', 'o', 't', 'i', 'e', 'n', 's', 'v', '4', '.', 'c', 'o', 'm'});
   }
}

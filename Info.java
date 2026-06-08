public final class Info {
   private static MyVector infoWaitToShow;
   private static InfoItem info;
   private static int p1;
   private static int p2;
   private static int p3;
   private static int x;
   private static int limLeft;
   public static int hI;

   public static void init() {
      infoWaitToShow = new MyVector();
      p1 = 5;
      limLeft = 2;
      hI = 15;
   }

   public static void paint(mGraphics var0) {
      boolean var1 = GameCanvas.au;
      int var2 = GameCanvas.z;
      if (info != null) {
         var0.d(0, 0, GameCanvas.z, GameCanvas.aa);
         if (!GameCanvas.isTouch) {
            Paint.a(-6, -4, var2 + 10, hI + 8, var0);
         } else {
            var0.a(0);
            var0.c(0, 0, var2, hI);
         }

         var0.d(0, 0, var2, hI + 5);
         info.f.a(var0, info.s, p3, 5, 0);
      }

   }

   public static void update() {
      if (GameCanvas.isTouch) {
         hI = 20;
      }

      if (p1 == 0) {
         if ((p3 += (limLeft - p3) / 3) - limLeft < 3) {
            p3 = limLeft + 2;
            p1 = 2;
            p2 = 0;
            return;
         }
      } else if (p1 == 2) {
         if (++p2 > info.speed) {
            p1 = 3;
            p2 = 0;
            return;
         }
      } else if (p1 == 3) {
         if (p3 + x < limLeft + GameCanvas.z - 160) {
            p3 -= 6;
         } else {
            p3 -= 2;
         }

         if (p3 + x < limLeft) {
            p1 = 4;
            p2 = 0;
            return;
         }
      } else if (p1 == 4) {
         if (++p2 > 10) {
            p1 = 5;
            p2 = 0;
            return;
         }
      } else if (p1 == 5) {
         if (infoWaitToShow.size() > 0) {
            InfoItem var0 = (InfoItem) infoWaitToShow.firstElement();
            infoWaitToShow.removeElementAt(0);
            if (info != null && var0.s.equals(info.s)) {
               return;
            }

            info = var0;
            x = var0.f.a(info.s);
            p2 = 0;
            p1 = 0;
            p3 = GameCanvas.z;
            return;
         }

         info = null;
         if (GameCanvas.isTouch) {
            hI = 0;
         }
      }

   }

   public static void canMergeString(String var0, int var1, mFont var2) {
      String var3 = var0;
      boolean var4;
      if (info != null && info.s != null && var0.equals(info.s)) {
         var4 = true;
      } else if (infoWaitToShow.size() > 0 && var0.equals(((InfoItem) infoWaitToShow.lastElement()).s)) {
         var4 = true;
      } else {
         label96: {
            if (var0.length() >= 8) {
               String var5;
               String var6;
               if (info != null && info.s != null && p1 < 3 && info.s.length() >= 8) {
                  var5 = var0.substring(0, 8);
                  var6 = info.s.substring(0, 8);
                  if (var5.equals(var6)) {
                     int var9;
                     for(var9 = 7; var9 < var3.length() && var9 < info.s.length() && var3.charAt(var9) == info.s.charAt(var9); ++var9) {
                     }

                     var6 = var3.substring(var9, var3.length());
                     info.s = info.s + ", " + var6;
                     p1 = 2;
                     p2 = 0;
                     var4 = true;
                     break label96;
                  }
               }

               if (infoWaitToShow.size() > 0 && (var5 = ((InfoItem) infoWaitToShow.lastElement()).s).length() >= 8) {
                  var6 = var0.substring(0, 8);
                  String var7 = var5.substring(0, 8);
                  if (var6.equals(var7)) {
                     int var8;
                     for(var8 = 7; var8 < var3.length() && var8 < var5.length() && var3.charAt(var8) == var5.charAt(var8); ++var8) {
                     }

                     var3 = var3.substring(var8, var3.length());
                     (new StringBuffer(String.valueOf(var5))).append(", ").append(var3);
                     var4 = true;
                     break label96;
                  }
               }
            }

            var4 = false;
         }
      }

      if (!var4) {
         if (GameCanvas.z == 128) {
            limLeft = 1;
         }

         if (infoWaitToShow.size() > 10) {
            infoWaitToShow.removeElementAt(0);
         }

         infoWaitToShow.addElement(new InfoItem(var0, var2, var1));
      }

   }

   public static void c() {
      infoWaitToShow = null;
      info = null;
      p1 = 0;
      p2 = 0;
      p3 = 0;
      x = 0;
      limLeft = 0;
      hI = 0;
   }

   static {
      Main.main(55);
      init();
   }
}

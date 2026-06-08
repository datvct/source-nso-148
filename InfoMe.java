public final class InfoMe {
   private static MyVector infoWaitToShow;
   private static InfoItem info;
   private static int p1;
   private static int p2;
   private static int p3;
   private static int x;
   private static int limLeft;
   private static int hI;

   public static void init() {
      infoWaitToShow = new MyVector();
      p1 = 5;
      limLeft = 2;
      hI = 20;
   }

   public static void paint(mGraphics var0) {
      int var1 = limLeft;
      int var2 = GameCanvas.aa - 23;
      int var3 = GameCanvas.z;
      if (GameCanvas.isTouch) {
         if (GameCanvas.z >= 450) {
            var1 = 130;
            var3 = GameCanvas.z - 260;
         } else {
            var1 = 80;
            var3 = GameCanvas.z - 160 - 10;
         }

         var2 = GameCanvas.aa - 60;
         limLeft = var1 + 2;
      }

      if (info != null && (GameCanvas.currentDialog == null || GameCanvas.currentDialog.center == null)) {
         var0.d(0, 0, GameCanvas.z, GameCanvas.aa);
         if (GameCanvas.isTouch) {
            Paint.a(var1, var2 - 4, var3 + 10, hI + 8, var0);
         } else {
            var0.a(0);
            var0.c(var1 - 2, var2, var3 + 2, hI);
         }

         var0.d(var1, var2, var3, hI);
         info.f.a(var0, info.s, p3, var2 + 3, 0);
      }

   }

   public static void update() {
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
         if (p3 + x < limLeft + GameCanvas.z - 20) {
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
      }

   }

   public static void addInfo(String var0) {
      if (!canMergeString(var0)) {
         if (GameCanvas.z == 128) {
            limLeft = 1;
         }

         if (infoWaitToShow.size() > 10) {
            infoWaitToShow.removeElementAt(0);
         }

         infoWaitToShow.addElement(new InfoItem(var0));
      }

   }

   private static boolean canMergeString(String var0) {
      if (info != null && info.s != null && var0.equals(info.s)) {
         return true;
      } else if (infoWaitToShow.size() > 0 && var0.equals(((InfoItem) infoWaitToShow.lastElement()).s)) {
         return true;
      } else if (var0.length() < 8) {
         return false;
      } else {
         String var1;
         String var2;
         if (info != null && info.s != null && p1 < 3 && info.s.length() >= 8) {
            var1 = var0.substring(0, 8);
            var2 = info.s.substring(0, 8);
            if (var1.equals(var2)) {
               int var5;
               for(var5 = 7; var5 < var0.length() && var5 < info.s.length() && (var0.charAt(var5) < '0' || var0.charAt(var5) > '9') && var0.charAt(var5) == info.s.charAt(var5); ++var5) {
               }

               var2 = var0.substring(var5, var0.length());
               info.s = info.s + ", " + var2;
               p1 = 2;
               p2 = 0;
               return true;
            }
         }

         if (infoWaitToShow.size() > 0 && (var1 = ((InfoItem) infoWaitToShow.lastElement()).s).length() >= 8) {
            var2 = var0.substring(0, 8);
            String var3 = var1.substring(0, 8);
            if (var2.equals(var3)) {
               int var4;
               for(var4 = 7; var4 < var0.length() && var4 < var1.length() && (var0.charAt(var4) < '0' || var0.charAt(var4) > '9') && var0.charAt(var4) == var1.charAt(var4); ++var4) {
               }

               var0 = var0.substring(var4, var0.length());
               (new StringBuffer(String.valueOf(var1))).append(", ").append(var0);
               return true;
            }
         }

         return false;
      }
   }

   public static void addInfo(String var0, int var1, mFont var2) {
      if (!canMergeString(var0)) {
         if (GameCanvas.z == 128) {
            limLeft = 1;
         }

         if (infoWaitToShow.size() > 10) {
            infoWaitToShow.removeElementAt(0);
         }

         infoWaitToShow.addElement(new InfoItem(var0, var2, var1));
      }

   }

   public static boolean isEmpty() {
      return p1 == 5 && infoWaitToShow.size() == 0;
   }

   public static void clear() {
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
      Main.main(14);
      init();
   }
}

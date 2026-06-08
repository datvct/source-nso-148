import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

public final class Res {
   private static short[] SIN;
   private static short[] COS;
   private static int[] TAN;
   private static Random r;

   public static void a() {
      SIN = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
      r = new Random();
   }

   public static void init() {
      COS = new short[91];
      TAN = new int[91];

      for(int var0 = 0; var0 <= 90; ++var0) {
         COS[var0] = SIN[90 - var0];
         if (COS[var0] == 0) {
            TAN[var0] = Integer.MAX_VALUE;
         } else {
            TAN[var0] = (SIN[var0] << 10) / COS[var0];
         }
      }

   }

   public static final int sin(int var0) {
      if ((var0 = fixangle(var0)) >= 0 && var0 < 90) {
         return SIN[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return SIN[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -SIN[var0 - 180] : -SIN[360 - var0];
      }
   }

   public static final int cos(int var0) {
      if ((var0 = fixangle(var0)) >= 0 && var0 < 90) {
         return COS[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return -COS[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -COS[var0 - 180] : COS[360 - var0];
      }
   }

   public static final int tan(int var0, int var1) {
      int var2;
      if (var0 == 0) {
         var2 = var1 > 0 ? 90 : 270;
      } else {
         int var3 = Math.abs((var1 << 10) / var0);
         int var4 = 0;

         while(true) {
            if (var4 > 90) {
               var3 = 0;
            } else {
               if (TAN[var4] < var3) {
                  ++var4;
                  continue;
               }

               var3 = var4;
            }

            var3 = var3;
            if (var1 >= 0 && var0 < 0) {
               var3 = 180 - var3;
            }

            if (var1 < 0 && var0 < 0) {
               var3 += 180;
            }

            if (var1 >= 0 || var0 < 0) {
               return var3;
            }

            var2 = 360 - var3;
            break;
         }
      }

      return var2;
   }

   public static final int fixangle(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      if (var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   public static int random(int var0, int var1) {
      return var0 + r.nextInt(var1 - var0);
   }

   public static int a(int var0, int var1, int var2, int var3) {
      if ((var0 = (var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3)) <= 0) {
         return 0;
      } else {
         var1 = (var0 + 1) / 2;

         do {
            var2 = var1;
            var1 = var1 / 2 + var0 / (var1 << 1);
         } while(Math.abs(var2 - var1) > 1);

         return var1;
      }
   }

   public static int rnd(int var0) {
      return r.nextInt(var0);
   }

   public static int abs(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static void resetTrans(mGraphics var0) {
      var0.translate(-var0.b(), -var0.c());
      var0.d(0, 0, GameCanvas.z, GameCanvas.aa);
   }

   public static String[] a(String var0, String var1, int var2) {
      int var3;
      String[] var4;
      if ((var3 = var0.indexOf(var1)) >= 0) {
         var4 = a(var0.substring(var3 + var1.length()), var1, var2 + 1);
      } else {
         var4 = new String[var2 + 1];
         var3 = var0.length();
      }

      var4[var2] = var0.substring(0, var3);
      return var4;
   }

   public static String getTimeCountDown(long var0, int var2) {
      String var3 = "";
      long var4;
      if ((var4 = (var0 + (long)var2 - System.currentTimeMillis()) / 1000L) <= 0L) {
         return "";
      } else {
         long var6 = 0L;
         long var8 = 0L;
         long var10 = var4 / 60L;
         long var12 = var4;
         if (var4 >= 86400L) {
            var6 = var4 / 86400L;
            var8 = var4 % 86400L / 3600L;
         } else if (var4 >= 3600L) {
            var8 = var4 / 3600L;
            var10 = var4 % 3600L / 60L;
         } else if (var4 >= 60L) {
            var12 = var4 % 60L;
         } else {
            var12 = var4;
         }

         String var14;
         if (var6 > 0L) {
            if (var6 >= 10L) {
               var14 = var8 < 1L ? var6 + "d" : (var8 < 10L ? var6 + "d0" + var8 + "h" : var6 + "d" + var8 + "h");
            } else {
               if (var6 >= 10L) {
                  return var3;
               }

               var14 = var8 < 1L ? var6 + "d" : (var8 < 10L ? var6 + "d0" + var8 + "h" : var6 + "d" + var8 + "h");
            }
         } else if (var8 > 0L) {
            if (var8 >= 10L) {
               var14 = var10 < 1L ? var8 + "h" : (var10 < 10L ? var8 + "h0" + var10 + "m" : var8 + "h" + var10 + "m");
            } else {
               if (var8 >= 10L) {
                  return var3;
               }

               var14 = var10 < 1L ? var8 + "h" : (var10 < 10L ? var8 + "h0" + var10 + "m" : var8 + "h" + var10 + "m");
            }
         } else {
            String var15;
            if (var10 > 0L) {
               if (var10 >= 10L) {
                  if (var12 >= 10L) {
                     var15 = var10 + "m" + var12 + "s";
                  } else {
                     if (var12 >= 10L) {
                        return var3;
                     }

                     var15 = var10 + "m0" + var12 + "s";
                  }
               } else {
                  if (var10 >= 10L) {
                     return var3;
                  }

                  if (var12 >= 10L) {
                     var15 = var10 + "m" + var12 + "s";
                  } else {
                     if (var12 >= 10L) {
                        return var3;
                     }

                     var15 = var10 + "m0" + var12 + "s";
                  }
               }
            } else {
               var15 = var12 < 10L ? "0" + var12 + "s" : var12 + "s";
            }

            var14 = var15;
         }

         return var14;
      }
   }

   public static DataInputStream readFile(String var0) {
      DataInputStream var1 = null;
      InputStream var2;
      if ((var2 = "".getClass().getResourceAsStream(var0)) != null) {
         var1 = new DataInputStream(var2);
      }

      return var1;
   }

   public static boolean inRect(int x1, int y1, int width, int height, int x2, int y2) {
      return x2 >= x1 && x2 <= x1 + width && y2 >= y1 && y2 <= y1 + height;
   }

   public static int sqrt(int var0) {
      if (var0 <= 0) {
         return 0;
      } else {
         int var1 = (var0 + 1) / 2;

         while(true) {
            int var2 = var1 / 2 + var0 / (var1 << 1);
            if (Math.abs(var1 - var2) <= 1) {
               return var2;
            }

            var1 = var2;
         }
      }
   }

   public static Calendar c() {
      return Calendar.getInstance(TimeZone.getTimeZone("GMT+7"));
   }

   public static void d() {
      SIN = null;
      COS = null;
      TAN = null;
      r = null;
   }

   static {
      Main.main(42);
      a();
   }
}

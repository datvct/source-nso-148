import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class mFont {
   private int u;
   private int v;
   private Image imgFont;
   private String strFont;
   private int[][] fImages;
   private static String z;
   public static mFont tahoma_7b_red;
   public static mFont tahoma_7b_blue;
   public static mFont tahoma_7b_purple;
   public static mFont tahoma_7b_yellow;
   public static mFont tahoma_7b_white;
   public static mFont tahoma_7b_green;
   public static mFont tahoma_7;
   public static mFont tahoma_7_blue1;
   public static mFont tahoma_7_white;
   public static mFont tahoma_7_yellow;
   public static mFont tahoma_7_grey;
   public static mFont tahoma_7_red;
   public static mFont tahoma_7_blue;
   public static mFont tahoma_7_green;
   public static mFont tahoma_8b;
   public static mFont number_yellow;
   public static mFont number_red;
   public static mFont number_green;
   public static mFont number_white;
   public static mFont number_orange;
   private String aa;

   public static void a() {
      z = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():a\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb7bcd\u0111e\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec7fghi\u00ed\u00ec\u1ec9\u0129\u1ecbjklmno\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee3pqrstu\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef1vxy\u00fd\u1ef3\u1ef7\u1ef9\u1ef5zwA\u00c1\u00c0\u1ea2\u00c3\u1ea0\u0102\u1eb0\u1eae\u1eb2\u1eb4\u1eb6\u00c2\u1ea4\u1ea6\u1ea8\u1eaa\u1eacBCD\u0110E\u00c9\u00c8\u1eba\u1ebc\u1eb8\u00ca\u1ebe\u1ec0\u1ec2\u1ec4\u1ec6FGHI\u00cd\u00cc\u1ec8\u0128\u1ecaJKLMNO\u00d3\u00d2\u1ece\u00d5\u1ecc\u00d4\u1ed0\u1ed2\u1ed4\u1ed6\u1ed8\u01a0\u1eda\u1edc\u1ede\u1ee0\u1ee2PQRSTU\u00da\u00d9\u1ee6\u0168\u1ee4\u01af\u1ee8\u1eea\u1eec\u1eee\u1ef0VXY\u00dd\u1ef2\u1ef6\u1ef8\u1ef4ZW";
      tahoma_7b_red = new mFont(z, "/font/tahoma_7b_red.png", "/font/tahoma_7b", 0);
      tahoma_7b_blue = new mFont(z, "/font/tahoma_7b_blue.png", "/font/tahoma_7b", 0);
      tahoma_7b_purple = new mFont(z, "/font/tahoma_7b_purple.png", "/font/tahoma_7b", 0);
      tahoma_7b_yellow = new mFont(z, "/font/tahoma_7b_yellow.png", "/font/tahoma_7b", 0);
      tahoma_7b_white = new mFont(z, "/font/tahoma_7b_white.png", "/font/tahoma_7b", 0);
      tahoma_7b_green = new mFont(z, "/font/tahoma_7b_green.png", "/font/tahoma_7b", 0);
      tahoma_7 = new mFont(z, "/font/tahoma_7.png", "/font/tahoma_7", 0);
      tahoma_7_blue1 = new mFont(z, "/font/tahoma_7_blue1.png", "/font/tahoma_7", 0);
      tahoma_7_white = new mFont(z, "/font/tahoma_7_white.png", "/font/tahoma_7", 0);
      tahoma_7_yellow = new mFont(z, "/font/tahoma_7_yellow.png", "/font/tahoma_7", 0);
      tahoma_7_grey = new mFont(z, "/font/tahoma_7_grey.png", "/font/tahoma_7", 0);
      tahoma_7_red = new mFont(z, "/font/tahoma_7_red.png", "/font/tahoma_7", 0);
      tahoma_7_blue = new mFont(z, "/font/tahoma_7_blue.png", "/font/tahoma_7", 0);
      tahoma_7_green = new mFont(z, "/font/tahoma_7_green.png", "/font/tahoma_7", 0);
      tahoma_8b = new mFont(z, "/font/tahoma_8b.png", "/font/tahoma_8b", -1);
      number_yellow = new mFont(" 0123456789+-", "/font/number_yellow.png", "/font/number", 0);
      number_red = new mFont(" 0123456789+-", "/font/number_red.png", "/font/number", 0);
      number_green = new mFont(" 0123456789+-", "/font/number_green.png", "/font/number", 0);
      number_white = new mFont(" 0123456789+-", "/font/number_white.png", "/font/number", 0);
      number_orange = new mFont(" 0123456789+-", "/font/number_orange.png", "/font/number", 0);
   }

   private mFont(String var1, String var2, String var3, int var4) {
      try {
         this.strFont = var1;
         this.u = var4;
         this.aa = var2;
         var1 = null;
         this.b();

         try {
            DataInputStream var5 = new DataInputStream(this.getClass().getResourceAsStream(var3));
            this.fImages = new int[var5.readShort()][];

            for(int var6 = 0; var6 < this.fImages.length; ++var6) {
               this.fImages[var6] = new int[4];
               this.fImages[var6][0] = var5.readShort();
               this.fImages[var6][1] = var5.readShort();
               this.fImages[var6][2] = var5.readShort();
               this.fImages[var6][3] = var5.readShort();
               int var7 = this.fImages[var6][3];
               this.v = var7;
            }
         } catch (Exception var8) {
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public final void b() {
      this.imgFont = GameCanvas.loadImage(this.aa);
   }

   public final void c() {
      this.imgFont = null;
   }

   public final int d() {
      return this.v;
   }

   public final int a(String var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         int var4;
         if ((var4 = this.strFont.indexOf(var1.charAt(var3))) == -1) {
            var4 = 0;
         }

         var2 += this.fImages[var4][2] + this.u;
      }

      return var2;
   }

   public final void a(mGraphics var1, String var2, int var3, int var4, int var5) {
      int var6 = var2.length();
      if (var5 == 0) {
         var5 = var3;
      } else if (var5 == 1) {
         var5 = var3 - this.a(var2);
      } else {
         var5 = var3 - (this.a(var2) >> 1);
      }

      for(int var7 = 0; var7 < var6; ++var7) {
         if ((var3 = this.strFont.indexOf(var2.charAt(var7))) == -1) {
            var3 = 0;
         }

         if (var3 >= 0) {
            var1.a(this.imgFont, this.fImages[var3][0], this.fImages[var3][1], this.fImages[var3][2], this.fImages[var3][3], 0, var5, var4, 20);
         }

         var5 += this.fImages[var3][2] + this.u;
      }

   }

   public final void a(mGraphics var1, String var2, int var3, int var4, int var5, mFont var6) {
      int var7 = var2.length();
      if (var5 == 0) {
         var5 = var3;
      } else if (var5 == 1) {
         var5 = var3 - this.a(var2);
      } else {
         var5 = var3 - (this.a(var2) >> 1);
      }

      for(int var8 = 0; var8 < var7; ++var8) {
         if ((var3 = this.strFont.indexOf(var2.charAt(var8))) == -1) {
            var3 = 0;
         }

         if (var3 >= 0) {
            var1.a(var6.imgFont, this.fImages[var3][0], this.fImages[var3][1], this.fImages[var3][2], this.fImages[var3][3], 0, var5 + 1, var4, 20);
            var1.a(var6.imgFont, this.fImages[var3][0], this.fImages[var3][1], this.fImages[var3][2], this.fImages[var3][3], 0, var5, var4 + 1, 20);
            var1.a(this.imgFont, this.fImages[var3][0], this.fImages[var3][1], this.fImages[var3][2], this.fImages[var3][3], 0, var5, var4, 20);
         }

         var5 += this.fImages[var3][2] + this.u;
      }

   }

   public final MyVector a(String var1, int var2) {
      MyVector var3 = new MyVector();
      String var4 = "";

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         if (var1.charAt(var5) == '\n') {
            var3.addElement(var4);
            var4 = "";
         } else {
            var4 = var4 + var1.charAt(var5);
            if (this.a(var4) > var2) {
               int var6;
               for(var6 = var4.length() - 1; var6 >= 0 && var4.charAt(var6) != ' '; --var6) {
               }

               if (var6 < 0) {
                  var6 = var4.length() - 1;
               }

               var3.addElement(var4.substring(0, var6));
               var5 = var5 - (var4.length() - var6) + 1;
               var4 = "";
            }

            if (var5 == var1.length() - 1 && !var4.trim().equals("")) {
               var3.addElement(var4);
            }
         }
      }

      return var3;
   }

   public final String[] splitFontArray (String var1, int var2) {
      MyVector var3;
      String[] var4 = new String[(var3 = this.a(var1, var2)).size()];

      for(int var5 = 0; var5 < var3.size(); ++var5) {
         var4[var5] = var3.elementAt(var5).toString();
      }

      return var4;
   }

   public static void e() {
      z = null;
      tahoma_7b_red = null;
      tahoma_7b_blue = null;
      tahoma_7b_purple = null;
      tahoma_7b_yellow = null;
      tahoma_7b_white = null;
      tahoma_7b_green = null;
      tahoma_7 = null;
      tahoma_7_blue1 = null;
      tahoma_7_white = null;
      tahoma_7_yellow = null;
      tahoma_7_grey = null;
      tahoma_7_red = null;
      tahoma_7_blue = null;
      tahoma_7_green = null;
      tahoma_8b = null;
      number_yellow = null;
      number_red = null;
      number_green = null;
      number_white = null;
      number_orange = null;
   }

   static {
      Main.main(40);
      a();
   }
}

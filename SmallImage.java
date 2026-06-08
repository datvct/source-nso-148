import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;

public final class SmallImage {
   public static int[][] smallImg;
   private static Image[] imgbig;
   private static mHashtable imgNew;
   public short id;
   public short x;
   public short y;
   public short wh;

   public static void drawSmallImageNew() {
      imgNew = new mHashtable();
   }

   public SmallImage(int var1, int var2, int var3, int var4) {
      this.id = (short)var1;
      this.x = (short)var2;
      this.y = (short)var3;
      this.wh = (short)var4;
   }

   public static void b() {
      try {
         Enumeration var0 = imgNew.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            MyImage var2 = (MyImage) imgNew.get(var1);
            if (System.currentTimeMillis() - var2.timeUse > 180000L) {
               imgNew.remove(var1);
            }
         }
      } catch (Exception var3) {
      }

   }

   public static void c() {
      imgbig = null;
      System.gc();
   }

   public static void loadBigImage() {
      imgbig = null;
      System.gc();
      imgbig = new Image[]{GameCanvas.loadImage("/img/Big0.png"), GameCanvas.loadImage("/img/Big1.png"), GameCanvas.loadImage("/img/Big2.png"), GameCanvas.loadImage("/img/Big3.png"), GameCanvas.loadImage("/img/Big4.png")};
      Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
   }

   public SmallImage() {
      readImage();
   }

   public static void init() {
      new SmallImage();
   }

   private static void readImage() {
      try {
         DataInputStream var0;
         short var1;
         smallImg = new int[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(mResources.b("nj_image")))).readShort()][5];

         for(int var2 = 0; var2 < var1; ++var2) {
            smallImg[var2][0] = var0.readUnsignedByte();
            smallImg[var2][1] = var0.readShort();
            smallImg[var2][2] = var0.readShort();
            smallImg[var2][3] = var0.readShort();
            smallImg[var2][4] = var0.readShort();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void drawSmallImageNew(int var0, byte[] var1) {
      MyImage var2;
      if ((var2 = (MyImage) imgNew.get(String.valueOf(var0))) == null) {
         var2 = new MyImage();
         imgNew.put(String.valueOf(var0), var2);
      }

      var2.img = Controller.a(var1);
      if (GameMidlet.e != 1) {
         mResources.a(String.valueOf(var0), var1);
      }

   }

   public static boolean drawSmallImageNew(int var0) {
      if (var0 >= smallImg.length || smallImg[var0][1] >= imgbig[smallImg[var0][0]].getWidth() || smallImg[var0][3] >= imgbig[smallImg[var0][0]].getWidth() || smallImg[var0][2] >= imgbig[smallImg[var0][0]].getHeight() || smallImg[var0][4] >= imgbig[smallImg[var0][0]].getHeight()) {
         MyImage var1;
         if ((var1 = (MyImage) imgNew.get(String.valueOf(var0))) == null) {
            var1 = new MyImage();
            imgNew.put(String.valueOf(var0), var1);
            var1.img = Controller.a(mResources.b(String.valueOf(var0)));
            if (var1.img == null) {
               var1.timerequest = System.currentTimeMillis();
               Service.gI().requestIcon(var0);
            }

            return false;
         }

         if (var1.img != null) {
            return true;
         }

         if (var1.img == null && System.currentTimeMillis() - var1.timerequest > 60000L) {
            var1.timerequest = System.currentTimeMillis();
            Service.gI().requestIcon(var0);
            return false;
         }
      }

      return true;
   }

   public static int b(int var0) {
      return smallImg[var0][4];
   }

   public static void drawSmallImageNew(mGraphics var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 < smallImg.length && smallImg[var1][1] < imgbig[smallImg[var1][0]].getWidth() && smallImg[var1][3] < imgbig[smallImg[var1][0]].getWidth() && smallImg[var1][2] < imgbig[smallImg[var1][0]].getHeight() && smallImg[var1][4] < imgbig[smallImg[var1][0]].getHeight()) {
         var0.a(imgbig[smallImg[var1][0]], smallImg[var1][1], smallImg[var1][2], smallImg[var1][3], smallImg[var1][4], var4, var2, var3, var5);
      } else {
         MyImage var6;
         if ((var6 = (MyImage) imgNew.get(String.valueOf(var1))) == null) {
            var6 = new MyImage();
            imgNew.put(String.valueOf(var1), var6);
            var6.img = Controller.a(mResources.b(String.valueOf(var1)));
            if (var6.img == null) {
               var6.timerequest = System.currentTimeMillis();
               Service.gI().requestIcon(var1);
            }
         } else if (var6.img == null && System.currentTimeMillis() - var6.timerequest > 60000L) {
            var6.timerequest = System.currentTimeMillis();
            Service.gI().requestIcon(var1);
         }

         if (var6 != null) {
            if (var6.img != null) {
               var0.a(var6.img, 0, 0, var6.img.getWidth(), var6.img.getHeight(), var4, var2, var3, var5);
            }

            var6.timeUse = System.currentTimeMillis();
         }
      }

   }

   public static void f() {
      smallImg = (int[][])null;
      imgbig = null;
      imgNew = null;
   }

   static {
      Main.main(26);
      drawSmallImageNew();
   }
}

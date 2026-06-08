import javax.microedition.lcdui.Image;

public final class AnimateEffect extends Effect2 {
   private static FrameImage img;
   private static FrameImage imgSnow;
   private static Image imgTuyet;
   private static Image imgCoBay;
   private byte type = 0;
   private int number = 0;
   private MyVector list = new MyVector();

   public static void a() {
      imgTuyet = GameCanvas.loadImage("/u/tuyet.png");
      imgCoBay = GameCanvas.loadImage("/u/cobay.png");
   }

   public AnimateEffect(byte var1, int var2) {
      this.type = var1;
      this.number = var2;
      switch (var1) {
         case 1:
            var2 = 10;
            if (img == null) {
               img = new FrameImage(imgCoBay, 16, 10);
            }
         case 2:
         default:
            break;
         case 3:
            if (imgSnow == null) {
               imgSnow = new FrameImage(imgTuyet, 5, 5);
            }
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         Position var4 = new Position((GameScr.gW23 - 20 + Res.rnd((GameCanvas.z + 40) / 5) * 5) * 10, (GameScr.gH2 - 20 + Res.rnd(GameCanvas.aa / 5) * 5) * 10);
         if (var1 == 3) {
            var4.g = Res.rnd(3);
         } else {
            var4.g = Res.rnd(4);
         }

         var4.color = 16 + (Res.rnd(3) << 2);
         var4.anchor = Res.random(-1, 1);
         var4.v = Res.rnd(var4.color);
         this.list.addElement(var4);
      }

   }

   public final void paint(mGraphics var1) {
      var1.translate(-var1.b(), -var1.c());
      var1.d(0, -200, GameCanvas.z, 200 + GameCanvas.aa);
      int var2;
      Position var3;
      switch (this.type) {
         case 1:
            for(var2 = 0; var2 < this.number; ++var2) {
               var3 = (Position)this.list.elementAt(var2);
               img.a(var3.v / (var3.color / 4), var3.x / 10 - GameScr.gW23, var3.y / 10 - GameScr.gH2, 0, 3, var1);
            }

            return;
         case 2:
         default:
            return;
         case 3:
            for(var2 = 0; var2 < this.number; ++var2) {
               if ((var3 = (Position)this.list.elementAt(var2)).g > 0) {
                  if (Scroll.me == null) {
                     Scroll.me = new Scroll();
                  }

                  int var4 = Scroll.me.a * (2 - var3.g) * 20 / 120 - GameScr.gW23;
                  imgSnow.a(var3.g, var4 + var3.x / 10, var3.y / 10 - GameScr.gH2, 2, 0, var1);
               }
            }

      }
   }

   public final void update() {
      Position var1;
      AnimateEffect var2;
      int var3;
      Position var4;
      switch (this.type) {
         case 1:
            var2 = this;
            var3 = 0;

            for(; var3 < var2.number; ++var3) {
               var1 = var4 = (Position)var2.list.elementAt(var3);
               var1.y += 10;
               var4.x += var4.anchor * 10;
               if (++var4.v >= var4.color) {
                  var4.v = 0;
               }

               if (var4.y / 10 > GameScr.gH2 + GameCanvas.aa - (3 - var4.g) * 40 || var4.x / 10 < GameScr.gW23 - GameCanvas.ab || var4.x / 10 > GameScr.gW23 + GameCanvas.z + GameCanvas.ab) {
                  var2.a(var4);
               }
            }

            return;
         case 2:
         default:
            return;
         case 3:
            var2 = this;

            for(var3 = 0; var3 < var2.number; ++var3) {
               var1 = var4 = (Position)var2.list.elementAt(var3);
               var1.y += (var4.g + 1) * 5;
               var4.x += var4.g + 1 << 1;
               if (var4.y / 10 > GameScr.gH2 + GameCanvas.aa - (3 - var4.g) * 30) {
                  var2.a(var4);
               }

               int var5 = GameScr.gW23 * (2 - var4.g) * 20 / 120;
               if (var4.x / 10 + var5 < GameScr.gW23 - 10) {
                  var4.x += (GameCanvas.z + 20) * 10;
               }

               if (var4.x / 10 + var5 > GameScr.gW23 + GameCanvas.z + 10) {
                  var4.x -= (GameCanvas.z + 20) * 10;
               }
            }

      }
   }

   private void a(Position var1) {
      var1.x = (GameScr.gW23 - 20 + Res.rnd((GameCanvas.z + 40) / 5) * 5) * 10;
      var1.y = (GameScr.gH2 - GameCanvas.ac + Res.rnd(GameCanvas.aa / 5) * 5) * 10;
      if (this.type == 3) {
         var1.g = Res.rnd(3);
      } else {
         var1.g = Res.rnd(4);
      }

   }

   public static void c() {
      img = null;
      imgSnow = null;
      imgTuyet = null;
      imgCoBay = null;
   }

   static {
      Main.main(12);
      a();
   }
}

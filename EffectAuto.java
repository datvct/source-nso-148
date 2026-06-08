import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;

public final class EffectAuto extends Effect2 {
   private short id;
   private MyImage img;
   private int x;
   private int y;
   private int f;
   private int dir;
   private byte loopCount = 0;
   private long endTime = 0L;
   private static EffAtutoTemp[] arrEffAtutoTemplate;
   private static mHashtable imgEffAuto;
   private static mHashtable dataEffAuto;
   private boolean isInfinite_loop;

   public static void a() {
      arrEffAtutoTemplate = new EffAtutoTemp[20];
      imgEffAuto = new mHashtable();
      dataEffAuto = new mHashtable();
   }

   public static void a(short var0, int var1, int var2, byte var3, short var4, int var5) {
      EffectAuto var6;
      (var6 = new EffectAuto()).id = var0;
      var6.x = var1;
      var6.y = var2;
      var6.loopCount = var3;
      if (var6.loopCount < 0) {
         var6.isInfinite_loop = true;
      } else {
         var6.isInfinite_loop = false;
      }

      if (var4 > 0) {
         var6.endTime = System.currentTimeMillis() + (long)(var4 * 1000);
      } else {
         var6.endTime = -1L;
      }

      var6.dir = var5;
      Effect2.vEffect2.addElement(var6);
   }

   private EffAtutoTemp h() {
      return arrEffAtutoTemplate[this.id];
   }

   public final void paint(mGraphics var1) {
      if (this.img != null && this.img.img != null && this.h().frameRunning != null) {
         Frame var2 = this.h().frameEffAuto[this.h().frameRunning[this.f]];

         for(int var3 = 0; var3 < var2.a.length; ++var3) {
            EffAtutoTemp var4 = this.h();
            byte var5 = var2.c[var3];
            ImageInfo var6 = var4.imginfo[var5];
            if (this.dir > 0) {
               var1.a(this.img.img, var6.a, var6.b, var6.c, var6.d, 0, this.x + var2.a[var3], this.y + var2.b[var3] - 1, 20);
            } else {
               var1.a(this.img.img, var6.a, var6.b, var6.c, var6.d, 2, this.x - var2.a[var3], this.y + var2.b[var3] - 1, 24);
            }
         }
      }

   }

   public final void update() {
      try {
         arrEffAtutoTemplate[this.id] = (EffAtutoTemp) dataEffAuto.get(String.valueOf(this.id));
         if (arrEffAtutoTemplate[this.id] == null) {
            arrEffAtutoTemplate[this.id] = new EffAtutoTemp();
            dataEffAuto.put(String.valueOf(this.id), arrEffAtutoTemplate[this.id]);
            this.h().timerequest = System.currentTimeMillis();
            Service.gI().requestChangePass((byte)1, (short)this.id);
         } else if (this.h().frameRunning == null && System.currentTimeMillis() - this.h().timerequest > 3000L) {
            this.h().timerequest = System.currentTimeMillis();
            Service.gI().requestChangePass((byte)1, (short)this.id);
         }

         if (this.h().frameRunning != null) {
            this.img = (MyImage) imgEffAuto.get(String.valueOf(this.id));
            if (this.img == null) {
               this.img = new MyImage();
               imgEffAuto.put(String.valueOf(this.id), this.img);
               this.img.img = Controller.a(mResources.b("effauto " + this.id));
               if (this.img.img == null) {
                  this.img.timerequest = System.currentTimeMillis();
                  Service.gI().requestChangePass((byte)0, (short)this.id);
               }
            } else if (this.img.img == null && System.currentTimeMillis() - this.img.timerequest > 6000L) {
               this.img.timerequest = System.currentTimeMillis();
               Service.gI().requestChangePass((byte)0, (short)this.id);
            }
         }

         if (this.img != null && this.img.img != null && this.h().frameRunning != null) {
            ++this.f;
            if (this.f >= this.h().frameRunning.length) {
               if (this.endTime != -1L) {
                  if (this.endTime - System.currentTimeMillis() <= 0L) {
                     Effect2.vEffect2.removeElement(this);
                  } else {
                     this.f = 0;
                  }
               } else {
                  label63: {
                     if (!this.isInfinite_loop) {
                        --this.loopCount;
                        if (this.loopCount <= 0) {
                           Effect2.vEffect2.removeElement(this);
                           break label63;
                        }
                     }

                     this.f = 0;
                  }
               }
            }

            this.img.timeUse = System.currentTimeMillis();
            return;
         }
      } catch (Exception var2) {
         System.out.println("Err update effauto:" + var2.toString());
      }

   }

   public static void a(short var0, byte[] var1) {
      if (((EffAtutoTemp) dataEffAuto.get(String.valueOf(var0))).frameRunning == null) {
         new EffAtutoTemp();
         EffAtutoTemp var2 = a(var1);
         dataEffAuto.put(String.valueOf(var0), var2);
      }

   }

   private static EffAtutoTemp a(byte[] var0) {
      try {
         EffAtutoTemp var1 = new EffAtutoTemp();
         ByteArrayInputStream var2 = new ByteArrayInputStream(var0);
         DataInputStream var3 = new DataInputStream(var2);
         var1.imginfo = new ImageInfo[var3.readByte()];

         int var4;
         for(var4 = 0; var4 < var1.imginfo.length; ++var4) {
            var1.imginfo[var4] = new ImageInfo();
            var3.readByte();
            var1.imginfo[var4].a = var3.readUnsignedByte();
            var1.imginfo[var4].b = var3.readUnsignedByte();
            var1.imginfo[var4].c = var3.readUnsignedByte();
            var1.imginfo[var4].d = var3.readUnsignedByte();
         }

         var1.frameEffAuto = new Frame[var3.readShort()];

         short var5;
         int var6;
         for(var4 = 0; var4 < var1.frameEffAuto.length; ++var4) {
            var1.frameEffAuto[var4] = new Frame();
            var5 = (short)var3.readByte();
            var1.frameEffAuto[var4].a = new short[var5];
            var1.frameEffAuto[var4].b = new short[var5];
            var1.frameEffAuto[var4].c = new byte[var5];

            for(var6 = 0; var6 < var5; ++var6) {
               var1.frameEffAuto[var4].a[var6] = var3.readShort();
               var1.frameEffAuto[var4].b[var6] = var3.readShort();
               var1.frameEffAuto[var4].c[var6] = var3.readByte();
            }
         }

         var5 = var3.readShort();
         var1.frameRunning = new short[var5];

         for(var6 = 0; var6 < var5; ++var6) {
            var1.frameRunning[var6] = var3.readShort();
         }

         return var1;
      } catch (Exception var7) {
         return null;
      }
   }

   public static void a(byte var0, byte[] var1) {
      MyImage var2;
      if ((var2 = (MyImage) imgEffAuto.get(String.valueOf(var0))) == null) {
         var2 = new MyImage();
         imgEffAuto.put(String.valueOf(var0), var2);
      }

      var2.img = Controller.a(var1);
      if (GameMidlet.e != 1) {
         mResources.a("effauto " + var0, var1);
      }

   }

   public static void c() {
      try {
         Enumeration var0 = imgEffAuto.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            MyImage var2 = (MyImage) imgEffAuto.get(var1);
            if (System.currentTimeMillis() - var2.timeUse > 60000L) {
               imgEffAuto.remove(var1);
            }
         }
      } catch (Exception var3) {
      }

   }

   public static void d() {
      try {
         Enumeration var0 = dataEffAuto.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            EffAtutoTemp var2 = (EffAtutoTemp) dataEffAuto.get(var1);
            if (System.currentTimeMillis() - var2.timeUse > 600000L) {
               dataEffAuto.remove(var1);
            }
         }
      } catch (Exception var3) {
      }

   }

   public static void e() {
      arrEffAtutoTemplate = null;
      imgEffAuto = null;
      dataEffAuto = null;
   }

   static {
      Main.main(56);
      a();
   }
}

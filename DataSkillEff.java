import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class DataSkillEff {
   public MyVector mst = new MyVector();
   public SmallImage[] smallImage;
   public byte[][] frameChar;
   public byte[] sequence;
   private byte Frame;
   private byte m;
   private boolean IsStop;
   public short e;
   private byte o;
   public byte[] f;
   public long g;
   private long p;
   public int h;
   public boolean i;
   private boolean q;
   public int j;
   public int k;

   public DataSkillEff() {
      new MyVector();
      this.frameChar = new byte[4][];
      new MyVector();
      this.e = 0;
      this.o = 0;
      this.f = new byte[4];
      new MyVector();
   }

   private void b() {
      try {
         EffectData var1;
         if ((var1 = (EffectData) GameData.listbyteData.get("" + this.e)) == null) {
            DataInputStream var2;
            if ((var2 = Res.readFile("/effdata/" + this.e)) != null) {
               byte[] var3 = new byte[(short)var2.available()];
               var2.read(var3, 0, var3.length);
               this.a(var3);
               return;
            }

            GameData.a(this.e);
            return;
         }

         System.currentTimeMillis();
         if (var1 != null && var1.isLoad) {
            this.mst = var1.listFrame;
            this.smallImage = var1.smallImage;
            this.j = var1.fw;
            this.k = var1.fh;
            this.sequence = var1.sequence;
            this.f = var1.indexStartSkill;
            this.frameChar = var1.frameChar;
            this.IsStop = var1.isLoad;
            return;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         GameData.a(this.e);
      }

   }

   public final void a(byte[] var1) {
      if (var1 != null) {
         DataInputStream var2 = null;

         try {
            this.mst.removeAllElements();
            this.smallImage = null;
            short var3 = (short)(var2 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();
            this.smallImage = new SmallImage[var3];

            int var4;
            for(var4 = 0; var4 < var3; ++var4) {
               SmallImage[] var5 = this.smallImage;
               var2.readUnsignedByte();
               var5[var4] = new SmallImage(var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte());
            }

            var4 = 0;
            var3 = var2.readShort();

            int var23;
            for(int var6 = 0; var6 < var3; ++var6) {
               var23 = var2.readByte();
               MyVector var7 = new MyVector();
               MyVector var8 = new MyVector();

               for(int var9 = 0; var9 < var23; ++var9) {
                  PartFrame var10;
                  (var10 = new PartFrame(var2.readShort(), var2.readShort(), var2.readByte())).flip = var2.readByte();
                  var10.onTop = var2.readByte();
                  if (var10.onTop == 0) {
                     var7.addElement(var10);
                  } else {
                     var8.addElement(var10);
                  }

                  if (var4 < Res.abs(var10.dy)) {
                     var4 = Res.abs(var10.dy);
                  }
               }

               this.mst.addElement(new Class_ac(var7, var8));
            }

            this.j = this.smallImage[0].y;
            this.k = (short)var4;
            short var24 = (short)var2.readUnsignedByte();
            this.sequence = new byte[var24];

            for(var23 = 0; var23 < var24; ++var23) {
               this.sequence[var23] = (byte)var2.readShort();
            }

            var2.readByte();
            byte var25 = var2.readByte();
            this.frameChar[0] = new byte[var25];

            for(var23 = 0; var23 < var25; ++var23) {
               this.frameChar[0][var23] = var2.readByte();
            }

            var25 = var2.readByte();
            this.frameChar[1] = new byte[var25];

            for(var23 = 0; var23 < var25; ++var23) {
               this.frameChar[1][var23] = var2.readByte();
            }

            var25 = var2.readByte();
            this.frameChar[3] = new byte[var25];

            for(var23 = 0; var23 < var25; ++var23) {
               this.frameChar[3][var23] = var2.readByte();
            }

            this.IsStop = true;

            try {
               this.f[0] = (byte)(this.frameChar[0].length - 7);
               this.f[1] = (byte)(this.frameChar[1].length - 7);
               this.f[2] = (byte)(this.frameChar[3].length - 7);
               this.f[3] = (byte)(this.frameChar[3].length - 7);
            } catch (Exception var20) {
            }

            this.f[0] = var2.readByte();
            this.f[1] = var2.readByte();
            this.f[2] = var2.readByte();
            this.f[3] = this.f[2];
         } catch (Exception var21) {
         } finally {
            try {
               var2.close();
            } catch (Exception var19) {
            }

         }
      }

   }

   public DataSkillEff(short var1, long var2, int var4) {
      new MyVector();
      this.frameChar = new byte[4][];
      new MyVector();
      this.e = 0;
      this.o = 0;
      this.f = new byte[4];
      new MyVector();
      this.e = var1;
      this.g = var2;
      this.h = var4;
      this.b();
      if (var2 == -1L) {
         this.o = 3;
      } else if (var2 == 0L) {
         this.o = 1;
      } else {
         this.o = 2;
      }

   }

   private boolean c() {
      if (this.IsStop) {
         return true;
      } else {
         this.b();
         return false;
      }
   }

   public final void a(mGraphics var1, int var2, int var3) {
      try {
         if (!this.c()) {
            return;
         }

         if (this.q) {
            return;
         }

         if (this.Frame < this.mst.size()) {
            MyVector var4 = ((Class_ac)this.mst.elementAt(this.Frame)).a;

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               PartFrame var6 = (PartFrame)var4.elementAt(var5);
               SmallImage var7 = this.smallImage[var6.idSmallImg];
               ImageIcon var8;
               if ((var8 = GameData.getImgIcon(this.e)) != null && var8.img != null) {
                  short var9 = var6.dx;
                  int var10 = var7.y;
                  int var11 = var7.wh;
                  short var12 = var7.id;
                  short var13 = var7.x;
                  if (var12 > var8.img.getWidth()) {
                     var12 = 0;
                  }

                  if (var13 > var8.img.getHeight()) {
                     var13 = 0;
                  }

                  if (var12 + var10 > var8.img.getWidth()) {
                     var10 = var8.img.getWidth() - var12;
                  }

                  if (var13 + var11 > var8.img.getHeight()) {
                     var11 = var8.img.getHeight() - var13;
                  }

                  var1.a(var8.img, var12, var13, var10, var11, var6.flip == 1 ? 2 : 0, var2 + var9, var3 + var6.dy, 0);
               }
            }

            return;
         }
      } catch (Exception var14) {
         var14.printStackTrace();
         System.err.println("Err DataSkillEff  paintBottomEff:" + this.e);
      }

   }

   public final void b(mGraphics var1, int var2, int var3) {
      try {
         if (!this.c()) {
            return;
         }

         if (this.q) {
            return;
         }

         if (this.Frame < this.mst.size()) {
            MyVector var4 = ((Class_ac)this.mst.elementAt(this.Frame)).b;

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               PartFrame var6 = (PartFrame)var4.elementAt(var5);
               SmallImage var7 = this.smallImage[var6.idSmallImg];
               ImageIcon var8;
               if ((var8 = GameData.getImgIcon(this.e)) != null && var8.img != null) {
                  short var9 = var6.dx;
                  int var10 = var7.y;
                  int var11 = var7.wh;
                  short var12 = var7.id;
                  short var13 = var7.x;
                  if (var12 > var8.img.getWidth()) {
                     var12 = 0;
                  }

                  if (var13 > var8.img.getHeight()) {
                     var13 = 0;
                  }

                  if (var12 + var10 > var8.img.getWidth()) {
                     var10 = var8.img.getWidth() - var12;
                  }

                  if (var13 + var11 > var8.img.getHeight()) {
                     var11 = var8.img.getHeight() - var13;
                  }

                  var1.a(var8.img, var12, var13, var10, var11, var6.flip == 1 ? 2 : 0, var2 + var9, var3 + var6.dy, 0);
               }
            }

            return;
         }
      } catch (Exception var14) {
         var14.printStackTrace();
         System.err.println("Err DataSkillEff  paintBottomEff:" + this.e);
      }

   }

   private void a(boolean var1) {
      if (this.h > 0) {
         this.q = var1;
         if (this.q) {
            this.p = System.currentTimeMillis() + (long)this.h;
            return;
         }
      } else {
         this.q = false;
      }

   }

   public final void a() {
      if (this.mst.size() > 0) {
         try {
            if (!this.q) {
               switch (this.o) {
                  case 0:
                     ++this.m;
                     if (this.m > this.sequence.length) {
                        this.i = true;
                        this.m = 0;
                     }

                     this.Frame = this.sequence[this.m];
                     return;
                  case 1:
                     ++this.m;
                     if (this.m > this.sequence.length) {
                        this.m = 0;
                        this.i = true;
                     }

                     this.Frame = this.sequence[this.m];
                     return;
                  case 2:
                     ++this.m;
                     if (this.m == (byte)(this.sequence.length - 1) && this.g - System.currentTimeMillis() < 0L) {
                        this.i = true;
                     }

                     if (this.m > this.sequence.length) {
                        this.m = 0;
                        this.a(true);
                     }

                     this.Frame = this.sequence[this.m];
                     return;
                  case 3:
                     ++this.m;
                     if (this.m > this.sequence.length) {
                        this.m = 0;
                        this.a(true);
                     }

                     this.Frame = this.sequence[this.m];
                     return;
                  default:
                     return;
               }
            }

            if (this.p - System.currentTimeMillis() < 0L) {
               this.a(false);
               return;
            }
         } catch (Exception var2) {
         }
      }

   }
}

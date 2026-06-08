import java.util.Vector;

public final class MonsterDart extends Effect2 {
   private int angle;
   private int vx;
   private int vy;
   private short va = 256;
   private int x;
   private int y;
   private int z;
   private int dame;
   private int dameMp;
   private int typeAtt;
   private Char c;
   private BuNhin b;
   private boolean isBoss;
   private int idBoss;
   private int countangle = 1;
   private static int level;
   private static Vector vDomsang;
   private static int regMirro;
   private int frame = 0;
   private int index;
   private static byte[] FRAME;
   private static int[] TRANSFORM;
   private static int[] ARROWINDEX;

   public static void a() {
      vDomsang = new Vector();
      regMirro = 0;
      FRAME = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
      TRANSFORM = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
      ARROWINDEX = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
   }

   private void setAngle(int var1) {
      this.angle = var1;
      this.vx = this.va * Res.cos(var1) >> 10;
      this.vy = this.va * Res.sin(var1) >> 10;
   }

   public static void addMonsterDart(int var0, int var1, boolean var2, short var3, int var4, int var5, int var6, Char var7) {
      level = var3;
      Effect2.vEffect2.addElement(new MonsterDart(var0, var1, var2, var4, var5, var6, var7));
   }

   public static void addMonsterDart(int var0, int var1, BuNhin var2) {
      Effect2.vEffect2.addElement(new MonsterDart(var0, var1, var2));
   }

   private MonsterDart(int var1, int var2, boolean var3, int var4, int var5, int var6, Char var7) {
      this.typeAtt = 0;
      this.x = var1;
      this.y = var2;
      this.isBoss = var3;
      this.idBoss = var4;
      this.dame = var5;
      this.dameMp = var6;
      this.c = var7;
      if (var3) {
         this.setAngle(this.countangle * 90);
         ++this.countangle;
         if (this.countangle > 3) {
            this.countangle = 1;
            return;
         }
      } else {
         if (var1 > var7.cx) {
            this.setAngle(240);
            return;
         }

         this.setAngle(300);
      }

   }

   private MonsterDart(int var1, int var2, BuNhin var3) {
      this.typeAtt = 1;
      this.x = var1;
      this.y = var2;
      this.b = var3;
      if (var1 > var3.x) {
         this.setAngle(240);
      } else {
         this.setAngle(300);
      }

      this.va = 256;
      this.angle = 180;
      this.vx = this.va * Res.cos(this.angle) >> 10;
      this.vy = this.va * Res.sin(this.angle) >> 10;
   }

   public final void update() {
      Domsang var1;
      if (level > 100) {
         var1 = new Domsang(this.x, this.y, 2);
         vDomsang.addElement(var1);
      } else if (level > 50 && level <= 100) {
         var1 = new Domsang(this.x, this.y, 5);
         vDomsang.addElement(var1);
      } else if (level > 30 && level <= 50) {
         var1 = new Domsang(this.x, this.y, 4);
         vDomsang.addElement(var1);
      } else if (level > 0 && level <= 30) {
         var1 = new Domsang(this.x, this.y, 3);
         vDomsang.addElement(var1);
      }

      int var2;
      int var3;
      int var4;
      if (this.c != null) {
         var4 = this.c.cx - this.x;
         var2 = this.c.cy - (this.c.ch >> 1) - this.y;
         ++this.z;
         if ((Res.abs(var4) >= 16 || Res.abs(var2) >= 16) && this.z <= 60) {
            if (Math.abs((var3 = Res.tan(var4, var2)) - this.angle) < 90 || var4 * var4 + var2 * var2 > 4096) {
               if (Math.abs(var3 - this.angle) < 15) {
                  this.angle = var3;
               } else if ((var3 - this.angle < 0 || var3 - this.angle >= 180) && var3 - this.angle >= -180) {
                  this.angle = Res.fixangle(this.angle - 15);
               } else {
                  this.angle = Res.fixangle(this.angle + 15);
               }
            }

            if (this.va < 8192) {
               this.va = (short)(this.va + 1024);
            }

            this.vx = this.va * Res.cos(this.angle) >> 10;
            this.vy = this.va * Res.sin(this.angle) >> 10;
            var4 = var4 + this.vx >> 10;
            this.x += var4;
            var2 = var2 + this.vy >> 10;
            this.y += var2;
            var4 = Res.tan(var4, -var2);
            var2 = 0;

            while(true) {
               if (var2 >= ARROWINDEX.length - 1) {
                  var4 = 0;
                  break;
               }

               if (var4 >= ARROWINDEX[var2] && var4 <= ARROWINDEX[var2 + 1]) {
                  var4 = var2 >= 16 ? 0 : var2;
                  break;
               }

               ++var2;
            }

            this.index = var4;
            this.frame = FRAME[this.index];
            regMirro = TRANSFORM[this.index];
         }
      }

      var3 = 0;
      var4 = 0;
      if (this.typeAtt != 0) {
         if (this.typeAtt == 1) {
            var3 = this.b.x - this.x;
            var4 = this.b.y - 10 - this.y;
            ++this.z;
            if (Res.abs(var3) < 16 && Res.abs(var4) < 16 || this.z > 60) {
               this.b.isInjure = true;
               Effect2.vEffect2.removeElement(this);
               return;
            }
         }
      } else {
         var3 = this.c.cx - this.x;
         var4 = this.c.cy - 10 - this.y;
         ++this.z;
         if (this.c.statusMe == 5 || this.c.statusMe == 14) {
            this.x += (this.c.cx - this.x) / 2;
            this.y += (this.c.cy - this.y) / 2;
         }

         if (Res.abs(var3) < 16 && Res.abs(var4) < 16 || this.z > 60) {
            this.c.doInjure(this.dame, this.dameMp, this.isBoss, this.idBoss);
            Effect2.vEffect2.removeElement(this);
            return;
         }
      }

      if (Math.abs((var2 = Res.tan(var3, var4)) - this.angle) < 90 || var3 * var3 + var4 * var4 > 4096) {
         if (Math.abs(var2 - this.angle) < 15) {
            this.angle = var2;
         } else if ((var2 - this.angle < 0 || var2 - this.angle >= 180) && var2 - this.angle >= -180) {
            this.angle = Res.fixangle(this.angle - 15);
         } else {
            this.angle = Res.fixangle(this.angle + 15);
         }
      }

      var3 = var3 + this.vx >> 10;
      this.x += var3;
      var3 = var4 + this.vy >> 10;
      this.y += var3;

      for(var3 = 0; var3 < vDomsang.size(); ++var3) {
         (var1 = (Domsang) vDomsang.elementAt(var3)).a();
         if (var1.frame > 3) {
            vDomsang.removeElementAt(var3);
         }
      }

   }

   public final void paint(mGraphics var1) {
      int var2;
      if (this.isBoss) {
         var2 = GameCanvas.u % 7;
         if (this.idBoss == 114) {
            if (var2 < 4) {
               SmallImage.drawSmallImageNew(var1, 1299, this.x, this.y, 0, 3);
               return;
            }

            SmallImage.drawSmallImageNew(var1, 1307, this.x, this.y, 0, 3);
            return;
         }

         if (this.idBoss == 115) {
            if ((var2 = GameCanvas.u % 20) < 4) {
               SmallImage.drawSmallImageNew(var1, 1379, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 8) {
               SmallImage.drawSmallImageNew(var1, 1380, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 12) {
               SmallImage.drawSmallImageNew(var1, 1379, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 16) {
               SmallImage.drawSmallImageNew(var1, 1382, this.x, this.y, 0, 3);
               return;
            }
         } else if (this.idBoss == 116) {
            if ((var2 = GameCanvas.u % 17) < 4) {
               SmallImage.drawSmallImageNew(var1, 1399, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 8) {
               SmallImage.drawSmallImageNew(var1, 1400, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 12) {
               SmallImage.drawSmallImageNew(var1, 1401, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 16) {
               SmallImage.drawSmallImageNew(var1, 1402, this.x, this.y, 0, 3);
               return;
            }
         } else if (this.idBoss == 139) {
            if ((var2 = GameCanvas.u % 20) < 4) {
               SmallImage.drawSmallImageNew(var1, 1459, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 8) {
               SmallImage.drawSmallImageNew(var1, 1380, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 12) {
               SmallImage.drawSmallImageNew(var1, 1461, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 16) {
               SmallImage.drawSmallImageNew(var1, 1382, this.x, this.y, 0, 3);
               return;
            }
         } else if (this.idBoss == 144 || this.idBoss == 163) {
            if ((var2 = GameCanvas.u % 20) < 4) {
               SmallImage.drawSmallImageNew(var1, 1459, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 8) {
               SmallImage.drawSmallImageNew(var1, 1380, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 12) {
               SmallImage.drawSmallImageNew(var1, 1461, this.x, this.y, 0, 3);
               return;
            }

            if (var2 < 16) {
               SmallImage.drawSmallImageNew(var1, 1382, this.x, this.y, 0, 3);
               return;
            }
         }
      } else {
         if (level > 100) {
            var1.a(GameScr.ei, 0, this.frame * 23, 31, 23, regMirro, this.x, this.y, 0);
         } else if (level > 50 && level <= 100) {
            var1.a(GameScr.ei, 0, 0, 14, 14, regMirro, this.x, this.y, 0);
         } else if (level > 30 && level <= 50) {
            var1.a(GameScr.ei, 0, 0, 8, 8, regMirro, this.x, this.y, 0);
         } else if (level > 0 && level <= 30) {
            var1.a(GameScr.ei, 0, 0, 8, 8, regMirro, this.x, this.y, 0);
         }

         for(var2 = 0; var2 < vDomsang.size(); ++var2) {
            Domsang var3;
            if ((var3 = (Domsang) vDomsang.elementAt(var2)) != null) {
               var3.a(var1);
            }
         }
      }

   }

   public static void c() {
      level = 0;
      vDomsang = null;
      regMirro = 0;
      FRAME = null;
      TRANSFORM = null;
      ARROWINDEX = null;
   }

   static {
      Main.main(53);
      a();
   }
}

import javax.microedition.lcdui.Image;

public final class Mob extends MainObject {
   public static MobTemplate[] arrMobTemplate;
   public int hp;
   public int maxHp;
   public int x;
   public int y;
   private int frame;
   public int dir = 1;
   private int dirV = 1;
   public int status;
   private int p1;
   private int p2;
   private int p3;
   public int xFirst;
   public int yFirst;
   public int vy;
   public int exp;
   private int level;
   public short mobId;
   public boolean isDisable;
   public boolean isDontMove;
   public boolean isFire;
   public boolean isIce;
   public boolean isWind;
   private MyVector vMobMove = new MyVector();
   public int templateId;
   private Char cFocus;
   private BuNhin bFocus;
   public int s;
   public int t;
   public int sys;
   private int am;
   public short levelBoss;
   public short w;
   public boolean isBoss;
   private long an = 0L;
   private int ao = 0;
   public static Char interestChar;
   public static MyVector vEggMonter;
   private static EggMonters egg;
   private static long timewait;
   private boolean removeWhenDie;
   public boolean aa = true;
   private long as;
   public Char ab;
   public boolean ac = false;
   private Mob at;
   private Char au;
   private short av;
   private byte aw;
   private byte ax;
   private byte ay = -1;
   private static byte[][] az;
   private static byte[][] ba;
   private static byte[][] bb;

   public static void a() {
      vEggMonter = new MyVector();
      az = new byte[][]{{3, 4, 5, 6}, new byte[1], {2, 2, 2, 2, 3, 3, 3, 3}, {0, 1}, {0, 1}, {3, 4, 5}, new byte[1], {3, 3, 4, 4, 5, 5}, new byte[1], {3, 4, 5}, {0, 1, 2, 3, 4}, {3, 4, 5}, {4, 5, 6}, new byte[1], {0, 1}, {0, 1}, {3, 3, 4, 4, 5, 5}, {0, 1, 2}, {0, 1, 2}, {5, 6, 7, 8}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {3, 4, 5, 6}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, new byte[1], new byte[1], new byte[1], new byte[1], {0, 1, 2}, new byte[1], new byte[1], {0, 0, 1, 1, 2, 2}, {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 1}, {0, 1}};
      ba = new byte[][]{{0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, new byte[1]};
      bb = new byte[][]{{5, 4, 3, 2, 1}, new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], {5, 4, 3, 2, 1}, {5, 4, 3, 2, 1}, {5, 4, 3, 2, 1}, new byte[0], {5, 4, 3, 2, 1}, new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, new byte[1]};
   }

   public Mob(short var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, int var7, int var8, int var9, int var10, int var11, short var12, short var13, byte var14, byte var15, boolean var16, boolean var17) {
      this.isDisable = var2;
      this.isDontMove = var3;
      this.isFire = var4;
      this.isIce = var5;
      this.isWind = var6;
      this.sys = var8;
      this.mobId = var1;
      this.templateId = var7;
      this.hp = var9;
      this.level = (short)var10;
      this.xFirst = this.x = var12;
      this.yFirst = this.y = var13;
      if (var7 != 168 && var7 != 179 && var7 != 175 && var7 != 177 && var7 != 202) {
         this.status = var14;
      } else {
         this.status = 8;
      }

      this.maxHp = var11;
      this.levelBoss = (short)var15;
      this.isBoss = var16;
      if (var7 == 202) {
         egg = new EggMonters(this.xFirst, this.yFirst - 100);
         vEggMonter.addElement(egg);
         EggMonters.ownerEgg = this;
      }

      if (arrMobTemplate[var7].imgs == null) {
         arrMobTemplate[var7].imgs = new Image[0];
         Service.gI().requestModTemplate(var7);
      }

      timewait = (long) Res.random(2000, 3500);
      this.removeWhenDie = var17;
   }

   public final void update() {
      if (arrMobTemplate[this.templateId] != null && arrMobTemplate[this.templateId].imgs != null && (this.isBoss || this.frame < arrMobTemplate[this.templateId].imgs.length && arrMobTemplate[this.templateId].imgs[this.frame] != null) && this.status != 0) {
         if (this.cFocus == null && (this.templateId == 168 || this.templateId == 179 || this.templateId == 175)) {
            this.status = 8;
         }

         if (this.vMobMove != null || arrMobTemplate[this.templateId].rangeMove == 0) {
            if (this.status != 3 && this.aa) {
               if (this.cFocus != null) {
                  this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                  this.cFocus = null;
               }

               this.aa = false;
            }

            if (this.hp <= 0 && this.mobId != -1) {
               this.status = 1;
            }

            int var1;
            int var2;
            Mob var3;
            label961:
            switch (this.status) {
               case 1:
                  this.isDisable = false;
                  this.isDontMove = false;
                  this.isFire = false;
                  this.isIce = false;
                  this.isWind = false;
                  if (this.templateId != 98 && this.templateId != 99) {
                     ++this.p1;
                     this.y += this.p1;
                     if (interestChar != null) {
                        if (interestChar.myskill != null) {
                           if (interestChar.myskill.template.id > 72) {
                              if (GameCanvas.u % 9 == 0) {
                                 if (this.p2 > 1) {
                                    this.p2 += 5;
                                 } else if (this.p2 < -1) {
                                    this.p2 -= 5;
                                 }
                              }
                           } else if (GameCanvas.u % 2 == 0) {
                              if (this.p2 > 1) {
                                 --this.p2;
                              } else if (this.p2 < -1) {
                                 ++this.p2;
                              }
                           }
                        }
                     } else if (Char.getMyChar() != null && Char.getMyChar().myskill != null) {
                        if (Char.getMyChar().myskill.template.id > 72) {
                           if (GameCanvas.u % 9 == 0) {
                              if (this.p2 > 1) {
                                 this.p2 += 5;
                              } else if (this.p2 < -1) {
                                 this.p2 -= 5;
                              }
                           }
                        } else if (GameCanvas.u % 2 == 0) {
                           if (this.p2 > 1) {
                              --this.p2;
                           } else if (this.p2 < -1) {
                              ++this.p2;
                           }
                        }
                     }

                     this.x += this.p2;
                     if (this.templateId != 209 && this.templateId != 210) {
                        if (this.templateId != 168 && this.templateId != 176 && this.templateId != 177 && this.templateId != 179 && this.templateId != 180 && this.templateId != 191) {
                           if (this.templateId != 178 && this.templateId != 181 && this.templateId != 183 && this.templateId != 185 && this.templateId != 188 && this.templateId != 192 && this.templateId != 194) {
                              if (this.templateId != 173 && this.templateId != 184) {
                                 if (this.templateId == 175) {
                                    var3 = this;
                                    var1 = 8;
                                 } else if (this.templateId != 170 && this.templateId != 195 && this.templateId != 196 && this.templateId != 197 && this.templateId != 186 && this.templateId != 189 && this.templateId != 190) {
                                    if (this.templateId == 187) {
                                       var3 = this;
                                       var1 = 9;
                                    } else if (this.templateId == 193) {
                                       var3 = this;
                                       var1 = 5;
                                    } else if (this.templateId == 174) {
                                       var3 = this;
                                       var1 = 10;
                                    } else {
                                       var3 = this;
                                       var1 = this.isBoss ? 10 : 2;
                                    }
                                 } else {
                                    var3 = this;
                                    var1 = 3;
                                 }
                              } else {
                                 var3 = this;
                                 var1 = 6;
                              }
                           } else {
                              var3 = this;
                              var1 = 4;
                           }
                        } else {
                           var3 = this;
                           var1 = 7;
                        }
                     } else {
                        var3 = this;
                        var1 = 6;
                     }

                     var3.frame = var1;
                     if (this.y > GameScr.p * 24 || this.x < GameScr.cmdy * 24 || this.x > GameScr.cmvy * 24) {
                        this.p1 = 0;
                        this.p2 = 0;
                        this.x = this.y = 0;
                        this.hp = this.d().hp;
                        this.status = 0;
                        if (this.templateId < 168) {
                           this.frame = 0;
                        } else {
                           var2 = GameCanvas.u % ba[this.templateId - 168].length;
                           this.frame = ba[this.templateId - 168][var2];
                        }

                        this.level = 0;
                        return;
                     }

                     if (this.p3 == 0 && (TileMap.a(this.x, this.y) & 2) == 2) {
                        this.p1 = this.p1 > 4 ? -4 : -this.p1;
                        this.p3 = 16;
                     }

                     if (this.p3 > 0) {
                        --this.p3;
                     }
                  } else if (System.currentTimeMillis() - this.an > 1200L) {
                     this.status = 0;
                  }
                  break;
               case 2:
                  this.level = 0;
                  switch (arrMobTemplate[this.templateId].type) {
                     case 0:
                     case 1:
                     case 2:
                     case 3:
                        if (this.templateId != 209 && this.templateId != 210) {
                           if (this.templateId != 173 && this.templateId != 175 && this.templateId != 176 && this.templateId != 177 && this.templateId != 179 && this.templateId != 180 && this.templateId != 181 && this.templateId != 183 && this.templateId != 184 && this.templateId != 185) {
                              if (this.templateId != 168 && this.templateId != 179) {
                                 if (this.templateId == 174) {
                                    this.frame = 4;
                                 } else {
                                    this.frame = 0;
                                 }
                              } else {
                                 this.frame = 6;
                              }
                           } else {
                              this.frame = 1;
                           }
                        } else {
                           this.frame = 1;
                        }

                        ++this.p1;
                        if (this.p1 > 10 + this.mobId % 10 && System.currentTimeMillis() - (this.as + timewait) >= 0L) {
                           this.status = 5;
                        }

                        if (this.isBoss) {
                           this.frame = GameCanvas.u % 101 > 1 ? 0 : 1;
                        }
                        break label961;
                     case 4:
                     case 5:
                        if (!this.isBoss) {
                           if (this.templateId < 168) {
                              this.frame = GameCanvas.u % 4 > 1 ? 0 : 1;
                           } else {
                              this.frame = this.c(GameCanvas.u);
                           }
                        } else {
                           this.frame = arrMobTemplate[this.templateId].frameBossMove[this.ao];
                        }

                        ++this.p1;
                        if (this.p1 > this.mobId % 3) {
                           this.status = 5;
                        }
                     default:
                        break label961;
                  }
               case 3:
                  if (this.at == null && this.au == null) {
                     int var4;
                     if (this.av < 0) {
                        if (this.templateId != 209 && this.templateId != 210) {
                           if (this.templateId != 176 && this.templateId != 177 && this.templateId != 179) {
                              if (this.templateId == 175) {
                                 var3 = this;
                                 var1 = 7;
                              } else if (this.templateId != 180 && this.templateId != 181 && this.templateId != 183 && this.templateId != 184 && this.templateId != 173 && this.templateId != 188 && this.templateId != 192 && this.templateId != 194 && this.templateId != 202) {
                                 if (this.templateId == 193) {
                                    var3 = this;
                                    var1 = 4;
                                 } else if (this.templateId != 187 && this.templateId != 168 && this.templateId != 175 && this.templateId != 176 && this.templateId != 179 && this.templateId != 174) {
                                    var3 = this;
                                    var1 = GameCanvas.u % 4 > 1 ? (arrMobTemplate[this.templateId].type == 5 ? 3 : 0) : 1;
                                 } else {
                                    var3 = this;
                                    var1 = this.d(GameCanvas.u);
                                 }
                              } else {
                                 var3 = this;
                                 var1 = 3;
                              }
                           } else {
                              var3 = this;
                              var1 = 6;
                           }
                        } else {
                           var3 = this;
                           var1 = 6;
                        }

                        var3.frame = var1;
                        if (this.p1 == 0) {
                           var4 = 0;
                           var2 = 0;
                           if (this.am == 0) {
                              var4 = this.cFocus.cx;
                              var2 = this.cFocus.cy;
                           } else if (this.am == 1) {
                              var4 = this.bFocus.x;
                              var2 = this.bFocus.y;
                           }

                           if (Res.abs(var4 - this.x) < 24 || Res.abs(var4 - this.x) < 5 || arrMobTemplate[this.templateId].type == 0) {
                              if (this.templateId != 168 && this.templateId != 176 && this.templateId != 177 && this.templateId != 179) {
                                 if (this.templateId == 175) {
                                    var3 = this;
                                    var1 = 7;
                                 } else {
                                    label1061: {
                                       if (this.templateId != 180 && this.templateId != 181 && this.templateId != 183 && this.templateId != 184 && this.templateId != 173 && this.templateId != 202) {
                                          if (this.templateId == 187 || this.templateId == 168 || this.templateId == 179 || this.templateId == 174) {
                                             var3 = this;
                                             var1 = this.d(GameCanvas.u);
                                             break label1061;
                                          }

                                          var3 = this;
                                          if (arrMobTemplate[this.templateId].imgs.length == 3) {
                                             var1 = 0;
                                             break label1061;
                                          }
                                       } else {
                                          var3 = this;
                                       }

                                       var1 = 3;
                                    }
                                 }
                              } else {
                                 var3 = this;
                                 var1 = 6;
                              }

                              var3.frame = var1;
                           }

                           if (this.isBoss && (Res.abs(var4 - this.x) < 48 || Res.abs(var4 - this.x) < 10 || arrMobTemplate[this.templateId].type == 0)) {
                              this.frame = arrMobTemplate[this.templateId].imgs.length == 3 ? 0 : 3;
                           }

                           if (this.isBoss) {
                              ++this.ao;
                              if (Res.abs(var4 - this.x) >= 48 && Res.abs(var2 - this.y) >= 10) {
                                 if (this.ao >= arrMobTemplate[this.templateId].frameBossAttack[1].length) {
                                    this.ao = 0;
                                 }

                                 this.frame = arrMobTemplate[this.templateId].frameBossAttack[1][this.ao];
                              } else {
                                 if (this.ao >= arrMobTemplate[this.templateId].frameBossAttack[0].length) {
                                    this.ao = 0;
                                 }

                                 this.frame = arrMobTemplate[this.templateId].frameBossAttack[0][this.ao];
                              }
                           }

                           if (this.frame == 3 || this.frame == 6 || this.frame == 7) {
                              this.p1 = 1;
                           }

                           if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && this.isIce && this.isWind) {
                              this.x += (var4 - this.x) / 3;
                           }

                           if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                              this.p1 = 1;
                           }

                           if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                              this.p1 = 1;
                           }

                           if ((arrMobTemplate[this.templateId].type == 4 || arrMobTemplate[this.templateId].type == 5) && !this.isDontMove) {
                              this.y += (var2 - this.y) / 20;
                           }

                           ++this.p2;
                           if (this.isBoss && Res.abs(var4 - this.x) < 48 && Res.abs(var2 - this.y) < 15 || Res.abs(var4 - this.x) < 12 && Res.abs(var2 - this.y) < 12 || this.p2 > 12 || this.p1 == 1 || arrMobTemplate != null && arrMobTemplate[this.templateId].frameBossAttack != null && this.ao == arrMobTemplate[this.templateId].frameBossAttack[0].length - 2 && (this.d().mobTemplateId == 166 || this.d().mobTemplateId == 167)) {
                              label1062: {
                                 this.p1 = 1;
                                 if (this.am == 0) {
                                    if (this.isBoss && Res.abs(var4 - this.x) < 48 && Res.abs(var2 - this.y) < 15) {
                                       this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                       this.aa = false;
                                       if (this.d().mobTemplateId == 210) {
                                          if (this.cFocus.cx > this.x) {
                                             ServerEffect.addServerEffect(142, this.x, this.y, 1);
                                          } else {
                                             ServerEffect.addServerEffect(142, this.x, this.y, 1, (byte)-1);
                                          }
                                          break label1062;
                                       }

                                       if (this.d().mobTemplateId == 209) {
                                          if (this.cFocus.cx > this.x) {
                                             ServerEffect.addServerEffect(108, this.x, this.y, 1);
                                          } else {
                                             ServerEffect.addServerEffect(108, this.x, this.y, 1, (byte)-1);
                                          }
                                          break label1062;
                                       }

                                       if (this.d().mobTemplateId == 114) {
                                          ServerEffect.addServerEffect(79, this.cFocus, 3);
                                          break label1062;
                                       }

                                       if (this.d().mobTemplateId == 115) {
                                          if (this.cFocus == Char.getMyChar()) {
                                             GameScr.ep = 1;
                                          }

                                          GameScr.eq = 0;
                                          ServerEffect.addServerEffect(81, this.cFocus.cx, this.yFirst + TileMap.i, 2);
                                          ServerEffect.addServerEffect(81, this.cFocus.cx - 40, this.yFirst + TileMap.i, 2);
                                          ServerEffect.addServerEffect(81, this.cFocus.cx + 40, this.yFirst + TileMap.i, 2);
                                          break label1062;
                                       }

                                       if (this.d().mobTemplateId == 116) {
                                          if (this.cFocus == Char.getMyChar()) {
                                             GameScr.ep = 1;
                                             GameScr.eq = 0;
                                          }

                                          if (this.cFocus.cx > this.x) {
                                             ServerEffect.addServerEffect(86, this.x, this.y - this.exp / 2 + 5, 1);
                                          } else {
                                             ServerEffect.addServerEffect(88, this.x, this.y - this.exp / 2 + 5, 1);
                                          }

                                          ServerEffect.addServerEffect(87, this.cFocus.cx, this.cFocus.cy - this.cFocus.ch / 2, 2);
                                          ServerEffect.addServerEffect(87, this.cFocus.cx - 40, this.cFocus.cy - this.cFocus.ch / 2, 2);
                                          ServerEffect.addServerEffect(87, this.cFocus.cx + 40, this.cFocus.cy - this.cFocus.ch / 2, 2);
                                          break label1062;
                                       }

                                       if (this.d().mobTemplateId == 138) {
                                          if (this.cFocus.cx > this.x) {
                                             ServerEffect.addServerEffect(89, this.x + this.vy / 2, this.y - this.exp / 2 - 5, 1);
                                          } else {
                                             ServerEffect.addServerEffect(89, this.x - this.vy / 2, this.y - this.exp / 2 - 5, 1, (byte)-1);
                                          }

                                          ServerEffect.addServerEffect(90, this.cFocus, 2);
                                          break label1062;
                                       }

                                       if (this.d().mobTemplateId == 139) {
                                          if (this.cFocus == Char.getMyChar()) {
                                             GameScr.ep = 1;
                                             GameScr.eq = 0;
                                          }

                                          ServerEffect.addServerEffect(91, this.cFocus, 2);
                                          break label1062;
                                       }

                                       if (this.d().mobTemplateId != 140 && this.d().mobTemplateId != 161) {
                                          if (this.d().mobTemplateId != 141 && this.d().mobTemplateId != 162) {
                                             if (this.d().mobTemplateId != 144 && this.d().mobTemplateId != 163) {
                                                if (this.d().mobTemplateId == 160) {
                                                   if (this.cFocus.cx > this.x) {
                                                      ServerEffect.addServerEffect(123, this.x + this.vy / 2, this.y - 5, 1);
                                                   } else {
                                                      ServerEffect.addServerEffect(123, this.x - this.vy / 2, this.y - 5, 1, (byte)-1);
                                                   }

                                                   ServerEffect.addServerEffect(91, this.cFocus, 1);
                                                   break label1062;
                                                }

                                                if (this.d().mobTemplateId != 164 && this.d().mobTemplateId != 165) {
                                                   if (this.d().mobTemplateId == 167) {
                                                      if (this.cFocus.cx > this.x) {
                                                         ServerEffect.addServerEffect(125, this.x + this.vy / 2, this.y, 1);
                                                      } else {
                                                         ServerEffect.addServerEffect(125, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                      }
                                                   } else if (this.d().mobTemplateId == 166) {
                                                      if (this.cFocus.cx > this.x) {
                                                         ServerEffect.addServerEffect(108, this.x + this.vy / 2, this.y, 1);
                                                      } else {
                                                         ServerEffect.addServerEffect(108, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                      }
                                                   } else if (this.d().mobTemplateId == 198) {
                                                      if (this.cFocus.cx > this.x) {
                                                         ServerEffect.addServerEffect(143, this.x + this.vy / 2, this.y, 1);
                                                      } else {
                                                         ServerEffect.addServerEffect(143, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                      }
                                                   } else if (this.d().mobTemplateId == 199) {
                                                      if (this.cFocus.cx > this.x) {
                                                         ServerEffect.addServerEffect(144, this.x + this.vy / 2, this.y, 1);
                                                      } else {
                                                         ServerEffect.addServerEffect(144, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                      }
                                                   } else if (this.d().mobTemplateId == 200) {
                                                      if (this.cFocus.cx > this.x) {
                                                         ServerEffect.addServerEffect(142, this.x + this.vy / 2, this.y, 1);
                                                      } else {
                                                         ServerEffect.addServerEffect(142, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                      }
                                                   } else if (this.d().mobTemplateId == 201) {
                                                      if (this.cFocus.cx > this.x) {
                                                         ServerEffect.addServerEffect(144, this.x + this.vy / 2, this.y, 1);
                                                      } else {
                                                         ServerEffect.addServerEffect(144, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                      }
                                                   } else if (this.d().mobTemplateId == 203) {
                                                      if (this.cFocus.cx > this.x) {
                                                         ServerEffect.addServerEffect(159, this.x + this.vy / 2, this.y, 1);
                                                         ServerEffect.addServerEffect(156, this.cFocus.cx, this.cFocus.cy, 1);
                                                      } else {
                                                         ServerEffect.addServerEffect(159, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                         ServerEffect.addServerEffect(156, this.cFocus.cx, this.cFocus.cy, -1);
                                                      }
                                                   } else if (this.d().mobTemplateId == 204) {
                                                      if (this.cFocus.cx > this.x) {
                                                         ServerEffect.addServerEffect(159, this.x + this.vy / 2, this.y, 1);
                                                         ServerEffect.addServerEffect(173, this.cFocus.cx, this.cFocus.cy, 1);
                                                      } else {
                                                         ServerEffect.addServerEffect(159, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                         ServerEffect.addServerEffect(173, this.cFocus.cx, this.cFocus.cy, -1);
                                                      }
                                                   }
                                                   break label1062;
                                                }

                                                if (this.cFocus.cx > this.x) {
                                                   ServerEffect.addServerEffect(125, this.x + this.vy / 2, this.y, 1);
                                                } else {
                                                   ServerEffect.addServerEffect(125, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                                }

                                                ServerEffect.addServerEffect(90, this.cFocus, 1);
                                                break label1062;
                                             }

                                             if (this.cFocus == Char.getMyChar()) {
                                                GameScr.ep = 1;
                                                GameScr.eq = 0;
                                             }

                                             ServerEffect.addServerEffect(112, this.cFocus, 2);
                                             ServerEffect.addServerEffect(109, this.cFocus.cx - 40, this.cFocus.cy - 40, 1);
                                             ServerEffect.addServerEffect(109, this.cFocus.cx + 40, this.cFocus.cy - 40, 1);
                                             ServerEffect.addServerEffect(109, this.cFocus.cx - 20, this.cFocus.cy, 2);
                                             ServerEffect.addServerEffect(109, this.cFocus.cx + 20, this.cFocus.cy, 2);
                                             break label1062;
                                          }

                                          if (this.cFocus.cx > this.x) {
                                             ServerEffect.addServerEffect(108, this.x + this.vy / 2, this.y, 1);
                                          } else {
                                             ServerEffect.addServerEffect(108, this.x - this.vy / 2, this.y, 1, (byte)-1);
                                          }

                                          ServerEffect.addServerEffect(122, this.x, this.y, 1, (byte)this.dir);
                                          ServerEffect.addServerEffect(91, this.cFocus, 1);
                                          break label1062;
                                       }

                                       if (this.cFocus == Char.getMyChar()) {
                                          GameScr.ep = 1;
                                          GameScr.eq = 0;
                                       }

                                       ServerEffect.addServerEffect(112, this.cFocus, 2);
                                       ServerEffect.addServerEffect(109, this.cFocus.cx - 40, this.cFocus.cy - 40, 1);
                                       ServerEffect.addServerEffect(109, this.cFocus.cx + 40, this.cFocus.cy - 40, 1);
                                       ServerEffect.addServerEffect(109, this.cFocus.cx - 20, this.cFocus.cy, 2);
                                       ServerEffect.addServerEffect(109, this.cFocus.cx + 20, this.cFocus.cy, 2);
                                       break label1062;
                                    }

                                    if (Res.abs(var4 - this.x) >= 24 || Res.abs(var2 - this.y) >= 15) {
                                       if (this.isBoss) {
                                          if (this.d().mobTemplateId == 210) {
                                             if (this.cFocus.cx > this.x) {
                                                ServerEffect.addServerEffect(178, this.cFocus.cx, this.cFocus.cy, 1);
                                             } else {
                                                ServerEffect.addServerEffect(178, this.cFocus.cx, this.cFocus.cy, 1, (byte)-1);
                                             }
                                          } else if (this.d().mobTemplateId == 209) {
                                             if (this.cFocus.cx > this.x) {
                                                ServerEffect.addServerEffect(179, this.cFocus.cx, this.cFocus.cy, 1);
                                             } else {
                                                ServerEffect.addServerEffect(179, this.cFocus.cx, this.cFocus.cy, 1, (byte)-1);
                                             }
                                          } else if (this.d().mobTemplateId != 114 && this.d().mobTemplateId != 115) {
                                             if (this.d().mobTemplateId == 116) {
                                                ServerEffect.addServerEffect(84, this.cFocus, 2);
                                                this.aa = false;
                                                this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                             } else if (this.d().mobTemplateId == 138) {
                                                if (this.cFocus == Char.getMyChar()) {
                                                   GameScr.ep = 1;
                                                   GameScr.eq = 0;
                                                }

                                                ServerEffect.addServerEffect(83, this.cFocus, 2);
                                                this.aa = false;
                                                this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                             } else if (this.d().mobTemplateId == 139) {
                                                MonsterDart.addMonsterDart(this.x + (this.dir - 1) * 30, this.y - 30, this.isBoss, this.levelBoss, this.d().mobTemplateId, this.s, this.t, this.cFocus);
                                             } else if (this.d().mobTemplateId != 140 && this.d().mobTemplateId != 161) {
                                                if (this.d().mobTemplateId != 141 && this.d().mobTemplateId != 162) {
                                                   if (this.d().mobTemplateId != 144 && this.d().mobTemplateId != 163) {
                                                      if (this.d().mobTemplateId == 160) {
                                                         ServerEffect.addServerEffect(124, this.cFocus, 2);
                                                         this.aa = false;
                                                         this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                      } else if (this.d().mobTemplateId != 164 && this.d().mobTemplateId != 165) {
                                                         if (this.d().mobTemplateId == 167) {
                                                            ServerEffect.addServerEffect(112, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(112, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(112, this.cFocus, 1);
                                                            this.aa = false;
                                                            this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                         } else if (this.d().mobTemplateId == 166) {
                                                            ServerEffect.addServerEffect(92, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(92, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(92, this.cFocus, 1);
                                                            this.aa = false;
                                                            this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                         } else if (this.d().mobTemplateId == 198) {
                                                            ServerEffect.addServerEffect(142, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(142, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(142, this.cFocus, 1);
                                                            this.aa = false;
                                                            this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                         } else if (this.d().mobTemplateId == 199) {
                                                            ServerEffect.addServerEffect(143, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(143, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(143, this.cFocus, 1);
                                                            this.aa = false;
                                                            this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                         } else if (this.d().mobTemplateId == 200) {
                                                            ServerEffect.addServerEffect(144, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(144, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(144, this.cFocus, 1);
                                                            this.aa = false;
                                                            this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                         } else if (this.d().mobTemplateId == 201) {
                                                            ServerEffect.addServerEffect(108, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(108, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(108, this.cFocus, 1);
                                                            this.aa = false;
                                                            this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                         } else if (this.d().mobTemplateId == 203) {
                                                            ServerEffect.addServerEffect(149, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(149, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(149, this.cFocus, 1);
                                                            ServerEffect.addServerEffect(156, this.cFocus, 1);
                                                            this.aa = false;
                                                            this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                         } else if (this.d().mobTemplateId == 204) {
                                                            ServerEffect.addServerEffect(153, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(153, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                            ServerEffect.addServerEffect(153, this.cFocus, 1);
                                                            ServerEffect.addServerEffect(173, this.cFocus, 1);
                                                            this.aa = false;
                                                            this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                         }
                                                      } else {
                                                         ServerEffect.addServerEffect(126, this.cFocus, 1);
                                                         this.aa = false;
                                                         this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                      }
                                                   } else {
                                                      MonsterDart.addMonsterDart(this.x + (this.dir - 1) * 15, this.y - 20, this.isBoss, this.levelBoss, this.d().mobTemplateId, this.s, this.t, this.cFocus);
                                                   }
                                                } else {
                                                   if (this.cFocus == Char.getMyChar()) {
                                                      GameScr.ep = 1;
                                                      GameScr.eq = 0;
                                                   }

                                                   ServerEffect.addServerEffect(121, this.cFocus, 1);
                                                   this.aa = false;
                                                   this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                                }
                                             } else {
                                                if (this.cFocus == Char.getMyChar()) {
                                                   GameScr.ep = 1;
                                                   GameScr.eq = 0;
                                                }

                                                ServerEffect.addServerEffect(110, this.cFocus, 2);
                                                ServerEffect.addServerEffect(104, this.cFocus.cx - 20, this.cFocus.cy, 2);
                                                ServerEffect.addServerEffect(104, this.cFocus.cx + 20, this.cFocus.cy, 2);
                                                this.aa = false;
                                                this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                             }
                                          } else {
                                             MonsterDart.addMonsterDart(this.x + (this.dir - 1) * 15, this.y - 20, this.isBoss, this.levelBoss, this.d().mobTemplateId, this.s, this.t, this.cFocus);
                                          }
                                       } else {
                                          MonsterDart.addMonsterDart(this.x - 5, this.y + this.dir * 10, this.isBoss, this.w, this.d().mobTemplateId, this.s, this.t, this.cFocus);
                                       }

                                       this.aa = false;
                                       break label1062;
                                    }

                                    this.cFocus.doInjure(this.s, this.t, this.isBoss, this.d().mobTemplateId);
                                 } else {
                                    if (this.am != 1) {
                                       break label1062;
                                    }

                                    if (Res.abs(var4 - this.x) < 24 && Res.abs(var2 - this.y) < 15) {
                                       this.bFocus.isInjure = true;
                                    } else if (this.isBoss) {
                                       MonsterDart.addMonsterDart(this.x - 5, this.y + this.dir * 10 - 20, this.bFocus);
                                    } else {
                                       MonsterDart.addMonsterDart(this.x - 5, this.y + this.dir * 10, this.bFocus);
                                    }
                                 }

                                 this.aa = false;
                              }
                           }

                           this.dir = this.x < var4 ? 1 : -1;
                        } else if (this.p1 == 1) {
                           if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && !this.isIce && !this.isWind) {
                              this.x += (this.xFirst - this.x) / 4;
                              this.y += (this.yFirst - this.y) / 4;
                           }

                           if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                              this.status = 2;
                              this.p1 = 0;
                              this.p2 = 0;
                           }
                        }
                     } else if (this.p1 == 0) {
                        var4 = this.cFocus.cx;
                        var2 = this.cFocus.cy;
                        this.am = this.aw;
                        this.dir = this.x >= var4 ? 0 : 1;
                        if (this.isBoss) {
                           ++this.ao;
                           if (this.ao >= arrMobTemplate[this.templateId].frameBossAttack[this.am].length) {
                              this.ao = 0;
                              this.status = 2;
                              this.at = null;
                              this.au = null;
                              this.p1 = 0;
                              this.p2 = 0;
                           }

                           if (this.ao == arrMobTemplate[this.templateId].frameBossAttack[this.am].length - 1) {
                              if (this.ax == 0) {
                                 ServerEffect.addServerEffect(this.av, var4, var2, 1, (byte)(this.dir == 0 ? -1 : 1));
                              } else if (this.ax == 1 && this.av >= 0) {
                                 EffectAuto.a(this.av, var4, var2, (byte)1, (short)-1, this.dir == 0 ? -1 : 1);
                              }
                           }

                           this.frame = arrMobTemplate[this.templateId].frameBossAttack[this.aw][this.ao];
                        } else {
                           ServerEffect.addServerEffect(this.av, var4, var2, 1, (byte)(this.dir == 0 ? -1 : 1));
                        }

                        if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && this.isIce && this.isWind) {
                           this.x += (var4 - this.x) / 3;
                        }

                        if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                           this.p1 = 1;
                        }

                        if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                           this.p1 = 1;
                        }
                     } else if (this.p1 == 1) {
                        if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && !this.isIce && !this.isWind) {
                           this.x += (this.xFirst - this.x) / 4;
                           this.y += (this.yFirst - this.y) / 4;
                        }

                        if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                           this.status = 2;
                           this.ao = 0;
                           this.p1 = 0;
                           this.p2 = 0;
                        }
                     }
                  } else {
                     this.m();
                  }
                  break;
               case 4:
                  this.level = 0;
                  this.frame = 0;
                  ++this.p1;
                  if (this.p1 > 40 + this.mobId % 5) {
                     this.y -= 2;
                     this.status = 5;
                     this.p1 = 0;
                  }
                  break;
               case 5:
                  try {
                     if (GameCanvas.u % 4 == 0 && this.isBoss) {
                        ++this.ao;
                        if (this.ao > arrMobTemplate[this.templateId].frameBossMove.length - 1) {
                           this.ao = 0;
                        }
                     }
                  } catch (Exception var5) {
                  }

                  this.level = 0;
                  this.k();
                  break;
               case 6:
                  this.level = 0;
                  ++this.p1;
                  this.y += this.p1;
                  if (this.y >= this.yFirst) {
                     this.y = this.yFirst;
                     this.p1 = 0;
                     this.status = 5;
                  }
                  break;
               case 7:
                  this.j();
                  break;
               case 8:
                  this.frame = 0;
                  break;
               case 9:
                  var2 = GameCanvas.u % bb[this.templateId - 168].length;
                  this.frame = bb[this.templateId - 168][var2];
                  if (this.frame == 1) {
                     this.status = 8;
                  }
            }

            this.l();
            if (this.removeWhenDie && this.hp <= 0) {
               GameScr.vMobAttack.removeElement(this);
               if (this.levelBoss > 0) {
                  Auto.b(this);
               }
            }

            this.a((byte)1, this.status);
         }
      }

   }

   public final void c() {
      if (this.hp > 0) {
         this.level = 4;
         this.status = 7;
      }

   }

   public final void a(Char var1) {
      label84: {
         this.aa = true;
         this.cFocus = var1;
         this.p1 = 0;
         this.p2 = 0;
         this.status = 3;
         if (this.templateId != 209 && this.templateId != 210) {
            label83: {
               if (this.templateId == 168 || this.templateId == 176 || this.templateId == 177 || this.templateId == 179) {
                  this.ao = 6;
                  break label84;
               }

               if (this.templateId != 169 && this.templateId != 171 && this.templateId != 172 && this.templateId != 182) {
                  if (this.templateId == 175) {
                     this.ao = 7;
                     break label84;
                  }

                  if (this.templateId != 181 && this.templateId != 185 && this.templateId != 188 && this.templateId != 194 && this.templateId != 192) {
                     if (this.templateId != 183 && this.templateId != 170 && this.templateId != 193) {
                        if (this.templateId != 187 && this.templateId != 168 && this.templateId != 175 && this.templateId != 176 && this.templateId != 179 && this.templateId != 174) {
                           break label83;
                        }

                        this.ao = this.d(GameCanvas.u);
                        break label84;
                     }

                     this.ao = 4;
                     break label84;
                  }

                  this.ao = 3;
                  break label84;
               }

               this.ao = 2;
               break label84;
            }
         }

         this.ao = 0;
      }

      this.am = 0;
   }

   public final void a(BuNhin var1) {
      this.bFocus = var1;
      this.p1 = 0;
      this.p2 = 0;
      this.status = 3;
      this.am = 1;
   }

   private void j() {
      this.frame = this.isBoss ? (this.d().mobTemplateId == 204 ? 9 : (this.d().mobTemplateId == 203 ? 9 : (this.d().mobTemplateId == 139 ? 4 : (this.d().mobTemplateId == 160 ? 12 : 10)))) : 2;
      if (this.d().mobTemplateId != 209 && this.d().mobTemplateId != 210) {
         if (this.d().mobTemplateId == 141) {
            this.frame = 13;
         } else if (this.d().mobTemplateId != 169 && this.d().mobTemplateId != 170 && this.d().mobTemplateId != 171 && this.d().mobTemplateId != 172 && this.d().mobTemplateId != 182) {
            if (this.d().mobTemplateId != 168 && this.d().mobTemplateId != 176 && this.d().mobTemplateId != 177 && this.d().mobTemplateId != 179 && this.d().mobTemplateId != 180) {
               if (this.d().mobTemplateId != 173 && this.d().mobTemplateId != 184) {
                  if (this.d().mobTemplateId != 181 && this.d().mobTemplateId != 178 && this.d().mobTemplateId != 185 && this.d().mobTemplateId != 202) {
                     if (this.d().mobTemplateId == 174) {
                        this.frame = 10;
                     } else if (this.d().mobTemplateId == 183) {
                        this.frame = 5;
                     } else if (this.d().mobTemplateId == 175) {
                        this.frame = 8;
                     }
                  } else {
                     this.frame = 4;
                  }
               } else {
                  this.frame = 6;
               }
            } else {
               this.frame = 7;
            }
         } else {
            this.frame = 3;
         }
      } else {
         this.frame = 3;
      }

      --this.level;
      if (this.level > 0) {
         if (arrMobTemplate[this.templateId].type != 0) {
            int var1 = -this.ab.cdir << 1;
            if (this.x > this.xFirst - arrMobTemplate[this.templateId].rangeMove && this.x < this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
               this.x -= var1;
               return;
            }
         }
      } else {
         if ((this.ab == null || !this.ac) && this.hp != 0) {
            this.status = 5;
            if (this.ab != null) {
               this.dir = -this.ab.cdir;
               if (Res.abs(this.x - this.ab.cx) < 24) {
                  this.status = 2;
               }
            }

            this.p1 = this.p2 = this.p3 = 0;
            this.level = 0;
         } else {
            this.status = 1;
            this.p2 = this.ab.cdir << 3;
            this.p1 = -5;
            this.p3 = 0;
         }

         this.ab = null;
      }

   }

   private void k() {
      try {
         if (NSOT_MOB.ai) {
            return;
         }

         if (this.ac) {
            this.status = 1;
            this.p2 = this.ab.cdir << 3;
            this.p1 = -5;
            this.p3 = 0;
         }

         if (!this.isIce) {
            if (!this.isDontMove && !this.isWind) {
               byte var1;
               switch (arrMobTemplate[this.templateId].type) {
                  case 0:
                     if (this.templateId == 176) {
                        this.status = 9;
                     }

                     this.frame = 0;
                     return;
                  case 1:
                  case 2:
                  case 3:
                     var1 = arrMobTemplate[this.templateId].speed;
                     if (arrMobTemplate[this.templateId].speed == 1) {
                        if (GameCanvas.u % 2 == 1) {
                           return;
                        }
                     } else if (var1 > 2) {
                        var1 = (byte)(var1 + this.mobId % 2);
                     } else if (GameCanvas.u % 2 == 1) {
                        --var1;
                     }

                     this.x += var1 * this.dir;
                     if (Res.random(0, arrMobTemplate[this.templateId].rangeMove) == arrMobTemplate[this.templateId].rangeMove / 3) {
                        this.status = 2;
                        this.as = System.currentTimeMillis();
                     }

                     if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = -1;
                        if (this.templateId == 168 || this.templateId == 177) {
                           this.status = 9;
                           this.p1 = 0;
                        }
                     } else if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = 1;
                        if (this.templateId == 168 || this.templateId == 177) {
                           this.status = 9;
                           this.p1 = 0;
                        }
                     }

                     if (!this.isBoss) {
                        if (this.templateId < 168) {
                           this.frame = GameCanvas.u % 4 > 1 ? 0 : 1;
                           return;
                        }

                        this.frame = this.c(GameCanvas.u);
                        return;
                     }

                     this.frame = arrMobTemplate[this.templateId].frameBossMove[this.ao];
                     return;
                  case 4:
                     var1 = (byte)(arrMobTemplate[this.templateId].speed + this.mobId % 2);
                     this.x += var1 * this.dir;
                     if (GameCanvas.u % 10 > 2 && this.templateId != 205 && this.templateId != 206 && this.templateId != 207 && this.templateId != 208) {
                        this.ay = -1;
                        this.y += var1 * this.dirV;
                     }

                     if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = -1;
                        if (this.templateId == 179 || this.templateId == 175) {
                           this.status = 9;
                        }

                        this.p1 = 0;
                     } else if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = 1;
                        if (this.templateId == 179 || this.templateId == 175) {
                           this.status = 9;
                        }

                        this.p1 = 0;
                     }

                     if (this.y > this.yFirst + 24) {
                        this.dirV = -1;
                     } else if (this.y < this.yFirst - (20 + GameCanvas.u % 10)) {
                        this.dirV = 1;
                     }

                     if (!this.isBoss) {
                        if (this.templateId < 168) {
                           this.frame = GameCanvas.u % 4 > 1 ? 0 : 1;
                           return;
                        }

                        this.frame = this.c(GameCanvas.u);
                        return;
                     }

                     this.frame = arrMobTemplate[this.templateId].frameBossMove[this.ao];
                     return;
                  case 5:
                     var1 = (byte)(arrMobTemplate[this.templateId].speed + this.mobId % 2);
                     this.x += var1 * this.dir;
                     var1 = (byte)(var1 + (GameCanvas.u + this.mobId) % 2);
                     if (GameCanvas.u % 10 > 2) {
                        this.y += var1 * this.dirV;
                     }

                     if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = -1;
                        if (this.templateId != 179 && this.templateId != 175) {
                           this.status = 2;
                        } else {
                           this.status = 9;
                        }

                        this.p1 = 0;
                     } else if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = 1;
                        if (this.templateId != 179 && this.templateId != 175) {
                           this.status = 2;
                        } else {
                           this.status = 9;
                        }

                        this.p1 = 0;
                     }

                     if (this.y > this.yFirst + 24) {
                        this.dirV = -1;
                     } else if (this.y < this.yFirst - (20 + GameCanvas.u % 10)) {
                        this.dirV = 1;
                     }

                     if (TileMap.a(this.x, this.y, 2)) {
                        if (GameCanvas.u % 10 > 5) {
                           this.y = TileMap.b(this.y);
                           this.status = 4;
                           this.p1 = 0;
                        }

                        this.dirV = -1;
                     }

                     if (!this.isBoss) {
                        if (this.templateId < 168) {
                           this.frame = GameCanvas.u % 4 > 1 ? 3 : 1;
                           return;
                        }

                        this.frame = this.c(GameCanvas.u);
                        return;
                     }

                     this.frame = arrMobTemplate[this.templateId].frameBossMove[this.ao];
                  default:
                     return;
               }
            }

            this.frame = 0;
            return;
         }
      } catch (Exception var2) {
      }

   }

   public final MobTemplate d() {
      return arrMobTemplate[this.templateId];
   }

   public final boolean e() {
      if (this.x < GameScr.gW23) {
         return false;
      } else if (this.x > GameScr.gW23 + GameScr.gW) {
         return false;
      } else if (this.y < GameScr.gH2) {
         return false;
      } else if (this.y > GameScr.gH2 + GameScr.gH + 30) {
         return false;
      } else if (arrMobTemplate[this.templateId] == null) {
         return false;
      } else {
         if (!this.isBoss) {
            if (this.frame >= arrMobTemplate[this.templateId].imgs.length) {
               return false;
            }

            if (arrMobTemplate[this.templateId].imgs[this.frame] == null) {
               return false;
            }

            if (this.templateId != 179 && this.templateId != 175 && this.templateId != 202) {
               if (this.templateId == 176 && (this.frame == 1 || this.frame == 0)) {
                  return false;
               }
            } else if (this.status == 8) {
               return false;
            }
         }

         return this.status != 0;
      }
   }

   public final void a(mGraphics var1) {
      if (this.e()) {
         int var2 = this.y;
         if (this.templateId == 205 || this.templateId == 206 || this.templateId == 207 || this.templateId == 208) {
            ++this.ay;
            if (this.ay > Char.locate.length - 1) {
               this.ay = 0;
            }
         }

         if (this.ay >= 0) {
            var2 += Char.locate[this.ay];
         }

         MobTemplate var3 = arrMobTemplate[this.templateId];
         if (!this.isBoss) {
            if (this.vy == 0) {
               this.vy = mGraphics.a(var3.imgs[0]);
            }

            if (this.exp == 0) {
               this.exp = mGraphics.b(var3.imgs[0]);
            }
         } else {
            this.vy = 40;
            this.exp = 40;
         }

         this.b(var1, this.x, var2, 0);

         int var4;
         byte var5;
         int var6;
         int var7;
         try {
            var4 = this.dir > 0 ? 0 : 2;
            if (this.templateId == 219) {
               var4 = 0;
            }

            if ((this.templateId == 98 || this.templateId == 99) && this.status == 1) {
               long var12;
               if ((var12 = System.currentTimeMillis()) - this.an < 400L) {
                  var1.a(var3.imgs[this.frame], 0, 0, mGraphics.a(var3.imgs[this.frame]), mGraphics.b(var3.imgs[this.frame]), var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
               } else if (var12 - this.an < 800L) {
                  var1.a(var3.imgs[this.frame], 0, 0, mGraphics.a(var3.imgs[this.frame]), 3 * mGraphics.b(var3.imgs[this.frame]) / 5, var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
               } else if (var12 - this.an < 1200L) {
                  var1.a(var3.imgs[this.frame], 0, 0, mGraphics.a(var3.imgs[this.frame]), mGraphics.b(var3.imgs[this.frame]) / 3, var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
               }

               if (GameCanvas.u % 8 < 2) {
                  SmallImage.drawSmallImageNew(var1, 457, this.x, var2, 0, StaticObj.BOTTOM_HCENTER);
               } else if (GameCanvas.u % 8 < 4) {
                  SmallImage.drawSmallImageNew(var1, 458, this.x, var2, 0, StaticObj.BOTTOM_HCENTER);
               } else if (GameCanvas.u % 8 < 6) {
                  SmallImage.drawSmallImageNew(var1, 459, this.x, var2, 0, StaticObj.BOTTOM_HCENTER);
               }
            } else if (this.isBoss) {
               if (this.d().frameBoss != null) {
                  Frame var11 = this.d().frameBoss[this.frame];

                  for(var6 = 0; var6 < var11.a.length; ++var6) {
                     MobTemplate var13 = this.d();
                     var5 = var11.c[var6];
                     ImageInfo var9 = var13.imginfo[var5];
                     if (this.dir > 0) {
                        var1.a(this.d().imgs[0], var9.a, var9.b, var9.c, var9.d, 0, this.x + var11.a[var6], var2 + var11.b[var6] - 1, 20);
                     } else {
                        var1.a(this.d().imgs[0], var9.a, var9.b, var9.c, var9.d, 2, this.x - var11.a[var6], var2 + var11.b[var6] - 1, 24);
                     }
                  }
               }
            } else {
               if (this.templateId == 168) {
                  var7 = this.status;
                  boolean var8 = true;
               }

               var1.a(var3.imgs[this.frame], 0, 0, mGraphics.a(var3.imgs[this.frame]), mGraphics.b(var3.imgs[this.frame]), var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
            }

            this.a(var1, this.x, var2, 0);
         } catch (Exception var11) {
            var11.printStackTrace();
         }

         var4 = var2;
         if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.equals(this) && this.status != 1) {
            int var14;
            if (this.isBoss) {
               var7 = this.maxHp;
               if (this.maxHp < this.hp) {
                  var7 = this.hp;
               }

               var6 = (int)((long)this.hp * 100L / (long)var7);
               var14 = this.vy;
               var5 = 4;
               if (this.levelBoss == 1 || this.levelBoss == 2 || this.levelBoss == 3 || this.isBoss) {
                  var5 = 6;
                  var14 += var14 / 2;
               }

               var14 += 2;
               if ((var6 = var14 * var6 / 100) < 2) {
                  var6 = 2;
               }

               if (this.templateId == 140 || this.templateId == 160) {
                  var4 = var2 - 20;
               }

               if (this.templateId != 142 && this.templateId != 143) {
                  var1.a(16777215);
                  var1.c(this.x - var14 / 2 - 1, var4 - this.exp - 12, var14, var5);
                  var1.a(this.f());
                  var1.c(this.x - var14 / 2 - 1, var4 - this.exp - 12, var6, var5);
                  var1.a(0);
                  var1.b(this.x - var14 / 2 - 1, var4 - this.exp - 12, var14, var5);
               } else {
                  SmallImage.drawSmallImageNew(var1, 988, this.x, var4 - this.exp, 0, 33);
               }
            } else {
               var7 = this.maxHp;
               if (this.maxHp < this.hp) {
                  var7 = this.hp;
               }

               var6 = (int)((long)this.hp * 100L / (long)var7);
               var14 = this.vy;
               if (this.templateId > 167) {
                  var14 = this.vy / 2;
               }

               var5 = 4;
               if (this.levelBoss == 1 || this.levelBoss == 2 || this.levelBoss == 3 || this.isBoss) {
                  var5 = 6;
                  var14 += var14 / 2;
               }

               var14 += 2;
               if ((var6 = var14 * var6 / 100) < 2) {
                  var6 = 2;
               }

               if (this.templateId == 140 || this.templateId == 160) {
                  var4 = var2 - 20;
               }

               if (this.templateId != 142 && this.templateId != 143) {
                  var1.a(16777215);
                  var1.c(this.x - var14 / 2 - 1, var4 - this.exp - 12, var14, var5);
                  var1.a(this.f());
                  var1.c(this.x - var14 / 2 - 1, var4 - this.exp - 12, var6, var5);
                  var1.a(0);
                  var1.b(this.x - var14 / 2 - 1, var4 - this.exp - 12, var14, var5);
               } else {
                  SmallImage.drawSmallImageNew(var1, 988, this.x, var4 - this.exp, 0, 33);
               }
            }

            if (this.levelBoss > 0) {
               if (this.levelBoss == 1) {
                  mFont.tahoma_7_yellow.a(var1, mResources.ji[this.levelBoss], this.x, var4 - this.exp - 26, 2, mFont.tahoma_7_grey);
               } else if (this.levelBoss == 2) {
                  mFont.tahoma_7_yellow.a(var1, mResources.ji[this.levelBoss], this.x, var4 - this.exp - 26, 2, mFont.tahoma_7_grey);
               } else if (this.levelBoss == 3) {
                  mFont.tahoma_7_blue1.a(var1, mResources.ji[this.levelBoss], this.x, var4 - this.exp - 26, 2, mFont.tahoma_7_grey);
               }

               if (this.isDisable) {
                  SmallImage.drawSmallImageNew(var1, 494, this.x, var4 - this.exp - 28, 0, 33);
               }
            } else if (this.isDisable) {
               SmallImage.drawSmallImageNew(var1, 494, this.x, var4 - this.exp - 15, 0, 33);
            }
         } else if (this.levelBoss > 0) {
            if (this.levelBoss == 1) {
               mFont.tahoma_7_yellow.a(var1, mResources.ji[this.levelBoss], this.x, var2 - this.exp - 20, 2, mFont.tahoma_7_grey);
            } else if (this.levelBoss == 2) {
               mFont.tahoma_7_yellow.a(var1, mResources.ji[this.levelBoss], this.x, var2 - this.exp - 20, 2, mFont.tahoma_7_grey);
            } else if (this.levelBoss == 3) {
               mFont.tahoma_7_blue1.a(var1, mResources.ji[this.levelBoss], this.x, var2 - this.exp - 20, 2, mFont.tahoma_7_grey);
            }

            if (this.isDisable) {
               SmallImage.drawSmallImageNew(var1, 494, this.x, var2 - this.exp - 22, 0, 33);
            }
         } else if (this.isDisable) {
            SmallImage.drawSmallImageNew(var1, 494, this.x, var2 - this.exp - 5, 0, 33);
         }

         if (this.isDontMove) {
            if (GameCanvas.u % 2 == 0) {
               SmallImage.drawSmallImageNew(var1, 1082, this.x, var2 - this.exp / 2, 0, 3);
            } else {
               SmallImage.drawSmallImageNew(var1, 1084, this.x, var2 - this.exp / 2, 0, 3);
            }
         }

         if (this.isIce) {
            SmallImage.drawSmallImageNew(var1, 290, this.x, var2, 0, 33);
         }

         if (this.isWind) {
            if ((var7 = GameCanvas.u % 6) != 0 && var7 != 1) {
               if (var7 != 2 && var7 != 3) {
                  if (var7 == 4 || var7 == 5) {
                     SmallImage.drawSmallImageNew(var1, 1000, this.x, var2 - this.exp - 5, 0, 3);
                  }
               } else {
                  SmallImage.drawSmallImageNew(var1, 999, this.x, var2 - this.exp - 5, 0, 3);
               }
            } else {
               SmallImage.drawSmallImageNew(var1, 998, this.x, var2 - this.exp - 5, 0, 3);
            }
         }

         if (this.isFire) {
            if ((var7 = GameCanvas.u % 16) == 0) {
               SmallImage.drawSmallImageNew(var1, 1013, this.x - this.vy / 2, var2 - this.exp + this.exp / 4, 0, 3);
               return;
            }

            if (var7 == 1) {
               SmallImage.drawSmallImageNew(var1, 1014, this.x - this.vy / 2, var2 - this.exp + this.exp / 4, 0, 3);
               return;
            }

            if (var7 == 2) {
               SmallImage.drawSmallImageNew(var1, 1015, this.x - this.vy / 2, var2 - this.exp + this.exp / 4, 0, 3);
               return;
            }

            if (var7 == 3) {
               SmallImage.drawSmallImageNew(var1, 1016, this.x - this.vy / 2, var2 - this.exp + this.exp / 4, 0, 3);
               return;
            }

            if (var7 == 4) {
               SmallImage.drawSmallImageNew(var1, 1013, this.x + this.vy / 2, var2 - this.exp, 0, 3);
               return;
            }

            if (var7 == 5) {
               SmallImage.drawSmallImageNew(var1, 1014, this.x + this.vy / 2, var2 - this.exp, 0, 3);
               return;
            }

            if (var7 == 6) {
               SmallImage.drawSmallImageNew(var1, 1015, this.x + this.vy / 2, var2 - this.exp, 0, 3);
               return;
            }

            if (var7 == 7) {
               SmallImage.drawSmallImageNew(var1, 1016, this.x + this.vy / 2, var2 - this.exp, 0, 3);
               return;
            }

            if (var7 == 8) {
               SmallImage.drawSmallImageNew(var1, 1013, this.x - this.vy / 2, var2, 0, 3);
               return;
            }

            if (var7 == 9) {
               SmallImage.drawSmallImageNew(var1, 1014, this.x - this.vy / 2, var2, 0, 3);
               return;
            }

            if (var7 == 10) {
               SmallImage.drawSmallImageNew(var1, 1015, this.x - this.vy / 2, var2, 0, 3);
               return;
            }

            if (var7 == 11) {
               SmallImage.drawSmallImageNew(var1, 1016, this.x - this.vy / 2, var2, 0, 3);
               return;
            }

            if (var7 == 12) {
               SmallImage.drawSmallImageNew(var1, 1013, this.x + this.vy / 2, var2 - this.exp / 4, 0, 3);
               return;
            }

            if (var7 == 13) {
               SmallImage.drawSmallImageNew(var1, 1014, this.x + this.vy / 2, var2 - this.exp / 4, 0, 3);
               return;
            }

            if (var7 == 14) {
               SmallImage.drawSmallImageNew(var1, 1015, this.x + this.vy / 2, var2 - this.exp / 4, 0, 3);
               return;
            }

            if (var7 == 15) {
               SmallImage.drawSmallImageNew(var1, 1016, this.x + this.vy / 2, var2 - this.exp / 4, 0, 3);
            }
         }
      }

   }

   public final int f() {
      if (this.sys > 1) {
         if (this.sys == 2) {
            return 33023;
         }

         if (this.sys == 3) {
            return 7443811;
         }
      }

      return 16711680;
   }

   public final void g() {
      this.hp = 0;
      this.an = System.currentTimeMillis();
      if (this.ab != null) {
         this.ac = true;
      } else {
         this.ac = true;
         this.hp = 0;
         this.status = 1;
         this.p1 = -5;
         this.p2 = -this.dir << 2;
         this.p3 = 0;
      }

   }

   public final void a(Mob var1) {
      this.at = var1;
   }

   public final void b(Char var1) {
      this.au = var1;
   }

   private void l() {
      int var1;
      int var2;
      if (this.at != null) {
         if (this.isBoss) {
            this.status = 3;
         } else {
            var1 = this.at.x - this.x;
            var2 = this.at.y - this.y;
            this.x += var1 / 4;
            this.y += var2 / 4;
            this.dir = this.x >= this.at.x ? 0 : 1;
            if (this.at.status == 1 || this.at.status == 0 || Res.abs(var1) < 20 && Res.abs(var2) < 20) {
               if (this.ax == 0) {
                  ServerEffect.addServerEffect(this.av == -1 ? 59 : this.av, this.at.x, this.at.y, this.dir == 0 ? -1 : 1);
               } else if (this.ax == 1 && this.av >= 0) {
                  EffectAuto.a(this.av, this.at.x, this.at.y, (byte)1, (short)-1, this.dir == 0 ? -1 : 1);
               }

               this.at = null;
            }
         }
      }

      if (this.au != null) {
         if (this.isBoss) {
            this.status = 3;
            return;
         }

         var1 = this.au.cx - this.x;
         var2 = this.au.cy - this.y;
         this.x += var1 / 4;
         this.y += var2 / 4;
         this.dir = this.x >= this.au.cx ? 0 : 1;
         if (this.au.statusMe == 5 || this.au.statusMe == 14 || Res.abs(var1) < 20 && Res.abs(var2) < 20) {
            if (this.ax == 0) {
               ServerEffect.addServerEffect(this.av == -1 ? 59 : this.av, this.au.cx, this.au.cy, this.dir == 0 ? -1 : 1);
            } else if (this.ax == 1 && this.av >= 0) {
               EffectAuto.a(this.av, this.au.cx, this.au.cy, (byte)1, (short)-1, this.dir == 0 ? -1 : 1);
            }

            this.au = null;
         }
      }

   }

   public final void a(short var1, byte var2, byte var3) {
      this.av = var1;
      this.aw = var2;
      this.ax = var3;
   }

   public final void h() {
      if (this.templateId == 116) {
         ServerEffect.addServerEffect(84, Char.getMyChar(), 1);
      } else if (this.templateId == 115) {
         ServerEffect.addServerEffect(81, Char.getMyChar(), 1);
      } else if (this.templateId == 138) {
         ServerEffect.addServerEffect(90, Char.getMyChar(), 1);
      } else if (this.templateId == 139) {
         ServerEffect.addServerEffect(91, Char.getMyChar(), 1);
      } else if (this.templateId != 140 && this.templateId != 161) {
         if (this.templateId == 141 || this.templateId == 162) {
            ServerEffect.addServerEffect(121, Char.getMyChar(), 1);
            return;
         }

         if (this.templateId == 144 || this.templateId == 163) {
            ServerEffect.addServerEffect(121, Char.getMyChar(), 1);
            return;
         }

         if (this.templateId == 160) {
            ServerEffect.addServerEffect(124, Char.getMyChar(), 1);
            return;
         }

         if (this.templateId == 164 || this.templateId == 165) {
            ServerEffect.addServerEffect(126, this.cFocus, 1);
            return;
         }

         if (this.templateId == 166) {
            ServerEffect.addServerEffect(103, this.cFocus, 1);
            return;
         }

         if (this.templateId == 166) {
            ServerEffect.addServerEffect(105, this.cFocus, 1);
            return;
         }
      } else {
         ServerEffect.addServerEffect(110, Char.getMyChar(), 2);
      }

   }

   private int c(int var1) {
      var1 %= az[this.templateId - 168].length;
      return this.templateId != 198 && this.templateId != 199 && this.templateId != 200 && this.templateId != 201 && this.templateId != 203 && this.templateId != 204 ? az[this.templateId - 168][var1] : 0;
   }

   private int d(int var1) {
      var1 %= 5;
      if (this.templateId == 178) {
         switch (var1) {
            case 0:
               return 5;
            case 1:
               return 6;
            case 2:
               return 7;
            case 3:
               return 8;
         }
      } else if (this.templateId == 168) {
         switch (var1) {
            case 0:
               return 1;
            case 1:
               return 2;
            case 2:
               return 3;
            case 3:
               return 4;
            case 4:
               return 5;
         }
      } else if (this.templateId == 179) {
         switch (var1) {
            case 0:
               return 0;
            case 1:
               return 2;
            case 2:
               return 3;
            case 3:
               return 4;
            case 4:
               return 5;
         }
      } else if (this.templateId == 175) {
         switch (var1) {
            case 0:
               return 0;
            case 1:
               return 2;
            case 2:
               return 3;
            case 3:
               return 4;
            case 4:
               return 5;
         }
      } else if (this.templateId == 176) {
         switch (var1) {
            case 0:
               return 2;
            case 1:
               return 3;
            case 2:
               return 4;
            case 3:
               return 5;
            case 4:
               return 6;
         }
      } else if (this.templateId == 177) {
         switch (var1) {
            case 0:
               return 1;
            case 1:
               return 2;
            case 2:
               return 3;
            case 3:
               return 4;
            case 4:
               return 5;
         }
      } else if (this.templateId == 174) {
         switch (var1) {
            case 0:
               return 5;
            case 1:
               return 6;
            case 2:
               return 7;
            case 3:
               return 8;
            case 4:
               return 9;
         }
      }

      return 0;
   }

   private void m() {
      if (this.p1 == 0) {
         int var1 = 0;
         int var2 = 0;
         if (this.at != null) {
            var1 = this.at.x;
            var2 = this.at.y;
         }

         if (this.au != null) {
            var1 = this.au.cx;
            var2 = this.au.cy;
         }

         this.am = this.aw;
         this.dir = this.x >= var1 ? 0 : 1;
         if (this.isBoss) {
            ++this.ao;
            if (this.ao >= arrMobTemplate[this.templateId].frameBossAttack[this.am].length) {
               this.ao = 0;
               this.status = 2;
               this.at = null;
               this.au = null;
               this.p1 = 0;
               this.p2 = 0;
            }

            if (this.ao == arrMobTemplate[this.templateId].frameBossAttack[this.am].length - 2) {
               if (this.ax == 0) {
                  ServerEffect.addServerEffect(this.av == -1 ? 59 : this.av, var1, var2, 1, (byte)(this.dir == 0 ? -1 : 1));
               } else if (this.ax == 1 && this.av >= 0) {
                  EffectAuto.a(this.av, var1, var2, (byte)1, (short)-1, this.dir == 0 ? -1 : 1);
               }
            }

            this.frame = arrMobTemplate[this.templateId].frameBossAttack[this.aw][this.ao];
         }

         if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && this.isIce && this.isWind) {
            this.x += (var1 - this.x) / 3;
         }

         if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
            this.p1 = 1;
         }

         if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
            this.p1 = 1;
            return;
         }
      } else if (this.p1 == 1) {
         if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && !this.isIce && !this.isWind) {
            this.x += (this.xFirst - this.x) / 4;
            this.y += (this.yFirst - this.y) / 4;
         }

         if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
            this.status = 2;
            this.ao = 0;
            this.p1 = 0;
            this.p2 = 0;
         }
      }

   }

   public static Mob a(int var0) {
      for(int var1 = GameScr.vMobAttack.size() - 1; var1 >= 0; --var1) {
         Mob var2;
         if ((var2 = (Mob)GameScr.vMobAttack.elementAt(var1)) != null && var2.mobId == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Mob b(int var0) {
      for(int var1 = GameScr.vMobAttack.size() - 1; var1 >= 0; --var1) {
         Mob var2;
         if ((var2 = (Mob)GameScr.vMobAttack.elementAt(var1)) != null && var2.level == var0 && !var2.isBoss) {
            return var2;
         }
      }

      return null;
   }

   public static void i() {
      arrMobTemplate = null;
      interestChar = null;
      vEggMonter = null;
      egg = null;
      timewait = 0L;
      az = (byte[][])null;
      ba = (byte[][])null;
      bb = (byte[][])null;
   }

   static {
      Main.main(21);
      a();
   }
}

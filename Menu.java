import javax.microedition.lcdui.Image;

public final class Menu implements IActionListener {
   public boolean showMenu;
   private MyVector menuItems;
   public int menuSelectedItem;
   private int menuX;
   private int menuY;
   private int menuW;
   private int menuH;
   private int i;
   private static int cmtoX;
   private static int cmx;
   private static int cmdy;
   private static int cmvy;
   private Command1 left;
   private Command1 right;
   private Command1 center;
   private static Image btnlBig0;
   private static Image btnlBig1;
   boolean c;
   private int s;
   private int t;
   private int u;
   private int[] menuTemY;
   private boolean w;
   private boolean x;
   private int y;
   private int z;
   private int aa;
   private int ab;

   public static void init() {
      btnlBig0 = GameCanvas.loadImage("/hd/btnlBig0.png");
      btnlBig1 = GameCanvas.loadImage("/hd/btnlBig1.png");
   }

   public Menu() {
      this.left = new Command1(mResources.dz, 0);
      this.right = GameCanvas.isTouch ? null : new Command1(mResources.aq, GameCanvas.z - 71, GameCanvas.aa - mScreen.fp + 1);
      this.center = null;
      this.menuTemY = new int[3];
   }

   public final void startAt(MyVector var1) {
      this.c = false;
      ChatPopup.b = null;
      InfoDlg.hide();
      if (var1.size() != 0) {
         this.menuItems = var1;
         this.menuW = 60;
         this.menuH = 60;

         for(int var2 = 0; var2 < var1.size(); ++var2) {
            Command1 var3 = (Command1)var1.elementAt(var2);
            if (mFont.tahoma_7_yellow.a(var3.caption) > this.menuW - 8) {
               var3.subCaption = mFont.tahoma_7_yellow.splitFontArray(var3.caption, this.menuW - 8);
            }
         }

         this.menuX = (GameCanvas.z - var1.size() * this.menuW) / 2;
         if (this.menuX <= 0) {
            this.menuX = 1;
         }

         this.menuY = GameCanvas.aa - this.menuH - (Paint.hTab + 1);
         if (GameCanvas.isTouch) {
            this.menuY -= 3;
         }

         this.i = this.menuY;
         this.showMenu = true;
         this.menuSelectedItem = 0;
         if ((cmdy = this.menuItems.size() * this.menuW - GameCanvas.z) < 0) {
            cmdy = 0;
         }

         cmtoX = 0;
         cmx = 0;
         cmvy = 50;
         this.s = var1.size() * this.menuW - 1;
         if (this.s > GameCanvas.z - 2) {
            this.s = GameCanvas.z - 2;
         }

         if (GameCanvas.isTouch) {
            this.menuSelectedItem = -1;
         }
      }

   }

   public final void updateMenuKey() {
      if (this.showMenu) {
         boolean var1 = false;
         if (!GameCanvas.k[2] && !GameCanvas.k[4]) {
            if (!GameCanvas.k[8] && !GameCanvas.k[6]) {
               if (GameCanvas.k[5]) {
                  if (this.center != null) {
                     if (this.center.idAction > 0) {
                        if (this.center.c == GameScr.gI()) {
                           GameScr.gI().b(this.center.idAction, this.center.p);
                        } else {
                           this.perform(this.center.idAction, this.center.p);
                        }
                     }
                  } else {
                     this.y = 2;
                  }
               } else if (GameCanvas.k[12]) {
                  if (this.left.idAction > 0) {
                     this.perform(this.left.idAction, this.left.p);
                  } else {
                     this.y = 2;
                  }
               } else if (!this.c && (GameCanvas.k[13] || mScreen.a(this.right))) {
                  this.showMenu = false;
                  InfoDlg.hide();
               }
            } else {
               var1 = true;
               ++this.menuSelectedItem;
               if (this.menuSelectedItem > this.menuItems.size() - 1) {
                  this.menuSelectedItem = 0;
               }
            }
         } else {
            var1 = true;
            --this.menuSelectedItem;
            if (this.menuSelectedItem < 0) {
               this.menuSelectedItem = this.menuItems.size() - 1;
            }
         }

         this.center = null;
         if (GameScr.cc && !GameCanvas.isTouch && this.menuSelectedItem != -1) {
            Command1 var2 = (Command1)this.menuItems.elementAt(this.menuSelectedItem);
            ChatTab var3;
            if ((var3 = ChatManager.gI().findTab(var2.caption)) != null && var3.type == 2) {
               this.center = new Command1(mResources.ar, this, 1000, var3);
            }
         }

         if (var1) {
            if ((cmtoX = this.menuSelectedItem * this.menuW + this.menuW - GameCanvas.z / 2) > cmdy) {
               cmtoX = cmdy;
            }

            if (cmtoX < 0) {
               cmtoX = 0;
            }

            if (this.menuSelectedItem == this.menuItems.size() - 1 || this.menuSelectedItem == 0) {
               cmx = cmtoX;
            }
         }

         if (!this.c && GameCanvas.o && !GameCanvas.c(this.menuX, this.menuY, this.s, this.menuH) && !this.w) {
            this.t = this.u = 0;
            this.w = false;
            this.showMenu = false;
            GameCanvas.o = false;
            return;
         }

         int var5;
         int var6;
         if (GameCanvas.m) {
            if (!this.w && GameCanvas.c(this.menuX, this.menuY, this.s, this.menuH)) {
               for(var5 = 0; var5 < this.menuTemY.length; ++var5) {
                  this.menuTemY[0] = GameCanvas.p;
               }

               this.u = GameCanvas.p;
               this.w = true;
               this.x = this.z != 0;
               this.z = 0;
            } else if (this.w) {
               ++this.t;
               if (this.t > 5 && this.u == GameCanvas.p && !this.x) {
                  this.u = -1000;
                  this.menuSelectedItem = (cmtoX + GameCanvas.p - this.menuX) / this.menuW;
               }

               if ((var5 = GameCanvas.p - this.menuTemY[0]) != 0 && this.menuSelectedItem != -1) {
                  this.menuSelectedItem = -1;
               }

               for(var6 = this.menuTemY.length - 1; var6 > 0; --var6) {
                  this.menuTemY[var6] = this.menuTemY[var6 - 1];
               }

               this.menuTemY[0] = GameCanvas.p;
               if ((cmtoX -= var5) < 0) {
                  cmtoX = 0;
               }

               if (cmtoX > cmdy) {
                  cmtoX = cmdy;
               }

               if (cmx < 0 || cmx > cmdy) {
                  var5 /= 2;
               }

               cmx -= var5;
            }
         }

         if (GameCanvas.o && this.w) {
            var5 = GameCanvas.p - this.menuTemY[0];
            GameCanvas.o = false;
            if (Res.abs(var5) < 20 && Res.abs(GameCanvas.p - this.u) < 20 && !this.x) {
               this.z = 0;
               cmtoX = cmx;
               this.u = -1000;
               this.menuSelectedItem = (cmtoX + GameCanvas.p - this.menuX) / this.menuW;
               this.t = 0;
               this.y = 10;
            } else if (this.menuSelectedItem != -1 && this.t > 5) {
               this.t = 0;
               this.y = 1;
            } else if (this.menuSelectedItem == -1 && !this.x) {
               if (cmx < 0) {
                  cmtoX = 0;
               } else if (cmx > cmdy) {
                  cmtoX = cmdy;
               } else {
                  byte var4;
                  if ((var6 = GameCanvas.p - this.menuTemY[0] + (this.menuTemY[0] - this.menuTemY[1]) + (this.menuTemY[1] - this.menuTemY[2])) > 10) {
                     var4 = 10;
                  } else if (var6 < -10) {
                     var4 = -10;
                  } else {
                     var4 = 0;
                  }

                  this.z = -var4 * 100;
               }
            }

            this.w = false;
            this.t = 0;
            GameCanvas.o = false;
         }

         GameCanvas.l();
         GameCanvas.m();
      }

   }

   public final void paintMenu(mGraphics var1) {
      try {
         var1.translate(-var1.b(), -var1.c());
         var1.translate(-cmx, 0);
         int var2;
         String[] var3;
         int var4;
         int var5;
         if (GameCanvas.isTouch) {
            for(var2 = 0; var2 < this.menuItems.size(); ++var2) {
               if (var2 == this.menuSelectedItem) {
                  var1.a(btnlBig1, this.menuX + var2 * this.menuW + 1, this.i + 1, 0);
               } else {
                  var1.a(btnlBig0, this.menuX + var2 * this.menuW + 1, this.i + 1, 0);
               }

               if ((var3 = ((Command1)this.menuItems.elementAt(var2)).subCaption) == null) {
                  var3 = new String[]{((Command1)this.menuItems.elementAt(var2)).caption};
               }

               var4 = this.i + (this.menuH - var3.length * 14) / 2 + 1;

               for(var5 = 0; var5 < var3.length; ++var5) {
                  if (GameScr.cc) {
                     if (ChatManager.gI().findWaitPerson(var3[var5])) {
                        if (GameCanvas.u % 10 > 5) {
                           mFont.tahoma_7_red.a(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                        } else {
                           mFont.tahoma_7_yellow.a(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                        }
                     } else {
                        mFont.tahoma_7_yellow.a(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                     }
                  } else {
                     mFont.tahoma_7_yellow.a(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                  }
               }
            }
         } else {
            for(var2 = 0; var2 < this.menuItems.size(); ++var2) {
               if (var2 == this.menuSelectedItem) {
                  var1.a(btnlBig1, this.menuX + var2 * this.menuW + 1, this.i + 1 - 23, 0);
               } else {
                  var1.a(btnlBig0, this.menuX + var2 * this.menuW + 1, this.i + 1 - 23, 0);
               }

               if ((var3 = ((Command1)this.menuItems.elementAt(var2)).subCaption) == null) {
                  var3 = new String[]{((Command1)this.menuItems.elementAt(var2)).caption};
               }

               var4 = this.i + (this.menuH - var3.length * 14) / 2 + 1 - 23;

               for(var5 = 0; var5 < var3.length; ++var5) {
                  if (GameScr.cc) {
                     if (ChatManager.gI().findWaitPerson(var3[var5])) {
                        if (GameCanvas.u % 10 > 5) {
                           mFont.tahoma_7_red.a(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                        } else {
                           mFont.tahoma_7_yellow.a(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                        }
                     } else {
                        mFont.tahoma_7_yellow.a(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                     }
                  } else {
                     mFont.tahoma_7_yellow.a(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                  }
               }
            }
         }

         var1.translate(-var1.b(), -var1.c());
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public final void moveCamera() {
      if (this.z != 0 && !this.w) {
         if ((cmtoX += this.z / 100) < 0) {
            cmtoX = 0;
         } else if (cmtoX > cmdy) {
            cmtoX = cmdy;
         } else {
            cmx = cmtoX;
         }

         this.z = this.z * 9 / 10;
         if (this.z < 100 && this.z > -100) {
            this.z = 0;
         }
      }

      if (cmx != cmtoX && !this.w) {
         this.aa = cmtoX - cmx << 2;
         this.ab += this.aa;
         cmx += this.ab >> 4;
         this.ab &= 15;
      }

      if (this.i > this.menuY) {
         int var1;
         if ((var1 = this.i - this.menuY >> 1) <= 0) {
            var1 = 1;
         }

         this.i -= var1;
      }

      if (cmvy != 0 && (cmvy >>= 1) < 0) {
         cmvy = 0;
      }

      if (this.y > 0) {
         --this.y;
         GameScr.cc = false;
         if (this.y == 0) {
            this.showMenu = false;
            Command1 var2;
            if (this.menuSelectedItem >= 0 && (var2 = (Command1)this.menuItems.elementAt(this.menuSelectedItem)) != null) {
               var2.a();
            }
         }
      }

   }

   public final void perform(int var1, Object var2) {
      if (var1 == 1000) {
         ChatTab var3 = (ChatTab)var2;
         this.menuItems.removeAllElements();
         ChatManager.gI().removeFromWaitList(var3.ownerName);
         ChatManager.gI().chatTabs.removeElement(var3);

         for(var1 = 0; var1 < ChatManager.gI().chatTabs.size(); ++var1) {
            ChatTab var4 = (ChatTab)ChatManager.gI().chatTabs.elementAt(var1);
            this.menuItems.addElement(new Command1(var4.ownerName, (IActionListener)null, 12001, new Integer(var1)));
         }

         this.menuItems.addElement(new Command1(mResources.pz, (IActionListener)null, 12006, (Object)null));
         this.menuItems.addElement(new Command1(mResources.qa, (IActionListener)null, 12008, (Object)null));

         for(var1 = 0; var1 < this.menuItems.size(); ++var1) {
            Command1 var5 = (Command1)this.menuItems.elementAt(var1);
            if (mFont.tahoma_7_yellow.a(var5.caption) > this.menuW - 8) {
               var5.subCaption = mFont.tahoma_7_yellow.splitFontArray(var5.caption, this.menuW - 8);
            }
         }

         cmdy = this.menuItems.size() * this.menuW - GameCanvas.z;
         if ((cmtoX = this.menuSelectedItem * this.menuW + this.menuW - GameCanvas.z / 2) > cmdy) {
            cmtoX = cmdy;
         }

         if (cmtoX < 0) {
            cmtoX = 0;
         }

         if (this.menuSelectedItem == this.menuItems.size() - 1 || this.menuSelectedItem == 0) {
            cmx = cmtoX;
         }
      }

   }

   public static void d() {
      cmtoX = 0;
      cmx = 0;
      cmdy = 0;
      cmvy = 0;
      btnlBig0 = null;
      btnlBig1 = null;
   }

   static {
      Main.main(46);
      init();
   }
}

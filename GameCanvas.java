import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameCanvas extends TCanvas implements IActionListener {
   public static boolean a;
   public static boolean b;
   public static boolean c;
   public static boolean d;
   public static boolean isLoading;
   public static boolean isTouch;
   public static boolean g;
   public static boolean h;
   public static boolean isTouchControlLargeScreen;
   public static GameCanvas instance;
   public static boolean[] k;
   private static boolean[] ba;
   public static boolean[] l;
   public static boolean m;
   public static boolean n;
   public static boolean o;
   public static int p;
   public static int q;
   public static int r;
   public static int s;
   public static Position[] t;
   public static int u;
   public static int v;
   public static boolean w;
   public static boolean x;
   private static long bb;
   private static long bc;
   public static boolean y;
   public static int z;
   public static int aa;
   public static int ab;
   public static int ac;
   public static mScreen currentScreen;
   public static Menu menu;
   public static SelectServerScr afselectsvScr;
   public static LoginScr loginScr;
   public static LanguageScr languageScr;
   public static Dialog currentDialog;
   public static MsgDlg msgdlg;
   public static InputDlg inputDlg;
   public static Input2Dlg input2Dlg;
   public static Paint paintz;
   public static RegisterScr regScr;
   private static Image[] bd;
   private static int be;
   public static int ao;
   private mGraphics bf = new mGraphics();
   private static Image bg;
   private static Image bh;
   public static Image[] ap;
   public static int aq;
   public static int ar;
   public static int as;
   private static long bi;
   public static int at;
   private int[] bj;
   private int[] bk;
   private int[] bl;
   private static int[] bm;
   private static int[] bn;
   private static int[] bo;
   private static Image[] bp;
   private static Image bq;
   private static Image[][] br;
   private boolean bs;
   public static boolean au;
   public static boolean av;
   public static Image aw;
   private static int bt;
   public static int ax;
   public static long ay;
   public static long az;

   public static void b() {
      a = false;
      b = true;
      c = true;
      d = false;
      isTouch = false;
      k = new boolean[14];
      ba = new boolean[14];
      l = new boolean[14];
      t = new Position[4];
      menu = new Menu();
      be = 0;
      ap = new Image[2];
      as = -1;
      bi = 0L;
      au = false;
      av = false;
      bt = z;
   }

   public GameCanvas() {
      MotherCanvas var1;
      (var1 = MotherCanvas.gI()).setFullScreenMode(true);
      var1.tCanvas = this;
      z = var1.getHeights();
      aa = var1.getWidths();
      ab = z / 2;
      ac = aa / 2;
      y = System.getProperty("microedition.platform").indexOf("RIM") == 0;
      if (MotherCanvas.instance.hasPointerEvents()) {
         isTouch = true;
         if (z >= 240) {
            g = true;
         }

         if (z < 320) {
            h = true;
         }

         if (z >= 320) {
            isTouchControlLargeScreen = true;
         }
      }

      int var2;
      if ((var2 = mResources.d("indLanguage")) < 0) {
         mResources.h = 0;
      } else {
         mResources.h = var2;
      }

      mResources.b();
      msgdlg = new MsgDlg();
      if (aa <= 160) {
         Paint.hTab = 15;
         mScreen.fp = 17;
      }

      instance = this;
      System.gc();
      paintz = new Paint();
      TileMap.k();
      if (!a) {
         if (br == null) {
            br = new Image[2][5];

            for(var2 = 0; var2 < 2; ++var2) {
               for(int var3 = 0; var3 < 5; ++var3) {
                  br[var2][var3] = loadImage("/e/d" + var2 + var3 + ".png");
               }
            }
         }

         this.bj = new int[2];
         this.bk = new int[2];
         this.bl = new int[2];
         this.bl[0] = this.bl[1] = -1;
      }

      v();
      bq = loadImage("/u/f.png");
      if (isTouch) {
         for(var2 = 0; var2 < 2; ++var2) {
            ap[var2] = loadImage("/hd/bd" + var2 + ".png");
         }

         aq = mGraphics.a(ap[0]);
         ar = mGraphics.b(ap[0]);
         mGraphics.a(ap[1]);
         mGraphics.b(ap[1]);
      } else if (mResources.d("lowGraphic") == 1) {
         a = true;
      }

      SmallImage.loadBigImage();
      mScreen.ar();
      languageScr = new LanguageScr();
   }

   public static GameCanvas c() {
      if (instance == null) {
         instance = new GameCanvas();
      }

      return instance;
   }

   public static void d() {
      Session_ME.getInstance().connect(GameMidlet.g, GameMidlet.port);
   }

   public static void e() {
      z = MotherCanvas.instance.getHeights();
      aa = MotherCanvas.instance.getWidths();
      ab = z / 2;
      ac = aa / 2;
      loginScr = new LoginScr();
      afselectsvScr = new SelectServerScr();
      regScr = new RegisterScr();
      inputDlg = new InputDlg();
      input2Dlg = new Input2Dlg();
   }

   public final void update() {
      if (ax > 0) {
         if ((az = System.currentTimeMillis()) - ay >= 1000L) {
            if (--ax == 0) {
               Session_ME.getInstance().e();
            }

            ay = az;
         }
      } else if (Session_ME.getInstance().connected && System.currentTimeMillis() - Session_ME.getInstance().j > 300000L) {
         Session_ME.getInstance().e();
      }

      long var1;
      if ((var1 = System.currentTimeMillis()) - bb >= 780L && !w) {
         bb = var1;
         w = true;
      } else {
         w = false;
      }

      if (var1 - bc >= 7800L && !x) {
         bc = var1;
         x = true;
      } else {
         x = false;
      }

      if (v > 0) {
         --v;
      }

      if (++u > 10000) {
         u = 0;
      }

      if (currentScreen != null) {
         if (currentDialog != null) {
            currentDialog.a();
         } else if (menu.showMenu) {
            menu.moveCamera();
            menu.updateMenuKey();
         }

         if (!isLoading) {
            currentScreen.update();
         }

         currentScreen.updateKey();
      }

      long var3 = System.currentTimeMillis();
      if (mResources.g && var3 > mResources.f) {
         mResources.g = false;

         try {
            if (mResources.e > 0) {
               GameScr.gI().perform((int)mResources.e, (Object)null);
            }
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }

      InfoDlg.update();
      if (this.bs) {
         this.f();
      }

      MotherCanvas.instance.repaint();
      MotherCanvas.instance.serviceRepaints();
   }

   public final void f() {
      this.bs = false;
      afselectsvScr.switchToMe();

      try {
         Char.i();
         GameScr.o();
         GameScr.resetAllvector();
         n();
         InfoDlg.hide();
         GameScr.a(true);
         GameScr.gW23 = 100;
         byte var1 = TileMap.bgID;
         GameScr.vParty.removeAllElements();
         GameScr.vClan.removeAllElements();
         GameScr.vFriend.removeAllElements();
         GameScr.vEnemies.removeAllElements();
         Char.be = null;
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void g() {
      if (d && --ao < 0) {
         d = false;
      }

   }

   public static void h() {
   }

   public static void paintBGGameScr(mGraphics var0) {
      if (d) {
         if (u % 10 > 7) {
            var0.a(16777215);
         } else {
            var0.a(0);
         }

         var0.c(0, 0, GameScr.gW, GameScr.gH);
      } else {
         var0.a(0);
         var0.c(0, 0, GameScr.gW, GameScr.gH);
      }

   }

   public static void i() {
      bd = null;
      bg = null;
      bh = null;
   }

   public static void j() {
   }

   protected final void keyPressed(int var1) {
      bi = System.currentTimeMillis();
      if (var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 122 || var1 == 10 || var1 == 8 || var1 == 13 || var1 == 32) {
         at = var1;
      }

      if (currentDialog != null) {
         currentDialog.a(var1);
         at = 0;
      } else {
         currentScreen.keyPress(var1);
         switch (var1) {
            case -39:
            case -2:
               l[8] = true;
               k[8] = true;
               return;
            case -38:
            case -1:
               l[2] = true;
               k[2] = true;
               return;
            case -37:
            case -36:
            case -35:
            case -34:
            case -33:
            case -32:
            case -31:
            case -30:
            case -29:
            case -28:
            case -27:
            case -26:
            case -25:
            case -24:
            case -23:
            case -20:
            case -19:
            case -18:
            case -17:
            case -16:
            case -15:
            case -14:
            case -13:
            case -12:
            case -11:
            case -10:
            case -9:
            case -8:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            default:
               break;
            case -22:
            case -7:
               l[13] = true;
               k[13] = true;
               return;
            case -21:
            case -6:
               l[12] = true;
               k[12] = true;
               return;
            case -5:
            case 10:
               l[5] = true;
               k[5] = true;
               return;
            case -4:
               l[6] = true;
               k[6] = true;
               return;
            case -3:
               l[4] = true;
               k[4] = true;
               return;
            case 35:
               l[11] = true;
               k[11] = true;
               return;
            case 42:
               l[10] = true;
               k[10] = true;
               return;
            case 48:
               l[0] = true;
               k[0] = true;
               return;
            case 49:
               if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
                  l[1] = true;
                  k[1] = true;
               }

               return;
            case 50:
               if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                  l[2] = true;
                  k[2] = true;
               }

               return;
            case 51:
               if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
                  l[3] = true;
                  k[3] = true;
               }

               return;
            case 52:
               if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                  l[4] = true;
                  k[4] = true;
               }

               return;
            case 53:
               if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                  l[5] = true;
                  k[5] = true;
               }

               return;
            case 54:
               if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                  l[6] = true;
                  k[6] = true;
               }

               return;
            case 55:
               l[7] = true;
               k[7] = true;
               return;
            case 56:
               if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                  l[8] = true;
                  k[8] = true;
               }

               return;
            case 57:
               l[9] = true;
               k[9] = true;
               return;
         }
      }

   }

   protected final void keyReleased(int var1) {
      at = 0;
      switch (var1) {
         case -39:
         case -2:
            l[8] = false;
            return;
         case -38:
         case -1:
            l[2] = false;
            return;
         case -37:
         case -36:
         case -35:
         case -34:
         case -33:
         case -32:
         case -31:
         case -30:
         case -29:
         case -28:
         case -27:
         case -26:
         case -25:
         case -24:
         case -23:
         case -20:
         case -19:
         case -18:
         case -17:
         case -16:
         case -15:
         case -14:
         case -13:
         case -12:
         case -11:
         case -10:
         case -9:
         case -8:
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         default:
            return;
         case -22:
         case -7:
            l[13] = false;
            ba[13] = true;
            return;
         case -21:
         case -6:
            l[12] = false;
            ba[12] = true;
            return;
         case -5:
         case 10:
            l[5] = false;
            ba[5] = true;
            return;
         case -4:
            l[6] = false;
            return;
         case -3:
            l[4] = false;
            return;
         case 35:
            l[11] = false;
            ba[11] = true;
            return;
         case 42:
            l[10] = false;
            ba[10] = true;
            return;
         case 48:
            l[0] = false;
            ba[0] = true;
            return;
         case 49:
            if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
               l[1] = false;
               ba[1] = true;
            }

            return;
         case 50:
            if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
               l[2] = false;
               ba[2] = true;
            }

            return;
         case 51:
            if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
               l[3] = false;
               ba[3] = true;
            }

            return;
         case 52:
            if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
               l[4] = false;
               ba[4] = true;
            }

            return;
         case 53:
            if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
               l[5] = false;
               ba[5] = true;
            }

            return;
         case 54:
            if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
               l[6] = false;
               ba[6] = true;
            }

            return;
         case 55:
            l[7] = false;
            ba[7] = true;
            return;
         case 56:
            if (currentScreen == GameScr.instance && b && !ChatTextField.gI().isShow) {
               l[8] = false;
               ba[8] = true;
            }

            return;
         case 57:
            l[9] = false;
            ba[9] = true;
      }
   }

   protected final void pointerDragged(int var1, int var2) {
      if (Res.abs(var1 - r) >= 10 || Res.abs(var2 - s) >= 10) {
         n = false;
      }

      p = var1;
      q = var2;
      if (++be > 3) {
         be = 0;
      }

      t[be] = new Position(var1, var2);
   }

   public static boolean k() {
      return System.currentTimeMillis() - bi >= 800L;
   }

   protected final void pointerPressed(int var1, int var2) {
      m = true;
      n = true;
      bi = System.currentTimeMillis();
      r = var1;
      s = var2;
      p = var1;
      q = var2;
   }

   protected final void pointerReleased(int var1, int var2) {
      m = false;
      o = true;
      mScreen.fq = -1;
      p = var1;
      q = var2;
   }

   public static boolean a(int var0, int var1, int var2, int var3) {
      int var4 = p + GameScr.gW23;
      int var5 = GameScr.gH2 + q;
      return (m || o) && var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3;
   }

   public static boolean a(int var0, int var1, int var2, int var3, Scroll var4) {
      int var5 = p + var4.a;
      int var6 = var4.b + q;
      return (m || o) && var5 >= var0 && var5 <= var0 + var2 && var6 >= var1 && var6 <= var1 + var3;
   }

   public static boolean b(int var0, int var1, int var2, int var3) {
      return (m || o) && p >= var0 && p <= var0 + var2 && q >= var1 && q <= var1 + var3;
   }

   public static void l() {
      for(int var0 = 0; var0 < 14; ++var0) {
         k[var0] = false;
      }

      o = false;
   }

   public static void m() {
      for(int var0 = 0; var0 < 14; ++var0) {
         l[var0] = false;
      }

   }

   protected final void paint(Graphics var1) {
      this.bf.a = var1;

      try {
         if (currentScreen != null && !isLoading) {
            currentScreen.paint(this.bf);
            this.bf.d(0, 0, z, aa);
         }

         this.bf.translate(-this.bf.b(), -this.bf.c());
         this.bf.d(0, 0, z, aa);
         InfoDlg.paint(this.bf);
         if (currentDialog != null) {
            currentDialog.a(this.bf);
         } else if (menu.showMenu) {
            menu.paintMenu(this.bf);
         }

         GameScr.b(this.bf);
         if (ax > 0) {
            Paint.a(30, aa - 118, z - 60, 80, this.bf);
            a(ab, aa - 98, this.bf);
            mFont.tahoma_8b.a(this.bf, "Xin ch\u1edd " + ax + "s...ch\u1edd l\u00e2u ch\u00fat nh\u00e9!!", ab, aa - 78, 2);
            return;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void n() {
      inputDlg.tfInput.b(500);
      input2Dlg.tfInput.b(500);
      input2Dlg.tfInput2.b(500);
      currentDialog = null;
   }

   public static void a(String var0) {
      msgdlg.setInfo(var0, (Command1)null, new Command1(mResources.ch, instance, 8882, (Object)null), (Command1)null);
      currentDialog = msgdlg;
   }

   public static void b(String var0) {
      msgdlg.setInfo(var0, (Command1)null, new Command1(mResources.dn, instance, 8882, (Object)null), (Command1)null);
      currentDialog = msgdlg;
      msgdlg.isWait = true;
   }

   public static void o() {
      b(mResources.ag);
   }

   public static void p() {
      msgdlg.timeShow = 500;
      msgdlg.setInfo(mResources.ag, (Command1)null, (Command1)null, (Command1)null);
      currentDialog = msgdlg;
      msgdlg.isWait = true;
   }

   public static void q() {
      msgdlg.timeShow = 500;
      msgdlg.setInfo(mResources.ah, (Command1)null, (Command1)null, (Command1)null);
      currentDialog = msgdlg;
      msgdlg.isWait = true;
   }

   public static void r() {
      msgdlg.timeShow = 500;
      msgdlg.setInfo("\u0110ang offline!!", (Command1)null, (Command1)null, (Command1)null);
      currentDialog = msgdlg;
      msgdlg.isWait = true;
   }

   public final void a(String var1, String var2, String var3, String var4) {
      msgdlg.setInfo(var4, new Command1(var1, this, 8881, var3), (Command1)null, new Command1(var2, this, 8882, (Object)null));
      currentDialog = msgdlg;
   }

   public final void a(String var1, String var2, short var3, String var4, String var5) {
      MyVector var6;
      (var6 = new MyVector()).addElement(new Short(var3));
      var6.addElement(var4);
      msgdlg.setInfo(var5, new Command1(var1, this, 8883, var6), (Command1)null, new Command1(var2, this, 8882, (Object)null));
      currentDialog = msgdlg;
   }

   public static void a(String var0, int var1) {
      msgdlg.setInfo(var0, (Command1)null, new Command1(mResources.ch, instance, var1, (Object)null, z / 2 - 35, aa - 50), (Command1)null);
      currentDialog = msgdlg;
   }

   public static void a(String var0, int var1, Object var2, int var3, Object var4) {
      msgdlg.setInfo(var0, new Command1(mResources.br, instance, var1, var2), new Command1("", instance, var1, var2), new Command1(mResources.ce, instance, var3, var4));
      currentDialog = msgdlg;
   }

   public static void a(String var0, Command1 var1, Command1 var2) {
      msgdlg.setInfo(var0, var1, (Command1)null, var2);
      currentDialog = msgdlg;
   }

   public static Image loadImage(String var0) {
      var0 = "/x" + mGraphics.b + var0;
      Image var1 = null;

      try {
         var1 = Image.createImage(var0);
      } catch (Exception var3) {
      }

      return var1;
   }

   public final boolean a(int var1, int var2, int var3) {
      if (a) {
         return false;
      } else {
         var1 = var1 == 1 ? 0 : 1;
         if (this.bl[var1] != -1) {
            return false;
         } else {
            this.bl[var1] = 0;
            this.bj[var1] = var2;
            this.bk[var1] = var3;
            return true;
         }
      }
   }

   private static void v() {
      if (!a) {
         bp = new Image[3];

         for(int var0 = 0; var0 < 3; ++var0) {
            bp[var0] = loadImage("/e/w" + var0 + ".png");
         }

         bm = new int[2];
         bn = new int[2];
         (bo = new int[2])[0] = bo[1] = -1;
      }

   }

   public static boolean d(int var0, int var1) {
      if (a) {
         return false;
      } else {
         int var2 = bo[0] == -1 ? 0 : 1;
         if (bo[var2] != -1) {
            return false;
         } else {
            bo[var2] = 0;
            bm[var2] = var0;
            bn[var2] = var1;
            return true;
         }
      }
   }

   public final void s() {
      if (!a) {
         for(int var1 = 0; var1 < 2; ++var1) {
            if (this.bl[var1] != -1) {
               int var10003 = this.bl[var1]++;
               if (this.bl[var1] >= 5) {
                  this.bl[var1] = -1;
               }

               if (var1 == 0) {
                  var10003 = this.bj[var1]--;
               } else {
                  var10003 = this.bj[var1]++;
               }

               var10003 = this.bk[var1]--;
            }
         }
      }

   }

   public static boolean e(int var0, int var1) {
      return var0 >= GameScr.gW23 && var0 <= GameScr.gW23 + GameScr.gW && var1 >= GameScr.gH2 && var1 <= GameScr.gH2 + GameScr.gH + 30;
   }

   public final void b(mGraphics var1) {
      if (!a) {
         for(int var2 = 0; var2 < 2; ++var2) {
            if (this.bl[var2] != -1 && e(this.bj[var2], this.bk[var2])) {
               var1.a(br[var2][this.bl[var2]], this.bj[var2], this.bk[var2], 3);
            }
         }
      }

   }

   public static void a(int var0, int var1, mGraphics var2) {
      int var3 = u % 3;
      var2.a(bq, 0, var3 << 4, 16, 16, 0, var0, var1, 3);
   }

   public final void t() {
      isLoading = false;
      this.bs = true;
   }

   public static boolean c(int var0, int var1, int var2, int var3) {
      return (m || o) && p >= var0 && p <= var0 + var2 && q >= var1 && q <= var1 + var3;
   }

   public final void perform(int var1, Object var2) {
      String var3;
      Item[] var4;
      int var5;
      String var6;
      short var7;
      Char var8;
      int var9;
      switch (var1) {
         case 1608:
            Service.gI().ChucTet((String) input2Dlg.tfInput.e(), (String) input2Dlg.tfInput2.e(), (byte)0);
            n();
            return;
         case 1700:
            Service.gI().luckyDraw((short)100, inputDlg.tfInput.e(), GameScr.fd);
            n();
            return;
         case 8881:
            NinjaUtil.downloadGame((String)var2);
            currentDialog = null;
            return;
         case 8882:
            currentDialog = null;
            return;
         case 8883:
            var7 = ((Short)((MyVector)var2).elementAt(0)).shortValue();
            NinjaUtil.sendMsDK((String)((MyVector)var2).elementAt(0), var7);
            currentDialog = null;
            return;
         case 8884:
            n();
            afselectsvScr.switchToMe();
            return;
         case 8885:
            GameMidlet.instance.notifyDestroyed();
            return;
         case 8887:
            n();
            var1 = ((Integer)var2).intValue();
            Service.gI().addPartyAccept(var1);
            return;
         case 8888:
            var1 = ((Integer)var2).intValue();
            Service.gI().addPartyCancel(var1);
            n();
            return;
         case 8889:
            var6 = (String)var2;
            n();
            Service.gI().acceptPleaseParty(var6);
            return;
         case 8890:
            n();
            Service.gI().sendUIConfirmID(((Integer)var2).intValue());
            return;
         case 16081:
            Service.gI().ChucTet((String) input2Dlg.tfInput.e(), (String) input2Dlg.tfInput2.e(), (byte)1);
            n();
            return;
         case 88810:
            var1 = ((Integer)var2).intValue();
            n();
            Service.gI().acceptInviteTrade(var1);
            return;
         case 88811:
            n();
            Service.gI().cancelInviteTrade();
            return;
         case 88812:
            var8 = (Char)var2;
            n();
            Service.gI().acceptInviteTest(var8.charID);
            return;
         case 88813:
            n();
            var4 = (Item[])var2;
            Service.gI().crystalCollect(var4);
            return;
         case 88814:
            var4 = (Item[])var2;
            n();
            Service.gI().crystalCollectLock(var4);
            return;
         case 88815:
            GameScr.gI();
            GameScr.ag();
            return;
         case 88816:
            Service.gI().sendCardInfo(input2Dlg.tfInput.e(), input2Dlg.tfInput2.e());
            n();
            return;
         case 88817:
            if (Char.getMyChar().npcFocus != null) {
               Service.gI().menu(Char.getMyChar().npcFocus.template.npcTemplateId, menu.menuSelectedItem, 0);
               return;
            }

            Service.gI().menu(0, menu.menuSelectedItem, 0);
            return;
         case 88818:
            var7 = ((Short)var2).shortValue();
            Service.gI().textBoxId(var7, inputDlg.tfInput.e());
            n();
            return;
         case 88819:
            var7 = ((Short)var2).shortValue();
            Service.gI().menuId(var7);
            GameScr.gI().ah();
            return;
         case 88820:
            String[] var10 = (String[])var2;
            if (Char.getMyChar().npcFocus == null) {
               return;
            }

            Integer var11 = new Integer(menu.menuSelectedItem);
            if (var10.length <= 1) {
               ChatPopup.addChatPopupOutSide("", 1, Char.getMyChar().npcFocus);
               Service.gI().menu(Char.getMyChar().npcFocus.template.npcTemplateId, var11.intValue(), 0);
               return;
            }

            MyVector var12 = new MyVector();

            for(var5 = 0; var5 < var10.length - 1; ++var5) {
               var12.addElement(new Command1(var10[var5 + 1], instance, 88821, var11));
            }

            menu.startAt(var12);
            return;
         case 88821:
            var5 = ((Integer)var2).intValue();
            ChatPopup.addChatPopupOutSide("", 1, Char.getMyChar().npcFocus);
            Service.gI().menu(Char.getMyChar().npcFocus.template.npcTemplateId, var5, menu.menuSelectedItem);
            return;
         case 88822:
            ChatPopup.addChatPopupOutSide("", 1, Char.getMyChar().npcFocus);
            Service.gI().menu(Char.getMyChar().npcFocus.template.npcTemplateId, menu.menuSelectedItem, 0);
            return;
         case 88823:
            a(mResources.fd);
            return;
         case 88824:
            a(mResources.fe);
            return;
         case 88825:
            a(mResources.qc);
            return;
         case 88826:
            a(mResources.qe);
            return;
         case 88827:
            a(mResources.qd);
            return;
         case 88828:
            a(mResources.qf);
            return;
         case 88829:
            if ((var6 = inputDlg.tfInput.e()).equals("")) {
               return;
            }

            Service.gI().changeName(var6, ((Integer)var2).intValue());
            b(mResources.ag);
            return;
         case 88830:
            var1 = ((Integer)var2).intValue();
            n();
            Service.gI().acceptInviteClan(var1);
            return;
         case 88831:
            var1 = ((Integer)var2).intValue();
            n();
            Service.gI().acceptPleaseClan(var1);
            return;
         case 88832:
            var6 = inputDlg.tfInput.e();
            n();
            if (!var6.equals("")) {
               Service.gI().changeClanAlert(var6);
               return;
            }
            break;
         case 88833:
            var6 = inputDlg.tfInput.e();
            n();
            if (!var6.equals("")) {
               try {
                  var1 = Integer.parseInt(var6);
                  if (Char.getMyChar().xu >= var1 && var1 >= 0) {
                     Service.gI().inputCoinClan(var1);
                     return;
                  }

                  InfoMe.addInfo(mResources.qg, 20, mFont.tahoma_7_yellow);
                  return;
               } catch (Exception var20) {
                  return;
               }
            }
            break;
         case 88834:
            var6 = inputDlg.tfInput.e();
            n();
            if (!var6.equals("")) {
               try {
                  if ((var1 = Integer.parseInt(var6)) <= 0) {
                     return;
                  }

                  Service.gI().outputCoinClan(var1);
                  return;
               } catch (Exception var19) {
                  return;
               }
            }
            break;
         case 88835:
            var1 = Integer.parseInt((String)var2);
            var9 = Integer.parseInt(inputDlg.tfInput.e());
            currentDialog = null;
            if (var9 > 0 && var9 < Char.getMyChar().arrItemBag[var1].quantity) {
               Service.gI().inputNumSplit(var1, var9);
               return;
            }

            a(mResources.qh);
            return;
         case 88836:
            inputDlg.tfInput.b(6);
            inputDlg.a(mResources.pg, new Command1(mResources.dm, instance, 888361, (Object)null), 1);
            return;
         case 88837:
            var6 = inputDlg.tfInput.e();
            n();

            try {
               Service.gI().requestItem2(Integer.parseInt(var6.trim()));
               return;
            } catch (Exception var18) {
               return;
            }
         case 88838:
            var6 = input2Dlg.tfInput.e().trim();
            var3 = input2Dlg.tfInput2.e().trim();
            n();
            if (var6.length() >= 6 && var3.length() >= 6) {
               try {
                  var1 = Integer.parseInt(var6);
                  var9 = Integer.parseInt(var3);
                  if (var1 >= 99999 && var9 >= 99999) {
                     Service.gI().updateActive(var1, var9);
                     return;
                  }

                  a(mResources.pc);
                  return;
               } catch (Exception var17) {
                  a(mResources.pb);
                  return;
               }
            }

            a(mResources.pa);
            return;
         case 88839:
            var6 = inputDlg.tfInput.e();
            n();

            try {
               Integer.parseInt(var6);
               a(mResources.qj, 888391, var6, 8882, (Object)null);
               return;
            } catch (Exception var16) {
               InfoMe.addInfo(mResources.pd, 20, mFont.tahoma_7_yellow);
               return;
            }
         case 88840:
            var8 = (Char)var2;
            n();
            Service.gI().acceptInviteTestDun(var8.charID);
            return;
         case 88841:
            var8 = (Char)var2;
            n();
            Service.gI().acceptInviteTestGT(var8.charID);
            return;
         case 88842:
            Service.gI().acceptClanBattlefield();
            return;
         case 88843:
            var3 = inputDlg.tfInput.e();
            n();
            if (var3.equals("")) {
               a(mResources.qi);
               return;
            }

            Service.gI().sendClanItem(var3);
            return;
         case 888181:
            var7 = ((Short)var2).shortValue();
            Service.gI().SendCapcha(var7, inputDlg.tfInput.e());
            n();
            return;
         case 888361:
            var6 = inputDlg.tfInput.e();
            n();
            if (var6.length() >= 6 && !var6.equals("")) {
               try {
                  Service.gI().activeAccProtect(Integer.parseInt(var6));
                  return;
               } catch (Exception var15) {
                  a(mResources.pb);
                  return;
               }
            }

            a(mResources.pa);
            return;
         case 888391:
            try {
               n();
               var9 = Integer.parseInt((String)var2);
               Service.gI().clearAccProtect(var9);
               return;
            } catch (Exception var14) {
               return;
            }
      }

   }

   public static void u() {
      a = false;
      b = false;
      c = false;
      d = false;
      isLoading = false;
      isTouch = false;
      g = false;
      h = false;
      isTouchControlLargeScreen = false;
      instance = null;
      k = null;
      ba = null;
      l = null;
      m = false;
      n = false;
      o = false;
      p = 0;
      q = 0;
      r = 0;
      s = 0;
      t = null;
      u = 0;
      v = 0;
      w = false;
      x = false;
      bb = 0L;
      bc = 0L;
      y = false;
      z = 0;
      aa = 0;
      ab = 0;
      ac = 0;
      currentScreen = null;
      menu = null;
      afselectsvScr = null;
      loginScr = null;
      languageScr = null;
      currentDialog = null;
      msgdlg = null;
      inputDlg = null;
      input2Dlg = null;
      paintz = null;
      regScr = null;
      bd = null;
      be = 0;
      ao = 0;
      bg = null;
      bh = null;
      ap = null;
      aq = 0;
      ar = 0;
      as = 0;
      bi = 0L;
      at = 0;
      bm = null;
      bn = null;
      bo = null;
      bp = null;
      bq = null;
      br = (Image[][])null;
      au = false;
      av = false;
      aw = null;
      bt = 0;
      ax = 0;
      ay = 0L;
      az = 0L;
   }

   static {
      Main.main(30);
      b();
   }
}

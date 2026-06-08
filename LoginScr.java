import javax.microedition.lcdui.Image;

public final class LoginScr extends mScreen implements IActionListener {
   private TField tfUser;
   private TField tfPass;
   private TField tfRegPass;
   private TField tfEmail;
   private static LoginScr gI;
   private int focus;
   private int wC;
   private int yL;
   private int defYL;
   private boolean isCheck = false;
   private boolean isRes = false;
   private Command1 cmdLogin;
   private Command1 cmdCheck;
   private Command1 cmdFogetPass;
   private Command1 cmdRes;
   public static int a;
   public static Image b;
   private int s;
   private String[] t;
   private int u = -1;
   private int v = 2;
   private int w = 0;
   private int x = -40;
   private int y = 1;
   public static boolean c;
   private String z = "";

   public static void a() {
      a = 0;
      b = GameCanvas.loadImage("/tt.png");
   }

   public final void switchToMe() {
      if (mResources.c("random") == null) {
         mResources.a("random", SelectServerScr.f());
      }

      this.yL = -50;
      this.isRes = false;
      GameScr.gH = GameCanvas.aa;
      int var1;
      if (GameCanvas.as == 2) {
         GameCanvas.j();
      } else {
         var1 = TileMap.bgID;
         GameCanvas.j();
      }

      super.switchToMe();
      if (GameScr.instance != null) {
         GameScr.instance = null;
      }

      if (GameCanvas.menu != null) {
         GameCanvas.menu = new Menu();
      }

      GameCanvas.c = false;
      if ((var1 = mResources.d("isSoftKey")) <= 0) {
         mResources.a("isSoftKey", 1);
         GameScr.fe = true;
      } else if (var1 == 1) {
         GameScr.fe = true;
      } else if (var1 == 2) {
         GameScr.fe = false;
      }

      if ((var1 = mResources.d("isSound")) < 0) {
         mResources.a("isSound", 1);
         Sound.isSound = true;
      } else if (var1 == 1) {
         Sound.isSound = true;
      } else if (var1 == 2) {
         Sound.isSound = false;
      }

      super.left = this.cmdRes = new Command1("Q.M\u1eadt Kh\u1ea9u", this, 2005, (Object)null);
   }

   public final void b() {
      this.isRes = true;
      this.yL = -50;
      GameScr.gH = GameCanvas.aa;
      if (GameCanvas.as == 2) {
         GameCanvas.j();
      } else {
         byte var1 = TileMap.bgID;
         GameCanvas.j();
      }

      super.switchToMe();
      if (GameScr.instance != null) {
         GameScr.instance = null;
      }

      if (GameCanvas.menu != null) {
         GameCanvas.menu = new Menu();
      }

      GameCanvas.c = false;
      super.left = this.cmdRes = new Command1("H\u1ee7y", this, 20051, (Object)null);
   }

   public LoginScr() {
      gI = this;
      this.isRes = false;
      if ((TileMap.bgID = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || TileMap.bgID == 6) {
         TileMap.bgID = 4;
      }

      GameScr.a(true);
      GameScr.gW23 = 100;
      if (GameCanvas.aa > 200) {
         this.defYL = GameCanvas.ac - 80;
      } else {
         this.defYL = GameCanvas.ac - 65;
      }

      this.yL = -50;
      this.wC = GameCanvas.z - 30;
      if (this.wC < 135) {
         this.wC = 135;
      }

      if (this.wC > 155) {
         this.wC = 155;
      }

      this.s = GameCanvas.ac - mScreen.fn - 5;
      if (GameCanvas.aa <= 160) {
         this.s = 20;
      }

      this.tfUser = new TField();
      this.tfUser.j = mResources.ci;
      this.tfUser.a = GameCanvas.ab - 20 - 57;
      this.tfUser.b = this.s;
      this.tfUser.c = this.wC;
      this.tfUser.d = mScreen.fn + 2;
      this.tfUser.e = true;
      this.tfUser.c(3);
      this.tfPass = new TField();
      this.tfPass.j = mResources.cj;
      this.tfPass.a = GameCanvas.ab - 20 - 57;
      this.tfPass.b = this.s += 35;
      this.tfPass.c = this.wC;
      this.tfPass.d = mScreen.fn + 2;
      this.tfPass.e = false;
      this.tfPass.c(2);
      this.tfRegPass = new TField();
      this.tfRegPass.j = mResources.cp;
      this.tfRegPass.a = GameCanvas.ab - 20 - 57;
      this.tfRegPass.b = this.s += 35;
      this.tfRegPass.c = this.wC;
      this.tfRegPass.d = mScreen.fn + 2;
      this.tfRegPass.e = false;
      this.tfRegPass.c(2);
      this.tfEmail = new TField();
      this.tfEmail.j = "Email/S\u1ed1 di \u0111\u1ed9ng";
      this.tfEmail.a = GameCanvas.ab - 20 - 57;
      this.tfEmail.b = this.s += 35;
      this.tfEmail.c = this.wC;
      this.tfEmail.d = mScreen.fn + 2;
      this.tfEmail.e = false;
      this.tfEmail.c(3);
      this.isCheck = true;
      if (SelectServerScr.uname != null) {
         if (SelectServerScr.uname.startsWith("tmpusr")) {
            this.tfUser.a("");
            this.tfPass.a("");
         } else {
            this.tfUser.a(SelectServerScr.uname);
            this.tfPass.a(SelectServerScr.pass);
         }
      }

      this.focus = 0;
      this.cmdLogin = new Command1(mResources.ch, this, 2000, (Object)null);
      this.cmdCheck = new Command1(mResources.cq, this, 2001, (Object)null);
      this.cmdFogetPass = new Command1(mResources.ch, this, 2002, (Object)null);
      new Command1(mResources.ct, this, 2004, (Object)null);
      if (!this.isRes) {
         super.left = this.cmdRes = new Command1("Q.M\u1eadt Kh\u1ea9u", this, 2005, (Object)null);
      } else {
         super.left = this.cmdRes = new Command1("H\u1ee7y", this, 20051, (Object)null);
      }

      if (GameCanvas.isTouch && GameCanvas.z >= 320) {
         super.center = null;
         super.right = this.cmdLogin;
      } else {
         super.center = this.cmdLogin;
         super.right = this.tfUser.k;
      }

   }

   public static LoginScr mgI() {
      return gI;
   }

   private static void a(boolean var0) {
      GameCanvas.c = var0;
      mResources.a("isGPRS", var0 ? 1 : 2);
   }

   private void a(String var1) {
      GameMidlet.g = GameMidlet.nameServer[6];
      GameCanvas.b(mResources.dt);
      GameCanvas.d();
      GameCanvas.b(mResources.du);
      Service.gI().setClientType();
      Service.gI().requestRegisterNew(var1, this.tfPass.e(), this.tfEmail.e());
   }

   private void doLogin() {
      this.u = GameCanvas.u % mResources.af.length;
      this.t = mFont.tahoma_7_white.splitFontArray(mResources.af[this.u], GameCanvas.z - 40);
      String var1 = this.tfUser.e().toLowerCase().trim();
      String var2 = this.tfPass.e().toLowerCase().trim();
      if (var1.equals("a") && var2.equals("a")) {
         a = 1;
      } else if (var1.equals("b") && var2.equals("b")) {
         a = 2;
      }

      if (var1 != null && var2 != null && !var1.equals("")) {
         if (var2.equals("")) {
            this.focus = 1;
            this.tfUser.e = false;
            this.tfPass.e = true;
            super.right = this.tfPass.k;
            return;
         }

         GameCanvas.b(mResources.dt);
         GameCanvas.d();
         GameCanvas.b(mResources.dv);
         Service.gI().login(var1, var2, SelectServerScr.version);
         c = true;
         if (this.isCheck) {
            mResources.a("check", 1);
            mResources.a("acc", var1);
            mResources.a("pass", var2);
         } else {
            mResources.a("check", 2);
            mResources.a("acc", "");
            mResources.a("pass", "");
         }

         this.focus = 0;
      }

   }

   public final void update() {
      if (++GameScr.gW23 > GameCanvas.z * 3 + 100) {
         GameScr.gW23 = 100;
      }

      this.tfUser.d();
      this.tfPass.d();
      if (this.isRes) {
         this.tfRegPass.d();
         this.tfEmail.d();
      }

      if (this.defYL != this.yL) {
         this.yL += this.defYL - this.yL >> 1;
      }

      if (GameCanvas.isTouch) {
         super.center = null;
         if (this.isRes) {
            super.right = this.cmdFogetPass;
         } else {
            super.right = this.cmdLogin;
         }
      } else if (this.isRes) {
         super.center = this.cmdFogetPass;
      } else if (this.focus == 2) {
         super.center = this.cmdCheck;
         if (this.isCheck) {
            super.center.caption = mResources.cr;
         } else {
            super.center.caption = mResources.cq;
         }
      } else {
         super.center = this.cmdLogin;
      }

      if (this.w >= 0) {
         this.x += this.y * this.w;
         this.w += this.y * this.v;
         if (this.w <= 0) {
            this.y = -this.y;
         }

         if (this.x > 0) {
            this.y = -this.y;
            this.w -= 2 * this.v;
         }
      }

      if (this.u >= 0 && GameCanvas.u % 100 == 0) {
         ++this.u;
         if (this.u >= mResources.af.length) {
            this.u = 0;
         }

         this.t = mFont.tahoma_7_white.splitFontArray(mResources.af[this.u], GameCanvas.z - 40);
      }

   }

   public final void keyPress(int var1) {
      if (this.tfUser.e) {
         this.tfUser.keyPress(var1);
      } else if (this.tfPass.e) {
         this.tfPass.keyPress(var1);
      } else if (this.isRes && this.tfRegPass.e) {
         this.tfRegPass.keyPress(var1);
      } else if (this.isRes && this.tfEmail.e) {
         this.tfEmail.keyPress(var1);
      }

      super.keyPress(var1);
   }

   public final void a_() {
      super.a_();
   }

   public final void paint(mGraphics var1) {
      var1.a(0);
      var1.c(0, 0, GameCanvas.z, GameCanvas.aa);
      GameCanvas.paintBGGameScr(var1);
      int var2 = this.tfUser.b - 45;
      if (GameCanvas.aa <= 220) {
         var2 += 5;
      }

      if (GameCanvas.currentDialog == null) {
         if (this.isRes) {
            Paint.a(GameCanvas.ab - 85, this.tfUser.b - 15, 170, 150, var1);
         } else {
            Paint.a(GameCanvas.ab - 85, this.tfUser.b - 15, 170, 90, var1);
         }

         if (GameCanvas.aa > 160 && b != null) {
            var1.a(b, GameCanvas.ab, var2 - 2, 3);
         }

         this.tfUser.a(var1);
         this.tfPass.a(var1);
         if (this.isRes) {
            this.tfRegPass.a(var1);
            this.tfEmail.a(var1);
         }

         var1.d(0, 0, GameCanvas.z, GameCanvas.aa);
         if (GameCanvas.z > 200) {
            if (this.tfUser.e().equals("")) {
               if (!this.tfUser.e) {
                  mFont.tahoma_7b_white.a(var1, mResources.ci, this.tfUser.a + 5, this.tfUser.b + 7, 0);
               } else {
                  mFont.tahoma_7_grey.a(var1, mResources.ci, this.tfUser.a + 5, this.tfUser.b + 7, 0);
               }
            }

            if (this.tfPass.e().equals("")) {
               if (!this.tfPass.e) {
                  mFont.tahoma_7b_white.a(var1, mResources.cj, this.tfPass.a + 5, this.tfPass.b + 7, 0);
               } else {
                  mFont.tahoma_7_grey.a(var1, mResources.cj, this.tfPass.a + 5, this.tfPass.b + 7, 0);
               }
            }

            if (this.isRes) {
               if (this.tfRegPass.e().equals("")) {
                  if (!this.tfRegPass.e) {
                     mFont.tahoma_7b_white.a(var1, mResources.ck, this.tfRegPass.a + 5, this.tfRegPass.b + 7, 0);
                     mFont.tahoma_7b_white.a(var1, mResources.cj, this.tfRegPass.a + 50, this.tfRegPass.b + 7, 0);
                  } else {
                     mFont.tahoma_7_grey.a(var1, mResources.ck, this.tfRegPass.a + 5, this.tfRegPass.b + 7, 0);
                     mFont.tahoma_7_grey.a(var1, mResources.cj, this.tfRegPass.a + 50, this.tfRegPass.b + 7, 0);
                  }
               }

               if (this.tfEmail.e().equals("")) {
                  if (!this.tfEmail.e) {
                     mFont.tahoma_7b_white.a(var1, "Email/s\u1ed1 di \u0111\u1ed9ng", this.tfEmail.a + 5, this.tfEmail.b + 5, 0);
                  } else {
                     mFont.tahoma_7_grey.a(var1, "Email/s\u1ed1 di \u0111\u1ed9ng", this.tfEmail.a + 5, this.tfEmail.b + 5, 0);
                  }
               }
            }
         } else {
            if (this.tfUser.e().equals("")) {
               mFont.tahoma_7b_white.a(var1, mResources.cl, this.tfUser.a - 35, this.tfUser.b + 7, 0);
            }

            if (this.tfPass.e().equals("")) {
               mFont.tahoma_7b_white.a(var1, mResources.cm, this.tfPass.a - 35, this.tfPass.b + 7, 0);
            }

            if (this.isRes) {
               mFont.tahoma_7b_white.a(var1, mResources.cn, this.tfRegPass.a - 35, this.tfRegPass.b - 1, 0);
               mFont.tahoma_7b_white.a(var1, mResources.cm, this.tfRegPass.a - 35, this.tfRegPass.b + 13, 0);
               mFont.tahoma_7b_white.a(var1, "Email/s\u1ed1 di \u0111\u1ed9ng", this.tfEmail.a - 35, this.tfEmail.b + 5, 0);
            }
         }
      } else if (this.t != null) {
         for(var2 = 0; var2 < this.t.length; ++var2) {
            mFont.tahoma_7_white.a(var1, this.t[var2], GameCanvas.z / 2, this.tfUser.b - 15 + var2 * 10, 2, mFont.tahoma_7_grey);
         }
      }

      String var3 = SelectServerScr.version;
//      if (c) {
//         var3 = Class_ch.b().l;
//      }

      mFont.tahoma_7_grey.a(var1, var3, GameCanvas.z - 5, 5, 1);
      super.paint(var1);
   }

   public final void updateKey() {
      if (GameCanvas.k[2]) {
         --this.focus;
         if (this.focus < 0) {
            this.focus = 3;
         }
      } else if (GameCanvas.k[8]) {
         ++this.focus;
         if (this.focus > 3) {
            this.focus = 0;
         }
      }

      if (GameCanvas.k[2] || GameCanvas.k[8]) {
         GameCanvas.l();
         if (this.focus == 1) {
            this.tfUser.e = false;
            this.tfPass.e = true;
            this.tfRegPass.e = false;
            this.tfEmail.e = false;
            super.right = this.tfPass.k;
         } else if (this.focus == 0) {
            this.tfUser.e = true;
            this.tfPass.e = false;
            this.tfRegPass.e = false;
            this.tfEmail.e = false;
            super.right = this.tfUser.k;
         } else {
            this.tfUser.e = false;
            this.tfPass.e = false;
            if (this.isRes) {
               if (this.focus == 2) {
                  this.tfRegPass.e = true;
                  this.tfEmail.e = false;
                  super.right = this.tfRegPass.k;
               } else if (this.focus == 3) {
                  this.tfEmail.e = true;
                  this.tfRegPass.e = false;
                  super.right = this.tfEmail.k;
               }
            }
         }
      }

      if (GameCanvas.o) {
         if (GameCanvas.b(this.tfUser.a, this.tfUser.b, this.tfUser.c, this.tfUser.d)) {
            this.focus = 0;
         } else if (GameCanvas.b(this.tfPass.a, this.tfPass.b, this.tfPass.c, this.tfPass.d)) {
            this.focus = 1;
         } else {
            if (this.isRes) {
               if (GameCanvas.b(this.tfRegPass.a, this.tfRegPass.b, this.tfRegPass.c, this.tfRegPass.d)) {
                  this.focus = 2;
               } else if (GameCanvas.b(this.tfEmail.a, this.tfEmail.b, this.tfEmail.c, this.tfEmail.d)) {
                  this.focus = 3;
               }
            } else if (GameCanvas.b(this.tfUser.a - 20, GameCanvas.ac + 40, 80, 20)) {
               this.isCheck = !this.isCheck;
            }

            this.focus = 2;
         }
      }

      super.updateKey();
      GameCanvas.l();
   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 1002:
            this.isRes = true;
            this.tfRegPass.e = false;
            this.tfEmail.e = false;
            this.tfPass.e = false;
            this.tfUser.e = true;
            super.right = this.tfUser.k;
            super.left = new Command1(mResources.dn, this, 10021, (Object)null);
            return;
         case 1003:
            try {
               GameMidlet.instance.platformRequest("http://ninjaschool.vn");
               return;
            } catch (Exception var5) {
               var5.printStackTrace();
               return;
            }
         case 1004:
            MyVector var3 = new MyVector();
            var1 = mResources.d("lowGraphic");
            if (!GameCanvas.isTouch) {
               if (var1 == 1) {
                  var3.addElement(new Command1(mResources.cu, this, 10041, (Object)null));
               } else {
                  var3.addElement(new Command1(mResources.cv, this, 10042, (Object)null));
               }
            }

            var3.addElement(new Command1(mResources.am, this, 1006, (Object)null));
            if (GameCanvas.currentScreen == this) {
               var3.addElement(new Command1(mResources.an, this, 1009, (Object)null));
            }

            GameCanvas.menu.startAt(var3);
            return;
         case 1005:
            GameCanvas.a(mResources.dd, new Command1("3G/Wifi", this, 3000, (Object)null), new Command1("GPRS", this, 3001, (Object)null));
            return;
         case 1006:
            GameCanvas.a(mResources.ap, new Command1(mResources.dm, this, 10061, (Object)null), new Command1(mResources.ce, GameCanvas.c(), 8882, (Object)null));
            return;
         case 1007:
            if (Sound.isSound = !Sound.isSound) {
               mResources.a("isSound", 1);
               return;
            }

            mResources.a("isSound", 2);
            System.out.println("tat am thanh");
            return;
         case 1009:
            mResources.a();
            return;
         case 2000:
            if (!this.tfUser.e().equals("") && !this.tfPass.e().equals("")) {
               SelectServerScr.unameChange = this.tfUser.e();
               SelectServerScr.passChange = this.tfPass.e();
            }

            GameCanvas.afselectsvScr.switchToMe();
            return;
         case 2001:
            if (this.isCheck) {
               this.isCheck = false;
               return;
            }

            this.isCheck = true;
            return;
         case 2002:
            if (this.tfUser.e().equals("")) {
               GameCanvas.a(mResources.cw);
               return;
            } else {
               char[] var6 = this.tfUser.e().toCharArray();

               for(var1 = 0; var1 < var6.length; ++var1) {
                  if (!TField.a(var6[var1])) {
                     GameCanvas.a(mResources.cx);
                     return;
                  }
               }

               if (this.tfPass.e().equals("")) {
                  GameCanvas.a(mResources.cy);
                  return;
               } else if (this.tfRegPass.e().equals("")) {
                  GameCanvas.a(mResources.cz);
                  return;
               } else {
                  this.tfRegPass.e().equals("");
                  if (this.tfUser.e().length() < 5) {
                     GameCanvas.a(mResources.da);
                     return;
                  } else if (!this.tfPass.e().equals(this.tfRegPass.e())) {
                     GameCanvas.a(mResources.db);
                     return;
                  } else {
                     if (!this.tfEmail.e().equals("")) {
                        GameCanvas.msgdlg.setInfo(mResources.dc[0] + " " + this.tfUser.e() + ", " + mResources.dc[1], new Command1(mResources.dm, this, 4000, (Object)null), (Command1)null, new Command1(mResources.ce, GameCanvas.instance, 8882, (Object)null));
                        GameCanvas.currentDialog = GameCanvas.msgdlg;
                        return;
                     }

                     GameCanvas.a("B\u1ea1n ch\u01b0a nh\u1eadp Email/s\u1ed1 di \u0111\u1ed9ng, Email/s\u1ed1 di \u0111\u1ed9ng gi\u00fap b\u1ea1n l\u1ea5y l\u1ea1i m\u1eadt kh\u1ea9u khi m\u1ea5t m\u1eadt kh\u1ea9u", new Command1("Ti\u1ebfp T\u1ee5c", this, 4001, (Object)null), new Command1(mResources.ce, GameCanvas.instance, 8882, (Object)null));
                     return;
                  }
               }
            }
         case 2003:
            GameMidlet.a("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
            return;
         case 2004:
            GameCanvas.inputDlg.a(mResources.kh, new Command1(mResources.ch, this, 20041, (Object)null), 0);
            return;
         case 2005:
            GameCanvas.a("B\u1ea1n c\u00f3 mu\u1ed1n reset m\u1eadt kh\u1ea9u kh\u00f4ng?", new Command1(mResources.ch, this, 20052, (Object)null), new Command1(mResources.ce, GameCanvas.instance, 8882, (Object)null));
            return;
         case 3000:
            a(false);
            GameCanvas.n();
            return;
         case 3001:
            a(true);
            GameCanvas.n();
            return;
         case 4000:
            this.a(this.tfUser.e());
            return;
         case 4001:
            this.a(this.tfUser.e());
            return;
         case 10021:
            this.isRes = false;
            this.tfRegPass.e = false;
            this.tfPass.e = false;
            this.tfUser.e = true;
            super.right = this.tfUser.k;
            super.left = this.cmdRes;
            return;
         case 10041:
            mResources.a("lowGraphic", 0);
            GameCanvas.a(mResources.co, 8885);
            return;
         case 10042:
            mResources.a("lowGraphic", 1);
            GameCanvas.a(mResources.co, 8885);
            return;
         case 10051:
            mResources.a("isSoftKey", 1);
            GameScr.fe = true;
            return;
         case 10052:
            mResources.a("isSoftKey", 2);
            GameScr.fe = false;
            return;
         case 10061:
            GameCanvas.n();
            mResources.a("indLanguage", -1);
            GameMidlet.instance.notifyDestroyed();
            return;
         case 20001:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[1];
            GameMidlet.port = GameMidlet.portList[1];
            GameMidlet.serverLogin = GameMidlet.language[1];
            var1 = GameMidlet.serverLoginList[1];
            mResources.a("indServer", var1);
            this.doLogin();
            return;
         case 20002:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[2];
            GameMidlet.port = GameMidlet.portList[2];
            GameMidlet.serverLogin = GameMidlet.language[2];
            var1 = GameMidlet.serverLoginList[2];
            mResources.a("indServer", var1);
            this.doLogin();
            return;
         case 20003:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[3];
            GameMidlet.port = GameMidlet.portList[3];
            GameMidlet.serverLogin = GameMidlet.language[3];
            var1 = GameMidlet.serverLoginList[3];
            mResources.a("indServer", var1);
            this.doLogin();
            return;
         case 20004:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[4];
            GameMidlet.port = GameMidlet.portList[4];
            GameMidlet.serverLogin = GameMidlet.language[4];
            var1 = GameMidlet.serverLoginList[4];
            mResources.a("indServer", var1);
            this.doLogin();
            return;
         case 20005:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[5];
            GameMidlet.port = GameMidlet.portList[5];
            GameMidlet.serverLogin = GameMidlet.language[5];
            var1 = GameMidlet.serverLoginList[5];
            mResources.a("indServer", var1);
            this.doLogin();
            return;
         case 20006:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[6];
            GameMidlet.port = GameMidlet.portList[6];
            GameMidlet.serverLogin = GameMidlet.language[6];
            var1 = GameMidlet.serverLoginList[6];
            mResources.a("indServer", var1);
            this.doLogin();
            return;
         case 20041:
            this.z = GameCanvas.inputDlg.tfInput.e().toString();
            GameCanvas.n();
            if (this.z.equals("")) {
               GameCanvas.a(mResources.cw);
               return;
            }

            GameCanvas.a(mResources.de, new Command1(mResources.br, this, 200421, (Object)null), new Command1(mResources.ce, this, 200422, (Object)null));
            return;
         case 20051:
            GameScr.gI().switchToMe();
            return;
         case 20052:
            GameMidlet.a("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
            return;
         case 200041:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[6];
            GameMidlet.port = 14444;
            var1 = GameMidlet.serverLoginList[6];
            mResources.a("indServer", var1);
            this.doLogin();
            return;
         case 200042:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[6];
            GameMidlet.port = 14444;
            var1 = GameMidlet.serverLoginList[6];
            mResources.a("indServer", var1);
            this.doLogin();
            return;
         case 200421:
            GameCanvas.n();
            String var4 = this.z;
            GameMidlet.g = GameMidlet.nameServer[6];
            GameCanvas.b(mResources.dt);
            GameCanvas.d();
            GameCanvas.b(mResources.ag);
            Service.gI().requestForgetPass(var4);
            return;
         case 200422:
            GameCanvas.a(mResources.b(mResources.pj, this.z));
            return;
         default:
      }
   }

   public static void h() {
      gI = null;
      a = 0;
      b = null;
      c = false;
   }

   static {
      Main.main(39);
      a();
   }
}

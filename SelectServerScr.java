public final class SelectServerScr extends mScreen implements IActionListener {
   private int popupW;
   private int popupH;
   private int popupX;
   private int popupY;
   private int indexRow = -1;
   private static String[] menu;
   public static String uname;
   public static String pass;
   public static String unameChange;
   public static String passChange;
   private static Command1 cmdChoiMoi;
   private static Command1 cmdDoiTaiKhoan;
   private static Command1 cmdChoiTiep;
   private static Command1 cmdChonServer;
   private static Command1[][] cmd;
   public static String version = "1.8.0";
   public static void a() {
      unameChange = "";
      passChange = "";
      cmdChoiMoi = null;
      cmdDoiTaiKhoan = null;
      cmdChoiTiep = null;
      cmdChonServer = null;
      cmd = (Command1[][])null;
      uname = mResources.c("acc");
      pass = mResources.c("pass");
      if (uname == null) {
         uname = "";
      }

      if (pass == null) {
         pass = "";
      }

   }

   public SelectServerScr() {
      GameCanvas.menu.menuSelectedItem = GameMidlet.serverLoginList[6];
      GameMidlet.g = GameMidlet.nameServer[6];

      for(int var1 = 0; var1 < GameMidlet.serverLoginList.length; ++var1) {
         if (mResources.d("indServer") == GameMidlet.serverLoginList[var1]) {
            GameCanvas.menu.menuSelectedItem = GameMidlet.serverLoginList[var1];
            GameMidlet.g = GameMidlet.nameServer[var1];
            return;
         }
      }

   }

   public final void switchToMe() {
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

      if ((TileMap.bgID = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || TileMap.bgID == 6) {
         TileMap.bgID = 4;
      }

      GameScr.a(true);
      GameScr.gW23 = 100;
      this.popupW = 170;
      this.popupH = 175;
      if (GameCanvas.z == 128 || GameCanvas.aa <= 208) {
         this.popupW = 126;
         this.popupH = 160;
      }

      this.popupX = GameCanvas.z / 2 - this.popupW / 2;
      this.popupY = GameCanvas.aa / 2 - this.popupH / 2;
      if (GameCanvas.aa <= 250) {
         this.popupY -= 10;
      }

      super.right = new Command1(mResources.cf, GameCanvas.instance, 8885, (Object)null);
      this.indexRow = -1;
      if (!GameCanvas.isTouch) {
         this.indexRow = 0;
      }

      if (GameCanvas.isTouch && GameCanvas.z >= 320) {
         super.right.x = GameCanvas.z / 2 + 88;
      }

      if (cmdChoiMoi == null) {
         cmdChoiMoi = new Command1(GameCanvas.isTouch ? "" : mResources.ch, this, 1000, (Object)null);
         cmdDoiTaiKhoan = new Command1(GameCanvas.isTouch ? "" : mResources.ch, this, 1001, (Object)null);
         cmdChonServer = new Command1(GameCanvas.isTouch ? "" : mResources.ch, this, 1002, (Object)null);
         cmdChoiTiep = new Command1(GameCanvas.isTouch ? "" : mResources.ch, this, 1003, (Object)null);
         cmd = new Command1[][]{{cmdChoiMoi, cmdDoiTaiKhoan, cmdChonServer}, {cmdChoiTiep, cmdChoiMoi, cmdDoiTaiKhoan, cmdChonServer}};
      }

      if ((uname == null || uname.equals("")) && unameChange.equals("")) {
         menu = new String[]{mResources.sm, mResources.so, mResources.sp};
      } else {
         menu = new String[]{mResources.sn, mResources.sm, mResources.so, mResources.sp};
      }

      GameCanvas.menu.menuSelectedItem = GameMidlet.serverLoginList[6];
      GameMidlet.g = GameMidlet.nameServer[6];

      for(var1 = 0; var1 < GameMidlet.serverLoginList.length; ++var1) {
         if (mResources.d("indServer") == GameMidlet.serverLoginList[var1]) {
            GameCanvas.menu.menuSelectedItem = GameMidlet.serverLoginList[var1];
            GameMidlet.g = GameMidlet.nameServer[var1];
            break;
         }
      }

      if (mResources.c("random") == null) {
         mResources.a("random", f());
      }

   }

   public final void paint(mGraphics var1) {
      var1.a(0);
      var1.c(0, 0, GameCanvas.z, GameCanvas.aa);
      GameCanvas.paintBGGameScr(var1);
      var1.a(LoginScr.b, GameCanvas.ab - LoginScr.b.getWidth() / 2, this.popupY + 10 - LoginScr.b.getHeight() / 2, 0);
      if (GameCanvas.menu.menuSelectedItem == -1) {
         GameCanvas.menu.menuSelectedItem = 0;
      }

      int var2 = this.popupY + 50;

      for(int var3 = 0; var3 < menu.length; ++var3) {
         var1.a(Paint.COLORDARK);
         var1.c(this.popupX + 10, var2 + var3 * 35, this.popupW - 20, 28);
         Paint.b(this.popupX + 10, var2 + var3 * 35, this.popupW - 20, 28, var1);
         if (var3 == this.indexRow) {
            var1.a(Paint.COLORLIGHT);
            var1.c(this.popupX + 10, var2 + var3 * 35, this.popupW - 20, 28);
            Paint.b(this.popupX + 10, var2 + var3 * 35, this.popupW - 20, 28, var1);
         }

         if (var3 < menu.length) {
            if (uname.equals("") && unameChange.equals("")) {
               if (var3 == 2) {
                  mFont.tahoma_7b_white.a(var1, menu[var3] + ServerList.list[GameCanvas.menu.menuSelectedItem], this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
               } else {
                  mFont.tahoma_7b_white.a(var1, menu[var3], this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
               }
            } else if (var3 == 0) {
               mFont.tahoma_7b_white.a(var1, menu[var3] + (!unameChange.equals("") ? ": " + unameChange : (uname.startsWith("tmpusr") ? "" : ": " + uname)), this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
            } else if (var3 == 3) {
               mFont.tahoma_7b_white.a(var1, menu[var3] + ServerList.list[GameCanvas.menu.menuSelectedItem], this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
            } else {
               mFont.tahoma_7b_white.a(var1, menu[var3], this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
            }
         }
      }

      if (GameCanvas.currentDialog == null) {
         Paint.a(var1, super.left, super.center, super.right);
      }

      super.paint(var1);
   }

   public final void update() {
      if (uname.equals("") && unameChange.equals("")) {
         if (this.indexRow >= 0 && this.indexRow < cmd[0].length) {
            super.center = cmd[0][this.indexRow];
         }
      } else if (this.indexRow >= 0 && this.indexRow < cmd[1].length) {
         super.center = cmd[1][this.indexRow];
      }

      if (++GameScr.gW23 > GameCanvas.z * 3 + 100) {
         GameScr.gW23 = 100;
      }

      super.update();
   }

   public final void updateKey() {
      if (!GameCanvas.k[2] && !GameCanvas.k[4]) {
         if (GameCanvas.k[8] || GameCanvas.k[6]) {
            ++this.indexRow;
            if (this.indexRow > menu.length - 1) {
               this.indexRow = 0;
            }
         }
      } else {
         --this.indexRow;
         if (this.indexRow < 0) {
            this.indexRow = menu.length - 1;
         }
      }

      if (GameCanvas.o && GameCanvas.b(this.popupX + 10, this.popupY + 45, this.popupW - 10, 140)) {
         if (GameCanvas.n) {
            this.indexRow = (GameCanvas.q - (this.popupY + 45)) / 35;
         }

         if (uname.equals("") && unameChange.equals("")) {
            if (this.indexRow >= 0 && this.indexRow < cmd[0].length) {
               cmd[0][this.indexRow].a();
            }
         } else if (this.indexRow >= 0 && this.indexRow < cmd[1].length) {
            cmd[1][this.indexRow].a();
         }
      }

      super.updateKey();
      GameCanvas.l();
   }

   private static void i() {
      if (!Session_ME.getInstance().connected) {
         GameCanvas.d();
      }

      GameCanvas.o();
   }

   public static boolean b() {
      return uname != null && (uname.startsWith("tmpusr") || uname.equals(""));
   }

   public static String f() {
      String var0 = "";

      for(int var1 = 0; var1 < 12; ++var1) {
         String var2 = Integer.toString(Res.random(0, 9));
         var0 = var0 + var2;
      }

      return var0;
   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 1000:
            if (b() && !uname.equals("")) {
               GameCanvas.a(mResources.sl, new Command1(mResources.sn, this, 10001, (Object)null), new Command1(mResources.ce, GameCanvas.instance, 8882, (Object)null));
               return;
            }

            i();
            Service.gI().login("-1", "12345", version);
            return;
         case 1001:
            if (b() && !uname.equals("") && unameChange.equals("")) {
               GameCanvas.a(mResources.sl, new Command1(mResources.sq, this, 10004, (Object)null), new Command1(mResources.ce, GameCanvas.instance, 8882, (Object)null));
               return;
            }

            GameCanvas.loginScr.switchToMe();
            return;
         case 1002:
            MyVector var3 = new MyVector();
            if (LoginScr.a == 1) {
               var3.addElement(new Command1("LOCAL 44", this, 200041, (Object)null));
            } else if (LoginScr.a == 2) {
               var3.addElement(new Command1("LOCAL 46", this, 200042, (Object)null));
            }

            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[0]], this, 20000, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[1]], this, 20001, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[2]], this, 20002, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[3]], this, 20003, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[4]], this, 20004, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[5]], this, 20005, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[6]], this, 20006, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[7]], this, 20007, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[8]], this, 20008, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[9]], this, 200043, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[10]], this, 200044, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[11]], this, 200045, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[12]], this, 200046, (Object)null));
            var3.addElement(new Command1(ServerList.list[GameMidlet.serverLoginList[13]], this, 200047, (Object)null));
            GameCanvas.menu.startAt(var3);
            if (mResources.d("indServer") != -1 && !GameCanvas.isTouch) {
               GameCanvas.menu.menuSelectedItem = mResources.d("indServer");
            }

            return;
         case 1003:
            i();
            if (!unameChange.equals("")) {
               uname = unameChange;
               pass = passChange;
               unameChange = "";
               passChange = "";
               mResources.a("acc", uname);
               mResources.a("pass", pass);
            }

            Service.gI().login(uname, pass, version);
            return;
         case 10001:
            i();
            Service.gI().login("-1", "12345", version);
            if (!unameChange.equals("")) {
               uname = unameChange;
               pass = passChange;
               unameChange = "";
               passChange = "";
               mResources.a("acc", uname);
               mResources.a("pass", pass);
               return;
            }
         case 200043:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[9];
            GameMidlet.port = GameMidlet.portList[9];
            GameMidlet.serverLogin = GameMidlet.language[9];
            mResources.a("indServer", GameMidlet.serverLoginList[9]);
            return;
         case 10004:
            GameCanvas.currentDialog = null;
            GameCanvas.loginScr.switchToMe();
            return;
         case 20000:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[0];
            GameMidlet.port = GameMidlet.portList[0];
            GameMidlet.serverLogin = GameMidlet.language[0];
            mResources.a("indServer", GameMidlet.serverLoginList[0]);
            return;
         case 20001:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[1];
            GameMidlet.port = GameMidlet.portList[1];
            GameMidlet.serverLogin = GameMidlet.language[1];
            mResources.a("indServer", GameMidlet.serverLoginList[1]);
            return;
         case 20002:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[2];
            GameMidlet.port = GameMidlet.portList[2];
            GameMidlet.serverLogin = GameMidlet.language[2];
            mResources.a("indServer", GameMidlet.serverLoginList[2]);
            return;
         case 20003:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[3];
            GameMidlet.port = GameMidlet.portList[3];
            GameMidlet.serverLogin = GameMidlet.language[3];
            mResources.a("indServer", GameMidlet.serverLoginList[3]);
            return;
         case 20004:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[4];
            GameMidlet.port = GameMidlet.portList[4];
            GameMidlet.serverLogin = GameMidlet.language[4];
            mResources.a("indServer", GameMidlet.serverLoginList[4]);
            return;
         case 20005:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[5];
            GameMidlet.port = GameMidlet.portList[5];
            GameMidlet.serverLogin = GameMidlet.language[5];
            mResources.a("indServer", GameMidlet.serverLoginList[5]);
            return;
         case 20006:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[6];
            GameMidlet.port = GameMidlet.portList[6];
            GameMidlet.serverLogin = GameMidlet.language[6];
            mResources.a("indServer", GameMidlet.serverLoginList[6]);
            return;
         case 20007:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[7];
            GameMidlet.port = GameMidlet.portList[7];
            GameMidlet.serverLogin = GameMidlet.language[7];
            mResources.a("indServer", GameMidlet.serverLoginList[7]);
            return;
         case 20008:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[8];
            GameMidlet.port = GameMidlet.portList[8];
            GameMidlet.serverLogin = GameMidlet.language[8];
            mResources.a("indServer", GameMidlet.serverLoginList[8]);
            return;
         case 200041:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[6];
            GameMidlet.port = 14444;
            GameMidlet.serverLogin = GameMidlet.language[6];
            mResources.a("indServer", GameMidlet.serverLoginList[6]);
            return;
         case 200042:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[6];
            GameMidlet.port = 14446;
            GameMidlet.serverLogin = GameMidlet.language[6];
            mResources.a("indServer", GameMidlet.serverLoginList[6]);
            return;
         case 200044:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[10];
            GameMidlet.port = GameMidlet.portList[10];
            GameMidlet.serverLogin = GameMidlet.language[10];
            mResources.a("indServer", GameMidlet.serverLoginList[10]);
            return;
         case 200045:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[11];
            GameMidlet.port = GameMidlet.portList[11];
            GameMidlet.serverLogin = GameMidlet.language[11];
            mResources.a("indServer", GameMidlet.serverLoginList[11]);
            return;
         case 200046:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[12];
            GameMidlet.port = GameMidlet.portList[12];
            GameMidlet.serverLogin = GameMidlet.language[12];
            mResources.a("indServer", GameMidlet.serverLoginList[12]);
            return;
         case 200047:
            GameCanvas.menu.showMenu = false;
            GameMidlet.g = GameMidlet.nameServer[13];
            GameMidlet.port = GameMidlet.portList[13];
            GameMidlet.serverLogin = GameMidlet.language[13];
            mResources.a("indServer", GameMidlet.serverLoginList[13]);
            return;
         default:
      }
   }

   public static void h() {
      menu = null;
      uname = null;
      pass = null;
      unameChange = null;
      passChange = null;
      cmdChoiMoi = null;
      cmdDoiTaiKhoan = null;
      cmdChoiTiep = null;
      cmdChonServer = null;
      cmd = (Command1[][])null;
   }

   static {
      Main.main(17);
      a();
   }
}

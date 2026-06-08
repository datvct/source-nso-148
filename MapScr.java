import javax.microedition.lcdui.Image;

public final class MapScr extends mScreen implements IActionListener {
   private static MapScr instance;
   private boolean modeCurrentMap;
   private static Image imgMap;
   private static Image imgX;
   private static Image imgPointer;
   private static int mapW;
   private static int mapH;
   private static int mfx;
   private static int mfy;
   private static int mpoint;
   private static int tick3;
   private static int mcmtoX;
   private static int mcmtoY;
   private static int mcmvx;
   private static int mcmvy;
   private static int mcmdx;
   private static int mcmdy;
   private static int mcmx;
   private static int mcmy;
   private static int mcmxLim;
   private static int mcmyLim;
   private static int taskmapId;
   private static int dx;
   private static int dy;
   private static int[] x;
   private static int[] y;
   private int maxPX;
   private int maxPY;
   private int xM;
   private int yM;
   private boolean trans = false;
   private int lastX;
   private int lastY;

   public static void init() {
      imgMap = null;
      dx = 0;
      dy = 0;
      x = new int[]{1, 156, 140, 174, 196, 195, 125, 148, 156, 173, 199, 203, 222, 264, 283, 277, 298, 307, 311, 315, 116, 90, 59, 31, 252, 55, 81, 111, 148, 187, 219, 253, 278, 304, 311, 310, 284, 309, 294, 62, 92, 117, 99, 134, 154, 175, 34, 52, 40, 78, 59, 82, 114, 179, 158, 142, 1, 215, 291, 242, 147, 301, 71, 23, 116, 126, 305, 286, 264, 20, 46, 70, 78, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
      y = new int[]{1, 68, 75, 88, 80, 107, 87, 114, 136, 160, 168, 196, 216, 219, 248, 265, 276, 260, 232, 204, 111, 82, 79, 59, 168, 33, 28, 34, 45, 20, 54, 44, 19, 40, 60, 100, 175, 165, 134, 181, 199, 208, 221, 220, 219, 221, 195, 217, 246, 244, 250, 263, 262, 241, 252, 244, 2, 240, 197, 139, 16, 18, 208, 223, 239, 186, 120, 119, 135, 107, 125, 126, 148, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
   }

   public MapScr() {
      super.right = new Command1(mResources.aq, this, 1000, (Object)null);
      super.center = new Command1(mResources.fl, this, 1001, (Object)null);
      super.left = new Command1("Chuy\u1ec3n \u0111\u1ebfn", this, 14004, (Object)null);
   }

   private void resetCMLim() {
      if (this.modeCurrentMap) {
         super.left = null;
      } else {
         super.left = new Command1("Chuy\u1ec3n \u0111\u1ebfn", this, 14004, (Object)null);
      }

      int var1 = mGraphics.a(TileMap.h);
      this.xM = (GameCanvas.z - var1) / 2;
      this.yM = (GameCanvas.aa - 20 - mGraphics.b(TileMap.h)) / 2;
      if (this.xM < 0) {
         this.xM = 0;
      }

      if (this.yM < 0) {
         this.yM = 0;
      }

      if (this.modeCurrentMap) {
         mcmxLim = var1 + 20 - GameCanvas.z;
         mcmyLim = mGraphics.b(TileMap.h) + 40 - GameCanvas.aa;
         this.maxPX = var1 + 20;
         this.maxPY = var1 + 40;
         if (this.maxPY < GameCanvas.aa - 26) {
            this.maxPY = GameCanvas.aa - 26;
         }

         if (this.maxPX < GameCanvas.z) {
            this.maxPX = GameCanvas.z;
         }

         mfx = this.xM + Char.getMyChar().cx / 12;
         mfy = this.yM + Char.getMyChar().cy / 12;
      } else {
         mcmxLim = 340 - GameCanvas.z;
         mcmyLim = 340 - GameCanvas.aa;
         mfx = x[TileMap.mapID] + dx;
         mfy = y[TileMap.mapID] + dy;
         this.maxPX = 330 + dx;
         this.maxPY = 310 + dy;
      }

      this.maxPX -= 10;
      this.maxPY -= 10;
      if (mcmxLim < 0) {
         mcmxLim = 0;
      }

      if (mcmyLim < 0) {
         mcmyLim = 0;
      }

      mcmy = 0;
      mcmx = 0;
      mcmtoY = 0;
      mcmtoX = 0;
      mcmtoX = mfx - GameCanvas.ab;
      mcmtoY = mfy - GameCanvas.ac;
   }

   public static MapScr gI() {
      if (instance == null) {
         instance = new MapScr();
      }

      return instance;
   }

   public final void switchToMe() {
      super.switchToMe();
      SmallImage.c();
      TileMap.d();
      super.right = new Command1(mResources.aq, this, 1000, (Object)null);
      super.center = new Command1(mResources.fl, this, 1001, (Object)null);
      super.left = new Command1("Chuy\u1ec3n \u0111\u1ebfn", this, 14004, (Object)null);
      if (imgMap == null) {
         imgMap = GameCanvas.loadImage("/wm.png");
         imgX = GameCanvas.loadImage("/u/x.png");
         imgPointer = GameCanvas.loadImage("/u/wpt1.png");
         mapW = mGraphics.b(imgMap);
         mapH = mGraphics.b(imgMap);
      }

      if (GameCanvas.z > mapW) {
         dx = GameCanvas.ab - mapW / 2 - 12;
      }

      if (GameCanvas.aa > mapH) {
         dy = GameCanvas.ac - mapH / 2;
      }

      this.resetCMLim();
      findMapNearestPoint();
      mFont.number_green.c();
      mFont.number_orange.c();
      mFont.number_red.c();
      mFont.number_white.c();
      mFont.number_white.c();
      mFont.number_yellow.c();
      mFont.tahoma_7.c();
      mFont.tahoma_7_blue.c();
      mFont.tahoma_7_blue1.c();
      mFont.tahoma_7_green.c();
      mFont.tahoma_7_red.c();
      mFont.tahoma_7b_blue.c();
      mFont.tahoma_7b_purple.c();
      mFont.tahoma_7b_red.c();
      mFont.tahoma_7b_white.c();
      System.gc();
      TileMap.p = TileMap.mapID;
   }

   public final void a_() {
      super.a_();
      imgMap = null;
      imgX = null;
      System.gc();
      TileMap.l();
      SmallImage.loadBigImage();
      mFont.number_green.b();
      mFont.number_orange.b();
      mFont.number_red.b();
      mFont.number_white.b();
      mFont.number_white.b();
      mFont.number_yellow.b();
      mFont.tahoma_7.b();
      mFont.tahoma_7_blue.b();
      mFont.tahoma_7_blue1.b();
      mFont.tahoma_7_green.b();
      mFont.tahoma_7_red.b();
      mFont.tahoma_7b_blue.b();
      mFont.tahoma_7b_purple.b();
      mFont.tahoma_7b_red.b();
      mFont.tahoma_7b_white.b();
   }

   public final void paint(mGraphics var1) {
      boolean var2 = false;
      var1.a(0);
      var1.c(0, 0, GameCanvas.z, GameCanvas.aa);
      var1.translate(10, 10);
      var1.translate(-mcmx, -mcmy);
      int var3;
      int var4;
      int var5;
      int var6;
      if (this.modeCurrentMap) {
         var1.a(TileMap.h, this.xM, this.yM, 0);

         for(var5 = 0; var5 < GameScr.vMobAttack.size(); ++var5) {
            Mob var7;
            var3 = (var7 = (Mob)GameScr.vMobAttack.elementAt(var5)).x / 12;
            var4 = var7.y / 12;
            if (var7.w < Char.getMyChar().clevel - 2) {
               var1.a(11184810);
            } else if (var7.w > Char.getMyChar().clevel + 2) {
               var1.a(16711680);
            } else {
               var1.a(16776960);
            }

            var1.c(this.xM + var3 - 1, this.yM + var4 - 1, 3, 3);
         }

         for(var5 = 0; var5 < GameScr.vParty.size(); ++var5) {
            Party var9;
            if ((var9 = (Party)GameScr.vParty.elementAt(var5)).c != null && var9.c != Char.getMyChar()) {
               var3 = var9.c.cx / 12;
               var4 = var9.c.cy / 12;
               if (GameCanvas.u % 10 < 8) {
                  var1.a(16777215);
                  var1.c(this.xM + var3 - 2, this.yM + var4 - 2, 5, 5);
                  var1.a(65280);
                  var1.c(this.xM + var3 - 1, this.yM + var4 - 1, 3, 3);
               }
            }
         }

         GameScr.af();

         for(var6 = 0; var6 < GameScr.vSet.size(); ++var6) {
            Npc var10;
            var3 = (var10 = (Npc)GameScr.vSet.elementAt(var6)).cx / 12;
            var4 = var10.cy / 12;
            var1.a(16777215);
            var1.c(this.xM + var3 - 2, this.yM + var4 - 2, 5, 5);
            var1.a(65280);
            var1.c(this.xM + var3 - 1, this.yM + var4 - 1, 3, 3);
            var1.a(imgX, this.xM + var3, this.yM + var4, 3);
            var2 = true;
         }

         for(byte var11 = 0; var11 < TileMap.vGo.size(); ++var11) {
            Waypoint var8;
            var3 = ((var8 = (Waypoint)TileMap.vGo.elementAt(var11)).minX + var8.maxX) / 2 / 12;
            var4 = (var8.minY + var8.maxY) / 2 / 12;
            if (GameCanvas.u % 10 < 8) {
               var1.a(0);
               var1.c(this.xM + var3 - 2, this.yM + var4 - 2, 5, 5);
               var1.a(16777215);
               var1.c(this.xM + var3 - 1, this.yM + var4 - 1, 3, 3);
            }
         }

         var3 = Char.getMyChar().cx / 12;
         var4 = Char.getMyChar().cy / 12;
         var1.a(16777215);
         var1.c(this.xM + var3 - 2, this.yM + var4 - 2, 5, 5);
         if (GameCanvas.u % 10 > 5) {
            var1.a(255);
            var1.c(this.xM + var3 - 1, this.yM + var4 - 1, 3, 3);
         }

         var1.a(imgPointer, mfx - 2, mfy, 0);
         super.paint(var1);
         if (!var2) {
            mFont.tahoma_7_white.a(var1, TileMap.mapName, 10, GameCanvas.aa - 17, 0);
         }
      } else {
         if (GameCanvas.z > mapW && GameCanvas.aa > mapH) {
            var1.a(imgMap, GameCanvas.ab, GameCanvas.ac, StaticObj.VCENTER_HCENTER);
         } else if (GameCanvas.z > mapW) {
            var1.a(imgMap, GameCanvas.ab, 0, StaticObj.TOP_HCENTER);
         } else if (GameCanvas.aa > mapH) {
            var1.a(imgMap, 0, GameCanvas.ac, StaticObj.VCENTER_LEFT);
         } else {
            var1.a(imgMap, 0, 0, 0);
         }

         if (TileMap.mapID < TileMap.v.length && TileMap.mapID >= 0) {
            var3 = 0;
            if (x[TileMap.mapID] != 1 || y[TileMap.mapID] != 1) {
               var3 = x[TileMap.mapID] < 100 ? 0 : (x[TileMap.mapID] > 200 ? 1 : 2);
               GameCanvas.a(x[TileMap.mapID] + dx, y[TileMap.mapID] + dy, var1);
            }

            var5 = 0;
            if (taskmapId >= 0) {
               var3 = x[taskmapId] < 100 ? 0 : (x[taskmapId] > 200 ? 1 : 2);
               mFont.tahoma_7_white.a(var1, TileMap.v[taskmapId], x[taskmapId] + dx, y[taskmapId] + dy - 20, var3, mFont.tahoma_7_grey);
               var1.a(imgX, x[taskmapId] + dx, y[taskmapId] + dy, 3);
               var2 = true;
               var5 = y[taskmapId] - 20;
            } else if (x[TileMap.mapID] != 1 || y[TileMap.mapID] != 1) {
               var5 = y[TileMap.mapID] - 20;
               mFont.tahoma_7_yellow.a(var1, TileMap.v[TileMap.mapID], x[TileMap.mapID] + dx, y[TileMap.mapID] + dy - 20, var3, mFont.tahoma_7_grey);
            }

            for(var6 = 0; var6 < Char.getMyChar().taskOrders.size(); ++var6) {
               TaskOrder var12;
               if ((var12 = (TaskOrder)Char.getMyChar().taskOrders.elementAt(var6)).mapId >= 0 && var12.mapId < x.length) {
                  var1.a(imgX, x[var12.mapId] + dx, y[var12.mapId] + dy, 3);
               }
            }

            if (mpoint >= 0 && (taskmapId < 0 && TileMap.mapID != mpoint || taskmapId >= 0 && mpoint != taskmapId)) {
               var3 = x[mpoint] < 100 ? 0 : (x[mpoint] > 200 ? 1 : 2);
               var6 = x[mpoint];
               if ((var4 = y[mpoint] - 20) > var5 && var4 - var5 < 30) {
                  var4 += 40;
               }

               if (var4 < var5 && var5 - var4 < 20) {
                  var4 -= 5;
               }

               mFont.tahoma_7_yellow.a(var1, TileMap.v[mpoint], var6 + dx, var4 + dy, var3, mFont.tahoma_7_grey);
            }
         }

         var1.a(imgPointer, mfx - 2, mfy, 0);
         var1.translate(-var1.b(), -var1.c());
         super.paint(var1);
      }

      if (var2) {
         var1.a(imgX, 10, 10, 3);
         mFont.tahoma_7_white.a(var1, mResources.ig, 20, 5, 0);
      }

   }

   public final void updateKey() {
      super.updateKey();
      if (++tick3 > 10000) {
         tick3 = 0;
      }

      if (mcmx != mcmtoX || mcmy != mcmtoY) {
         mcmvx = mcmtoX - mcmx << 1;
         mcmvy = mcmtoY - mcmy << 1;
         mcmdx += mcmvx;
         mcmx += mcmdx >> 4;
         mcmdx &= 15;
         mcmdy += mcmvy;
         mcmy += mcmdy >> 4;
         mcmdy &= 15;
         if (mcmx < 0) {
            mcmx = 0;
         }

         if (mcmx > mcmxLim) {
            mcmx = mcmxLim;
         }

         if (mcmy < 0) {
            mcmy = 0;
         }

         if (mcmy > mcmyLim) {
            mcmy = mcmyLim;
         }
      }

      boolean var1 = false;
      if (GameCanvas.l[2]) {
         if ((mfy -= 4) < dy - 10) {
            mfy = dy - 10;
         }

         var1 = true;
      }

      if (GameCanvas.l[8]) {
         if ((mfy += 4) > this.maxPY) {
            mfy = this.maxPY;
         }

         var1 = true;
      }

      if (GameCanvas.l[4]) {
         if ((mfx -= 4) < dx - 10) {
            mfx = dx - 10;
         }

         var1 = true;
      }

      if (GameCanvas.l[6]) {
         if ((mfx += 4) > this.maxPX) {
            mfx = this.maxPX;
         }

         var1 = true;
      }

      if (var1) {
         mcmtoX = mfx - GameCanvas.ab;
         mcmtoY = mfy - GameCanvas.ac;
         findMapNearestPoint();
      }

      GameScr.gI();
      taskmapId = GameScr.ae();
      if (GameCanvas.n && GameCanvas.q < GameCanvas.aa - mScreen.fp) {
         GameCanvas.n = false;
         this.trans = true;
         this.lastX = GameCanvas.p;
         this.lastY = GameCanvas.q;
      } else if (GameCanvas.m && this.trans) {
         mcmtoX -= GameCanvas.p - this.lastX;
         mcmtoY -= GameCanvas.q - this.lastY;
         if (mcmtoX < 0) {
            mcmtoX = 0;
         }

         if (mcmtoY < 0) {
            mcmtoY = 0;
         }

         if (mcmtoX > mcmxLim) {
            mcmtoX = mcmxLim;
         }

         if (mcmtoY > mcmyLim) {
            mcmtoY = mcmyLim;
         }

         mcmx = mcmtoX;
         mcmy = mcmtoY;
         this.lastX = GameCanvas.p;
         this.lastY = GameCanvas.q;
      }

      if (GameCanvas.o) {
         int var2 = GameCanvas.r - GameCanvas.p;
         int var3 = GameCanvas.s - GameCanvas.q;
         if (var2 < 10 && var3 < 10) {
            mfx = mcmx + GameCanvas.r - 8;
            mfy = mcmy + GameCanvas.s - 8;
            findMapNearestPoint();
         }

         this.trans = false;
         GameCanvas.o = false;
      }

      if (GameCanvas.isTouch && GameCanvas.z >= 320) {
         super.left.x = GameCanvas.z / 2 - 160;
         super.center.x = GameCanvas.z / 2 - 35;
         super.right.x = GameCanvas.z / 2 + 88;
         super.left.y = super.center.y = super.right.y = GameCanvas.aa - 26;
      }

   }

   private static void findMapNearestPoint() {
      mpoint = -1;

      for(int var0 = 0; var0 < x.length; ++var0) {
         if (Res.abs(mfx - (x[var0] + dx)) < 10 && Res.abs(mfy - (y[var0] + dy)) < 10) {
            mpoint = var0;
            return;
         }
      }

   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 1000:
            if (Char.getMyChar().cHp <= 0 || Char.getMyChar().statusMe == 14) {
               super.center = GameScr.gI().ez;
               Char.getMyChar().cHp = 0;
            }

            GameScr.gI().switchToMe();
            return;
         case 1001:
            this.modeCurrentMap = !this.modeCurrentMap;
            this.resetCMLim();
            return;
         case 14004:
            TileMap.l(mpoint);
            return;
         default:
      }
   }

   public static void close() {
      instance = null;
      imgMap = null;
      imgX = null;
      imgPointer = null;
      mapW = 0;
      mapH = 0;
      mfx = 0;
      mfy = 0;
      mpoint = 0;
      tick3 = 0;
      mcmtoX = 0;
      mcmtoY = 0;
      mcmvx = 0;
      mcmvy = 0;
      mcmdx = 0;
      mcmdy = 0;
      mcmx = 0;
      mcmy = 0;
      mcmxLim = 0;
      mcmyLim = 0;
      taskmapId = 0;
      dx = 0;
      dy = 0;
      x = null;
      y = null;
   }

   static {
      Main.main(62);
      init();
   }
}

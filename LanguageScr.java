public final class LanguageScr extends mScreen implements IActionListener {
   private int popupW;
   private int popupH;
   private int popupX;
   private int popupY;
   private int indexRow = -1;

   public final void switchToMe() {
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

      super.center = new Command1(GameCanvas.isTouch ? "" : mResources.ch, this, 1000, (Object)null);
      super.right = new Command1(mResources.cf, GameCanvas.instance, 8885, (Object)null);
      this.indexRow = -1;
      if (!GameCanvas.isTouch) {
         this.indexRow = 0;
      }

      if (GameCanvas.isTouch && GameCanvas.z >= 320) {
         super.center.x = GameCanvas.z / 2 - 35;
         super.right.x = GameCanvas.z / 2 + 88;
         super.center.y = super.right.y = GameCanvas.aa - 26;
      }

   }

   public final void paint(mGraphics var1) {
      var1.a(0);
      var1.c(0, 0, GameCanvas.z, GameCanvas.aa);
      GameCanvas.paintBGGameScr(var1);
      Paint.a(this.popupX, this.popupY, this.popupW, this.popupH, var1);
      var1.a(Paint.COLORDARK);
      var1.b(GameCanvas.ab - mFont.tahoma_8b.a(mResources.am) / 2 - 12, this.popupY + 7, mFont.tahoma_8b.a(mResources.am) + 22, 24, 6, 6);
      var1.a(Paint.COLORLIGHT);
      var1.a(GameCanvas.ab - mFont.tahoma_8b.a(mResources.am) / 2 - 12, this.popupY + 7, mFont.tahoma_8b.a(mResources.am) + 22, 24, 6, 6);
      mFont.tahoma_8b.a(var1, mResources.am, GameCanvas.ab, this.popupY + 12, 2);
      String[] var2 = mResources.ao;
      int var3 = this.popupY + 50;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var1.a(Paint.COLORDARK);
         var1.c(this.popupX + 10, var3 + var4 * 35, this.popupW - 20, 28);
         var1.a(5720393);
         var1.b(this.popupX + 10, var3 + var4 * 35, this.popupW - 20, 28);
         if (var4 == this.indexRow) {
            var1.a(Paint.COLORLIGHT);
            var1.c(this.popupX + 10, var3 + var4 * 35, this.popupW - 20, 28);
            var1.a(11053224);
            var1.b(this.popupX + 10, var3 + var4 * 35, this.popupW - 20, 28);
         }

         mFont.tahoma_7b_white.a(var1, var2[var4], this.popupX + this.popupW / 2, var3 + var4 * 35 + 8, 2);
      }

      super.paint(var1);
      Paint.a(var1, super.left, super.center, super.right);
   }

   public final void update() {
      if (++GameScr.gW23 > GameCanvas.z * 3 + 100) {
         GameScr.gW23 = 100;
      }

      super.update();
   }

   public final void updateKey() {
      if (GameCanvas.k[2] || GameCanvas.k[4] || GameCanvas.k[6] || GameCanvas.k[8]) {
         this.indexRow = this.indexRow == 0 ? 1 : 0;
      }

      if (GameCanvas.o && GameCanvas.b(this.popupX + 10, this.popupY + 45, this.popupW - 10, 70)) {
         if (GameCanvas.n) {
            this.indexRow = (GameCanvas.q - (this.popupY + 45)) / 35;
         }

         this.perform(1000, (Object)null);
      }

      super.updateKey();
      GameCanvas.l();
   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 1000:
            GameCanvas.currentDialog = null;
            var1 = mResources.h = this.indexRow == 0 ? 0 : 1;
            mResources.a("indLanguage", var1);
            mResources.b();
            mResources.a();
            GameCanvas.e();
            GameCanvas.afselectsvScr.switchToMe();
         default:
      }
   }
}

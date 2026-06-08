public final class SelectCharScr extends mScreen implements IActionListener {
   private static SelectCharScr instance;
   private int w1char = 48;
   private int h1char = 85;
   private int padchar;
   private int x;
   private int y;
   public int indexSelect;
   public int[] parthead;
   public int[] partleg;
   public int[] partbody;
   public int[] partWp;
   public int[] level;
   public String[] name;
   public String[] phai;
   public byte[] gender;
   private Command1 cmdSelect;
   private int waitToPerform;
   public boolean isNullChar = true;
   public static String k;

   public static void init() {
      k = "";
   }

   public static SelectCharScr gI() {
      if (instance == null) {
         instance = new SelectCharScr();
      }

      return instance;
   }

   public SelectCharScr() {
      if (GameCanvas.z < 160) {
         this.w1char = 32;
      }

      this.padchar = 7;
      this.x = (GameCanvas.z - 3 * this.w1char >> 1) - 5;
      this.y = GameCanvas.ac - (this.h1char >> 1) + 10;
      if (GameCanvas.isTouch && GameCanvas.z > 200) {
         this.w1char = 74;
         this.padchar = 25;
         this.h1char = 110;
         this.x = (GameCanvas.z - 3 * this.w1char >> 1) - 20;
         this.y = GameCanvas.ac - (this.h1char >> 1);
         if (GameCanvas.z < 320) {
            this.padchar = 6;
            this.x = (GameCanvas.z - 3 * this.w1char >> 1) - 6;
         }
      }

      super.left = null;
      this.cmdSelect = new Command1(mResources.dz, this, 1000, (Object)null);
      super.center = new Command1("", this, 1000, (Object)null);
      super.right = new Command1(mResources.cf, this, 1001, (Object)null);
      super.left = this.cmdSelect;
      if (GameCanvas.isTouch) {
         super.center = null;
         super.left = null;
      }

      if (GameCanvas.isTouch && GameCanvas.z >= 320) {
         super.right.x = GameCanvas.z / 2 + 88;
         super.right.y = GameCanvas.aa - 26;
      }

   }

   private void doSelect() {
      if (this.name[this.indexSelect] != null) {
         k = this.name[this.indexSelect];
         Service.gI().selectCharToPlay(this.name[this.indexSelect]);
         GameCanvas.b(mResources.ag);
         GameCanvas.isLoading = true;
      } else {
         CreateCharScr.gI().switchToMe();
      }

   }

   public final void updateKey() {
      super.updateKey();
      if (GameCanvas.k[6]) {
         ++this.indexSelect;
         if (this.indexSelect >= 3) {
            this.indexSelect = 0;
         }
      }

      if (GameCanvas.k[4]) {
         --this.indexSelect;
         if (this.indexSelect < 0) {
            this.indexSelect = 2;
         }
      }

      if (GameCanvas.m && GameCanvas.b(this.x, this.y, 3 * (this.w1char + this.padchar), this.h1char)) {
         int var1;
         if ((var1 = (GameCanvas.p - this.x) / (this.w1char + this.padchar)) > 2) {
            var1 = 2;
         }

         if (var1 < 0) {
            var1 = 0;
         }

         this.indexSelect = var1;
      }

      if (GameCanvas.o) {
         if (GameCanvas.b(this.x, this.y, 3 * (this.w1char + this.padchar), this.h1char)) {
            this.waitToPerform = 5;
         } else {
            this.indexSelect = -1;
         }
      }

      GameCanvas.m();
      GameCanvas.l();
   }

   public final void update() {
      if (++GameScr.gW23 > GameCanvas.z * 3 + 100) {
         GameScr.gW23 = 100;
      }

      if (this.waitToPerform > 0) {
         --this.waitToPerform;
         if (this.waitToPerform == 0 && this.indexSelect >= 0) {
            this.doSelect();
         }
      }

   }

   public final void switchToMe() {
      TileMap.d();
      System.gc();
      super.switchToMe();

      for(int var1 = 0; var1 < this.name.length; ++var1) {
         if (this.name[var1] != null) {
            this.isNullChar = false;
            break;
         }
      }

      if (this.isNullChar) {
         CreateCharScr.gI().switchToMe();
      }

   }

   public final void paint(mGraphics var1) {
      GameCanvas.paintBGGameScr(var1);

      int var2;
      for(var2 = 0; var2 < 3; ++var2) {
         if (this.indexSelect == var2) {
            Paint.d(this.x + var2 * (this.w1char + this.padchar), this.y, this.w1char, this.h1char, var1);
         } else {
            Paint.c(this.x + var2 * (this.w1char + this.padchar), this.y, this.w1char, this.h1char, var1);
         }

         Paint.b(this.x + var2 * (this.w1char + this.padchar), this.y, this.w1char, this.h1char, var1);
      }

      for(var2 = 0; var2 < 3; ++var2) {
         if (this.name[var2] != null) {
            Part var3 = GameScr.parts[this.parthead[var2]];
            Part var4 = GameScr.parts[this.partleg[var2]];
            Part var5 = GameScr.parts[this.partbody[var2]];
            Part var6 = GameScr.parts[this.partWp[var2]];
            int var7;
            if (var3.a != null && var3.a.length >= 8) {
               for(var7 = 0; var7 < var3.a.length; ++var7) {
                  if (var3.a[var7] == null || !SmallImage.drawSmallImageNew(var3.a[var7].id)) {
                     Char.getMyChar();
                     var3 = Char.b(this.gender[var2]);
                     break;
                  }
               }
            } else {
               Char.getMyChar();
               var3 = Char.b(this.gender[var2]);
            }

            var7 = this.x + var2 * (this.w1char + this.padchar) + this.w1char / 2;
            int var8;
            if (!GameCanvas.isTouch) {
               var8 = this.y + this.h1char / 2 + 16;
               SmallImage.drawSmallImageNew(var1, var6.a[Char.CharInfo[0][3][0]].id, var7 + Char.CharInfo[0][3][1] + var6.a[Char.CharInfo[0][3][0]].dx, var8 - Char.CharInfo[0][3][2] + var6.a[Char.CharInfo[0][3][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var3.a[Char.CharInfo[0][0][0]].id, var7 + Char.CharInfo[0][0][1] + var3.a[Char.CharInfo[0][0][0]].dx, var8 - Char.CharInfo[0][0][2] + var3.a[Char.CharInfo[0][0][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var4.a[Char.CharInfo[0][1][0]].id, var7 + Char.CharInfo[0][1][1] + var4.a[Char.CharInfo[0][1][0]].dx, var8 - Char.CharInfo[0][1][2] + var4.a[Char.CharInfo[0][1][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var5.a[Char.CharInfo[0][2][0]].id, var7 + Char.CharInfo[0][2][1] + var5.a[Char.CharInfo[0][2][0]].dx, var8 - Char.CharInfo[0][2][2] + var5.a[Char.CharInfo[0][2][0]].dy, 0, 0);
               if (this.indexSelect == var2) {
                  mFont.tahoma_8b.a(var1, mResources.mz[0] + ": " + this.name[var2], GameCanvas.ab, this.y - 45, 2);
                  mFont.tahoma_7b_white.a(var1, mResources.mz[1] + ": " + this.level[var2], GameCanvas.ab, this.y - 28, 2, mFont.tahoma_7b_blue);
                  mFont.tahoma_7b_white.a(var1, this.phai[var2], GameCanvas.ab, this.y - 16, 2, mFont.tahoma_7b_blue);
               }
            } else {
               var8 = this.y + this.h1char / 2 - 5;
               SmallImage.drawSmallImageNew(var1, var6.a[Char.CharInfo[0][3][0]].id, var7 + Char.CharInfo[0][3][1] + var6.a[Char.CharInfo[0][3][0]].dx, var8 - Char.CharInfo[0][3][2] + var6.a[Char.CharInfo[0][3][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var3.a[Char.CharInfo[0][0][0]].id, var7 + Char.CharInfo[0][0][1] + var3.a[Char.CharInfo[0][0][0]].dx, var8 - Char.CharInfo[0][0][2] + var3.a[Char.CharInfo[0][0][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var4.a[Char.CharInfo[0][1][0]].id, var7 + Char.CharInfo[0][1][1] + var4.a[Char.CharInfo[0][1][0]].dx, var8 - Char.CharInfo[0][1][2] + var4.a[Char.CharInfo[0][1][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var5.a[Char.CharInfo[0][2][0]].id, var7 + Char.CharInfo[0][2][1] + var5.a[Char.CharInfo[0][2][0]].dx, var8 - Char.CharInfo[0][2][2] + var5.a[Char.CharInfo[0][2][0]].dy, 0, 0);
               mFont.tahoma_8b.a(var1, this.name[var2], var7, this.y + this.h1char / 2 + 5, 2);
               mFont.tahoma_7b_white.a(var1, mResources.mz[1] + ": " + this.level[var2], var7, this.y + this.h1char / 2 + 22, 2);
               if (GameCanvas.z > 200) {
                  mFont.tahoma_7b_white.a(var1, this.phai[var2], var7, this.y + this.h1char / 2 + 34, 2);
               }
            }
         }
      }

      super.paint(var1);
   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 1000:
            this.doSelect();
            return;
         case 1001:
            Session_ME.getInstance().close();
            GameCanvas.instance.t();
         default:
      }
   }

   public static void f() {
      instance = null;
      k = null;
   }

   static {
      Main.main(23);
      init();
   }
}

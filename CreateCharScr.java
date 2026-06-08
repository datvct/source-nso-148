public final class CreateCharScr extends mScreen implements IActionListener {
   private static CreateCharScr instance;
   private static TField tAddName;
   private static int indexGender;
   private static int indexHair;
   private static int selected;
   private static int[][] hairID;
   private static int[] defaultLeg;
   private static int[] defaultBody;
   private Command1 cmdGender;
   private Command1 cmdHair;
   private int curIndex = 0;

   public static void init() {
      hairID = new int[][]{{11, 26, 27, 28}, {2, 23, 24, 25}};
      defaultLeg = new int[]{9, 0};
      defaultBody = new int[]{10, 1};
   }

   public static CreateCharScr gI() {
      if (instance == null) {
         instance = new CreateCharScr();
      }

      return instance;
   }

   public CreateCharScr() {
      if (GameCanvas.z == 128) {
         GameScr.setPopupSize(128, 120);
         GameScr.eu = (GameCanvas.z - 128) / 2;
         GameScr.et = 0;
      } else {
         GameScr.setPopupSize(170, 190);
         GameScr.eu = (GameCanvas.z - 170) / 2;
         GameScr.et = (GameCanvas.aa - 220) / 2;
      }

      indexGender = 1;
      (tAddName = new TField()).j = mResources.el;
      tAddName.c = 100;
      tAddName.a = GameScr.eu + 45;
      tAddName.a = GameScr.eu + GameScr.ev / 2 - tAddName.c / 2;
      tAddName.b = GameScr.et + 62;
      if (GameCanvas.z == 128) {
         tAddName.c = 60;
      }

      tAddName.d = 26;
      tAddName.e = true;
      tAddName.c(0);
      indexGender = 1;
      indexHair = 0;
      super.center = new Command1(mResources.ek, this, 8000, (Object)null);
      super.left = new Command1(mResources.ep, this, 8001, (Object)null);
      this.cmdGender = new Command1("", this, 8002, (Object)null, GameScr.eu + GameScr.ev / 2 - mScreen.fo / 2, GameScr.et + 70 + 30);
      this.cmdHair = new Command1("", this, 8003, (Object)null, GameScr.eu + GameScr.ev / 2 - mScreen.fo / 2, GameScr.et + 70 + 70);
      super.right = tAddName.k;
   }

   public final void switchToMe() {
      indexGender = GameCanvas.u % 2;
      indexHair = GameCanvas.u % 4;
      super.switchToMe();
   }

   public final void keyPress(int var1) {
      tAddName.keyPress(var1);
   }

   public final void update() {
      if (++GameScr.gW23 > GameCanvas.z * 3 + 100) {
         GameScr.gW23 = 100;
      }

      if (GameCanvas.isTouch && GameCanvas.z >= 320) {
         if (super.left != null) {
            super.left.x = GameCanvas.z / 2 - 160;
            super.left.y = GameCanvas.aa - 26;
         }

         if (super.center != null) {
            super.center.x = GameCanvas.z / 2 - 35;
            super.center.y = GameCanvas.aa - 26;
         }

         if (super.right != null) {
            super.right.x = GameCanvas.z / 2 + 88;
            super.right.y = GameCanvas.aa - 26;
         }
      }

      if (this.cmdHair != null) {
         this.cmdHair.c();
      }

      if (this.cmdGender != null) {
         this.cmdGender.c();
      }

   }

   public final void updateKey() {
      if (GameCanvas.k[2] && --selected < 0) {
         selected = mResources.jb.length - 1;
      }

      if (GameCanvas.k[8] && ++selected >= mResources.jb.length) {
         selected = 0;
      }

      if (selected == 0) {
         super.right = tAddName.k;
         tAddName.d();
      }

      if (selected == 1) {
         if (GameCanvas.k[4] && --indexGender < 0) {
            indexGender = mResources.jc.length - 1;
         }

         if (GameCanvas.k[6] && ++indexGender > mResources.jc.length - 1) {
            indexGender = 0;
         }

         super.right = null;
      }

      if (selected == 2) {
         if (GameCanvas.k[4] && --indexHair < 0) {
            indexHair = mResources.fq[0].length - 1;
         }

         if (GameCanvas.k[6] && ++indexHair > mResources.fq[0].length - 1) {
            indexHair = 0;
         }
      }

      if (GameCanvas.o && GameCanvas.b(GameScr.eu + 5, GameScr.et + 65, GameScr.ev - 5, mScreen.fn)) {
         selected = 0;
      }

      super.updateKey();
      GameCanvas.m();
      GameCanvas.l();
   }

   public final void paint(mGraphics var1) {
      try {
         GameCanvas.paintBGGameScr(var1);
         Paint.a(GameScr.eu, GameScr.et, GameScr.ev, GameScr.ew, var1);
         byte var2 = 40;
         if (GameCanvas.z == 128) {
            var2 = 20;
         }

         int var3 = hairID[indexGender][indexHair];
         int var4 = defaultLeg[indexGender];
         int var5 = defaultBody[indexGender];
         Part var6 = GameScr.parts[var3];
         Part var7 = GameScr.parts[var4];
         Part var8 = GameScr.parts[var5];
         int var9 = GameCanvas.z / 2;
         int var10 = GameScr.et + 50;
         SmallImage.drawSmallImageNew(var1, var6.a[Char.CharInfo[0][0][0]].id, var9 + Char.CharInfo[0][0][1] + var6.a[Char.CharInfo[0][0][0]].dx, var10 - Char.CharInfo[0][0][2] + var6.a[Char.CharInfo[0][0][0]].dy, 0, 0);
         SmallImage.drawSmallImageNew(var1, var7.a[Char.CharInfo[0][1][0]].id, var9 + Char.CharInfo[0][1][1] + var7.a[Char.CharInfo[0][1][0]].dx, var10 - Char.CharInfo[0][1][2] + var7.a[Char.CharInfo[0][1][0]].dy, 0, 0);
         SmallImage.drawSmallImageNew(var1, var8.a[Char.CharInfo[0][2][0]].id, var9 + Char.CharInfo[0][2][1] + var8.a[Char.CharInfo[0][2][0]].dx, var10 - Char.CharInfo[0][2][2] + var8.a[Char.CharInfo[0][2][0]].dy, 0, 0);
         if (!GameCanvas.isTouch) {
            for(var3 = 0; var3 < mResources.jb.length; ++var3) {
               if (selected == var3) {
                  var4 = var3 > 0 ? -5 : 0;
                  SmallImage.drawSmallImageNew(var1, 989, GameScr.eu + 10 + (GameCanvas.u % 7 > 3 ? 1 : 0), GameScr.et + 76 + var3 * var2 + var4, 2, StaticObj.VCENTER_HCENTER);
                  SmallImage.drawSmallImageNew(var1, 989, GameScr.eu + GameScr.ev - 15 - (GameCanvas.u % 7 > 3 ? 1 : 0), GameScr.et + 76 + var3 * var2 + var4, 0, StaticObj.VCENTER_HCENTER);
               }
            }
         }

         if (GameCanvas.isTouch) {
            this.cmdGender.caption = mResources.jc[indexGender];
            this.cmdGender.a(var1);
            this.cmdHair.caption = mResources.fq[indexGender][indexHair];
            this.cmdHair.a(var1);
         } else {
            Paint.b(this.cmdGender.x, this.cmdGender.y, this.cmdGender.w, this.cmdGender.h, var1);
            if (selected == 1) {
               var1.a(Paint.COLORLIGHT);
               var1.c(this.cmdGender.x, this.cmdGender.y, this.cmdGender.w, this.cmdGender.h);
               Paint.b(this.cmdGender.x, this.cmdGender.y, this.cmdGender.w, this.cmdGender.h, var1);
            }

            Paint.b(this.cmdHair.x, this.cmdHair.y, this.cmdHair.w, this.cmdHair.h, var1);
            if (selected == 2) {
               var1.a(Paint.COLORLIGHT);
               var1.c(this.cmdHair.x, this.cmdHair.y, this.cmdHair.w, this.cmdHair.h);
               Paint.b(this.cmdHair.x, this.cmdHair.y, this.cmdHair.w, this.cmdHair.h, var1);
            }

            mFont.tahoma_7b_white.a(var1, mResources.jc[indexGender], GameScr.eu + 85, GameScr.et + 66 + var2, 2);
            mFont.tahoma_7b_white.a(var1, mResources.fq[indexGender][indexHair], GameScr.eu + 85, GameScr.et + 66 + (var2 << 1), 2);
         }

         tAddName.a = GameScr.eu + GameScr.ev / 2 - tAddName.c / 2;
         tAddName.b = GameScr.et + 62;
         tAddName.g = mResources.el;
         tAddName.a(var1);
         super.paint(var1);
         var1.a(0);
      } catch (Exception var11) {
         System.out.println("CreateCharScr.paint(): 0");
         var11.printStackTrace();
      }

   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 8000:
            Service.gI().createChar(tAddName.e(), indexGender, hairID[indexGender][indexHair]);
            return;
         case 8001:
            if (SelectCharScr.gI().isNullChar) {
               GameCanvas.afselectsvScr.switchToMe();
               return;
            }

            SelectCharScr.gI().switchToMe();
            return;
         case 8002:
            this.curIndex = 1;
            selected = 1;
            if (this.curIndex == selected && --indexGender < 0) {
               indexGender = mResources.jc.length - 1;
               return;
            }
            break;
         case 8003:
            this.curIndex = 2;
            selected = 2;
            if (this.curIndex == selected && ++indexHair > mResources.fq[0].length - 1) {
               indexHair = 0;
            }
      }

   }

   public static void f() {
      instance = null;
      tAddName = null;
      indexGender = 0;
      indexHair = 0;
      selected = 0;
      hairID = (int[][])null;
      defaultLeg = null;
      defaultBody = null;
   }

   static {
      Main.main(19);
      init();
   }
}

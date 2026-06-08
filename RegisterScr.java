public final class RegisterScr extends mScreen implements IActionListener {
   public static RegisterScr instance;
   private int xPanel;
   private int yPanel;
   private int wPanel;
   private int hPanel;
   private int wC;
   private int xT;
   private int focus;
   private TField[] tf = new TField[7];
   private String[] menuName = new String[]{"H\u1ecd v\u00e0 t\u00ean", "Ng\u00e0y, th\u00e1ng, n\u0103m sinh", "\u0110\u1ecba ch\u1ec9 th\u01b0\u1eddng tr\u00fa", "CMND", "Ng\u00e0y c\u1ea5p", "N\u01a1i c\u1ea5p", "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i, \u0111\u1ecba ch\u1ec9 th\u01b0 \u0111i\u1ec7n t\u1eed (n\u1ebfu c\u00f3).", "* D\u01b0\u1edbi 18 tu\u1ed5i ch\u1ec9 c\u00f3 th\u1ec3 ch\u01a1i 180p 1 ng\u00e0y"};
   private String[] menuInfo = new String[]{"Nguyen Van A", "17-03-1991", "34 Phan A p.12 q.BT", "987654321", "01-01-2011", "TP.H\u1ed3 Ch\u00ed Minh", "abc@gmail.com", ""};
   public Scroll scroll = new Scroll();

   public RegisterScr() {
      instance = this;
      this.xPanel = GameCanvas.ab - 100;
      this.yPanel = 10;
      this.wPanel = 200;
      this.hPanel = GameCanvas.aa - 40;
      this.wC = this.wPanel - 40;
      this.xT = GameCanvas.ab - this.wC / 2;

      for(int var1 = 0; var1 < this.tf.length; ++var1) {
         this.tf[var1] = new TField();
         this.tf[var1].j = this.menuName[var1];
         this.tf[var1].a = this.xT;
         this.tf[var1].b = (var1 + 1) * 50;
         this.tf[var1].c = this.wC;
         this.tf[var1].d = mScreen.fn + 2;
         this.tf[var1].e = false;
         this.tf[var1].c(3);
         this.tf[var1].a(this.menuInfo[var1]);
         if (var1 == 0) {
            this.tf[var1].e = true;
         }
      }

      super.left = new Command1(mResources.cs, this, 1, (Object)null);
   }

   public final void update() {
      super.update();
      if (++GameScr.gW23 > GameCanvas.z * 3 + 100) {
         GameScr.gW23 = 100;
      }

      int var1;
      for(var1 = 0; var1 < this.tf.length; ++var1) {
         this.tf[var1].d();
      }

      new ScrollResult();
      ScrollResult var2;
      if ((var2 = this.scroll.b()).isDowning || var2.isFinish) {
         this.focus = (byte)var2.selected;
      }

      this.scroll.c();
      if (this.focus == -1) {
         for(var1 = 0; var1 < this.tf.length; ++var1) {
            this.tf[var1].e = false;
         }
      }

   }

   public final void keyPress(int var1) {
      super.keyPress(var1);

      for(int var2 = 0; var2 < this.tf.length; ++var2) {
         if (this.tf[var2].e) {
            this.tf[var2].keyPress(var1);
         }
      }

   }

   public final void updateKey() {
      if (GameCanvas.k[2]) {
         --this.focus;
         if (this.focus < 0) {
            this.focus = this.menuName.length;
         }

         this.scroll.a(this.focus * this.scroll.h);
      } else if (GameCanvas.k[8]) {
         ++this.focus;
         if (this.focus > this.menuName.length) {
            this.focus = 0;
         }

         this.scroll.a(this.focus * this.scroll.h);
      }

      int var1;
      if (GameCanvas.k[2] || GameCanvas.k[8]) {
         GameCanvas.l();

         for(var1 = 0; var1 < this.tf.length; ++var1) {
            this.tf[var1].e = false;
         }

         if (this.focus < this.tf.length) {
            this.tf[this.focus].e = true;
         }

         this.scroll.a(this.focus * this.scroll.h);
      }

      if (GameCanvas.b(this.xPanel, this.yPanel, this.wPanel, this.hPanel) && GameCanvas.o) {
         for(var1 = 0; var1 < this.tf.length; ++var1) {
            if (GameCanvas.b(this.tf[var1].a, this.tf[var1].b, this.tf[var1].c, this.tf[var1].d)) {
               this.focus = var1;
            }
         }
      }

      super.updateKey();
      GameCanvas.l();
   }

   public final void paint(mGraphics var1) {
      var1.a(0);
      var1.c(0, 0, GameCanvas.z, GameCanvas.aa);
      GameCanvas.paintBGGameScr(var1);
      Paint.a(this.xPanel, this.yPanel, this.wPanel, this.hPanel, var1);
      mFont.tahoma_7b_white.a(var1, mResources.cs, GameCanvas.ab, this.yPanel + 10, 2);
      this.scroll.a(this.menuName.length, 50, this.xPanel, this.yPanel + 25, this.wPanel, this.hPanel - 25, true, 0);
      this.scroll.a(var1, this.xPanel, this.yPanel + 25, this.wPanel, this.hPanel - 25);

      int var2;
      for(var2 = 0; var2 < this.menuName.length; ++var2) {
         if (var2 != this.menuName.length - 1) {
            mFont.tahoma_7_yellow.a(var1, this.menuName[var2], GameCanvas.ab, (var2 + 1) * 50 - 13, 2);
         } else {
            mFont.tahoma_7_red.a(var1, this.menuName[var2], GameCanvas.ab, (var2 + 1) * 50 - 13, 2);
         }
      }

      for(var2 = 0; var2 < this.tf.length; ++var2) {
         this.tf[var2].b(var1);
      }

      super.paint(var1);
   }

   public final void switchToMe() {
      super.switchToMe();
      this.scroll.clear();
   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 1:
            Service.gI().info_Kiemduyet(this.tf[0].e(), this.tf[1].e(), this.tf[2].e(), this.tf[3].e(), this.tf[4].e(), this.tf[5].e(), this.tf[6].e());
            GameCanvas.av = false;
            GameScr.gI().switchToMe();
         default:
      }
   }

   public static void a() {
   }

   public static void b() {
      instance = null;
   }

   static {
      Main.main(9);
      a();
   }
}

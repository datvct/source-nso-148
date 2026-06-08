public final class MsgDlg extends Dialog {
   private String[] info;
   public boolean isWait;
   public int timeShow;
   private int h;
   private int padLeft = 30;

   public MsgDlg() {
      if (GameCanvas.z <= 176) {
         this.padLeft = 10;
      }

   }

   public final void pleasewait() {
      this.setInfo(mResources.ag, (Command1)null, (Command1)null, (Command1)null);
      GameCanvas.currentDialog = this;
   }

   public final void setInfo(String var1, Command1 var2, Command1 var3, Command1 var4) {
      this.info = mFont.tahoma_8b.splitFontArray(var1, GameCanvas.z - ((this.padLeft << 1) + 40));
      super.left = var2;
      super.center = var3;
      super.right = var4;
      if (var3 != null) {
         super.center.x = GameCanvas.z / 2 - 35;
         super.center.y = GameCanvas.aa - 26;
         if (var2 != null) {
            super.left.x = GameCanvas.z / 2 - 115;
            super.left.y = GameCanvas.aa - 26;
         }

         if (var4 != null) {
            super.right.x = GameCanvas.z / 2 + 45;
            super.right.y = GameCanvas.aa - 26;
         }
      } else {
         if (var2 != null) {
            super.left.x = GameCanvas.z / 2 - 80;
            super.left.y = GameCanvas.aa - 26;
         }

         if (var4 != null) {
            super.right.x = GameCanvas.z / 2 + 10;
            super.right.y = GameCanvas.aa - 26;
         }
      }

      this.isWait = false;
      this.h = 80;
      if (this.info.length >= 5) {
         this.h = this.info.length * mFont.tahoma_8b.d() + 20;
      }

   }

   public final void a(mGraphics var1) {
      int var2 = GameCanvas.aa - this.h - 38;
      Paint.a(this.padLeft, var2, GameCanvas.z - (this.padLeft << 1), this.h, var1);
      var2 = var2 + (this.h - this.info.length * mFont.tahoma_8b.d()) / 2 - 2;
      if (this.isWait) {
         var2 += 8;
         GameCanvas.a(GameCanvas.ab, var2 - 12, var1);
      }

      for(int var3 = 0; var3 < this.info.length; var2 += mFont.tahoma_8b.d()) {
         mFont.tahoma_8b.a(var1, this.info[var3], GameCanvas.ab, var2, 2);
         ++var3;
      }

      super.a(var1);
   }

   public final void a() {
      if (this.timeShow > 0) {
         --this.timeShow;
         if (this.timeShow == 1) {
            GameCanvas.n();
            this.timeShow = 0;
         }
      }

      super.a();
   }
}

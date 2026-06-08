public final class Class_bc implements Runnable {
   private GameScr a;

   Class_bc(GameScr var1) {
      this.a = var1;
   }

   public final void run() {
      ChatPopup.addChatPopupMultiLine("Di\u1ec7t ma", Char.getMyChar());

      for(int var1 = 0; var1 < 6; ++var1) {
         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var5) {
            var5.printStackTrace();
         }

         int var2;
         if (this.a.fh[var1 * 10 + 120] >>> 24 != 0) {
            var2 = 2;
         } else {
            var2 = 0;
            int var3 = 0;

            int var4;
            for(var4 = 0; var4 < 10; ++var4) {
               if (this.a.fh[var1 * 10 + var4] >>> 24 != 0) {
                  ++var3;
               }
            }

            for(var4 = 0; var4 < 10; ++var4) {
               if (this.a.fh[var1 * 10 + var4 * 60] >>> 24 != 0) {
                  ++var2;
               }
            }

            if (var3 < var2) {
               var2 = 1;
            } else {
               var2 = 0;
            }
         }

         ChatPopup.addChatPopupMultiLine("Di\u1ec7t ma: " + this.a.fg[var2], Char.getMyChar());
         GameScr.a(this.a, (byte)var2);
      }

   }
}

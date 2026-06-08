public final class Class_bz implements Runnable {
   private final int a;

   Class_bz(int var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         TileMap.k(this.a);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      System.gc();
      if (Session_ME.getInstance().connected) {
         GameScr.gI().switchToMe();
      }

      GameCanvas.n();
      GameCanvas.isLoading = false;
   }
}

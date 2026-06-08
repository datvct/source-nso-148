public final class Class_ba implements Runnable {
   private final Item a;

   Class_ba(Item var1) {
      this.a = var1;
   }

   public final void run() {
      GameScr.ff = true;

      try {
         for(int var1 = 0; var1 < this.a.quantity && Char.af() > 0 && GameCanvas.currentScreen instanceof GameScr; ++var1) {
            Service.gI().useItem(this.a.indexUI);
            Thread.sleep(20L);
         }
      } catch (InterruptedException var2) {
      }

      GameScr.ff = false;
   }
}

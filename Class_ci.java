public final class Class_ci implements Runnable {
   private NetworkInit a;

   Class_ci(NetworkInit var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var3) {
      }

      try {
         if (this.a.a.connecting) {
            Session_ME.a(this.a.a).interrupt();
            return;
         }
      } catch (Exception var2) {
      }

   }
}

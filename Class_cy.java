public final class Class_cy implements Runnable {
   Class_cy(NSOT_MOB var1) {
   }

   public final void run() {
      try {
         Char var1 = Char.getMyChar();

         for(int var2 = 0; var2 < var1.arrItemBag.length; ++var2) {
            NSOT_MOB.c(var1.arrItemBag[var2]);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }
}

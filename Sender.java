public final class Sender implements Runnable {
   private MyVector a;
   private Session_ME b;

   public Sender(Session_ME var1) {
      this.b = var1;
      this.a = new MyVector();
   }

   public final void a() {
      this.a.removeAllElements();
   }

   public final void a(Message var1) {
      this.a.addElement(var1);
   }

   public final void run() {
      while(true) {
         try {
            if (this.b.connected) {
               if (Session_ME.g(this.b)) {
                  while(this.a.size() > 0) {
                     Message var1 = (Message)this.a.elementAt(0);
                     this.a.removeElementAt(0);
                     Session_ME.a(this.b, var1);
                  }
               }

               Thread.sleep(10L);
               continue;
            }
         } catch (InterruptedException var2) {
         }

         return;
      }
   }
}

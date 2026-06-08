import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class NetworkInit implements Runnable {
   private final String b;
   final Session_ME a;

   NetworkInit(Session_ME var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      try {
         Session_ME.a(this.a, new Thread(new Class_ci(this)));
         Session_ME.b(this.a).start();
         this.a.j = System.currentTimeMillis();
         this.a.connecting = true;
         this.a.connected = true;
         this.a.SC = (SocketConnection)Connector.open(this.b);
         this.a.outputStream = this.a.SC.openDataOutputStream();
         this.a.inputStream = this.a.SC.openDataInputStream();
         Session_ME.b(this.a, new Thread(Session_ME.sender(this.a)));
         Session_ME.c(this.a, new Thread(Session_ME.d(this.a)));
         Session_ME.e(this.a).start();
         Session_ME.f(this.a).start();
         Session_ME.a(this.a, System.currentTimeMillis());
         Session_ME.a(this.a, new Message((byte)-27));
         this.a.connecting = false;
         this.a.messageHandler.onConnectOK();
      } catch (Exception var2) {
         this.a.close();
         if (this.a.messageHandler != null) {
            this.a.messageHandler.onConnectionFail();
         }
      }

   }
}

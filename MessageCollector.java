import java.io.IOException;

public final class MessageCollector implements Runnable {
   private Session_ME a;

   MessageCollector(Session_ME var1) {
      this.a = var1;
   }

   public final void run() {
      while(true) {
         try {
            if (!this.a.connected) {
               return;
            }

            byte var1 = this.a.inputStream.readByte();
            if (Session_ME.g(this.a)) {
               var1 = Session_ME.readKey(this.a, var1);
            }

            int var2;
            byte var3;
            int var4;
            int var5;
            if (var1 == -32) {
               var1 = this.a.inputStream.readByte();
               if (Session_ME.g(this.a)) {
                  var1 = Session_ME.readKey(this.a, var1);
               }

               var2 = Session_ME.readKey(this.a, this.a.inputStream.readByte());
               var3 = Session_ME.readKey(this.a, this.a.inputStream.readByte());
               var4 = Session_ME.readKey(this.a, this.a.inputStream.readByte());
               var5 = Session_ME.readKey(this.a, this.a.inputStream.readByte());
               var2 = (var2 & 255) << 24 | (var3 & 255) << 16 | (var4 & 255) << 8 | var5 & 255;
            } else if (Session_ME.g(this.a)) {
               byte var6 = this.a.inputStream.readByte();
               var3 = this.a.inputStream.readByte();
               var2 = (Session_ME.readKey(this.a, var6) & 255) << 8 | Session_ME.readKey(this.a, var3) & 255;
            } else {
               var2 = this.a.inputStream.readUnsignedShort();
            }

            byte[] var10 = new byte[var2];
            var5 = 0;
            int var7 = 0;

            while(var7 != -1 && var5 < var2) {
               if ((var7 = this.a.inputStream.read(var10, var5, var2 - var5)) > 0) {
                  var5 += var7;
                  Session_ME var8 = this.a;
                  var8.recvByteCount += var5 + 5;
                  var4 = this.a.recvByteCount + this.a.sendByteCount;
                  this.a.strRecvByteCount = var4 / 1024 + "." + var4 % 1024 / 102 + "Kb";
               }
            }

            if (Session_ME.g(this.a)) {
               for(var4 = 0; var4 < var10.length; ++var4) {
                  var10[var4] = Session_ME.readKey(this.a, var10[var4]);
               }
            }

            this.a.j = System.currentTimeMillis();
            Message var11;
            if ((var11 = new Message(var1, var10)).command == -27) {
               this.a(var11);
            } else {
               this.a.messageHandler.onMessage(var11);
            }
         } catch (Exception var9) {
            if (this.a.connected) {
               if (this.a.SC != null) {
                  this.a.cleanNetwork();
               }

               if (this.a.messageHandler != null) {
                  if (System.currentTimeMillis() - Session_ME.h(this.a) > 500L) {
                     this.a.messageHandler.onDisconnected();
                     return;
                  }

                  this.a.messageHandler.onConnectionFail();
                  return;
               }
            }

            return;
         }
      }
   }

   private void a(Message var1) {
      try {
         byte var2 = var1.reader().readByte();
         this.a.key = new byte[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.a.key[var3] = var1.reader().readByte();
         }

         for(var3 = 0; var3 < this.a.key.length - 1; ++var3) {
            byte[] var4 = this.a.key;
            var4[var3 + 1] ^= this.a.key[var3];
         }

         Session_ME.a(this.a, true);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }
}

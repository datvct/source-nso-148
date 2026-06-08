import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.io.SocketConnection;

public final class Session_ME implements ISession {
   public static Session_ME instance;
   public DataOutputStream outputStream;
   public DataInputStream inputStream;
   public IMessageHandler messageHandler;
   public SocketConnection SC;
   public boolean connected;
   public boolean connecting;
   private Sender sender = new Sender(this);
   private MessageCollector MC = new MessageCollector(this);
   private Thread initThread;
   private Thread collectorThread;
   private Thread sendThread;
   private Thread v;
   public int sendByteCount;
   public int recvByteCount;
   public long j;
   private boolean getKeyComplete;
   public byte[] key = null;
   private byte curR;
   private byte curW;
   private long timeConnected;
   public String strRecvByteCount = "";
   public static String host;
   public static int port;
   public static byte serverLogin;
   public static boolean isCancel;
   private static Object aa;

   public static void gI() {
      instance = new Session_ME();
      aa = new Object();
   }

   public static Session_ME getInstance() {
      return instance;
   }

   public final void connect(String host, int port) {
      String var3 = "socket://" + host + ":" + port;
      if (GameCanvas.y) {
         if (!GameCanvas.c) {
            var3 = var3 + ";interface=wifi";
         } else {
            var3 = var3 + ";deviceside=true";
         }
      }

      System.out.println("connect to " + var3 + " : " + GameMidlet.serverLogin);
      if (!this.connected && !this.connecting) {
         this.getKeyComplete = false;
         this.SC = null;
         this.initThread = new Thread(new NetworkInit(this, var3));
         this.initThread.start();
         Session_ME.host = host;
         Session_ME.port = port;
         serverLogin = GameMidlet.serverLogin;
      }

   }

   public final void sendMessage(Message var1) {
      this.sender.a(var1);
   }

   private synchronized void doSendMessage(Message var1) {
      byte[] var2 = var1.getData();

      try {
         if (this.getKeyComplete) {
            this.outputStream.writeByte(this.writeKey(var1.command));
         } else {
            this.outputStream.writeByte(var1.command);
         }

         if (var2 == null) {
            this.outputStream.writeShort(0);
            this.sendByteCount += 5;
         } else {
            int var3 = var2.length;
            int var4;
            if (var1.command != -31 && this.getKeyComplete) {
               var4 = this.writeKey((byte)(var3 >> 8));
               this.outputStream.writeByte(var4);
               var4 = this.writeKey((byte)var3);
               this.outputStream.writeByte(var4);
            } else {
               this.outputStream.writeShort(var3);
            }

            if (this.getKeyComplete) {
               for(var4 = 0; var4 < var2.length; ++var4) {
                  var2[var4] = this.writeKey(var2[var4]);
               }
            }

            this.outputStream.write(var2);
            this.sendByteCount += 5 + var2.length;
         }

         this.outputStream.flush();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   private byte writeKey(byte var1) {
      byte[] var2 = this.key;
      byte var3 = this.curW;
      this.curW = (byte)(var3 + 1);
      var1 = (byte)(var2[var3] & 255 ^ var1 & 255);
      if (this.curW >= this.key.length) {
         this.curW = (byte)(this.curW % this.key.length);
      }

      return var1;
   }

   public final void close() {
      NSOT_MOB var1 = NSOT_MOB.mod_nst;
      NSOT_MOB.c();
      ToolCuoc.stopTool();
      this.cleanNetwork();
   }

   public final void cleanNetwork() {
      this.getKeyComplete = false;
      this.connected = false;
      this.connecting = false;
      this.key = null;
      this.curR = 0;
      this.curW = 0;
      this.sender.a();

      try {
         if (this.SC != null) {
            this.SC.close();
            this.SC = null;
         }

         if (this.outputStream != null) {
            this.outputStream.close();
            this.outputStream = null;
         }

         if (this.inputStream != null) {
            this.inputStream.close();
            this.inputStream = null;
         }

         if (this.collectorThread != null) {
            if (this.collectorThread.isAlive()) {
               this.collectorThread.interrupt();
            }

            this.collectorThread = null;
         }

         if (this.initThread != null) {
            if (this.initThread.isAlive()) {
               this.initThread.interrupt();
            }

            this.initThread = null;
         }

         if (this.sendThread != null) {
            if (this.sendThread.isAlive()) {
               this.sendThread.interrupt();
            }

            this.sendThread = null;
         }

         if (this.v != null) {
            if (this.v.isAlive()) {
               this.v.interrupt();
            }

            this.v = null;
         }

         System.gc();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public final void e() {
      if (GameCanvas.currentScreen != GameCanvas.afselectsvScr) {
         GameCanvas.instance.f();
      }

      if (isCancel) {
         f();
      } else {
         isCancel = true;
         (new Thread(new Class_cj(this))).start();
      }

   }

   public static void f() {
      synchronized(aa) {
         aa.notifyAll();
      }
   }

   static Thread a(Session_ME var0) {
      return var0.initThread;
   }

   static void a(Session_ME var0, Thread var1) {
      var0.collectorThread = var1;
   }

   static Thread b(Session_ME var0) {
      return var0.collectorThread;
   }

   static Sender sender(Session_ME var0) {
      return var0.sender;
   }

   static void b(Session_ME var0, Thread var1) {
      var0.sendThread = var1;
   }

   static MessageCollector d(Session_ME var0) {
      return var0.MC;
   }

   static void c(Session_ME var0, Thread var1) {
      var0.v = var1;
   }

   static Thread e(Session_ME var0) {
      return var0.sendThread;
   }

   static Thread f(Session_ME var0) {
      return var0.v;
   }

   static void a(Session_ME var0, long var1) {
      var0.timeConnected = var1;
   }

   static void a(Session_ME var0, Message var1) {
      var0.doSendMessage(var1);
   }

   static boolean g(Session_ME var0) {
      return var0.getKeyComplete;
   }

   static byte readKey(Session_ME var0, byte var1) {
      byte[] var2 = var0.key;
      byte var3 = var0.curR;
      var0.curR = (byte)(var3 + 1);
      var1 = (byte)(var2[var3] & 255 ^ var1 & 255);
      if (var0.curR >= var0.key.length) {
         var0.curR = (byte)(var0.curR % var0.key.length);
      }

      return var1;
   }

   static long h(Session_ME var0) {
      return var0.timeConnected;
   }

   static void a(Session_ME var0, boolean var1) {
      var0.getKeyComplete = true;
   }

   static void a(long var0) {
      long var2 = var0;
      synchronized(aa) {
         try {
            aa.wait(var2);
         } catch (Exception var7) {
         }

      }
   }

   public static void g() {
      instance = null;
      host = null;
      port = 0;
      serverLogin = 0;
      isCancel = false;
      aa = null;
   }

   static {
      Main.main(29);
      gI();
   }
}

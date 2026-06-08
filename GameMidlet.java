import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class GameMidlet extends MIDlet {
   public static String[] nameServer;
   public static int[] portList;
   public static byte[] language;
   public static int[] serverLoginList;
   public static byte e;
   public static int port;
   public static String g;
   public static byte h;
   public static String i;
   public static GameMidlet instance;
   public static byte serverLogin;

   public static void a() {
      nameServer = new String[]{nsotien_connect.ip_sv1, nsotien_connect.ip_sv2, nsotien_connect.ip_sv3,nsotien_connect.ip_sv4,nsotien_connect.ip_sv5,nsotien_connect.ip_sv6,nsotien_connect.ip_sv7 , nsotien_connect.ip_sv8,nsotien_connect.ip_sv9,nsotien_connect.ip_sv10,nsotien_connect.ip_sv11,nsotien_connect.ip_sv01, nsotien_connect.ip_sv02, nsotien_connect.ip_sv12};
      portList = new int[]{14444, 14444, 14444, 14444, 14444, 14444, 14444, 14444, 14444, 14445, 14444, 14444, 14444, 14444};
      language = new byte[]{0, 0, 1, 0, 0, 0, 1, 0, 3, 0, 0, 0,0,0};
      serverLoginList = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
      e = 1;
      port = 14444;
      g = "";
      h = 0;
      serverLogin = 0;
   }

   public GameMidlet() {
      Session_ME var1 = Session_ME.getInstance();
      Controller var2 = Controller.gI();
      var1.messageHandler = var2;
      instance = this;
      i = "0";
      h = Byte.parseByte(i);
      System.out.println("AGENT: " + i + ", PROVIDER: " + h);
      SplashScr.splashScrStat = 0;
      GameCanvas.currentScreen = new SplashScr();
      GameCanvas var3 = GameCanvas.c();
      MotherCanvas.gI().tCanvas = var3;
      MotherCanvas var4 = MotherCanvas.gI();
      Display.getDisplay(this).setCurrent(var4);
      var4 = MotherCanvas.gI();
      if (!MotherCanvas.c) {
         (new Thread(var4)).start();
      }

   }

   protected void destroyApp(boolean var1) {
   }

   protected void pauseApp() {
   }

   protected void startApp() {
   }

   public static void a(String var0) {
      if (!var0.equals("")) {
         try {
            instance.platformRequest(var0);
            instance.notifyDestroyed();
            return;
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }

   }

   private static String b(String var0) {
      InputStream var1 = mResources.a("/" + var0);

      try {
         byte[] var2 = new byte[var1.available()];
         var1.read(var2);
         var0 = new String(var2, "UTF-8");
      } catch (Exception var3) {
         var0 = "";
      }

      return var0;
   }

   public static void b() {
      nameServer = null;
      portList = null;
      language = null;
      serverLoginList = null;
      e = 0;
      port = 0;
      g = null;
      h = 0;
      i = null;
      instance = null;
      serverLogin = 0;
   }

   static {
      Main.main(43);
      a();
   }
}

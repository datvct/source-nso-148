public class Class_an {
   public static Class_an a;
   public static boolean b;
   public static int c;
   public static int d;
   public static int e;
   public static boolean f;
   public static boolean g;
   public static boolean h;
   public static boolean i;
   public static boolean j;
   public static boolean k;
   public static int l;
   public static boolean m;
   public static boolean n;

   public static void a() {
      a = new Class_an();
      b = false;
      c = 0;
      d = 0;
      e = -1;
      f = false;
      g = false;
      h = false;
      i = false;
      j = false;
      k = false;
      m = false;
   }

   public static void a(long var0) {
      try {
         Thread.sleep(var0);
      } catch (Exception var3) {
      }

   }

   public final boolean a(String var1) {
      if (var1.equals("lbhd")) {
         GameScr.addChatPopup((m ? "T\u0103t" : "B\u1eadt") + " d\u00f9ng l\u1ec7nh b\u00e0i hang \u0111\u1ed9ng");
         m = !m;
         return true;
      } else if (var1.equals("i")) {
         GameScr.addChatPopup((n ? "T\u0103t" : "B\u1eadt") + " l\u1ecdc \u0111\u1ed3");
         n = !n;
         return true;
      } else {
         return NSOT_MOB.mod_nst.e(var1);
      }
   }

   public static void a(int var0, int var1) {
      if (GameScr.vParty.size() <= 0) {
         try {
            Thread.sleep(4000L);
         } catch (InterruptedException var3) {
         }
      }

      Service.gI().requestChangeZone(var0, var1);
   }

   public static void b() {
      a = null;
      b = false;
      c = 0;
      d = 0;
      e = 0;
      f = false;
      g = false;
      h = false;
      i = false;
      j = false;
      k = false;
      l = 0;
      m = false;
   }

   static {
      a(3L);
      a();
   }
}

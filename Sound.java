public final class Sound {
   public static boolean isSound;

   public static void a() {
      isSound = true;
   }

   public static void b() {
      isSound = false;
   }

   static {
      Main.main(18);
      a();
   }
}

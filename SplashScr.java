public final class SplashScr extends mScreen {
   public static int splashScrStat;

   public final void update() {
      if (splashScrStat++ > 5) {
         if (mResources.d("indLanguage") >= 0) {
            GameCanvas.e();
            GameCanvas.afselectsvScr.switchToMe();
            return;
         }

         GameCanvas.e();
         GameCanvas.languageScr.switchToMe();
      }

   }

   public static void a() {
   }

   public static void b() {
      splashScrStat = 0;
   }

   static {
      Main.main(15);
      a();
   }
}

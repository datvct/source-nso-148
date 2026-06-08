public abstract class Effect2 {
   public static MyVector vEffect2;
   public static MyVector vRemoveEffect2;
   public static MyVector vEffect2Outside;
   public static MyVector vAnimateEffect;

   public static void init() {
      vEffect2 = new MyVector();
      vRemoveEffect2 = new MyVector();
      vEffect2Outside = new MyVector();
      vAnimateEffect = new MyVector();
   }

   public abstract void update();

   public abstract void paint(mGraphics var1);

   public static void clear() {
      vEffect2 = null;
      vRemoveEffect2 = null;
      vEffect2Outside = null;
      vAnimateEffect = null;
   }

   static {
      Main.main(61);
      init();
   }
}

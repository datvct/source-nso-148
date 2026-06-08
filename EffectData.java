public final class EffectData {
   public MyVector listFrame = new MyVector();
   public SmallImage[] smallImage;
   public byte[][] frameChar;
   public byte[] sequence;
   public int fw;
   public int fh;
   public byte[] indexStartSkill;
   public boolean isLoad;

   public EffectData() {
      new MyVector();
      this.frameChar = new byte[4][];
      this.isLoad = false;
   }
}

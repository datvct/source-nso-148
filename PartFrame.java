public final class PartFrame {
   public short idSmallImg;
   public short dx;
   public short dy;
   public byte flip;
   public byte onTop = 0;

   public PartFrame(int var1, int var2, int var3) {
      this.idSmallImg = (short)var3;
      this.dx = (short)var1;
      this.dy = (short)var2;
   }
}

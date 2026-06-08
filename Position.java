public final class Position {
   public int x;
   public int y;
   public int anchor;
   public int g;
   public int v = 0;
   public int color;

   public Position() {
      this.x = 0;
      this.y = 0;
   }

   public Position(int var1, int var2) {
      this.x = var1;
      this.y = var2;
   }
}

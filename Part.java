public final class Part {
   public PartImage[] a;

   public Part(int type) {
      if (type == 0) {
         this.a = new PartImage[8];
      }

      if (type == 1) {
         this.a = new PartImage[18];
      }

      if (type == 2) {
         this.a = new PartImage[10];
      }

      if (type == 3) {
         this.a = new PartImage[2];
      }

   }
}

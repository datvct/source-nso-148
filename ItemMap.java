public final class ItemMap {
   public int x;
   public int y;
   public int xEnd;
   public int yEnd;
   public int e;
   public int f;
   public int g;
   public ItemTemplate template;
   public byte i;
   public MyImage imgCaptcha;
   public boolean k = false;
   public long l = 0L;

   public ItemMap(short var1, short var2, int var3, int var4, int var5, int var6) {
      this.g = var1;
      this.template = ItemTemplates.get(var2);
      this.x = var5;
      this.y = var4;
      this.xEnd = var5;
      this.yEnd = var6;
      this.e = var5 - var3 >> 2;
      this.f = 5;
   }

   public ItemMap(short var1, short var2, int var3, int var4) {
      this.g = var1;
      this.template = ItemTemplates.get(var2);
      this.x = this.xEnd = var3;
      this.y = this.yEnd = var4;
      this.i = 1;
   }

   public final void a(int var1, int var2) {
      this.xEnd = var1;
      this.yEnd = var2;
      this.e = var1 - this.x >> 2;
      this.f = var2 - this.y >> 2;
      this.i = 2;
   }
}

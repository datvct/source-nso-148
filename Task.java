public final class Task {
   public int index;
   public short[] counts;
   public String[] names;
   public String[] details;
   public String[] subNames;
   public short count;

   public Task(byte var1, String var2, String var3, String[] var4, short[] var5, short var6) {
      this.index = var1;
      this.names = mFont.tahoma_7b_white.splitFontArray(var2, 155);
      this.details = mFont.tahoma_7.splitFontArray(var3, 155);
      this.subNames = var4;
      this.counts = var5;
      this.count = var6;
   }
}

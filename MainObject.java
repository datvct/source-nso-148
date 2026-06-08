public class MainObject {
   public MyVector gc = new MyVector();

   public final void a(mGraphics var1, int var2, int var3, int var4) {
      for(var4 = 0; var4 < this.gc.size(); ++var4) {
         DataSkillEff var5;
         if ((var5 = (DataSkillEff)this.gc.elementAt(var4)) != null) {
            var5.a(var1, var2, var3);
         }
      }

   }

   public final void b(mGraphics var1, int var2, int var3, int var4) {
      for(var4 = 0; var4 < this.gc.size(); ++var4) {
         DataSkillEff var5;
         if ((var5 = (DataSkillEff)this.gc.elementAt(var4)) != null) {
            var5.b(var1, var2, var3);
         }
      }

   }

   public final void a(byte var1, int var2) {
      for(int var3 = 0; var3 < this.gc.size(); ++var3) {
         DataSkillEff var4;
         if ((var4 = (DataSkillEff)this.gc.elementAt(var3)) != null) {
            var4.a();
            if (var4.i) {
               this.gc.removeElement(var4);
            }
         }
      }

      if (var1 == 0 && var2 == 14) {
         this.gc.removeAllElements();
      }

      if (var1 == 1 && var2 == 0) {
         this.gc.removeAllElements();
      }

   }
}

public final class Clan {
   public String name = "";
   public int exp;
   public int expNext;
   public int level;
   public int itemLevel;
   public int icon;
   public int coin;
   public int freeCoin;
   public int coinUp;
   public String main_name = "";
   public String assist_name = "";
   public String log = "";
   public String alert = "";
   public int use_card;
   public int openDun;
   public Item[] items;

   public Clan() {
      new MyVector();
   }

   public final void writeLog(String var1) {
      String[] var2 = NinjaUtil.split(var1, "\n");
      this.log = "";

      try {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            String var4;
            if (!(var4 = var2[var3].trim()).equals("")) {
               try {
                  String[] var5;
                  String var6 = (var5 = NinjaUtil.split(var4, ","))[0];
                  int var7;
                  if ((var7 = Integer.parseInt(var5[1])) == 0) {
                     var6 = "c0" + var6;
                     var6 = var6 + mResources.ms[1] + " " + NinjaUtil.numberToString(var5[2]) + " " + mResources.ms[0] + " " + var5[3];
                  } else if (var7 == 1) {
                     var6 = "c1" + var6;
                     var6 = var6 + " " + mResources.ms[2] + " " + NinjaUtil.numberToString(var5[2]) + " " + mResources.ms[0] + " " + var5[3];
                  } else if (var7 == 2) {
                     var6 = "c2" + var6;
                     var6 = var6 + " " + mResources.ms[3] + " " + NinjaUtil.numberToString(var5[2]) + " " + mResources.ms[0] + " " + var5[3];
                  } else if (var7 == 3) {
                     var6 = "c1" + var6;
                     var6 = var6 + " " + mResources.ms[4] + " " + NinjaUtil.numberToString(var5[2]) + " " + mResources.ms[0] + " " + var5[3];
                  } else if (var7 == 4) {
                     var6 = "c1" + var6;
                     var6 = var6 + mResources.ms[5] + " " + NinjaUtil.numberToString(var5[2]) + " " + mResources.ms[0] + " " + var5[3];
                  } else if (var7 == 5) {
                     var6 = "c2" + var6;
                     var6 = var6 + " " + mResources.ms[6] + " " + NinjaUtil.numberToString(var5[2]) + " " + mResources.ms[0] + " " + var5[3];
                  }

                  this.log = this.log + var6 + "\n";
               } catch (Exception var8) {
               }
            }
         }
      } catch (Exception var9) {
      }

   }
}

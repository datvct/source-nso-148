import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.microedition.lcdui.Image;

 public final class Item {
   public ItemTemplate template;
   public MyVector options;
   public int c;
   public int indexUI;
   public int quantity;
   public long expires;
   public boolean isLock;
   public int sys;
   public int upgrade;
   public int buyCoinLock;
   public int buyGold;
   public int buyGoldLock;
   public int saleCoinLock;
   public int typeUI;
   public boolean isExpires;
   public EffectCharPaint p;
   public int q;
   public Image r;
   public boolean s = false;
   public long t = 0L;
   public long u = 0L;
   public boolean v = false;

   public final Item clone() {
      Item var1;
      (var1 = new Item()).template = this.template;
      if (this.options != null) {
         var1.options = new MyVector();

         for(int var2 = 0; var2 < this.options.size(); ++var2) {
            ItemOption var3;
            (var3 = new ItemOption()).optionTemplate = ((ItemOption)this.options.elementAt(var2)).optionTemplate;
            var3.param = ((ItemOption)this.options.elementAt(var2)).param;
            var1.options.addElement(var3);
         }
      }

      var1.c = this.c;
      var1.indexUI = this.indexUI;
      var1.quantity = this.quantity;
      var1.expires = this.expires;
      var1.isLock = this.isLock;
      var1.sys = this.sys;
      var1.upgrade = this.upgrade;
      var1.buyCoinLock = this.buyCoinLock;
      var1.buyGold = this.buyGold;
      var1.buyGoldLock = this.buyGoldLock;
      var1.saleCoinLock = this.saleCoinLock;
      var1.typeUI = this.typeUI;
      var1.isExpires = this.isExpires;
      return var1;
   }

   public final Item viewNext(int var1) {
      Item var2;
      (var2 = this.clone()).isLock = true;
      int var3;
      if ((var3 = var1 - var2.upgrade) == 0) {
         return var2;
      } else {
         var2.upgrade = var1;
         if (var2.options != null) {
            for(var1 = 0; var1 < var2.options.size(); ++var1) {
               ItemOption var4;
               if ((var4 = (ItemOption)var2.options.elementAt(var1)).optionTemplate.id != 6 && var4.optionTemplate.id != 7) {
                  if (var4.optionTemplate.id != 8 && var4.optionTemplate.id != 9 && var4.optionTemplate.id != 19) {
                     if (var4.optionTemplate.id != 10 && var4.optionTemplate.id != 11 && var4.optionTemplate.id != 12 && var4.optionTemplate.id != 13 && var4.optionTemplate.id != 14 && var4.optionTemplate.id != 15 && var4.optionTemplate.id != 17 && var4.optionTemplate.id != 18 && var4.optionTemplate.id != 20) {
                        if (var4.optionTemplate.id != 21 && var4.optionTemplate.id != 22 && var4.optionTemplate.id != 23 && var4.optionTemplate.id != 24 && var4.optionTemplate.id != 25 && var4.optionTemplate.id != 26) {
                           if (var4.optionTemplate.id == 16) {
                              var4.param += var3 * 3;
                           }
                        } else {
                           var4.param += var3 * 150;
                        }
                     } else {
                        var4.param += var3 * 5;
                     }
                  } else {
                     var4.param += var3 * 10;
                  }
               } else {
                  var4.param += var3 * 15;
               }
            }
         }

         return var2;
      }
   }

   public final boolean isTypeBody() {
      return this.template.type >= 0 && this.template.type <= 15;
   }

   public final boolean isTypeMounts() {
      return 29 <= this.template.type && this.template.type <= 33;
   }

   public final boolean isTypeNgocKham() {
      return this.template.type == 34;
   }

   public final String getExpiresString() {
      if (this.expires <= 0L) {
         return mResources.ev;
      } else {
         Calendar var1;
         (var1 = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("GMT+7"));
         var1.setTime(new Date(this.expires));
         int var2 = var1.get(11);
         int var3 = var1.get(12);
         int var4 = var1.get(5);
         int var5 = var1.get(2) + 1;
         int var6 = var1.get(1);
         return var4 + "/" + var5 + "/" + var6 + " " + var2 + "h" + var3 + "'";
      }
   }

   public final String getExpiresShopString() {
      if (this.expires <= 0L) {
         return mResources.ev;
      } else if (this.expires / 1000L >= 2592000L) {
         return this.expires / 1000L / 2592000L + " " + mResources.ld;
      } else if (this.expires / 1000L >= 604800L) {
         return this.expires / 1000L / 604800L + " " + mResources.le;
      } else if (this.expires / 1000L >= 86400L) {
         return this.expires / 1000L / 86400L + " " + mResources.lf;
      } else if (this.expires / 1000L >= 3600L) {
         return this.expires / 1000L / 3600L + " " + mResources.lg;
      } else {
         return this.expires / 1000L >= 60L ? this.expires / 1000L / 60L + " " + mResources.li : "";
      }
   }

   public final void clearExpire() {
      if (!this.isTypeMounts()) {
         this.expires = 0L;
      }

   }

   public final boolean isTypeUIMe() {
      return this.typeUI == 5 || this.typeUI == 3 || this.typeUI == 4 || this.typeUI == 39;
   }

   public final boolean isTypeUIShopView() {
      return this.isTypeUIShop() || this.isTypeUIStore() || this.isTypeUIBook() || this.isTypeUIFashion() || this.isTypeUIClanShop();
   }

   public final boolean isTypeUIShop() {
      return this.typeUI == 20 || this.typeUI == 21 || this.typeUI == 22 || this.typeUI == 23 || this.typeUI == 24 || this.typeUI == 25 || this.typeUI == 26 || this.typeUI == 27 || this.typeUI == 28 || this.typeUI == 29 || this.typeUI == 16 || this.typeUI == 17 || this.typeUI == 18 || this.typeUI == 19 || this.typeUI == 2 || this.typeUI == 6 || this.typeUI == 8 || this.typeUI == 34;
   }

   public final boolean isTypeUIShopLock() {
      return this.typeUI == 7 || this.typeUI == 9;
   }

   public final boolean isTypeUIStore() {
      return this.typeUI == 14;
   }

   public final boolean isTypeUIBook() {
      return this.typeUI == 15;
   }

   public final boolean isTypeUIFashion() {
      return this.typeUI == 32;
   }

   public final boolean isTypeUIClanShop() {
      return this.typeUI == 34;
   }

   public final boolean isUpMax() {
      return this.getUpMax() == this.upgrade;
   }

   public final int getUpMax() {
      if (this.template.level > 0 && this.template.level < 20) {
         return 4;
      } else if (this.template.level >= 20 && this.template.level < 40) {
         return 8;
      } else if (this.template.level >= 40 && this.template.level < 50) {
         return 12;
      } else {
         return this.template.level >= 50 && this.template.level < 60 ? 14 : 16;
      }
   }

   public final boolean isTypeClothe() {
      return this.template.type == 0 || this.template.type == 2 || this.template.type == 4 || this.template.type == 6 || this.template.type == 8;
   }

   public final boolean isTypeAdorn() {
      return this.template.type == 3 || this.template.type == 5 || this.template.type == 7 || this.template.type == 9;
   }

   public final boolean isTypeWeapon() {
      return this.template.type == 1;
   }

   public final int getTinhLuyen(int var1) {
      if (this.options != null) {
         for(var1 = 0; var1 < this.options.size(); ++var1) {
            ItemOption var2;
            if ((var2 = (ItemOption)this.options.elementAt(var1)) != null && var2.optionTemplate.id == 85) {
               return var2.param;
            }
         }
      }

      return -1;
   }

   public final boolean isNewitem(int var1) {
      if (this.options != null) {
         for(int var2 = 0; var2 < this.options.size(); ++var2) {
            ItemOption var3;
            if ((var3 = (ItemOption)this.options.elementAt(var2)) != null && var3.optionTemplate.id == var1) {
               return true;
            }
         }
      }

      return false;
   }
}

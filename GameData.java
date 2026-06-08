import javax.microedition.lcdui.Image;

public final class GameData {
   public static mHashtable listImgIcon;
   public static mHashtable listbyteData;

   public static void init() {
      listImgIcon = new mHashtable();
      listbyteData = new mHashtable();
   }

   public static EffectData a(short var0) {
      EffectData var1;
      if ((var1 = (EffectData) listbyteData.get(String.valueOf(var0))) == null) {
         var1 = new EffectData();
         listbyteData.put(String.valueOf(var0), var1);
         Service.gI().aq(var0);
      }

      return var1;
   }

   public static ImageIcon getImgIcon(short var0) {
      try {
         ImageIcon var1;
         if ((var1 = (ImageIcon) listImgIcon.get(String.valueOf(var0))) == null || var1 != null && var1.img == null) {
            if (var1 == null) {
               var1 = new ImageIcon();
               listImgIcon.put(String.valueOf(var0), var1);
            }

            var1.img = Controller.a(mResources.b("effect " + var0));
            if (var1.img == null && System.currentTimeMillis() / 1000L - var1.id > 10L) {
               var1.id = (long)((int)(System.currentTimeMillis() / 1000L));
               if (var0 >= 0) {
                  var1.img = GameCanvas.loadImage("/eff_auto/" + var0 + ".png");
               }

               if (var1.img == null && Session_ME.getInstance().connected) {
                  Service.gI().c(var0);
                  var1.id = (long)((int)(System.currentTimeMillis() / 1000L));
               }

               System.currentTimeMillis();
            }
         }

         return var1;
      } catch (Exception var2) {
         return null;
      }
   }

   public static void a(short var0, byte[] var1) {
      try {
         ImageIcon var2;
         if ((var2 = (ImageIcon) listImgIcon.get(String.valueOf(var0))) == null) {
            var2 = new ImageIcon();
         }

         listImgIcon.put(String.valueOf(var0), var2);
         if (var1.length > 0) {
            var2.img = Image.createImage(var1, 0, var1.length);
         } else {
            var2.id = (long)((int)(System.currentTimeMillis() / 1000L));
         }

         System.currentTimeMillis();
      } catch (Exception var3) {
      }

   }

   public static void b() {
      listImgIcon = null;
      listbyteData = null;
   }

   static {
      Main.main(22);
      init();
   }
}

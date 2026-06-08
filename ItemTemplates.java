public final class ItemTemplates {
   public static mHashtable itemTemplates;

   public static void init() {
      itemTemplates = new mHashtable();
   }

   public static void add(ItemTemplate var0) {
      itemTemplates.put(new Short(var0.id), var0);
   }

   public static ItemTemplate get(short var0) {
      return (ItemTemplate) itemTemplates.get(new Short(var0));
   }

   public static short getIcon(short var0) {
      return get(var0).iconID;
   }

   public static void clear() {
      itemTemplates = null;
   }

   static {
      Main.main(1);
      init();
   }
}

public final class Skills {
   private static mHashtable skills;

   public static void init() {
      skills = new mHashtable();
   }

   public static void add(Skill var0) {
      skills.put(new Short(var0.skillId), var0);
   }

   public static Skill get(short var0) {
      return (Skill) skills.get(new Short(var0));
   }

   public static void close() {
      skills = null;
   }

   static {
      Main.main(44);
      init();
   }
}

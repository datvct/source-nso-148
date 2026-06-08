public final class ItemTemplate {
   public short id;
   public byte type;
   public byte gender;
   public String name;
   public String description;
   public byte level;
   public short iconID;
   public short part;
   public boolean isUpToUp;

   public ItemTemplate(short id, byte type, byte gender, String name, String description, byte level, short iconID, short part, boolean isUpToUp) {
      this.id = id;
      this.type = type;
      this.gender = gender;
      this.name = name;
      this.description = description;
      this.level = level;
      this.iconID = iconID;
      this.part = part;
      this.isUpToUp = isUpToUp;
   }

   public final boolean a() {
      return this.type >= 0 && this.type <= 15;
   }

   public final boolean b() {
      return this.type >= 23 && this.type <= 25;
   }
}

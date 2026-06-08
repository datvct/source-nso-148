public abstract class Class_cv extends Auto {
   public static boolean a() {
      for(int var0 = 0; var0 < GameScr.vItemMap.size(); ++var0) {
         if (((ItemMap)GameScr.vItemMap.elementAt(var0)).template.type == 19) {
            return true;
         }
      }

      return false;
   }

   protected static void c() {
      int var0 = 115;
      ItemMap var1 = null;
      Char var2 = Char.getMyChar();

      for(int var3 = 0; var3 < GameScr.vItemMap.size(); ++var3) {
         ItemMap var4 = (ItemMap)GameScr.vItemMap.elementAt(var3);
         int var5 = Res.a(var2.cx, var2.cy, var4.xEnd, var4.yEnd);
         if ((var0 == -1 || var5 < var0) && (NSOT_MOB.a(var4.template) || var2.nClass.classId == 1 && var4.template.id == 218) && (Char.af() > 2 || var4.template.type == 19 || var4.template.isUpToUp && Char.h(var4.template.id))) {
            var0 = var5;
            var1 = var4;
         }
      }

      if (var1 != null) {
         Service.gI().pickItem(var1.g);
      }

   }

   protected final void m() {
      if (TileMap.mapID != 22) {
         this.a(22, -2, -1, -1);
      } else {
         Char var1;
         if ((var1 = Char.getMyChar()).a != null) {
            GameScr.h(12);
            Service.gI().openMenu(12);
            Service.gI().menu(12, 3, 0);
            NSOT_MOB.a(500L);
            Class_cl.z();
         } else {
            for(int var2 = 0; var2 < var1.vSkillFight.size(); ++var2) {
               Skill var3;
               if ((var3 = (Skill)var1.vSkillFight.elementAt(var2)) != null && !var3.isCooldown() && var3.template.id >= 67 && var3.template.id <= 72) {
                  Service.gI().selectSkill(var3.template.id);
                  Service.gI().sendUseSkillMyBuff();
                  Class_cl.z();
                  break;
               }
            }

            NSOT_MOB.a(500L);
         }
      }

   }
}

public final class Skill {
   public SkillTemplate template;
   public short skillId;
   public int point;
   public int level;
   public int coolDown;
   public long lastTimeUseThisSkill;
   public int dx;
   public int dy;
   public int maxFight;
   public int manaUse;
   public SkillOption[] k;
   public boolean l = false;

   public final void paint(int var1, int var2, mGraphics var3) {
      SmallImage.drawSmallImageNew(var3, this.template.iconId, var1, var2, 0, StaticObj.VCENTER_HCENTER);
      long var4;
      if ((var4 = System.currentTimeMillis() - this.lastTimeUseThisSkill) < (long)this.coolDown) {
         var3.a(3355443);
         if (this.l && GameCanvas.u % 6 > 2) {
            var3.a(4473924);
         }

         int var6 = (int)(var4 * 18L / (long)this.coolDown);
         var3.c(var1 - 9, var2 - 9 + var6, 18, 18 - var6);
      } else {
         this.l = false;
      }

   }

   public final boolean isCooldown() {
      return System.currentTimeMillis() - this.lastTimeUseThisSkill < (long)this.coolDown;
   }

   public final int b() {
      return NSOT_MOB.am ? NSOT_MOB.an : this.dx;
   }

   public final int c() {
      return NSOT_MOB.ao ? NSOT_MOB.ap : this.dy;
   }

   public final int d() {
      return NSOT_MOB.aq ? NSOT_MOB.ar : this.maxFight;
   }
}

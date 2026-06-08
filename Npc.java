public final class Npc extends Char {
   public NpcTemplate template;
   public static NpcTemplate[] arrNpcTemplate;

   public Npc(int var1, int var2, int var3, int var4) {
      super.cx = var2;
      super.cy = var3;
      super.statusMe = var1;
      this.template = arrNpcTemplate[var4];
   }

   public static void clearEffTask() {
      for(int var0 = 0; var0 < GameScr.vSet.size(); ++var0) {
         Npc var1;
         (var1 = (Npc)GameScr.vSet.elementAt(var0)).effTask = null;
         var1.indexEffTask = -1;
      }

   }

   public final void update() {
      if (super.effTask == null) {
         label47: {
            label53: {
               byte[] var1 = new byte[]{-1, 9, 9, 10, 10, 11, 11};
               if (Char.getMyChar().ctaskId >= 9 && Char.getMyChar().ctaskId <= 10 && Char.getMyChar().nClass.classId > 0 && var1[Char.getMyChar().nClass.classId] == this.template.npcTemplateId) {
                  if (Char.getMyChar().taskMaint != null) {
                     if (Char.getMyChar().taskMaint == null || Char.getMyChar().taskMaint.index + 1 != Char.getMyChar().taskMaint.subNames.length) {
                        break label47;
                     }

                     super.effTask = GameScr.v[62];
                     break label53;
                  }
               } else {
                  GameScr.gI();
                  byte var2 = GameScr.af();
                  if (Char.getMyChar().taskMaint != null || var2 != this.template.npcTemplateId) {
                     if (Char.getMyChar().taskMaint == null || var2 != this.template.npcTemplateId) {
                        break label47;
                     }

                     if (Char.getMyChar().taskMaint.index + 1 == Char.getMyChar().taskMaint.subNames.length) {
                        super.effTask = GameScr.v[62];
                        break label53;
                     }
                  }
               }

               super.effTask = GameScr.v[57];
            }

            super.indexEffTask = 0;
         }
      }

      super.update();
   }

   public final void paint(mGraphics var1) {
      if (this.isPaint() && super.statusMe != 15) {
         if (super.cTypePk != 0) {
            super.paint(var1);
            return;
         }

         if (this.template != null) {
            if (this.template.npcTemplateId == 13) {
               if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.equals(this)) {
                  SmallImage.drawSmallImageNew(var1, 988, super.cx, super.cy - super.ch - 1, 0, 33);
               }

               SmallImage.drawSmallImageNew(var1, 1060, super.cx, super.cy, 0, 33);
               mFont.tahoma_7_white.a(var1, String.valueOf(TileMap.zoneID), super.cx, super.cy - 10 - 2 - mFont.tahoma_7.d(), 2);
               return;
            }

            if (this.template.npcTemplateId == 31) {
               if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.equals(this)) {
                  SmallImage.drawSmallImageNew(var1, 988, super.cx, super.cy - super.ch - 1, 0, 33);
               }

               SmallImage.drawSmallImageNew(var1, 1291, super.cx, super.cy, 0, 33);
               return;
            }

            if (this.template.npcTemplateId == 27) {
               if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.equals(this)) {
                  SmallImage.drawSmallImageNew(var1, 988, super.cx, super.cy - super.ch - 1, 0, 33);
               }

               SmallImage.drawSmallImageNew(var1, 1224, super.cx, super.cy, 0, 33);
               return;
            }

            Part var2 = GameScr.parts[this.template.headId];
            Part var3 = GameScr.parts[this.template.legId];
            Part var4 = GameScr.parts[this.template.bodyId];
            if (super.cdir == 1) {
               SmallImage.drawSmallImageNew(var1, var2.a[Char.CharInfo[super.cf][0][0]].id, super.cx + Char.CharInfo[super.cf][0][1] + var2.a[Char.CharInfo[super.cf][0][0]].dx, super.cy - Char.CharInfo[super.cf][0][2] + var2.a[Char.CharInfo[super.cf][0][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var3.a[Char.CharInfo[super.cf][1][0]].id, super.cx + Char.CharInfo[super.cf][1][1] + var3.a[Char.CharInfo[super.cf][1][0]].dx, super.cy - Char.CharInfo[super.cf][1][2] + var3.a[Char.CharInfo[super.cf][1][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var4.a[Char.CharInfo[super.cf][2][0]].id, super.cx + Char.CharInfo[super.cf][2][1] + var4.a[Char.CharInfo[super.cf][2][0]].dx, super.cy - Char.CharInfo[super.cf][2][2] + var4.a[Char.CharInfo[super.cf][2][0]].dy, 0, 0);
            } else {
               SmallImage.drawSmallImageNew(var1, var2.a[Char.CharInfo[super.cf][0][0]].id, super.cx - Char.CharInfo[super.cf][0][1] - var2.a[Char.CharInfo[super.cf][0][0]].dx, super.cy - Char.CharInfo[super.cf][0][2] + var2.a[Char.CharInfo[super.cf][0][0]].dy, 2, 24);
               SmallImage.drawSmallImageNew(var1, var3.a[Char.CharInfo[super.cf][1][0]].id, super.cx - Char.CharInfo[super.cf][1][1] - var3.a[Char.CharInfo[super.cf][1][0]].dx, super.cy - Char.CharInfo[super.cf][1][2] + var3.a[Char.CharInfo[super.cf][1][0]].dy, 2, 24);
               SmallImage.drawSmallImageNew(var1, var4.a[Char.CharInfo[super.cf][2][0]].id, super.cx - Char.CharInfo[super.cf][2][1] - var4.a[Char.CharInfo[super.cf][2][0]].dx, super.cy - Char.CharInfo[super.cf][2][2] + var4.a[Char.CharInfo[super.cf][2][0]].dy, 2, 24);
            }

            if (super.indexEffTask >= 0 && super.effTask != null && super.cTypePk == 0) {
               SmallImage.drawSmallImageNew(var1, super.effTask.arrEfInfo[super.indexEffTask].idImg, super.cx + super.effTask.arrEfInfo[super.indexEffTask].dx, super.cy + super.effTask.arrEfInfo[super.indexEffTask].dy, 0, 3);
               if (GameCanvas.u % 2 == 0) {
                  ++super.indexEffTask;
                  if (super.indexEffTask >= super.effTask.arrEfInfo.length) {
                     super.indexEffTask = 0;
                  }
               }
            }

            if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.equals(this)) {
               mFont.tahoma_7_yellow.a(var1, this.template.name, super.cx, super.cy - super.ch - mFont.tahoma_7.d() - 7, 2, mFont.tahoma_7_grey);
               SmallImage.drawSmallImageNew(var1, 988, super.cx, super.cy - super.ch - 2, 0, 33);
               return;
            }

            mFont.tahoma_7_yellow.a(var1, this.template.name, super.cx, super.cy - super.ch - 3 - mFont.tahoma_7.d(), 2, mFont.tahoma_7_grey);
         }
      }

   }

   public static void aj() {
   }

   public static void ak() {
      arrNpcTemplate = null;
   }

   static {
      Main.main(57);
      aj();
   }
}

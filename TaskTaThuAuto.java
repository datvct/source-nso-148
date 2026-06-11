public final class TaskTaThuAuto extends Auto {
   private TaskOrder r;
   public int o;
   public static boolean p;
   public static long q;
   public static int partyGatherMapId = getInt("auto_party_tathu_map", -1);
   public static int partyGatherZoneId = getInt("auto_party_tathu_zone", -1);
   public static int partyQuestCount = 0;

   public final void g() {
      super.g();
      this.r = Char.j(1);
      if (this.r != null) {
         this.o = this.r.killId;
         super.b = this.r.mapId;
         if (TileMap.mapID == this.r.mapId && TileMap.zoneID % 5 == 0) {
            super.c = TileMap.zoneID;
            return;
         }
      }

      super.c = 5;
      p = false;
   }

   public final void a(int var1, int var2) {
      super.g();
      this.r = null;
      this.o = var2;
      super.b = var1;
      if (TileMap.mapID == var1 && TileMap.zoneID % 5 == 0) {
         super.c = TileMap.zoneID;
      } else {
         super.c = 5;
      }

   }

   public final void h() {
      this.r = Char.j(1);
      super.h();
   }

   public final void update() {
      NSOT_MOB var1;
      if (super.b < 0) {
         var1 = NSOT_MOB.mod_nst;
         NSOT_MOB.d();
      } else {
         boolean var2;
         int var3;
         
         if (AutoTaThuPanel.isPartyTaThuOn) {
            boolean isLeader = GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.elementAt(0)).charId == Char.getMyChar().charID;
            
            if (this.r == null) {
               if (TileMap.mapID == partyGatherMapId && TileMap.zoneID == partyGatherZoneId) {
                  if (isLeader) {
                     boolean allGathered = true;
                     for(int i = 0; i < GameScr.vParty.size(); i++) {
                        Party p = (Party)GameScr.vParty.elementAt(i);
                        if (p.charId == Char.getMyChar().charID) {
                           continue;
                        }

                        if (p.c == null || p.c.cHp <= 0 || Math.abs(p.c.cx - Char.getMyChar().cx) > 300) {
                           allGathered = false;
                           break;
                        }
                     }
                     if (allGathered) {
                        GameScr.addChatPopup("Đủ người, nhận NV tà thú!");
                        GameScr.h(11);
                        Service.gI().menu(11, 1, 0); // Nhận nhiệm vụ
                     }
                  }
               } else {
                  this.a(partyGatherMapId, partyGatherZoneId, -1, -1);
               }
               return;
            } else {
               if (this.r.count >= this.r.maxCount) {
                  if (TileMap.mapID == partyGatherMapId && TileMap.zoneID == partyGatherZoneId) {
                     GameScr.h(11);
                     Service.gI().menu(11, 1, 0); // Trả nhiệm vụ
                     this.r = null;
                     partyQuestCount++;
                     if (partyQuestCount >= 2) {
                        GameScr.addChatPopup("Xong 2 lần Tà Thú nhóm");
                        if (AutoDailyPanel.isAutoDHDOn && NSOT_MOB.autoDHDState == 3) {
                           Service.gI().chatParty("done_dhd");
                           NSOT_MOB.autoDHDState = 4;
                           Session_ME.getInstance().cleanNetwork();
                           Controller.gI().onDisconnected();
                        } else {
                           var1 = NSOT_MOB.mod_nst;
                           NSOT_MOB.d();
                        }
                     }
                  } else {
                     this.a(partyGatherMapId, partyGatherZoneId, -1, -1);
                  }
                  return;
               }
            }
         }

         if (Auto.i()) {
            if (Char.eg && TileMap.mapID == super.b && TileMap.zoneID == super.c && Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.hp < Char.getMyChar().mobFocus.maxHp / 20) {
               var3 = 0;

               while(true) {
                  if (var3 >= GameScr.vParty.size()) {
                     var2 = false;
                     break;
                  }

                  Party var4;
                  if ((var4 = (Party)GameScr.vParty.elementAt(var3)).c != null && var4.c.cHp > 0) {
                     var2 = true;
                     break;
                  }

                  ++var3;
               }
            } else {
               var2 = false;
            }

            if (!var2) {
               long var6;
               NSOT_MOB.a(var6 = 100L * (long)NSOT_MOB.u / 10L);
               Auto.a(true);
               NSOT_MOB.a(var6);
               return;
            }
         } else if (TileMap.mapID == super.b && TileMap.zoneID == super.c) {
            if (this.r != null && this.r.count >= this.r.maxCount) {
               if (!AutoTaThuPanel.isPartyTaThuOn) {
                  GameScr.addChatPopup("Xong Tà Thú");
                  var1 = NSOT_MOB.mod_nst;
                  NSOT_MOB.d();
               }
               return;
            }

            if (Char.getMyChar().cName.equals(NSOT_MOB.d)) {
               if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.hp < Char.getMyChar().mobFocus.maxHp / 10) {
                  if (!Class_cl.y()) {
                     Service.gI().chatParty("waitGr");
                     Class_cl.a(200000L);
                     Service.gI().chatParty("notifyGr");
                  }

                  var2 = false;
               } else {
                  var2 = false;
               }
            } else {
               if (p && System.currentTimeMillis() - q > 120000L) {
                  p = false;
               }

               var2 = p;
            }

            if (!var2) {
               this.c(this.o, 8);
            }

            if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.el / 100) {
               Char.getMyChar().doUsePotion(17);
            }

            if (Char.getMyChar().cHp < Char.getMyChar().cMaxHp * Char.ek / 100) {
               var3 = (int)(System.currentTimeMillis() / 1000L);

               for(int var7 = 0; var7 < Char.getMyChar().vEff.size(); ++var7) {
                  Effect var5;
                  if ((var5 = (Effect)Char.getMyChar().vEff.elementAt(var7)).template.id == 21 && var5.timeLenght - (var3 - var5.timeStart) >= 2) {
                     return;
                  }
               }

               Char.getMyChar().doUsePotion(16);
               return;
            }
         } else {
            this.a(super.b, super.c, super.e, super.f);
         }
      }

   }

   public final String toString() {
      return "Auto T\u00e0 Th\u00fa";
   }

   public static void a() {
   }

   public static void c() {
      p = false;
      q = 0L;
   }

   private static int getInt(String var0, int var1) {
      String var2 = mResources.c(var0);
      if (var2 == null) {
         return var1;
      }

      try {
         return Integer.parseInt(var2.trim());
      } catch (Exception var4) {
         return var1;
      }
   }

   static {
      Main.main(50);
      a();
   }
}

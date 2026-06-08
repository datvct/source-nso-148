import java.io.IOException;

public final class Service {
   private ISession session = Session_ME.getInstance();
   private static Service instance;
   private int xx;
   private int yy;

   public static Service gI() {
      if (instance == null) {
         instance = new Service();
      }

      return instance;
   }

   private static Message messageNotLogin(byte var0) {
      Message var1 = null;

      try {
         (var1 = new Message((byte)-29)).writer().writeByte(var0);
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      return var1;
   }

   private static Message messageNotMap(byte var0) {
      Message var1 = null;

      try {
         (var1 = new Message((byte)-28)).writer().writeByte(var0);
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      return var1;
   }

   private static Message messageSubCommand(byte var0) {
      Message var1 = null;

      try {
         (var1 = new Message((byte)-30)).writer().writeByte(var0);
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      return var1;
   }

   public final void setClientType() {
      try {
         Message var1;
         (var1 = messageNotLogin((byte)-125)).writer().writeByte(GameMidlet.e);
         var1.writer().writeByte(mGraphics.b);
         var1.writer().writeBoolean(GameCanvas.c);
         var1.writer().writeInt(GameCanvas.z);
         var1.writer().writeInt(GameCanvas.aa);
         var1.writer().writeBoolean(TField.h);
         var1.writer().writeBoolean(GameCanvas.isTouch);
         var1.writer().writeUTF(System.getProperty("microedition.platform"));
         var1.writer().writeByte(0);
         var1.writer().writeInt(0);
         var1.writer().writeByte(mResources.h);
         var1.writer().writeInt(GameMidlet.h);
         var1.writer().writeUTF(GameMidlet.i);
         this.session.sendMessage(var1);
         var1.close();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }

   public final void login(String username, String pass, String version) {
      this.setClientType();

      // Connect to Python GUI Manager
      GUIClient.getInstance().connect(username);

      try {
         Message var4;
         (var4 = messageNotLogin((byte)-127)).writer().writeUTF(username);
         var4.writer().writeUTF(pass);
         var4.writer().writeUTF(version);
         var4.writer().writeUTF("");
         var4.writer().writeUTF("");
         var4.writer().writeUTF(mResources.c("random"));
         var4.writer().writeByte(GameMidlet.serverLogin);
         this.session.sendMessage(var4);
         var4.close();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public final void requestRegisterNew(String username, String pass, String email) {
      try {
         Message var4;
         (var4 = new Message((byte)118)).writer().writeUTF(username);
         var4.writer().writeUTF(pass);
         var4.writer().writeUTF(email);
         this.session.sendMessage(var4);
         var4.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public final void requestForgetPass(String var1) {
      try {
         Message var2;
         (var2 = messageNotLogin((byte)-122)).writer().writeUTF(var1);
         this.session.sendMessage(var2);
         var2.close();
      } catch (IOException var3) {
         var3.printStackTrace();
      }

   }

   public final void requestChangeMap() {
      Message var1 = new Message((byte)-17);
      this.session.sendMessage(var1);
      var1.close();
   }

   public final void requestChangeZone(int zoneId, int indexUI) {
      Message message = new Message((byte)28);

      try {
         message.writer().writeByte(zoneId);
         message.writer().writeByte(indexUI);
         this.session.sendMessage(message);
         message.close();
      } catch (Exception var5) {
      }

   }

   public final void charMove(int var1, int var2) {
      try {
         Message var3;
         (var3 = new Message((byte)1)).writer().writeShort(var1);
         var3.writer().writeShort(var2);
         this.xx = var1;
         this.yy = var2;
         this.session.sendMessage(var3);
         var3.close();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public final void selectCharToPlay(String var1) {
      Message var2 = new Message((byte)-28);

      try {
         var2.writer().writeByte(-126);
         var2.writer().writeUTF(var1);
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      this.session.sendMessage(var2);
   }

   public final void createChar(String name, int gender, int hair) {
      Message var4 = new Message((byte)-28);

      try {
         var4.writer().writeByte(-125);
         var4.writer().writeUTF(name);
         var4.writer().writeByte(gender);
         var4.writer().writeByte(hair);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      this.session.sendMessage(var4);
   }

   public final void requestModTemplate(int var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-108)).writer().writeByte(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void requestItemInfo(int typeUI, int indexUI) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)42)).writer().writeByte(typeUI);
         var3.writer().writeByte(indexUI);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void requestItemPlayer(int charId, int indexUI) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)94)).writer().writeInt(charId);
         var3.writer().writeByte(indexUI);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void upPotential(int index, int point) {
      Message var3 = null;

      try {
         (var3 = messageSubCommand((byte)-109)).writer().writeByte(index);
         var3.writer().writeShort(point);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void upSkill(int skillTemplateId, int point) {
      Message var3 = null;

      try {
         (var3 = messageSubCommand((byte)-108)).writer().writeShort(skillTemplateId);
         var3.writer().writeByte(point);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void itemBodyToBag(int indexUI) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)15)).writer().writeByte(indexUI);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void itemMonToBag(int indexUI) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)108)).writer().writeByte(indexUI);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void itemBoxToBag(int indexUI) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)16)).writer().writeByte(indexUI);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void itemBagToBox(int indexUI) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)17)).writer().writeByte(indexUI);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void useItem(int indexUI) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)11)).writer().writeByte(indexUI);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

      if (Char.getMyChar().arrItemBag[indexUI] != null && Char.getMyChar().arrItemBag[indexUI].template.type == 24) {
         GameScr.gI().resetButton();
         InfoDlg.showWait("");
      }

   }

   public final void saleItem(int indexUI, int quantity) {
      GameCanvas.msgdlg.pleasewait();
      Message var3 = null;

      try {
         (var3 = new Message((byte)14)).writer().writeByte(indexUI);
         if (quantity > 1) {
            var3.writer().writeInt(quantity);
         }

         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

  

   public final void buyItem(int typeUI, int indexUI, int quantity) {
      GameCanvas.msgdlg.pleasewait();
      Message var4 = null;

      try {
         (var4 = new Message((byte)13)).writer().writeByte(typeUI);
         var4.writer().writeByte(indexUI);
         if (quantity > 1) {
            var4.writer().writeShort(quantity);
         }

         this.session.sendMessage(var4);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.close();
      }

   }

   public final void buyItem_food(int var1, int var2, int var3) {
      Message var4 = null;

      try {
         (var4 = new Message((byte)13)).writer().writeByte(9);
         var4.writer().writeByte(var2);
         if (var3 > 1) {
            var4.writer().writeShort(var3);
         }

         this.session.sendMessage(var4);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.close();
      }

   }

   public final void selectSkill(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)41)).writer().writeShort(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void openFindParty() {
      Message var1 = null;

      try {
         var1 = messageSubCommand((byte)-77);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void openUIZone() {
      Message var1 = null;

      try {
         var1 = new Message((byte)36);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void useItemChangeMap(int var1, int var2) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)12)).writer().writeByte(var1);
         var3.writer().writeByte(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void openMenu(int npcId) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)40)).writer().writeShort(npcId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void menu(int typeclose, int npcId, int menuId) {
      Message var4 = null;

      try {
         (var4 = new Message((byte)29)).writer().writeByte(typeclose);
         var4.writer().writeByte(npcId);
         var4.writer().writeByte(menuId);
         this.session.sendMessage(var4);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.close();
      }

   }

   public final void menuId(short menuId) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)34)).writer().writeShort(menuId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void textBoxId(short var1, String var2) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)92)).writer().writeShort(var1);
         var3.writer().writeUTF(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void requestItem(int typeUI) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-103)).writer().writeByte(typeUI);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void bagSort() {
      Message var1 = null;

      try {
         var1 = messageSubCommand((byte)-107);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void boxSort() {
      Message var1 = null;

      try {
         var1 = messageSubCommand((byte)-106);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void boxCoinIn(int var1) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-105)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void boxCoinOut(int var1) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-104)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void crystalCollect(Item[] var1) {
      GameCanvas.msgdlg.pleasewait();
      Message var2 = null;

      try {
         var2 = new Message((byte)19);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               var2.writer().writeByte(var1[var3].indexUI);
            }
         }

         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void upgradeItem(Item var1, Item[] var2, boolean var3) {
      GameCanvas.msgdlg.pleasewait();
      Message var4 = null;

      try {
         (var4 = new Message((byte)21)).writer().writeBoolean(var3);
         var4.writer().writeByte(var1.indexUI);

         for(int var5 = 0; var5 < var2.length; ++var5) {
            if (var2[var5] != null) {
               var4.writer().writeByte(var2[var5].indexUI);
            }
         }

         this.session.sendMessage(var4);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.close();
      }

   }

   public final void crystalCollectLock(Item[] var1) {
      GameCanvas.msgdlg.pleasewait();
      Message var2 = null;

      try {
         var2 = new Message((byte)20);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               var2.writer().writeByte(var1[var3].indexUI);
            }
         }

         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void c(Item[] var1) {
      Message var2 = null;

      try {
         var2 = new Message((byte)20);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               var2.writer().writeByte(var1[var3].indexUI);
            }
         }

         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void splitItem(Item var1) {
      GameCanvas.msgdlg.pleasewait();
      Message var2 = null;

      try {
         (var2 = new Message((byte)22)).writer().writeByte(var1.indexUI);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void acceptInviteTrade(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)44)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void acceptInviteTestDun(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)99)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void acceptInviteTestGT(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)106)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void sendUIConfirmID(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)107)).writer().writeByte(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void acceptInviteTest(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)66)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void cancelInviteTrade() {
      Message var1 = null;

      try {
         var1 = new Message((byte)56);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void cancelTrade() {
      Message var1 = null;

      try {
         var1 = new Message((byte)57);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void tradeAccept() {
      Message var1 = null;

      try {
         var1 = new Message((byte)46);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void tradeItemLock(int var1, Item[] var2) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)45)).writer().writeInt(var1);
         var1 = 0;

         int var4;
         for(var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4] != null) {
               ++var1;
            }
         }

         var3.writer().writeByte(var1);

         for(var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4] != null) {
               var3.writer().writeByte(var2[var4].indexUI);
            }
         }

         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void sendPlayerAttack(MyVector var1, MyVector var2, int var3) {
      Message var4 = null;
      if (var3 != 0) {
         try {
            Mob var5;
            Char var6;
            if (var1.size() > 0 && var2.size() > 0) {
               if (var3 == 1) {
                  var4 = new Message((byte)4);
               } else if (var3 == 2) {
                  var4 = new Message((byte)73);
               }

               var4.writer().writeByte(var1.size());

               for(var3 = 0; var3 < var1.size(); ++var3) {
                  var5 = (Mob)var1.elementAt(var3);
                  var4.writer().writeByte(var5.mobId);
               }

               for(var3 = 0; var3 < var2.size(); ++var3) {
                  if ((var6 = (Char)var2.elementAt(var3)) != null) {
                     var4.writer().writeInt(var6.charID);
                  } else {
                     var4.writer().writeInt(-1);
                  }
               }
            } else if (var1.size() > 0) {
               var4 = new Message((byte)60);

               for(var3 = 0; var3 < var1.size(); ++var3) {
                  var5 = (Mob)var1.elementAt(var3);
                  var4.writer().writeByte(var5.mobId);
               }
            } else if (var2.size() > 0) {
               var4 = new Message((byte)61);

               for(var3 = 0; var3 < var2.size(); ++var3) {
                  var6 = (Char)var2.elementAt(var3);
                  var4.writer().writeInt(var6.charID);
               }
            }

            if (var4 != null) {
               this.session.sendMessage(var4);
               return;
            }
         } catch (Exception var7) {
         }
      }

   }

   public final void pickItem(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)-14)).writer().writeShort(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void throwItem(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)-12)).writer().writeByte(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void returnTownFromDead() {
      Message var1 = null;

      try {
         var1 = new Message((byte)-9);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void wakeUpFromDead() {
      Message var1 = null;

      try {
         var1 = new Message((byte)-10);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void getTask(int var1, int var2) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)47)).writer().writeByte(var1);
         var3.writer().writeByte(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void chat(String text) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)-23)).writer().writeUTF(text);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void adminChat(String text) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-78)).writer().writeUTF(text);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void updateData() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-122);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void updateMap() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-121);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void updateSkill() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-120);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void updateItem() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-119);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void clientOk() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-101);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void tradeInvite(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)43)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void addFriend(String name) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)59)).writer().writeUTF(name);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void addPartyAccept(int charId) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)80)).writer().writeInt(charId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void addPartyCancel(int charId) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)81)).writer().writeInt(charId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void testInvite(int charId) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)65)).writer().writeInt(charId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void addCuuSat(int charId) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)68)).writer().writeInt(charId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void buffLive(int charId) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-79)).writer().writeInt(charId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void addParty(String name) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)79)).writer().writeUTF(name);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void requestMaptemplate(int maptemplateId) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-109)).writer().writeByte(maptemplateId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void changePk(int typePk) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-93)).writer().writeByte(typePk);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void changeTeamLeader(int index) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-87)).writer().writeByte(index);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void moveMember(int index) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-86)).writer().writeByte(index);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void sendUseSkillMyBuff() {
      Message var1 = null;

      try {
         (var1 = new Message((byte)74)).writer().writeByte(Char.getMyChar().cdir);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void createParty() {
      Message var1 = null;

      try {
         var1 = messageSubCommand((byte)-88);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void lockParty(boolean var1) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-76)).writer().writeBoolean(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void outParty() {
      Message var1 = null;

      try {
         var1 = new Message((byte)83);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void requestFriend() {
      Message var1 = null;

      try {
         var1 = messageSubCommand((byte)-85);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void requestMatchInfo(int zoneId) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)100)).writer().writeByte(zoneId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void requestPlayerInfo(MyVector var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)25)).writer().writeByte(var1.size());

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            Char var4 = (Char)var1.elementAt(var3);
            var2.writer().writeInt(var4.charID);
         }

         this.session.sendMessage(var2);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void requestEnemies() {
      Message var1 = null;

      try {
         var1 = messageSubCommand((byte)-84);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void removeFriend(String name) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-83)).writer().writeUTF(name);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void pleaseInputParty(String str) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)23)).writer().writeUTF(str);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void acceptPleaseParty(String str) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)24)).writer().writeUTF(str);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void viewInfo(String cName) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)93)).writer().writeUTF(cName);
         var2.writer().writeByte(0);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void chatParty(String text) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)-20)).writer().writeUTF(text);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void chatGlobal(String text) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)-21)).writer().writeUTF(text);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void chatPrivate(String to, String text) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)-22)).writer().writeUTF(to);
         var3.writer().writeUTF(text);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void chatClan(String text) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)-19)).writer().writeUTF(text);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void sendCardInfo(String var1, String var2) {
      Message var3 = null;

      try {
         (var3 = messageNotMap((byte)-99)).writer().writeUTF(var1);
         var3.writer().writeUTF(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void saveRms(String key, byte[] data, byte type) {
      Message var4 = null;

      try {
         (var4 = messageSubCommand((byte)-67)).writer().writeUTF(key);
         var4.writer().writeInt(data.length);
         var4.writer().write(data);
         var4.writer().writeByte(type);
         this.session.sendMessage(var4);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.close();
      }

   }

   public final void loadRMS(String key) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-65)).writer().writeUTF(key);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void changeName(String name, int id) {
      Message var3 = null;

      try {
         (var3 = messageNotMap((byte)-97)).writer().writeInt(id);
         var3.writer().writeUTF(name);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void requestIcon(int id) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-115)).writer().writeInt(id);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void requestClanInfo() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-113);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void requestClanMember() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-112);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void requestClanItem() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-111);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void requestClanLog() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-114);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void clanInvite(int charId) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-63)).writer().writeInt(charId);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void clanPlease(int var1) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-61)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void acceptInviteClan(int var1) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-62)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void acceptPleaseClan(int var1) {
      Message var2 = null;

      try {
         (var2 = messageSubCommand((byte)-60)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void changeClanAlert(String var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-95)).writer().writeUTF(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void changeClanType(String var1, int var2) {
      Message var3 = null;

      try {
         (var3 = messageNotMap((byte)-94)).writer().writeUTF(var1);
         var3.writer().writeByte(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void moveOutClan(String var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-93)).writer().writeUTF(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void outClan() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-92);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void inputCoinClan(int var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-90)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void outputCoinClan(int var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-89)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void clanUpLevel() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-91);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void doConvertUpgrade(int var1, int var2, int var3) {
      Message var4 = null;

      try {
         (var4 = messageNotMap((byte)-88)).writer().writeByte(var1);
         var4.writer().writeByte(var2);
         var4.writer().writeByte(var3);
         this.session.sendMessage(var4);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.close();
      }

   }

   public final void inviteClanDun(String var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-87)).writer().writeUTF(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void inviteClanBattlefield(String var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-70)).writer().writeUTF(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void acceptClanBattlefield() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-68);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void inviteClanBattlefieldAll() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-69);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void unlockClanItem() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-62);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void inputNumSplit(int var1, int var2) {
      Message var3 = null;

      try {
         (var3 = messageNotMap((byte)-85)).writer().writeByte(var1);
         var3.writer().writeInt(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void activeAccProtect(int var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-105)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void clearAccProtect(int var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-102)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void updateActive(int var1, int var2) {
      Message var3 = null;

      try {
         (var3 = messageNotMap((byte)-104)).writer().writeInt(var1);
         var3.writer().writeInt(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void requestItem2(int var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-103)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void rewardPB() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-82);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void rewardCT() {
      Message var1 = null;

      try {
         var1 = messageNotMap((byte)-79);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void sendToSaleItem(Item item, int value) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)102)).writer().writeByte(item.indexUI);
         var3.writer().writeInt(value);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void requestItemAuction(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)104)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void buyItemAuction(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)105)).writer().writeInt(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void selectCard() {
      Message var1 = null;

      try {
         (var1 = messageNotMap((byte)-72)).writer().writeByte(GameScr.indexSelect);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void sendClanItem(String var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)-61)).writer().writeByte(GameScr.indexSelect);
         var2.writer().writeUTF(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void useClanItem() {
      Message var1 = null;

      try {
         (var1 = messageNotMap((byte)-60)).writer().writeByte(GameScr.indexSelect);
         this.session.sendMessage(var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.close();
      }

   }

   public final void luyenthach(Item[] var1) {
      GameCanvas.msgdlg.pleasewait();
      Message var2 = null;

      try {
         var2 = new Message((byte)110);

         int var3;
         for(var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null && (var1[var3].template.id == 10 || var1[var3].template.id == 11)) {
               var2.writer().writeByte(var1[var3].indexUI);
               break;
            }
         }

         for(var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null && (var1[var3].template.id == 455 || var1[var3].template.id == 456)) {
               var2.writer().writeByte(var1[var3].indexUI);
            }
         }

         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void tinhluyen(Item var1, Item[] var2) {
      GameCanvas.msgdlg.pleasewait();
      Message var3 = null;

      try {
         (var3 = new Message((byte)111)).writer().writeByte(var1.indexUI);

         for(int var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4] != null && (var2[var4].template.id == 455 || var2[var4].template.id == 456 || var2[var4].template.id == 457)) {
               var3.writer().writeByte(var2[var4].indexUI);
            }
         }

         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void dichchuyen(Item var1, Item[] var2) {
      GameCanvas.msgdlg.pleasewait();
      Message var3 = null;

      try {
         (var3 = new Message((byte)112)).writer().writeByte(var1.indexUI);
         int var4 = 0;

         for(int var5 = 0; var5 < var2.length; ++var5) {
            if (var2[var5] != null && var2[var5].template.id == 454) {
               var3.writer().writeByte(var2[var5].indexUI);
               ++var4;
            }
         }

         if (var4 < 20) {
            GameCanvas.a(mResources.sc);
            return;
         }

         this.session.sendMessage(var3);
      } catch (Exception var9) {
         var9.printStackTrace();
         return;
      } finally {
         var3.close();
      }

   }

   public final void sendCatkeo(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)113)).writer().writeShort(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void ChucTet(String var1, String var2, byte var3) {
      Message var4 = null;
      var1 = var1 + " " + var2;

      try {
         (var4 = new Message((byte)-21)).writer().writeUTF(var1);
         var4.writer().writeByte(var3);
         this.session.sendMessage(var4);
      } catch (Exception var9) {
      } finally {
         var4.close();
      }

   }

   public final void SendCapcha(short var1, String var2) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)118)).writer().writeUTF(var2);
         var3.writer().writeShort(var1);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void sendAttackMobFast(short var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)119)).writer().writeByte(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void requestForgetPassByIMEI(byte var1, String var2) {
      Message var3 = null;

      try {
         (var3 = new Message((byte)121)).writer().writeByte(var1);
         var3.writer().writeUTF(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void requestChangePass(byte var1, short var2) {
      Message var3 = null;

      try {
         (var3 = messageNotMap((byte)122)).writer().writeByte(var1);
         var3.writer().writeByte(var2);
         this.session.sendMessage(var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }

   public final void luckyDraw(short type, String money, byte typeLucky) {
      Message var4 = null;

      try {
         (var4 = new Message((byte)92)).writer().writeShort(type);
         var4.writer().writeUTF(money);
         var4.writer().writeByte(typeLucky);
         this.session.sendMessage(var4);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         var4.close();
      }

   }

   public final void info_Kiemduyet(String var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      try {
         Message var8;
         (var8 = new Message((byte)123)).writer().writeUTF(var1);
         var8.writer().writeUTF(var2);
         var8.writer().writeUTF(var3);
         var8.writer().writeUTF(var4);
         var8.writer().writeUTF(var5);
         var8.writer().writeUTF(var6);
         var8.writer().writeUTF(var7);
         this.session.sendMessage(var8);
         var8.close();
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public final void a(byte var1) {
      Message var2 = null;

      try {
         (var2 = messageNotMap((byte)122)).writer().writeByte(4);
         var2.writer().writeByte(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void ngockham(byte var1, Item var2, Item var3, Item[] var4) {
      GameCanvas.msgdlg.pleasewait();
      Message var5 = null;

      try {
         (var5 = new Message((byte)124)).writer().writeByte(var1);
         if (var1 == 0) {
            var5.writer().writeByte(var2.indexUI);
            var5.writer().writeByte(var3.indexUI);

            for(var1 = 0; var1 < var4.length; ++var1) {
               if (var4[var1] != null) {
                  var5.writer().writeByte(var4[var1].indexUI);
               }
            }
         } else if (var1 == 1) {
            var5.writer().writeByte(var3.indexUI);

            for(var1 = 0; var1 < var4.length; ++var1) {
               if (var4[var1] != null) {
                  var5.writer().writeByte(var4[var1].indexUI);
               }
            }
         } else if (var1 == 2 || var1 == 3) {
            var5.writer().writeByte(var3.indexUI);
         }

         this.session.sendMessage(var5);
      } catch (Exception var10) {
         var10.printStackTrace();
      } finally {
         var5.close();
      }

   }

   public final void giaodo(Item[] var1) {
      GameCanvas.msgdlg.pleasewait();
      Message var2 = null;

      try {
         var2 = new Message((byte)126);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               var2.writer().writeByte(var1[var3].indexUI);
            }
         }

         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void c(short var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)125)).writer().writeByte(1);
         var2.writer().writeShort(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public final void aq(int var1) {
      Message var2 = null;

      try {
         (var2 = new Message((byte)125)).writer().writeByte(2);
         var2.writer().writeShort(var1);
         this.session.sendMessage(var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      } finally {
         var2.close();
      }

   }

   public static void aj() {
   }

   public static void ak() {
      instance = null;
   }

   static {
      Main.main(51);
      aj();
   }
}

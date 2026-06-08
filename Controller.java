import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class Controller implements IMessageHandler {
	private static Controller me;
	private Message messWait;
	private static String[] c;
	private static String d;
	private static String e;
	private static String f;
	private static String g;

	public static void init() {
		c = new String[] { "B\u1ea1n ch\u1ec9 c\u00f3 th\u1ec3 v\u00e0o l\u1ea1i game sau ", " gi\u00e2y n\u1eefa" };
		d = "B\u1ea1n ch\u01b0a th\u1ec3 \u0111i \u0111\u1ebfn khu v\u1ef1c n\u00e0y.H\u00e3y ho\u00e0n th\u00e0nh nhi\u1ec7m v\u1ee5 tr\u01b0\u1edbc.";
		e = "C\u1eeda n\u00e0y v\u1eabn ch\u01b0a \u0111\u01b0\u1ee3c m\u1edf.";
		f = "C\u1eeda n\u00e0y ch\u1ec9 ch\u1ee9a \u0111\u01b0\u1ee3c t\u1ed1i \u0111a 2 ng\u01b0\u1eddi.";
		g = "Thao t\u00e1c qu\u00e1 nhanh.";
	}

	public static Controller gI() {
		if (me == null) {
			me = new Controller();
		}

		return me;
	}

	public final void onConnectOK() {
		System.out.println("Connect ok");
	}

	public final void onConnectionFail() {
		if (Char.dy && NSOT_MOB.b != null) {
			Session_ME.getInstance().e();
		} else {
			GameCanvas.a(mResources.ej, 8884);
		}

	}

	public final void onDisconnected() {
		System.out.println("Disconnected");
		NSOT_MOB var1 = NSOT_MOB.mod_nst;
		NSOT_MOB.c();
		ToolCuoc.stopTool();
		if (Char.dy && NSOT_MOB.b != null) {
			Session_ME.getInstance().e();
		} else {
			GameCanvas.instance.t();
		}

	}

	private static void requestItemPlayer(Message var0) {
		try {
			int var1 = var0.reader().readUnsignedByte();
			Item var2;
			(var2 = GameScr.currentCharViewInfo.arrItemBody[var1]).expires = var0.reader().readLong();
			var2.saleCoinLock = var0.reader().readInt();
			var2.sys = var0.reader().readByte();
			var2.options = new MyVector();

			try {
				while (true) {
					var2.options.addElement(new ItemOption(var0.reader().readUnsignedByte(), var0.reader().readInt()));
				}
			} catch (Exception var4) {
			}
		} catch (Exception var5) {
			var5.printStackTrace();
		}

	}

	private static void viewItemAuction(Message var0) {
		try {
			Item var1 = null;
			int var2 = var0.reader().readInt();

			for (int var3 = 0; var3 < GameScr.arrItemStands.length; ++var3) {
				if (GameScr.arrItemStands[var3].item.c == var2) {
					var1 = GameScr.arrItemStands[var3].item;
					break;
				}
			}

			var1.typeUI = 37;
			var1.expires = -1L;
			var1.saleCoinLock = var0.reader().readInt();
			if (var1.isTypeBody() || var1.isTypeNgocKham()) {
				var1.options = new MyVector();

				try {
					var1.upgrade = var0.reader().readByte();
					var1.sys = var0.reader().readByte();

					while (true) {
						var1.options.addElement(new ItemOption(var0.reader().readUnsignedByte(), var0.reader().readInt()));
					}
				} catch (Exception var4) {
					return;
				}
			}
		} catch (Exception var5) {
			var5.printStackTrace();
		}

	}

	public final void onMessage(Message msg) {
		try {
			GameScr var22 = null;
			byte var2;
			int var3;
			int var4;
			Char var5;
			int var6;
			String var7;
			String var8;
			int var9;
			int var10;
			Char var11;
			String text;
			short var13;
			MyVector var14;
			Char var15;
			Item var16;
			Item var17;
			short var18;
			long var19;
			Mob var21;
			Npc var23;
			short var24;
			Char[] var25;
			byte var26;
			Mob var27;
			short var28;
			BuNhin var29;
			String var30;
			byte var31;
			ItemMap var32;
			String to;
			byte var34;
			Mob var35;
			Char var36;
			int var37;
			int var38;
			String var39;
			GameScr var40;
			ItemMap var41;
			boolean var42;
                       
			switch (msg.command) {
			case -30:
				messageSubCommand(msg);
				return;
			case -29:
				messageNotLogin(msg);
				return;
			case -28:
				this.messageNotMap(msg);
				return;
			case -27:
			case -17:
			case -9:
			case 12:
			case 24:
			case 28:
			case 29:
			case 32:
			case 35:
			case 41:
			case 44:
			case 56:
			case 73:
			case 74:
			case 80:
			case 81:
			case 105:
			case 110:
			case 111:
			case 113:
			case 115:
			case 120:
			default:
				return;
			case -26:
				GameCanvas.a(text = msg.reader().readUTF());
				boolean var43 = false;
				boolean var44 = false;
				if (!text.startsWith(c[0])) {
					if (text.equals(g)) {
						Class_cl.q();
						return;
					}

					if (!TileMap.ah || !text.equals(d) && !(var43 = text.equals(e)) && !(var44 = text.equals(f))) {
						return;
					}

					if (NSOT_MOB.b != null && TileMap.g(TileMap.mapID)) {
						if (var43) {
							if ((var6 = TileMap.i(NSOT_MOB.b.b)) > 0) {
								NSOT_MOB.b.b = var6;
							}

							NSOT_MOB.b.e = -1;
						} else if (var44) {
							if ((var6 = TileMap.h(NSOT_MOB.b.b)) > 0) {
								NSOT_MOB.b.b = var6;
							}

							NSOT_MOB.b.e = -1;
						}
					}

					if (TileMap.ag) {
						TileMap.ag = false;
					} else {
						GameCanvas.n();
					}

					TileMap.i();
					return;
				}

				var6 = 0;

				try {
					var6 = Integer.parseInt(text.substring(c[0].length(), text.indexOf(c[1])).trim()) + 2;
				} catch (Exception var130) {
					var130.printStackTrace();
				}

				Session_ME.getInstance().close();
				Session_ME.isCancel = false;
				Session_ME.f();
				GameCanvas.ax = var6;
				GameCanvas.az = GameCanvas.ay = System.currentTimeMillis();
				return;
			case -25:
				Info.canMergeString(text = msg.reader().readUTF(), 150, mFont.tahoma_7b_yellow);
				ChatManager.gI().addChat(mResources.ot[0], mResources.qx, text);
				return;
			case -24:
				if ((to = msg.reader().readUTF()).indexOf("\u0111ang \u0111\u1ee9ng nh\u00ecn b\u1ea1n") > 0) {
					NSOT_MOB.f(to.substring(0, to.indexOf("\u0111ang \u0111\u1ee9ng nh\u00ecn b\u1ea1n")).trim());
				}

				if (Char.dx && NSOT_MOB.b != null
						&& to.equals("Kh\u00f4ng \u0111\u1ee7 MP \u0111\u1ec3 s\u1eed d\u1ee5ng")) {
					Auto.m = true;
				}

				if (Class_cl.b && to.equals("V\u1eadt ph\u1ea9m c\u1ee7a ng\u01b0\u1eddi kh\u00e1c")) {
					Class_cl.e();
					Char.getMyChar().itemFocus.k = true;
				}

				if (NSOT_MOB.d != null && !NSOT_MOB.d.equals(Char.getMyChar().cName)
						&& to.equals("\u0110\u1ed1i ph\u01b0\u01a1ng \u0111ang \u1edf trong nh\u00f3m kh\u00e1c.")) {
					Service.gI().outParty();
				}
				if (to.equals("Hành trình khám phá hang động đã kết thúc, hãy đến Kanata đánh giá và nhận thưởng.")
						&& NSOT_MOB.b instanceof AutoHangDong && AutoHangDong.map() != 114) {
					AutoHangDong.xong_hd = true;
				}
				if ((MenuHangDong.autohd_lbhd && MenuHangDong.autohd) && (!AutoHangDong.dunglb)
						&& (to.equals("Số lần vào hang động còn 1 lần"))) {
					AutoHangDong.dunglb = true;
				}
				InfoMe.addInfo(to, 50, mFont.tahoma_7_yellow);
				return;
			case -23:
				var4 = msg.reader().readInt();
				text = msg.reader().readUTF();
				if (Char.getMyChar().charID == var4) {
					var15 = Char.getMyChar();
				} else {
					var15 = GameScr.e(var4);
				}

				if (var15 == null) {
					return;
				}

				ChatPopup.addChatPopupOutSide(text, 100, var15);
				ChatManager.gI().addChat(mResources.or[0], var15.cName, text);
				return;
			case -22:
				to = msg.reader().readUTF();
				text = msg.reader().readUTF();
				ChatManager.gI().addChat(to, to, text);
				if ((!GameScr.isPaintMessage || !ChatManager.gI().getCurrentChatTab().ownerName.equals(to)) && !ChatManager.d) {
					ChatManager.gI().addWaitList(to);
				}

				NSOT_MOB.mod_nst.getPrivateChat(to, text);
				return;
			case -21:
				text = msg.reader().readUTF();
				var30 = msg.reader().readUTF();
				ChatManager.gI().addChat(mResources.ot[0], text, var30);
				if (!ChatManager.c) {
					Info.canMergeString(text + ": " + var30, 80, mFont.tahoma_7b_yellow);
				}

				return;
			case -20:
				var8 = msg.reader().readUTF();
				var7 = msg.reader().readUTF();
				if (var7.equals("done_dhd") && AutoDailyPanel.isAutoDHDOn) {
					NSOT_MOB.autoDHDState = 4;
					Session_ME.getInstance().cleanNetwork();
					Controller.gI().onDisconnected();
					return;
				}
				ChatManager.gI().addChat(mResources.os[0], var8, var7);
				if (!GameScr.isPaintMessage || ChatManager.gI().getCurrentChatTab().type != 1) {
					ChatManager.f = true;
				}

				NSOT_MOB.mod_nst.b(var8, var7);
				return;
			case -19:
				var8 = msg.reader().readUTF();
				text = msg.reader().readUTF();
				ChatManager.gI().addChat(mResources.ou[0], var8, text);
				if (!GameScr.isPaintMessage || ChatManager.gI().getCurrentChatTab().type != 4) {
					ChatManager.e = true;
				}

				return;
			case -18:
				GameCanvas.isLoading = true;
				GameScr.resetAllvector();
				TileMap.vGo.removeAllElements();
				System.gc();
				TileMap.mapID = (short) msg.reader().readUnsignedByte();
				TileMap.tileID = msg.reader().readByte();
				TileMap.bgID = msg.reader().readByte();
				TileMap.typeMap = msg.reader().readByte();
				TileMap.mapName = msg.reader().readUTF();
				TileMap.zoneID = msg.reader().readByte();
				TileMap.l();

				try {
					TileMap.loadMapFromResource();
				} catch (Exception var133) {
					Service.gI().requestMaptemplate(TileMap.mapID);
					this.messWait = msg;
					return;
				}

				loadInfoMap(msg);
				if (Char.getMyChar().mobMe != null) {
					Char.getMyChar().mobMe.x = Char.getMyChar().cx;
					Char.getMyChar().mobMe.y = Char.getMyChar().cy - 40;
				}

				return;
			case -16:
				Char.ischangingMap = true;
				Char.flag = true;
				GameScr.gI().dy = 0;
				GameScr.gI().dx = 0;
				Char.getMyChar().mobFocus = null;
				Char.getMyChar().npcFocus = null;
				Char.getMyChar().charFocus = null;
				Char.getMyChar().itemFocus = null;
				Char.getMyChar().focus.removeAllElements();
				Char.getMyChar().testCharId = -9999;
				Char.getMyChar().killCharId = -9999;
				GameScr.resetAllvector();
				GameCanvas.i();
				if (GameScr.vParty.size() <= 1) {
					GameScr.vParty.removeAllElements();
				}

				GameScr.gI().resetButton();
				GameScr.gI().center = null;
				return;
			case -15:
				var13 = msg.reader().readShort();

				for (var6 = 0; var6 < GameScr.vItemMap.size(); ++var6) {
					if (((ItemMap) GameScr.vItemMap.elementAt(var6)).g == var13) {
						GameScr.vItemMap.removeElementAt(var6);
						return;
					}
				}

				return;
			case -14:
				Char.getMyChar().itemFocus = null;
				var13 = msg.reader().readShort();

				for (var6 = 0; var6 < GameScr.vItemMap.size(); ++var6) {
					if ((var32 = (ItemMap) GameScr.vItemMap.elementAt(var6)).g == var13) {
						var32.a(Char.getMyChar().cx, Char.getMyChar().cy - 10);
						var32.k = true;
						if (var32.template.type != 19) {
							if (var32.template.type == 25 && var32.template.id != 238) {
								InfoMe.addInfo(mResources.ku + " " + var32.template.name, 15, mFont.tahoma_7_yellow);
								return;
							}

							return;
						}

						var6 = msg.reader().readUnsignedShort();
						var11 = Char.getMyChar();
						var11.yen += var6;
						if (var32.template.id == 238) {
							return;
						}

						InfoMe.addInfo(mResources.ku + " " + var6 + " " + mResources.kj);
						return;
					}
				}

				Class_cl.e();
				return;
			case -13:
				var13 = msg.reader().readShort();

				for (var6 = 0; var6 < GameScr.vItemMap.size(); ++var6) {
					if ((var32 = (ItemMap) GameScr.vItemMap.elementAt(var6)).g == var13) {
						if ((var15 = GameScr.e(msg.reader().readInt())) == null) {
							return;
						}

						var32.a(var15.cx, var15.cy - 10);
						if (var32.x < var15.cx) {
							var15.cdir = -1;
						} else if (var32.x > var15.cx) {
							var15.cdir = 1;
						}

						if (var32 != Char.getMyChar().itemFocus) {
							return;
						}

						var32.k = true;
						Class_cl.e();
						return;
					}
				}

				return;
			case -12:
				var26 = msg.reader().readByte();
				GameScr.vItemMap.addElement(new ItemMap(msg.reader().readShort(), Char.getMyChar().arrItemBag[var26].template.id, Char.getMyChar().cx,
						Char.getMyChar().cy, msg.reader().readShort(), msg.reader().readShort()));
				Char.getMyChar().arrItemBag[var26] = null;
				return;
			case -11:
				Char.getMyChar().cPk = msg.reader().readByte();
				Char.getMyChar().waitToDie(msg.reader().readShort(), msg.reader().readShort());

				try {
					Char.getMyChar().cEXP = msg.reader().readLong();
					GameScr.getLevelExp(Char.getMyChar().cEXP);
				} catch (Exception var129) {
				}

				Char.getMyChar().countKill = 0;
				return;
			case -10:
				if (Char.getMyChar().wdx != 0 || Char.getMyChar().wdy != 0) {
					Char.getMyChar().cx = Char.getMyChar().wdx;
					Char.getMyChar().cy = Char.getMyChar().wdy;
					Char.getMyChar().wdx = Char.getMyChar().wdy = 0;
				}

				Char.getMyChar().liveFromDead();
				Char.ischangingMap = false;
				return;
			case -8:
				var6 = msg.reader().readInt();
				var11 = Char.getMyChar();
				var11.yen += var6;
				GameScr.gI().ec = var6;
				GameScr.a(var6 > 0 ? "+" + var6 : String.valueOf(var6), Char.getMyChar().cx,
						Char.getMyChar().cy - Char.getMyChar().ch - 10, 1);
				return;
			case -7:
				var6 = msg.reader().readInt();
				var11 = Char.getMyChar();
				var11.xu += var6;
				var11 = Char.getMyChar();
				var11.yen -= var6;
				GameScr.a("+" + var6, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch - 10, 1);
				return;
			case -6:
				if ((var15 = GameScr.e(msg.reader().readInt())) == null) {
					return;
				}

				GameScr.vItemMap.addElement(new ItemMap(msg.reader().readShort(), msg.reader().readShort(), var15.cx, var15.cy,
						msg.reader().readShort(), msg.reader().readShort()));
				return;
			case -5:
				try {
					(var27 = Mob.a(msg.reader().readUnsignedByte())).sys = msg.reader().readByte();
					var27.levelBoss = (short) msg.reader().readByte();
					var27.x = var27.xFirst;
					var27.y = var27.yFirst;
					var27.status = 5;
					var27.ac = false;
					var27.hp = msg.reader().readInt();
					var27.maxHp = var27.hp;
					if (var27.d().mobTemplateId == 202) {
						ServerEffect.addServerEffect(148, var27.x, var27.y, 0);
					} else {
						ServerEffect.addServerEffect(60, var27.x, var27.y, 1);
					}

					Auto.a(var27);
				} catch (Exception var128) {
					var128.printStackTrace();
				}

				return;
			case -4:
				var27 = null;

				try {
					var27 = Mob.a(msg.reader().readUnsignedByte());
				} catch (Exception var127) {
				}

				if (var27 != null && var27.status != 0 && var27.status != 0) {
					try {
						if ((var4 = msg.reader().readInt()) < 0) {
							var4 = Res.abs(var4) + 32767;
						}

						if (msg.reader().readBoolean()) {
							GameScr.a("-" + var4, var27.x, var27.y - var27.exp, 3);
						} else {
							GameScr.a("-" + var4, var27.x, var27.y - var27.exp, 5);
						}

						var41 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), var27.x, var27.y,
								msg.reader().readShort(), msg.reader().readShort());
						GameScr.vItemMap.addElement(var41);
						if (Res.abs(var41.y - Char.getMyChar().cy) < 24 && Res.abs(var41.x - Char.getMyChar().cx) < 24) {
							Char.getMyChar().charFocus = null;
						}
					} catch (Exception var126) {
					}

					var27.g();
				}

				return;
			case -3:
				var27 = null;

				try {
					var27 = Mob.a(msg.reader().readUnsignedByte());
				} catch (Exception var125) {
					System.out.println("----err null:NPC_ATTACK_ME");
				}

				if (var27 == null) {
					return;
				}

				var4 = msg.reader().readInt();

				try {
					var3 = msg.reader().readInt();
				} catch (Exception var124) {
					var3 = 0;
				}

				if (var27.aa) {
					Char.getMyChar().doInjure(var4, var3, false, -1);
					var27.h();
				} else {
					var27.s = var4;
					var27.t = var3;
					var27.a(Char.getMyChar());
				}

				var24 = msg.reader().readShort();
				var2 = msg.reader().readByte();
				var34 = msg.reader().readByte();
				var27.a(var24, var2, var34);
				return;
			case -2:
				var27 = null;

				try {
					var27 = Mob.a(msg.reader().readUnsignedByte());
				} catch (Exception var123) {
				}

				if (var27 == null) {
					return;
				}

				if ((var15 = GameScr.e(msg.reader().readInt())) != null) {
					var3 = msg.reader().readInt();
					var27.s = var15.cHp - var3;
					var15.cHpNew = var3;

					try {
						var15.cMP = msg.reader().readInt();
					} catch (Exception var122) {
					}

					if (var27.aa) {
						var15.doInjure(var27.s, 0, false, -1);
						var27.h();
					} else {
						var27.a(var15);
					}

					var24 = msg.reader().readShort();
					var2 = msg.reader().readByte();
					var34 = msg.reader().readByte();
					var27.a(var24, var2, var34);
					return;
				}

				return;
			case -1:
				var27 = null;

				try {
					var27 = Mob.a(msg.reader().readUnsignedByte());
				} catch (Exception var121) {
				}

				if (var27 == null) {
					return;
				}

				var27.hp = msg.reader().readInt();
				if ((var4 = msg.reader().readInt()) < 0) {
					var4 = Res.abs(var4) + 32767;
				}

				boolean var45 = msg.reader().readBoolean();

				try {
					var27.levelBoss = (short) msg.reader().readByte();
					var27.maxHp = msg.reader().readInt();
					Auto.a(var27);
				} catch (Exception var120) {
				}

				if (var45) {
					GameScr.a("-" + var4, var27.x, var27.y - var27.exp, 3);
				} else {
					GameScr.a("-" + var4, var27.x, var27.y - var27.exp, 5);
				}

				return;
			case 0:
				if ((var15 = GameScr.e(msg.reader().readInt())) == null) {
					return;
				}

				var15.cPk = msg.reader().readByte();
				if (var15.charID == Char.er) {
					Char.ej = true;
				}

				var15.waitToDie(msg.reader().readShort(), msg.reader().readShort());
				if (Char.getMyChar().charFocus == var15) {
					Char.getMyChar().charFocus = null;
				}

				return;
			case 1:
				var3 = msg.reader().readInt();

				for (var4 = 0; var4 < GameScr.vCharInMap.size(); ++var4) {
					var5 = null;

					try {
						var5 = (Char) GameScr.vCharInMap.elementAt(var4);
					} catch (Exception var119) {
						System.out.println("Char null");
					}

					if (var5 == null) {
						return;
					}

					if (var5.charID == var3) {
						var5.ez = msg.reader().readShort();
						var5.fa = msg.reader().readShort();
						var5.a(var5.ez, var5.fa);
						var5.cEXP = System.currentTimeMillis();
						return;
					}
				}

				return;
			case 2:
				var3 = msg.reader().readInt();

				for (var4 = 0; var4 < GameScr.vCharInMap.size(); ++var4) {
					if ((var5 = (Char) GameScr.vCharInMap.elementAt(var4)) != null && var5.charID == var3) {
						if (!var5.isInvisible && var5.isHuman && !var5.isNhanban) {
							ServerEffect.addServerEffect(60, var5.cx, var5.cy, 1);
						} else if (!var5.isInvisible && var5.isNhanbanz() && !var5.isHuman) {
							ServerEffect.addServerEffect(141, var5.cx, var5.cy, 0);
						}

						GameScr.vCharInMap.removeElementAt(var4);
						if (!var5.isHumanz() && var5.cName.equals(Char.getMyChar().cName)) {
							Char.getMyChar().a = null;
						}

						Party.refresh(var3);
						return;
					}
				}

				return;
			case 3:
				(var15 = new Char()).charID = msg.reader().readInt();
				if (!readCharInfo(var15, msg)) {
					return;
				}

				GameScr.vCharInMap.addElement(var15);
				Auto.a(var15);
				if (!var15.isHumanz() && var15.cName.equals(Char.getMyChar().cName)) {
					Char.getMyChar().a = var15;
					Class_cl.z();
				}

				if (var15.charID == -Char.getMyChar().charID) {
					Char.getMyChar().b = var15;
				}

				if (!NSOT_MOB.a(var15.cName)) {
					return;
				}

				Service.gI().addParty(var15.cName);
				return;
			case 4:
				if ((var15 = GameScr.e(msg.reader().readInt())) == null) {
					return;
				}

				if ((TileMap.a(var15.cx, var15.cy) & 2) == 2) {
					var15.a((SkillPaint) GameScr.s[msg.reader().readByte()], 0);
				} else {
					var15.a((SkillPaint) GameScr.s[msg.reader().readByte()], 1);
				}

				if (var15.isJump) {
					var15.isJump = false;
					var15.timeSummon = System.currentTimeMillis();
					ServerEffect.addServerEffect(60, var15, 1);
				}

				if (var15.fallAttack) {
					var15.fallAttack = false;
					var15.autoFall = true;
				}

				var2 = msg.reader().readByte();
				var15.attMobs = new Mob[var2];

				for (var3 = 0; var3 < var15.attMobs.length; ++var3) {
					Mob var145 = Mob.a(msg.reader().readUnsignedByte());
					var15.attMobs[var3] = var145;
					if (var3 == 0) {
						if (var15.cx <= var145.x) {
							var15.cdir = 1;
						} else {
							var15.cdir = -1;
						}
					}
				}

				var15.mobFocus = var15.attMobs[0];
				var25 = new Char[10];
				var6 = 0;

				try {
					for (var6 = 0; var6 < 10; ++var6) {
						Char var146;
						if ((var9 = msg.reader().readInt()) == Char.getMyChar().charID) {
							var146 = Char.getMyChar();
						} else {
							var146 = GameScr.e(var9);
						}

						var25[var6] = var146;
						if (var6 == 0) {
							if (var15.cx <= var146.cx) {
								var15.cdir = 1;
							} else {
								var15.cdir = -1;
							}
						}
					}
				} catch (Exception var134) {
				}

				if (var6 <= 0) {
					return;
				}

				var15.attChars = new Char[var6];

				for (var6 = 0; var6 < var15.attChars.length; ++var6) {
					var15.attChars[var6] = var25[var6];
				}

				var15.charFocus = var15.attChars[0];
				return;
			case 5:
				var19 = msg.reader().readLong();
				Char.getMyChar().cExpDown = 0L;
				var11 = Char.getMyChar();
				var11.cEXP += var19;
				var9 = Char.getMyChar().clevel;
				GameScr.getLevelExp(Char.getMyChar().cEXP);
				if (var9 != Char.getMyChar().clevel) {
					ServerEffect.addServerEffect(58, Char.getMyChar(), 1);
				}

				GameScr.a("+" + var19, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch, 2);
				if (var19 >= 1000000L) {
					InfoMe.addInfo(mResources.ku + " " + var19 + " " + mResources.hj, 20, mFont.tahoma_7_yellow);
				}

				return;
			case 6:
				var41 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), msg.reader().readShort(),
						msg.reader().readShort());
				byte[] var46;
				if ((var46 = NinjaUtil.readByteArray_Int(msg)) != null && var46.length > 0) {
					var41.imgCaptcha = new MyImage();
					var41.imgCaptcha.img = a(var46);
				}

				GameScr.vItemMap.addElement(var41);
				return;
			case 7:
				Char.getMyChar().arrItemBag[msg.reader().readByte()].quantity = msg.reader().readShort();
				return;
			case 8:
				var26 = msg.reader().readByte();
				Char.getMyChar().arrItemBag[var26] = new Item();
				Char.getMyChar().arrItemBag[var26].typeUI = 3;
				Char.getMyChar().arrItemBag[var26].indexUI = var26;
				Char.getMyChar().arrItemBag[var26].template = ItemTemplates.get(msg.reader().readShort());
				Char.getMyChar().arrItemBag[var26].isLock = msg.reader().readBoolean();
				if (Char.getMyChar().arrItemBag[var26].isTypeBody() || Char.getMyChar().arrItemBag[var26].isTypeNgocKham()) {
					Char.getMyChar().arrItemBag[var26].upgrade = msg.reader().readByte();
				}

				Char.getMyChar().arrItemBag[var26].isExpires = msg.reader().readBoolean();

				try {
					Char.getMyChar().arrItemBag[var26].quantity = msg.reader().readUnsignedShort();
				} catch (Exception var118) {
					Char.getMyChar().arrItemBag[var26].quantity = 1;
				}

				if (Char.getMyChar().arrItemBag[var26].template.type == 16) {
					GameScr.r += Char.getMyChar().arrItemBag[var26].quantity;
				}

				if (Char.getMyChar().arrItemBag[var26].template.type == 17) {
					GameScr.q += Char.getMyChar().arrItemBag[var26].quantity;
				}

				if (Char.getMyChar().arrItemBag[var26].template.id == 340) {
					var40 = GameScr.gI();
					var40.bx += Char.getMyChar().arrItemBag[var26].quantity;
				}

				if (GameScr.isPaintLuyenNgoc) {
					if (GameScr.gI().dw.equals("")) {
						(var22 = GameScr.gI()).dw = var22.dw + Char.getMyChar().arrItemBag[var26].template.name;
					} else {
						(var22 = GameScr.gI()).dw = var22.dw + ", " + Char.getMyChar().arrItemBag[var26].template.name;
					}
				} else if (Char.getMyChar().arrItemBag[var26].template.type != 20) {
					InfoMe.addInfo(mResources.ku + " " + Char.getMyChar().arrItemBag[var26].template.name);
					Class_cl.s();
				}

				if (Char.getMyChar().arrItemBag[var26].isTypeBody() || Char.getMyChar().arrItemBag[var26].isTypeNgocKham()) {
					Service.gI().requestItemInfo(Char.getMyChar().arrItemBag[var26].typeUI, Char.getMyChar().arrItemBag[var26].indexUI);
				}

				return;
			case 9:
				var16 = Char.getMyChar().arrItemBag[msg.reader().readUnsignedByte()];

				try {
					var13 = msg.reader().readShort();
				} catch (Exception var117) {
					var13 = 1;
				}

				var16.quantity += var13;
				if (var16.template.type == 16) {
					GameScr.r += var13;
				}

				if (var16.template.type == 17) {
					GameScr.q += var13;
				}

				if (var16.template.id == 340) {
					var40 = GameScr.gI();
					var40.bx += var13;
				}

				GameCanvas.n();
				if (GameScr.isPaintLuyenNgoc) {
					if (GameScr.gI().dw.equals("")) {
						(var22 = GameScr.gI()).dw = var22.dw + var16.template.name;
					} else {
						(var22 = GameScr.gI()).dw = var22.dw + ", " + var16.template.name;
					}

					return;
				}

				if (var16.template.type == 20) {
					return;
				}

				InfoMe.addInfo(mResources.ku + " " + var16.template.name);
				return;
			case 10:
				var26 = msg.reader().readByte();
				if (Char.getMyChar().arrItemBag[var26].template.type == 16) {
					GameScr.r -= Char.getMyChar().arrItemBag[var26].quantity;
				}

				if (Char.getMyChar().arrItemBag[var26].template.type == 17) {
					GameScr.q -= Char.getMyChar().arrItemBag[var26].quantity;
				}

				Char.getMyChar().arrItemBag[var26] = null;
				GameScr.gI();
				if (GameScr.isPaintUI()) {
					GameScr.gI().left = GameScr.gI().center = null;
				} else {
					GameScr.gI().resetButton();
				}

				return;
			case 11:
				var26 = msg.reader().readByte();
				if (Char.getMyChar().arrItemBag[var26].template.type == 24) {
					InfoDlg.hide();
				}

				Char.getMyChar().a(var26);
				Char.getMyChar().a(msg);
				Char.getMyChar().eff5BuffHp = msg.reader().readShort();
				Char.getMyChar().eff5BuffMp = msg.reader().readShort();
				GameScr.gI().aj();
				Class_cl.q();
				return;
			case 13:
				Char.getMyChar().xu = msg.reader().readInt();
				Char.getMyChar().yen = msg.reader().readInt();
				Char.getMyChar().luong = msg.reader().readInt();
				Class_cl.i();
				GameCanvas.n();
				return;
			case 14:
				var16 = Char.getMyChar().arrItemBag[msg.reader().readByte()];
				Char.getMyChar().yen = msg.reader().readInt();

				try {
					var13 = msg.reader().readShort();
				} catch (Exception var116) {
					var13 = 1;
				}

				var16.quantity -= var13;
				if (var16.template.type == 16) {
					GameScr.r -= var13;
				}

				if (var16.template.type == 17) {
					GameScr.q -= var13;
				}

				if (var16.quantity <= 0) {
					Char.getMyChar().arrItemBag[var16.indexUI] = null;
				}

				if (GameScr.isPaintUI()) {
					GameScr.gI().left = GameScr.gI().center = null;
					GameScr.gI().updateCommandForUI();
				}

				GameCanvas.n();
				Class_cl.s();
				return;
			case 15:
				Char.getMyChar().itemBodyToBag(msg);
				Class_cl.q();
				return;
			case 16:
				Char.getMyChar().itemBoxToBag(msg);
				return;
			case 17:
				Char.getMyChar().itemBagToBox(msg);
				return;
			case 18:
				var26 = msg.reader().readByte();
				var13 = 1;

				try {
					var13 = msg.reader().readShort();
				} catch (Exception var115) {
				}

				if (Char.getMyChar().arrItemBag[var26].template.type == 24) {
					InfoDlg.hide();
				}

				if (Char.getMyChar().arrItemBag[var26].template.type == 16) {
					--GameScr.r;
				}

				if (Char.getMyChar().arrItemBag[var26].template.type == 17) {
					--GameScr.q;
				}

				if (Char.getMyChar().arrItemBag[var26].quantity > var13) {
					var17 = Char.getMyChar().arrItemBag[var26];
					var17.quantity -= var13;
				} else {
					Char.getMyChar().arrItemBag[var26] = null;
				}

				if (GameScr.isPaintInfoMe) {
					GameScr.gI().aj();
				}

				return;
			case 19:
				Char.getMyChar();
				Char.crystalCollect(msg, true);
				return;
			case 20:
				Char.getMyChar();
				Char.crystalCollect(msg, false);
				return;
			case 21:
				var2 = msg.reader().readByte();
				Char.getMyChar().luong = msg.reader().readInt();
				Char.getMyChar().xu = msg.reader().readInt();
				Char.getMyChar().yen = msg.reader().readInt();
				if (GameScr.itemUpGrade != null) {
					GameScr.itemUpGrade.upgrade = msg.reader().readByte();
					GameScr.itemUpGrade.isLock = true;
					GameScr.itemUpGrade.clearExpire();
					if (var2 == 1) {
						GameScr.ey = GameScr.v[53];
						GameScr.ex = 0;
					}
				}

				if (GameScr.arrItemUpGrade != null) {
					for (var10 = 0; var10 < GameScr.arrItemUpGrade.length; ++var10) {
						GameScr.arrItemUpGrade[var10] = null;
					}
				}

				if (var2 == 5 || var2 == 6) {
					if (GameScr.itemSplit != null && var2 == 5) {
						GameScr.itemSplit = null;
					}

					if (GameScr.arrItemSplit != null) {
						for (var10 = 0; var10 < GameScr.arrItemSplit.length; ++var10) {
							GameScr.arrItemSplit[var10] = null;
						}
					}
				}

				GameScr.gI().left = GameScr.gI().center = null;
				GameScr.gI().ab();
				GameCanvas.n();
				if (var2 == 5) {
					InfoMe.addInfo(mResources.lc[0], 20, mFont.tahoma_7_white);
					return;
				}

				if (var2 == 6) {
					InfoMe.addInfo(mResources.lc[1], 20, mFont.tahoma_7_red);
					return;
				}

				if (var2 == 1) {
					InfoMe.addInfo(mResources.lb[0] + GameScr.itemUpGrade.upgrade, 20, mFont.tahoma_7_white);
				} else {
					InfoMe.addInfo(mResources.lb[1] + GameScr.itemUpGrade.upgrade, 20, mFont.tahoma_7_red);
				}

				return;
			case 22:
				var2 = msg.reader().readByte();
				var8 = mResources.bq;

				for (var6 = 0; var6 < GameScr.arrItemSplit.length; ++var6) {
					GameScr.arrItemSplit[var6] = null;
				}

				for (var6 = 0; var6 < var2; ++var6) {
					(var17 = new Item()).typeUI = 3;
					var17.indexUI = msg.reader().readByte();
					var17.template = ItemTemplates.get(msg.reader().readShort());
					var17.expires = -1L;
					var17.quantity = 1;
					var17.isLock = GameScr.itemSplit.isLock;
					Char.getMyChar().arrItemBag[var17.indexUI] = var17;
					var8 = var8 + var17.template.name;
					if (var6 < var2 - 1) {
						var8 = var8 + ", ";
					}
				}

				GameScr.itemSplit.upgrade = 0;
				GameScr.itemSplit.clearExpire();
				GameScr.gI().left = GameScr.gI().center = null;
				GameScr.gI().updateCommandForUI();
				GameCanvas.n();
				InfoMe.addInfo(var8);
				GameScr.ey = GameScr.v[66];
				GameScr.ex = 0;
				Class_cl.q();
				return;
			case 23:
				if (NSOT_MOB.b(text = msg.reader().readUTF())) {
					Service.gI().acceptPleaseParty(text);
				} else {
					GameCanvas.a(text + " " + mResources.mi, 8889, text, 8882, (Object) null);
				}

				return;
			case 25:
				byte var47 = msg.reader().readByte();

				for (var3 = 0; var3 < var47; ++var3) {
					var6 = msg.reader().readInt();
					var28 = msg.reader().readShort();
					var18 = msg.reader().readShort();
					int var150 = msg.reader().readInt();
					Char var152;
					if ((var152 = GameScr.e(var6)) != null) {
						var152.cx = var28;
						var152.cy = var18;
						var152.cHp = var150;
						var152.cEXP = System.currentTimeMillis();
					}
				}

				return;
			case 26:
				Char.getMyChar().countKill = msg.reader().readUnsignedShort();
				Char.getMyChar().countKillMax = msg.reader().readUnsignedShort();
				return;
			case 27:
				var21 = Mob.a(msg.reader().readUnsignedByte());
				if ((var9 = msg.reader().readInt()) == Char.getMyChar().charID) {
					var15 = Char.getMyChar();
				} else {
					var15 = GameScr.e(var9);
				}

				var15.moveFast = new short[3];
				var15.moveFast[0] = 0;
				var15.moveFast[1] = (short) var21.x;
				var15.moveFast[2] = (short) var21.y;
				var15.isLockAttack = false;
				return;
			case 30:
				var26 = msg.reader().readByte();
				GameScr.gI().d((int) var26);
				Class_cl.q();
				return;
			case 31:
				Char.getMyChar().xuInBox = msg.reader().readInt();
				Char.getMyChar().arrItemBox = new Item[msg.reader().readUnsignedByte()];

				for (var6 = 0; var6 < Char.getMyChar().arrItemBox.length; ++var6) {
					if ((var28 = msg.reader().readShort()) != -1) {
						Char.getMyChar().arrItemBox[var6] = new Item();
						Char.getMyChar().arrItemBox[var6].typeUI = 4;
						Char.getMyChar().arrItemBox[var6].indexUI = var6;
						Char.getMyChar().arrItemBox[var6].template = ItemTemplates.get(var28);
						Char.getMyChar().arrItemBox[var6].isLock = msg.reader().readBoolean();
						if (Char.getMyChar().arrItemBox[var6].isTypeBody() || Char.getMyChar().arrItemBox[var6].isTypeNgocKham()) {
							Char.getMyChar().arrItemBox[var6].upgrade = msg.reader().readByte();
						}

						Char.getMyChar().arrItemBox[var6].isExpires = msg.reader().readBoolean();
						Char.getMyChar().arrItemBox[var6].quantity = msg.reader().readShort();
					}
				}

				Class_cl.s();
				return;
			case 33:
				if ((var28 = (short) msg.reader().readByte()) == 14) {
					GameScr.arrItemStore = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemStore.length; ++var9) {
						GameScr.arrItemStore[var9] = new Item();
						GameScr.arrItemStore[var9].typeUI = 14;
						GameScr.arrItemStore[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemStore[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 15) {
					GameScr.arrItemBook = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemBook.length; ++var9) {
						GameScr.arrItemBook[var9] = new Item();
						GameScr.arrItemBook[var9].typeUI = 15;
						GameScr.arrItemBook[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemBook[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 32) {
					GameScr.arrItemFashion = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemFashion.length; ++var9) {
						GameScr.arrItemFashion[var9] = new Item();
						GameScr.arrItemFashion[var9].typeUI = 32;
						GameScr.arrItemFashion[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemFashion[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 34) {
					GameScr.arrItemClanShop = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemClanShop.length; ++var9) {
						GameScr.arrItemClanShop[var9] = new Item();
						GameScr.arrItemClanShop[var9].typeUI = 34;
						GameScr.arrItemClanShop[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemClanShop[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 35) {
					GameScr.arrItemElites = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemElites.length; ++var9) {
						GameScr.arrItemElites[var9] = new Item();
						GameScr.arrItemElites[var9].typeUI = 35;
						GameScr.arrItemElites[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemElites[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 20) {
					GameScr.arrItemNonNam = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemNonNam.length; ++var9) {
						GameScr.arrItemNonNam[var9] = new Item();
						GameScr.arrItemNonNam[var9].typeUI = var28;
						GameScr.arrItemNonNam[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemNonNam[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 21) {
					GameScr.arrItemNonNu = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemNonNu.length; ++var9) {
						GameScr.arrItemNonNu[var9] = new Item();
						GameScr.arrItemNonNu[var9].typeUI = var28;
						GameScr.arrItemNonNu[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemNonNu[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 22) {
					GameScr.arrItemAoNam = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemAoNam.length; ++var9) {
						GameScr.arrItemAoNam[var9] = new Item();
						GameScr.arrItemAoNam[var9].typeUI = var28;
						GameScr.arrItemAoNam[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemAoNam[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 23) {
					GameScr.arrItemAoNu = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemAoNu.length; ++var9) {
						GameScr.arrItemAoNu[var9] = new Item();
						GameScr.arrItemAoNu[var9].typeUI = var28;
						GameScr.arrItemAoNu[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemAoNu[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 24) {
					GameScr.arrItemGangTayNam = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemGangTayNam.length; ++var9) {
						GameScr.arrItemGangTayNam[var9] = new Item();
						GameScr.arrItemGangTayNam[var9].typeUI = var28;
						GameScr.arrItemGangTayNam[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemGangTayNam[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 25) {
					GameScr.arrItemGangTayNu = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemGangTayNu.length; ++var9) {
						GameScr.arrItemGangTayNu[var9] = new Item();
						GameScr.arrItemGangTayNu[var9].typeUI = var28;
						GameScr.arrItemGangTayNu[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemGangTayNu[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 26) {
					GameScr.arrItemQuanNam = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemQuanNam.length; ++var9) {
						GameScr.arrItemQuanNam[var9] = new Item();
						GameScr.arrItemQuanNam[var9].typeUI = var28;
						GameScr.arrItemQuanNam[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemQuanNam[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 27) {
					GameScr.arrItemQuanNu = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemQuanNu.length; ++var9) {
						GameScr.arrItemQuanNu[var9] = new Item();
						GameScr.arrItemQuanNu[var9].typeUI = var28;
						GameScr.arrItemQuanNu[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemQuanNu[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 28) {
					GameScr.arrItemGiayNam = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemGiayNam.length; ++var9) {
						GameScr.arrItemGiayNam[var9] = new Item();
						GameScr.arrItemGiayNam[var9].typeUI = var28;
						GameScr.arrItemGiayNam[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemGiayNam[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 29) {
					GameScr.arrItemGiayNu = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemGiayNu.length; ++var9) {
						GameScr.arrItemGiayNu[var9] = new Item();
						GameScr.arrItemGiayNu[var9].typeUI = var28;
						GameScr.arrItemGiayNu[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemGiayNu[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 16) {
					GameScr.arrItemLien = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemLien.length; ++var9) {
						GameScr.arrItemLien[var9] = new Item();
						GameScr.arrItemLien[var9].typeUI = var28;
						GameScr.arrItemLien[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemLien[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 17) {
					GameScr.arrItemNhan = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemNhan.length; ++var9) {
						GameScr.arrItemNhan[var9] = new Item();
						GameScr.arrItemNhan[var9].typeUI = var28;
						GameScr.arrItemNhan[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemNhan[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 18) {
					GameScr.arrItemNgocBoi = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemNgocBoi.length; ++var9) {
						GameScr.arrItemNgocBoi[var9] = new Item();
						GameScr.arrItemNgocBoi[var9].typeUI = var28;
						GameScr.arrItemNgocBoi[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemNgocBoi[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 19) {
					GameScr.arrItemPhu = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemPhu.length; ++var9) {
						GameScr.arrItemPhu[var9] = new Item();
						GameScr.arrItemPhu[var9].typeUI = var28;
						GameScr.arrItemPhu[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemPhu[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 == 2) {
					GameScr.arrItemWeapon = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemWeapon.length; ++var9) {
						GameScr.arrItemWeapon[var9] = new Item();
						GameScr.arrItemWeapon[var9].typeUI = var28;
						GameScr.arrItemWeapon[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemWeapon[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				if (var28 != 6) {
					if (var28 == 7) {
						GameScr.arrItemStackLock = new Item[msg.reader().readByte()];

						for (var9 = 0; var9 < GameScr.arrItemStackLock.length; ++var9) {
							GameScr.arrItemStackLock[var9] = new Item();
							GameScr.arrItemStackLock[var9].typeUI = var28;
							GameScr.arrItemStackLock[var9].isLock = true;
							GameScr.arrItemStackLock[var9].indexUI = msg.reader().readUnsignedByte();
							GameScr.arrItemStackLock[var9].template = ItemTemplates.get(msg.reader().readShort());
						}

						return;
					}

					if (var28 == 8) {
						GameScr.arrItemGrocery = new Item[msg.reader().readByte()];

						for (var9 = 0; var9 < GameScr.arrItemGrocery.length; ++var9) {
							GameScr.arrItemGrocery[var9] = new Item();
							GameScr.arrItemGrocery[var9].typeUI = var28;
							GameScr.arrItemGrocery[var9].indexUI = msg.reader().readUnsignedByte();
							GameScr.arrItemGrocery[var9].template = ItemTemplates.get(msg.reader().readShort());
						}

						return;
					}

					if (var28 != 9) {
						return;
					}

					GameScr.arrItemGroceryLock = new Item[msg.reader().readByte()];

					for (var9 = 0; var9 < GameScr.arrItemGroceryLock.length; ++var9) {
						GameScr.arrItemGroceryLock[var9] = new Item();
						GameScr.arrItemGroceryLock[var9].typeUI = var28;
						GameScr.arrItemGroceryLock[var9].isLock = true;
						GameScr.arrItemGroceryLock[var9].indexUI = msg.reader().readUnsignedByte();
						GameScr.arrItemGroceryLock[var9].template = ItemTemplates.get(msg.reader().readShort());
					}

					return;
				}

				GameScr.arrItemStack = new Item[msg.reader().readByte()];

				for (var9 = 0; var9 < GameScr.arrItemStack.length; ++var9) {
					GameScr.arrItemStack[var9] = new Item();
					GameScr.arrItemStack[var9].typeUI = var28;
					GameScr.arrItemStack[var9].indexUI = msg.reader().readUnsignedByte();
					GameScr.arrItemStack[var9].template = ItemTemplates.get(msg.reader().readShort());
				}

				return;
			case 34:
				var14 = new MyVector();
				if (!(text = msg.reader().readUTF()).equals("")) {
					GameScr.gI().a((String) null, text, true);
				}

				var2 = msg.reader().readByte();

				for (var10 = 0; var10 < var2; ++var10) {
					var30 = msg.reader().readUTF();
					Short var149 = new Short(msg.reader().readShort());
					var14.addElement(new Command1(var30, GameCanvas.instance, 88819, var149));
				}

				GameCanvas.menu.startAt(var14);
				return;
			case 36:
				GameScr.gI().a(msg);
				Class_cl.g();
				return;
			case 37:
				GameScr.gI().dv = msg.reader().readUTF();
				GameScr.gI().u();
				Class_cl.ab();
				return;
			case 38:
				var13 = msg.reader().readShort();

				for (var6 = 0; var6 < GameScr.vSet.size(); ++var6) {
					if ((var23 = (Npc) GameScr.vSet.elementAt(var6)).template.npcTemplateId == var13
							&& var23.equals(Char.getMyChar().npcFocus)) {
						String var148;
						ChatPopup.addChatPopupMultiLine(var148 = msg.reader().readUTF(), var23);
						if (var23.template.npcTemplateId == 5) {
							if (var148.equals(
									"T\u1ed1t l\u1eafm, ng\u01b0\u01a1i \u0111\u00e3 ch\u1ecdn n\u01a1i n\u00e0y l\u00e0m n\u01a1i tr\u1edf v\u1ec1 khi b\u1ecb tr\u1ecdng th\u01b0\u01a1ng")) {
								Class_cl.x();
								return;
							}

							return;
						}
						if (var23.template.npcTemplateId == 0) {
							if (var148.equals(
									"S\u1ed1 l\u1ea7n v\u00e0o trong hang h\u00f4m nay c\u1ee7a con \u0111\u00e3 h\u1ebft.")) {

								if (NSOT_MOB.b instanceof AutoHangDong) {
									GameScr.b(0, 2, 0);
									NSOT_MOB.a(200L);
									Service.gI().rewardPB();
									NSOT_MOB.d();
								}
								TileMap.i();
								return;
							}

							return;
						}
						if (var23.template.npcTemplateId != 25 || NSOT_MOB.b != NSOT_MOB.c) {
							return;
						}

						TaskAuto.a(var148);
						return;
					}
				}

				return;
			case 39:
				var13 = msg.reader().readShort();

				for (var6 = 0; var6 < GameScr.vSet.size(); ++var6) {
					if ((var23 = (Npc) GameScr.vSet.elementAt(var6)).template.npcTemplateId == var13
							&& var23.equals(Char.getMyChar().npcFocus)) {
						ChatPopup.addChatPopupOutSide(msg.reader().readUTF(), 1000, var23);
						String[] var147 = new String[msg.reader().readByte()];

						for (var3 = 0; var3 < var147.length; ++var3) {
							var147[var3] = msg.reader().readUTF();
						}

						GameScr.gI();
						GameScr.createMenu(var147, var23);
						return;
					}
				}

				return;
			case 40:
				InfoDlg.hide();
				GameCanvas.m();
				GameCanvas.l();
				var14 = new MyVector();

				try {
					while (true) {
						var14.addElement(new Command1(msg.reader().readUTF(), GameCanvas.instance, 88822, (Object) null));
					}
				} catch (Exception var137) {
					if (Char.getMyChar().npcFocus != null) {
						if (Char.getMyChar().npcFocus.charID == 25) {
							GameScr.fi = var14.size();
						}

						for (var10 = 0; var10 < Char.getMyChar().npcFocus.template.menu.length; ++var10) {
							String[] var151 = Char.getMyChar().npcFocus.template.menu[var10];
							var14.addElement(new Command1(var151[0], GameCanvas.instance, 88820, var151));
						}

						GameCanvas.menu.startAt(var14);
						return;
					}

					return;
				}
			case 42:
				requestItemInfo(msg);
				return;
			case 43:
				Integer var48 = new Integer(msg.reader().readInt());
				if ((var5 = GameScr.e(var48.intValue())) != null) {
					GameCanvas.a(var5.cName + " " + mResources.mc, 88810, var48, 88811, (Object) null);
				}

				return;
			case 45:
				GameScr.gI().cz = 1;
				GameScr.gI().db = msg.reader().readInt();
				GameScr.arrItemTradeOrder = new Item[12];
				var18 = (short) msg.reader().readByte();

				for (var3 = 0; var3 < var18; ++var3) {
					GameScr.arrItemTradeOrder[var3] = new Item();
					GameScr.arrItemTradeOrder[var3].typeUI = 3;
					GameScr.arrItemTradeOrder[var3].indexUI = var3;
					GameScr.arrItemTradeOrder[var3].template = ItemTemplates.get(msg.reader().readShort());
					GameScr.arrItemTradeOrder[var3].isLock = false;
					if (GameScr.arrItemTradeOrder[var3].isTypeBody() || GameScr.arrItemTradeOrder[var3].isTypeNgocKham()) {
						GameScr.arrItemTradeOrder[var3].upgrade = msg.reader().readByte();
					}

					GameScr.arrItemTradeOrder[var3].isExpires = msg.reader().readBoolean();
					GameScr.arrItemTradeOrder[var3].quantity = msg.reader().readShort();
				}

				if (GameScr.gI().cy == 1 && GameScr.gI().cz == 1) {
					GameScr.gI().dc = (int) (System.currentTimeMillis() / 1000L + 5L);
				}

				return;
			case 46:
				GameScr.gI().cz = 2;
				if (GameScr.gI().cy >= 2 && GameScr.gI().cz >= 2) {
					InfoDlg.showWait();
					Class_cl.ab();
				}

				return;
			case 47:
				GameCanvas.v = 150;
				msg.reader().readShort();
				var18 = (short) msg.reader().readByte();
				to = msg.reader().readUTF();
				String var49 = msg.reader().readUTF();
				String[] var50;
				short[] var51 = new short[(var50 = new String[msg.reader().readByte()]).length];
				short var52 = -1;

				int var53;
				for (var53 = 0; var53 < var50.length; ++var53) {
					String var154 = msg.reader().readUTF();
					var51[var53] = -1;
					if (!var154.equals("")) {
						var50[var53] = var154;
					}
				}

				try {
					var52 = msg.reader().readShort();

					for (var53 = 0; var53 < var50.length; ++var53) {
						var51[var53] = msg.reader().readShort();
					}
				} catch (Exception var138) {
				}

				Char.getMyChar().taskMaint = new Task((byte) var18, to, var49, var50, var51, var52);
				Char.getMyChar().callEffTask(21);
				if (Char.getMyChar().npcFocus != null) {
					Npc.clearEffTask();
				}

				Class_cl.o();
				return;
			case 48:
				if (Char.getMyChar().taskMaint != null) {
					GameCanvas.v = 100;
					++Char.getMyChar().taskMaint.index;
					Char.getMyChar().taskMaint.count = 0;
					if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.chatPopup != null && Char.getMyChar().taskMaint.index >= 2) {
						Char.getMyChar().npcFocus.chatPopup = null;
					}

					if (Char.getMyChar().taskMaint.index >= Char.getMyChar().taskMaint.subNames.length - 1) {
						Char.getMyChar().callEffTask(61);
					} else {
						Char.getMyChar().callEffTask(21);
					}

					Npc.clearEffTask();
				}

				Class_cl.o();
				return;
			case 49:
				++Char.getMyChar().ctaskId;
				Char.getMyChar();
				Char.clearTask();
				return;
			case 50:
				GameCanvas.v = 50;
				Char.getMyChar().taskMaint.count = msg.reader().readShort();
				if (Char.getMyChar().npcFocus != null) {
					Npc.clearEffTask();
				}

				return;
			case 51:
				var27 = null;

				try {
					var27 = Mob.a(msg.reader().readUnsignedByte());
				} catch (Exception var114) {
				}

				if (var27 != null) {
					var27.hp = msg.reader().readInt();
					GameScr.a("", var27.x, var27.y - var27.exp, 4);
				}

				return;
			case 52:
				Char.flag = false;
				Char.ischangingMap = false;
				Char.getMyChar().cx = msg.reader().readShort();
				Char.getMyChar().cy = msg.reader().readShort();
				Char.getMyChar().cxSend = Char.getMyChar().cx;
				Char.getMyChar().cySend = Char.getMyChar().cy;
				return;
			case 53:
				GameScr.gI().resetButton();
				if (!(text = msg.reader().readUTF()).equals("typemoi")) {
					var8 = msg.reader().readUTF();
					GameScr.gI().a(text, var8, false);
				} else {
					var8 = msg.reader().readUTF();
					var13 = msg.reader().readShort();
					var30 = msg.reader().readUTF();
					short var153 = msg.reader().readShort();
					to = msg.reader().readUTF();
					short var155 = msg.reader().readShort();
					String var156 = msg.reader().readUTF();
					var31 = msg.reader().readByte();
					var39 = msg.reader().readUTF();
					GameScr.gI().a(var8, var13, var30, var153, to, var155, var156, var39, var31);
				}

				return;
			case 54:
				GameCanvas.c().a(msg.reader().readUTF(), msg.reader().readUTF(), msg.reader().readUTF(), msg.reader().readUTF());
				return;
			case 55:
				GameCanvas.c().a(msg.reader().readUTF(), msg.reader().readUTF(), msg.reader().readShort(), msg.reader().readUTF(),
						msg.reader().readUTF());
				return;
			case 57:
				GameCanvas.n();
				GameScr.gI().resetButton();
				Class_cl.ab();
				return;
			case 58:
				GameScr.arrItemTradeMe = null;
				GameScr.arrItemTradeOrder = null;
				if (GameScr.gI().db > 0) {
					(var22 = GameScr.gI()).dw = var22.dw + ", " + GameScr.gI().db + " " + mResources.ki;
					GameScr.a("+" + GameScr.gI().db, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch - 10, 6);
				}

				GameScr.gI().da = GameScr.gI().db = 0;
				GameScr.gI().resetButton();
				Char.getMyChar().xu = msg.reader().readInt();
				InfoDlg.hide();
				if (!GameScr.gI().dw.equals("")) {
					InfoMe.addInfo(mResources.ku + " " + GameScr.gI().dw);
				}

				Class_cl.ab();
				return;
			case 59:
				var8 = msg.reader().readUTF();
				Friend var54 = new Friend(var8, (byte) 4);
				GameScr.vFriendWait.addElement(var54);
				InfoMe.addInfo(var8 + " " + mResources.ir, 20, mFont.tahoma_7_white);
				if (!GameScr.isPaintFriend) {
					return;
				}

				var42 = false;

				for (var3 = 0; var3 < GameScr.vFriend.size(); ++var3) {
					if (((Friend) GameScr.vFriend.elementAt(var3)).friendName.equals(var8)) {
						var42 = true;
						break;
					}
				}

				if (var42) {
					return;
				}

				GameScr.vFriend.addElement(var54);
				GameScr.gI();
				GameScr.c((int) 0);
				GameScr.indexRow = 0;
				GameScr.aq.clear();
				return;
			case 60:
				if ((var15 = GameScr.e(msg.reader().readInt())) != null) {
					Mob.interestChar = var15;
				}

				if (var15 == null) {
					return;
				}

				if ((TileMap.a(var15.cx, var15.cy) & 2) == 2) {
					var15.a((SkillPaint) GameScr.s[msg.reader().readByte()], 0);
				} else {
					var15.a((SkillPaint) GameScr.s[msg.reader().readByte()], 1);
				}

				if (var15.isJump && var15.vitaWolf >= 500) {
					var15.isJump = false;
					var15.timeSummon = System.currentTimeMillis();
					ServerEffect.addServerEffect(60, var15, 1);
				}

				if (var15.fallAttack) {
					var15.fallAttack = false;
					var15.autoFall = true;
					if (var15.vitaWolf > 500) {
						ServerEffect.addServerEffect(60, var15, 1);
					}
				}

				Mob[] var55 = new Mob[10];
				var6 = 0;

				try {
					for (var6 = 0; var6 < 10; ++var6) {
						var35 = Mob.a(msg.reader().readUnsignedByte());
						var55[var6] = var35;
						if (var6 == 0) {
							if (var15.cx <= var35.x) {
								var15.cdir = 1;
							} else {
								var15.cdir = -1;
							}
						}
					}
				} catch (Exception var141) {
				}

				if (var6 <= 0) {
					return;
				}

				var15.attMobs = new Mob[var6];

				for (var6 = 0; var6 < var15.attMobs.length; ++var6) {
					var15.attMobs[var6] = var55[var6];
				}

				var15.mobFocus = var15.attMobs[0];
				return;
			case 61:
				if ((var15 = GameScr.e(msg.reader().readInt())) == null) {
					return;
				}

				if ((TileMap.a(var15.cx, var15.cy) & 2) == 2) {
					var15.a((SkillPaint) GameScr.s[msg.reader().readByte()], 0);
				} else {
					var15.a((SkillPaint) GameScr.s[msg.reader().readByte()], 1);
				}

				if (var15.isJump) {
					var15.isJump = false;
					var15.timeSummon = System.currentTimeMillis();
					if (var15.vitaWolf >= 500) {
						ServerEffect.addServerEffect(60, var15, 1);
					}
				}

				if (var15.fallAttack) {
					var15.fallAttack = false;
					var15.autoFall = true;
					ServerEffect.addServerEffect(60, var15, 1);
				}

				var25 = new Char[10];
				var6 = 0;

				try {
					for (var6 = 0; var6 < 10; ++var6) {
						if ((var9 = msg.reader().readInt()) == Char.getMyChar().charID) {
							var36 = Char.getMyChar();
						} else {
							var36 = GameScr.e(var9);
						}

						var25[var6] = var36;
						if (var6 == 0) {
							if (var15.cx <= var36.cx) {
								var15.cdir = 1;
							} else {
								var15.cdir = -1;
							}
						}
					}
				} catch (Exception var139) {
				}

				if (var6 <= 0) {
					return;
				}

				var15.attChars = new Char[var6];

				for (var6 = 0; var6 < var15.attChars.length; ++var6) {
					var15.attChars[var6] = var25[var6];
				}

				var15.charFocus = var15.attChars[0];
				return;
			case 62:
				if ((var9 = msg.reader().readInt()) == Char.getMyChar().charID) {
					(var15 = Char.getMyChar()).cHp = msg.reader().readInt();
					var9 = msg.reader().readInt();
					var10 = 0;

					try {
						var15.cMP = msg.reader().readInt();
						var10 = msg.reader().readInt();
					} catch (Exception var112) {
					}

					if ((var9 += var10) != 0) {
						if (var9 < 0) {
							var9 = -var9;
							GameScr.a("-" + var9, var15.cx, var15.cy - var15.ch, 8);
						} else {
							GameScr.a("-" + var9, var15.cx, var15.cy - var15.ch, 0);
						}

						return;
					}

					GameScr.a("", var15.cx, var15.cy - var15.ch, 7);
					return;
				}

				if ((var15 = GameScr.e(var9)) == null) {
					return;
				}

				var15.cHp = msg.reader().readInt();
				var9 = msg.reader().readInt();
				var10 = 0;

				try {
					var15.cMP = msg.reader().readInt();
					var10 = msg.reader().readInt();
				} catch (Exception var113) {
				}

				if ((var9 += var10) == 0) {
					GameScr.a("", var15.cx, var15.cy - var15.ch, 4);
					return;
				}

				if (var9 < 0) {
					var9 = -var9;
					GameScr.a("-" + var9, var15.cx, var15.cy - var15.ch, 3);
				} else {
					GameScr.a("-" + var9, var15.cx, var15.cy - var15.ch, 5);
				}

				return;
			case 63:
				var14 = new MyVector();

				while (true) {
					try {
						var14.addElement(new Command1(msg.reader().readUTF(), GameCanvas.instance, 88817, (Object) null));
					} catch (Exception var131) {
						GameCanvas.menu.startAt(var14);
						return;
					}
				}
			case 64:
				if ((var9 = msg.reader().readInt()) == Char.getMyChar().charID) {
					var5 = Char.getMyChar();
				} else {
					var5 = GameScr.e(var9);
				}

				var5.moveFast = new short[3];
				var5.moveFast[0] = 0;
				var24 = msg.reader().readShort();
				var13 = msg.reader().readShort();
				var5.moveFast[1] = var24;
				var5.moveFast[2] = var13;
				var5.isLockAttack = false;

				try {
					if ((var9 = msg.reader().readInt()) == Char.getMyChar().charID) {
						var5 = Char.getMyChar();
					} else {
						var5 = GameScr.e(var9);
					}

					var5.cx = var24;
					var5.cy = var13;
				} catch (Exception var111) {
					var111.printStackTrace();
				}

				return;
			case 65:
				if ((var5 = GameScr.e(msg.reader().readInt())) != null) {
					GameCanvas.a(var5.cName + " " + mResources.mf, 88812, var5, 8882, (Object) null);
				}

				return;
			case 66:
				var6 = msg.reader().readInt();
				var9 = msg.reader().readInt();
				if (var6 != Char.getMyChar().charID && var9 != Char.getMyChar().charID) {
					GameScr.e(var6).testCharId = var9;
					GameScr.e(var9).testCharId = var6;
					return;
				}

				if (var6 == Char.getMyChar().charID) {
					Char.getMyChar().testCharId = var9;
					Char.getMyChar().npcFocus = null;
					Char.getMyChar().mobFocus = null;
					Char.getMyChar().itemFocus = null;
					Char.getMyChar().charFocus = GameScr.e(Char.getMyChar().testCharId);
					Char.getMyChar().charFocus.testCharId = Char.getMyChar().charID;
					GameScr.gI().de = GameScr.gI().dd;
					GameScr.gI().dd = var9;
					Char.fw = true;
					return;
				}

				if (var9 != Char.getMyChar().charID) {
					return;
				}

				Char.getMyChar().testCharId = var6;
				Char.getMyChar().npcFocus = null;
				Char.getMyChar().mobFocus = null;
				Char.getMyChar().itemFocus = null;
				Char.getMyChar().charFocus = GameScr.e(Char.getMyChar().testCharId);
				Char.getMyChar().charFocus.testCharId = Char.getMyChar().charID;
				GameScr.gI().de = GameScr.gI().dd;
				GameScr.gI().dd = var6;
				Char.fw = true;
				return;
			case 67:
				var6 = msg.reader().readInt();
				var9 = msg.reader().readInt();
				var10 = 0;

				try {
					var10 = msg.reader().readInt();
				} catch (Exception var110) {
				}

				if (var6 == Char.getMyChar().charID) {
					var15 = GameScr.e(var9);
					if (var10 > 0) {
						InfoMe.addInfo(mResources.b(mResources.jg, var15.cName));
						Char.getMyChar().cHp = var10;
						Char.getMyChar().resultTest = 29;
						if (var15 != null) {
							var15.resultTest = 89;
						}
					} else {
						if (var15 != null) {
							var15.resultTest = 59;
						}

						Char.getMyChar().resultTest = 59;
						InfoMe.addInfo(mResources.b(mResources.jh, var15.cName));
					}

					Char.getMyChar().testCharId = -9999;
					Char.getMyChar().charFocus = null;
					if (GameScr.gI().de >= 0) {
						GameScr.gI().dd = GameScr.gI().de;
						GameScr.gI().de = -1;
					} else {
						GameScr.gI().dd = -1;
					}

					if (var15 == null) {
						return;
					}

					var15.testCharId = -9999;
					return;
				}

				if (var9 == Char.getMyChar().charID) {
					var15 = GameScr.e(var6);
					if (var10 > 0) {
						if (var15 != null) {
							var15.cHp = var10;
						}

						if (var15 != null) {
							var15.resultTest = 29;
						}

						Char.getMyChar().resultTest = 89;
						InfoMe.addInfo(mResources.b(mResources.jf, var15.cName));
					} else {
						if (var15 != null) {
							var15.resultTest = 59;
						}

						Char.getMyChar().resultTest = 59;
						InfoMe.addInfo(mResources.b(mResources.jh, var15.cName));
					}

					if (var15 != null) {
						var15.testCharId = -9999;
					}

					Char.getMyChar().testCharId = -9999;
					Char.getMyChar().charFocus = null;
					if (GameScr.gI().de >= 0) {
						GameScr.gI().dd = GameScr.gI().de;
						GameScr.gI().de = -1;
					} else {
						GameScr.gI().dd = -1;
					}

					return;
				}

				var36 = GameScr.e(var6);
				Char var56 = GameScr.e(var9);
				if (var10 > 0) {
					if (var36 != null) {
						var36.cHp = var10;
					}

					if (var36 != null) {
						var36.resultTest = 29;
					}

					if (var56 != null) {
						var56.resultTest = 89;
					}
				} else {
					if (var36 != null) {
						var36.resultTest = 59;
					}

					if (var56 != null) {
						var56.resultTest = 59;
					}
				}

				if (var36 != null) {
					var36.testCharId = -9999;
				}

				if (var56 == null) {
					return;
				}

				var56.testCharId = -9999;
				return;
			case 68:
				if ((var15 = GameScr.e(msg.reader().readInt())) != null) {
					var15.killCharId = Char.getMyChar().charID;
					Auto.a(var15);
					Char.getMyChar().npcFocus = null;
					Char.getMyChar().mobFocus = null;
					Char.getMyChar().itemFocus = null;
					Char.getMyChar().charFocus = var15;
					Char.fw = true;
					InfoMe.addInfo(var15.cName + mResources.jj, 20, mFont.tahoma_7_red);
				}

				return;
			case 69:
				Char.getMyChar().killCharId = msg.reader().readInt();
				Char.getMyChar().npcFocus = null;
				Char.getMyChar().mobFocus = null;
				Char.getMyChar().itemFocus = null;
				Char.getMyChar().charFocus = GameScr.e(Char.getMyChar().killCharId);
				Char.fw = true;
				return;
			case 70:
				var15 = Char.getMyChar();

				try {
					var15 = GameScr.e(msg.reader().readInt());
				} catch (Exception var109) {
				}

				var15.killCharId = -9999;
				return;
			case 71:
				var19 = msg.reader().readLong();
				var11 = Char.getMyChar();
				var11.cExpDown -= var19;
				GameScr.a("+" + var19, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch, 2);
				return;
			case 72:
				Char.getMyChar().cPk = msg.reader().readByte();
				Char.getMyChar().waitToDie(msg.reader().readShort(), msg.reader().readShort());
				Char.getMyChar().cEXP = GameScr.getMaxExp(Char.getMyChar().clevel - 1);
				Char.getMyChar().cExpDown = msg.reader().readLong();
				GameScr.getLevelExp(Char.getMyChar().cEXP);
				return;
			case 75:
				var29 = new BuNhin(msg.reader().readUTF(), msg.reader().readShort(), msg.reader().readShort());
				GameScr.vMob.addElement(var29);
				ServerEffect.addServerEffect(60, var29.x, var29.y, 1);
				return;
			case 76:
				if ((var35 = Mob.a(msg.reader().readUnsignedByte())) == null) {
					return;
				}

				if ((var29 = GameScr.f(msg.reader().readShort())) == null) {
					return;
				}

				var24 = msg.reader().readShort();
				var13 = (short) msg.reader().readByte();
				var18 = (short) msg.reader().readByte();
				var35.a(var29);
				var35.a(var24, (byte) var13, (byte) var18);
				return;
			case 77:
				var29 = (BuNhin) GameScr.vMob.elementAt(msg.reader().readShort());
				GameScr.vMob.removeElement(var29);
				ServerEffect.addServerEffect(60, var29.x, var29.y, 1);
				return;
			case 78:
				var27 = null;

				try {
					var27 = Mob.a(msg.reader().readUnsignedByte());
				} catch (Exception var108) {
				}

				if (var27 == null || var27.status == 0 || var27.status == 0) {
					return;
				}

				var27.status = 0;
				ServerEffect.addServerEffect(60, var27.x, var27.y, 1);
				ItemMap var57 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), var27.x, var27.y,
						msg.reader().readShort(), msg.reader().readShort());
				GameScr.vItemMap.addElement(var57);
				if (Res.abs(var57.y - Char.getMyChar().cy) >= 24 || Res.abs(var57.x - Char.getMyChar().cx) >= 24) {
					return;
				}

				Char.getMyChar().charFocus = null;
				return;
			case 79:
				var6 = msg.reader().readInt();
				if (!(var7 = msg.reader().readUTF()).equals(NSOT_MOB.d) && !NSOT_MOB.b(var7)) {
					boolean autoAccept = false;
					if (AutoPartyPanel.isAutoPartyOn && AutoPartyPanel.partyRole == 1 && AutoPartyPanel.leaderName.length() > 0 && var7.equals(AutoPartyPanel.leaderName)) {
						autoAccept = true;
					}
					if (!autoAccept) {
						GameCanvas.a(var7 + " " + mResources.mh, 8887, new Integer(var6), 8888, new Integer(var6));
						return;
					}
				}

				Service.gI().addPartyAccept(var6);
				return;
			case 82:
				GameScr.vParty.removeAllElements();
				var42 = msg.reader().readBoolean();

				try {
					for (int var157 = 0; var157 < 6; ++var157) {
						GameScr.vParty.addElement(
								new Party(msg.reader().readInt(), msg.reader().readByte(), msg.reader().readUTF(), var42));
					}
				} catch (Exception var140) {
				}

				GameScr.gI().t();
				var39 = ((Party) GameScr.vParty.firstElement()).name;
				if (NSOT_MOB.d == null) {
					NSOT_MOB.d = var39;
					return;
				}

				if (var39.equals(NSOT_MOB.d)) {
					return;
				}

				Service.gI().outParty();
				return;
			case 83:
				GameScr.vParty.removeAllElements();
				GameScr.gI().t();
				return;
			case 84:
				Friend var58 = new Friend(msg.reader().readUTF(), msg.reader().readByte());
				GameScr.gI();
				GameScr.a(var58.friendName);
				if (var58.type == 0) {
					InfoMe.addInfo(mResources.is + " " + var58.friendName + " " + mResources.it);
					GameScr.vFriend.addElement(var58);
				} else if (var58.type == 1) {
					for (var6 = 0; var6 < GameScr.vFriend.size(); ++var6) {
						if (((Friend) GameScr.vFriend.elementAt(var6)).friendName.equals(var58.friendName)) {
							GameScr.vFriend.removeElementAt(var6);
							break;
						}
					}

					InfoMe.addInfo(mResources.iu + " " + var58.friendName + " " + mResources.en);
					var58.type = 3;
					GameScr.vFriend.insertElementAt(var58, 0);
				}

				if (GameScr.isPaintFriend) {
					GameScr.gI();
					GameScr.c((int) 0);
					GameScr.indexRow = 0;
					GameScr.aq.clear();
				}

				return;
			case 85:
				if ((var21 = Mob.a(msg.reader().readUnsignedByte())) != null) {
					var21.isDisable = msg.reader().readBoolean();
				}

				return;
			case 86:
				if ((var21 = Mob.a(msg.reader().readUnsignedByte())) != null) {
					var21.isDontMove = msg.reader().readBoolean();
				}

				return;
			case 87:
				if ((var9 = msg.reader().readInt()) == Char.getMyChar().charID) {
					var15 = Char.getMyChar();
				} else {
					var15 = GameScr.e(var9);
				}

				if (var15 == null) {
					return;
				}

				var6 = msg.reader().readUnsignedByte();
				var24 = msg.reader().readShort();
				var13 = (short) msg.reader().readByte();
				var18 = (short) msg.reader().readByte();
				var31 = 0;
				var4 = -1;

				try {
					if ((var31 = msg.reader().readByte()) == 1) {
						var4 = msg.reader().readInt();
					}
				} catch (Exception var107) {
					var107.printStackTrace();
				}

				if (var15.mobMe != null) {
					if (var31 == 0) {
						Mob var158 = Mob.a(var6);
						var15.mobMe.a(var158);
					} else {
						Char var159 = GameScr.e(var4);
						var15.mobMe.b(var159);
					}
				}

				var15.mobMe.a(var24, (byte) var13, (byte) var18);
				return;
			case 88:
				if ((var9 = msg.reader().readInt()) == Char.getMyChar().charID) {
					var15 = Char.getMyChar();
				} else if ((var15 = GameScr.e(var9)) == null) {
					return;
				}

				var15.cHp = var15.cMaxHp;
				var15.cMP = var15.cMaxMP;
				var15.cx = msg.reader().readShort();
				var15.cy = msg.reader().readShort();
				var15.liveFromDead();
				return;
			case 89:
				if ((var21 = Mob.a(msg.reader().readUnsignedByte())) != null) {
					var21.isFire = msg.reader().readBoolean();
				}

				return;
			case 90:
				if ((var21 = Mob.a(msg.reader().readUnsignedByte())) != null) {
					var21.isIce = msg.reader().readBoolean();
					if (var21.isIce) {
						return;
					}

					ServerEffect.addServerEffect(77, var21.x, var21.y - 9, 1);
					return;
				}

				return;
			case 91:
				if ((var21 = Mob.a(msg.reader().readUnsignedByte())) != null) {
					var21.isWind = msg.reader().readBoolean();
				}

				return;
			case 92:
				text = msg.reader().readUTF();
				Short var59 = new Short(msg.reader().readShort());
				GameCanvas.inputDlg.a(text, new Command1(mResources.dm, GameCanvas.instance, 88818, var59), 0);
				return;
			case 93:
				var9 = msg.reader().readInt();
				GameScr.currentCharViewInfo = new Char();
				if (Char.getMyChar().charID == var9) {
					GameScr.currentCharViewInfo = Char.getMyChar();
				} else {
					if ((var15 = GameScr.e(var9)) == null) {
						GameScr.currentCharViewInfo = new Char();
					} else {
						GameScr.currentCharViewInfo = var15;
					}

					GameScr.currentCharViewInfo.charID = var9;
					GameScr.currentCharViewInfo.statusMe = 1;
					GameScr.gI().al();
				}

				GameScr.currentCharViewInfo.cName = a(msg.reader().readUTF());
				GameScr.currentCharViewInfo.head = msg.reader().readShort();
				GameScr.currentCharViewInfo.cgender = msg.reader().readByte();
				byte var60 = msg.reader().readByte();
				GameScr.currentCharViewInfo.nClass = GameScr.nClasss[var60];
				GameScr.currentCharViewInfo.cPk = msg.reader().readByte();
				GameScr.currentCharViewInfo.cHp = msg.reader().readInt();
				GameScr.currentCharViewInfo.cMaxHp = msg.reader().readInt();
				GameScr.currentCharViewInfo.cMP = msg.reader().readInt();
				GameScr.currentCharViewInfo.cMaxMP = msg.reader().readInt();
				GameScr.currentCharViewInfo.cspeed = msg.reader().readByte();
				GameScr.currentCharViewInfo.cResFire = msg.reader().readShort();
				GameScr.currentCharViewInfo.cResIce = msg.reader().readShort();
				GameScr.currentCharViewInfo.cResWind = msg.reader().readShort();
				GameScr.currentCharViewInfo.cdame = msg.reader().readInt();
				GameScr.currentCharViewInfo.cdameDown = msg.reader().readInt();
				GameScr.currentCharViewInfo.cExactly = msg.reader().readShort();
				GameScr.currentCharViewInfo.cMiss = msg.reader().readShort();
				GameScr.currentCharViewInfo.cFatal = msg.reader().readShort();
				GameScr.currentCharViewInfo.cReactDame = msg.reader().readShort();
				GameScr.currentCharViewInfo.sysUp = msg.reader().readShort();
				GameScr.currentCharViewInfo.sysDown = msg.reader().readShort();
				GameScr.currentCharViewInfo.clevel = msg.reader().readUnsignedByte();
				GameScr.currentCharViewInfo.pointUydanh = msg.reader().readShort();
				GameScr.currentCharViewInfo.cClanName = msg.reader().readUTF();
				if (!GameScr.currentCharViewInfo.cClanName.equals("")) {
					GameScr.currentCharViewInfo.ctypeClan = msg.reader().readByte();
				}

				GameScr.currentCharViewInfo.pointUydanh = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointNon = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointAo = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointGangtay = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointQuan = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointGiay = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointVukhi = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointLien = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointNhan = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointNgocboi = msg.reader().readShort();
				GameScr.currentCharViewInfo.pointPhu = msg.reader().readShort();
				GameScr.currentCharViewInfo.countFinishDay = msg.reader().readByte();
				GameScr.currentCharViewInfo.countLoopBoos = msg.reader().readByte();
				GameScr.currentCharViewInfo.countPB = msg.reader().readByte();
				GameScr.currentCharViewInfo.limitTiemnangso = msg.reader().readByte();
				GameScr.currentCharViewInfo.limitKynangso = msg.reader().readByte();
				GameScr.currentCharViewInfo.arrItemBody = new Item[32];
				short var_short_item;
				try {
					GameScr.currentCharViewInfo.n();

					for (var37 = 0; var37 < 16; ++var37) {
						ItemTemplate var167;
						var_short_item = msg.reader().readShort();
						if (var_short_item > -1) {
							var26 = (var167 = ItemTemplates.get(var_short_item)).type;
							GameScr.currentCharViewInfo.arrItemBody[var26] = new Item();
							GameScr.currentCharViewInfo.arrItemBody[var26].indexUI = var26;
							GameScr.currentCharViewInfo.arrItemBody[var26].typeUI = 5;
							GameScr.currentCharViewInfo.arrItemBody[var26].template = var167;
							GameScr.currentCharViewInfo.arrItemBody[var26].isLock = true;
							GameScr.currentCharViewInfo.arrItemBody[var26].upgrade = msg.reader().readByte();
							GameScr.currentCharViewInfo.arrItemBody[var26].sys = msg.reader().readByte();
							if (var26 == 1) {
								GameScr.currentCharViewInfo.wp = GameScr.currentCharViewInfo.arrItemBody[var26].template.part;
							} else if (var26 == 2) {
								GameScr.currentCharViewInfo.body = GameScr.currentCharViewInfo.arrItemBody[var26].template.part;
							} else if (var26 == 6) {
								GameScr.currentCharViewInfo.leg = GameScr.currentCharViewInfo.arrItemBody[var26].template.part;
							}
						}
					}
				} catch (Exception var136) {
				}
				try {

					for (var37 = 0; var37 < 16; ++var37) {
						ItemTemplate var167;
						var_short_item = msg.reader().readShort();
						if (var_short_item > -1) {
							var26 = (byte) ((var167 = ItemTemplates.get(var_short_item)).type + 16);
							GameScr.currentCharViewInfo.arrItemBody[var26] = new Item();
							GameScr.currentCharViewInfo.arrItemBody[var26].indexUI = var26;
							GameScr.currentCharViewInfo.arrItemBody[var26].typeUI = 5;
							GameScr.currentCharViewInfo.arrItemBody[var26].template = var167;
							GameScr.currentCharViewInfo.arrItemBody[var26].isLock = true;
							GameScr.currentCharViewInfo.arrItemBody[var26].upgrade = msg.reader().readByte();
							GameScr.currentCharViewInfo.arrItemBody[var26].sys = msg.reader().readByte();
							if (var26 == 1) {
								GameScr.currentCharViewInfo.wp = GameScr.currentCharViewInfo.arrItemBody[var26].template.part;
							} else if (var26 == 2) {
								GameScr.currentCharViewInfo.body = GameScr.currentCharViewInfo.arrItemBody[var26].template.part;
							} else if (var26 == 6) {
								GameScr.currentCharViewInfo.leg = GameScr.currentCharViewInfo.arrItemBody[var26].template.part;
							}
						}
					}

					return;
				} catch (Exception var136) {
					return;
				}
			case 94:
				requestItemPlayer(msg);
				return;
			case 95:
				var37 = msg.reader().readInt();
				var11 = Char.getMyChar();
				var11.xu += var37;
				GameScr.a(var37 > 0 ? "+" + var37 : String.valueOf(var37), Char.getMyChar().cx,
						Char.getMyChar().cy - Char.getMyChar().ch - 10, 1);
				return;
			case 96:
				Char.getMyChar().taskOrders.addElement(
						new TaskOrder(msg.reader().readByte(), msg.reader().readInt(), msg.reader().readInt(), msg.reader().readUTF(),
								msg.reader().readUTF(), msg.reader().readUnsignedByte(), msg.reader().readUnsignedByte()));
				Char.getMyChar().callEffTask(21);
				Class_cl.m();
				return;
			case 97:
				var13 = (short) msg.reader().readByte();

				for (var6 = 0; var6 < Char.getMyChar().taskOrders.size(); ++var6) {
					TaskOrder var166;
					if ((var166 = (TaskOrder) Char.getMyChar().taskOrders.elementAt(var6)).taskId == var13) {
						var166.count = msg.reader().readInt();
						if (var166.count == var166.maxCount) {
							Char.getMyChar().callEffTask(61);
						}

						if (var166.taskId == 0) {
							TaskAuto.o = true;
						}

						return;
					}
				}

				return;
			case 98:
				var13 = (short) msg.reader().readByte();
				var6 = 0;

				while (true) {
					if (var6 < Char.getMyChar().taskOrders.size()) {
						if (((TaskOrder) Char.getMyChar().taskOrders.elementAt(var6)).taskId != var13) {
							++var6;
							continue;
						}

						Char.getMyChar().taskOrders.removeElementAt(var6);
					}

					Char.getMyChar().callEffTask(21);
					Class_cl.n();
					return;
				}
			case 99:
				if ((var5 = GameScr.e(msg.reader().readInt())) != null) {
					GameCanvas.a(var5.cName + " " + mResources.mg, 88840, var5, 8882, (Object) null);
				}
				break;
			case 100:
				GameScr.vList.removeAllElements();
				var13 = (short) msg.reader().readByte();

				for (var6 = 0; var6 < var13; ++var6) {
					try {
						DunItem var165;
						(var165 = new DunItem()).id = msg.reader().readByte();
						var165.name1 = msg.reader().readUTF();
						var165.name2 = msg.reader().readUTF();
						GameScr.vList.addElement(var165);
					} catch (Exception var106) {
					}
				}

				GameScr.gI().r();
				return;
			case 101:
				try {
					GameScr.currentCharViewInfo.pointTinhTu = msg.reader().readInt();
					GameScr.currentCharViewInfo.limitPhongLoi = msg.reader().readByte();
					GameScr.currentCharViewInfo.limitBangHoa = msg.reader().readByte();
				} catch (Exception var105) {
					var105.printStackTrace();
				}

				return;
			case 102:
				if ((var16 = Char.getMyChar().arrItemBag[msg.reader().readByte()]) != null) {
					GameScr.itemSell = var16;
				}

				Char.getMyChar().xu = msg.reader().readInt();
				if (GameScr.itemSell != null) {
					if (GameScr.itemSell.template.type == 16) {
						GameScr.r -= GameScr.itemSell.quantity;
					}

					if (GameScr.itemSell.template.type == 17) {
						GameScr.q -= GameScr.itemSell.quantity;
					}

					Char.getMyChar().arrItemBag[GameScr.itemSell.indexUI] = null;
					GameScr.itemSell = null;
					GameScr.gI().resetButton();
					InfoMe.addInfo(mResources.qn);
				}

				GameCanvas.n();
				return;
			case 103:
				GameScr.indexMenu = msg.reader().readByte();
				GameScr.arrItemStands = new ItemStands[msg.reader().readInt()];

				for (var38 = 0; var38 < GameScr.arrItemStands.length; ++var38) {
					GameScr.arrItemStands[var38] = new ItemStands();
					GameScr.arrItemStands[var38].item = new Item();
					GameScr.arrItemStands[var38].item.c = msg.reader().readInt();
					GameScr.arrItemStands[var38].timeStart = (int) (System.currentTimeMillis() / 1000L);
					GameScr.arrItemStands[var38].timeEnd = msg.reader().readInt();
					GameScr.arrItemStands[var38].item.quantity = msg.reader().readUnsignedShort();
					GameScr.arrItemStands[var38].seller = msg.reader().readUTF();
					GameScr.arrItemStands[var38].price = msg.reader().readInt();
					GameScr.arrItemStands[var38].item.template = ItemTemplates.get(msg.reader().readShort());
				}

				GameScr.gI().d((int) 37);
				return;
			case 104:
				viewItemAuction(msg);
				return;
			case 106:
				if ((var5 = GameScr.e(msg.reader().readInt())) != null) {
					GameCanvas.a(var5.cName + " " + mResources.rb, 88841, var5, 8882, (Object) null);
				}

				return;
			case 107:
				var18 = (short) msg.reader().readByte();
				GameCanvas.a(msg.reader().readUTF(), 8890, new Integer(var18), 8882, (Object) null);
				return;
			case 108:
				Char.getMyChar().b(msg);
				return;
			case 109:
				InfoDlg.hide();
				GameCanvas.m();
				GameCanvas.l();
				var14 = new MyVector();

				try {
					var38 = msg.reader().readByte();

					for (var6 = 0; var6 < var38; ++var6) {
						String[] var164 = new String[msg.reader().readByte()];

						for (int var163 = 0; var163 < var164.length; ++var163) {
							var164[var163] = msg.reader().readUTF();
						}

						var14.addElement(new Command1(var164[0], GameCanvas.instance, 88820, var164));
					}
				} catch (Exception var135) {
				}

				if (Char.getMyChar().npcFocus == null) {
					return;
				}

				GameCanvas.menu.startAt(var14);
				return;
			case 112:
				(var16 = Char.getMyChar().arrItemBag[msg.reader().readByte()]).upgrade = msg.reader().readByte();
				var16.expires = 0L;
				return;
			case 114:
				GameScr.gI().ed = msg.reader().readByte();
				return;
			case 116:
				if ((var15 = GameScr.e(msg.reader().readInt())) != null) {
					readCharInfo(var15, msg);
				}

				return;
			case 117:
				if (GameCanvas.a) {
					return;
				}

				try {
					Mob.vEggMonter.removeAllElements();
					TileMap.x.clear();
					GameScr.eg.removeAllElements();
					GameScr.eh.removeAllElements();
					GameScr.ef.removeAllElements();
					var13 = (short) msg.reader().readByte();

					for (var6 = 0; var6 < var13; ++var6) {
						var7 = String.valueOf(msg.reader().readShort());
						byte[] var161 = new byte[msg.reader().readInt()];
						msg.reader().read(var161);
						Image var62 = a(var161);
						TileMap.x.put(var7, var62);
					}

					var9 = msg.reader().readUnsignedByte();

					ItemTree var162;
					for (var6 = 0; var6 < var9; ++var6) {
						var10 = msg.reader().readUnsignedByte();
						var3 = msg.reader().readUnsignedByte();
						var4 = msg.reader().readUnsignedByte();
						(var162 = new ItemTree(var3, var4)).idTree = var10;
						GameScr.eg.addElement(var162);
					}

					var9 = msg.reader().readUnsignedByte();

					for (var6 = 0; var6 < var9; ++var6) {
						var10 = msg.reader().readUnsignedByte();
						var3 = msg.reader().readUnsignedByte();
						var4 = msg.reader().readUnsignedByte();
						(var162 = new ItemTree(var3, var4)).idTree = var10;
						GameScr.eh.addElement(var162);
					}

					var9 = msg.reader().readUnsignedByte();

					for (var6 = 0; var6 < var9; ++var6) {
						var10 = msg.reader().readUnsignedByte();
						var3 = msg.reader().readUnsignedByte();
						var4 = msg.reader().readUnsignedByte();
						(var162 = new ItemTree(var3, var4)).idTree = var10;
						GameScr.ef.addElement(var162);
					}

					return;
				} catch (Exception var132) {
					return;
				}
			case 118:
				text = msg.reader().readUTF();
				mResources.a("acc", text);
				var8 = msg.reader().readUTF();
				mResources.a("pass", var8);
				SelectServerScr.uname = text;
				SelectServerScr.pass = var8;
				SelectServerScr.unameChange = "";
				SelectServerScr.passChange = "";
				if (!text.startsWith("tmpusr")) {
					GameScr.gI().switchToMe();
				}

				Session_ME.f();
				return;
			case 119:
				if ((var18 = (short) msg.reader().readByte()) == -1) {
					GameScr.en = true;
					GameScr.a(true);
					if ((GameScr.fc = msg.reader().readInt()) > 360) {
						GameScr.eo = true;
					} else {
						GameScr.eo = false;
						GameScr.fa = Char.getMyChar().cx;
						GameScr.fb = Char.getMyChar().cy;
					}

					return;
				}

				if (var18 == 0) {
					Char var160;
					if ((var160 = GameScr.e(msg.reader().readInt())) != null) {
						ServerEffect.addServerEffect(141, var160.cx, var160.cy, 2);
						var3 = msg.reader().readShort();
						var160.ez = var3;
						var3 = msg.reader().readShort();
						var160.fa = var3;
						ServerEffect.addServerEffect(141, var160.cx, var160.cy, 2);
						return;
					}
				} else {
					GameScr.en = false;
					GameScr.er = 0;
				}

				return;
			case 121:
				GameScr.vList.removeAllElements();
				var9 = msg.reader().readUnsignedByte();

				for (var6 = 0; var6 < var9; ++var6) {
					try {
						Ranked var61;
						(var61 = new Ranked()).name = msg.reader().readUTF();
						var61.ranked = msg.reader().readInt();
						var61.stt = msg.reader().readUTF();
						GameScr.vList.addElement(var61);
					} catch (Exception var104) {
					}
				}

				GameScr.gI().q();
				return;
			case 122:
				if ((var3 = msg.reader().readByte()) == 0) {
					addMob(msg);
					return;
				}

				if (var3 != 1) {
					if (var3 == 2) {
						getImgEffAuto(msg);
						return;
					}

					if (var3 != 3) {
						return;
					}

					getDataEffAuto(msg);
					return;
				}

				addEffAuto(msg);
				return;
			case 123:
				msg.reader().readByte();
				return;
			case 124:
				khamngoc(msg);
				return;
			case 125:
				if ((var3 = msg.reader().readByte()) == 0) {
					addEffect(msg);
					return;
				}

				if (var3 != 1) {
					if (var3 != 2) {
						return;
					}

					getDataEffect(msg);
					return;
				}

				getImgEffect(msg);
				return;
			case 126:
				var38 = msg.reader().readByte();
				GameCanvas.n();
				if (var38 != 0) {
					return;
				}

				GameScr.instance.resetButton();
				return;
			}
		} catch (Exception var142) {
			System.out.println("ERROR COMAND: " + msg.command);
			var142.printStackTrace();
			return;
		} finally {
			msg.close();
		}

	}

	private static void a(DataInputStream var0) {
		try {
			GameScr.dk = var0.readByte();
			GameScr.iOptionTemplates = new ItemOptionTemplate[var0.readUnsignedByte()];

			for (int var1 = 0; var1 < GameScr.iOptionTemplates.length; ++var1) {
				GameScr.iOptionTemplates[var1] = new ItemOptionTemplate();
				GameScr.iOptionTemplates[var1].id = var1;
				GameScr.iOptionTemplates[var1].name = var0.readUTF();
				GameScr.iOptionTemplates[var1].type = var0.readByte();
			}

			short var4 = var0.readShort();

			for (int var2 = 0; var2 < var4; ++var2) {
				ItemTemplates.add(new ItemTemplate((short) var2, var0.readByte(), var0.readByte(), var0.readUTF(), var0.readUTF(),
						var0.readByte(), var0.readShort(), var0.readShort(), var0.readBoolean()));
			}
		} catch (IOException var3) {
			var3.printStackTrace();
		}

	}

	private static void b(DataInputStream var0) {
		try {
			GameScr.dj = var0.readByte();
			GameScr.sOptionTemplates = new SkillOptionTemplate[var0.readByte()];

			int var1;
			for (var1 = 0; var1 < GameScr.sOptionTemplates.length; ++var1) {
				GameScr.sOptionTemplates[var1] = new SkillOptionTemplate();
				GameScr.sOptionTemplates[var1].id = var1;
				GameScr.sOptionTemplates[var1].name = var0.readUTF();
			}

			GameScr.nClasss = new NClass[var0.readUnsignedByte()];

			for (var1 = 0; var1 < GameScr.nClasss.length; ++var1) {
				GameScr.nClasss[var1] = new NClass();
				GameScr.nClasss[var1].classId = var1;
				GameScr.nClasss[var1].name = var0.readUTF();
				GameScr.nClasss[var1].c = new SkillTemplate[var0.readByte()];

				for (int var2 = 0; var2 < GameScr.nClasss[var1].c.length; ++var2) {
					GameScr.nClasss[var1].c[var2] = new SkillTemplate();
					GameScr.nClasss[var1].c[var2].id = var0.readByte();
					GameScr.nClasss[var1].c[var2].name = var0.readUTF();
					GameScr.nClasss[var1].c[var2].maxPoint = var0.readByte();
					GameScr.nClasss[var1].c[var2].type = var0.readByte();
					GameScr.nClasss[var1].c[var2].iconId = var0.readShort();
					int var3 = 150;
					if (GameCanvas.z == 128 || GameCanvas.aa <= 208) {
						var3 = 100;
					}

					GameScr.nClasss[var1].c[var2].description = mFont.tahoma_7_white.splitFontArray(var0.readUTF(), var3);
					GameScr.nClasss[var1].c[var2].skills = new Skill[var0.readByte()];

					for (var3 = 0; var3 < GameScr.nClasss[var1].c[var2].skills.length; ++var3) {
						GameScr.nClasss[var1].c[var2].skills[var3] = new Skill();
						GameScr.nClasss[var1].c[var2].skills[var3].skillId = var0.readShort();
						GameScr.nClasss[var1].c[var2].skills[var3].template = GameScr.nClasss[var1].c[var2];
						GameScr.nClasss[var1].c[var2].skills[var3].point = var0.readByte();
						GameScr.nClasss[var1].c[var2].skills[var3].level = var0.readByte();
						GameScr.nClasss[var1].c[var2].skills[var3].manaUse = var0.readShort();
						GameScr.nClasss[var1].c[var2].skills[var3].coolDown = var0.readInt();
						GameScr.nClasss[var1].c[var2].skills[var3].dx = var0.readShort();
						GameScr.nClasss[var1].c[var2].skills[var3].dy = var0.readShort();
						GameScr.nClasss[var1].c[var2].skills[var3].maxFight = var0.readByte();
						GameScr.nClasss[var1].c[var2].skills[var3].k = new SkillOption[var0.readByte()];

						for (int var4 = 0; var4 < GameScr.nClasss[var1].c[var2].skills[var3].k.length; ++var4) {
							GameScr.nClasss[var1].c[var2].skills[var3].k[var4] = new SkillOption();
							GameScr.nClasss[var1].c[var2].skills[var3].k[var4].param = var0.readShort();
							GameScr.nClasss[var1].c[var2].skills[var3].k[var4].optionTemplate = GameScr.sOptionTemplates[var0.readByte()];
						}

						Skills.add(GameScr.nClasss[var1].c[var2].skills[var3]);
					}
				}
			}
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}

	private static void c(DataInputStream var0) {
		try {
			GameScr.di = var0.readByte();
			TileMap.v = new String[var0.readUnsignedByte()];

			int var1;
			for (var1 = 0; var1 < TileMap.v.length; ++var1) {
				TileMap.v[var1] = var0.readUTF();
			}

			Npc.arrNpcTemplate = new NpcTemplate[var0.readByte()];

			int var2;
			for (byte var3 = 0; var3 < Npc.arrNpcTemplate.length; ++var3) {
				Npc.arrNpcTemplate[var3] = new NpcTemplate();
				Npc.arrNpcTemplate[var3].npcTemplateId = var3;
				Npc.arrNpcTemplate[var3].name = var0.readUTF();
				Npc.arrNpcTemplate[var3].headId = var0.readShort();
				Npc.arrNpcTemplate[var3].bodyId = var0.readShort();
				Npc.arrNpcTemplate[var3].legId = var0.readShort();
				Npc.arrNpcTemplate[var3].menu = new String[var0.readByte()][];

				for (var2 = 0; var2 < Npc.arrNpcTemplate[var3].menu.length; ++var2) {
					Npc.arrNpcTemplate[var3].menu[var2] = new String[var0.readByte()];

					for (int var4 = 0; var4 < Npc.arrNpcTemplate[var3].menu[var2].length; ++var4) {
						Npc.arrNpcTemplate[var3].menu[var2][var4] = var0.readUTF();
					}
				}
			}

			Mob.arrMobTemplate = new MobTemplate[var1 = var0.readUnsignedByte()];

			for (var2 = 0; var2 < var1; ++var2) {
				Mob.arrMobTemplate[var2] = new MobTemplate();
				Mob.arrMobTemplate[var2].mobTemplateId = (short) var2;
				Mob.arrMobTemplate[var2].type = var0.readByte();
				Mob.arrMobTemplate[var2].name = var0.readUTF();
				Mob.arrMobTemplate[var2].hp = var0.readInt();
				Mob.arrMobTemplate[var2].rangeMove = var0.readByte();
				Mob.arrMobTemplate[var2].speed = var0.readByte();
			}
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}

	private static void d(DataInputStream var0) {
		try {
			GameScr.dh = var0.readByte();
			mResources.a("nj_arrow", NinjaUtil.readByteArray(var0));
			mResources.a("nj_effect", NinjaUtil.readByteArray(var0));
			mResources.a("nj_image", NinjaUtil.readByteArray(var0));
			mResources.a("nj_part", NinjaUtil.readByteArray(var0));
			mResources.a("nj_skill", NinjaUtil.readByteArray(var0));
			GameScr.dg = new byte[(GameScr.df = new byte[var0.readByte()][]).length][];

			int var1;
			for (var1 = 0; var1 < GameScr.df.length; ++var1) {
				GameScr.df[var1] = new byte[var0.readByte()];
				GameScr.dg[var1] = new byte[GameScr.df[var1].length];

				for (int var2 = 0; var2 < GameScr.df[var1].length; ++var2) {
					GameScr.df[var1][var2] = var0.readByte();
					GameScr.dg[var1][var2] = var0.readByte();
				}
			}

			GameScr.exps = new long[var0.readUnsignedByte()];

			for (var1 = 0; var1 < GameScr.exps.length; ++var1) {
				GameScr.exps[var1] = var0.readLong();
			}

			GameScr.cn = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.cn.length; ++var1) {
				GameScr.cn[var1] = var0.readInt();
			}

			GameScr.co = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.co.length; ++var1) {
				GameScr.co[var1] = var0.readInt();
			}

			GameScr.cp = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.cp.length; ++var1) {
				GameScr.cp[var1] = var0.readInt();
			}

			GameScr.cq = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.cq.length; ++var1) {
				GameScr.cq[var1] = var0.readInt();
			}

			GameScr.cr = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.cr.length; ++var1) {
				GameScr.cr[var1] = var0.readInt();
			}

			GameScr.cs = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.cs.length; ++var1) {
				GameScr.cs[var1] = var0.readInt();
			}

			GameScr.ct = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.ct.length; ++var1) {
				GameScr.ct[var1] = var0.readInt();
			}

			GameScr.cu = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.cu.length; ++var1) {
				GameScr.cu[var1] = var0.readInt();
			}

			GameScr.cw = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.cw.length; ++var1) {
				GameScr.cw[var1] = var0.readInt();
			}

			GameScr.cv = new int[var0.readByte()];

			for (var1 = 0; var1 < GameScr.cv.length; ++var1) {
				GameScr.cv[var1] = var0.readInt();
			}

			Effect.effTemplates = new EffectTemplate[var0.readByte()];

			for (var1 = 0; var1 < Effect.effTemplates.length; ++var1) {
				Effect.effTemplates[var1] = new EffectTemplate();
				Effect.effTemplates[var1].id = var0.readByte();
				Effect.effTemplates[var1].type = var0.readByte();
				var0.readUTF();
				Effect.effTemplates[var1].iconId = var0.readShort();
			}
		} catch (IOException var3) {
			var3.printStackTrace();
		}

	}

	public static Image a(byte[] var0) {
		try {
			return Image.createImage(var0, 0, var0.length);
		} catch (Exception var2) {
			return null;
		}
	}

	private static void loadInfoMap(Message var0) {
		try {
			Auto.e();
			Auto.f();
			Auto.m = false;
			Char var1 = null;
			(var1 = Char.getMyChar()).cx = var1.cxSend = var0.reader().readShort();
			var1.cy = var1.cySend = var0.reader().readShort();
			byte var2 = var0.reader().readByte();

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				TileMap.vGo.addElement(new Waypoint(var0.reader().readShort(), var0.reader().readShort(), var0.reader().readShort(),
						var0.reader().readShort()));
			}

			Auto.e();
			var2 = var0.reader().readByte();

			byte var4;
			for (var4 = 0; var4 < var2; ++var4) {
				GameScr.a((Mob) (new Mob((short) var4, var0.reader().readBoolean(), var0.reader().readBoolean(),
						var0.reader().readBoolean(), var0.reader().readBoolean(), var0.reader().readBoolean(),
						var0.reader().readUnsignedByte(), var0.reader().readByte(), var0.reader().readInt(),
						var0.reader().readUnsignedByte(), var0.reader().readInt(), var0.reader().readShort(), var0.reader().readShort(),
						var0.reader().readByte(), var0.reader().readByte(), var0.reader().readBoolean(), false)), (int) var4);
			}

			var2 = var0.reader().readByte();

			for (var4 = 0; var4 < var2; ++var4) {
				GameScr.vMob.addElement(new BuNhin(var0.reader().readUTF(), var0.reader().readShort(), var0.reader().readShort()));
			}

			var2 = var0.reader().readByte();

			for (var3 = 0; var3 < var2; ++var3) {
				GameScr.vSet.addElement(new Npc(var0.reader().readByte(), var0.reader().readShort(), var0.reader().readShort(),
						var0.reader().readByte()));
			}

			var2 = var0.reader().readByte();

			for (var3 = 0; var3 < var2; ++var3) {
				ItemMap var5 = new ItemMap(var0.reader().readShort(), var0.reader().readShort(), var0.reader().readShort(),
						var0.reader().readShort());
				boolean var6 = false;

				for (int var7 = 0; var7 < GameScr.vItemMap.size(); ++var7) {
					if (((ItemMap) GameScr.vItemMap.elementAt(var7)).g == var5.g) {
						var6 = true;
						break;
					}
				}

				if (!var6) {
					GameScr.vItemMap.addElement(var5);
				}
			}

			GameScr.a(false);

			try {
				TileMap.j = null;
				TileMap.mapName = TileMap.j = var0.reader().readUTF();
			} catch (Exception var8) {
			}

			try {
				TileMap.w.clear();
				var3 = var0.reader().readUnsignedByte();

				for (int var11 = 0; var11 < var3; ++var11) {
					int var13 = var0.reader().readUnsignedByte();
					String var14 = String.valueOf((short) (var0.reader().readUnsignedByte() * TileMap.a + var13));
					TileMap.w.put(var14, "location");
				}
			} catch (Exception var9) {
				var9.printStackTrace();
			}

			TileMap.a(TileMap.tileID);
			Char.getMyChar().cvx = 0;
			Char.getMyChar().statusMe = 4;
			GameScr.gI().p();
			byte var12 = TileMap.bgID;
			GameCanvas.j();
			Char.ischangingMap = false;
			Char.flag = false;
			GameCanvas.m();
			GameCanvas.l();
			if (!TileMap.ag || TileMap.af == TileMap.mapID) {
				GameScr.gI().switchToMe();
				InfoDlg.hide();
				InfoDlg.show(TileMap.mapName, mResources.ml + " " + TileMap.zoneID, 30);
				Party.refreshAll();
				GameCanvas.n();
			}

			Session_ME.f();
			GameCanvas.isLoading = false;
		} catch (Exception var10) {
		}

		TileMap.i();
	}

	private void messageNotMap(Message var1) {
		try {
			label1598: {
				int var2;
				int var3;
				short var4;
				int var5;
				int var6;
				Char var7;
				String var8;
				byte var9;
				byte[] var10;
				int var48;
				switch (var1.reader().readByte()) {
				case -126:
					var9 = var1.reader().readByte();
					LoginScr.c = false;
					SelectCharScr var11;
					(var11 = SelectCharScr.gI()).name = new String[3];
					var11.parthead = new int[3];
					var11.partleg = new int[3];
					var11.partbody = new int[3];
					var11.partWp = new int[3];
					var11.level = new int[3];
					var11.phai = new String[3];
					var11.gender = new byte[3];
					if (GameCanvas.isTouch) {
						var11.indexSelect = -1;
					} else {
						var11.indexSelect = 0;
					}

					GameScr.gI();
					GameScr.readPart();
					SmallImage.init();

					for (byte var43 = 0; var43 < var9; ++var43) {
						SelectCharScr.gI().gender[var43] = var1.reader().readByte();
						SelectCharScr.gI().name[var43] = var1.reader().readUTF();
						SelectCharScr.gI().phai[var43] = var1.reader().readUTF();
						SelectCharScr.gI().level[var43] = var1.reader().readUnsignedByte();
						SelectCharScr.gI().parthead[var43] = var1.reader().readShort();
						SelectCharScr.gI().partWp[var43] = var1.reader().readShort();
						SelectCharScr.gI().partbody[var43] = var1.reader().readShort();
						SelectCharScr.gI().partleg[var43] = var1.reader().readShort();
						if (SelectCharScr.gI().partWp[var43] == -1) {
							SelectCharScr.gI().partWp[var43] = 15;
						}

						if (SelectCharScr.gI().partbody[var43] == -1) {
							if (SelectCharScr.gI().gender[var43] == 0) {
								SelectCharScr.gI().partbody[var43] = 10;
							} else {
								SelectCharScr.gI().partbody[var43] = 1;
							}
						}

						if (SelectCharScr.gI().partleg[var43] == -1) {
							if (SelectCharScr.gI().gender[var43] == 0) {
								SelectCharScr.gI().partleg[var43] = 9;
							} else {
								SelectCharScr.gI().partleg[var43] = 0;
							}
						}
					}

					SelectCharScr.gI().switchToMe();
					GameCanvas.n();
					Session_ME.f();
					return;
				case -125:
				case -124:
				case -118:
				case -110:
				case -107:
				case -105:
				case -104:
				case -103:
				case -102:
				case -101:
				case -100:
				case -94:
				case -92:
				case -91:
				case -89:
				case -87:
				case -85:
				case -82:
				case -79:
				case -78:
				case -76:
				case -75:
				case -74:
				case -73:
				case -71:
				case -69:
				case -68:
				case -65:
				case -64:
				case -63:
				default:
					return;
				case -123:
					GameScr.dl = var1.reader().readByte();
					GameScr.dm = var1.reader().readByte();
					GameScr.dn = var1.reader().readByte();
					GameScr.doa = var1.reader().readByte();
					System.out.println("****** DATA VERSION: Server " + GameScr.dl + " Client " + GameScr.dh);
					System.out.println("****** MAP VERSION: Server " + GameScr.dm + " Client " + GameScr.di);
					System.out.println("****** SKILL VERSION: Server " + GameScr.dn + " Client " + GameScr.dj);
					System.out.println("****** ITEM VERSION: Server " + GameScr.doa + " Client " + GameScr.dk);
					if (GameScr.dl != GameScr.dh) {
						Service.gI().updateData();
					} else {
						try {
							d(new DataInputStream(new ByteArrayInputStream(mResources.b("data"))));
						} catch (Exception var38) {
							GameScr.dh = -1;
							Service.gI().updateData();
						}
					}

					if (GameScr.dm != GameScr.di) {
						Service.gI().updateMap();
					} else {
						try {
							c(new DataInputStream(new ByteArrayInputStream(mResources.b("map"))));
						} catch (Exception var37) {
							GameScr.di = -1;
							Service.gI().updateMap();
						}
					}

					if (GameScr.dn != GameScr.dj) {
						Service.gI().updateSkill();
					} else {
						try {
							b(new DataInputStream(new ByteArrayInputStream(mResources.b("skill"))));
						} catch (Exception var36) {
							GameScr.dj = -1;
							Service.gI().updateSkill();
						}
					}

					if (GameScr.doa != GameScr.dk) {
						Service.gI().updateItem();
					} else {
						try {
							a(new DataInputStream(new ByteArrayInputStream(mResources.b("item"))));
						} catch (Exception var35) {
							GameScr.dk = -1;
							Service.gI().updateItem();
						}
					}

					if (GameScr.dl == GameScr.dh && GameScr.dm == GameScr.di && GameScr.dn == GameScr.dj
							&& GameScr.doa == GameScr.dk) {
						GameScr.gI();
						GameScr.readEfect();
						GameScr.gI();
						GameScr.readArrow();
						GameScr.gI();
						GameScr.readSkill();
						Service.gI().clientOk();
					}

					return;
				case -122:
					System.out.println("GET UPDATE_DATA " + var1.reader().available() + " bytes");
					var1.reader().mark(100000);
					d(var1.reader());
					var1.reader().reset();
					var10 = new byte[var1.reader().available()];
					var1.reader().readFully(var10);
					mResources.a("data", var10);
					var10 = new byte[] { GameScr.dh };
					mResources.a("dataVersion", var10);
					if (GameScr.dl != GameScr.dh || GameScr.dm != GameScr.di || GameScr.dn != GameScr.dj
							|| GameScr.doa != GameScr.dk) {
						return;
					}

					GameScr.gI();
					GameScr.readEfect();
					GameScr.gI();
					GameScr.readArrow();
					GameScr.gI();
					GameScr.readSkill();
					Service.gI().clientOk();
					return;
				case -121:
					System.out.println("GET UPDATE_MAP " + var1.reader().available() + " bytes");
					var1.reader().mark(100000);
					c(var1.reader());
					var1.reader().reset();
					var10 = new byte[var1.reader().available()];
					var1.reader().readFully(var10);
					mResources.a("map", var10);
					var10 = new byte[] { GameScr.di };
					mResources.a("mapVersion", var10);
					if (GameScr.dl != GameScr.dh || GameScr.dm != GameScr.di || GameScr.dn != GameScr.dj
							|| GameScr.doa != GameScr.dk) {
						return;
					}

					GameScr.gI();
					GameScr.readEfect();
					GameScr.gI();
					GameScr.readArrow();
					GameScr.gI();
					GameScr.readSkill();
					Service.gI().clientOk();
					return;
				case -120:
					System.out.println("GET UPDATE_SKILL " + var1.reader().available() + " bytes");
					var1.reader().mark(100000);
					b(var1.reader());
					var1.reader().reset();
					var10 = new byte[var1.reader().available()];
					var1.reader().readFully(var10);
					if (Char.getMyChar().isHuman) {
						mResources.a("skill", var10);
					} else {
						mResources.a("skillnhanban", var10);
					}

					var10 = new byte[] { GameScr.dj };
					mResources.a("skillVersion", var10);
					if (GameScr.dl == GameScr.dh && GameScr.dm == GameScr.di && GameScr.dn == GameScr.dj
							&& GameScr.doa == GameScr.dk) {
						GameScr.gI();
						GameScr.readEfect();
						GameScr.gI();
						GameScr.readArrow();
						GameScr.gI();
						GameScr.readSkill();
						Service.gI().clientOk();
						return;
					}

					return;
				case -119:
					System.out.println("GET UPDATE_ITEM " + var1.reader().available() + " bytes");
					var1.reader().mark(100000);
					a(var1.reader());
					var1.reader().reset();
					var10 = new byte[var1.reader().available()];
					var1.reader().readFully(var10);
					mResources.a("item", var10);
					var10 = new byte[] { GameScr.dk };
					mResources.a("itemVersion", var10);
					if (GameScr.dl == GameScr.dh && GameScr.dm == GameScr.di && GameScr.dn == GameScr.dj
							&& GameScr.doa == GameScr.dk) {
						GameScr.gI();
						GameScr.readEfect();
						GameScr.gI();
						GameScr.readArrow();
						GameScr.gI();
						GameScr.readSkill();
						Service.gI().clientOk();
						return;
					}
				case -117:
					Char.getMyChar().cPk = var1.reader().readByte();
					Info.canMergeString(mResources.in + " " + Char.getMyChar().cPk, 15, mFont.tahoma_7_yellow);
					Char.getMyChar().callEffTask(21);
					return;
				case -116:
					Char.getMyChar().xu = var1.reader().readInt();
					Char.be.coin = var1.reader().readInt();
					return;
				case -115:
					var2 = var1.reader().readInt();
					byte[] var12 = NinjaUtil.readByteArray(var1);
					SmallImage.drawSmallImageNew(var2, var12);
					return;
				case -114:
					if (Char.be == null) {
						Char.be = new Clan();
					}

					Char.be.writeLog(var1.reader().readUTF());
					return;
				case -113:
					if (Char.be == null) {
						Char.be = new Clan();
					}

					Char.be.name = var1.reader().readUTF();
					Char.be.main_name = var1.reader().readUTF();
					var1.reader().readUTF();
					Char.be.use_card = var1.reader().readShort();
					Char.be.icon = var1.reader().readByte();
					Char.be.level = var1.reader().readByte();
					Char.be.exp = var1.reader().readInt();
					Char.be.expNext = var1.reader().readInt();
					Char.be.coin = var1.reader().readInt();
					Char.be.freeCoin = var1.reader().readInt();
					Char.be.coinUp = var1.reader().readInt();
					Char.be.assist_name = var1.reader().readUTF();
					Char.be.alert = var1.reader().readUTF();
					Char.be.openDun = var1.reader().readInt();
					Char.be.itemLevel = var1.reader().readByte();
					return;
				case -112:
					GameScr.vClan.removeAllElements();
					var4 = var1.reader().readShort();

					for (var3 = 0; var3 < var4; ++var3) {
						GameScr.vClan.addElement(new Member(var1.reader().readByte(), var1.reader().readByte(),
								var1.reader().readByte(), var1.reader().readUTF(), var1.reader().readInt(), var1.reader().readBoolean()));
					}

					try {
						var3 = 0;

						while (true) {
							if (var3 >= var4) {
								break label1598;
							}

							((Member) GameScr.vClan.elementAt(var3)).pointClanWeek = var1.reader().readInt();
							++var3;
						}
					} catch (Exception var39) {
						break label1598;
					}
				case -111:
					Char.be.items = new Item[30];
					var9 = var1.reader().readByte();

					for (var2 = 0; var2 < var9; ++var2) {
						Char.be.items[var2] = new Item();
						Char.be.items[var2].typeUI = 39;
						Char.be.items[var2].indexUI = var2;
						Char.be.items[var2].quantity = var1.reader().readShort();
						Char.be.items[var2].template = ItemTemplates.get(var1.reader().readShort());
					}

					GameScr.gI().ao();
					byte var13 = var1.reader().readByte();

					for (var3 = 0; var3 < var13; ++var3) {
						String var46 = var1.reader().readUTF();
						var4 = var1.reader().readShort();
						short var45 = var1.reader().readShort();
						var48 = var1.reader().readInt();
						var8 = "";
						MyVector var49 = new MyVector();
						var5 = -1;
						var6 = -1;
						byte var50 = var1.reader().readByte();
						if (var48 >= 0) {
							var8 = var1.reader().readUTF();
						} else {
							for (int var19 = 0; var19 < var50; ++var19) {
								String var20 = var1.reader().readUTF();
								var49.addElement(var20);
							}

							var5 = var1.reader().readInt();
							var6 = var1.reader().readInt();
						}

						byte var51 = var1.reader().readByte();
						GameScr.gI().a(new Clan_ThanThu(var46, var51, var4, var45, var48, var8, var49, var5, var6));
					}

					return;
				case -109:
					try {
						GameCanvas.isLoading = true;
						TileMap.f = null;
						TileMap.g = null;
						System.gc();
						TileMap.a(TileMap.mapID, var1.reader());
						TileMap.loadMapFromResource();
						loadInfoMap(this.messWait);
					} catch (Exception var34) {
						var34.printStackTrace();
					}

					var1.close();
					this.messWait.close();
					var1 = this.messWait = null;
					return;
				case -108:
					var4 = var1.reader().readShort();

					try {
						var3 = var1.reader().readByte();
						Mob.arrMobTemplate[var4].typeFly = (byte) var3;
					} catch (Exception var33) {
					}

					var3 = var1.reader().readByte();
					Mob.arrMobTemplate[var4].imgs = new Image[var3];
					if (var4 != 98 && var4 != 99) {
						for (var3 = 0; var3 < Mob.arrMobTemplate[var4].imgs.length; ++var3) {
							Mob.arrMobTemplate[var4].imgs[var3] = a(NinjaUtil.readByteArray(var1));
						}

						if (var4 == 219) {
							GameScr.gI().a(Mob.arrMobTemplate[var4].imgs[0]);
						}
					} else {
						Mob.arrMobTemplate[var4].imgs = new Image[3];
						Image var14 = a(NinjaUtil.readByteArray(var1));

						for (var2 = 0; var2 < Mob.arrMobTemplate[var4].imgs.length; ++var2) {
							Mob.arrMobTemplate[var4].imgs[var2] = var14;
						}
					}

					int var44;
					if (var1.reader().readBoolean()) {
						var9 = var1.reader().readByte();
						Mob.arrMobTemplate[var4].frameBossMove = new byte[var9];

						for (var2 = 0; var2 < var9; ++var2) {
							Mob.arrMobTemplate[var4].frameBossMove[var2] = var1.reader().readByte();
						}

						var9 = var1.reader().readByte();
						Mob.arrMobTemplate[var4].frameBossAttack = new byte[var9][];

						for (var2 = 0; var2 < var9; ++var2) {
							Mob.arrMobTemplate[var4].frameBossAttack[var2] = new byte[var1.reader().readByte()];

							for (var44 = 0; var44 < Mob.arrMobTemplate[var4].frameBossAttack[var2].length; ++var44) {
								Mob.arrMobTemplate[var4].frameBossAttack[var2][var44] = var1.reader().readByte();
							}
						}
					}

					if (var1.reader().readInt() <= 0) {
						return;
					}

					Mob.arrMobTemplate[var4].imginfo = new ImageInfo[var1.reader().readByte()];

					for (var44 = 0; var44 < Mob.arrMobTemplate[var4].imginfo.length; ++var44) {
						Mob.arrMobTemplate[var4].imginfo[var44] = new ImageInfo();
						var1.reader().readByte();
						Mob.arrMobTemplate[var4].imginfo[var44].a = var1.reader().readUnsignedByte();
						Mob.arrMobTemplate[var4].imginfo[var44].b = var1.reader().readUnsignedByte();
						Mob.arrMobTemplate[var4].imginfo[var44].c = var1.reader().readUnsignedByte();
						Mob.arrMobTemplate[var4].imginfo[var44].d = var1.reader().readUnsignedByte();
					}

					Mob.arrMobTemplate[var4].frameBoss = new Frame[var1.reader().readShort()];

					for (var44 = 0; var44 < Mob.arrMobTemplate[var4].frameBoss.length; ++var44) {
						Mob.arrMobTemplate[var4].frameBoss[var44] = new Frame();
						var9 = var1.reader().readByte();
						Mob.arrMobTemplate[var4].frameBoss[var44].a = new short[var9];
						Mob.arrMobTemplate[var4].frameBoss[var44].b = new short[var9];
						Mob.arrMobTemplate[var4].frameBoss[var44].c = new byte[var9];

						for (var2 = 0; var2 < var9; ++var2) {
							Mob.arrMobTemplate[var4].frameBoss[var44].a[var2] = var1.reader().readShort();
							Mob.arrMobTemplate[var4].frameBoss[var44].b[var2] = var1.reader().readShort();
							Mob.arrMobTemplate[var4].frameBoss[var44].c[var2] = var1.reader().readByte();
						}
					}

					var4 = var1.reader().readShort();

					for (var3 = 0; var3 < var4; ++var3) {
						var1.reader().readShort();
					}

					return;
				case -106:
					GameScr.dz = var1.reader().readByte();
					return;
				case -99:
					GameCanvas.input2Dlg.a(mResources.ax, mResources.ay);
					var8 = var1.reader().readUTF();
					GameCanvas.input2Dlg.a(var8, new Command1(mResources.aq, GameCanvas.instance, 8882, (Object) null),
							new Command1(mResources.bc, GameCanvas.instance, 88816, (Object) null), 0, 1);
					return;
				case -98:
					Char.getMyChar();
					Char.clearTask();
					return;
				case -97:
					GameCanvas.isLoading = false;
					GameCanvas.n();
					Integer var15 = new Integer(var1.reader().readInt());
					GameCanvas.inputDlg.a(mResources.ei, new Command1(mResources.ch, GameCanvas.instance, 88829, var15), 0);
					return;
				case -96:
					Char.getMyChar().cClanName = var1.reader().readUTF();
					Char.getMyChar().ctypeClan = 4;
					Char.getMyChar().luong = var1.reader().readInt();
					Char.getMyChar().callEffTask(21);
					return;
				case -95:
					if (Char.be != null) {
						Char.be.alert = var1.reader().readUTF();
					}

					return;
				case -93:
					if ((var2 = var1.reader().readInt()) == Char.getMyChar().charID) {
						GameScr.vClan.removeAllElements();
						Char.getMyChar().cClanName = "";
						Char.getMyChar().ctypeClan = -1;
						Char.be = null;
					} else {
						GameScr.vClan.removeAllElements();
						Char var47;
						(var47 = GameScr.e(var2)).cClanName = "";
						var47.ctypeClan = -1;
					}

					return;
				case -90:
					Char.getMyChar().xu = var1.reader().readInt();
					GameScr.gI().resetButton();
					return;
				case -88:
					GameScr.gI().resetButton();
					Item var16;
					(var16 = Char.getMyChar().arrItemBag[var1.reader().readByte()]).clearExpire();
					var16.isLock = true;
					var16.upgrade = var1.reader().readByte();
					(var16 = Char.getMyChar().arrItemBag[var1.reader().readByte()]).clearExpire();
					var16.isLock = true;
					var16.upgrade = var1.reader().readByte();
					Info.canMergeString(mResources.mj, 20, mFont.tahoma_7b_yellow);
					return;
				case -86:
					GameCanvas.n();
					GameScr.gI().resetButton();
					InfoMe.addInfo(var1.reader().readUTF(), 20, mFont.tahoma_7_yellow);
					return;
				case -84:
					Char.et = var1.reader().readShort();
					return;
				case -83:
					var48 = var1.reader().readShort();
					var4 = var1.reader().readShort();
					var5 = var1.reader().readByte();
					var6 = var1.reader().readShort();
					if (var48 == 0) {
						GameScr.gI().a(mResources.ee, "          " + mResources.nx, false);
						return;
					}

					var8 = mResources.ds + ": " + var48 + "\n\n";
					if (var4 == 0) {
						var8 = var8 + mResources.dw + "\n\n";
					} else {
						var8 = var8 + mResources.dx + ": " + NinjaUtil.getTime(var4) + "\n\n";
					}

					var8 = var8 + mResources.dy + ": " + var5 + "\n\n";
					var8 = var8 + mResources.eq + ": " + var6 + " " + mResources.er + "\n\n";
					GameScr.gI().a(mResources.ee, var8, false);
					if (var6 <= 0) {
						return;
					}

					GameScr.gI().left = new Command1(mResources.eq, 1000);
					return;
				case -81:
					Char.pointChienTruong = var1.reader().readShort();
					return;
				case -80:
					GameScr.gI().a(mResources.ed, var1.reader().readUTF(), false);
					if (var1.reader().readBoolean()) {
						GameScr.gI().left = new Command1(mResources.eq, 2000);
						Class_cl.x();
					}

					return;
				case -77:
					TileMap.bgID = var1.reader().readByte();
					GameCanvas.j();
					return;
				case -72:
					GameScr.gI().ee = new String[9];
					GameScr.bw = new short[9];
					if (GameScr.indexSelect < 0 || GameScr.indexSelect > 8) {
						GameScr.an = 0;
						GameScr.indexSelect = 0;
					}
					break;
				case -70:
					var8 = var1.reader().readUTF();
					GameCanvas.a(NinjaUtil.replace(mResources.rf, "#", var8),
							new Command1(mResources.br, GameCanvas.instance, 88842, (Object) null),
							new Command1(mResources.ce, GameCanvas.instance, 8882, (Object) null));
					return;
				case -67:
					Mob var18 = null;

					try {
						var18 = Mob.a(var1.reader().readUnsignedByte());
					} catch (Exception var32) {
					}

					if (var18 == null) {
						return;
					}

					if ((var2 = var1.reader().readInt()) == Char.getMyChar().charID) {
						GameScr.vMobSoul.addElement(new MobSoul(var18.x, var18.y, Char.getMyChar()));
					} else if ((var7 = GameScr.e(var2)) != null) {
						GameScr.vMobSoul.addElement(new MobSoul(var18.x, var18.y, var7));
						return;
					}

					return;
				case -66:
					var2 = var1.reader().readInt();
					if (Char.getMyChar().charID == var2) {
						GameScr.vMobSoul.addElement(new MobSoul(Char.getMyChar().cx, Char.getMyChar().cy));
						return;
					}

					if ((var7 = GameScr.e(var2)) == null) {
						return;
					}

					GameScr.vMobSoul.addElement(new MobSoul(var7.cx, var7.cy));
					return;
				case -62:
					Char.be.itemLevel = var1.reader().readByte();
					return;
				}

				for (var2 = 0; var2 < 9; ++var2) {
					GameScr.bw[var2] = var1.reader().readShort();
					GameScr.gI().ee[var2] = GameScr.gI().eb[NinjaUtil.randomNumber(9)];
				}

				GameScr.gI().left = new Command1(mResources.bh, (IActionListener) null, 1506, (Object) null);
				GameScr.gI().ea = System.currentTimeMillis();
				--GameScr.gI().bx;
				GameCanvas.n();
				return;
			}

			GameScr.gI();
			GameScr.y();
		} catch (Exception var40) {
		} finally {
			if (var1 != null) {
				var1.close();
			}

		}
	}

	private static void messageNotLogin(Message var0) {
		try {
			byte var1 = var0.reader().readByte();
			System.out.println("subcmd Notlogin: " + var1);
			switch (var1) {
			case -124:
				System.out.println("SEND SMS");
				String var2 = var0.reader().readUTF();
				SmsData.a(var0.reader().readUTF(), "sms://" + var2, new Command1("", GameCanvas.c(), 88825, (Object) null),
						new Command1("", GameCanvas.c(), 88826, (Object) null));
				break;
			case 2:
				mResources.a();
			}
		} catch (Exception var6) {
		} finally {
			if (var0 != null) {
				var0.close();
			}

		}

	}

	private static void messageSubCommand(Message var0) {
		try {
			try {
				int var1;
				Skill var2;
				short var3;
				int var4;
				GameScr var5;
				int var6;
				byte var7;
				Char var8;
				Integer var9;
				byte var10;
				short var11;
				Effect var12;
				short var13;
				EffectTemplate var14;
				String var15;
				Service var16;
				Effect var17;
				Char var18;
				switch (var0.reader().readByte()) {
				case -128:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					var8.clevel = var0.reader().readUnsignedByte();
					return;
				case -127:
					GameScr.vCharInMap.removeAllElements();
					GameScr.vItemMap.removeAllElements();
					GameScr.ad();
					GameScr.currentCharViewInfo = Char.getMyChar();
					Char.getMyChar().charID = var0.reader().readInt();
					Char.getMyChar().cClanName = var0.reader().readUTF();
					if (!Char.getMyChar().cClanName.equals("")) {
						Char.getMyChar().ctypeClan = var0.reader().readByte();
					}

					Char.getMyChar().ctaskId = var0.reader().readByte();
					Char.getMyChar().cgender = var0.reader().readByte();
					Char.getMyChar().head = var0.reader().readShort();
					Char.getMyChar().cspeed = var0.reader().readByte();
					Char.getMyChar().cName = a(var0.reader().readUTF());
					Char.getMyChar().cPk = var0.reader().readByte();
					Char.getMyChar().cTypePk = var0.reader().readByte();
					Char.getMyChar().cMaxHp = var0.reader().readInt();
					Char.getMyChar().cHp = var0.reader().readInt();
					Char.getMyChar().cMaxMP = var0.reader().readInt();
					Char.getMyChar().cMP = var0.reader().readInt();
					Char.getMyChar().cEXP = var0.reader().readLong();
					Char.getMyChar().cExpDown = var0.reader().readLong();
					GameScr.getLevelExp(Char.getMyChar().cEXP);
					Char.getMyChar().eff5BuffHp = var0.reader().readShort();
					Char.getMyChar().eff5BuffMp = var0.reader().readShort();
					Char.getMyChar().nClass = GameScr.nClasss[var0.reader().readByte()];
					Char.getMyChar().pPoint = var0.reader().readShort();
					Char.getMyChar().potential[0] = var0.reader().readShort();
					Char.getMyChar().potential[1] = var0.reader().readShort();
					Char.getMyChar().potential[2] = var0.reader().readInt();
					Char.getMyChar().potential[3] = var0.reader().readInt();
					Char.getMyChar().sPoint = var0.reader().readShort();
					Char.getMyChar().vSkill.removeAllElements();
					Char.getMyChar().vSkillFight.removeAllElements();
					var13 = (short) var0.reader().readByte();

					for (var10 = 0; var10 < var13; ++var10) {
						var2 = Skills.get(var0.reader().readShort());
						if (Char.getMyChar().myskill == null) {
							Char.getMyChar().myskill = var2;
						}

						if (NSOT_MOB.b != null && Auto.g != null && var2.template.id == Auto.g.template.id) {
							Auto.g = var2;
						}

						Char.getMyChar().vSkill.addElement(var2);
						if ((var2.template.type == 1 || var2.template.type == 4 || var2.template.type == 2 || var2.template.type == 3)
								&& (var2.template.maxPoint == 0 || var2.template.maxPoint > 0 && var2.point > 0)) {
							if (var2.template.id == 0) {
								Service.gI().selectSkill(0);
							}

							Char.getMyChar().vSkillFight.addElement(var2);
						}
					}

					GameScr.gI();
					GameScr.z();
					Char.getMyChar().xu = var0.reader().readInt();
					Char.getMyChar().yen = var0.reader().readInt();
					Char.getMyChar().luong = var0.reader().readInt();
					Char.getMyChar().arrItemBag = new Item[var0.reader().readUnsignedByte()];
					GameScr.q = 0;
					GameScr.r = 0;

					for (var4 = 0; var4 < Char.getMyChar().arrItemBag.length; ++var4) {
						if ((var13 = var0.reader().readShort()) != -1) {
							Char.getMyChar().arrItemBag[var4] = new Item();
							Char.getMyChar().arrItemBag[var4].typeUI = 3;
							Char.getMyChar().arrItemBag[var4].indexUI = var4;
							Char.getMyChar().arrItemBag[var4].template = ItemTemplates.get(var13);
							Char.getMyChar().arrItemBag[var4].isLock = var0.reader().readBoolean();
							if (Char.getMyChar().arrItemBag[var4].isTypeBody() || Char.getMyChar().arrItemBag[var4].isTypeMounts() || Char.getMyChar().arrItemBag[var4].isTypeNgocKham()) {
								Char.getMyChar().arrItemBag[var4].upgrade = var0.reader().readByte();
							}

							Char.getMyChar().arrItemBag[var4].isExpires = var0.reader().readBoolean();
							Char.getMyChar().arrItemBag[var4].quantity = var0.reader().readUnsignedShort();
							if (Char.getMyChar().arrItemBag[var4].template.type == 16) {
								GameScr.r += Char.getMyChar().arrItemBag[var4].quantity;
							}

							if (Char.getMyChar().arrItemBag[var4].template.type == 17) {
								GameScr.q += Char.getMyChar().arrItemBag[var4].quantity;
							}

							if (Char.getMyChar().arrItemBag[var4].template.id == 340) {
								var5 = GameScr.gI();
								var5.bx += Char.getMyChar().arrItemBag[var4].quantity;
							}
						}
					}

					NSOT_MOB.l();
					Char.getMyChar().arrItemBody = new Item[32];

					try {
						Char.getMyChar().n();

						for (var4 = 0; var4 < 16; ++var4) {
							if ((var13 = var0.reader().readShort()) != -1) {
								ItemTemplate var19;
								byte var55 = (var19 = ItemTemplates.get(var13)).type;
								Char.getMyChar().arrItemBody[var55] = new Item();
								Char.getMyChar().arrItemBody[var55].indexUI = var55;
								Char.getMyChar().arrItemBody[var55].typeUI = 5;
								Char.getMyChar().arrItemBody[var55].template = var19;
								Char.getMyChar().arrItemBody[var55].isLock = true;
								Char.getMyChar().arrItemBody[var55].upgrade = var0.reader().readByte();
								Char.getMyChar().arrItemBody[var55].sys = var0.reader().readByte();
								if (var55 == 1) {
									Char.getMyChar().wp = Char.getMyChar().arrItemBody[var55].template.part;
								} else if (var55 == 2) {
									Char.getMyChar().body = Char.getMyChar().arrItemBody[var55].template.part;
								} else if (var55 == 6) {
									Char.getMyChar().leg = Char.getMyChar().arrItemBody[var55].template.part;
								}
							}
						}
					} catch (Exception var46) {
						var46.printStackTrace();
					}

					Char.getMyChar().isHuman = var0.reader().readBoolean();
					Char.getMyChar().isNhanban = var0.reader().readBoolean();
					short[] var53;
					if ((var53 = new short[] { var0.reader().readShort(), var0.reader().readShort(), var0.reader().readShort(),
							var0.reader().readShort() })[0] >= 0) {
						Char.getMyChar().head = var53[0];
					}

					if (var53[1] >= 0) {
						Char.getMyChar().wp = var53[1];
					}

					if (var53[2] >= 0) {
						Char.getMyChar().body = var53[2];
					}

					if (var53[3] >= 0) {
						Char.getMyChar().leg = var53[3];
					}
					short[] arr_short_new = new short[10];

					try {
						for (int index = 0; index < arr_short_new.length; index++) {
							arr_short_new[index] = var0.reader().readShort();
						}
					} catch (Exception var29) {
						arr_short_new = null;
					}

					if (arr_short_new != null) {
						// Char.i().add_new_short(arr_short_new);
					}
					try {

						for (var4 = 0; var4 < 16; ++var4) {
							if ((var13 = var0.reader().readShort()) != -1) {
								ItemTemplate var19;
								byte var55 = (byte) ((var19 = ItemTemplates.get(var13)).type + 16);
								Char.getMyChar().arrItemBody[var55] = new Item();
								Char.getMyChar().arrItemBody[var55].indexUI = var55;
								Char.getMyChar().arrItemBody[var55].typeUI = 5;
								Char.getMyChar().arrItemBody[var55].template = var19;
								Char.getMyChar().arrItemBody[var55].isLock = true;
								Char.getMyChar().arrItemBody[var55].upgrade = var0.reader().readByte();
								Char.getMyChar().arrItemBody[var55].sys = var0.reader().readByte();
								if (var55 == 1) {
									Char.getMyChar().wp = Char.getMyChar().arrItemBody[var55].template.part;
								} else if (var55 == 2) {
									Char.getMyChar().body = Char.getMyChar().arrItemBody[var55].template.part;
								} else if (var55 == 6) {
									Char.getMyChar().leg = Char.getMyChar().arrItemBody[var55].template.part;
								}
							}
						}
					} catch (Exception var46) {
						var46.printStackTrace();
					}
					short var_short;
					try {
						var_short = var0.reader().readShort();
					} catch (Exception var26) {
						var_short = -1;
					}
					if (Char.getMyChar().isHuman) {
						GameScr.gI();
						GameScr.loadSkillShortcut();
					} else if (Char.getMyChar().isNhanban) {
						GameScr.gI();
						GameScr.loadSkillShortcutNhanban();
					}

					Char.getMyChar().statusMe = 4;
					GameScr.cb = mResources.d(Char.getMyChar().cName + "vci") > 0;
					return;
				case -126:
					Char.getMyChar().a(var0);
					Char.getMyChar().potential[0] = var0.reader().readShort();
					Char.getMyChar().potential[1] = var0.reader().readShort();
					Char.getMyChar().potential[2] = var0.reader().readInt();
					Char.getMyChar().potential[3] = var0.reader().readInt();
					Char.getMyChar().callEffTask(61);
					Char.getMyChar().nClass = GameScr.nClasss[var0.reader().readByte()];
					Char.getMyChar().sPoint = var0.reader().readShort();
					Char.getMyChar().pPoint = var0.reader().readShort();
					Char.getMyChar().vSkill.removeAllElements();
					Char.getMyChar().vSkillFight.removeAllElements();
					Char.getMyChar().myskill = null;
					return;
				case -125:
					Char.getMyChar().a(var0);
					if (Char.getMyChar().statusMe != 14 && Char.getMyChar().statusMe != 5) {
						Char.getMyChar().cHp = Char.getMyChar().cMaxHp;
						Char.getMyChar().cMP = Char.getMyChar().cMaxMP;
					}

					try {
						Char.getMyChar().sPoint = var0.reader().readShort();
						Char.getMyChar().vSkill.removeAllElements();
						Char.getMyChar().vSkillFight.removeAllElements();
						var13 = (short) var0.reader().readByte();

						for (var7 = 0; var7 < var13; ++var7) {
							Skill var54 = Skills.get(var0.reader().readShort());
							if (Char.getMyChar().myskill == null) {
								Char.getMyChar().myskill = var54;
							} else if (var54.template.equals(Char.getMyChar().myskill.template)) {
								Char.getMyChar().myskill = var54;
							}

							if (NSOT_MOB.b != null && Auto.g != null && var54.template.id == Auto.g.template.id) {
								Auto.g = var54;
							}

							Char.getMyChar().vSkill.addElement(var54);
							if ((var54.template.type == 1 || var54.template.type == 4 || var54.template.type == 2 || var54.template.type == 3)
									&& (var54.template.maxPoint == 0 || var54.template.maxPoint > 0 && var54.point > 0)) {
								Char.getMyChar();
								if (var54.template.id == 0) {
									var16 = Service.gI();
									Char.getMyChar();
									var16.selectSkill(0);
								}

								Char.getMyChar().vSkillFight.addElement(var54);
							}
						}

						GameScr.z();
						if (GameScr.isPaintInfoMe) {
							GameScr.indexRow = -1;
							GameScr.gI().aj();
						}

						System.out.println("LOAD XONG ME LOAD SKILL " + Char.getMyChar().vSkill.size());
					} catch (Exception var48) {
						var48.printStackTrace();
					}

					Class_cl.u();
					return;
				case -124:
					Char.getMyChar().a(var0);
					Char.getMyChar().cEXP = var0.reader().readLong();
					GameScr.getLevelExp(Char.getMyChar().cEXP);
					Char.getMyChar().sPoint = var0.reader().readShort();
					Char.getMyChar().pPoint = var0.reader().readShort();
					Char.getMyChar().potential[0] = var0.reader().readShort();
					Char.getMyChar().potential[1] = var0.reader().readShort();
					Char.getMyChar().potential[2] = var0.reader().readInt();
					Char.getMyChar().potential[3] = var0.reader().readInt();
					return;
				case -123:
					Char.getMyChar().xu = var0.reader().readInt();
					Char.getMyChar().yen = var0.reader().readInt();
					Char.getMyChar().luong = var0.reader().readInt();
					Char.getMyChar().cHp = var0.reader().readInt();
					Char.getMyChar().cMP = var0.reader().readInt();
					if (var0.reader().readByte() == 1) {
						GameScr.gI().an();
						Char.getMyChar().isCaptcha = true;
					} else {
						Char.getMyChar().isCaptcha = false;
						Class_cl.k();
					}

					return;
				case -122:
					Char.getMyChar().cHp = var0.reader().readInt();
					return;
				case -121:
					Char.getMyChar().cMP = var0.reader().readInt();
					return;
				case -120:
					System.out.println("PLAYER LOAD ALL");
					if ((var8 = GameScr.e(var0.reader().readInt())) != null) {
						readCharInfo(var8, var0);
					}

					return;
				case -119:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					return;
				case -118:
				case -115:
				case -114:
				case -108:
				case -103:
				case -93:
				case -88:
				case -79:
				case -70:
				case -67:
				case -66:
				case -60:
				case -53:
				case -52:
				case -51:
				case -50:
				case -49:
				case -48:
				case -47:
				case -46:
				case -45:
				case -44:
				case -43:
				case -42:
				case -41:
				case -40:
				case -39:
				case -38:
				case -37:
				case -36:
				case -35:
				case -34:
				case -33:
				case -32:
				case -31:
				case -30:
				case -29:
				case -28:
				case -27:
				case -26:
				case -25:
				case -24:
				case -23:
				case -22:
				case -21:
				case -20:
				case -19:
				case -18:
				case -17:
				case -16:
				case -15:
				case -14:
				case -13:
				case -12:
				case -11:
				case -10:
				case -9:
				case -8:
				case -7:
				case -6:
				case -5:
				case -4:
				case -3:
				case -2:
				case -1:
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
				case 30:
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				case 37:
				case 38:
				case 39:
				case 40:
				case 41:
				case 42:
				case 43:
				case 44:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 64:
				case 65:
				case 66:
				case 67:
				case 68:
				case 69:
				case 70:
				case 71:
				case 72:
				case 73:
				case 74:
				case 75:
				case 76:
				case 77:
				case 78:
				case 79:
				case 80:
				case 81:
				case 82:
				case 83:
				case 84:
				case 85:
				case 86:
				case 87:
				case 88:
				case 89:
				case 90:
				case 91:
				case 92:
				case 93:
				case 94:
				case 95:
				case 96:
				case 97:
				case 98:
				case 99:
				case 100:
				case 101:
				case 102:
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
				case 108:
				case 109:
				case 110:
				case 111:
				case 112:
				case 113:
				case 114:
				default:
					return;
				case -117:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					var8.eff5BuffHp = var0.reader().readShort();
					var8.eff5BuffMp = var0.reader().readShort();
					var8.wp = var0.reader().readShort();
					if (var8.wp == -1) {
						var8.o();
					}

					return;
				case -116:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					var8.eff5BuffHp = var0.reader().readShort();
					var8.eff5BuffMp = var0.reader().readShort();
					var8.body = var0.reader().readShort();
					if (var8.body == -1) {
						var8.p();
					}

					return;
				case -113:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					var8.eff5BuffHp = var0.reader().readShort();
					var8.eff5BuffMp = var0.reader().readShort();
					var8.leg = var0.reader().readShort();
					if (var8.leg == -1) {
						var8.q();
					}

					return;
				case -112:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					var8.eff5BuffHp = var0.reader().readShort();
					var8.eff5BuffMp = var0.reader().readShort();
					return;
				case -111:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					return;
				case -110:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					var8.cx = var8.ez = var0.reader().readShort();
					var8.cy = var8.fa = var0.reader().readShort();
					var8.statusMe = 1;
					ServerEffect.addServerEffect(20, var8, 2);
					return;
				case -109:
					Char.getMyChar().a(var0);
					if (Char.getMyChar().statusMe != 14 && Char.getMyChar().statusMe != 5) {
						Char.getMyChar().cHp = Char.getMyChar().cMaxHp;
						Char.getMyChar().cMP = Char.getMyChar().cMaxMP;
					}

					Char.getMyChar().pPoint = var0.reader().readShort();
					Char.getMyChar().potential[0] = var0.reader().readShort();
					Char.getMyChar().potential[1] = var0.reader().readShort();
					Char.getMyChar().potential[2] = var0.reader().readInt();
					Char.getMyChar().potential[3] = var0.reader().readInt();
					Class_cl.w();
					return;
				case -107:
					Char.getMyChar().j();
					return;
				case -106:
					Char.getMyChar().k();
					return;
				case -105:
					var6 = var0.reader().readInt();
					var18 = Char.getMyChar();
					var18.xu -= var6;
					var18 = Char.getMyChar();
					var18.xuInBox += var6;
					return;
				case -104:
					var1 = var0.reader().readInt();
					var18 = Char.getMyChar();
					var18.xuInBox -= var1;
					var18 = Char.getMyChar();
					var18.xu += var1;
					return;
				case -102:
					Char.getMyChar().arrItemBag[var0.reader().readByte()] = null;
					var2 = Skills.get(var0.reader().readShort());
					Char.getMyChar().vSkill.addElement(var2);
					if ((var2.template.type == 1 || var2.template.type == 4 || var2.template.type == 2 || var2.template.type == 3)
							&& (var2.template.maxPoint == 0 || var2.template.maxPoint > 0 && var2.point > 0)) {
						Char.getMyChar();
						if (var2.template.id == 0) {
							var16 = Service.gI();
							Char.getMyChar();
							var16.selectSkill(0);
						}

						Char.getMyChar().vSkillFight.addElement(var2);
					}

					GameScr.gI();
					GameScr.z();
					GameScr.gI();
					GameScr.addSkillShortcut(var2);
					GameScr.gI().aj();
					InfoMe.addInfo(mResources.po + " " + var2.template.name);
					return;
				case -101:
					var17 = new Effect(var0.reader().readByte(),
							(int) (System.currentTimeMillis() / 1000L) - var0.reader().readInt(), var0.reader().readInt(),
							var0.reader().readShort());
					Char.getMyChar().vEff.addElement(var17);
					if (var17.template.type == 7) {
						var18 = Char.getMyChar();
						var18.cMiss += var17.param;
						return;
					}

					if (var17.template.type != 12 && var17.template.type != 11) {
						if (var17.template.type == 14) {
							GameCanvas.l();
							GameCanvas.m();
							Char.getMyChar().cx = var0.reader().readShort();
							Char.getMyChar().cy = var0.reader().readShort();
							Char.getMyChar().statusMe = 1;
							Char.getMyChar().isLockKey = true;
							ServerEffect.addServerEffectWithTime(76, Char.getMyChar(), var17.timeLenght);
							return;
						}

						if (var17.template.type == 1) {
							ServerEffect.addServerEffectWithTime(48, Char.getMyChar(), var17.timeLenght);
							return;
						}

						if (var17.template.type == 2) {
							GameCanvas.l();
							GameCanvas.m();
							Char.getMyChar().cx = var0.reader().readShort();
							Char.getMyChar().cy = var0.reader().readShort();
							Char.getMyChar().statusMe = 1;
							Char.getMyChar().isLockKey = true;
							Char.getMyChar().isLockMove = true;
							return;
						}

						if (var17.template.type != 3) {
							return;
						}

						GameCanvas.l();
						GameCanvas.m();
						Char.getMyChar().cx = var0.reader().readShort();
						Char.getMyChar().cy = var0.reader().readShort();
						Char.getMyChar().statusMe = 1;
						Char.ischangingMap = true;
						ServerEffect.addServerEffectWithTime(43, Char.getMyChar(), var17.timeLenght);
						return;
					}

					Char.getMyChar().isInvisible = true;
					ServerEffect.addServerEffect(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
					return;
				case -100:
					var14 = Effect.effTemplates[var0.reader().readByte()];

					for (var1 = 0; var1 < Char.getMyChar().vEff.size(); ++var1) {
						if ((var12 = (Effect) Char.getMyChar().vEff.elementAt(var1)).template.type == var14.type) {
							if (var12.template.type == 7) {
								var18 = Char.getMyChar();
								var18.cMiss -= var12.param;
							}

							var12.template = var14;
							var12.timeStart = (int) (System.currentTimeMillis() / 1000L) - var0.reader().readInt();
							var12.timeLenght = var0.reader().readInt() / 1000;
							var12.param = var0.reader().readShort();
							if (var12.template.type == 7) {
								var18 = Char.getMyChar();
								var18.cMiss += var12.param;
							}
							break;
						}
					}

					if (!GameScr.isPaintInfoMe) {
						GameScr.gI().resetButton();
					}

					return;
				case -99:
					var10 = var0.reader().readByte();
					var12 = null;

					for (var1 = 0; var1 < Char.getMyChar().vEff.size(); ++var1) {
						if ((var12 = (Effect) Char.getMyChar().vEff.elementAt(var1)).template.id == var10) {
							if (var12.template.type == 7) {
								var18 = Char.getMyChar();
								var18.cMiss -= var12.param;
							}

							Char.getMyChar().vEff.removeElementAt(var1);
							break;
						}
					}

					if (var12.template.type != 0 && var12.template.type != 12) {
						if (var12.template.type != 4 && var12.template.type != 13 && var12.template.type != 17) {
							if (var12.template.type == 23) {
								Char.getMyChar().cHp = var0.reader().readInt();
								Char.getMyChar().cMaxHp = var0.reader().readInt();
								return;
							}

							if (var12.template.type == 11) {
								Char.getMyChar().isInvisible = false;
								ServerEffect.addServerEffect(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
								return;
							}

							if (var12.template.type == 14) {
								Char.getMyChar().isLockKey = false;
								return;
							}

							if (var12.template.type == 2) {
								Char.getMyChar().isLockKey = false;
								Char.getMyChar().isLockMove = false;
								ServerEffect.addServerEffect(77, Char.getMyChar().cx, Char.getMyChar().cy - 9, 1);
								return;
							}

							if (var12.template.type != 3) {
								return;
							}

							Char.ischangingMap = false;
							return;
						}

						Char.getMyChar().cHp = var0.reader().readInt();
						return;
					}

					Char.getMyChar().cHp = var0.reader().readInt();
					Char.getMyChar().cMP = var0.reader().readInt();
					if (var12.template.type == 0) {
						// tự sát khi hết thức ăn
						if (var12.template.id != 36 && NSOT_MOB.b != null || var12.template.id != 42 && NSOT_MOB.b != null) {
							NSOT_MOB.o();
						}
						InfoMe.addInfo(mResources.ng);
						return;
					}

					if (var12.template.type != 12) {
						return;
					}

					Char.getMyChar().isInvisible = false;
					ServerEffect.addServerEffect(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
					return;
				case -98:
					try {
						if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
							return;
						}

						var17 = new Effect(var0.reader().readByte(),
								(int) (System.currentTimeMillis() / 1000L) - var0.reader().readInt(), var0.reader().readInt(),
								var0.reader().readShort());
						var8.vEff.addElement(var17);
						if (var17.template.type != 12 && var17.template.type != 11) {
							if (var17.template.type == 14) {
								var8.cx = var8.ez = var0.reader().readShort();
								var8.cy = var8.fa = var0.reader().readShort();
								var8.statusMe = 1;
								ServerEffect.addServerEffectWithTime(76, var8, var17.timeLenght);
								return;
							}

							if (var17.template.type != 1) {
								if (var17.template.type == 2) {
									var8.cx = var8.ez = var0.reader().readShort();
									var8.cy = var8.fa = var0.reader().readShort();
									var8.statusMe = 1;
									var8.isLockMove = true;
									return;
								}

								if (var17.template.type != 3) {
									return;
								}

								var8.cx = var8.ez = var0.reader().readShort();
								var8.cy = var8.fa = var0.reader().readShort();
								var8.statusMe = 1;
								ServerEffect.addServerEffectWithTime(43, var8, var17.timeLenght);
								return;
							}

							ServerEffect.addServerEffectWithTime(48, var8, var17.timeLenght);
							return;
						}

						var8.isInvisible = true;
						ServerEffect.addServerEffect(60, var8.cx, var8.cy, 1);
						return;
					} catch (Exception var49) {
						return;
					}
				case -97:
					try {
						if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
							return;
						}

						var14 = Effect.effTemplates[var0.reader().readByte()];

						for (var1 = 0; var1 < var8.vEff.size(); ++var1) {
							var12 = (Effect) var8.vEff.elementAt(var1);
							if (var14.type == var14.type) {
								var12.template = var14;
								var12.timeStart = (int) (System.currentTimeMillis() / 1000L) - var0.reader().readInt();
								var12.timeLenght = var0.reader().readInt() / 1000;
								var12.param = var0.reader().readShort();
								return;
							}
						}

						return;
					} catch (Exception var47) {
						return;
					}
				case -96:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var10 = var0.reader().readByte();
					var17 = null;

					for (var4 = 0; var4 < var8.vEff.size(); ++var4) {
						if ((var17 = (Effect) var8.vEff.elementAt(var4)).template.id == var10) {
							var8.vEff.removeElementAt(var4);
							break;
						}
					}

					if (var17 == null) {
						return;
					}

					if (var17.template.type == 0) {
						var8.cHp = var0.reader().readInt();
						var8.cMP = var0.reader().readInt();
						return;
					}

					if (var17.template.type == 11) {
						var8.cx = var8.ez = var0.reader().readUnsignedShort();
						var8.cy = var8.fa = var0.reader().readUnsignedShort();
						var8.isInvisible = false;
						ServerEffect.addServerEffect(60, var8.cx, var8.cy, 1);
						return;
					}

					if (var17.template.type == 12) {
						var8.cHp = var0.reader().readInt();
						var8.cMP = var0.reader().readInt();
						var8.isInvisible = false;
						ServerEffect.addServerEffect(60, var8.cx, var8.cy, 1);
						return;
					}

					if (var17.template.type != 4 && var17.template.type != 13 && var17.template.type != 17) {
						if (var17.template.type == 23) {
							Char.getMyChar().cHp = var0.reader().readInt();
							Char.getMyChar().cMaxHp = var0.reader().readInt();
							return;
						}

						if (var17.template.type != 2) {
							return;
						}

						var8.isLockMove = false;
						ServerEffect.addServerEffect(77, var8.cx, var8.cy - 9, 1);
						return;
					}

					var8.cHp = var0.reader().readInt();
					return;
				case -95:
					GameScr.gI().dx = var0.reader().readInt();
					GameScr.gI().dy = (int) (System.currentTimeMillis() / 1000L);
					return;
				case -94:
					var10 = var0.reader().readByte();
					Npc var20;
					(var20 = (Npc) GameScr.vSet.elementAt(var10)).statusMe = var0.reader().readByte();
					if (var20.template.npcTemplateId == 31 && var20.statusMe == 15) {
						GameScr.a(var20.cx, var20.cy);
					}

					return;
				case -92:
					if ((var1 = var0.reader().readInt()) == Char.getMyChar().charID) {
						var8 = Char.getMyChar();
					} else {
						var8 = GameScr.e(var1);
					}

					if (var8 == null) {
						return;
					}

					var8.cTypePk = var0.reader().readByte();
					Auto.a(var8);
					if (var8 != Char.getMyChar()) {
						return;
					}

					if (var8.cTypePk == 4) {
						GameScr.fj = true;
					} else if (var8.cTypePk == 5) {
						GameScr.fj = false;
						return;
					}

					return;
				case -91:
					Item[] var21 = new Item[var0.reader().readUnsignedByte()];

					for (var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
						var21[var1] = Char.getMyChar().arrItemBag[var1];
					}

					Char.getMyChar().arrItemBag = var21;
					Char.getMyChar().arrItemBag[var0.reader().readUnsignedByte()] = null;
					InfoMe.addInfo(mResources.es + " " + Char.getMyChar().arrItemBag.length + " " + mResources.fm);
					return;
				case -90:
					for (var1 = 0; var1 < GameScr.vSet.size(); ++var1) {
						Npc var56;
						if ((var56 = (Npc) GameScr.vSet.elementAt(var1)).statusMe == 15) {
							var56.statusMe = 1;
							break;
						}
					}

					if ((var13 = (short) var0.reader().readByte()) == 1) {
						InfoMe.addInfo(mResources.et, 20, mFont.tahoma_7_yellow);
						return;
					}

					if (var13 != 2) {
						return;
					}

					InfoMe.addInfo(mResources.eu, 20, mFont.tahoma_7_yellow);
					return;
				case -89:
					GameCanvas.isLoading = false;

					try {
						InfoMe.addInfo(var0.reader().readUTF(), 20, mFont.tahoma_7_yellow);
					} catch (Exception var41) {
					}

					InfoDlg.hide();
					GameCanvas.n();
					return;
				case -87:
					var7 = var0.reader().readByte();
					Party var22 = (Party) GameScr.vParty.elementAt(var7);
					GameScr.vParty.setElementAt(GameScr.vParty.elementAt(0), var7);
					GameScr.vParty.setElementAt(var22, 0);
					GameScr.gI().t();
					InfoMe.addInfo(var22.name + mResources.oh, 20, mFont.tahoma_7_yellow);
					return;
				case -86:
					GameScr.vParty.removeAllElements();
					GameScr.gI().t();
					InfoMe.addInfo(mResources.oi, 20, mFont.tahoma_7_yellow);
					NSOT_MOB.d = null;
					return;
				case -85:
					GameScr.vFriend.removeAllElements();

					try {
						while (true) {
							GameScr.vFriend.addElement(new Friend(var0.reader().readUTF(), var0.reader().readByte()));
						}
					} catch (Exception var45) {
						for (var1 = 0; var1 < GameScr.vFriendWait.size(); ++var1) {
							GameScr.vFriend.addElement(GameScr.vFriendWait.elementAt(var1));
						}

						GameScr.gI();
						GameScr.c((int) 0);
						return;
					}
				case -84:
					GameScr.vEnemies.removeAllElements();

					try {
						while (true) {
							GameScr.vEnemies.addElement(new Friend(var0.reader().readUTF(), var0.reader().readByte()));
						}
					} catch (Exception var44) {
						GameScr.gI();
						GameScr.c((int) 1);
						return;
					}
				case -83:
					var15 = var0.reader().readUTF();

					for (var6 = 0; var6 < GameScr.vFriend.size(); ++var6) {
						if (((Friend) GameScr.vFriend.elementAt(var6)).friendName.equals(var15)) {
							GameScr.indexRow = 0;
							GameScr.vFriend.removeElementAt(var6);
							GameScr.gI();
							GameScr.a(var15);
							break;
						}
					}

					if (GameScr.isPaintFriend) {
						GameScr.gI();
						GameScr.c((int) 0);
						GameScr.indexRow = 0;
						GameScr.aq.clear();
					}

					return;
				case -82:
					var15 = var0.reader().readUTF();
					var6 = 0;

					while (true) {
						if (var6 < GameScr.vEnemies.size()) {
							if (!((Friend) GameScr.vEnemies.elementAt(var6)).friendName.equals(var15)) {
								++var6;
								continue;
							}

							GameScr.indexRow = 0;
							GameScr.vEnemies.removeElementAt(var6);
						}

						GameScr.gI();
						GameScr.c((int) 1);
						return;
					}
				case -81:
					Char.getMyChar().cPk = var0.reader().readByte();
					Char.getMyChar().charFocus = null;
					return;
				case -80:
					Char.getMyChar().arrItemBody[var0.reader().readByte()] = null;
					return;
				case -78:
					ServerEffect.addServerEffect(var0.reader().readShort(), Char.getMyChar().cx, Char.getMyChar().cy, 1);
					return;
				case -77:
					try {
						GameScr.vPtMap.removeAllElements();

						while (true) {
							GameScr.vPtMap.addElement(new Party(var0.reader().readByte(), var0.reader().readUnsignedByte(),
									var0.reader().readUTF(), var0.reader().readByte()));
						}
					} catch (Exception var43) {
						GameScr.gI().s();
						return;
					}
				case -76:
					((Party) GameScr.vParty.firstElement()).isLock = var0.reader().readBoolean();
					return;
				case -75:
					Char.getMyChar().arrItemBox[var0.reader().readByte()] = null;
					return;
				case -74:
					InfoDlg.showWait(var0.reader().readUTF());
					return;
				case -73:
					Mob var23 = Mob.a(var0.reader().readUnsignedByte());
					ServerEffect.addServerEffect(67, var23.x, var23.y, 1);
					return;
				case -72:
					Char.getMyChar().luong = var0.reader().readInt();
					return;
				case -71:
					var1 = var0.reader().readInt();
					var18 = Char.getMyChar();
					var18.luong += var1;
					GameScr.a("+" + var1, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch - 10, 6);
					InfoMe.addInfo(mResources.ku + " " + var1 + " " + mResources.hx, 20, mFont.tahoma_7_yellow);
					return;
				case -69:
					var4 = var0.reader().readUnsignedByte();
					var13 = (short) var0.reader().readByte();
					if (var4 > 0) {
						var11 = (short) Char.getMyChar().cx;
						var3 = (short) (Char.getMyChar().cy - 40);
						Char.getMyChar().mobMe = new Mob((short) -1, false, false, false, false, false, var4, 1, 0, 0, 0,
								var11, var3, (byte) 4, (byte) 0, var13 != 0, false);
						Char.getMyChar().mobMe.status = 5;
					} else {
						Char.getMyChar().mobMe = null;
					}

					return;
				case -68:
					if ((var8 = GameScr.e(var0.reader().readInt())) != null) {
						var4 = var0.reader().readUnsignedByte();
						var13 = (short) var0.reader().readByte();
						if (var4 > 0) {
							var3 = (short) var8.cx;
							var11 = (short) (var8.cy - 40);
							var8.mobMe = new Mob((short) -1, false, false, false, false, false, var4, 1, 0, 0, 0,
									var3, var11, (byte) 4, (byte) 0, var13 != 0, false);
							var8.mobMe.status = 5;
						} else {
							var8.mobMe = null;
						}

						return;
					}

					return;
				case -65:
					String var24 = var0.reader().readUTF();
					byte[] var25 = new byte[var0.reader().readInt()];
					var0.reader().read(var25);
					if (var25.length == 0) {
						var25 = null;
					}

					try {
						var0.reader().readByte();
					} catch (Exception var40) {
						var40.printStackTrace();
					}

					if (var24.equals("KSkill")) {
						GameScr.gI();
						GameScr.onKSkill(var25);
						return;
					}

					if (var24.equals("OSkill")) {
						GameScr.gI();
						GameScr.onOSkill(var25);
						return;
					}

					if (!var24.equals("CSkill")) {
						return;
					}

					GameScr.gI();
					GameScr.onCSkill(var25);
					return;
				case -64:
					if ((var8 = GameScr.e(var0.reader().readInt())) == null) {
						return;
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					var8.eff5BuffHp = var0.reader().readShort();
					var8.eff5BuffMp = var0.reader().readShort();
					var8.head = var0.reader().readShort();
					return;
				case -63:
					if ((var8 = GameScr.e((var9 = new Integer(var0.reader().readInt())).intValue())) != null) {
						GameCanvas.a(var8.cName + " " + mResources.b(mResources.md, var0.reader().readUTF()), 88830, var9, 88811,
								(Object) null);
					}

					return;
				case -62:
					var1 = var0.reader().readInt();
					if (Char.getMyChar().charID == var1) {
						Char.getMyChar().cClanName = var0.reader().readUTF();
						Char.getMyChar().ctypeClan = var0.reader().readByte();
						Char.getMyChar().callEffTask(21);
					} else {
						(var8 = GameScr.e(var1)).cClanName = var0.reader().readUTF();
						var8.ctypeClan = var0.reader().readByte();
					}

					return;
				case -61:
					if (GameScr.cb && (var8 = GameScr.e((var9 = new Integer(var0.reader().readInt())).intValue())) != null) {
						GameCanvas.a(var8.cName + " " + mResources.me, 88831, var9, 88811, (Object) null);
					}

					return;
				case -59:
					if ((var1 = var0.reader().readInt()) == Char.getMyChar().charID) {
						var8 = Char.getMyChar();
					} else {
						var8 = GameScr.e(var1);
					}

					var8.cHp = var0.reader().readInt();
					var8.cMaxHp = var0.reader().readInt();
					return;
				case -58:
					GameScr.gI().resetButton();
					GameCanvas.ao = 70;
					GameCanvas.d = true;
					ServerEffect.addServerEffect(119, GameScr.gW2 + GameScr.gW23, GameScr.gW3 + GameScr.gH2, 1);
					return;
				case -57:
					GameCanvas.ao = 40;
					GameCanvas.d = true;
					return;
				case -56:
					if ((var8 = GameScr.e(var0.reader().readInt())) != null) {
						var8.cHp = var0.reader().readInt();
						var8.cMaxHp = var0.reader().readInt();
						var8.coat = (short) var0.reader().readUnsignedShort();
					}

					return;
				case -55:
					if ((var8 = GameScr.e(var0.reader().readInt())) != null) {
						var8.cHp = var0.reader().readInt();
						var8.cMaxHp = var0.reader().readInt();
						var8.glove = (short) var0.reader().readUnsignedShort();
					}

					return;
				case -54:
					var1 = var0.reader().readInt();
					if (Char.getMyChar().charID == var1) {
						var8 = Char.getMyChar();
					} else {
						var8 = GameScr.e(var1);
					}

					if (var8 != null) {
						var8.arrItemMounts = new Item[5];
						var8.isJump = var8.fallAttack = var8.autoFall = false;

						for (var1 = 0; var1 < var8.arrItemMounts.length; ++var1) {
							if ((var3 = var0.reader().readShort()) != -1) {
								var8.arrItemMounts[var1] = new Item();
								var8.arrItemMounts[var1].typeUI = 41;
								var8.arrItemMounts[var1].indexUI = var1;
								var8.arrItemMounts[var1].template = ItemTemplates.get(var3);
								var8.arrItemMounts[var1].upgrade = var0.reader().readByte();
								var8.arrItemMounts[var1].expires = var0.reader().readLong();
								var8.arrItemMounts[var1].sys = var0.reader().readByte();
								var8.arrItemMounts[var1].isLock = true;
								if (var1 == 4) {
									if (var8.arrItemMounts[var1].template.id != 485 && var8.arrItemMounts[var1].template.id != 524) {
										if (var8.arrItemMounts[var1].template.id == 443 || var8.arrItemMounts[var1].template.id == 523) {
											var8.isJump = true;
										}
									} else {
										var8.autoFall = true;
									}
								}

								var10 = var0.reader().readByte();
								var8.arrItemMounts[var1].options = new MyVector();

								for (var4 = 0; var4 < var10; ++var4) {
									var8.arrItemMounts[var1].options.addElement(new ItemOption(var0.reader().readByte(), var0.reader().readInt()));
								}
							}
						}

						return;
					}

					return;
				case 115:
					System.out.println("UPDATE INFO ME");
					GameScr.currentCharViewInfo = Char.getMyChar();
					Char.getMyChar().ga = null;
					Char.getMyChar().charID = var0.reader().readInt();
					Char.getMyChar().cClanName = var0.reader().readUTF();
					if (!Char.getMyChar().cClanName.equals("")) {
						Char.getMyChar().ctypeClan = var0.reader().readByte();
					}

					Char.getMyChar().ctaskId = var0.reader().readByte();
					Char.getMyChar().cgender = var0.reader().readByte();
					Char.getMyChar().head = var0.reader().readShort();
					Char.getMyChar().cspeed = var0.reader().readByte();
					Char.getMyChar().cName = a(var0.reader().readUTF());
					Char.getMyChar().cPk = var0.reader().readByte();
					Char.getMyChar().cTypePk = var0.reader().readByte();
					Char.getMyChar().cMaxHp = var0.reader().readInt();
					Char.getMyChar().cHp = var0.reader().readInt();
					Char.getMyChar().cMaxMP = var0.reader().readInt();
					Char.getMyChar().cMP = var0.reader().readInt();
					Char.getMyChar().cEXP = var0.reader().readLong();
					Char.getMyChar().cExpDown = var0.reader().readLong();
					GameScr.getLevelExp(Char.getMyChar().cEXP);
					Char.getMyChar().eff5BuffHp = var0.reader().readShort();
					Char.getMyChar().eff5BuffMp = var0.reader().readShort();
					Char.getMyChar().nClass = GameScr.nClasss[var0.reader().readByte()];
					Char.getMyChar().pPoint = var0.reader().readShort();
					Char.getMyChar().potential[0] = var0.reader().readShort();
					Char.getMyChar().potential[1] = var0.reader().readShort();
					Char.getMyChar().potential[2] = var0.reader().readInt();
					Char.getMyChar().potential[3] = var0.reader().readInt();
					Char.getMyChar().sPoint = var0.reader().readShort();
					Char.getMyChar().vSkill.removeAllElements();
					Char.getMyChar().vSkillFight.removeAllElements();
					var1 = var0.reader().readByte();

					for (var3 = 0; var3 < var1; var3 = (short) ((byte) (var3 + 1))) {
						var2 = Skills.get(var0.reader().readShort());
						if (Char.getMyChar().myskill == null) {
							Char.getMyChar().myskill = var2;
						}

						if (NSOT_MOB.b != null && Auto.g != null && var2.template.id == Auto.g.template.id) {
							Auto.g = var2;
						}

						Char.getMyChar().vSkill.addElement(var2);
						if ((var2.template.type == 1 || var2.template.type == 4 || var2.template.type == 2 || var2.template.type == 3)
								&& (var2.template.maxPoint == 0 || var2.template.maxPoint > 0 && var2.point > 0)) {
							if (var2.template.id == 0) {
								Service.gI().selectSkill(0);
							}

							Char.getMyChar().vSkillFight.addElement(var2);
						}
					}

					GameScr.z();
					Char.getMyChar().xu = var0.reader().readInt();
					Char.getMyChar().yen = var0.reader().readInt();
					Char.getMyChar().luong = var0.reader().readInt();
					Char.getMyChar().arrItemBag = new Item[var0.reader().readUnsignedByte()];
					GameScr.q = 0;
					GameScr.r = 0;

					for (var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
						if ((var6 = var0.reader().readShort()) != -1) {
							Char.getMyChar().arrItemBag[var1] = new Item();
							Char.getMyChar().arrItemBag[var1].typeUI = 3;
							Char.getMyChar().arrItemBag[var1].indexUI = var1;
							Char.getMyChar().arrItemBag[var1].template = ItemTemplates.get((short) var6);
							Char.getMyChar().arrItemBag[var1].isLock = var0.reader().readBoolean();
							if (Char.getMyChar().arrItemBag[var1].isTypeBody() || Char.getMyChar().arrItemBag[var1].isTypeMounts() || Char.getMyChar().arrItemBag[var1].isTypeNgocKham()) {
								Char.getMyChar().arrItemBag[var1].upgrade = var0.reader().readByte();
							}

							Char.getMyChar().arrItemBag[var1].isExpires = var0.reader().readBoolean();
							Char.getMyChar().arrItemBag[var1].quantity = var0.reader().readUnsignedShort();
							if (Char.getMyChar().arrItemBag[var1].template.type == 16) {
								GameScr.r += Char.getMyChar().arrItemBag[var1].quantity;
							}

							if (Char.getMyChar().arrItemBag[var1].template.type == 17) {
								GameScr.q += Char.getMyChar().arrItemBag[var1].quantity;
							}

							if (Char.getMyChar().arrItemBag[var1].template.id == 340) {
								var5 = GameScr.gI();
								var5.bx += Char.getMyChar().arrItemBag[var1].quantity;
							}
						}
					}

					NSOT_MOB.l();
					Char.getMyChar().arrItemBody = new Item[32];

					try {
						Char.getMyChar().n();

						for (var1 = 0; var1 < 16; ++var1) {
							if ((var6 = var0.reader().readShort()) != -1) {
								ItemTemplate var26;
								var7 = (var26 = ItemTemplates.get((short) var6)).type;
								Char.getMyChar().arrItemBody[var7] = new Item();
								Char.getMyChar().arrItemBody[var7].indexUI = var7;
								Char.getMyChar().arrItemBody[var7].typeUI = 5;
								Char.getMyChar().arrItemBody[var7].template = var26;
								Char.getMyChar().arrItemBody[var7].isLock = true;
								Char.getMyChar().arrItemBody[var7].upgrade = var0.reader().readByte();
								Char.getMyChar().arrItemBody[var7].sys = var0.reader().readByte();
								if (var7 == 1) {
									Char.getMyChar().wp = Char.getMyChar().arrItemBody[var7].template.part;
								} else if (var7 == 2) {
									Char.getMyChar().body = Char.getMyChar().arrItemBody[var7].template.part;
								} else if (var7 == 6) {
									Char.getMyChar().leg = Char.getMyChar().arrItemBody[var7].template.part;
								}
							}
						}
					} catch (Exception var42) {
						var42.printStackTrace();
					}

					Char.getMyChar().isHuman = var0.reader().readBoolean();
					Char.getMyChar().isNhanban = var0.reader().readBoolean();
					short[] var57;
					if ((var57 = new short[] { var0.reader().readShort(), var0.reader().readShort(), var0.reader().readShort(),
							var0.reader().readShort() })[0] >= 0) {
						Char.getMyChar().head = var57[0];
					}

					if (var57[1] >= 0) {
						Char.getMyChar().wp = var57[1];
					}

					if (var57[2] >= 0) {
						Char.getMyChar().body = var57[2];
					}

					if (var57[3] >= 0) {
						Char.getMyChar().leg = var57[3];
					}
					arr_short_new = new short[10];

					try {
						for (int index = 0; index < arr_short_new.length; index++) {
							arr_short_new[index] = var0.reader().readShort();
						}
					} catch (Exception var29) {
						arr_short_new = null;
					}
					GameScr.gI();
					GameScr.z();
					if (Char.getMyChar().isHuman) {
						GameScr.gI();
						GameScr.loadSkillShortcut();
					} else if (Char.getMyChar().isNhanban) {
						GameScr.gI();
						GameScr.loadSkillShortcutNhanban();
					}

					Char.getMyChar().statusMe = 4;
					GameScr.cb = mResources.d(Char.getMyChar().cName + "vci") > 0;
					try {

						for (var1 = 0; var1 < 16; ++var1) {
							if ((var6 = var0.reader().readShort()) != -1) {
								ItemTemplate var26;
								var7 = (byte) ((var26 = ItemTemplates.get((short) var6)).type + 16);
								Char.getMyChar().arrItemBody[var7] = new Item();
								Char.getMyChar().arrItemBody[var7].indexUI = var7;
								Char.getMyChar().arrItemBody[var7].typeUI = 5;
								Char.getMyChar().arrItemBody[var7].template = var26;
								Char.getMyChar().arrItemBody[var7].isLock = true;
								Char.getMyChar().arrItemBody[var7].upgrade = var0.reader().readByte();
								Char.getMyChar().arrItemBody[var7].sys = var0.reader().readByte();
								if (var7 == 1) {
									Char.getMyChar().wp = Char.getMyChar().arrItemBody[var7].template.part;
								} else if (var7 == 2) {
									Char.getMyChar().body = Char.getMyChar().arrItemBody[var7].template.part;
								} else if (var7 == 6) {
									Char.getMyChar().leg = Char.getMyChar().arrItemBody[var7].template.part;
								}
							}
						}
					} catch (Exception var42) {
						var42.printStackTrace();
					}
					try {
						var_short = var0.reader().readShort();
					} catch (Exception var27) {
						var_short = -1;
					}
				}
			} catch (Exception var50) {
			}

		} finally {
			if (var0 != null) {
				var0.close();
			}

		}
	}

	private static boolean readCharInfo(Char var0, Message var1) {
		try {
			var0.cClanName = var1.reader().readUTF();
			if (!var0.cClanName.equals("")) {
				var0.ctypeClan = var1.reader().readByte();
			}

			var0.isInvisible = var1.reader().readBoolean();
			var0.cTypePk = var1.reader().readByte();
			var0.nClass = GameScr.nClasss[var1.reader().readByte()];
			var0.cgender = var1.reader().readByte();
			var0.head = var1.reader().readShort();
			var0.cName = a(var1.reader().readUTF());
			var0.cHp = var1.reader().readInt();
			var0.cMaxHp = var1.reader().readInt();
			var0.clevel = var1.reader().readUnsignedByte();
			var0.wp = var1.reader().readShort();
			var0.body = var1.reader().readShort();
			var0.leg = var1.reader().readShort();
			byte var2 = var1.reader().readByte();
			if (var0.wp == -1) {
				var0.wp = 15;
			}

			if (var0.body == -1) {
				var0.p();
			}

			if (var0.leg == -1) {
				var0.q();
			}

			int var3;
			if (var2 == -1) {
				var0.mobMe = null;
			} else {
				short var4 = (short) var0.cx;
				var3 = (short) (var0.cy - 40);
				var0.mobMe = new Mob((short) -1, false, false, false, false, false, var2, 1, 0, 0, 0, var4,
						(short) var3, (byte) 4, (byte) 0, false, false);
				var0.mobMe.status = 5;
			}

			var0.cx = var0.ez = var1.reader().readShort();
			var0.cy = var0.fa = var1.reader().readShort();
			var0.eff5BuffHp = var1.reader().readShort();
			var0.eff5BuffMp = var1.reader().readShort();
			byte var9 = var1.reader().readByte();

			for (var3 = 0; var3 < var9; ++var3) {
				Effect var5 = new Effect(var1.reader().readByte(), var1.reader().readInt(), var1.reader().readInt(),
						var1.reader().readShort());
				var0.vEff.addElement(var5);
				if (var5.template.type == 12 || var5.template.type == 11) {
					var0.isInvisible = true;
				}
			}

			if (!var0.isInvisible) {
				ServerEffect.addServerEffect(60, var0, 1);
			}

			if (var0.cHp == 0) {
				var0.statusMe = 14;
				if (Char.getMyChar().charID == var0.charID) {
					GameScr.gI().resetButton();
				}
			}

			if (var0.charID == -Char.getMyChar().charID) {
				for (var3 = 0; var3 < GameScr.vSet.size(); ++var3) {
					Npc var10;
					if ((var10 = (Npc) GameScr.vSet.elementAt(var3)).template.name.equals(var0.cName)) {
						var10.statusMe = 15;
						var10.chatPopup = null;
						break;
					}
				}
			}

			var0.isHuman = var1.reader().readBoolean();
			var0.isNhanban = var1.reader().readBoolean();
			if (var0.isNhanban) {
				ServerEffect.addServerEffect(141, var0.cx, var0.cy, 0);
			}

			short[] var11;
			if ((var11 = new short[] { var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort(),
					var1.reader().readShort() })[0] >= 0) {
				var0.head = var11[0];
			}

			if (var11[1] >= 0) {
				var0.wp = var11[1];
			}

			if (var11[2] >= 0) {
				var0.body = var11[2];
			}

			if (var11[3] >= 0) {
				var0.leg = var11[3];
			}

			var0 = var0;

			for (int var6 = 0; var6 < GameScr.vParty.size(); ++var6) {
				Party var7;
				if ((var7 = (Party) GameScr.vParty.elementAt(var6)).charId == var0.charID) {
					var7.c = var0;
					break;
				}
			}

			return true;
		} catch (Exception var8) {
			return false;
		}
	}

	private static void requestItemInfo(Message var0) {
		try {
			byte var1;
			Item var2;
			var1 = var0.reader().readByte();
			int var3 = var0.reader().readUnsignedByte();
			var2 = null;
			label190: switch (var1) {
			case 2:
				var2 = GameScr.arrItemWeapon[var3];
				break;
			case 3:
				if ((var2 = Char.getMyChar().arrItemBag[var3]) != null) {
					break;
				}

				if (GameScr.itemSplit != null && GameScr.itemSplit.indexUI == var3) {
					var2 = GameScr.itemSplit;
				}

				if (GameScr.itemUpGrade != null && GameScr.itemUpGrade.indexUI == var3) {
					var2 = GameScr.itemUpGrade;
				}

				if (GameScr.itemSell != null && GameScr.itemSell.indexUI == var3) {
					var2 = GameScr.itemSell;
				}

				int var4;
				if (var2 == null && GameScr.arrItemUpGrade != null) {
					for (var4 = 0; var4 < GameScr.arrItemUpGrade.length; ++var4) {
						if (GameScr.arrItemUpGrade[var4] != null && GameScr.arrItemUpGrade[var4].indexUI == var3) {
							var2 = GameScr.arrItemUpGrade[var4];
							break;
						}
					}
				}

				if (var2 == null && GameScr.arrItemConvert != null) {
					for (var4 = 0; var4 < GameScr.arrItemConvert.length; ++var4) {
						if (GameScr.arrItemConvert[var4] != null && GameScr.arrItemConvert[var4].indexUI == var3) {
							var2 = GameScr.arrItemConvert[var4];
							break;
						}
					}
				}

				if (var2 == null && GameScr.arrItemUpPeal != null) {
					for (var4 = 0; var4 < GameScr.arrItemUpPeal.length; ++var4) {
						if (GameScr.arrItemUpPeal[var4] != null && GameScr.arrItemUpPeal[var4].indexUI == var3) {
							var2 = GameScr.arrItemUpPeal[var4];
							break;
						}
					}
				}

				if (var2 == null && GameScr.arrItemTradeMe != null) {
					for (var4 = 0; var4 < GameScr.arrItemTradeMe.length; ++var4) {
						if (GameScr.arrItemTradeMe[var4] != null && GameScr.arrItemTradeMe[var4].indexUI == var3) {
							var2 = GameScr.arrItemTradeMe[var4];
							break;
						}
					}
				}

				if (var2 != null || GameScr.arrItemSplit == null) {
					break;
				}

				var4 = 0;

				while (true) {
					if (var4 >= GameScr.arrItemSplit.length) {
						break label190;
					}

					if (GameScr.arrItemSplit[var4] != null && GameScr.arrItemSplit[var4].indexUI == var3) {
						var2 = GameScr.arrItemSplit[var4];
						break label190;
					}

					++var4;
				}
			case 4:
				var2 = Char.getMyChar().arrItemBox[var3];
				break;
			case 5:
				var2 = Char.getMyChar().arrItemBody[var3];
				break;
			case 6:
				var2 = GameScr.arrItemStack[var3];
				break;
			case 7:
				var2 = GameScr.arrItemStackLock[var3];
				break;
			case 8:
				var2 = GameScr.arrItemGrocery[var3];
				break;
			case 9:
				var2 = GameScr.arrItemGroceryLock[var3];
			case 10:
			case 11:
			case 12:
			case 13:
			case 31:
			case 33:
			case 36:
			case 37:
			case 38:
			default:
				break;
			case 14:
				var2 = GameScr.arrItemStore[var3];
				break;
			case 15:
				var2 = GameScr.arrItemBook[var3];
				break;
			case 16:
				var2 = GameScr.arrItemLien[var3];
				break;
			case 17:
				var2 = GameScr.arrItemNhan[var3];
				break;
			case 18:
				var2 = GameScr.arrItemNgocBoi[var3];
				break;
			case 19:
				var2 = GameScr.arrItemPhu[var3];
				break;
			case 20:
				var2 = GameScr.arrItemNonNam[var3];
				break;
			case 21:
				var2 = GameScr.arrItemNonNu[var3];
				break;
			case 22:
				var2 = GameScr.arrItemAoNam[var3];
				break;
			case 23:
				var2 = GameScr.arrItemAoNu[var3];
				break;
			case 24:
				var2 = GameScr.arrItemGangTayNam[var3];
				break;
			case 25:
				var2 = GameScr.arrItemGangTayNu[var3];
				break;
			case 26:
				var2 = GameScr.arrItemQuanNam[var3];
				break;
			case 27:
				var2 = GameScr.arrItemQuanNu[var3];
				break;
			case 28:
				var2 = GameScr.arrItemGiayNam[var3];
				break;
			case 29:
				var2 = GameScr.arrItemGiayNu[var3];
				break;
			case 30:
				var2 = GameScr.arrItemTradeOrder[var3];
				break;
			case 32:
				var2 = GameScr.arrItemFashion[var3];
				break;
			case 34:
				var2 = GameScr.arrItemClanShop[var3];
				break;
			case 35:
				var2 = GameScr.arrItemElites[var3];
				break;
			case 39:
				var2 = Char.be.items[GameScr.indexSelect];
			}

			var2.expires = var0.reader().readLong();
			if (var2.isTypeUIMe()) {
				var2.saleCoinLock = var0.reader().readInt();
			} else if (var2.isTypeUIShop() || var2.isTypeUIShopLock() || var2.isTypeUIStore() || var2.isTypeUIBook() || var2.isTypeUIFashion() || var2.isTypeUIClanShop()) {
				var2.buyCoinLock = var0.reader().readInt();
				var2.buyGold = var0.reader().readInt();
				var2.buyGoldLock = var0.reader().readInt();
			}

			if (!var2.isTypeBody() && !var2.isTypeMounts() && !var2.isTypeNgocKham()) {
				if (var2.template.id == 233) {
					var2.r = a(NinjaUtil.readByteArray(var0));
				} else if (var2.template.id == 234) {
					var2.r = a(NinjaUtil.readByteArray(var0));
				} else if (var2.template.id == 235) {
					var2.r = a(NinjaUtil.readByteArray(var0));
				}
			} else {
				var2.sys = var0.reader().readByte();
				var2.options = new MyVector();

				try {
					while (true) {
						var2.options.addElement(new ItemOption(var0.reader().readUnsignedByte(), var0.reader().readInt()));
					}
				} catch (Exception var5) {
				}
			}

			var2.s = true;
			if (var1 == 5) {
				Char.getMyChar().updateKickOption();
				return;
			}
		} catch (Exception var6) {
			var6.printStackTrace();
			System.out.println("Controller.requestItemInfo()");
		}

		Class_cl.s();
	}

	private static void addMob(Message var0) {
		try {
			byte var1 = var0.reader().readByte();

			for (byte var2 = 0; var2 < var1; ++var2) {
				short var3 = (short) var0.reader().readUnsignedByte();
				boolean var4 = var0.reader().readBoolean();
				boolean var5 = var0.reader().readBoolean();
				boolean var6 = var0.reader().readBoolean();
				boolean var7 = var0.reader().readBoolean();
				boolean var8 = var0.reader().readBoolean();
				int var9 = var0.reader().readUnsignedByte();
				byte var10 = var0.reader().readByte();
				int var11 = var0.reader().readInt();
				int var12 = var0.reader().readUnsignedByte();
				int var13 = var0.reader().readInt();
				short var14 = var0.reader().readShort();
				short var15 = var0.reader().readShort();
				byte var16 = var0.reader().readByte();
				byte var17 = var0.reader().readByte();
				boolean var18 = var0.reader().readBoolean();
				GameScr.a((Mob) (new Mob(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12,
						var13, var14, var15, var16, var17, var18, true)), (int) var2);
			}
		} catch (Exception var19) {
			var19.printStackTrace();
			System.out.println("err addMob");
		}

	}

	private static void addEffAuto(Message var0) {
		try {
			short var1 = (short) var0.reader().readUnsignedByte();
			short var2 = var0.reader().readShort();
			short var3 = var0.reader().readShort();
			byte var4 = var0.reader().readByte();
			short var5 = var0.reader().readShort();
			EffectAuto.a(var1, var2, var3, var4, var5, 1);
		} catch (Exception var6) {
			var6.printStackTrace();
			System.out.println("err add effAuto");
		}

	}

	private static void getDataEffAuto(Message var0) {
		try {
			short var1 = (short) var0.reader().readUnsignedByte();
			short var2 = var0.reader().readShort();
			byte[] var3 = null;
			if (var2 > 0) {
				var3 = new byte[var2];
				var0.reader().read(var3);
			}

			EffectAuto.a(var1, var3);
		} catch (Exception var4) {
			var4.printStackTrace();
			System.out.println("err add effAuto");
		}

	}

	private static void getImgEffAuto(Message var0) {
		try {
			byte var1 = (byte) var0.reader().readUnsignedByte();
			byte[] var2 = NinjaUtil.readByteArray_Int(var0);
			EffectAuto.a(var1, var2);
		} catch (Exception var3) {
			var3.printStackTrace();
			System.out.println("err getImgEffAuto");
		}

	}

	private static void khamngoc(Message var0) {
		try {
			byte var1 = var0.reader().readByte();
			Char.getMyChar().luong = var0.reader().readInt();
			Char.getMyChar().xu = var0.reader().readInt();
			Char.getMyChar().yen = var0.reader().readInt();
			int var2;
			if (var1 == 0) {
				if (GameScr.itemSplit != null) {
					GameScr.itemSplit = null;
				}

				if (GameScr.arrItemSplit != null) {
					for (var2 = 0; var2 < GameScr.arrItemSplit.length; ++var2) {
						GameScr.arrItemSplit[var2] = null;
					}
				}
			} else if (var1 == 1) {
				if (GameScr.itemSplit != null) {
					GameScr.itemSplit.isLock = true;
					GameScr.itemSplit.upgrade = var0.reader().readByte();
					GameScr.ey = GameScr.v[53];
					GameScr.ex = 0;
				}

				if (GameScr.arrItemSplit != null) {
					for (var2 = 0; var2 < GameScr.arrItemSplit.length; ++var2) {
						GameScr.arrItemSplit[var2] = null;
					}
				}
			} else if ((var1 == 2 || var1 == 3) && GameScr.arrItemSplit != null) {
				for (var2 = 0; var2 < GameScr.arrItemSplit.length; ++var2) {
					GameScr.arrItemSplit[var2] = null;
				}
			}

			GameScr.gI().left = GameScr.gI().center = null;
			GameScr.gI().ab();
			GameCanvas.n();
		} catch (Exception var3) {
			var3.printStackTrace();
			System.out.println("err getImgEffAuto");
		}

	}

	private static void addEffect(Message var0) {
		try {
			Object var1;
			int var2;
			if (var0.reader().readByte() == 1) {
				var1 = Mob.a(var0.reader().readUnsignedByte());
			} else if ((var2 = var0.reader().readInt()) == Char.getMyChar().charID) {
				var1 = Char.getMyChar();
			} else {
				var1 = GameScr.e(var2);
			}

			if (var1 != null) {
				short var3 = var0.reader().readShort();
				int var4 = var0.reader().readInt();
				short var5 = (short) var0.reader().readByte();
				long var6 = (long) var4 + System.currentTimeMillis();
				var2 = var5 * 1000;
				var5 = var3;
				var1 = var1;

				DataSkillEff var8;
				for (var4 = 0; var4 < ((MainObject) var1).gc.size(); ++var4) {
					if ((var8 = (DataSkillEff) ((MainObject) var1).gc.elementAt(var4)) != null && var8.e == var5) {
						var8.g = var6;
						var8.h = var2;
						return;
					}
				}

				var8 = new DataSkillEff(var5, var6, var2);
				((MainObject) var1).gc.addElement(var8);
			}
		} catch (Exception var9) {
			var9.printStackTrace();
		}

	}

	private static void getImgEffect(Message var0) {
		try {
			short var1 = (short) var0.reader().readUnsignedByte();
			byte[] var2 = NinjaUtil.readByteArray_Int(var0);
			GameData.a(var1, var2);
			ImageIcon var3;
			if ((var3 = (ImageIcon) GameData.listImgIcon.get(String.valueOf(var1))) == null) {
				var3 = new ImageIcon();
				GameData.listImgIcon.put(String.valueOf(var1), var3);
			}

			var3.img = a(var2);
			if (GameMidlet.e != 1) {
				mResources.a("ImgEffect " + var1, var2);
				return;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			System.out.println("err getImgEffect");
		}

	}

	private static void getDataEffect(Message var0) {
		try {
			short var1 = (short) var0.reader().readUnsignedByte();
			short var2 = var0.reader().readShort();
			byte[] var3 = null;
			if (var2 > 0) {
				var3 = new byte[var2];
				var0.reader().read(var3);
			}

			EffectData var4;
			if ((var4 = (EffectData) GameData.listbyteData.get(String.valueOf(var1))) != null) {
				if (!var4.isLoad) {
					DataSkillEff var5;
					(var5 = new DataSkillEff()).a(var3);
					var4.listFrame = var5.mst;
					var4.smallImage = var5.smallImage;
					var4.fw = var5.j;
					var4.fh = var5.k;
					var4.sequence = var5.sequence;
					var4.indexStartSkill = var5.f;
					var4.frameChar = var5.frameChar;
					var4.isLoad = true;
				}

				return;
			}
		} catch (Exception var6) {
			var6.printStackTrace();
			System.out.println("err getDataEffect ");
		}

	}

	public static String a(String var0) {
		String var1 = "[VIP]";
		String var2 = "[V_VIP]";
		String var3 = "[S_VIP]";
		if (var0.indexOf(var1) >= 0) {
			var0 = var0.substring(var0.indexOf(var1) + var1.length());
		} else if (var0.indexOf(var2) >= 0) {
			var0 = var0.substring(var0.indexOf(var2) + var2.length());
		} else if (var0.indexOf(var3) >= 0) {
			var0 = var0.substring(var0.indexOf(var3) + var3.length());
		}

		return var0;
	}

	public static void f() {
		me = null;
		c = null;
		d = null;
		e = null;
		f = null;
		g = null;
	}

	static {
		Main.main(4);
		init();
	}
}

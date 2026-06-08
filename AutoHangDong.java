import java.util.Calendar;
import java.util.TimeZone;

import javax.microedition.media.Control;

public class AutoHangDong extends Auto {
	public static boolean xong_hd = false;
	private long time_hd6x;
	private long p;
	public static boolean xongmap1;
	public static boolean xongmap2;
	public static boolean xongmap3;
	public static boolean yenmap1;
	public static boolean yenmap2;
	public static boolean yenmap3;
	public static boolean lan1;
	public static boolean lan2;
	public static boolean dunglb;

	public static int gettime(int var0) {
		Calendar var1 = Calendar.getInstance();
		var1.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
		return var1.get(var0);
	}

	public static int map() {
		if (Char.getMyChar().clevel >= 30 && Char.getMyChar().clevel <= 39) {
			return 91;
		} else if (Char.getMyChar().clevel >= 40 && Char.getMyChar().clevel <= 49) {
			return 94;
		} else if (Char.getMyChar().clevel >= 50 && Char.getMyChar().clevel <= 59) {
			return 105;
		} else if (Char.getMyChar().clevel >= 60 && Char.getMyChar().clevel <= 69) {
			return 114;
		} else if (Char.getMyChar().clevel >= 70 && Char.getMyChar().clevel <= 89) {
			return 125;
		} else if (Char.getMyChar().clevel >= 90) {
			return 157;
		}

		return -1;
	}

	public void start() {
		super.g();
		super.b = map();
		super.d = TileMap.g(map());
		super.c = -2;
		xong_hd = false;
		time_hd6x = System.currentTimeMillis();
		xongmap1 = false;
		xongmap2 = false;
		xongmap3 = false;
		yenmap1 = false;
		yenmap2 = false;
		yenmap3 = false;
		if (dunglb) {
			dunglb = false;
		}
	}

	private static String name() {
		if (Char.getMyChar().clevel >= 30 && Char.getMyChar().clevel <= 39) {
			return "35";
		} else if (Char.getMyChar().clevel >= 40 && Char.getMyChar().clevel <= 49) {
			return "45";
		} else if (Char.getMyChar().clevel >= 50 && Char.getMyChar().clevel <= 59) {
			return "55";
		} else if (Char.getMyChar().clevel >= 60 && Char.getMyChar().clevel <= 69) {
			return "65";
		} else if (Char.getMyChar().clevel >= 70 && Char.getMyChar().clevel <= 89) {
			return "75";
		} else if (Char.getMyChar().clevel >= 90) {
			return "95";
		}

		return "";
	}

	private boolean check_dan(ItemTemplate var28) {
		Char var3 = Char.getMyChar();
		for (int var8 = 0; var8 < var3.vEff.size(); var8++) {
			Effect var10;
			if (((var10 = (Effect) var3.vEff.elementAt(var8)) != null) && (var10.template.iconId == var28.iconID)) {
				return true;
			}
		}
		return false;
	}

	private void autodan() {
		if (MenuHangDong.autodan) {
			if ((!check_dan(ItemTemplates.get((short) 275))) && (Char.f(275) != null)) {
				Service.gI().useItem(Char.f(275).indexUI);
				NSOT_MOB.a(200L);
				check_dan(ItemTemplates.get((short) 275));
				return;
			}
			if ((!check_dan(ItemTemplates.get((short) 276))) && (Char.f(276) != null)) {
				Service.gI().useItem(Char.f(276).indexUI);
				NSOT_MOB.a(200L);
				check_dan(ItemTemplates.get((short) 276));
				return;
			}
			if ((!check_dan(ItemTemplates.get((short) 277))) && (Char.f(277) != null)) {
				Service.gI().useItem(Char.f(277).indexUI);
				NSOT_MOB.a(200L);
				check_dan(ItemTemplates.get((short) 277));
				return;
			}
			if ((!check_dan(ItemTemplates.get((short) 278))) && (Char.f(278) != null)) {
				Service.gI().useItem(Char.f(278).indexUI);
				NSOT_MOB.a(200L);
				check_dan(ItemTemplates.get((short) 278));
				return;
			}
		}
	}

	protected void update() {
		if (Auto.i()) {
			if (Char.dy) {
				a(true);
				return;
			}
		} else {
			autodan();
			if (GameScr.vParty.size() > 1) {
				Service.gI().outParty();
			}
			if (map() == 157) {
				hang9x();
			} else {
				if (TileMap.mapID == super.b) {
					c(-1);
					c(-1, this.a(true, Char.ec, Char.ed, false));
					return;
				} else {
					a(super.b, super.c, -1, -1);
				}
			}
		}
	}

	private void hang9x() {
		int gio = gettime(11);
		int phut = gettime(12);
		if ((TileMap.mapID != 157) && (TileMap.mapID != 158) && (TileMap.mapID != 159)) {
			if (AutoHangDong.gettime(11) >= MenuHangDong.gio_hd + 2 && AutoHangDong.gettime(12) >= MenuHangDong.phut_hd
					&& AutoHangDong.map() == 157 && lan2) {
				NSOT_MOB.d();
			}
		}
		if (((TileMap.mapID == 157) || (TileMap.mapID == 158) || (TileMap.mapID == 159)) && (Char.et == 0)
				&& ((xongmap1) || (xongmap2) || (xongmap3) || (yenmap1) || (yenmap2) || (yenmap3))) {
			xongmap1 = false;
			xongmap2 = false;
			xongmap3 = false;
			yenmap1 = false;
			yenmap2 = false;
			yenmap3 = false;
			super.b = 157;
		}
		if ((!xongmap1) && (!xongmap2) && (!xongmap3)) {
			if (TileMap.mapID == 157) {
				if ((!phongdz1()) && (yenmap1)) {
					xongmap1 = true;
					NSOT_MOB.a(250L);
					return;
				}
				if ((!yenmap1) && (!phongdz1())) {
					c(199, -1);
					return;
				}
				if (phongdz1()) {
					yenmap1 = true;
					// if ((Class_at.h().l == 892) && (Class_at.h().m == 240)) {
					phongdz();
					// }
					// Class_at.d(892, 240);
					NSOT_MOB.a(250L);
					return;
				}
			} else {
				a(157, -2, -1, -1);
			}
		} else if ((xongmap1) && (!xongmap2) && (!xongmap3)) {
			if (TileMap.mapID == 158) {
				if ((!phongdz1()) && (yenmap2)) {
					xongmap2 = true;
					NSOT_MOB.a(250L);
					return;
				}
				if ((!yenmap2) && (!phongdz1())) {
					c(200, -1);
					return;
				}
				if (phongdz1()) {
					yenmap2 = true;
					// if ((Class_at.h().l == 931) && (Class_at.h().m == 432)) {
					phongdz();
					// return;
					// }
					// Class_at.d(931, 432);
					NSOT_MOB.a(250L);
					return;
				}
			} else {
				a(158, -2, -1, -1);
			}
		} else if ((xongmap1) && (xongmap2) && (!xongmap3)) {
			if (TileMap.mapID == 159) {
				if ((yenmap3) && (!phongdz1())) {
					xongmap3 = true;
					NSOT_MOB.a(250L);
					return;
				}
				if ((!yenmap3) && (!phongdz1())) {
					if ((gio == MenuHangDong.gio_hd)
							|| ((gio == MenuHangDong.gio_hd + 1) && (phut < MenuHangDong.phut_hd))) {
						if (Char.et < 61) {
							c(198, -1);
							return;
						}
						if (System.currentTimeMillis() - this.p >= 30000L) {
							GameScr.addChatPopup("Xong 3 boss!!");
							this.p = System.currentTimeMillis();
							lan1();
							lan2();
						}
					} else {
						c(198, -1);
					}
				}
				if (phongdz1()) {
					yenmap3 = true;
					// if ((Class_at.h().l == 588) && (Class_at.h().m == 600)) {
					phongdz();

					// }
					// Class_at.d(588, 600);
					NSOT_MOB.a(250L);
					return;
				}
			} else {
				a(159, -2, -1, -1);
			}
		} else if ((xongmap1) && (xongmap2) && (xongmap3)) {
			if ((TileMap.mapID != 157) && (TileMap.mapID != 158) && (TileMap.mapID != 159)) {
				a(157, -2, -1, -1);
				return;
			}
			if (System.currentTimeMillis() - this.p >= 30000L) {
				GameScr.addChatPopup("Xong 3 boss");
				this.p = System.currentTimeMillis();
				lan1();
				lan2();
			}
		}
	}

	public static void lan1() {
		int gio = gettime(11);
		int phut = gettime(12);
		if ((lan1) && (!lan2) && (gio == MenuHangDong.gio_hd + 1 && phut == 1)) {
			MyVector locale = new MyVector();
			locale.addElement(Char.getMyChar());
			Service.gI().sendPlayerAttack(new MyVector(), locale, 2);
			lan1 = false;
			NSOT_MOB.d();
			return;
		}
	}

	public static void lan2() {
		if ((lan2) && (!lan1)) {
			NSOT_MOB.d();
			NSOT_MOB.a(1000L);
			Controller.gI().onDisconnected();
			lan2 = false;
		}
	}

	public static boolean phongdz1() {
		for (int i1 = 0; i1 < GameScr.vItemMap.size(); i1++) {
			ItemMap localbt;
			if ((localbt = (ItemMap) GameScr.vItemMap.elementAt(i1)).template.type == 19) {
				return true;
			}
		}
		return false;
	}

	public static void phongdz() {
		int i1 = 115;
		ItemMap localObject = null;
		Char localdh = Char.getMyChar();
		for (int i2 = 0; i2 < GameScr.vItemMap.size(); i2++) {
			ItemMap localbt = (ItemMap) GameScr.vItemMap.elementAt(i2);
			int i3 = distance(localdh.cx, localdh.cy, localbt.xEnd, localbt.yEnd);
			if (((i1 == -1) || (i3 < i1)) && ((NSOT_MOB.a(localbt.template)) || ((localdh.nClass.classId == 1) && (localbt.template.id == 218)))
					&& ((Char.af() > 2) || (localbt.template.type == 19) || ((localbt.template.isUpToUp) && (Char.h(localbt.template.id))))) {
				i1 = i3;
				localObject = localbt;
			}
		}
		if (localObject != null) {
			Service.gI().pickItem(localObject.g);
			Service.gI().pickItem(localObject.g);
		}
	}

	public static int distance(int var0, int var1, int var2, int var3) {
		if ((var0 = (var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3)) <= 0) {
			return 0;
		} else {
			var1 = (var0 + 1) / 2;

			do {
				var2 = var1;
				var1 = var1 / 2 + var0 / (var1 << 1);
			} while (Math.abs(var2 - var1) > 1);

			return var1;
		}
	}

	public String toString() {
		return "Auto hang động " + name();
	}
}

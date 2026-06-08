import java.util.Calendar;

public final class AutoTanSat extends Auto {
	public int o;
	private static boolean p;
	private static boolean q;
	private static long r;
	private long s;
	private static String t;

	public static void a() {
		p = false;
		q = false;
		r = 0L;
		t = "nsotiensv4.com";
	}

	public final void a(int var1, int var2, int var3) {
		super.g();
		super.b = var2;
		super.c = var3;
		super.d = TileMap.g(var2);
		this.o = var1;
		System.currentTimeMillis();
		Class_an.f = false;
		Class_an.g = false;
		Class_an.h = false;
		Class_an.i = false;
		Class_an.j = false;
		Class_an.k = false;
		p = NSOT_MOB.k;
		q = Class_an.b;
	}

	public final void update() {
		
		Calendar var3;
		int var4 = (var3 = Res.c()).get(11);
		int var5 = var3.get(12);
		if (Auto.i()) {
			Auto.a(true);
			return;
		} else {
			if (MenuHangDong.autohd) {
				if (AutoHangDong.gettime(11) == MenuHangDong.gio_hd
						&& AutoHangDong.gettime(12) == MenuHangDong.phut_hd) {
					if (AutoHangDong.map() == 157) {
						AutoHangDong.lan1 = true;
						AutoHangDong.lan2 = false;
					}
					NSOT_MOB.aDong.start();
					NSOT_MOB.a(NSOT_MOB.aDong);
					return;
				}
				if (AutoHangDong.gettime(11) == MenuHangDong.gio_hd + 1
						&& AutoHangDong.gettime(12) == MenuHangDong.phut_hd && AutoHangDong.map() == 157) {
					AutoHangDong.lan1 = false;
					AutoHangDong.lan2 = true;
					NSOT_MOB.aDong.start();
					NSOT_MOB.a(NSOT_MOB.aDong);
					return;
				}
				if (MenuHangDong.autohd_lbhd) {
					if (AutoHangDong.dunglb) {
						NSOT_MOB.aDong.start();
						NSOT_MOB.a(NSOT_MOB.aDong);
						return;
					}
					if (AutoHangDong.gettime(11) == MenuHangDong.gio_hd_lbhd
							&& AutoHangDong.gettime(12) == MenuHangDong.phut_hd_lbhd && Char.h(280)) {
						if (!AutoHangDong.dunglb) {
							Service.gI().useItem(Char.f(280).indexUI);
							NSOT_MOB.a(200L);
						}
					}
				}
			}
			if (!Auto.h && Char.getMyChar().isHuman) {
				c();
				return;
			}

			

			if (super.b == TileMap.mapID && super.c == TileMap.zoneID) {
				if (Char.dn && NSOT_MOB.j() && Char.af() < 6 && !TileMap.e(TileMap.mapID)) {
					j();
					return;
				}

				this.c(this.o, this.a(true, Char.ec, Char.ed, false));
				if (Char.dn) {
					if (Char.af() >= 6) {
						this.c(-1);
					}
				} else {
					this.c(-1);
				}

				return;
			}

			this.a(super.b, super.c, super.e, super.f);
		}

	}

	public final String toString() {
		String var1 = " ";
		if (TileMap.mapID == 157 || TileMap.mapID == 158 || TileMap.mapID == 159) {
			var1 = " hd9x s2!";
		}

		return this.o >= 0 && this.o < Mob.arrMobTemplate.length
				? t + " Tàn sát " + Mob.arrMobTemplate[this.o].name + (Class_an.b ? "| hd9x" : " ") + var1
						+ (NSOT_MOB.ad ? "| (đang bật pk)" : " ") + (Class_an.m ? "| lbhd" : "")
				: t + "- Tàn sát" + (Class_an.b ? "| hd9x" : " ") + (NSOT_MOB.ad ? "| (đang bật pk)" : " ")
						+ (Class_an.m ? "| lbhd" : " ") + var1;
	}

	public static void c() {
		p = false;
		q = false;
		r = 0L;
		t = null;
	}

	static {
		Main.main(24);
		a();
	}
}

public final class AutoPkAm extends Auto {
	private static long o;
	private long p;
	private boolean q = false;

	public final void a(int var1) {
		super.g();
		super.b = NSOT_MOB.nst_idMap;
		super.c = NSOT_MOB.nst_khuDanh;
		super.d = TileMap.g(NSOT_MOB.nst_idMap);
	}

	public final void update() {
		if (TileMap.g(TileMap.mapID)) {
			Controller.gI().onDisconnected();
			return;
		}
		long var1 = (Char.getMyChar().cExpDown > 0L ? Char.getMyChar().cExpDown : Char.getMyChar().ae) * 100L / GameScr.exps[Char.getMyChar().clevel];
		if (Char.getMyChar().cExpDown > 0L && Math.abs(var1) <= 15L || Char.getMyChar().cExpDown <= 0L && Math.abs(var1) >= 0L) {
			if (Char.getMyChar().cPk <= 10 && !this.q) {
				if (Auto.i()) {
					Auto.a(true);
					return;
				}

				if (TileMap.mapID == NSOT_MOB.nst_idMap && TileMap.zoneID == NSOT_MOB.nst_khuCho) {
					if (Char.getMyChar().cx == NSOT_MOB.nst_x && Char.getMyChar().cy == NSOT_MOB.nst_y) {
						if (System.currentTimeMillis() - o >= 300L) {
							MyVector var3 = new MyVector();

							for (int var4 = 0; var4 < GameScr.vCharInMap.size(); ++var4) {
								Char var5;
								if ((var5 = (Char) GameScr.vCharInMap.elementAt(var4)).cHp > 0
										&& Math.abs(Char.getMyChar().cx - var5.cx) <= 50
										&& Math.abs(Char.getMyChar().cy - var5.cy) <= 50 && var3.size() <= Auto.g.maxFight) {
									var3.addElement(var5);
									if (var5.cHp > 0 && Math.abs(Char.getMyChar().cx - var5.cx) <= 50
											&& Math.abs(Char.getMyChar().cy - var5.cy) <= 50) {
										Service.gI().sendPlayerAttack((MyVector) (new MyVector()), (MyVector) var3, (int) 2);
										o = System.currentTimeMillis();
									}
								}
							}
						}

						NSOT_MOB.a(100L);
						return;
					}

					Service.gI().changePk(3);
					Char.b(NSOT_MOB.nst_x, NSOT_MOB.nst_y);
					NSOT_MOB.a(500L);
					return;
				}

				this.a(NSOT_MOB.nst_idMap, NSOT_MOB.nst_khuCho, -1, -1);
				return;
			}

			if (Char.getMyChar().cPk <= 6) {
				this.q = false;
			} else {
				this.q = true;
			}

			if (Auto.i()) {
				Auto.a(true);
				return;
			}

			if (TileMap.mapID != NSOT_MOB.nst_idMap || TileMap.zoneID != NSOT_MOB.nst_khuDanh) {
				this.a(NSOT_MOB.nst_idMap, NSOT_MOB.nst_khuDanh, -1, -1);
				return;
			}

			if (Char.getMyChar().cx != NSOT_MOB.nst_x || Char.getMyChar().cy != NSOT_MOB.nst_y) {
				Service.gI().changePk(3);
				Char.b(NSOT_MOB.nst_x, NSOT_MOB.nst_y);
				NSOT_MOB.a(500L);
				return;
			}

			if (System.currentTimeMillis() - this.p >= 60000L) {
				Service.gI().chat("Da hap diem xong, phe vai");
				this.p = System.currentTimeMillis();
				return;
			}
		} else {
			Service.gI().changePk(0);
			GameScr.addChatPopup("Đã pk âm xong!!");
			NSOT_MOB.d();
		}

	}

	public final String toString() {
		return Class_cd.h + " Đi pk âm";
	}

	public static void a() {
	}

	public static void c() {
		o = 0L;
	}

	static {
		Main.main(54);
		a();
	}
}

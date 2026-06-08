public final class AutoHSXa extends Auto {
	private boolean o;
	private boolean p;
	private static int q;
	private static int r;
	private long s;

	public final void a(int var1, int var2, boolean var3, boolean var4) {
		super.g();
		super.b = var1;
		super.c = var2;
		super.d = TileMap.g(var1);
		this.o = var3;
		this.p = var4;
		super.a = true;
	}

	public final void update() {
		if (Auto.i()) {
			Auto.a(true);
		} else {
			if (GameCanvas.currentScreen instanceof GameScr) {
				if (Char.getMyChar().cx != q || Char.getMyChar().cy != r) {
					this.s = System.currentTimeMillis();
					q = Char.getMyChar().cx;
					r = Char.getMyChar().cy;
				}

				if (System.currentTimeMillis() - this.s >= 30000L && !Auto.i()) {
					this.c(-1, -1);
					ThreadUtil.ThreadCatch(500L);
					Char.c(q, r);
					this.s = System.currentTimeMillis();
				}
			}

			if (super.b != TileMap.mapID || !TileMap.g(super.b) && super.c != TileMap.zoneID) {
				this.a(super.b, super.c, -1, -1);
			} else {
				Char var1 = Char.getMyChar();
				Char var2 = GameScr.vParty.size() > 0 ? ((Party) GameScr.vParty.firstElement()).c : null;
				int var3;
				Skill var4;
				if (this.p && GameScr.vParty.size() > 0 && var1.nClass.classId == 6) {
					label108: for (var3 = 0; var3 < var1.vSkillFight.size(); ++var3) {
						if ((var4 = (Skill) var1.vSkillFight.elementAt(var3)) != null && var4.template.type == 4) {
							if (var4.isCooldown()) {
								break;
							}

							var3 = 0;

							while (true) {
								if (var3 >= GameScr.vParty.size()) {
									break label108;
								}

								Party var5;
								if ((var5 = (Party) GameScr.vParty.elementAt(var3)).charId != var1.charID && var5.c != null
										&& var5.c.cHp <= 0) {
									var3 = var1.cx;
									int var6 = var1.cy;
									Char var7;
									Char.b((var7 = var5.c).cx, var7.cy);
									Service.gI().buffLive(var5.charId);
									var4.lastTimeUseThisSkill = System.currentTimeMillis();
									var4.l = true;
									var1.b(GameScr.s[var4.template.id], 0);
									ThreadUtil.ThreadCatch(1000L);
									Char.b(var3, var6);
									return;
								}

								++var3;
							}
						}
					}
				}

				if (this.o && super.a && GameScr.vParty.size() > 0
						&& ((Party) GameScr.vParty.firstElement()).charId != Char.getMyChar().charID && var2 != null
						&& var1.nClass.classId == 6) {
					for (var3 = 0; var3 < var1.vSkillFight.size(); ++var3) {
						if ((var4 = (Skill) var1.vSkillFight.elementAt(var3)) != null && !var4.isCooldown() && var4.template.type == 2
								&& (var4.template.id < 67 || var4.template.id > 72)) {
							System.currentTimeMillis();

							int var8;
							for (var8 = 0; var8 < var2.vEff.size(); ++var8) {
								var2.vEff.elementAt(var8);
							}

							var8 = var1.cx;
							var3 = var1.cy;
							Char.b(var2.cx, var2.cy);
							ThreadUtil.ThreadCatch(200L);
							Char.b(var2.cx, var2.cy);
							Service.gI().selectSkill(var4.template.id);
							Service.gI().sendUseSkillMyBuff();
							var4.lastTimeUseThisSkill = System.currentTimeMillis();
							var4.l = true;
							var1.b(GameScr.s[var4.template.id], 0);
							ThreadUtil.ThreadCatch(1000L);
							Char.b(var8, var3);
							return;
						}
					}

					return;
				}
			}
		}

	}

	public final String toString() {
		if (this.o && this.p) {
			return "Buff HS Xa";
		} else {
			return this.p ? "HSinh Xa" : "Buff Xa";
		}
	}
}

public abstract class Auto {
	public boolean a;
	public int b;
	public int c;
	public boolean d;
	public int e;
	public int f;
	private int o;
	private int p;
	public static Skill g;
	public static boolean h;
	public int i;
	public long j;
	public long k;
	public Auto l;
	public static boolean m;
	public static MyVector n;
	private static MyVector q;
	private static boolean r;
	private static long s;
	private static MyVector t;
	private static MyVector u;
	private long v = 0L;
	private static MyVector w;
	private int x = -1;
	private long y = 0L;
	private long z;
	private static long lastChangeZone = 0L;
	private long timeChangeZone1 = 0L;

	public static void d() {
		n = new MyVector();
		q = new MyVector();
		r = false;
		s = -1L;
		t = new MyVector();
		u = new MyVector();
		w = new MyVector();
	}

	public static void a(Mob var0) {
		if (var0.isBoss || var0.status != 0 && var0.levelBoss != 3 && var0.maxHp != var0.d().hp) {
			if (!var0.isBoss && var0.levelBoss == 0) {
				if (var0.maxHp == 10 * var0.d().hp) {
					var0.levelBoss = 1;
				} else {
					if (var0.maxHp != 100 * var0.d().hp) {
						return;
					}

					var0.levelBoss = 2;
				}
			}

			if (!n.contains(var0)) {
				n.addElement(var0);
			}
		}

	}

	public static void b(Mob var0) {
		n.removeElement(var0);
	}

	public static void e() {
		n.removeAllElements();
	}

	public static void a(Char var0) {
		if (var0 != Char.getMyChar()) {
			if (q.contains(var0)) {
				if (var0.cTypePk != 3 && var0.killCharId != Char.getMyChar().charID) {
					q.removeElement(var0);
					return;
				}
			} else if (var0.cTypePk == 3 || var0.killCharId == Char.getMyChar().charID) {
				q.addElement(var0);
				if (Class_dw.d() && Res.abs(Char.getMyChar().cx - var0.cx) <= 300
						&& Res.abs(Char.getMyChar().cy - var0.cy) <= 300) {
					Class_dw.e();
				}
			}
		}

	}

	public static void f() {
		q.removeAllElements();
	}

	public void g() {
		this.b = -1;
		this.c = -1;
		this.d = false;
		this.l = null;
		this.i = Char.getMyChar().yen;
		this.j = Char.getMyChar().cEXP;
		this.k = System.currentTimeMillis();
		this.a = false;
		NSOT_MOB.m = -1;
		NSOT_MOB.q = 0;
		g = Char.getMyChar().myskill;
		h = Char.getMyChar().isHuman;
		this.h();
	}

	public static void a(long var0) {
		try {
			Thread.sleep(var0);
		} catch (Exception var3) {
		}

	}

	protected void h() {
		m = false;
		NSOT_MOB.af = System.currentTimeMillis();
	}

	protected static boolean i() {
		return Char.getMyChar().cHp <= 0 || Char.getMyChar().statusMe == 14 || Char.getMyChar().statusMe == 5;
	}

	protected void a(int var1, int var2, int var3, int var4) {
		if ((var1 < 139 || var1 > 148) && TileMap.mapID >= 139 && TileMap.mapID <= 148) {
			j();
		} else {
			if (TileMap.mapID != var1) {
				if (!TileMap.k(var1)) {
					if (TileMap.e(var1)) {
						a(2000L);
					}

					return;
				}

				a(100L);
			}

			if (var2 == -1) {
				if (NSOT_MOB.p) {
					int[] var5 = NSOT_MOB.r;
					NSOT_MOB.q = 0;
					a(this.c = var5[0]);
				} else {
					this.b(var2);
				}
			} else if (var2 >= 0) {
				a(var2);
			}

			if (var3 > 0 && var4 > 0) {
				Char.b(var3, var4);
				c(b(var3, var4));
			}
		}

	}

	protected static void j() {
		Char var0 = Char.getMyChar();
		if (!Char.h(37) && !Char.h(35)) {
			Npc var1;
			if ((var1 = GameScr.i(13)) != null && Math.abs(var1.cx - var0.cx) <= 200
					&& Math.abs(var1.cy - var0.cy) <= 200) {
				Char.b(var1.cx > 200 ? var1.cx - 200 : var1.cx + 200, var1.cy);
			}

			Service.gI().openUIZone();
		} else {
			Char.b(var0.cx, TileMap.d);
		}

		long var3 = System.currentTimeMillis();

		while (var0.cHp > 0 && System.currentTimeMillis() - var3 < 5000L) {
			a(200L);
		}

	}

	protected static void a(boolean var0) {
		Char var1 = Char.getMyChar();
		if (r) {
			if (System.currentTimeMillis() - s < 2000L) {
				return;
			}

			r = false;
		} else if (Char.eg && GameScr.vParty.size() > 0) {
			for (int var2 = 0; var2 < GameScr.vParty.size(); ++var2) {
				Party var3;
				if ((var3 = (Party) GameScr.vParty.elementAt(var2)).charId != var1.charID && var3.c != null && var3.c.cHp > 0
						&& var3.c.nClass.classId == 6) {
					GameScr.addChatPopup("Ch\u1edd h\u1ed3i sinh");
					s = System.currentTimeMillis();
					r = true;
					return;
				}
			}
		}

		n.removeAllElements();
		m = false;
		Class_cl.a = true;
		Service.gI().returnTownFromDead();
		TileMap.h();
		Class_cl.a = false;
	}

	private static void a(int var0) {
		if (TileMap.zoneID != var0) {
			int kdl;
			if ((kdl = Char.g(37)) == -1) {
				kdl = Char.g(35);
			}
			long delay;
			if (kdl != -1) {
				delay = 5100L;
			} else {
				delay = 10100L;
			}

			if (System.currentTimeMillis() - lastChangeZone <= delay) {
				a(100L);
				return;
			}
			Npc var1 = GameScr.i(13);
			if (var1 != null && var1.statusMe != 15) {
				if ((kdl == -1) && (Math.abs(var1.cx - Char.getMyChar().cx) > 22 || Math.abs(var1.cy - Char.getMyChar().cy) > 22)) {
					Char.b(var1.cx, var1.cy);
					a(100L);
				}
			} else {
				if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136
						&& TileMap.mapID != 137) {
					return;
				}

				if (kdl < 0) {
					return;
				}
			}
			if (kdl == -1) {
				kdl = -1;
			}
			Class_an.a(var0, kdl);
			TileMap.h1();
			lastChangeZone = System.currentTimeMillis();
		}

	}

	protected final void b(int var1) {
		if (!this.a || NSOT_MOB.d == null || Char.getMyChar().cName.equals(NSOT_MOB.d)) {
			int kdl;
			if ((kdl = Char.g(37)) == -1) {
				kdl = Char.g(35);
			}

			long delay;
			if (kdl != -1) {
				delay = 5100L;
			} else {
				delay = 10000L;
			}
			if (System.currentTimeMillis() - timeChangeZone1 <= delay) {
				this.c = TileMap.zoneID;
				a(100L);
				return;
			}
			GameScr var2 = GameScr.gI();
			Npc var3 = GameScr.i(13);
			if (var3 != null && var3.statusMe != 15) {
				if ((kdl == -1) && (Math.abs(var3.cx - Char.getMyChar().cx) > 22 || Math.abs(var3.cy - Char.getMyChar().cy) > 22)) {
					Char.b(var3.cx, var3.cy);
					a(100L);
				}
			} else {
				if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136
						&& TileMap.mapID != 137) {
					this.c = TileMap.zoneID;
					return;
				}
			}
			if (kdl != -1) {
				var2.fj();
			} else {
				kdl = -1;
				Service.gI().openUIZone();
			}
			int var5 = -1;
			for (var5 = 0; var5 < 50; ++var5) {
				a(100L);
				if (var2.cx != null) {
					break;
				}
			}
			if (var2.cx == null) {
				this.c = TileMap.zoneID;
				return;
			}
			var5 = -1;
			if (var1 < 0) {
				var1 = var2.cx.length - 1;
			} else if (var1 >= var2.cx.length) {
				var1 = 0;
			}

			if (this instanceof TaskTaThuAuto) {
				var5 = (var1 / 5 + 1) * 5 % var2.cx.length;
			} else {
				int var6 = -1;

				for (int var7 = (var1 + 1) % var2.cx.length; var7 != var1; var7 = (var7 + 1) % var2.cx.length) {
					if (var6 == -1 || var2.cx[var7] < var6) {
						var5 = var7;
						var6 = var2.cx[var7];
					}
				}
			}

			Service.gI().requestChangeZone(var5, kdl);
			TileMap.h1(); // fix khu
			this.c = var5;
			if (this.a()) {
				Service.gI().chatParty("khu " + var5);
			}
			timeChangeZone1 = System.currentTimeMillis();
		}

	}

	private static boolean a(Mob var0, int var1) {
		return var0.templateId == 202 && var0.status == 8 ? false : var1 < 0 || var0.templateId == var1;
	}

	private static boolean a(int var0, int var1) {
		return var1 < 0 || var0 == 0 && (var1 & 1) > 0 || var0 == 1 && (var1 & 2) > 0 || var0 == 2 && (var1 & 4) > 0
				|| var0 == 3 && (var1 & 8) > 0;
	}

	public final int a(boolean var1, boolean var2, boolean var3, boolean var4) {
		if (this.d) {
			return -1;
		} else {
			int var5 = 0;
			if (var1) {
				var5 = 1;
			}

			if (var2) {
				var5 |= 2;
			}

			if (var3) {
				var5 |= 4;
			}

			return var5 == 0 ? 1 : var5;
		}
	}

	private void c(Mob var1) {
		if (var1 != null) {
			int var2 = var1.xFirst;
			int var3 = var1.yFirst;
			Char var4 = Char.getMyChar();
			if (TileMap.mapID == 35) {
				if (var1.xFirst == 1428 && var1.yFirst == 528) {
					var2 = 1452;
					var3 = 552;
				} else if (var1.xFirst == 1284 && var1.yFirst == 528) {
					var2 = 1308;
					var3 = 552;
				} else if (var1.xFirst == 1836 && var1.yFirst == 648) {
					var2 = 1812;
					var3 = 672;
				}
			} else if (TileMap.mapID == 37) {
				if ((var1.xFirst == 876 || var1.xFirst == 900) && var1.yFirst == 408) {
					var2 = 900;
					var3 = 432;
				} else if ((var1.xFirst == 828 || var1.xFirst == 852) && var1.yFirst == 360) {
					var2 = 852;
					var3 = 384;
				} else if ((var1.xFirst == 924 || var1.xFirst == 876) && var1.yFirst == 624) {
					var2 = 924;
					var3 = 648;
				} else if (var1.xFirst == 732 && var1.yFirst == 600 || var1.xFirst == 756 && var1.yFirst == 576) {
					var2 = 756;
					var3 = 600;
				}
			}

			if (Char.c(var2, var3)) {
				this.o = this.e;
				this.p = this.f;
				this.e = var4.cx;
				this.f = var4.cy;
				var4.mobFocus = var1;
				Class_an.a(50L); // fix speed từ 200 -> 50
				return;
			}

			var4.mobFocus = null;
		}

	}

	private static void d(Mob var0) {
		MyVector var1 = new MyVector();
		if (var0 != null && Char.c(var0.xFirst, var0.yFirst)) {
			Char.getMyChar().mobFocus = var0;
			var1.addElement(Char.getMyChar().mobFocus);
			Skill var2 = Char.getMyChar().myskill;
			if (System.currentTimeMillis() - var2.lastTimeUseThisSkill >= (long) var2.coolDown) {
				var2.lastTimeUseThisSkill = System.currentTimeMillis();
				Service.gI().sendPlayerAttack((MyVector) var1, (MyVector) (new MyVector()), (int) 1);
				var2.l = true;
				Char var10000 = Char.getMyChar();
				var10000.cMP -= var2.manaUse;
				if (Char.getMyChar().cMP < 0) {
					Char.getMyChar().cMP = 0;
				}

				if (!NSOT_MOB.aj) {
					Char.getMyChar().b(GameScr.s[var2.template.id], 0);
				}
			}
		}

	}

	public static void a(SkillPaint var0) {
		if (t.size() > 0 || u.size() > 0) {
			EffectPaint[] var1 = new EffectPaint[t.size() + u.size()];

			int var2;
			for (var2 = 0; var2 < t.size(); ++var2) {
				var1[var2] = new EffectPaint();
				var1[var2].effCharPaint = GameScr.v[var0.id - 1];
				var1[var2].eMob = (Mob) t.elementAt(var2);
			}

			for (var2 = 0; var2 < u.size(); ++var2) {
				var1[var2 + t.size()] = new EffectPaint();
				var1[var2 + t.size()].effCharPaint = GameScr.v[var0.id - 1];
				var1[var2 + t.size()].eChar = (Char) u.elementAt(var2);
			}

			if (var1.length > 1) {
				mResources var3 = new mResources();
				if (var1[0].eMob != null) {
					var3 = new mResources(var1[0].eMob.x, var1[0].eMob.y);
				} else if (var1[0].eChar != null) {
					var3 = new mResources(var1[0].eChar.cx, var1[0].eChar.cy);
				}

				MyVector var4 = new MyVector();

				for (int var5 = 1; var5 < var1.length; ++var5) {
					if (var1[var5].eMob != null) {
						var4.addElement(new mResources(var1[var5].eMob.x, var1[var5].eMob.y));
					} else if (var1[var5].eChar != null) {
						var4.addElement(new mResources(var1[var5].eChar.cx, var1[var5].eChar.cy));
					}

					if (var5 > 5) {
						break;
					}
				}

				Class_dw.a(var4, var3, Char.getMyChar().w());
			}

			Char.getMyChar().fv = var1;
		}

	}

	private boolean a() {
		return this.a && GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID;
	}

	private void c() {
		if (NSOT_MOB.p) {
			a(this.c = NSOT_MOB.r[NSOT_MOB.q = (NSOT_MOB.q + 1) % NSOT_MOB.r.length]);
			if (this.a()) {
				Service.gI().chatParty("khu " + this.c);
				return;
			}
		} else {
			this.b(TileMap.zoneID);
		}

	}

	private boolean a(int var1, int var2, int var3) {
		if (var1 >= 4) {
			return false;
		} else {
			for (int var4 = 0; var4 < n.size(); ++var4) {
				Mob var5;
				if ((var5 = (Mob) n.elementAt(var4)).levelBoss != 0 && var5.hp > 0 && var5.status != 0) {
					boolean var6;
					label71: {
						if (var5.levelBoss == 3) {
							if (this instanceof TaskTaThuAuto || this instanceof AutoAttack) {
								var6 = false;
								break label71;
							}
						} else if ((!var5.isBoss || (var1 & 6) == 6) && (var5.levelBoss != 1 || (var1 & 2) != 0)
								&& (var5.levelBoss != 2 || (var1 & 4) != 0)) {
							var6 = false;
							break label71;
						}

						var6 = true;
					}

					if (var6 && Res.abs(var2 - var5.xFirst) <= 100 && Res.abs(var3 - var5.yFirst) <= 100) {
						return true;
					}
				} else {
					n.removeElement(var5);
					--var4;
				}
			}

			return false;
		}
	}

	private boolean d(int var1, int var2) {
		if (Char.eh && !(this instanceof TaskTaThuAuto)) {
			for (int var3 = 0; var3 < q.size(); ++var3) {
				Char var4 = (Char) q.elementAt(var3);
				if (Res.abs(var1 - var4.cx) <= 300 && Res.abs(var2 - var4.cy) <= 300) {
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	protected static Mob b(int var0, int var1) {
		Mob var2 = null;
		Char var3 = Char.getMyChar();
		int var4 = var0 - var3.c() - 10;
		int var5 = var0 + var3.c() + 10;
		int var6 = var1 - var3.d() - (var3.nClass.classId != 0 && var3.nClass.classId != 1 && var3.nClass.classId != 3 && var3.nClass.classId != 5 ? 0 : 40);
		int var7;
		if ((var7 = var1 + var3.d()) > var1 + 30) {
			var7 = var1 + 30;
		}

		int var8 = -1;

		for (int var9 = 0; var9 < GameScr.vMobAttack.size(); ++var9) {
			Mob var10 = (Mob) GameScr.vMobAttack.elementAt(var9);
			int var11 = Math.abs(var0 - var10.x);
			int var12 = Math.abs(var1 - var10.y);
			var11 = var11 > var12 ? var11 : var12;
			if (var4 <= var10.x && var10.x <= var5 && var6 <= var10.y && var10.y <= var7 && var10.status != 0 && var10.status != 1
					&& (var8 == -1 || var11 < var8)) {
				var2 = var10;
				var8 = var11;
			}
		}

		return var2;
	}

	protected final void a(int var1, boolean var2) {
		if (NSOT_MOB.m < 0 || NSOT_MOB.m >= NSOT_MOB.n.size()) {
			NSOT_MOB.m = 0;
		}

		while (true) {
			int var3 = ((Integer) NSOT_MOB.n.elementAt(NSOT_MOB.m)).intValue();
			int var4 = ((Integer) NSOT_MOB.o.elementAt(NSOT_MOB.m)).intValue();
			Mob var5 = b(var3, var4);
			if (!this.a(var1, var3, var4) && !this.d(var3, var4) && var5 != null && !this.a(var1, var5.x, var5.y)) {
				this.o = Char.getMyChar().cx;
				this.p = Char.getMyChar().cy;
				Char.b(var3, var4);
				Char.getMyChar().mobFocus = var5;
				Service.gI().sendAttackMobFast(var5.mobId);
				a(100L);
				return;
			}

			if (++NSOT_MOB.m == NSOT_MOB.n.size()) {
				NSOT_MOB.m = 0;
				if (Char.dz && var2) {
					this.c();
				}
			}
		}
	}

	protected Mob a(Char var1, int var2, int var3, Char var4, boolean var5) {
		if (NSOT_MOB.l && NSOT_MOB.n.size() > 0) {
			this.a(var3, var5);
			return b(var1.cx, var1.cy);
		} else {
			Char var6 = var4;
			int var7 = var3;
			int var8 = var2;
			var3 = var1.cy;
			var2 = var1.cx;
			Auto var9 = this;
			int var10 = -1;
			int var11 = -1;
			int var12 = -1;
			Mob var13 = null;
			MyVector var14 = GameScr.vMobAttack;
			int var15 = 0;

			Mob var16;
			int var17;
			while (true) {
				if (var15 >= var14.size()) {
					var16 = var13;
					break;
				}

				Mob var18;
				if ((var18 = (Mob) var14.elementAt(var15)) != null && var18.hp > 0 && var18.status != 0 && var18.status != 1
						&& a(var18, var8) && a(var18.levelBoss, var7)
						&& (var6 == null || var6.charID == Char.getMyChar().charID
								|| Res.a(var18.xFirst, var18.yFirst, var6.cx, var6.cy) <= 1000)
						&& !var9.a(var7, var18.x, var18.y) && !var9.d(var18.x, var18.y)) {
					if (var9.d) {
						if (var9.b != 157 && var9.b != 158 && var9.b != 159) {
							if (var10 == -1 || var18.levelBoss < var12 || var18.yFirst < var10
									|| var18.yFirst == var10 && var18.xFirst < var11) {
								var12 = var18.levelBoss;
								var10 = var18.yFirst;
								var11 = var18.xFirst;
								var13 = var18;
							}
						} else if (var18.isBoss) {
							var16 = var18;
							break;
						}
					} else if (NSOT_MOB.h == -1 || Res.a(NSOT_MOB.i, NSOT_MOB.j, var18.xFirst, var18.yFirst) <= NSOT_MOB.h) {
						int var19 = var7;
						var17 = var8;
						MyVector var20 = var14;
						Mob var21 = var18;
						int var22 = 0;

						int var23;
						for (var23 = 0; var23 < var20.size(); ++var23) {
							Mob var24;
							if ((var24 = (Mob) var20.elementAt(var23)) != null && var24.hp > 0 && var24.status != 0
									&& var24.status != 1 && a(var21, var17) && a(var21.levelBoss, var19)
									&& Res.abs(var24.x - var21.x) <= 100 && Res.abs(var24.y - var21.y) <= 50) {
								++var22;
							}
						}

						if (var22 > g.maxFight) {
							var22 = g.maxFight;
						}

						var22 = var21.levelBoss << 4 | var22 & 15;
						var23 = var6 != null && var6.charID != Char.getMyChar().charID ? Res.a(var6.cx, var6.cy, var18.xFirst, var18.yFirst)
								: Res.a(var2, var3, var18.xFirst, var18.yFirst);
						if (var22 > var12 || var22 == var12 && var23 < var10) {
							var12 = var22;
							var10 = var23;
							var13 = var18;
						}
					}
				}

				++var15;
			}

			if (var16 != null) {
				// fix speed
				this.c(var16);
				return var16;
			} else {
				if (System.currentTimeMillis() - this.v > 1000L) {
					var9 = this;
					boolean var25;
					if (!(this instanceof TaskTaThuAuto) && !NSOT_MOB.k) {
						Char var26 = Char.getMyChar();
						var3 = NSOT_MOB.g < 0 ? -1 : NSOT_MOB.g;
						var8 = 0;

						while (true) {
							if (var8 >= GameScr.vItemMap.size()) {
								var25 = false;
								break;
							}

							ItemMap var27 = (ItemMap) GameScr.vItemMap.elementAt(var8);
							if ((var26.nClass.classId == 1 && var27.template.id == 218 || var27.template.type == 19
									|| NSOT_MOB.a(var27.template) && (Char.af() > 2 || var27.template.isUpToUp && Char.h(var27.template.id)))
									&& (var3 < 0 || Res.a(var26.cx, var26.cy, var27.xEnd, var27.yEnd) < var3)
									&& !var9.d(var27.x, var27.y)) {
								var25 = true;
								break;
							}

							++var8;
						}
					} else {
						var25 = false;
					}

					if (!var25) {
						if (this.d) {
							if ((var17 = TileMap.h(TileMap.mapID)) >= 0) {
								this.b = var17;
							}

							this.e = this.f = -1;
							a(500L);
						} else if (var5 && Char.dz) {
							// fix speed
							this.c();
						}
					}
				}

				return null;
			}
		}
	}

	private void d(int var1) {
		if (this.x >= -1 && var1 == this.x) {
			if (g != null && var1 == g.template.id && System.currentTimeMillis() - this.y > 60000L) {
				Service.gI().selectSkill(this.x = var1);
				this.y = System.currentTimeMillis();
			}
		} else {
			Service.gI().selectSkill(this.x = var1);
		}

	}

	public static Mob k() {
		Mob var0 = null;

		for (int var1 = 0; var1 < GameScr.vMobAttack.size(); ++var1) {
			if (((Mob) GameScr.vMobAttack.elementAt(var1)).status != 0 && ((Mob) GameScr.vMobAttack.elementAt(var1)).status != 1
					&& ((Mob) GameScr.vMobAttack.elementAt(var1)).hp > 0
					&& ((Mob) GameScr.vMobAttack.elementAt(var1)).w != 3) {
				var0 = (Mob) GameScr.vMobAttack.elementAt(var1);
			}
		}

		if (!var0.isBoss && var0.w != 3) {
			d(var0);
		}

		return var0;
	}

	protected final void c(int var1, int var2) {
		Char var3 = Char.getMyChar();
		if (!m()) {
			Char var4 = this.a && GameScr.vParty.size() > 0 ? ((Party) GameScr.vParty.firstElement()).c : null;
			boolean var5 = !this.a || NSOT_MOB.d == null || var3.cName.equals(NSOT_MOB.d) && Class_dw.b();
			Mob var6 = var3.mobFocus;
			if (NSOT_MOB.l && NSOT_MOB.n.size() > 0 && NSOT_MOB.m < 0) {
				this.a(var2, var5);
			} else {
				boolean var7 = false;
				if (this.a(var2, var3.cx, var3.cy) || this.d(var3.cx, var3.cy)
						|| var6 != null && this.a(var2, var6.x, var6.y)) {
					GameScr.addChatPopup("N\u00c3\u00a9");
					boolean var8;
					if (Char.dz && var5) {
						this.c();
						var8 = true;
					} else {
						var8 = false;
					}

					if (var8) {
						return;
					}

					var7 = true;
					var6 = null;
				}

				if (NSOT_MOB.hlct && var3.sysUp >= NSOT_MOB.hlct_hc && System.currentTimeMillis() - this.z > 5000L) {
					Item var9;
					if ((var9 = Char.f(257)) != null && var9.template.id == 257) {
						Service.gI().useItem(var9.indexUI);
					}

					this.z = System.currentTimeMillis();
				}

				if (var6 == null || var6.status == 0 || !a(var6, var1) || !a(var6.levelBoss, var2)
						|| System.currentTimeMillis() - this.v > 5000L) {
					var6 = this.a(var3, var1, var2, var4, var5);
				}

				if (var6 == null && var7 && this.o > 0 && this.p > 0) {
					Char.b(this.o, this.p);
				}

				Char var9;
				int var16;
				if (Char.eg && GameScr.vParty.size() > 0 && var3.nClass.classId == 6 && var3.cHp > 0) {
					for (int var10 = 0; var10 < var3.vSkillFight.size(); ++var10) {
						Skill var11;
						if ((var11 = (Skill) var3.vSkillFight.elementAt(var10)) != null && var11.template.type == 4) {
							if (!var11.isCooldown()) {
								for (var16 = 0; var16 < GameScr.vParty.size(); ++var16) {
									Party var12;
									if ((var12 = (Party) GameScr.vParty.elementAt(var16)).charId != var3.charID && var12.c != null
											&& var12.c.cHp <= 0) {
										var9 = var12.c;
										if (Math.abs(var3.cx - var9.cx) > 50 || Math.abs(var3.cy - var9.cy) > 50) {
											a(500L);
											Char.b(var9.cx, var9.cy);
										}

										a(1000L);
										Service.gI().buffLive(var12.charId);
										var11.lastTimeUseThisSkill = System.currentTimeMillis();
										var11.l = true;
										var3.b(GameScr.s[var11.template.id], 0);
										a(1000L);
										return;
									}
								}
							}
							break;
						}
					}
				}

				if (Char.ea && !this.d && (var6 == null || var6.levelBoss == 0 && (var2 & 6) != 0)) {
					boolean var17 = (var2 & 2) != 0;
					var5 = (var2 & 4) != 0;

					for (var16 = 0; var16 < n.size(); ++var16) {
						Mob var19;
						if ((var19 = (Mob) n.elementAt(var16)).hp > 0 && var19.status != 0 && var19.status != 1
								&& !this.a(var2, var19.x, var19.y) && !this.d(var19.x, var19.y) && a(var19, var1)
								&& (var17 && var19.levelBoss == 1 || var5 && var19.levelBoss == 2)) {
							var6 = var19;
							this.c(var19);
							break;
						}
					}
				}

				if (g != null && var6 != null && (var1 == -1 || var6.templateId == var1) && a(var6.levelBoss, var2)) {
					Skill var18 = g;
					int var20;
					int var21;
					if (g.isCooldown()) {
						if (Char.isAFood) {
							label496: {
								var20 = 0;
								Skill var13;
								label389: while (true) {
									if (var20 >= var3.vSkillFight.size()) {
										break label496;
									}

									if ((var13 = (Skill) var3.vSkillFight.elementAt(var20)) != null
											&& System.currentTimeMillis() - var13.lastTimeUseThisSkill >= (long) var13.coolDown - 300L) {
										if (var13.template.type == 2) {
											if ((var13.template.id < 67 || var13.template.id > 72) && (Char.isABuff || var13.template.id != 31)
													&& (var13.template.id != 15
															|| Char.isAResuscitate && var3.cHp < var3.cMaxHp * Char.ek / 100)) {
												var21 = (int) (System.currentTimeMillis() / 1000L);
												int var14 = 0;

												while (true) {
													if (var14 >= var3.vEff.size()) {
														break label389;
													}

													Effect var15;
													if ((var15 = (Effect) var3.vEff.elementAt(var14)) != null
															&& (var15.template.iconId == var13.template.iconId
																	|| var13.template.id == 58 && var15.template.type == 7)
															&& var15.timeLenght - (var21 - var15.timeStart) >= 2) {
														break;
													}

													++var14;
												}
											}
										} else if (var13.template.type == 3 && var6.levelBoss == 0 && var6.hp > var6.maxHp / 2) {
											if (var13.template.id != 4 || Char.isAResuscitate && var3.cHp < var3.cMaxHp * Char.ek / 100) {
												break;
											}
										} else if ((var13.template.id == 7 || var13.template.id == 16 || var13.template.id == 25
												|| var13.template.id == 34 || var13.template.id == 43)
												&& (var6.levelBoss != 0 || var6.hp >= var6.maxHp / 2)
												&& (var13.template.id != 7 && var13.template.id != 16 || !var6.isFire)
												&& (var13.template.id != 25 && var13.template.id != 34 || var6.isIce)
												&& (var13.template.id != 43 || var6.isWind)) {
											break;
										}
									}

									++var20;
								}

								var18 = var13;
							}
						}
						if (Char.isAPickYen) {
							for (int i = 0; i < var3.vSkillFight.size(); i++) {
								Skill var13 = (Skill) var3.vSkillFight.elementAt(i);
								if (var13 != null && var13.template.id >= 67 && var13.template.id <= 72) {
									if (System.currentTimeMillis() - var13.lastTimeUseThisSkill >= var13.coolDown) {
										var18 = var13;
										break;
									}
								}
							}
						}
					}

					if ((var18.template.type == 1 || var18.template.type == 3) && (Res.abs(var3.cx - var6.xFirst) > var18.dx + 30
							|| Res.abs(var3.cy - var6.yFirst) > var18.dy + 30)) {
						var3.mobFocus = null;
						a(200L);
						return;
					}

					if (var18.template.type == 2) {
						this.d(var18.template.id);
						Service.gI().sendUseSkillMyBuff();
						a(200L);
					} else {
						var20 = var18.dx;
						var16 = var18.dy;
						t.removeAllElements();
						u.removeAllElements();
						if (var6 != null && System.currentTimeMillis() - var18.lastTimeUseThisSkill >= (long) var18.coolDown + 35L) {
							t.addElement(var6);

							for (var21 = 0; var21 < GameScr.vMobAttack.size() && t.size() + u.size() < var18.maxFight; ++var21) {
								Mob var22;
								if ((var22 = (Mob) GameScr.vMobAttack.elementAt(var21)).status != 0 && var22.status != 1
										&& !var22.equals(var6) && var6.xFirst - 100 <= var22.xFirst && var22.xFirst <= var6.xFirst + 100
										&& var6.yFirst - 50 <= var22.yFirst && var22.yFirst <= var6.yFirst + 50 && a(var22.levelBoss, var2)
										&& (var1 == -1 || var22.templateId == var1)) {
									t.addElement(var22);
								}
							}

							for (var21 = 0; var21 < GameScr.vCharInMap.size() && t.size() + u.size() < var18.maxFight; ++var21) {
								if ((var9 = (Char) GameScr.vCharInMap.elementAt(var21)).statusMe != 14 && var9.statusMe != 5
										&& var9.statusMe != 15
										&& (var9.cTypePk == 3 || var3.cTypePk == 3 || var9.cTypePk == 1 && var3.cTypePk == 1
												|| var3.killCharId >= 0 && var3.killCharId == var9.charID
												|| var3.testCharId >= 0 && var3.testCharId == var9.charID)
										&& !NSOT_MOB.c(var9.cName) && var6.x - var20 <= var9.cx && var9.cx <= var6.x + var20
										&& var6.y - var16 <= var9.cy && var9.cy <= var6.y + var16) {
									u.addElement(var9);
								}
							}

							this.d(var18.template.id);
							Service.gI().sendPlayerAttack((MyVector) t, (MyVector) u, (int) 1);
						}
					}

					if (System.currentTimeMillis() - var18.lastTimeUseThisSkill >= (long) var18.coolDown + 50L) {
						// fix speed
						var18.lastTimeUseThisSkill = System.currentTimeMillis();
						var18.l = true;
						var3.cMP -= var18.manaUse;
						if (var3.cMP < 0) {
							var3.cMP = 0;
						}

						if (!NSOT_MOB.aj) {
							var3.b(GameScr.s[var18.template.id], 0);
						}
					}

					this.v = System.currentTimeMillis();
					if (var18.template.id == 15) {
						a(2000L);
					}
				}
			}
		}

	}

	protected final void c(int var1) {
		if (!NSOT_MOB.k) {
			Char var2 = Char.getMyChar();
			if (!m()) {
				w.removeAllElements();
				int var3 = this.a(true, Char.ec, Char.ed, false);

				int var4;
				for (var4 = 0; var4 < GameScr.vItemMap.size(); ++var4) {
					ItemMap var5;
					if (!(var5 = (ItemMap) GameScr.vItemMap.elementAt(var4)).k
							&& (var2.nClass.classId == 1 && var5.template.id == 218 || (NSOT_MOB.a(var5.template) || var5.template.id == -1)
									&& (Char.af() > 2 || var5.template.type == 19 || var5.template.isUpToUp && Char.h(var5.template.id)))
							&& !this.a(var3, var5.xEnd, var5.yEnd)
							&& (NSOT_MOB.h < 0 || Math.abs(NSOT_MOB.i - var5.xEnd) < NSOT_MOB.h
									&& Math.abs(NSOT_MOB.j - var5.yEnd) < NSOT_MOB.h)
							&& !this.d(var5.xEnd, var5.yEnd)
							&& (NSOT_MOB.g < 0 || Res.a(var2.cx, var2.cy, var5.xEnd, var5.yEnd) < NSOT_MOB.g || this.o > 0
									&& this.p > 0 && Res.a(this.o, this.p, var5.xEnd, var5.yEnd) < NSOT_MOB.g)) {
						w.addElement(var5);
					}
				}

				if (w.size() > 0) {
					var4 = var2.cx;
					int var10 = var2.cy;
					Mob var6 = var2.mobFocus;

					label64: for (int var7 = 0; var7 < w.size(); ++var7) {
						ItemMap var8 = (ItemMap) w.elementAt(var7);
						a(100L);
						Char.b(var8.xEnd, TileMap.d(var8.xEnd, var8.yEnd));
						a(100L);
						var2.itemFocus = var8;

						for (int var9 = 0; var9 < 4 && var8.i != 2 && !var8.k; ++var9) {
							Service.gI().pickItem(var8.g);
							if (Class_dw.a()) {
								break;
							}

							if (this.d(var2.cx, var2.cy) || var2.cHp <= 0) {
								break label64;
							}
						}

						var8.k = true;
						var8.l = System.currentTimeMillis();
					}

					a(100L);
					Char.b(var4, var10);
					a(100L);
					var2.mobFocus = var6;
				}
			}
		}

	}

	private static boolean m() {
		Char var0;
		if ((var0 = Char.getMyChar()).isHuman && var0.cHp < var0.cMaxHp) {
			for (int var1 = 0; var1 < var0.vEff.size(); ++var1) {
				Effect var2;
				if ((var2 = (Effect) var0.vEff.elementAt(var1)) != null && var2.template.type == 12) {
					return true;
				}
			}
		}

		return false;
	}

	protected abstract void update();

	public String toString() {
		return "";
	}

	public static void l() {
		g = null;
		h = false;
		m = false;
		n = null;
		q = null;
		r = false;
		s = 0L;
		t = null;
		u = null;
		w = null;
	}

	static {
		Class_dw.a(52);
		d();
	}
}

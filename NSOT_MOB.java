import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Vector;
import javax.microedition.lcdui.Display;

public final class NSOT_MOB implements Runnable {
   public static NSOT_MOB mod_nst;
   private static boolean av;
   private static Thread aw;
   public static Auto b;
   private static AutoTanSat ax;
   public static TaskAuto c;
   private static TaskTaThuAuto ay;
   private static AutoAttack az;
   private static AutoHSXa ba;
   private static AutoPkAm bb;
   private static Class_af bc;
   private static AutoAttackPk bd;
   public static String d;
   public static MyVector e;
   private static long be;
   public static short[] f;
   public static int g;
   public static int h;
   public static int i;
   public static int j;
   public static boolean k;
   public static boolean l;
   public static int m;
   public static MyVector n;
   public static MyVector o;
   public static boolean p;
   public static int q;
   public static int[] r;
   public static boolean s;
   public static int t;
   public static int u;
   public static int v;
   private static boolean bf;
   public static int w;
   public static int x;
   public static int y;
   public static int nst_khuDanh;
   public static int nst_khuCho;
   public static int nst_idMap;
   public static int nst_x;
   public static int nst_y;
   public static long ac;
   public static String ae;
   private long bg;
   private static long bh;
   private static MyVector bi;
   private static MyVector bj;
   private static MyVector bk;
   private static MyVector bl;
   public static long af;
   public static long ag;
   public static long ah;
   public static boolean ai;
   public static boolean aj;
   public static boolean ak;
   public static int al;
   public static boolean am;
   public static int an;
   public static boolean ao;
   public static int ap;
   public static boolean aq;
   public static int ar;
   public static boolean as;
   private static String[] bm;
   private static int bn = -1;
   private static int bo = -1;
   private static long bp;
   public static long at = 10000L;
   private static int bq;
   private static int br;
   private static long bs;
   public static boolean au = mResources.d("nstconnect") == 1;
   public static boolean ad = mResources.d("nstglv") == 1;
   public static int hlct_hc = 0;
   public static boolean hlct;
   public static AutoHangDong aDong = new AutoHangDong();
   public String ref;
   public String rou;
   public String ref_ip_1;
   public String rou_ip_1;
   public String ref_ip_2;
   public String rou_ip_2;
   public String ref_ip_3;
   public String rou_ip_3;
   public String ref_ip_4;
   public String rou_ip_4;
   public String ref_ip_5;
   public String rou_ip_5;
   public String ref_ip_6;
   public String rou_ip_6;
   public String ref_ip_7;
   public String rou_ip_7;
   public String ref_ip_8;
   public String rou_ip_8;
   public String ref_ip_9;
   public String rou_ip_9;
   public String ref_ip_10;
   public String rou_ip_10;
   public String ref_ip_11;
   public String rou_ip_11;
   public String ref_ip_01;
   public String rou_ip_01;
   public String ref_ip_02;
   public String rou_ip_02;

   public String ref_name_1;
   public String rou_name_1;
   public String ref_name_2;
   public String rou_name_2;   // HT TEAM ^_^
   public String ref_name_3;
   public String rou_name_3;
   public String ref_name_4;
   public String rou_name_4;
   public String ref_name_5;
   public String rou_name_5;
   public String ref_name_6;
   public String rou_name_6;
   public String ref_name_7;
   public String rou_name_7;
   public String ref_name_8;
   public String rou_name_8;
   public String ref_name_9;
   public String rou_name_9;
   public String ref_name_10;
   public String rou_name_10;
   public String ref_name_11;
   public String rou_name_11;
   public String ref_name_01;
   public String rou_name_01;
   public String ref_name_02;
   public String rou_name_02;

   public NSOT_MOB() {
      this.ref = mResources.ag;
      this.rou = Paint.load;
      this.ref_ip_1 = nsotien_connect.ip_sv1;
      this.rou_ip_1 = Paint.ip_sv1;
      this.ref_ip_2 = nsotien_connect.ip_sv2;
      this.rou_ip_2 = Paint.ip_sv2;
      this.ref_ip_3 = nsotien_connect.ip_sv3;
      this.rou_ip_3 = Paint.ip_sv3;
      this.ref_ip_4 = nsotien_connect.ip_sv4;
      this.rou_ip_4 = Paint.ip_sv4;
      this.ref_ip_5 = nsotien_connect.ip_sv5;
      this.rou_ip_5 = Paint.ip_sv5;
      this.ref_ip_6 = nsotien_connect.ip_sv6;
      this.rou_ip_6 = Paint.ip_sv6;
      this.ref_ip_7 = nsotien_connect.ip_sv7;
      this.rou_ip_7 = Paint.ip_sv7;
      this.ref_ip_8 = nsotien_connect.ip_sv8;
      this.rou_ip_8 = Paint.ip_sv8;
      this.ref_ip_9 = nsotien_connect.ip_sv9;
      this.rou_ip_9 = Paint.ip_sv9;
      this.ref_ip_10 = nsotien_connect.ip_sv10;
      this.rou_ip_10 = Paint.ip_sv10;
      this.ref_ip_11 = nsotien_connect.ip_sv11;
      this.rou_ip_11 = Paint.ip_sv11;
      this.ref_ip_01 = nsotien_connect.ip_sv01;
      this.rou_ip_01 = Paint.ip_sv01;
      this.ref_ip_02 = nsotien_connect.ip_sv02;
      this.rou_ip_02 = Paint.ip_sv02;


      this.ref_name_1 = nsotien_connect.name_sv1;
      this.rou_name_1 = Paint.name_sv1;
      this.ref_name_2 = nsotien_connect.name_sv2;
      this.rou_name_2 = Paint.name_sv2;
      this.ref_name_3 = nsotien_connect.name_sv3;
      this.rou_name_3 = Paint.name_sv3;
      this.ref_name_4 = nsotien_connect.name_sv4;
      this.rou_name_4 = Paint.name_sv4;
      this.ref_name_5 = nsotien_connect.name_sv5;
      this.rou_name_5 = Paint.name_sv5;
      this.ref_name_6 = nsotien_connect.name_sv6;
      this.rou_name_6 = Paint.name_sv6;
      this.ref_name_7 = nsotien_connect.name_sv7;
      this.rou_name_7 = Paint.name_sv7;
      this.ref_name_8 = nsotien_connect.name_sv8;
      this.rou_name_8 = Paint.name_sv8;
      this.ref_name_9 = nsotien_connect.name_sv9;
      this.rou_name_9 = Paint.name_sv9;
      this.ref_name_10 = nsotien_connect.name_sv10;
      this.rou_name_10 = Paint.name_sv10;
      this.ref_name_11 = nsotien_connect.name_sv11;
      this.rou_name_11 = Paint.name_sv11;
      this.ref_name_01 = nsotien_connect.name_sv01;
      this.rou_name_01 = Paint.name_sv01;
      this.ref_name_02 = nsotien_connect.name_sv02;
      this.rou_name_02 = Paint.name_sv02;
   }

   public static void a() {
      String var0 = "1";
      mod_nst = new NSOT_MOB();
      av = false;
      ax = new AutoTanSat();
      c = new TaskAuto();
      ay = new TaskTaThuAuto();
      az = new AutoAttack();
      ba = new AutoHSXa();
      bb = new AutoPkAm();
      bc = new Class_af();
      bd = new AutoAttackPk();
      d = null;
      e = new MyVector();

      try {
         ByteArrayInputStream var1 = new ByteArrayInputStream(mResources.b("V6Group"));
         DataInputStream var2;
         if ((d = (var2 = new DataInputStream(var1)).readUTF()).equals("")) {
            d = null;
         }

         byte var3 = var2.readByte();

         for(int var4 = 0; var4 < var3; ++var4) {
            e.addElement(var2.readUTF());
         }

         var2.close();
         var1.close();
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      be = 0L;
      f = new short[30];
      g = 150;
      h = -1;
      i = -1;
      j = -1;
      k = false;
      l = false;
      n = new MyVector();
      o = new MyVector();
      p = false;
      r = new int[0];
      s = false;
      t = 40;
      u = 20;
      v = 3;
      bf = false;
      w = 0;
      x = 3;
      y = 70;
      nst_khuDanh = -1;
      nst_khuCho = -1;
      nst_idMap = -1;
      nst_x = -1;
      nst_y = -1;
      ac = 0L;
      ae = "";
      bh = 0L;
      bi = new MyVector();
      bj = new MyVector();
      bk = new MyVector();
      bl = new MyVector();

      for(int var8 = 0; var8 < f.length; ++var8) {
         f[var8] = -1;
      }

      af = 0L;
      ag = 0L;
      ah = 0L;
      ai = false;
      aj = false;  // tet
      ak = false;
      al = 5;
      am = true;
      an = 50;
      ao = true;
      ap = 50;
      aq = false;
      ar = 100;
      as = false;
      String var9;
      if ((var9 = mResources.c("time_nhay")) != null) {
         try {
            at = Long.parseLong(var9);
         } catch (NumberFormatException var6) {
         }
      }
      if ((mResources.c("SettingCave")) != null) {
			String[] var91 = d(mResources.c("SettingCave"), ";");
			try {
				MenuHangDong.gio_hd = Integer.parseInt(var91[0]);
				MenuHangDong.phut_hd = Integer.parseInt(var91[1]);
				MenuHangDong.gio_hd_lbhd = Integer.parseInt(var91[2]);
				MenuHangDong.phut_hd_lbhd = Integer.parseInt(var91[3]);
			} catch (NumberFormatException var4) {
			}
		}

      PK_AM_PANEL.c();

      try {
         bm = d(g("text.txt"),  " ");
      } catch (Exception var5) {
         var5.printStackTrace();
         bm = new String[0];
      }

   }

   public final void b() {
      if (!av) {
         if (b != null) {
            b.h();
         }

         bh = System.currentTimeMillis();
         av = true;
         (aw = new Thread(this)).start();
         ChatManager.gI().addChat(mResources.ot[0], "Web nsotiensv4.com", "Shop bán nick, các loại phiên bản hack và mod phiên bản uy tín vận hành bởi Youtube NsoTien Tv, vui lòng chỉ tải tại web tránh keylog hoặc inbox zalo 0378916676");
         Info.canMergeString("Web nsotiensv4.com : Shop bán nick, các loại phiên bản hack và mod phiên bản uy tín vận hành bởi Youtube NsoTien Tv, vui lòng chỉ tải tại web tránh keylog hoặc inbox zalo 0378916676", 150, mFont.tahoma_7b_yellow);
      }

   }

   public static void c() {
      av = false;
      if (aw != null) {
         Class_cl.ac();
         aw.interrupt();
      }

   }

   public static void a(Auto var0) {
      var0.l = b;
      b = var0;
   }

   public static void d() {
      Class_cl.ac();
      b = b.l;
   }

   public final void a(int var1, int var2) {
      ax.a(var1, var2, Char.dv ? -1 : TileMap.zoneID);
      a((Auto)ax);
   }

   public final void e() {
      c.g();
      a((Auto)c);
   }

   public final void f() {
      ay.g();
      a((Auto)ay);
   }

   private void a(boolean var1, boolean var2) {
      ba.a(TileMap.mapID, TileMap.zoneID, var1, var2);
      a((Auto)ba);
   }

   public static void g() {
      Class_cl.ac();
      b = null;
   }

   private static void q() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeUTF(d == null ? "" : d);
         var1.writeByte(e.size());

         for(int var2 = 0; var2 < e.size(); ++var2) {
            var1.writeUTF((String)e.elementAt(var2));
         }

         var1.flush();
         var0.flush();
         mResources.a("V6Group", var0.toByteArray());
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void h() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeUTF(ae.equals("") ? "" : ae);
         var1.flush();
         var0.flush();
         mResources.a("V6xu", var0.toByteArray());
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public final void i() {
      bb.a(-1);
      a((Auto)bb);
   }

   public static void a(long var0) {
      try {
         Thread.sleep(var0);
      } catch (Exception var3) {
      }

   }

   public static boolean a(String var0) {
      if (d != null && !c(var0)) {
         String var1;
         if ((var1 = Char.getMyChar().cName).equals(d)) {
            if (b(var0)) {
               return true;
            }
         } else if (GameScr.vParty.size() > 1 && var1.equals(((Party)GameScr.vParty.firstElement()).name) && var0.equals(d)) {
            return true;
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean b(String var0) {
      for(int var1 = 0; var1 < e.size(); ++var1) {
         if (var0.equals(e.elementAt(var1))) {
            return true;
         }
      }

      return false;
   }

   public static boolean c(String var0) {
      if (var0.equals(Char.getMyChar().cName)) {
         return true;
      } else {
         for(int var1 = 0; var1 < GameScr.vParty.size(); ++var1) {
            if (((Party)GameScr.vParty.elementAt(var1)).name.equals(var0)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean j() {
      for(int var0 = 0; var0 < Char.ep - 1; ++var0) {
         if (Char.i(var0) >= 4) {
            return true;
         }
      }

      return false;
   }

   private static int e(int var0) {
      int var1 = 0;
      Char var2 = Char.getMyChar();

      for(int var3 = 0; var3 < var2.arrItemBag.length; ++var3) {
         Item var4;
         if ((var4 = var2.arrItemBag[var3]) != null && var4.template.type == 18 && var4.template.level == var0) {
            ++var1;
         }
      }

      return var1;
   }

   public static boolean k() {
      return Char.getMyChar().cHp <= 0 || Char.getMyChar().statusMe == 14 || Char.getMyChar().statusMe == 5;
   }

   private void r() {
      if (GameCanvas.currentScreen instanceof GameScr && AutoNhayPanel.a) {
         if (bn != Char.getMyChar().cx || bo != Char.getMyChar().cy) {
            bn = Char.getMyChar().cx;
            bo = Char.getMyChar().cy;
            bp = System.currentTimeMillis();
            return;
         }

         if (System.currentTimeMillis() - bp >= at && !k()) {
            bp = System.currentTimeMillis();
            GameCanvas.n();
            GameScr.gI().resetButton();
            MotherCanvas.instance.tCanvas.keyPressed(-1);
            ThreadSleep.a(250L);
            MotherCanvas.instance.tCanvas.keyReleased(-1);
            ThreadSleep.a(250L);
         }
      }

   }

   public final void run() {
      while(true) {
         try {
            if (av) {
               long var1 = System.currentTimeMillis();

               try {
                  Char var3 = Char.getMyChar();
                  Calendar var4;
                  int var5 = (var4 = Res.c()).get(11);
                  int var6 = var4.get(12);
                  if (!this.ref.equals(this.rou)) {
                     o();
                     Class_cl.ad();
                     b = null;
                  }
                  long exp_now = Char.getMyChar().ae * 100L / GameScr.exps[Char.getMyChar().clevel];
                  if (exp_now >= PK_AM_PANEL.c && NSOT_MOB.ad && !(b instanceof AutoPkAm)) {
      				i();
      				NSOT_MOB.a(500L);
      			}
                  int var7;
                  int var8;
                  int var9;
                  Effect var10;
                  if (b != null) {
                     if (ah > 0L) {
                        long var11;
                        if ((var11 = System.currentTimeMillis()) - af >= ah) {
                           ah = 0L;
                           Class_cl.ac();
                           b = null;
                           Session_ME.instance.cleanNetwork();
                           Controller.gI().onDisconnected();
                           return;
                        }

                        ah -= var11 - af;
                        af = var11;
                     }

                     if (as) {
                        label518: {
                           if (v == x) {
                              if (var5 != v || var6 < w || var6 > y) {
                                 break label518;
                              }
                           } else if ((var5 != v || var6 < w) && (var5 <= v || var5 >= x) && (var5 != x || var6 >= y)) {
                              break label518;
                           }

                           Controller.gI().onDisconnected();
                        }
                     }

                     b.update();
                     if (Char.getMyChar().isHuman == Auto.h && (var3.myskill == null || var3.myskill.template.id != Auto.g.template.id)) {
                        var3.myskill = Auto.g;
                     }

                     if (Char.dx && Auto.m) {
                        Auto.m = false;
                        if (!(b instanceof TaskTaThuAuto) && !TileMap.e(TileMap.mapID)) {
                           Auto.j();
                        }
                     }

                     boolean var21;
                     if (var3.statusMe != 14 && var3.statusMe != 5 && var3.cHp > 0) {
                        if (Char.isAHP && System.currentTimeMillis() - be > 500L && Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.el / 100) {
                           Char.getMyChar().doUsePotion(17);
                           be = System.currentTimeMillis();
                        }

                        if (Char.timeStartBlink && System.currentTimeMillis() - var3.timeBeGinRun > 2000L && Char.getMyChar().cHp < Char.getMyChar().cMaxHp * Char.ek / 100) {
                           var21 = false;
                           var7 = (int)(System.currentTimeMillis() / 1000L);

                           for(var6 = 0; var6 < Char.getMyChar().vEff.size(); ++var6) {
                              if ((var10 = (Effect)Char.getMyChar().vEff.elementAt(var6)).template.id == 21 && var10.timeLenght - (var7 - var10.timeStart) >= 2) {
                                 var21 = true;
                                 break;
                              }
                           }

                           if (!var21) {
                              Char.getMyChar().doUsePotion(16);
                              var3.timeBeGinRun = System.currentTimeMillis();
                           }
                        }
                     }

                     if (var3.sPoint > 0 && Char.ef && Auto.g != null && Auto.g.point < Auto.g.template.maxPoint) {
                        SkillTemplate var12 = Auto.g.template;
                        var7 = 0;

                        for(var6 = Auto.g.point + 1; var6 <= var12.maxPoint && var12.skills[var6].level <= var3.clevel && var7 < var3.sPoint; ++var6) {
                           ++var7;
                        }

                        if (var7 > 0) {
                           GameScr.addChatPopup("Cộng skill " + var12.name + " " + var7 + " điểm");
                           Service.gI().upSkill(var12.id, var7);
                           if (Class_cl.t()) {
                              Session_ME.getInstance().e();
                           }
                        }
                     }

                     if (var3.pPoint > 0 && Char.ee) {
                        var9 = var3.g() ? 3 : 0;
                        if (var3.pPoint >= 100) {
                           GameScr.addChatPopup("Cộng tiềm năng " + mResources.jd[var9] + " 60 điểm, " + mResources.jd[2] + " 40 điểm");
                           Service.gI().upPotential(2, 40);
                           Service.gI().upPotential(var9, 60);
                        } else {
                           GameScr.addChatPopup("Cộng tiềm năng " + mResources.jd[var9] + " " + var3.pPoint + " điểm");
                           Service.gI().upPotential(var9, var3.pPoint);
                        }

                        Class_cl.v();
                     }

                     Item var22;
                     for(var9 = 0; var9 < var3.arrItemBag.length; ++var9) {
                        if (c(var22 = var3.arrItemBag[var9]) && Class_an.n) {
                           var22.u = System.currentTimeMillis();
                           Service.gI().throwItem(var22.indexUI);
                        }
                     }

                     if (TileMap.mapID != 138 && TileMap.e(TileMap.mapID) && Char.isAMP && Char.dw && Char.em <= 50 && Char.af() > 1 && e(Char.em) == 0) {
                        TileMap.j(0);
                        TileMap.h();
                     }

                     if (TileMap.d(TileMap.mapID) || TileMap.f(TileMap.mapID)) {
                        if (Char.dw && Char.af() > 1 && var3.ctaskId > 3 && (var6 = Char.em) <= 50 && e(var6) == 0) {
                           var7 = 2;

                           for(var9 = 0; var9 < var3.vEff.size(); ++var9) {
                              if (((Effect)var3.vEff.elementAt(var9)).template.type == 0) {
                                 --var7;
                                 break;
                              }
                           }

                           GameScr.b(4, 0, 0);
                           if (var6 == 50) {
                              Service.gI().buyItem_food(9, 7, var7);
                           } else {
                              Service.gI().buyItem_food(9, var6 / 10, var7);
                           }

                           Class_cl.h();
                        }

                        if (TileMap.mapID == 138 && Char.af() > 1 && !Char.h(35) && !Char.h(37)) {
                           GameScr.b(4, 0, 0);
                           Service.gI().buyItem_food(9, 6, 1);
                           Class_cl.h();
                        }

                        if (Char.af() < 10) {
                           if (Char.dn && var3.ctaskId > 9 && Char.af() > 0 && j()) {
                              if (var21 = TileMap.f(TileMap.mapID)) {
                                 if ((var22 = Char.f(37)) == null && (var22 = Char.f(35)) == null) {
                                    GameScr.b(4, 0, 0);
                                    Service.gI().buyItem(9, 6, 1);
                                    Class_cl.h();
                                    Thread.sleep(100L);
                                    var22 = Char.f(35);
                                 }

                                 if (var22 != null) {
                                    Service.gI().useItemChangeMap(var22.indexUI, 5);
                                    TileMap.h();
                                 }
                              }

                              if (TileMap.d(TileMap.mapID)) {
                                 GameScr.b(6, 1, 1);
                                 Class_cl.p();
                                 Vector var13 = new Vector();

                                 label429:
                                 for(var6 = 0; var6 < Char.ep - 1; ++var6) {
                                    var13.removeAllElements();

                                    Item var14;
                                    for(var5 = 0; var5 < var3.arrItemBag.length; ++var5) {
                                       if ((var14 = var3.arrItemBag[var5]) != null && var14.template.id == var6) {
                                          var13.addElement(var14);
                                       }
                                    }

                                    while(var13.size() >= 4) {
                                       var5 = 1;

                                       for(var8 = var6; var8 < Char.ep - 1 && GameScr.cr[var8] <= var3.yen && var5 << 2 <= var13.size() && var5 < 16; ++var8) {
                                          var5 <<= 2;
                                       }

                                       if (var5 == 1) {
                                          break label429;
                                       }

                                       GameScr.arrItemUpPeal = new Item[24];

                                       for(var8 = 0; var8 < var5; ++var8) {
                                          var14 = (Item)var13.elementAt(0);
                                          GameScr.arrItemUpPeal[var8] = var14;
                                          var3.arrItemBag[var14.indexUI] = null;
                                          var13.removeElementAt(0);
                                       }

                                       Service.gI().c(GameScr.arrItemUpPeal);
                                       Class_cl.b();
                                       if (GameScr.arrItemUpPeal[0] != null) {
                                          var3.arrItemBag[GameScr.arrItemUpPeal[0].indexUI] = GameScr.arrItemUpPeal[0];
                                       }
                                    }
                                 }

                                 GameCanvas.n();
                              }

                              if (Char.getMyChar().arrItemBox == null) {
                                 Service.gI().requestItem(4);
                                 Class_cl.r();
                              }

                              GameScr.b(5, 0, 0);
                              var7 = 0;

                              for(var6 = Char.ag(); var7 < var3.arrItemBag.length; ++var7) {
                                 Item var25;
                                 if ((var25 = var3.arrItemBag[var7]) != null && var25.template.id == Char.ep - 1 && var6 > 0) {
                                    Service.gI().itemBagToBox(var25.indexUI);
                                    --var6;
                                 }
                              }

                              if (var21) {
                                 Auto.j();
                              }
                           }

                           Service.gI().bagSort();
                           Class_cl.r();
                        }
                     }
                  }

                  if (GameCanvas.currentScreen instanceof GameScr && au) {
                     if (Char.getMyChar().cx != bq || Char.getMyChar().cy != br) {
                        bs = System.currentTimeMillis();
                        bq = Char.getMyChar().cx;
                        br = Char.getMyChar().cy;
                     }

                     if (System.currentTimeMillis() - bs >= 300000L && !Auto.i()) {
                        Auto.k();
                        ThreadUtil.ThreadCatch(500L);
                        Char.c(bq, br);
                        bs = System.currentTimeMillis();
                     }
                  }

                  if (e.size() != 0 && GameScr.vParty.size() == 0 && bf) {
                     Service.gI().createParty();
                  }

                  if (bf && e.size() != 0 && GameScr.vParty.size() > 0 && GameScr.vParty.size() < e.size() + 1 && ((Party)GameScr.vParty.firstElement()).charId == Char.getMyChar().charID && System.currentTimeMillis() - this.bg >= 15000L) {
                     for(var9 = 0; var9 < e.size(); ++var9) {
                        String var23;
                        String var28 = var23 = (String)e.elementAt(var9);
                        boolean var26;
                        if (GameScr.vParty.size() == 1) {
                           var26 = true;
                        } else {
                           label687: {
                              if (GameScr.vParty.size() == 2) {
                                 if (!((Party)GameScr.vParty.elementAt(1)).name.equals(var28)) {
                                    var26 = true;
                                    break label687;
                                 }
                              } else {
                                 Party var15;
                                 Party var30;
                                 if (GameScr.vParty.size() == 3) {
                                    var15 = (Party)GameScr.vParty.elementAt(1);
                                    var30 = (Party)GameScr.vParty.elementAt(2);
                                    if (!var15.name.equals(var28) && !var30.name.equals(var28)) {
                                       var26 = true;
                                       break label687;
                                    }

                                    var26 = false;
                                    break label687;
                                 }

                                 Party var16;
                                 if (GameScr.vParty.size() == 4) {
                                    var15 = (Party)GameScr.vParty.elementAt(1);
                                    var30 = (Party)GameScr.vParty.elementAt(2);
                                    var16 = (Party)GameScr.vParty.elementAt(3);
                                    if (!var15.name.equals(var28) && !var30.name.equals(var28) && !var16.name.equals(var28)) {
                                       var26 = true;
                                       break label687;
                                    }

                                    var26 = false;
                                    break label687;
                                 }

                                 Party var17;
                                 if (GameScr.vParty.size() == 5) {
                                    var15 = (Party)GameScr.vParty.elementAt(1);
                                    var30 = (Party)GameScr.vParty.elementAt(2);
                                    var16 = (Party)GameScr.vParty.elementAt(3);
                                    var17 = (Party)GameScr.vParty.elementAt(4);
                                    if (!var15.name.equals(var28) && !var30.name.equals(var28) && !var16.name.equals(var28) && !var17.name.equals(var28)) {
                                       var26 = true;
                                       break label687;
                                    }

                                    var26 = false;
                                    break label687;
                                 }

                                 if (GameScr.vParty.size() == 6) {
                                    var15 = (Party)GameScr.vParty.elementAt(1);
                                    var30 = (Party)GameScr.vParty.elementAt(2);
                                    var16 = (Party)GameScr.vParty.elementAt(3);
                                    var17 = (Party)GameScr.vParty.elementAt(4);
                                    Party var18 = (Party)GameScr.vParty.elementAt(5);
                                    if (!var15.name.equals(var28) && !var30.name.equals(var28) && !var16.name.equals(var28) && !var17.name.equals(var28) && !var18.name.equals(var28)) {
                                       var26 = true;
                                       break label687;
                                    }

                                    var26 = false;
                                    break label687;
                                 }
                              }

                              var26 = false;
                           }
                        }

                        if (var26) {
                           Service.gI().addParty(var23);
                           a(500L);
                           this.bg = System.currentTimeMillis();
                        }
                     }
                  }

                  // tàn sát
                  if (!this.ref_ip_1.equals(this.rou_ip_1) || !this.ref_ip_2.equals(this.rou_ip_2) || !this.ref_ip_3.equals(this.rou_ip_3) || !this.ref_ip_4.equals(this.rou_ip_4) || !this.ref_ip_5.equals(this.rou_ip_5) || !this.ref_ip_6.equals(this.rou_ip_6) || !this.ref_ip_7.equals(this.rou_ip_7) || !this.ref_ip_8.equals(this.rou_ip_8) || !this.ref_ip_9.equals(this.rou_ip_9) || !this.ref_ip_10.equals(this.rou_ip_10) || !this.ref_ip_01.equals(this.rou_ip_01) || !this.ref_ip_02.equals(this.rou_ip_02) || !this.ref_name_1.equals(this.rou_name_1) || !this.ref_name_2.equals(this.rou_name_2) || !this.ref_name_3.equals(this.rou_name_3) || !this.ref_name_4.equals(this.rou_name_4) || !this.ref_name_5.equals(this.rou_name_5) || !this.ref_name_6.equals(this.rou_name_6) || !this.ref_name_7.equals(this.rou_name_7) || !this.ref_name_8.equals(this.rou_name_8) || !this.ref_name_9.equals(this.rou_name_9)  || !this.ref_name_10.equals(this.rou_name_10) || !this.ref_name_11.equals(this.rou_name_11) || !this.ref_name_01.equals(this.rou_name_01) || !this.ref_name_02.equals(this.rou_name_02)) {
                     o();
                     Class_cl.ad();
                     b = null;
                  }

                  if (k) {
                     var9 = 315;
                     ItemMap var24 = null;
                     var5 = 0;

                     while(true) {
                        if (var5 >= GameScr.vItemMap.size()) {
                           if (var24 != null) {
                              Service.gI().pickItem(var24.g);
                              Thread.sleep(50L);
                           }
                           break;
                        }

                        ItemMap var29 = (ItemMap)GameScr.vItemMap.elementAt(var5);
                        var8 = Res.a(var3.cx, var3.cy, var29.xEnd, var29.yEnd);
                        if ((var9 == -1 || var8 < var9) && (a(var29.template) || var3.nClass.classId == 1 && var29.template.id == 218) && (Char.af() > 2 || var29.template.type == 19 || var29.template.isUpToUp && Char.h(var29.template.id))) {
                           var9 = var8;
                           var24 = var29;
                        }

                        ++var5;
                     }
                  }

                  if (System.currentTimeMillis() - bh > 2000L) {
                     label374:
                     for(var9 = 0; var9 < bi.size(); ++var9) {
                        ItemTemplate var27 = ItemTemplates.get((short)(var7 = ((Integer)bi.elementAt(var9)).intValue()));
                        if (Char.h(var7)) {
                           for(var5 = 0; var5 < var3.vEff.size(); ++var5) {
                              if ((var10 = (Effect)var3.vEff.elementAt(var5)) != null && var10.template.iconId == var27.iconID) {
                                 continue label374;
                              }
                           }

                           if ((var5 = Char.g(var7)) >= 0) {
                              Service.gI().useItem(var5);
                              continue;
                           }
                        }

                        bi.removeElementAt(var9);
                        --var9;
                     }

                     bh = System.currentTimeMillis();
                  }

                  if (s && var3.ae * 100L / GameScr.exps[var3.clevel] >= 98L) {
                     Class_cl.ac();
                     b = null;
                     Session_ME.getInstance().close();
                  }
               } catch (Exception var19) {
                  var19.printStackTrace();
               }

               if (Char.getMyChar().isCaptcha) {
                  Class_cl.j();
               }

               Thread.sleep((var1 = System.currentTimeMillis() - var1) < 50L ? 50L - var1 : 0L); // fix speed từ 100 -> 50
               continue;
            }
         } catch (Exception var20) {
            var20.printStackTrace();
         }

         return;
      }
   }

   public static boolean a(int var0) {
      return bi.contains(new Integer(var0));
   }

   public static void b(int var0) {
      Integer var1 = new Integer(var0);
      if (!bi.contains(var1)) {
         bi.addElement(var1);
      }

   }

   public static void c(int var0) {
      bi.removeElement(new Integer(var0));
   }

   public static void a(Item var0) {
      if (!bj.contains(var0)) {
         bj.addElement(var0);
      }

   }

   public static void b(Item var0) {
      bj.removeElement(var0);
   }

   public static void b(int var0, int var1) {
      Integer var2 = new Integer(var0);
      if (!bk.contains(var2)) {
         bk.addElement(var2);
         bl.addElement(new Integer(var1));
      }

   }

   public static void d(int var0) {
      if ((var0 = bk.indexOf(new Integer(var0))) >= 0) {
         bk.removeElementAt(var0);
         bl.removeElementAt(var0);
      }

   }

   public static void l() {
      Char var0 = Char.getMyChar();

      for(int var1 = 0; var1 < bj.size(); ++var1) {
         Item var2;
         if ((var2 = (Item)bj.elementAt(var1)).indexUI >= 0 && var2.indexUI < var0.arrItemBag.length) {
            if (var0.arrItemBag[var2.indexUI] != null && var0.arrItemBag[var2.indexUI].getTinhLuyen(85) >= 0 && var0.arrItemBag[var2.indexUI].getTinhLuyen(85) < 9) {
               bj.setElementAt(var0.arrItemBag[var2.indexUI], var1);
            } else {
               bj.removeElementAt(var1--);
            }
         }
      }

   }

   public static String m() {
      String var0 = "";

      for(int var1 = 0; var1 < r.length; ++var1) {
         var0 = var0 + (var1 == r.length - 1 ? String.valueOf(r[var1]) : r[var1] + " ");
      }

      return var0;
   }

   public static void d(String var0) {
      String[] var1;
      int[] var2 = new int[(var1 = d(var0, " ")).length];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         try {
            var2[var3] = Integer.parseInt(var1[var3]);
         } catch (Exception var5) {
            var2[var3] = -1;
         }
      }

      r = var2;
   }

   public static void a(short var0) {
      int var1;
      for(var1 = 0; var1 < f.length; ++var1) {
         if (f[var1] == var0) {
            return;
         }
      }

      var1 = -1;

      for(int var2 = 0; var2 < f.length; ++var2) {
         if (f[var2] < 0) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = f.length;
         short[] var4;
         System.arraycopy(var4 = new short[f.length + 10], 0, f, 0, f.length);

         for(int var3 = f.length; var3 < var4.length; ++var3) {
            var4[var3] = -1;
         }

         f = var4;
      }

      f[var1] = var0;
   }

   public static void b(short var0) {
      for(int var1 = 0; var1 < f.length; ++var1) {
         if (f[var1] == var0) {
            f[var1] = -1;
         }
      }

   }

   public static void n() {
      for(int var0 = 0; var0 < f.length; ++var0) {
         if (f[var0] > 0) {
            for(int var1 = 0; var1 <= var0; ++var1) {
               if (f[var1] == -1) {
                  f[var1] = f[var0];
                  f[var0] = -1;
                  break;
               }
            }
         }
      }

   }

   public static boolean a(ItemTemplate var0) {
      if (var0.type == 19) {
         return Char.isAPickYHM;
      } else if (var0.type != 16 && var0.type != 17) {
         if (var0.type == 26) {
            return Char.dm && var0.id >= Char.eo - 1;
         } else if (var0.a()) {
            return Char.doa && var0.level >= Char.eq;
         } else if (var0.b()) {
            return Char.dp;
         } else {
            if (var0.type == 27) {
               if (var0.description.startsWith("Vật phẩm sự kiện") || var0.description.startsWith("Vật phẩm Sự kiện")) {
                  return Char.dq;
               }

               if (var0.name.startsWith("Sách võ công")) {
                  return Char.ds;
               }

               if (TileMap.e(TileMap.mapID) && var0.id == 38) {
                  return false;
               }
            }

            for(int var1 = 0; var1 < f.length; ++var1) {
               if (f[var1] > 0 && var0.id == f[var1]) {
                  return true;
               }
            }

            return Char.dr;
         }
      } else {
         return Char.isAPickYHMS && var0.level >= Char.en;
      }
   }

   public static boolean c(Item var0) {
      if (var0 != null && !var0.v && System.currentTimeMillis() - var0.u >= 5000L) {
         if (var0.upgrade > 0) {
            var0.v = true;
            return false;
         } else {
            if (var0.template.type < 10 || var0.template.type >= 29 && var0.template.type <= 32) {
               if (var0.template.type < 10 && !Char.doa) {
                  if (var0.template.level < 70) {
                     return true;
                  }

                  return false;
               }

               if (!var0.s && System.currentTimeMillis() - var0.t > 5000L) {
                  var0.t = System.currentTimeMillis();
                  Service.gI().requestItemInfo(var0.typeUI, var0.indexUI);
                  if (!Class_cl.r() || !var0.s) {
                     return false;
                  }
               }

               if (var0.isNewitem(85)) {
                  var0.v = true;
                  return false;
               }

               if (var0.template.type >= 29 && var0.template.type <= 32) {
                  if (var0.saleCoinLock != 0) {
                     var0.v = true;
                     return false;
                  }

                  return true;
               }

               if (var0.saleCoinLock == 5) {
                  return true;
               }

               boolean var1;
               boolean var2;
               int var3;
               Item var4;
               label126: {
                  var2 = true;
                  var4 = var0;
                  if (var0.options != null) {
                     for(var3 = 0; var3 < var4.options.size(); ++var3) {
                        ItemOption var5;
                        if ((var5 = (ItemOption)var4.options.elementAt(var3)) != null && var5.optionTemplate.type == 2) {
                           var1 = true;
                           break label126;
                        }
                     }
                  }

                  var1 = false;
               }

               if (!var1) {
                  return true;
               }

               if (var0.template.type == 1) {
                  if (var0.isNewitem(0) && var0.isNewitem(1)) {
                     if (!var0.isNewitem(8) && !var0.isNewitem(9)) {
                        return true;
                     }

                     if (!var0.isNewitem(10)) {
                        return true;
                     }

                     var0.v = true;
                     return false;
                  }

                  return true;
               }

               if (!var0.isNewitem(6) || !var0.isNewitem(7)) {
                  return true;
               }

               var2 = false;
               var4 = var0;
               var3 = 0;
               if (var0.options != null) {
                  for(int var7 = 0; var7 < var4.options.size(); ++var7) {
                     ItemOption var6;
                     if ((var6 = (ItemOption)var4.options.elementAt(var7)) != null && var6.optionTemplate.type == 0) {
                        ++var3;
                     }
                  }
               }

               if (var3 < 2) {
                  return true;
               }

               if (var0.template.type == 8 && !var0.isNewitem(16)) {
                  return true;
               }
            }

            var0.v = true;
            return false;
         }
      } else {
         return false;
      }
   }

   public static void o() {
      Char var0 = Char.getMyChar();
      if (!Char.h(37) && !Char.h(35)) {
         Npc var1;
         if ((var1 = GameScr.i(13)) != null && Math.abs(var1.cx - var0.cx) <= 200 && Math.abs(var1.cy - var0.cy) <= 200) {
            Char.b(var1.cx > 200 ? var1.cx - 200 : var1.cx + 200, var1.cy);
         }

         Service.gI().openUIZone();
      } else {
         Char.b(var0.cx, TileMap.d);
      }

   }

   public final boolean e(String var1) {
      int var2 = 0;
      StringBuffer var3 = new StringBuffer();
      StringBuffer var4 = new StringBuffer();

      int var5;
      label710:
      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if ((var5 = var1.charAt(var6)) >= 48 && var5 <= 57 || var5 == 32) {
            while(true) {
               if (var6 >= var1.length() || (var5 = var1.charAt(var6)) < 48 || var5 > 57) {
                  break label710;
               }

               var4.append((char)var5);
               ++var6;
            }
         }

         var3.append((char)var5);
      }

      var1 = var3.toString().toLowerCase();
      if (var4.length() > 0) {
         try {
            var2 = Integer.parseInt(var4.toString());
         } catch (Exception var17) {
         }
      }
      if(var1.equals("hd")){
    	  (new MenuHangDong()).a();
    	  return true;
      }
      if (var1.equals("y")) {
         Display.getDisplay(GameMidlet.instance).setCurrent(new AutoNhayPanel());
         return true;
      } else if (var1.equals("s")) {
         if (var2 == 0) {
            GameScr.addChatPopup("Chạy đi đou với tốc độ 0?");
         } else if (var2 > 100) {
            GameScr.addChatPopup("Tốc giày nên để <= 100 để ko bị giật!");
         } else {
            GameScr.addChatPopup("Fake tốc chạy " + var2);
            al = var2;
            ak = true;
         }

         return true;
      } else if (var1.equals("rs")) {
         GameScr.addChatPopup("Reset tốc chạy");
         ak = false;
         return true;
      } else if (var1.equals("n")) {
         if (var2 == 0) {
            var2 = 50;
         }

         GameScr.addChatPopup("Fake tầm ngang " + var2);
         am = true;
         an = var2;
         return true;
      } else if (var1.equals("c")) {
         if (var2 == 0) {
            var2 = 50;
         }

         GameScr.addChatPopup("Fake tầm cao " + var2);
         ao = true;
         ap = var2;
         return true;
      } else if (var1.equals("m")) {
         if (var2 == 0) {
            var2 = 50;
         }

         GameScr.addChatPopup("Fake lan " + var2);
         aq = true;
         ar = var2;
         return true;
      } else if (var1.equals("hlct")) {
         if (var2 > 0) {
            hlct_hc = var2;
            hlct = true;
            GameScr.addChatPopup("Bật auto hlct khi hc >= " + hlct_hc);
         } else {
            hlct_hc = -1;
            hlct = false;
            GameScr.addChatPopup("Tắt auto hlct");
         }

         return true;
      } else if (var1.equals("rsk")) {
         GameScr.addChatPopup("Reset fake tầm lan skill");
         aq = false;
         am = false;
         ao = false;
         return true;
      } else if (!var1.equals("bang") && !var1.equals("fz")) {
         if (!var1.equals("bangb") && !var1.equals("fb")) {
            if (!var1.equals("bangs") && !var1.equals("fs")) {
               if (!var1.equals("pbang") && !var1.equals("wz")) {
                  if (var1.equals("u")) {
                     if (var2 == 0) {
                        var2 = 50;
                     }

                     GameScr.addChatPopup("Khinh kông " + var2);
                     Char.b(Char.getMyChar().cx, Char.getMyChar().cy - var2);
                     return true;
                  } else if (var1.equals("d")) {
                     if (var2 == 0) {
                        var2 = 50;
                     }

                     GameScr.addChatPopup("Độn thổ " + var2);
                     Char.b(Char.getMyChar().cx, Char.getMyChar().cy + var2);
                     return true;
                  } else if (var1.equals("r")) {
                     if (var2 == 0) {
                        var2 = 50;
                     }

                     GameScr.addChatPopup("Dịch phải " + var2);
                     Char.b(Char.getMyChar().cx + var2, Char.getMyChar().cy);
                     return true;
                  } else if (var1.equals("l")) {
                     if (var2 == 0) {
                        var2 = 50;
                     }

                     GameScr.addChatPopup("Dịch trái " + var2);
                     Char.b(Char.getMyChar().cx - var2, Char.getMyChar().cy);
                     return true;
                  } else {
                     Char var18;
                     if (var1.equals("g")) {
                        if ((var18 = Char.getMyChar()).charFocus != null) {
                           GameScr.addChatPopup("MoveTo " + var18.charFocus.cName);
                           Char.b(var18.charFocus.cx, var18.charFocus.cy);
                        } else if (var18.npcFocus != null) {
                           GameScr.addChatPopup("MoveTo " + var18.npcFocus.cName);
                           Char.b(var18.npcFocus.cx, var18.npcFocus.cy);
                        } else if (var18.mobFocus != null) {
                           GameScr.addChatPopup("MoveTo " + var18.mobFocus.d().name);
                           Char.b(var18.mobFocus.xFirst, var18.mobFocus.yFirst);
                        } else if (var18.itemFocus != null) {
                           GameScr.addChatPopup("MoveTo " + var18.itemFocus.template.name);
                           Char.b(var18.itemFocus.x, var18.itemFocus.y);
                        }

                        return true;
                     } else if (var1.equals("ta")) {
                        GameScr.gI().d((int)9);
                        return true;
                     } else if (var1.equals("aq")) {
                        if ((var18 = Char.getMyChar()).mobFocus != null) {
                           System.out.println("Ẩn quái " + var18.mobFocus.d().name);
                           GameScr.vMobAttack.removeElement(var18.mobFocus);
                        }

                        return true;
                     } else if (var1.equals("sw")) {
                        GameScr.gI().d((int)36);
                        return true;
                     } else if (var1.equals("up")) {
                        AutoUpPanel var21;
                        (var21 = AutoUpPanel.a()).b();
                        Display.getDisplay(GameMidlet.instance).setCurrent(var21);
                        return true;
                     } else if (var1.equals("a")) {
                        PK_AM_PANEL var20 = PK_AM_PANEL.b();
                        Display.getDisplay(GameMidlet.instance).setCurrent(var20);
                        return true;
                     } else if (var1.equals("kt")) {
                        Display.getDisplay(GameMidlet.instance).setCurrent(new RemoteAccPanel());
                        return true;
                     } else if (var1.equals("b")) {
                        AutoLoginPanel var19 = AutoLoginPanel.a();
                        Display.getDisplay(GameMidlet.instance).setCurrent(var19);
                        return true;
                     } else if (var1.equals("v")) {
                        as = !as;
                        GameScr.addChatPopup((as ? "Bật" : "Tắt") + " auto on off chống khóa nick");
                        return true;
                     } else if (var1.equals("z")) {
                        GameScr.addChatPopup((Char.dz ? "Tắt" : "Bật") + " auto chuyển map");
                        Char.dz = !Char.dz;
                        return true;
                     } else if (var1.equals("rm")) {
                        GameScr.addChatPopup((Char.du ? "Tắt" : "Bật") + " auto next map");
                        Char.du = !Char.du;
                        return true;
                     } else if (var1.equals("x")) {
                        if (var2 == 0) {
                           var2 = 150;
                        }

                        GameScr.addChatPopup("KC Nhặt " + var2);
                        g = var2;
                        return true;
                     } else if (var1.equals("kts")) {
                        if (var2 == 0) {
                           var2 = -1;
                        }

                        GameScr.addChatPopup("KC Tàn sát " + var2);
                        i = Char.getMyChar().cx;
                        j = Char.getMyChar().cy;
                        h = var2;
                        return true;
                     } else {
                        Mob var7;
                        if (var1.equals("ts")) {
                           if ((var7 = Mob.b(var2)) == null) {
                              GameScr.addChatPopup("Tàn sát all");
                              this.a(-1, TileMap.mapID);
                           } else {
                              GameScr.addChatPopup("Tàn sát " + var7.d().name + " lv " + var2);
                              this.a(var7.templateId, TileMap.mapID);
                           }

                           return true;
                        } else {
                           MobTemplate var8;
                           if (var1.equals("tsx")) {
                              var8 = var2 >= 0 && var2 < Mob.arrMobTemplate.length ? Mob.arrMobTemplate[var2] : null;
                              if (var8 == null) {
                                 GameScr.addChatPopup("Tàn sát all");
                                 this.a(-1, TileMap.mapID);
                              } else {
                                 GameScr.addChatPopup("Tàn sát " + var8.name + " id " + var2);
                                 this.a(var8.mobTemplateId, TileMap.mapID);
                              }

                              return true;
                           } else if (var1.equals("tsa")) {
                              GameScr.addChatPopup("Tàn sát all");
                              this.a(-1, TileMap.mapID);
                              return true;
                           } else if (var1.equals("anv")) {
                              if (TileMap.mapID != 1 && TileMap.mapID != 27 && TileMap.mapID != 72) {
                                 GameScr.addChatPopup("Bạn phải đứng ở trường để Auto");
                                 return true;
                              } else {
                                 GameScr.addChatPopup("Auto Nhiệm Vụ Hằng Ngày");
                                 this.e();
                                 return true;
                              }
                           } else if (var1.equals("att")) {
                              GameScr.addChatPopup("Auto Tà Thú");
                              this.f();
                              return true;
                           } else if (var1.equals("ak")) {
                              if (b == az) {
                                 GameScr.addChatPopup("Tắt tự đánh");
                                 Class_cl.ac();
                                 b = null;
                              } else {
                                 GameScr.addChatPopup("Bật tự đánh");
                                 az.g();
                                 a((Auto)az);
                              }

                              return true;
                           } else if (var1.equals("dpk")) {
                              if (b == bd) {
                                 GameScr.addChatPopup("Tắt auto đánh ai bật pk");
                                 Class_cl.ac();
                                 b = null;
                              } else {
                                 GameScr.addChatPopup("Bật auto đánh ai bật pk");
                                 bd.a(-1);
                                 a((Auto)bd);
                              }

                              return true;
                           } else if (var1.equals("cpk")) {
                              if (b == bc) {
                                 GameScr.addChatPopup("Tắt auto chờ pk");
                                 Class_cl.ac();
                                 b = null;
                              } else {
                                 GameScr.addChatPopup("Bật auto chờ pk");
                                 bc.a(-1, nst_idMap);
                                 a((Auto)bc);
                              }

                              return true;
                           } else if (var1.equals("apk")) {
                              if (b == bb) {
                                 GameScr.addChatPopup("Tắt auto pk âm kinh nghiệm");
                                 Class_cl.ac();
                                 b = null;
                              } else {
                                 GameScr.addChatPopup("Bật auto pk âm kinh nghiệm");
                                 this.i();
                              }

                              return true;
                           } else if (var1.equals("pk")) {
                              if (ad) {
                                 mResources.a("nstglv", 1);
                                 GameScr.addChatPopup("Bật tự động auto pk âm kinh nghiệm");
                              } else {
                                 mResources.a("nstglv", -1);
                                 GameScr.addChatPopup("Tắt auto pk âm kinh nghiệm");
                              }

                              ad = !ad;
                              return true;
                           } else if (!var1.equals("e") && !var1.equals("p")) {
                              if (var1.equals("k")) {
                                 GameScr.addChatPopup("Chuyển Khu: " + var2);
                                 GameScr.gI().j(var2);
                                 return true;
                              } else if (var1.equals("ltd")) {
                                 if (!TileMap.f(TileMap.mapID) && !TileMap.d(TileMap.mapID)) {
                                    GameScr.addChatPopup("Hãy đứng ở làng hoặc trường để lưu tọa độ");
                                 } else {
                                    GameScr.h(5);
                                    Service.gI().openMenu(5);
                                    Service.gI().menu(5, 1, 0);
                                 }

                                 return true;
                              } else if (var1.equals("nm")) {
                                 GameScr.addChatPopup("Next map: " + var2);
                                 TileMap.m(var2);
                                 return true;
                              } else if (var1.equals("gm")) {
                                 if (var2 < TileMap.v.length && var2 >= 0) {
                                    GameScr.addChatPopup("Go to: " + TileMap.v[var2]);
                                    TileMap.l(var2);
                                    return true;
                                 } else {
                                    return true;
                                 }
                              } else if (var1.equals("npc")) {
                                 if (var2 < Npc.arrNpcTemplate.length) {
                                    GameScr.addChatPopup("Act NPC: " + Npc.arrNpcTemplate[var2].name);
                                    GameScr.h(var2);
                                 }

                                 return true;
                              } else if (var1.equals("hs")) {
                                 GameScr.addChatPopup("Next to hirosaki");
                                 TileMap.l(1);
                                 return true;
                              } else if (var1.equals("hr")) {
                                 GameScr.addChatPopup("Next to haruna");
                                 TileMap.l(27);
                                 return true;
                              } else if (var1.equals("oz")) {
                                 GameScr.addChatPopup("Next to Ozawa(Oozaka)");
                                 TileMap.l(72);
                                 return true;
                              } else if (var1.equals("kj")) {
                                 GameScr.addChatPopup("Next to Kojin");
                                 TileMap.l(10);
                                 return true;
                              } else if (var1.equals("sz")) {
                                 GameScr.addChatPopup("Next to Sanzu");
                                 TileMap.l(17);
                                 return true;
                              } else if (var1.equals("tn")) {
                                 GameScr.addChatPopup("Next to Tone");
                                 TileMap.l(22);
                                 return true;
                              } else if (var1.equals("lc")) {
                                 GameScr.addChatPopup("Next to Chài");
                                 TileMap.l(32);
                                 return true;
                              } else if (var1.equals("ck")) {
                                 GameScr.addChatPopup("Next to Chakumi");
                                 TileMap.l(38);
                                 return true;
                              } else if (var1.equals("eg")) {
                                 GameScr.addChatPopup("Next to Echigo");
                                 TileMap.l(43);
                                 return true;
                              } else if (var1.equals("ct")) {
                                 GameScr.addChatPopup("Pt " + Char.getMyChar().a);
                                 return true;
                              } else if (var1.equals("pt")) {
                                 GameScr.addChatPopup("Pt " + Char.getMyChar().b);
                                 return true;
                              } else if (var1.equals("os")) {
                                 GameScr.addChatPopup("Next to Oshin");
                                 TileMap.l(48);
                                 return true;
                              } else if (var1.equals("mnv")) {
                                 GameScr.addChatPopup("Next to Map Nhiệm Vụ");
                                 TileMap.l(GameScr.ae());
                                 return true;
                              } else if (var1.equals("mnvp")) {
                                 GameScr.addChatPopup("Next to Map Nhiệm Vụ Phụ");
                                 TaskOrder var22;
                                 if ((var22 = Char.j(0)) != null) {
                                    TileMap.l(var22.mapId);
                                 }

                                 return true;
                              } else {
                                 ItemMap var9;
                                 if (var1.equals("add")) {
                                    GameScr.addChatPopup("Thêm vật phẩm vào ds nhặt");
                                    if ((var9 = Char.getMyChar().itemFocus) != null) {
                                       a(var9.template.id);
                                    }

                                    return true;
                                 } else if (var1.equals("del")) {
                                    GameScr.addChatPopup("Xóa vật phẩm khỏi ds nhặt");
                                    if ((var9 = Char.getMyChar().itemFocus) != null) {
                                       b(var9.template.id);
                                    }

                                    return true;
                                 } else {
                                    ItemTemplate var10;
                                    if (var1.equals("ait")) {
                                       if ((var10 = ItemTemplates.get((short)var2)) != null) {
                                          GameScr.addChatPopup("Thêm " + var10.name + " vào ds nhặt");
                                          a(var10.id);
                                       }

                                       return true;
                                    } else if (var1.equals("dit")) {
                                       if ((var10 = ItemTemplates.get((short)var2)) != null) {
                                          GameScr.addChatPopup("Xóa " + var10.name + " khỏi ds nhặt");
                                          a(var10.id);
                                       }

                                       return true;
                                    } else if (var1.equals("cnhat")) {
                                       if (k) {
                                          GameScr.addChatPopup("Bật nhặt xa");
                                       } else {
                                          GameScr.addChatPopup("Bật hút VP");
                                       }

                                       k = !k;
                                       return true;
                                    } else if (var1.equals("ruong")) {
                                       GameScr.gI().doBag();
                                       return true;
                                    } else if (var1.equals("vpnhat")) {
                                       GameScr.gI().d((int)46);
                                       return true;
                                    } else if (var1.equals("die")) {
                                       o();
                                       return true;
                                    } else if (var1.equals("dcvt")) {
                                       if (l) {
                                          GameScr.addChatPopup("Tắt đánh chuyển vị trí");
                                       } else {
                                          GameScr.addChatPopup("Bật đánh chuyển vị trí");
                                       }

                                       l = !l;
                                       return true;
                                    } else if (var1.equals("avt")) {
                                       GameScr.addChatPopup("Thêm vị trí " + Char.getMyChar().cx + " " + Char.getMyChar().cy);
                                       n.addElement(new Integer(Char.getMyChar().cx));
                                       o.addElement(new Integer(Char.getMyChar().cy));
                                       return true;
                                    } else if (var1.equals("dvt")) {
                                       GameScr.addChatPopup("Xóa hết vị trí");
                                       n.removeAllElements();
                                       o.removeAllElements();
                                       return true;
                                    } else if (var1.equals("dvtx")) {
                                       GameScr.addChatPopup("Xóa vị trí " + var2);
                                       n.removeElementAt(var2);
                                       o.removeElementAt(var2);
                                       return true;
                                    } else if (var1.equals("dck")) {
                                       if (p = !p) {
                                          GameScr.addChatPopup("Tắt đánh chuyển khu");
                                       } else {
                                          GameScr.addChatPopup("Bật đánh chuyển khu");
                                          GameCanvas.inputDlg.a("Khu", new Command1("Đặt", 1100090), 1);
                                          GameCanvas.inputDlg.tfInput.a(m());
                                       }

                                       return true;
                                    } else if (var1.equals("glv")) {
                                       if (s) {
                                          GameScr.addChatPopup("Tắt giữ lv");
                                       } else {
                                          GameScr.addChatPopup("Bật giữ lv");
                                       }

                                       s = !s;
                                       return true;
                                    } else if (var1.equals("t")) {
                                       GameScr.addChatPopup("Thêm nhóm");
                                       if ((var18 = Char.getMyChar().charFocus) != null) {
                                          if (!b(var18.cName)) {
                                             e.addElement(var18.cName);
                                          }

                                          bf = true;
                                          Service.gI().addParty(var18.cName);
                                       }

                                       return true;
                                    } else if (var1.equals("cn")) {
                                       GameScr.addChatPopup("Xóa nhóm");
                                       d = null;
                                       bf = false;
                                       e.removeAllElements();
                                       q();
                                       return true;
                                    } else if (var1.equals("sn")) {
                                       GameScr.addChatPopup("Lưu nhóm");
                                       q();
                                       return true;
                                    } else if (var1.equals("tsn")) {
                                       if (GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                          if ((var7 = Mob.b(var2)) == null) {
                                             GameScr.addChatPopup("Tàn sát nhóm all");
                                             this.a(-1, TileMap.mapID);
                                          } else {
                                             GameScr.addChatPopup("Tàn sát nhóm " + var7.d().name + " lv " + var2);
                                             this.a(var7.templateId, TileMap.mapID);
                                          }

                                          ax.a = true;
                                          Service.gI().chatParty("ts " + ax.b + " " + ax.c + " " + ax.o);
                                          return true;
                                       } else {
                                          GameScr.addChatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (!var1.equals("tsnx")) {
                                       if (var1.equals("tsan")) {
                                          if (GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                             GameScr.addChatPopup("Tàn sát nhóm all");
                                             this.a(-1, TileMap.mapID);
                                             ax.a = true;
                                             Service.gI().chatParty("tsa " + ax.b + " " + ax.c);
                                             return true;
                                          } else {
                                             GameScr.addChatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var1.equals("attn")) {
                                          if (GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                             GameScr.addChatPopup("Auto Tà Thú Nhóm");
                                             this.f();
                                             ay.a = true;
                                             Service.gI().chatParty("att " + ay.b + " " + ay.c + " " + ay.o);
                                             return true;
                                          } else {
                                             GameScr.addChatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var1.equals("f")) {
                                          if (GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).charId != Char.getMyChar().charID) {
                                             GameScr.addChatPopup("Bật Buff HS Xa");
                                             this.a(true, true);
                                             return true;
                                          } else {
                                             GameScr.addChatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var1.equals("bux")) {
                                          if (GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).charId != Char.getMyChar().charID) {
                                             GameScr.addChatPopup("Bật Buff Xa");
                                             this.a(true, false);
                                             return true;
                                          } else {
                                             GameScr.addChatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var1.equals("hsx")) {
                                          if (GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).charId != Char.getMyChar().charID) {
                                             GameScr.addChatPopup("Bật HS Xa");
                                             this.a(false, true);
                                             return true;
                                          } else {
                                             GameScr.addChatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var1.equals("cy")) {
                                          if (b == null) {
                                             GameScr.addChatPopup("Bạn chưa up yên");
                                          } else {
                                             var5 = Char.getMyChar().yen - b.i;
                                             int var24 = (int)((System.currentTimeMillis() - b.k) / 1000L);
                                             GameScr.addChatPopup("Up " + var5 + " trong " + NinjaUtil.getTime(var24) + " perh=" + var5 / var24 * 3600);
                                          }

                                          return true;
                                       } else if (var1.equals("clv")) {
                                          if (b == null) {
                                             GameScr.addChatPopup("Bạn chưa up level");
                                          } else {
                                             long var23;
                                             float var13 = (float)((var23 = Char.getMyChar().cEXP - b.j) * 10000L / GameScr.exps[Char.getMyChar().clevel]) / 100.0F;
                                             var2 = (int)((System.currentTimeMillis() - b.k) / 1000L);
                                             long var14;
                                             float var16 = (float)((var14 = var23 * 3600L / (long)var2) * 10000L / GameScr.exps[Char.getMyChar().clevel]) / 100.0F;
                                             GameScr.addChatPopup("Up " + var23 + " - " + var13 + "% trong " + NinjaUtil.getTime(var2) + " perh=" + var14 + " - " + var16 + "%");
                                          }

                                          return true;
                                       } else if (var1.equals("h")) {
                                          Calendar var11 = Res.c();
                                          GameScr.addChatPopup("Time " + var11.get(11) + ":" + var11.get(12) + ":" + var11.get(13));
                                          return true;
                                       } else if (var1.equals("td")) {
                                          GameScr.addChatPopup("(X-Y-ID map): " + Char.getMyChar().cx + " - " + Char.getMyChar().cy + " - " + TileMap.mapID);
                                          return true;
                                       } else {
                                          return false;
                                       }
                                    } else if (GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                       var8 = var2 >= 0 && var2 < Mob.arrMobTemplate.length ? Mob.arrMobTemplate[var2] : null;
                                       if (var8 == null) {
                                          GameScr.addChatPopup("Tàn sát nhóm all");
                                          this.a(-1, TileMap.mapID);
                                       } else {
                                          GameScr.addChatPopup("Tàn sát nhóm " + var8.name + " id " + var2);
                                          this.a(var8.mobTemplateId, TileMap.mapID);
                                       }

                                       ax.a = true;
                                       Service.gI().chatParty("ts " + ax.b + " " + ax.c + " " + ax.o);
                                       return true;
                                    } else {
                                       GameScr.addChatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                       return true;
                                    }
                                 }
                              }
                           } else {
                              GameScr.addChatPopup("End Auto");
                              Class_cl.ac();
                              b = null;
                              return true;
                           }
                        }
                     }
                  }
               } else {
                  GameScr.addChatPopup("Phá băng");
                  ai = false;
                  aj = false;
                  return true;
               }
            } else {
               GameScr.addChatPopup("Băng skill");
               aj = true;
               return true;
            }
         } else {
            GameScr.addChatPopup("Băng boss");
            ai = true;
            return true;
         }
      } else {
         GameScr.addChatPopup("Đóng băng");
         ai = true;
         aj = true;
         return true;
      }
   }

   public static void f(String var0) {
      for(int var1 = 0; var1 < bm.length; ++var1) {
         Service.gI().chatPrivate(var0, bm[var1].trim());
         ThreadSleep.a(20L);
      }

   }

   // check pk âm
   public static String checkPk(boolean ad) {
      return ad ? "CÓ" : "KHÔNG";
   }

   private static void c(String var0, String var1) {
      Service.gI().chatPrivate(var0, var1);
      ThreadSleep.a(20L);
   }

   private static String g(String var0) {
      InputStream var1 = mResources.a("/" + var0);

      try {
         byte[] var2 = new byte[var1.available()];
         var1.read(var2);
         var0 = new String(var2, "UTF-8");
      } catch (Exception var3) {
         var0 = "";
      }

      return var0;
   }

   public final void getPrivateChat(String to, String text) {
      
        ChatTab var3;
      boolean var4;
      if ((var3 = ChatManager.gI().findTab(to)) == null) {
         var4 = true;
      } else if (System.currentTimeMillis() - var3.d > 1000L) {
         var3.d = System.currentTimeMillis();
         var4 = true;
      } else {
         var4 = false;
      }

      if (var4) {
         Char var5 = Char.getMyChar();
         int var6 = 0;
         StringBuffer var7 = new StringBuffer();
         StringBuffer var8 = new StringBuffer();

         int var9;
         for(int var10 = 0; var10 < text.length(); ++var10) {
            if ((var9 = text.charAt(var10)) >= 48 && var9 <= 57 || var9 == 32) {
               while(var10 < text.length() && (var9 = text.charAt(var10)) >= 48 && var9 <= 57) {
                  var8.append((char)var9);
                  ++var10;
               }
               break;
            }

            var7.append((char)var9);
         }

         String var23 = var7.toString().toLowerCase();
         if (var8.length() > 0) {
            try {
               var6 = Integer.parseInt(var8.toString());
            } catch (Exception var22) {
            }
         }

//         if (var23.equals("yen")) {
//            c(var1, "Yên: " + var5.bq + " Xu: " + var5.bo + " Lượng: " + var5.br);
//            if (b != null) {
//               var9 = Class_at.h().bq - b.i;
//               int var11 = (int)((System.currentTimeMillis() - b.k) / 1000L);
//               c(var1, "Up được " + var9 + " yên trong " + Class_ce.b(var11));
//               c(var1, "Trung bình 1h up được " + var9 / var11 * 3600 + " yên");
//               return;
//            }
//         } else

            if (var23.equals("nst")) {
            long var24;
            long var13 = (var24 = (Char.getMyChar().cExpDown > 0L ? Char.getMyChar().cExpDown : Char.getMyChar().ae) * 10000L / GameScr.exps[Char.getMyChar().clevel]) % 100L;
            c(to, "LV: " + var5.clevel + " + " + (Char.getMyChar().cExpDown > 0L ? "-" : "") + var24 / 100L + "." + (var13 < 10L ? "0" + var13 : String.valueOf(var13)) + "%");
            if (b != null) {

               // yên
               var9 = Char.getMyChar().yen - b.i;
               int var11 = (int)((System.currentTimeMillis() - b.k) / 1000L);
               c(to, "Tôi 1h up được " + var9 / var11 * 3600 + " yên");

               // level
               long var15;
               float var17 = (float)((var15 = Char.getMyChar().cEXP - b.j) * 10000L / GameScr.exps[Char.getMyChar().clevel]) / 100.0F;
               int var18 = (int)((System.currentTimeMillis() - b.k) / 1000L);
               long var19;
               float var21 = (float)((var19 = var15 * 3600L / (long)var18) * 10000L / GameScr.exps[Char.getMyChar().clevel]) / 100.0F;
               c(to, "Tôi 1h up được "  + var21 + "%");

               // map
               c(to, "Tôi đang ở map " + TileMap.v[TileMap.mapID] + " khu " + TileMap.zoneID);
               return;
            }
//         } else if (var23.equals("mapup")) {
//            if (b != null) {
//               c(var1, "Nick của bạn đang ở map " + Class_by.v[Class_by.o] + " khu " + Class_by.l);
//               return;
//            }
         } else {
            if (var23.equals("xemtg") && ah > 0L) {
               c(to, "Thời gian còn lại: " + NinjaUtil.getTime((int)(ah / 1000L)));
               return;
            }

            if (to.equals(ae) && var23.equals("off")) {
               if (var6 == 0) {
                  c(to, "Chat offX với X là số phút off.         Ví dụ off45 là off 45 phút.");
                  return;
               }

               if (var6 > 120) {
                  c(to, "Chỉ được off tối đa 120 phút");
                  return;
               }

               ac = (long)(var6 * 60) * 1000L;
               ag = System.currentTimeMillis();
               c(to, "Bạn đã đặt thời gian off là: " + var6 + " phút. Chat thoat để nhân vật thoát luôn!");
               return;
            }

            if (to.equals(ae) && var23.equals("thoat") && ac > 0L) {
               Controller.gI().onDisconnected();
               return;
            }

            if (text.equals("k hack")) {
               Class_cl.ac();
               b = null;
               Session_ME.getInstance().close();
            }
         }
       
       }
      

   }

   private static String[] d(String var0, String var1) {
      int var2 = 0;
      int var3 = var1.length();

      int var4;
      for(var4 = var0.indexOf(var1, 0); var4 != -1; ++var2) {
         var4 += var3;
         var4 = var0.indexOf(var1, var4);
      }

      String[] var5 = new String[var2 + 1];
      var4 = var0.indexOf(var1);
      int var6 = 0;

      int var7;
      for(var7 = 0; var4 != -1; ++var7) {
         var5[var7] = var0.substring(var6, var4);
         var6 = var4 + var3;
         var4 = var0.indexOf(var1, var6);
      }

      var5[var7] = var0.substring(var6, var0.length());
      return var5;
   }

   public final void b(String var1, String var2) {
      if (Char.eg && d != null && var1.equals(d) && !Char.getMyChar().cName.equals(d)) {
         String[] var3 = d(var2, " ");

         try {
            if (var3[0].equals("tsa")) {
               if (b == ba) {
                  ba.b = Integer.parseInt(var3[1]);
                  ba.c = Integer.parseInt(var3[2]);
                  return;
               }

               ax.a(-1, Integer.parseInt(var3[1]), Integer.parseInt(var3[2]));
               ax.a = true;
               a((Auto)ax);
               return;
            }

            if (var3[0].equals("ts")) {
               if (b == ba) {
                  ba.b = Integer.parseInt(var3[1]);
                  ba.c = Integer.parseInt(var3[2]);
                  return;
               }

               ax.a(Integer.parseInt(var3[3]), Integer.parseInt(var3[1]), Integer.parseInt(var3[2]));
               ax.a = true;
               a((Auto)ax);
               return;
            }

            if (var3[0].equals("att")) {
               if (b == ba) {
                  ba.b = Integer.parseInt(var3[1]);
                  ba.c = Integer.parseInt(var3[2]);
                  return;
               }

               int var4 = Integer.parseInt(var3[1]);
               int var5 = Integer.parseInt(var3[3]);
               TaskOrder var6;
               if ((var6 = Char.j(1)) != null && var6.mapId == var4) {
                  ay.g();
               } else {
                  ay.a(var4, var5);
               }

               ay.c = Integer.parseInt(var3[2]);
               ay.a = true;
               a((Auto)ay);
               return;
            }

            if (b != null) {
               if (var3[0].equals("map")) {
                  b.b = Integer.parseInt(var3[1]);
                  return;
               }

               if (var3[0].equals("khu")) {
                  b.c = Integer.parseInt(var3[1]);
                  return;
               }

               if (b instanceof TaskTaThuAuto) {
                  if (var3[0].equals("waitGr")) {
                     TaskTaThuAuto.q = System.currentTimeMillis();
                     TaskTaThuAuto.p = true;
                     return;
                  }

                  if (var3[0].equals("notifyGr")) {
                     TaskTaThuAuto.p = false;
                     return;
                  }
               }
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }

   }

   public static void p() {
      mod_nst = null;
      av = false;
      aw = null;
      b = null;
      ax = null;
      c = null;
      ay = null;
      az = null;
      ba = null;
      bb = null;
      bc = null;
      bd = null;
      d = null;
      e = null;
      be = 0L;
      f = null;
      g = 0;
      h = 0;
      i = 0;
      j = 0;
      k = false;
      l = false;
      m = 0;
      n = null;
      o = null;
      p = false;
      q = 0;
      r = null;
      s = false;
      t = 0;
      u = 0;
      v = 0;
      bf = false;
      w = 0;
      x = 0;
      y = 0;
      nst_khuDanh = 0;
      nst_khuCho = 0;
      nst_idMap = 0;
      ac = 0L;
      ae = null;
      bh = 0L;
      bi = null;
      bj = null;
      bk = null;
      bl = null;
      af = 0L;
      ag = 0L;
      ah = 0L;
      ai = false;
      aj = false;
      ak = false;
      al = 0;
      am = true;
      an = 0;
      ao = true;
      ap = 0;
      aq = false;
      ar = 0;
      as = false;
      bm = null;
   }

   static {
      Main.main(5);
      a();
   }
}

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Char extends MainObject {
   public Char a;
   public Char b;
   public boolean isHuman;
   public boolean isNhanban;
   public boolean isCaptcha;
   private int gd = 0;
   private int timeBocdau = 0;
//   public long cEXP;
   public ChatPopup chatPopup;
   public long cEXP;
   public long cExpDown;
   private int lcx;
   private int lcy;
   public int cx = 24;
   public int cy = 24;
   public int cvx;
   public int cvy;
   public int cp1;
   private int cp2;
   private int cp3;
   public int statusMe = 5;
   public int cdir = 1;
   public int charID;
   public int cgender;
   public int ctaskId;
   public int cspeed;
   public int cdame;
   public int cdameDown;
   public int clevel;
   public int cMP;
   public int cMaxMP;
   public int cHp;
   public int cHpNew;
   public int cMaxHp;
   private int cyStartFall;
   public int eff5BuffHp;
   public int eff5BuffMp;
   public long ae;
   public int pPoint;
   public int sPoint;
   public int pointUydanh;
   public int pointNon;
   public int pointVukhi;
   public int pointAo;
   public int pointLien;
   public int pointGangtay;
   public int pointNhan;
   public int pointQuan;
   public int pointNgocboi;
   public int pointGiay;
   public int pointPhu;
   public int pointTinhTu;
   public int countFinishDay;
   public int countLoopBoos;
   public int limitTiemnangso;
   public int limitKynangso;
   public int limitPhongLoi;
   public int limitBangHoa;
   public int countPB;
   public int[] potential = new int[4];
   public String cName;
   public String cClanName = "";
   public byte ctypeClan;
   public static Clan be;
   public int cw = 22;
   public int ch = 32;
   private int chw = 11;
   private int chh = 16;
   public boolean canJumpHigh = true;
   private boolean cmtoChar;
   public boolean me;
   public boolean cchistlast;
   public int cf;
   private int tick;
   public boolean fallAttack = false;
   public boolean isJump = false;
   public boolean autoFall;
   private boolean isMoto;
   public int xu;
   public int xuInBox;
   public int yen;
   public int luong;
   public NClass nClass;
   public MyVector vSkill = new MyVector();
   public MyVector vSkillFight = new MyVector();
   public MyVector vEff = new MyVector();
   private MyVector vDomsang = new MyVector();
   public Skill myskill;
   public Task taskMaint;
   private boolean paintName = true;
   public Item[] arrItemBag;
   public Item[] arrItemBox;
   public Item[] arrItemBody;
   public Item[] arrItemMounts = new Item[5];
   public short cResFire;
   public short cResIce;
   public short cResWind;
   public short cMiss;
   public short cExactly;
   public short cFatal;
   public byte cPk;
   public byte cTypePk;
   public short cReactDame;
   public short sysUp;
   public short sysDown;
   public Mob mobFocus;
   public Mob mobMe;
   public Npc npcFocus;
   public Char charFocus;
   public ItemMap itemFocus;
   public MyVector focus = new MyVector();
   public Mob[] attMobs;
   public Char[] attChars;
   public short[] moveFast;
   public int testCharId = -9999;
   public int killCharId = -9999;
   public byte resultTest;
   public int countKill;
   public int countKillMax;
   public int tickCoat;
   private int tickEffmoto;
   private int tickEffFireW;
   public boolean isInvisible;
   public static boolean timeStartBlink;
   public static boolean isAHP;
   public static boolean isAMP;
   public static boolean isAFood;
   public static boolean isABuff;
   public static boolean isAResuscitate;
   public static boolean isAPickYen;
   public static boolean isAPickYHM;
   public static boolean isAPickYHMS;
   public static boolean dm;
   public static boolean dn;
   public static boolean doa;
   public static boolean dp;
   public static boolean dq;
   public static boolean dr;
   public static boolean ds;
   public static boolean dt;
   public static boolean du;
   public static boolean dv;
   public static boolean dw;
   public static boolean dx;
   public static boolean dy;
   public static boolean dz;
   public static boolean ea;
   public static boolean eb;
   public static boolean ec;
   public static boolean ed;
   public static boolean ee;
   public static boolean ef;
   public static boolean eg;
   public static boolean eh;
   public static boolean ei;
   public static boolean ej;
   public static int ek;
   public static int el;
   public static int em;
   public static int en;
   public static int eo;
   public static int ep;
   public static int eq;
   public static int er;
   private long gt = 0L;
   public MyVector taskOrders = new MyVector();
   public static int et;
   public static int pointChienTruong;
   private long gu;
   public long timeSummon;
   public static int[][][] CharInfo;
   private static Char gv;
   private int gw;
   public int cxSend;
   public int cySend;
   public int ez;
   public int fa;
   public MyVector fb = new MyVector();
   public static boolean flag;
   public static boolean ischangingMap;
   public boolean isLockKey;
   public boolean isLockMove;
   public boolean isLockAttack;
   public MovePoint currentMovePoint;
   private int gx = 0;
   private boolean beginSound ;
   public long timeBeGinRun = System.currentTimeMillis();
   public int vitaWolf = 0;
   private long timeSendmove;
   private static boolean isSendMove;
   private int fbyhorse;
   private int FramecharRideHorse;
   private int inAir;
   private long currMove = 0L;
   private boolean isLastMove = false;
   public static byte[] locate;
   private long timeLastCheck;
   private long timelastSendmove;
   private static short delaySendmove;
   public short head;
   public short leg;
   public short body;
   public short wp;
   public short coat = -1;
   public short glove = -1;
   private int indexEff = -1;
   public int indexEffTask = -1;
   private EffectCharPaint eff;
   public EffectCharPaint effTask;
   private int indexSkill;
   private int i0;
   private int i1;
   private int i2;
   private int dx0;
   private int dx1;
   private int dx2;
   private int dy0;
   private int dy1;
   private int dy2;
   private EffectCharPaint eff0 = null;
   private EffectCharPaint eff1 = null;
   private EffectCharPaint eff2 = null;
   public Arrow arrow = null;
   public SkillPaint fu;
   public EffectPaint[] fv;
   private int sType;
   private byte isInjure;
   private int heightCharName = 0;
   private int dxHead = 0;
   private int dyHead = 0;
   private int dxBody = 0;
   private int dyBody = 0;
   private int[] idWolfW = new int[]{1715, 1737, 1714, 1738};
   public static boolean fw;
   public short wdx;
   public short wdy;
   public boolean fz;
   public Skill ga;
   public boolean gb;
   private int ig;
   private int ih;
   private int ii;
   private int ij;

   public static void a() {
      isAMP = true;
      isAFood = false;
      isABuff = false;
      isAResuscitate = false;
      isAPickYen = false;
      isAPickYHM = true;
      isAPickYHMS = true;
      dq = false;
      du = true;
      dv = true;
      dw = true;
      dx = true;
      dy = true;
      dz = true;
      ea = true;
      eb = true;
      ec = true;
      ed = true;
      eg = true;
      eh = true;
      ek = 50;
      el = 50;
      em = 50;
      en = 30;
      eo = 5;
      ep = 7;
      eq = 30;
      CharInfo = new int[][][]{{{0, -10, 32}, {1, -7, 7}, {1, -11, 15}, {1, -9, 45}}, {{0, -10, 33}, {1, -7, 7}, {1, -11, 16}, {1, -9, 46}}, {{1, -10, 33}, {2, -10, 11}, {2, -9, 16}, {1, -12, 49}}, {{1, -10, 32}, {3, -11, 9}, {3, -11, 16}, {1, -13, 47}}, {{1, -10, 34}, {4, -9, 9}, {4, -8, 16}, {1, -12, 47}}, {{1, -10, 34}, {5, -11, 11}, {5, -10, 17}, {1, -13, 49}}, {{1, -10, 33}, {6, -9, 9}, {6, -8, 16}, {1, -12, 47}}, {{0, -9, 36}, {7, -5, 15}, {7, -10, 21}, {1, -8, 49}}, {{4, -13, 26}, new int[3], new int[3], new int[3]}, {{5, -13, 25}, new int[3], new int[3], new int[3]}, {{6, -12, 26}, new int[3], new int[3], new int[3]}, {{7, -13, 25}, new int[3], new int[3], new int[3]}, {{0, -9, 35}, {8, -4, 13}, {8, -14, 27}, {1, -9, 49}}, {{0, -9, 31}, {9, -11, 8}, {10, -10, 17}, new int[3]}, {{2, -7, 33}, {9, -11, 8}, {11, -8, 15}, new int[3]}, {{2, -8, 32}, {9, -11, 8}, {12, -8, 14}, new int[3]}, {{2, -7, 32}, {9, -11, 8}, {13, -12, 15}, new int[3]}, {{0, -11, 31}, {9, -11, 8}, {14, -15, 18}, new int[3]}, {{2, -9, 32}, {9, -11, 8}, {15, -13, 19}, new int[3]}, {{2, -9, 31}, {9, -11, 8}, {16, -7, 22}, new int[3]}, {{2, -9, 32}, {9, -11, 8}, {17, -11, 18}, new int[3]}, {{3, -12, 34}, {8, -4, 13}, {8, -15, 25}, {1, -10, 46}}, {{0, -9, 32}, {8, -4, 9}, {10, -10, 18}, new int[3]}, {{2, -7, 34}, {8, -4, 9}, {11, -8, 16}, new int[3]}, {{2, -8, 33}, {8, -4, 9}, {12, -8, 15}, new int[3]}, {{2, -7, 33}, {8, -4, 9}, {13, -12, 16}, new int[3]}, {{0, -11, 32}, {7, -5, 9}, {14, -15, 19}, new int[3]}, {{2, -9, 33}, {7, -5, 9}, {15, -13, 20}, new int[3]}, {{2, -9, 32}, {7, -5, 9}, {16, -7, 23}, new int[3]}, {{2, -9, 33}, {7, -5, 9}, {17, -11, 19}, new int[3]}};
      isSendMove = true;
      locate = new byte[]{0, 0, 0, -1, -1, -1, -2, -2, -2, -1, -1, -1};
      delaySendmove = 250;
      fw = false;
      System.out.println("Load Auto");

      try {
         ByteArrayInputStream var0 = new ByteArrayInputStream(mResources.b("V7LCSetting"));
         DataInputStream var1;
         timeStartBlink = (var1 = new DataInputStream(var0)).readBoolean();
         ek = var1.readInt();
         isAHP = var1.readBoolean();
         el = var1.readInt();
         isAMP = var1.readBoolean();
         em = var1.readInt();
         isAFood = var1.readBoolean();
         isABuff = var1.readBoolean();
         isAResuscitate = var1.readBoolean();
         isAPickYen = var1.readBoolean();
         isAPickYHM = var1.readBoolean();
         isAPickYHMS = var1.readBoolean();
         en = var1.readInt();
         dm = var1.readBoolean();
         eo = var1.readInt();
         dn = var1.readBoolean();
         ep = var1.readInt();
         doa = var1.readBoolean();
         eq = var1.readInt();
         dp = var1.readBoolean();
         dq = var1.readBoolean();
         dr = var1.readBoolean();
         ds = var1.readBoolean();
         dt = var1.readBoolean();
         du = var1.readBoolean();
         dv = var1.readBoolean();
         dw = var1.readBoolean();
         dx = var1.readBoolean();
         dy = var1.readBoolean();
         dz = var1.readBoolean();
         eh = var1.readBoolean();
         ea = var1.readBoolean();
         eb = var1.readBoolean();
         ec = var1.readBoolean();
         ed = var1.readBoolean();
         ee = var1.readBoolean();
         ef = var1.readBoolean();
         eg = var1.readBoolean();
         NSOT_MOB.ad = var1.readBoolean();
         NSOT_MOB.as = var1.readBoolean();
         int var2 = var1.readInt();
         System.out.println("lent: " + var2);
         if (NSOT_MOB.f.length < var2) {
            NSOT_MOB.f = new short[10 * (var2 / 10 + 1)];
         }

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            NSOT_MOB.f[var3] = var1.readShort();
         }


         NSOT_MOB.t = var1.readInt();
         NSOT_MOB.u = var1.readInt();
         NSOT_MOB.x = var1.readInt();
         NSOT_MOB.y = var1.readInt();
         NSOT_MOB.w = var1.readInt();
         NSOT_MOB.v = var1.readInt();
         var0.close();
         var1.close();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public static void b() {
      System.out.println("Save Auto");
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeBoolean(timeStartBlink);
         var1.writeInt(ek);
         var1.writeBoolean(isAHP);
         var1.writeInt(el);
         var1.writeBoolean(isAMP);
         var1.writeInt(em);
         var1.writeBoolean(isAFood);
         var1.writeBoolean(isABuff);
         var1.writeBoolean(isAResuscitate);
         var1.writeBoolean(isAPickYen);
         var1.writeBoolean(isAPickYHM);
         var1.writeBoolean(isAPickYHMS);
         var1.writeInt(en);
         var1.writeBoolean(dm);
         var1.writeInt(eo);
         var1.writeBoolean(dn);
         var1.writeInt(ep);
         var1.writeBoolean(doa);
         var1.writeInt(eq);
         var1.writeBoolean(dp);
         var1.writeBoolean(dq);
         var1.writeBoolean(dr);
         var1.writeBoolean(ds);
         var1.writeBoolean(dt);
         var1.writeBoolean(du);
         var1.writeBoolean(dv);
         var1.writeBoolean(dw);
         var1.writeBoolean(dx);
         var1.writeBoolean(dy);
         var1.writeBoolean(dz);
         var1.writeBoolean(eh);
         var1.writeBoolean(ea);
         var1.writeBoolean(eb);
         var1.writeBoolean(ec);
         var1.writeBoolean(ed);
         var1.writeBoolean(ee);
         var1.writeBoolean(ef);
         var1.writeBoolean(eg);
         var1.writeBoolean(NSOT_MOB.ad);
         var1.writeBoolean(NSOT_MOB.as);
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < NSOT_MOB.f.length; ++var3) {
            if (NSOT_MOB.f[var3] >= 0) {
               ++var2;
            }
         }

         System.out.println("lent: " + var2);
         var1.writeInt(var2);

         for(var3 = 0; var3 < NSOT_MOB.f.length; ++var3) {
            if (NSOT_MOB.f[var3] >= 0) {
               var1.writeShort(NSOT_MOB.f[var3]);
            }
         }


         var1.writeInt(NSOT_MOB.t);
         var1.writeInt(NSOT_MOB.u);
         var1.writeInt(NSOT_MOB.x);
         var1.writeInt(NSOT_MOB.y);
         var1.writeInt(NSOT_MOB.w);
         var1.writeInt(NSOT_MOB.v);
         var1.flush();
         var0.flush();
         mResources.a("V7LCSetting", var0.toByteArray());
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public final int c() {
      return this.myskill != null ? this.myskill.b() : 0;
   }

   public final int d() {
      return this.myskill != null ? this.myskill.c() : 0;
   }

   public Char() {
      this.statusMe = 6;
   }

   public final int e() {
      if (this.nClass.classId != 1 && this.nClass.classId != 2) {
         if (this.nClass.classId != 3 && this.nClass.classId != 4) {
            return this.nClass.classId != 5 && this.nClass.classId != 6 ? 0 : 3;
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }

   public final int f() {
      if (NSOT_MOB.ak) {
         return NSOT_MOB.al;
      } else {
         return !this.isJump && !this.fallAttack ? this.cspeed : this.cspeed + 2;
      }
   }

   public final boolean g() {
      return this.nClass.classId == 2 || this.nClass.classId == 4 || this.nClass.classId == 6;
   }

   public static Char getMyChar() {
      if (gv == null) {
         (gv = new Char()).me = true;
         gv.cmtoChar = true;
         gv.timelastSendmove = System.currentTimeMillis();
      }

      return gv;
   }

   public static void i() {
      ei = false;
      ej = false;
      gv = null;
   }

   public final void a(Message var1) {
      try {
         this.cspeed = var1.reader().readByte();
         this.cMaxHp = var1.reader().readInt();
         this.cMaxMP = var1.reader().readInt();
      } catch (Exception var3) {
         var3.printStackTrace();
         System.out.println("Char.readParam()");
      }

   }

   public final void j() {
      try {
         MyVector var1 = new MyVector();

         int var2;
         Item var3;
         for(var2 = 0; var2 < this.arrItemBag.length; ++var2) {
            if ((var3 = this.arrItemBag[var2]) != null && var3.template.isUpToUp && !var3.isExpires) {
               var1.addElement(var3);
            }
         }

         int var4;
         for(var2 = 0; var2 < var1.size(); ++var2) {
            if ((var3 = (Item)var1.elementAt(var2)) != null) {
               for(var4 = var2 + 1; var4 < var1.size(); ++var4) {
                  Item var5;
                  if ((var5 = (Item)var1.elementAt(var4)) != null && var3.template.equals(var5.template) && var3.isLock == var5.isLock) {
                     var3.quantity += var5.quantity;
                     this.arrItemBag[var5.indexUI] = null;
                     var1.setElementAt((Object)null, var4);
                  }
               }
            }
         }

         for(var2 = 0; var2 < this.arrItemBag.length; ++var2) {
            if (this.arrItemBag[var2] != null) {
               for(var4 = 0; var4 <= var2; ++var4) {
                  if (this.arrItemBag[var4] == null) {
                     this.arrItemBag[var4] = this.arrItemBag[var2];
                     this.arrItemBag[var4].indexUI = var4;
                     this.arrItemBag[var2] = null;
                     break;
                  }
               }
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
         System.out.println("Char.bagSort()");
      }

   }

   public final void k() {
      try {
         MyVector var1 = new MyVector();

         int var2;
         Item var3;
         for(var2 = 0; var2 < this.arrItemBox.length; ++var2) {
            if ((var3 = this.arrItemBox[var2]) != null && var3.template.isUpToUp && !var3.isExpires) {
               var1.addElement(var3);
            }
         }

         int var4;
         for(var2 = 0; var2 < var1.size(); ++var2) {
            if ((var3 = (Item)var1.elementAt(var2)) != null) {
               for(var4 = var2 + 1; var4 < var1.size(); ++var4) {
                  Item var5;
                  if ((var5 = (Item)var1.elementAt(var4)) != null && var3.template.equals(var5.template) && var3.isLock == var5.isLock) {
                     var3.quantity += var5.quantity;
                     this.arrItemBox[var5.indexUI] = null;
                     var1.setElementAt((Object)null, var4);
                  }
               }
            }
         }

         for(var2 = 0; var2 < this.arrItemBox.length; ++var2) {
            if (this.arrItemBox[var2] != null) {
               for(var4 = 0; var4 <= var2; ++var4) {
                  if (this.arrItemBox[var4] == null) {
                     this.arrItemBox[var4] = this.arrItemBox[var2];
                     this.arrItemBox[var4].indexUI = var4;
                     this.arrItemBox[var2] = null;
                     break;
                  }
               }
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
         System.out.println("Char.boxSort()");
      }

   }

   public final void a(int var1) {
      Item var2;
      int var3;
      Item var4;
      if ((var2 = this.arrItemBag[var1]).isTypeBody()) {
         var2.isLock = true;
         var2.typeUI = 5;
         var4 = this.arrItemBody[var2.template.type];
         this.arrItemBag[var1] = null;
         if (var4 != null) {
            var4.typeUI = 3;
            this.arrItemBody[var2.template.type] = null;
            var4.indexUI = var1;
            this.arrItemBag[var1] = var4;
         }

         var2.indexUI = var2.template.type;
         this.arrItemBody[var2.indexUI] = var2;

         for(var3 = 0; var3 < this.arrItemBody.length; ++var3) {
            Item var5;
            if ((var5 = this.arrItemBody[var3]) != null) {
               if (var5.template.type == 1) {
                  this.wp = var5.template.part;
               } else if (var5.template.type == 2) {
                  this.body = var5.template.part;
               } else if (var5.template.type == 6) {
                  this.leg = var5.template.part;
               }
            }
         }
      } else if (var2.isTypeMounts()) {
         var2.isLock = true;
         var2.typeUI = 41;
         this.arrItemBag[var1] = null;

         for(var3 = 0; var3 < this.arrItemMounts.length; ++var3) {
            int var6;
            if ((var6 = var2.template.type - 29) == var3) {
               if ((var4 = this.arrItemMounts[var6]) != null) {
                  var4.typeUI = 41;
                  this.arrItemMounts[var6] = null;
                  var4.indexUI = var1;
                  this.arrItemBag[var1] = var4;
               }

               var2.indexUI = var2.template.type;
               this.arrItemMounts[var6] = var2;
               return;
            }
         }
      }

   }

   public final Skill a(SkillTemplate var1) {
      for(int var2 = 0; var2 < this.vSkill.size(); ++var2) {
         Skill var3;
         if ((var3 = (Skill)this.vSkill.elementAt(var2)).template.equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   private boolean ai() {
      int var1 = TileMap.vGo.size();

      for(byte var2 = 0; var2 < var1; ++var2) {
         Waypoint var3 = (Waypoint)TileMap.vGo.elementAt(var2);
         if (this.cx >= var3.minX && this.cx <= var3.maxX && this.cy >= var3.minY && this.cy <= var3.maxY) {
            return true;
         }
      }

      return false;
   }

   private static int e(int var0, int var1) {
      return Res.abs(var0 - var1);
   }

   public void update() {
      this.fbyhorse = this.cx;
      this.FramecharRideHorse = this.cy;
      int var1;
      int var2;
      if (this.me && this.cHp > 0) {
         var1 = e(this.cxSend, this.cx);
         var2 = e(this.cySend, this.cy);
         // fix giày
         if (((var1 > 0 || var2 > 0) && System.currentTimeMillis() - this.timeSendmove >= 250L) || NSOT_MOB.ak) {
            isSendMove = true;
         }

         if (isSendMove) {
            isSendMove = false;
            if (!flag) {
               Service.gI().charMove(this.cx, this.cy);
            }

            this.timeSendmove = System.currentTimeMillis();
            this.cxSend = this.cx;
            this.cySend = this.cy;
         }
      }

      if (this.mobMe != null) {
         Mob var3;
         if (this.mobMe.templateId != 122 && this.mobMe.templateId != 70 && (this.mobMe.d() == null || this.mobMe.d().typeFly != 1)) {
            if (this.mobMe.status != 3) {
               if (this.cdir == -1) {
                  this.mobMe.xFirst = this.cx + 20;
                  this.mobMe.yFirst = this.cy;
                  this.mobMe.dir = this.cdir;
                  this.mobMe.y = this.cy - 20;
               } else {
                  this.mobMe.xFirst = this.cx - 20;
                  this.mobMe.yFirst = this.cy;
                  this.mobMe.dir = this.cdir;
                  this.mobMe.y = this.cy - 20;
               }

               var1 = this.mobMe.xFirst - this.mobMe.x;
               var2 = this.mobMe.yFirst - this.mobMe.y;
               if (var1 <= 50 && var1 >= -50) {
                  var3 = this.mobMe;
                  var3.x += var1;
               } else {
                  var3 = this.mobMe;
                  var3.x += var1 / 10;
               }

               if (var2 > 50 || var2 < -50) {
                  var3 = this.mobMe;
                  var3.y += var2 / 10;
               }
            }

            this.mobMe.update();
         } else {
            if (this.mobMe.status != 3) {
               this.mobMe.xFirst = this.cx + (3 - GameCanvas.u % 6) * 6;
               this.mobMe.yFirst = this.cy - 60;
               var1 = this.mobMe.xFirst - this.mobMe.x;
               var2 = this.mobMe.yFirst - this.mobMe.y;
               if (var1 > 50 || var1 < -50) {
                  var3 = this.mobMe;
                  var3.x += var1 / 10;
               }

               if (var2 > 50 || var2 < -50) {
                  var3 = this.mobMe;
                  var3.y += var2 / 10;
               }
            }

            this.mobMe.update();
         }
      }

      this.beginSound = false;
      if (this.resultTest > 0 && GameCanvas.u % 2 == 0) {
         --this.resultTest;
         if (this.resultTest == 30 || this.resultTest == 60) {
            this.resultTest = 0;
         }
      }

      if (this.myskill != null && (this.myskill.template.id == 77 || this.myskill.template.id == 73)) {
         this.ak();
      }

      this.ak();
      if (this.mobMe != null) {
         this.mobMe.update();
      }

      if (this.arrow != null) {
         this.arrow.update();
      }

      if (this.arrItemMounts[4] != null && this.arrItemMounts[4].options != null) {
         for(var1 = 0; var1 < this.arrItemMounts[4].options.size(); ++var1) {
            ItemOption var12;
            if ((var12 = (ItemOption)this.arrItemMounts[4].options.elementAt(var1)).optionTemplate.id == 66) {
               this.vitaWolf = var12.param;
            }
         }
      }

      if (this.isJump && this.vitaWolf < 500) {
         this.isJump = false;
      }

      Domsang var4;
      Domsang var13;
      if (this.isJump) {
         if (this.arrItemMounts[4].template.id == 443 && this.arrItemMounts[4].sys >= 2) {
            if (this.idWolfW[1] == 1737) {
               this.ih -= 5;
            }

            if (this.cdir != 1) {
               var4 = new Domsang(this.ig - 4, this.ih, 0);
               var13 = new Domsang(this.ig - 1, this.ih, 0);
            } else {
               var4 = new Domsang(this.ig + 4, this.ih, 0);
               var13 = new Domsang(this.ig + 1, this.ih, 0);
            }

            if (this.statusMe != 1 || this.statusMe != 6) {
               this.vDomsang.addElement(var4);
               this.vDomsang.addElement(var13);
            }
         }

         for(var1 = 0; var1 < this.vDomsang.size(); ++var1) {
            (var4 = (Domsang)this.vDomsang.elementAt(var1)).a();
            if (var4.frame >= 6) {
               this.vDomsang.removeElementAt(var1);
            }
         }
      } else if (this.fallAttack) {
         if (this.arrItemMounts[4].template.id == 524 && this.arrItemMounts[4].sys >= 2) {
            if (this.cdir != 1) {
               var4 = new Domsang(this.ig, this.ih, 1);
               var13 = new Domsang(this.ii, this.ij, 1);
            } else {
               var4 = new Domsang(this.ig, this.ih, 1);
               var13 = new Domsang(this.ii, this.ij, 1);
            }

            if ((this.statusMe == 2 || this.statusMe == 10) && GameCanvas.u % 3 == 0) {
               this.vDomsang.addElement(var4);
               this.vDomsang.addElement(var13);
            }
         }

         for(var1 = 0; var1 < this.vDomsang.size(); ++var1) {
            (var4 = (Domsang)this.vDomsang.elementAt(var1)).a();
            if (var4.frame >= 6) {
               this.vDomsang.removeElementAt(var1);
            }
         }
      }

      Item var5;
      if (this.me && timeStartBlink && NSOT_MOB.b == null && this.cHp < this.cMaxHp * ek / 100 && System.currentTimeMillis() - this.timeBeGinRun > 3000L && this.statusMe != 14 && this.statusMe != 5 && this.cHp > 0) {
         if (this.vEff.size() == 0) {
            for(var1 = 0; var1 < this.arrItemBag.length; ++var1) {
               if ((var5 = this.arrItemBag[var1]) != null && var5.template.type == 16 && var5.template.level <= this.clevel) {
                  GameScr.x();
                  this.timeBeGinRun = System.currentTimeMillis();
                  break;
               }
            }
         } else {
            for(var1 = 0; var1 < this.vEff.size() && ((Effect)getMyChar().vEff.elementAt(var1)).template.type != 17; ++var1) {
               if (var1 == this.vEff.size() - 1) {
                  GameScr.x();
                  this.timeBeGinRun = System.currentTimeMillis();
               }
            }
         }
      }

      int var6;
      if (this.me && isAMP && GameCanvas.u % 10 == 0 && !GameScr.isPaintAuto && this.statusMe != 14 && this.statusMe != 5 && this.cHp > 0) {
         var6 = em;
         if (this.vEff.size() == 0) {
            for(var1 = 0; var1 < this.arrItemBag.length; ++var1) {
               if ((var5 = this.arrItemBag[var1]) != null && var5.template.type == 18 && var5.template.level == var6) {
                  Service.gI().useItem(var1);
                  break;
               }
            }
         } else {
            for(var1 = 0; var1 < this.vEff.size() && ((Effect)getMyChar().vEff.elementAt(var1)).template.type != 0; ++var1) {
               if (var1 == this.vEff.size() - 1) {
                  for(var2 = 0; var2 < this.arrItemBag.length; ++var2) {
                     Item var7;
                     if ((var7 = this.arrItemBag[var2]) != null && var7.template.type == 18 && var7.template.level == var6) {
                        Service.gI().useItem(var2);
                        break;
                     }
                  }
               }
            }
         }
      }

      Effect var9;
      Skill var14;
      if (this.me && isAFood && NSOT_MOB.b == null && !TileMap.ag && getMyChar().statusMe != 14 && getMyChar().statusMe != 5 && this.cHp > 0 && System.currentTimeMillis() - this.gt > 500L) {
         for(var1 = 0; var1 < this.vSkill.size(); ++var1) {
            boolean var8 = false;
            if (((var14 = (Skill)this.vSkill.elementAt(var1)).template.id < 67 || var14.template.id > 72) && var14 != null && var14.template.type == 2 && !var14.isCooldown()) {
               for(var6 = 0; var6 < this.vEff.size(); ++var6) {
                  if ((var9 = (Effect)this.vEff.elementAt(var6)) != null && var9.template.iconId == var14.template.iconId) {
                     var8 = true;
                     break;
                  }
               }

               if (!var8) {
                  GameScr.gI().a(var14, true);
                  Service.gI().sendUseSkillMyBuff();
                  this.m();
                  this.gt = System.currentTimeMillis();
                  break;
               }
            }
         }
      }

      if (this.me && isAHP && NSOT_MOB.b == null && this.cMP < this.cMaxMP * el / 100 && GameCanvas.u % 4 == 0 && this.statusMe != 14 && this.statusMe != 5 && this.cHp > 0) {
         GameScr.w();
      }

      Char var15;
      if (this.me && ei && this.nClass.classId == 6 && er > 0 && getMyChar().statusMe != 14 && getMyChar().statusMe != 5 && (var15 = GameScr.e(er)) != null && (var15.cHp <= 0 || var15.statusMe == 14 || var15.statusMe == 5 || ej)) {
         for(var1 = 0; var1 < this.vSkill.size(); ++var1) {
            if ((var14 = (Skill)getMyChar().vSkill.elementAt(var1)) != null && var14.template.type == 4) {
               if (Res.abs(this.cx - var15.cx) < var14.b() && Res.abs(this.cy - var15.cy) < var14.c()) {
                  getMyChar().myskill = var14;
                  GameScr.gI().g(er);
                  ej = false;
                  this.m();
               } else {
                  InfoMe.addInfo(mResources.rl, 20, mFont.tahoma_7_white);
               }
               break;
            }
         }
      }

      if (this.cHp > 0) {
         for(var1 = 0; var1 < this.vEff.size(); ++var1) {
            if ((var9 = (Effect)this.vEff.elementAt(var1)).template.type != 0 && var9.template.type != 12) {
               if (var9.template.type != 4 && var9.template.type != 17) {
                  if (var9.template.type == 13) {
                     if (GameCanvas.w) {
                        this.cHp -= this.cMaxHp * 3 / 100;
                        if (this.cHp <= 0) {
                           this.cHp = 1;
                        }
                     }
                  } else if (var9.template.type == 7) {
                     this.beginSound = true;
                  }
               } else if (GameCanvas.w) {
                  this.cHp += var9.param;
               }
            } else if (GameCanvas.w) {
               this.cHp += var9.param;
               this.cMP += var9.param;
            }
         }

         if (this.beginSound) {
            ++this.gx;
         } else {
            this.gx = 0;
         }

         if (this.eff5BuffHp > 0 && GameCanvas.x) {
            this.cHp += this.eff5BuffHp;
         }

         if (this.eff5BuffMp > 0 && GameCanvas.x) {
            this.cMP += this.eff5BuffMp;
         }

         if (this.cHp > this.cMaxHp) {
            this.cHp = this.cMaxHp;
         }

         if (this.cMP > this.cMaxMP) {
            this.cMP = this.cMaxMP;
         }
      }

      if (this.cmtoChar) {
         GameScr.gH6 = this.cx - GameScr.gW2 + GameScr.gH23 * this.cdir;
         GameScr.cmx = this.cy - GameScr.gH34;
      }

      this.tick = (this.tick + 1) % 100;
      if (this.me) {
         if (this.charFocus != null && (this.charFocus.isNhanbanz() || !GameScr.vCharInMap.contains(this.charFocus))) {
            this.charFocus = null;
         }

         if (this.cx < 10) {
            this.cvx = 0;
            this.cx = 10;
         } else if (this.cx > TileMap.c - 10) {
            this.cx = TileMap.c - 10;
            this.cvx = 0;
         }

         if (!flag && this.ai()) {
            ischangingMap = true;
            flag = true;
            Service.gI().requestChangeMap();
            GameCanvas.m();
            GameCanvas.l();
            return;
         }

         if (this.isLockAttack) {
            this.isLockAttack = System.currentTimeMillis() - this.gu < 2000L;
         }

         if (this.isLockKey) {
            this.currentMovePoint = null;
         }

         if (this.currentMovePoint != null && (this.statusMe == 1 || this.statusMe == 2)) {
            this.statusMe = 2;
            if (this.cx - this.currentMovePoint.xEnd > 0) {
               this.cdir = -1;
               if (this.cx - this.currentMovePoint.xEnd <= 10) {
                  this.currentMovePoint = null;
               }
            } else {
               this.cdir = 1;
               if (this.cx - this.currentMovePoint.xEnd >= -10) {
                  this.currentMovePoint = null;
               }
            }

            if (this.currentMovePoint != null) {
               this.cvx = this.f() * this.cdir;
               this.cvy = 0;
            }
         }

         this.ax();
         if (this.statusMe != 1 && this.statusMe != 6) {
            this.currMove = System.currentTimeMillis();
            this.isLastMove = true;
         } else if (System.currentTimeMillis() - this.currMove > 500L && this.isLastMove) {
            isSendMove = true;
            this.isLastMove = false;
            this.currMove = System.currentTimeMillis();
         }
      } else {
         if (GameCanvas.u % 20 == 0 && this.charID >= 0) {
            this.paintName = true;

            for(var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
               Char var16 = null;

               try {
                  var16 = (Char)GameScr.vCharInMap.elementAt(var1);
               } catch (Exception var12) {
               }

               if (var16 != null && !var16.equals(this) && (var16.cy == this.cy && Res.abs(var16.cx - this.cx) < 35 || this.cy - var16.cy < 32 && this.cy - var16.cy > 0 && Res.abs(var16.cx - this.cx) < 24)) {
                  this.paintName = false;
               }
            }
         }

         if (this.statusMe == 1 || this.statusMe == 6) {
            boolean var17 = false;
            if (this.currentMovePoint != null) {
               if (k(this.currentMovePoint.xEnd - this.cx) < 4 && k(this.currentMovePoint.yEnd - this.cy) < 4) {
                  this.cx = this.currentMovePoint.xEnd;
                  this.cy = this.currentMovePoint.yEnd;
                  this.currentMovePoint = null;
                  if ((TileMap.a(this.cx, this.cy) & 2) == 2) {
                     this.changeStatusStand();
                     GameCanvas.c().a(-1, this.cx - -8, this.cy);
                     GameCanvas.c().a(1, this.cx - 8, this.cy);
                  } else {
                     this.statusMe = 4;
                     this.cvy = 0;
                  }

                  var17 = true;
               } else if (this.cy == this.currentMovePoint.yEnd) {
                  if (this.cx != this.currentMovePoint.xEnd) {
                     this.cx = (this.cx + this.currentMovePoint.xEnd) / 2;
                     this.cf = GameCanvas.u % 5 + 2;
                  }
               } else if (this.cy < this.currentMovePoint.yEnd) {
                  this.cf = 12;
                  this.cx = (this.cx + this.currentMovePoint.xEnd) / 2;
                  if (this.cvy < 0) {
                     this.cvy = 0;
                  }

                  this.cy += this.cvy;
                  if ((TileMap.a(this.cx, this.cy) & 2) == 2) {
                     GameCanvas.c().a(-1, this.cx - -8, this.cy);
                     GameCanvas.c().a(1, this.cx - 8, this.cy);
                  }

                  ++this.cvy;
                  if (this.cvy > 16) {
                     this.cy = (this.cy + this.currentMovePoint.yEnd) / 2;
                  }
               } else {
                  this.cf = 7;
                  this.cx = (this.cx + this.currentMovePoint.xEnd) / 2;
                  this.cy = (this.cy + this.currentMovePoint.yEnd) / 2;
               }
            } else {
               var17 = true;
            }

            if (var17 && this.fb.size() > 0) {
               if (this.fb.size() > 5) {
                  this.currentMovePoint = (MovePoint)this.fb.lastElement();
                  this.fb.removeElementAt(0);
                  this.cx = this.currentMovePoint.xEnd;
                  this.cy = this.currentMovePoint.yEnd;
                  this.fb.removeAllElements();
                  this.statusMe = 6;
                  this.currentMovePoint = null;
                  return;
               }

               this.currentMovePoint = (MovePoint)this.fb.firstElement();
               this.fb.removeElementAt(0);
               if (this.currentMovePoint.dir == 2) {
                  this.statusMe = 2;
                  if (this.cx - this.currentMovePoint.xEnd > 0) {
                     this.cdir = -1;
                  } else if (this.cx - this.currentMovePoint.xEnd < 0) {
                     this.cdir = 1;
                  }

                  this.cvx = 5 * this.cdir;
                  this.cvy = 0;
               } else if (this.currentMovePoint.dir == 3) {
                  this.statusMe = 3;
                  GameCanvas.c().a(-1, this.cx - -8, this.cy);
                  GameCanvas.c().a(1, this.cx - 8, this.cy);
                  if (this.cx - this.currentMovePoint.xEnd > 0) {
                     this.cdir = -1;
                  } else if (this.cx - this.currentMovePoint.xEnd < 0) {
                     this.cdir = 1;
                  }

                  this.cvx = k(this.cx - this.currentMovePoint.xEnd) / 9 * this.cdir;
                  this.cvy = -10;
               } else if (this.currentMovePoint.dir == 4) {
                  this.statusMe = 4;
                  if (this.cx - this.currentMovePoint.xEnd > 0) {
                     this.cdir = -1;
                  } else if (this.cx - this.currentMovePoint.xEnd < 0) {
                     this.cdir = 1;
                  }

                  this.cvx = k(this.cx - this.currentMovePoint.xEnd) / 9 * this.cdir;
                  this.cvy = 0;
               } else {
                  this.cx = this.currentMovePoint.xEnd;
                  this.cy = this.currentMovePoint.yEnd;
                  this.currentMovePoint = null;
               }
            }

            if (this.statusMe == 6) {
               if (this.cf >= 8 && this.cf <= 11) {
                  ++this.cf;
                  ++this.cp1;
                  if (this.cf > 11) {
                     this.cf = 8;
                  }

                  if (this.cp1 > 5) {
                     this.cf = 0;
                  }
               }

               if (this.cf <= 1) {
                  ++this.cp1;
                  if (this.cp1 > 6) {
                     this.cf = 0;
                  } else {
                     this.cf = 1;
                  }

                  if (this.cp1 > 10) {
                     this.cp1 = 0;
                  }
               }
            }

            this.lcx = this.cx;
            this.lcy = this.cy;
            if (System.currentTimeMillis() - this.timeSummon > 7000L) {
               if (!this.isJump && this.s() && this.vitaWolf >= 500) {
                  this.isJump = true;
                  ServerEffect.addServerEffect(60, this, 1);
               }

               if (this.fallAttack && this.t()) {
                  this.fallAttack = false;
                  this.autoFall = true;
               }
            }
         }
      }

      if (this.isInjure > 0) {
         this.cf = 21;
         --this.isInjure;
      } else {
         switch (this.statusMe) {
            case 1:
               this.isMoto = false;
               this.timeBocdau = 0;
               if (this.isJump) {
                  if (this.cdir == 1) {
                     this.ig = this.cx + 21 + 4;
                     this.ih = this.cy - 15;
                  } else {
                     this.ig = this.cx - 24 - 4;
                     this.ih = this.cy - 15;
                  }
               }

               var15 = this;

               for(var1 = 0; var1 < var15.vDomsang.size(); ++var1) {
                  (var13 = (Domsang)var15.vDomsang.elementAt(var1)).a();
                  if (var13.frame >= 6) {
                     var15.vDomsang.removeElementAt(var1);
                  }
               }

               var15.cvx = 0;
               var15.cvy = 0;
               ++var15.cp1;
               var15.lcx = var15.cx;
               var15.lcy = var15.cy;
               if (var15.cp1 > 30) {
                  var15.cp1 = 0;
               }

               if (var15.cp1 % 15 < 5) {
                  var15.cf = 0;
               } else {
                  var15.cf = 1;
               }

               var15.ay();
               if (System.currentTimeMillis() - var15.timeSummon > 7000L) {
                  if (!var15.isJump && var15.s() && var15.vitaWolf >= 500) {
                     var15.isJump = true;
                     ServerEffect.addServerEffect(60, var15, 1);
                  }

                  if (var15.fallAttack && var15.t()) {
                     var15.fallAttack = false;
                     var15.autoFall = true;
                  }
               }
               break;
            case 2:
               if (this.fallAttack) {
                  ++this.timeBocdau;
                  if (this.arrItemMounts[4].template.id == 485 && this.arrItemMounts[4].sys >= 4) {
                     this.isMoto = true;
                  }

                  if (this.timeBocdau > 20) {
                     this.isMoto = false;
                  }
               }

               if (this.isJump) {
                  if (this.cdir == 1) {
                     if (this.idWolfW[this.dyBody] == 1737) {
                        this.ig = this.cx + 21 + 4;
                        this.ih = this.cy - 19;
                     } else {
                        this.ig = this.cx + 21 + 4;
                        this.ih = this.cy - 16;
                     }
                  } else if (this.idWolfW[this.dyBody] == 1737) {
                     this.ig = this.cx - 24 - 4;
                     this.ih = this.cy - 19;
                  } else {
                     this.ig = this.cx - 24 - 4;
                     this.ih = this.cy - 16;
                  }
               } else if (this.fallAttack) {
                  if (this.cdir == 1) {
                     this.ig = this.cx + 15;
                     this.ii = this.cx - 25;
                     this.ih = this.cy;
                     this.ij = this.cy;
                  } else {
                     this.ig = this.cx - 18;
                     this.ii = this.cx + 25;
                     this.ih = this.cy;
                     this.ij = this.cy;
                  }
               }

               var1 = 0;
               if (!this.me && this.currentMovePoint != null) {
                  var1 = k(this.cx - this.currentMovePoint.xEnd);
               }

               ++this.cp1;
               if (this.cp1 >= 10) {
                  this.cp1 = 0;
               }

               this.cf = (this.cp1 >> 1) + 2;
               if ((TileMap.a(this.cx, this.cy - 1) & 64) == 64) {
                  this.cx += this.cvx >> 1;
               } else {
                  this.cx += this.cvx;
               }

               if (this.cdir == 1) {
                  if (GameScr.er != 1) {
                     if (TileMap.a(this.cx + this.chw, this.cy - this.chh, 4)) {
                        if (this.me) {
                           this.cvx = 0;
                           this.cx = TileMap.c(this.cx + this.chw) - this.chw;
                        } else {
                           this.am();
                        }
                     }
                  } else if (TileMap.a(this.cx + this.chw, this.cy - this.chh, 4)) {
                     if (this.me) {
                        this.statusMe = 3;
                        if (this.statusMe == 3) {
                           this.cvy -= 10;
                        }
                     } else {
                        this.am();
                     }
                  }
               } else if (GameScr.er != 1) {
                  if (TileMap.a(this.cx - this.chw - 1, this.cy - this.chh, 8)) {
                     if (this.me) {
                        this.cvx = 0;
                        this.cx = TileMap.c(this.cx - this.chw - 1) + TileMap.i + this.chw;
                     } else {
                        this.am();
                     }
                  }
               } else if (TileMap.a(this.cx - this.chw - 1, this.cy - this.chh, 8)) {
                  if (this.me) {
                     this.statusMe = 3;
                     if (this.statusMe == 3) {
                        this.cvy -= 10;
                     }
                  } else {
                     this.am();
                  }
               }

               if (!this.fallAttack && this.t()) {
                  this.fallAttack = true;
                  this.autoFall = false;
               }

               if (!this.isJump && this.s() && this.vitaWolf >= 500) {
                  this.dx0 = Res.abs(this.cx - this.lcx);
                  this.dy0 = Res.abs(this.cy - this.lcy);
                  this.dx0 = this.dx0 > this.dy0 ? this.dx0 : this.dy0;
                  if (this.me && this.dx0 > 150 || !this.me && this.dx0 > 40) {
                     this.isJump = true;
                     ServerEffect.addServerEffect(60, this, 1);
                  }

                  this.dx0 = this.dy0 = 0;
               }

               if (this.me) {
                  if (this.cvx > 0) {
                     --this.cvx;
                  } else if (this.cvx < 0) {
                     ++this.cvx;
                  } else {
                     this.changeStatusStand();
                  }
               }

               if ((TileMap.a(this.cx, this.cy) & 2) != 2) {
                  if (this.me) {
                     if ((this.cx - this.cxSend != 0 || this.cy - this.cySend != 0) && this.me) {
                        this.cf = 7;
                        this.statusMe = 4;
                        this.cvx = 3 * this.cdir;
                        this.cp2 = 0;
                     }
                  } else {
                     this.am();
                  }
               }

               if (!this.me && this.currentMovePoint != null && k(this.cx - this.currentMovePoint.xEnd) > var1) {
                  this.am();
               }

               if (this.fallAttack) {
                  if (GameCanvas.u % 5 == 0) {
                     ServerEffect.addServerEffect(120, this.cx - (this.cdir << 5), this.cy, 0, (byte)this.cdir);
                  }
               } else {
                  GameCanvas.c().a(this.cdir, this.cx - (this.cdir << 3), this.cy);
               }

               this.ay();
               var6 = this.cx - (this.cdir << 4);
               var2 = this.cy;
               if (this.isJump && this.arrItemMounts[4].sys >= 4 && this.e() > 0 && GameCanvas.u % 8 == 0) {
                  if (this.e() == 1) {
                     ServerEffect.addServerEffect(116, var6, var2, 2);
                  } else if (this.e() == 2) {
                     ServerEffect.addServerEffect(117, var6, var2, 2);
                  } else if (this.e() == 3) {
                     ServerEffect.addServerEffect(118, var6, var2, 2);
                  }
               }
               break;
            case 3:
               this.isMoto = false;
               this.timeBocdau = 0;
               if (this.isJump) {
                  if (this.cdir == 1) {
                     this.ig = this.cx + 21 + 4;
                     this.ih = this.cy - 30;
                  } else {
                     this.ig = this.cx - 23 - 4;
                     this.ih = this.cy - 30;
                  }
               }

               if (GameScr.er == 1) {
                  if (this.cdir == 1) {
                     this.cvx = 5;
                  } else {
                     this.cvx = -5;
                  }
               }

               if (this.t()) {
                  this.fallAttack = true;
                  this.autoFall = false;
               }

               this.cx += this.cvx;
               this.cy += this.cvy;
               if (this.cy < 0) {
                  this.cy = 0;
                  this.cvy = -1;
               }

               ++this.cvy;
               if (!this.me && this.currentMovePoint != null) {
                  label1322: {
                     if ((var1 = this.currentMovePoint.xEnd - this.cx) > 0) {
                        if (this.cvx > var1) {
                           this.cvx = var1;
                        }

                        if (this.cvx >= 0) {
                           break label1322;
                        }
                     } else if (var1 < 0) {
                        if (this.cvx < var1) {
                           this.cvx = var1;
                        }

                        if (this.cvx <= 0) {
                           break label1322;
                        }
                     }

                     this.cvx = var1;
                  }
               }

               if (this.cp1 == 0) {
                  this.cf = 7;
               } else {
                  this.cf = 23;
               }

               if (this.canJumpHigh) {
                  if (this.cvy == -3) {
                     this.cf = 8;
                  } else if (this.cvy == -2) {
                     this.cf = 9;
                  } else if (this.cvy == -1) {
                     this.cf = 10;
                  } else if (this.cvy == 0) {
                     this.cf = 11;
                  }
               }

               if (this.cdir == 1) {
                  if ((TileMap.a(this.cx + this.chw, this.cy - 1) & 4) == 4 && this.cx <= TileMap.c(this.cx + this.chw) + 12) {
                     this.cx = TileMap.c(this.cx + this.chw) - this.chw;
                     this.cvx = 0;
                  }
               } else if ((TileMap.a(this.cx - this.chw, this.cy - 1) & 8) == 8 && this.cx >= TileMap.c(this.cx - this.chw) + 12) {
                  this.cx = TileMap.c(this.cx + 24 - this.chw) + this.chw;
                  this.cvx = 0;
               }

               if (this.cvy == 0) {
                  if (this.me) {
                     this.cyStartFall = this.cy;
                     this.statusMe = 4;
                     this.cp1 = 0;
                     if (this.canJumpHigh) {
                        this.cp2 = 1;
                     } else {
                        this.cp2 = 0;
                     }

                     this.cvy = 1;
                  } else {
                     this.am();
                  }
               }

               if (this.me && !flag && this.ai()) {
                  flag = true;
                  ischangingMap = true;
                  Service.gI().requestChangeMap();
                  GameCanvas.m();
                  GameCanvas.l();
               } else {
                  if (this.cp3 < 0) {
                     ++this.cp3;
                  }

                  if (this.cy > this.ch && TileMap.a(this.cx, this.cy - this.ch, 8192)) {
                     if (this.me) {
                        this.statusMe = 4;
                        this.cp1 = 0;
                        this.cp2 = 0;
                        this.cvy = 1;
                     } else {
                        this.am();
                     }
                  }

                  if (!this.me && this.currentMovePoint != null && this.cy < this.currentMovePoint.yEnd) {
                     this.am();
                  }
               }
               break;
            case 4:
               this.isMoto = false;
               this.timeBocdau = 0;
               if (this.isJump) {
                  if (this.cdir == 1) {
                     this.ig = this.cx + 21 + 4;
                     this.ih = this.cy - 19;
                  } else {
                     this.ig = this.cx - 24;
                     this.ih = this.cy - 20;
                  }
               }

               this.an();
               break;
            case 5:
               this.isMoto = false;
               this.timeBocdau = 0;
               ++this.cp1;
               this.cx += (this.cp2 - this.cx) / 4;
               if (this.cp1 > 7) {
                  this.cy += (this.cp3 - this.cy) / 4;
               } else {
                  this.cy += this.cp1 - 10;
               }

               if (Res.abs(this.cp2 - this.cx) < 4 && Res.abs(this.cp3 - this.cy) < 10) {
                  this.cx = this.cp2;
                  this.cy = this.cp3;
                  this.statusMe = 14;
                  this.l(60);
                  if (this.me) {
                     GameScr.gI().resetButton();
                  }
               }

               this.cf = 21;
               break;
            case 6:
               this.isMoto = false;
               this.timeBocdau = 0;
               if (this.cf == 21 && this.isInjure <= 0) {
                  this.cf = 0;
               }
            case 7:
            case 8:
            default:
               break;
            case 9:
               this.isMoto = false;
               this.timeBocdau = 0;
               this.cx += this.cvx * this.cdir;
               this.cy += this.gw;
               ++this.gw;
               if (this.cp1 == 0) {
                  this.cf = 7;
               } else {
                  this.cf = 23;
               }

               if (this.canJumpHigh) {
                  if (this.gw == -3) {
                     this.cf = 8;
                  } else if (this.gw == -2) {
                     this.cf = 9;
                  } else if (this.gw == -1) {
                     this.cf = 10;
                  } else if (this.gw == 0) {
                     this.cf = 11;
                  }
               }

               if (this.gw == 0) {
                  this.statusMe = 6;
                  ((MovePoint)this.fb.firstElement()).dir = 4;
                  this.cp1 = 0;
                  this.cvy = 1;
               }
               break;
            case 10:
               this.isMoto = false;
               this.timeBocdau = 0;
               if (!TileMap.a(this.cx, this.cy, 64)) {
                  this.statusMe = 4;
               }

               ++this.cp1;
               if (this.cp1 >= 5) {
                  this.cp1 = 0;
               }

               this.cf = this.cp1 + 2;
               if (this.cdir == 1) {
                  if (TileMap.a(this.cx + this.chw, this.cy - 1, 4)) {
                     this.cvx = 0;
                     this.cx = TileMap.c(this.cx + this.chw) - this.chw;
                  }
               } else if (TileMap.a(this.cx - this.chw - 1, this.cy - 1, 8)) {
                  this.cvx = 0;
                  this.cx = TileMap.c(this.cx - this.chw - 1) + TileMap.i + this.chw;
               }

               this.cx += this.cvx;
               if (this.cvx > 0) {
                  --this.cvx;
               } else if (this.cvx < 0) {
                  ++this.cvx;
               } else if (this.cx - this.cxSend != 0) {
                  if (this.me && System.currentTimeMillis() - (this.timelastSendmove + (long) delaySendmove) >= 0L) {
                     isSendMove = true;
                  }

                  this.statusMe = 11;
               }

               GameCanvas.c();
               GameCanvas.d(this.cx, this.cy);
               GameCanvas.c().a(this.cdir, this.cx - (this.cdir << 3), this.cy);
               break;
            case 11:
               this.isMoto = false;
               this.timeBocdau = 0;
               this.ao();
               break;
            case 12:
               this.isMoto = false;
               this.timeBocdau = 0;
               this.al();
               break;
            case 13:
               this.isMoto = false;
               this.timeBocdau = 0;
               break;
            case 14:
               this.isMoto = false;
               this.timeBocdau = 0;
         }
      }

      if (this.wdx != 0 || this.wdy != 0) {
         this.startDie(this.wdx, this.wdy);
         this.wdx = 0;
         this.wdy = 0;
      }

      if (this.moveFast != null) {
         if (this.moveFast[0] == 0) {
            ++this.moveFast[0];
            ServerEffect.addServerEffect(60, this, 1);
         } else if (this.moveFast[0] < 10) {
            ++this.moveFast[0];
         } else {
            this.cx = this.moveFast[1];
            this.cy = this.moveFast[2];
            this.moveFast = null;
            ServerEffect.addServerEffect(60, this, 1);
            if (this.me) {
               if ((TileMap.a(this.cx, this.cy) & 2) != 2) {
                  this.statusMe = 4;
                  getMyChar().b(GameScr.s[38], 1);
               } else {
                  getMyChar().b(GameScr.s[38], 0);
               }
            }
         }
      }

      if (!this.me && this.fb.size() == 0 && this.ez != 0 && this.fa != 0 && this.currentMovePoint == null) {
         if (this.ez != this.cx) {
            this.cx = this.ez;
         }

         if (this.fa != this.cy) {
            this.cy = this.fa;
         }

         if (this.cHp > 0) {
            this.statusMe = 6;
         }
      }

      ++this.gd;
      if (this.gd > 5) {
         this.gd = 0;
      }

      this.aj();
      super.a((byte)0, this.statusMe);
   }

   private void aj() {
      if (!this.me) {
         if (this.cf == 12 && this.fbyhorse == this.cx && this.FramecharRideHorse == this.cy) {
            ++this.inAir;
         } else if (this.cf == 0 && (TileMap.a(this.cx, this.cy) & 2) != 2) {
            ++this.inAir;
         } else {
            this.inAir = 0;
         }

         if (this.inAir > 1) {
            for(int var1 = this.cy; var1 < this.cy + 150; var1 += 24) {
               if ((TileMap.a(this.cx, var1) & 2) != 2) {
                  if ((var1 = TileMap.b(var1) + 24) - this.cy > 24) {
                     this.cy += (var1 - this.cy) / 2;
                     if (!this.fallAttack && !this.isJump) {
                        this.cf = 12;
                     }

                     this.fb.removeAllElements();
                     this.currentMovePoint = null;
                  } else {
                     this.statusMe = 1;
                     this.fb.removeAllElements();
                     this.currentMovePoint = null;
                     this.cvx = 0;
                     this.cvy = 0;
                     this.cp1 = 0;
                     this.cp2 = 0;
                     this.cp3 = 0;
                     this.inAir = 0;
                     this.ez = 0;
                     this.fa = 0;
                     this.cy = var1;
                  }

                  this.lcy = this.cy;
                  return;
               }
            }
         }
      }

   }

   private void ak() {
      if (this.statusMe != 14 && this.statusMe != 5) {
         if (this.fu != null && this.mobFocus != null && this.mobFocus.status == 0) {
            if (!this.me) {
               if ((TileMap.a(this.cx, this.cy) & 2) == 2) {
                  this.changeStatusStand();
               } else {
                  this.statusMe = 6;
               }
            }

            this.indexSkill = 0;
            this.fu = null;
            this.eff0 = this.eff1 = this.eff2 = null;
            this.i0 = this.i1 = this.i2 = 0;
            this.mobFocus = null;
            this.fv = null;
            this.arrow = null;
         }

         if (this.fu != null && this.arrow == null && this.indexSkill >= this.ap().length) {
            if (!this.me) {
               if ((TileMap.a(this.cx, this.cy) & 2) == 2) {
                  this.changeStatusStand();
               } else {
                  this.statusMe = 6;
               }
            }

            this.indexSkill = 0;
            this.fu = null;
            this.eff0 = this.eff1 = this.eff2 = null;
            this.i0 = this.i1 = this.i2 = 0;
            this.arrow = null;
         }

         SkillInfoPaint[] var1;
         if ((var1 = this.ap()) != null) {
            if (this.me && this.myskill.template.type == 2) {
               if (this.indexSkill == var1.length - var1.length / 3) {
                  Service.gI().sendUseSkillMyBuff();
                  this.m();
                  return;
               }
            } else if ((this.mobFocus != null || !this.me && this.charFocus != null || this.me && this.charFocus != null && isMeCanAttackOtherPlayer(this.charFocus)) && this.arrow == null && this.indexSkill == var1.length - var1.length / 3) {
               this.r();
               if (this.me) {
                  this.m();
               }
            }
         }
      }

   }

   public final void m() {
      if (System.currentTimeMillis() - this.timeLastCheck > 500L) {
         if (this.ga != null && this.myskill.template.type != 1 && this.ga != null) {
            this.myskill = this.ga;
            Service.gI().selectSkill(this.myskill.template.id);
         }

         if (this.gb) {
            if (this.ga != null) {
               this.myskill = this.ga;
               Service.gI().selectSkill(this.myskill.template.id);
            }
         } else if (GameScr.er != 1) {
            this.ga = this.myskill;
         }

         this.timeLastCheck = System.currentTimeMillis();
      }

   }

   private void al() {
      ++this.cp1;
      if (this.cdir == 1) {
         if ((TileMap.a(this.cx + this.chw, this.cy - this.chh) & 4) == 4) {
            this.cvx = 0;
         }
      } else if ((TileMap.a(this.cx - this.chw, this.cy - this.chh) & 8) == 8) {
         this.cvx = 0;
      }

      if (this.cy > this.ch && TileMap.a(this.cx, this.cy - this.ch, 8192)) {
         if (!TileMap.a(this.cx, this.cy, 2)) {
            this.statusMe = 4;
            this.cp1 = 0;
            this.cp2 = 0;
            this.cvy = 1;
         } else {
            this.cy = TileMap.b(this.cy);
         }
      }

      this.cx += this.cvx;
      this.cy += this.cvy;
      if (this.cy < 0) {
         this.cy = this.cvy = 0;
      }

      if (this.cvy == 0) {
         if ((TileMap.a(this.cx, this.cy) & 2) != 2) {
            this.statusMe = 4;
            this.cvx = (this.f() >> 1) * this.cdir;
            this.cp1 = this.cp2 = 0;
         }
      } else if (this.cvy < 0) {
         ++this.cvy;
         if (this.cvy == 0) {
            this.cvy = 1;
         }
      } else {
         if (this.cvy < 20 && this.cp1 % 5 == 0) {
            ++this.cvy;
         }

         if (this.cvy > 3) {
            this.cvy = 3;
         }

         if ((TileMap.a(this.cx, this.cy + 3) & 2) == 2 && this.cy <= TileMap.c(this.cy + 3)) {
            this.cvx = this.cvy = 0;
            this.cy = TileMap.c(this.cy + 3);
         }

         if (TileMap.a(this.cx, this.cy, 64) && this.cy % TileMap.i > 8) {
            this.statusMe = 10;
            this.cvx = this.cdir << 1;
            this.cvy >>= 2;
            this.cy = TileMap.b(this.cy) + 12;
            this.statusMe = 11;
            return;
         }

         if (TileMap.a(this.cx, this.cy, 2048)) {
            this.statusMe = 11;
            return;
         }
      }

      if (this.cvx > 0) {
         --this.cvx;
      } else if (this.cvx < 0) {
         ++this.cvx;
      }

   }

   private void am() {
      this.statusMe = 6;
      this.cvx = 0;
      this.cvy = 0;
      this.cp1 = this.cp2 = 0;
   }

   private static int k(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   private void an() {
      if (this.cy + 4 >= TileMap.d) {
         this.changeStatusStand();
         this.cvx = this.cvy = 0;
      } else {
         if (this.cy % 24 == 0 && (TileMap.a(this.cx, this.cy) & 2) == 2) {
            if (this.me) {
               this.cvx = this.cvy = 0;
               this.cp1 = this.cp2 = 0;
               this.changeStatusStand();
               return;
            }

            this.am();
            this.cf = 0;
            GameCanvas.c().a(-1, this.cx - -8, this.cy);
            GameCanvas.c().a(1, this.cx - 8, this.cy);
         }

         this.cf = 12;
         this.cx += this.cvx;
         if (!this.me && this.currentMovePoint != null) {
            label118: {
               int var1;
               if ((var1 = this.currentMovePoint.xEnd - this.cx) > 0) {
                  if (this.cvx > var1) {
                     this.cvx = var1;
                  }

                  if (this.cvx >= 0) {
                     break label118;
                  }
               } else if (var1 < 0) {
                  if (this.cvx < var1) {
                     this.cvx = var1;
                  }

                  if (this.cvx <= 0) {
                     break label118;
                  }
               }

               this.cvx = var1;
            }
         }

         this.cy += this.cvy;
         if (this.cvy < 20) {
            ++this.cvy;
         }

         if (this.cdir == 1) {
            if ((TileMap.a(this.cx + this.chw, this.cy - 1) & 4) == 4 && this.cx <= TileMap.c(this.cx + this.chw) + 12) {
               this.cx = TileMap.c(this.cx + this.chw) - this.chw;
               this.cvx = 0;
            }
         } else if ((TileMap.a(this.cx - this.chw, this.cy - 1) & 8) == 8 && this.cx >= TileMap.c(this.cx - this.chw) + 12) {
            this.cx = TileMap.c(this.cx + 24 - this.chw) + this.chw;
            this.cvx = 0;
         }

         if (this.cvy > 4 && (this.cyStartFall == 0 || this.cyStartFall <= TileMap.b(this.cy + 3)) && (TileMap.a(this.cx, this.cy + 3) & 2) == 2) {
            if (this.me) {
               this.cyStartFall = 0;
               this.cvx = this.cvy = 0;
               this.cp1 = this.cp2 = 0;
               this.cy = TileMap.c(this.cy + 3);
               this.changeStatusStand();
               GameCanvas.c().a(-1, this.cx - -8, this.cy);
               GameCanvas.c().a(1, this.cx - 8, this.cy);
            } else {
               this.am();
               this.cy = TileMap.c(this.cy + 3);
               this.cf = 0;
               GameCanvas.c().a(-1, this.cx - -8, this.cy);
               GameCanvas.c().a(1, this.cx - 8, this.cy);
            }
         } else {
            if (this.cp2 == 1) {
               if (this.cvy == 3) {
                  this.cf = 11;
               } else if (this.cvy == 2) {
                  this.cf = 8;
               } else if (this.cvy == 1) {
                  this.cf = 9;
               } else if (this.cvy == 0) {
                  this.cf = 10;
               }
            } else {
               this.cf = 12;
            }

            if (this.cvy > 6 && TileMap.a(this.cx, this.cy, 64) && this.cy % TileMap.i > 8) {
               this.cy = TileMap.b(this.cy) + 8;
               this.statusMe = 10;
               this.cvx = this.cdir << 1;
               this.cvy >>= 2;
               this.cy = TileMap.b(this.cy) + 12;
            }

            if (!this.me) {
               if ((TileMap.a(this.cx, this.cy + 1) & 2) == 2) {
                  this.cf = 0;
               }

               if (this.currentMovePoint != null && this.cy > this.currentMovePoint.yEnd) {
                  this.am();
               }
            }
         }
      }

   }

   private void ao() {
      this.cy += this.cvy;
      if (this.cvy < 20 && GameCanvas.u % 2 == 0) {
         ++this.cvy;
      }

      this.cf = 7;
      if (this.cy >= TileMap.d) {
         this.cHp = 0;
         this.statusMe = 5;
      } else if (TileMap.a(this.cx, this.cy, 2)) {
         this.changeStatusStand();
         this.cvx = this.cvy = 0;
         this.cp1 = this.cp2 = 0;
         this.cy = TileMap.c(this.cy);
      } else if (TileMap.a(this.cx, this.cy, 2048)) {
         this.cHp = 0;
         this.statusMe = 5;
      }

   }

   public final void n() {
      this.wp = 15;
      this.p();
      this.q();
   }

   public final void o() {
      this.wp = 15;
   }

   public static Part b(int var0) {
      try {
         return var0 == 0 ? GameScr.parts[27] : GameScr.parts[2];
      } catch (Exception var2) {
         return null;
      }
   }

   public final void p() {
      if (this.cgender == 0) {
         this.body = 10;
      } else {
         this.body = 1;
      }

   }

   public final void q() {
      if (this.cgender == 0) {
         this.leg = 9;
      } else {
         this.leg = 0;
      }

   }

   public final void a(SkillPaint var1, int var2) {
      long var3 = System.currentTimeMillis();
      if (this.me) {
         if (var3 - this.myskill.lastTimeUseThisSkill < (long)this.myskill.coolDown) {
            this.myskill.l = true;
            return;
         }

         this.myskill.lastTimeUseThisSkill = var3;
         this.cMP -= this.myskill.manaUse;
         if (this.cMP < 0) {
            this.cMP = 0;
         }
      }

      this.b(var1, var2);
   }

   public final void b(SkillPaint var1, int var2) {
      this.fu = var1;
      this.sType = var2;
      this.indexSkill = 0;
      this.i0 = this.i1 = this.i2 = this.dx0 = this.dx1 = this.dx2 = this.dy0 = this.dy1 = this.dy2 = 0;
      this.eff0 = null;
      this.eff1 = null;
      this.eff2 = null;
   }

   private SkillInfoPaint[] ap() {
      if (this.fu == null) {
         return null;
      } else {
         return this.sType == 0 ? this.fu.skillStand : this.fu.skillfly;
      }
   }

   public final void r() {
      try {
         int var1;
         MyVector var2;
         mResources var3;
         int var4;
         if (this.me) {
            if (this.myskill.template.type == 2) {
               return;
            }

            if (this.myskill.template.id == 42 && !this.myskill.isCooldown()) {
               this.isLockAttack = true;
               this.gu = System.currentTimeMillis();
            }

            if (this.fu != null && (this.mobFocus != null || this.charFocus != null && isMeCanAttackOtherPlayer(this.charFocus))) {
               if (NSOT_MOB.b != null) {
                  Auto.a(this.fu);
                  return;
               }

               var1 = this.myskill.b();
               var4 = this.myskill.c();
               var2 = new MyVector();
               MyVector var5 = new MyVector();
               int var6;
               Mob var7;
               Char var8;
               if (this.charFocus != null) {
                  var5.addElement(this.charFocus);

                  for(var6 = 0; var6 < GameScr.vCharInMap.size() && var2.size() + var5.size() < this.myskill.d(); ++var6) {
                     if ((var8 = (Char)GameScr.vCharInMap.elementAt(var6)).statusMe != 14 && var8.statusMe != 5 && var8.statusMe != 15 && !var8.isInvisible && !var8.equals(this.charFocus) && isMeCanAttackOtherPlayer(var8) && this.charFocus.cx - var1 <= var8.cx && var8.cx <= this.charFocus.cx + var1 && this.charFocus.cy - var4 <= var8.cy && var8.cy <= this.charFocus.cy + var4 && (this.cdir == -1 && var8.cx <= this.cx || this.cdir == 1 && var8.cx >= this.cx)) {
                        var5.addElement(var8);
                     }
                  }

                  for(var6 = 0; var6 < GameScr.vMobAttack.size() && var2.size() + var5.size() < this.myskill.d(); ++var6) {
                     if ((var7 = (Mob)GameScr.vMobAttack.elementAt(var6)).status != 1 && var7.status != 0 && this.charFocus.cx - var1 <= var7.x && var7.x <= this.charFocus.cx + var1 && this.charFocus.cy - var4 <= var7.y && var7.y <= this.charFocus.cy + var4 && (this.cdir == -1 && var7.x <= this.cx || this.cdir == 1 && var7.x >= this.cx)) {
                        var2.addElement(var7);
                     }
                  }
               } else if (this.mobFocus != null && this.mobFocus.status != 1 && this.mobFocus.status != 0) {
                  var2.addElement(this.mobFocus);

                  for(var6 = 0; var6 < GameScr.vMobAttack.size() && var2.size() + var5.size() < this.myskill.d(); ++var6) {
                     if ((var7 = (Mob)GameScr.vMobAttack.elementAt(var6)).status != 1 && var7.status != 0 && !var7.equals(this.mobFocus) && this.mobFocus.x - 100 <= var7.x && var7.x <= this.mobFocus.x + 100 && this.mobFocus.y - 50 <= var7.y && var7.y <= this.mobFocus.y + 50) {
                        var2.addElement(var7);
                     }
                  }

                  for(var6 = 0; var6 < GameScr.vCharInMap.size() && var2.size() + var5.size() < this.myskill.d(); ++var6) {
                     if ((var8 = (Char)GameScr.vCharInMap.elementAt(var6)).statusMe != 14 && var8.statusMe != 5 && var8.statusMe != 15 && !var8.isInvisible && (this.cTypePk == 4 && var8.cTypePk == 5 || this.cTypePk == 5 && var8.cTypePk == 4 || var8.cTypePk == 3 || this.cTypePk == 3 || var8.cTypePk == 1 && this.cTypePk == 1 || this.testCharId >= 0 && this.testCharId == var8.charID || this.killCharId >= 0 && this.killCharId == var8.charID) && this.mobFocus.x - var1 <= var8.cx && var8.cx <= this.mobFocus.x + var1 && this.mobFocus.y - var4 <= var8.cy && var8.cy <= this.mobFocus.y + var4 && (this.cdir == -1 && var8.cx <= this.cx || this.cdir == 1 && var8.cx >= this.cx)) {
                        var5.addElement(var8);
                     }
                  }
               }

               this.fv = new EffectPaint[var2.size() + var5.size()];

               for(var6 = 0; var6 < var2.size(); ++var6) {
                  this.fv[var6] = new EffectPaint();
                  this.fv[var6].effCharPaint = GameScr.v[this.fu.id - 1];
                  this.fv[var6].eMob = (Mob)var2.elementAt(var6);
               }

               for(var6 = 0; var6 < var5.size(); ++var6) {
                  this.fv[var6 + var2.size()] = new EffectPaint();
                  this.fv[var6 + var2.size()].effCharPaint = GameScr.v[this.fu.id - 1];
                  this.fv[var6 + var2.size()].eChar = (Char)var5.elementAt(var6);
               }

               if (this.fv.length > 1) {
                  var3 = new mResources();
                  if (this.fv[0].eMob != null) {
                     var3 = new mResources(this.fv[0].eMob.x, this.fv[0].eMob.y);
                  } else if (this.fv[0].eChar != null) {
                     var3 = new mResources(this.fv[0].eChar.cx, this.fv[0].eChar.cy);
                  }

                  MyVector var9 = new MyVector();

                  for(var1 = 1; var1 < this.fv.length; ++var1) {
                     if (this.fv[var1].eMob != null) {
                        var9.addElement(new mResources(this.fv[var1].eMob.x, this.fv[var1].eMob.y));
                     } else if (this.fv[var1].eChar != null) {
                        var9.addElement(new mResources(this.fv[var1].eChar.cx, this.fv[var1].eChar.cy));
                     }

                     if (var1 > 5) {
                        break;
                     }
                  }

                  Lightning.addLight(var9, var3, this.w());
               }

               byte var11 = 0;
               if (this.mobFocus != null) {
                  var11 = 1;
               } else if (this.charFocus != null) {
                  var11 = 2;
               }

               if (this.me) {
                  Service.gI().sendPlayerAttack((MyVector)var2, (MyVector)var5, (int)var11);
                  return;
               }
            }
         } else if (this.fu != null && (this.mobFocus != null || this.charFocus != null)) {
            if (this.attMobs != null && this.attChars != null) {
               this.fv = new EffectPaint[this.attMobs.length + this.attChars.length];

               for(var1 = 0; var1 < this.attMobs.length; ++var1) {
                  this.fv[var1] = new EffectPaint();
                  this.fv[var1].effCharPaint = GameScr.v[this.fu.id - 1];
                  this.fv[var1].eMob = this.attMobs[var1];
               }

               for(var1 = 0; var1 < this.attChars.length; ++var1) {
                  this.fv[var1 + this.attMobs.length] = new EffectPaint();
                  this.fv[var1 + this.attMobs.length].effCharPaint = GameScr.v[this.fu.id - 1];
                  this.fv[var1 + this.attMobs.length].eChar = this.attChars[var1];
               }

               this.attMobs = null;
               this.attChars = null;
            } else if (this.attMobs != null) {
               this.fv = new EffectPaint[this.attMobs.length];

               for(var1 = 0; var1 < this.attMobs.length; ++var1) {
                  this.fv[var1] = new EffectPaint();
                  this.fv[var1].effCharPaint = GameScr.v[this.fu.id - 1];
                  this.fv[var1].eMob = this.attMobs[var1];
               }

               this.attMobs = null;
            } else if (this.attChars != null) {
               this.fv = new EffectPaint[this.attChars.length];

               for(var1 = 0; var1 < this.attChars.length; ++var1) {
                  this.fv[var1] = new EffectPaint();
                  this.fv[var1].effCharPaint = GameScr.v[this.fu.id - 1];
                  this.fv[var1].eChar = this.attChars[var1];
               }

               this.attChars = null;
            }

            if (this.fv.length > 1 && this.fv[0] != null) {
               var3 = new mResources();
               if (this.fv[0].eMob != null) {
                  var3 = new mResources(this.fv[0].eMob.x, this.fv[0].eMob.y);
               } else if (this.fv[0].eChar != null) {
                  var3 = new mResources(this.fv[0].eChar.cx, this.fv[0].eChar.cy);
               }

               var2 = new MyVector();

               for(var4 = 1; var4 < this.fv.length; ++var4) {
                  if (this.fv[var4].eMob != null) {
                     var2.addElement(new mResources(this.fv[var4].eMob.x, this.fv[var4].eMob.y));
                  } else if (this.fv[var4].eChar != null) {
                     var2.addElement(new mResources(this.fv[var4].eChar.cx, this.fv[var4].eChar.cy));
                  }

                  if (var4 > 5) {
                     break;
                  }
               }

               Lightning.addLight(var2, var3, this.w());
               return;
            }
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }

   }

   public final boolean s() {
      return this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].template != null && (this.arrItemMounts[4].template.id == 443 || this.arrItemMounts[4].template.id == 523);
   }

   public final boolean t() {
      return this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].template != null && (this.arrItemMounts[4].template.id == 485 || this.arrItemMounts[4].template.id == 524);
   }

   public final boolean isPaint() {
      return this.cx >= GameScr.gW23 && this.cx <= GameScr.gW23 + GameScr.gW && this.cy >= GameScr.gH2 && this.cy <= GameScr.gH2 + GameScr.gH + 30;
   }

   public void paint(mGraphics var1) {
      if (!this.isPaint()) {
         if (this.fu != null) {
            this.indexSkill = this.ap().length;
            this.fu = null;
            this.fv = null;
            this.eff = null;
            this.effTask = null;
            this.indexEff = -1;
            this.indexEffTask = -1;
            return;
         }
      } else {
         this.b(var1, this.cx, this.cy, 0);
         if (this.statusMe != 15 && (this.moveFast == null || this.moveFast[0] <= 0)) {
            this.c(var1);
            Char var2;
            if (this.fu != null && this.indexSkill < this.ap().length) {
               mGraphics var3 = var1;
               var2 = this;

               try {
                  SkillInfoPaint[] var4 = var2.ap();
                  var2.cf = var4[var2.indexSkill].status;
                  if (var4[var2.indexSkill].effS0Id != 0) {
                     var2.eff0 = GameScr.v[var4[var2.indexSkill].effS0Id - 1];
                     var2.i0 = var2.dx0 = var2.dy0 = 0;
                  }

                  if (var4[var2.indexSkill].effS1Id != 0) {
                     var2.eff1 = GameScr.v[var4[var2.indexSkill].effS1Id - 1];
                     var2.i1 = var2.dx1 = var2.dy1 = 0;
                  }

                  if (var4[var2.indexSkill].effS2Id != 0) {
                     var2.eff2 = GameScr.v[var4[var2.indexSkill].effS2Id - 1];
                     var2.i2 = var2.dx2 = var2.dy2 = 0;
                  }

                  if (var4 != null && var4[var2.indexSkill] != null && var4[var2.indexSkill].arrowId != 0) {
                     var2.arrow = new Arrow(var2, GameScr.t[var4[var2.indexSkill].arrowId - 1]);
                     var2.arrow.life = 10;
                     var2.arrow.ax = var2.cx + var4[var2.indexSkill].adx;
                     var2.arrow.ay = var2.cy + var4[var2.indexSkill].ady;
                  }

                  var2.d(var3);
                  if (var2.cdir == 1) {
                     if (var2.eff0 != null) {
                        if (var2.dx0 == 0) {
                           var2.dx0 = var4[var2.indexSkill].e0dx;
                        }

                        if (var2.dy0 == 0) {
                           var2.dy0 = var4[var2.indexSkill].e0dy;
                        }

                        SmallImage.drawSmallImageNew(var3, var2.eff0.arrEfInfo[var2.i0].idImg, var2.cx + var2.dx0 + var2.eff0.arrEfInfo[var2.i0].dx, var2.cy + var2.dy0 + var2.eff0.arrEfInfo[var2.i0].dy, 0, 3);
                        ++var2.i0;
                        if (var2.i0 >= var2.eff0.arrEfInfo.length) {
                           var2.eff0 = null;
                           var2.i0 = var2.dx0 = var2.dy0 = 0;
                        }
                     }

                     if (var2.eff1 != null) {
                        if (var2.dx1 == 0) {
                           var2.dx1 = var4[var2.indexSkill].e1dx;
                        }

                        if (var2.dy1 == 0) {
                           var2.dy1 = var4[var2.indexSkill].e1dy;
                        }

                        SmallImage.drawSmallImageNew(var3, var2.eff1.arrEfInfo[var2.i1].idImg, var2.cx + var2.dx1 + var2.eff1.arrEfInfo[var2.i1].dx, var2.cy + var2.dy1 + var2.eff1.arrEfInfo[var2.i1].dy, 0, 3);
                        ++var2.i1;
                        if (var2.i1 >= var2.eff1.arrEfInfo.length) {
                           var2.eff1 = null;
                           var2.i1 = var2.dx1 = var2.dy1 = 0;
                        }
                     }

                     if (var2.eff2 != null) {
                        if (var2.dx2 == 0) {
                           var2.dx2 = var4[var2.indexSkill].e2dx;
                        }

                        if (var2.dy2 == 0) {
                           var2.dy2 = var4[var2.indexSkill].e2dy;
                        }

                        SmallImage.drawSmallImageNew(var3, var2.eff2.arrEfInfo[var2.i2].idImg, var2.cx + var2.dx2 + var2.eff2.arrEfInfo[var2.i2].dx, var2.cy + var2.dy2 + var2.eff2.arrEfInfo[var2.i2].dy, 0, 3);
                        ++var2.i2;
                        if (var2.eff2.arrEfInfo != null && var2.i2 >= var2.eff2.arrEfInfo.length) {
                           var2.eff2 = null;
                           var2.i2 = var2.dx2 = var2.dy2 = 0;
                        }
                     }
                  } else {
                     if (var2.eff0 != null) {
                        if (var2.dx0 == 0) {
                           var2.dx0 = var4[var2.indexSkill].e0dx;
                        }

                        if (var2.dy0 == 0) {
                           var2.dy0 = var4[var2.indexSkill].e0dy;
                        }

                        SmallImage.drawSmallImageNew(var3, var2.eff0.arrEfInfo[var2.i0].idImg, var2.cx - var2.dx0 - var2.eff0.arrEfInfo[var2.i0].dx, var2.cy + var2.dy0 + var2.eff0.arrEfInfo[var2.i0].dy, 2, 3);
                        ++var2.i0;
                        if (var2.i0 >= var2.eff0.arrEfInfo.length) {
                           var2.eff0 = null;
                           var2.i0 = 0;
                           var2.dx0 = 0;
                           var2.dy0 = 0;
                        }
                     }

                     if (var2.eff1 != null) {
                        if (var2.dx1 == 0) {
                           var2.dx1 = var4[var2.indexSkill].e1dx;
                        }

                        if (var2.dy1 == 0) {
                           var2.dy1 = var4[var2.indexSkill].e1dy;
                        }

                        SmallImage.drawSmallImageNew(var3, var2.eff1.arrEfInfo[var2.i1].idImg, var2.cx - var2.dx1 - var2.eff1.arrEfInfo[var2.i1].dx, var2.cy + var2.dy1 + var2.eff1.arrEfInfo[var2.i1].dy, 2, 3);
                        ++var2.i1;
                        if (var2.i1 >= var2.eff1.arrEfInfo.length) {
                           var2.eff1 = null;
                           var2.i1 = 0;
                           var2.dx1 = 0;
                           var2.dy1 = 0;
                        }
                     }

                     if (var2.eff2 != null) {
                        if (var2.dx2 == 0) {
                           var2.dx2 = var4[var2.indexSkill].e2dx;
                        }

                        if (var2.dy2 == 0) {
                           var2.dy2 = var4[var2.indexSkill].e2dy;
                        }

                        SmallImage.drawSmallImageNew(var3, var2.eff2.arrEfInfo[var2.i2].idImg, var2.cx - var2.dx2 - var2.eff2.arrEfInfo[var2.i2].dx, var2.cy + var2.dy2 + var2.eff2.arrEfInfo[var2.i2].dy, 2, 3);
                        ++var2.i2;
                        if (var2.eff2.arrEfInfo != null && var2.i2 >= var2.eff2.arrEfInfo.length) {
                           var2.eff2 = null;
                           var2.i2 = 0;
                           var2.dx2 = 0;
                           var2.dy2 = 0;
                        }
                     }
                  }

                  ++var2.indexSkill;
               } catch (Exception var6) {
                  System.out.println("loi paint charskill");
               }
            } else {
               this.d(var1);
            }

            if (this.arrow != null) {
               this.arrow.paint(var1);
            }

            int var7;
            if (this.fv != null) {
               for(var7 = 0; var7 < this.fv.length; ++var7) {
                  if (this.fv[var7] != null) {
                     if (this.fv[var7].eMob != null) {
                        if (!this.fv[var7].isFly) {
                           this.fv[var7].eMob.c();
                           this.fv[var7].eMob.ab = this;
                           if (this.me) {
                              getMyChar();
                              getMyChar();
                              NinjaUtil.randomNumber(11);
                           }

                           if (this.fv[var7].eMob.templateId != 98 && this.fv[var7].eMob.templateId != 99) {
                              GameScr.a(this.fv[var7].eMob.x, this.fv[var7].eMob.y - (this.fv[var7].eMob.exp >> 1), this.cdir);
                           }

                           this.fv[var7].isFly = true;
                        }

                        SmallImage.drawSmallImageNew(var1, this.fv[var7].a(), this.fv[var7].eMob.x, this.fv[var7].eMob.y, 0, 33);
                     } else if (this.fv[var7].eChar != null) {
                        if (!this.fv[var7].isFly) {
                           if (this.fv[var7].eChar.charID >= 0) {
                              (var2 = this.fv[var7].eChar).isInjure = 4;
                              var2.l(49);
                           }

                           GameScr.a(this.fv[var7].eChar.cx, this.fv[var7].eChar.cy - (this.fv[var7].eChar.ch >> 1), this.cdir);
                           this.fv[var7].isFly = true;
                        }

                        SmallImage.drawSmallImageNew(var1, this.fv[var7].a(), this.fv[var7].eChar.cx, this.fv[var7].eChar.cy, 0, 33);
                     }

                     ++this.fv[var7].index;
                     if (this.fv[var7].index >= this.fv[var7].effCharPaint.arrEfInfo.length) {
                        this.fv[var7] = null;
                     }
                  }
               }
            }

            if (this.indexEff >= 0 && this.eff != null) {
               SmallImage.drawSmallImageNew(var1, this.eff.arrEfInfo[this.indexEff].idImg, this.cx + this.eff.arrEfInfo[this.indexEff].dx, this.cy + this.eff.arrEfInfo[this.indexEff].dy, 0, 3);
               if (GameCanvas.u % 2 == 0) {
                  ++this.indexEff;
                  if (this.indexEff >= this.eff.arrEfInfo.length) {
                     this.indexEff = -1;
                     this.eff = null;
                  }
               }
            }

            if (this.indexEffTask >= 0 && this.effTask != null) {
               SmallImage.drawSmallImageNew(var1, this.effTask.arrEfInfo[this.indexEffTask].idImg, this.cx + this.effTask.arrEfInfo[this.indexEffTask].dx, this.cy + this.effTask.arrEfInfo[this.indexEffTask].dy, 0, 3);
               if (GameCanvas.u % 2 == 0) {
                  ++this.indexEffTask;
                  if (this.indexEffTask >= this.effTask.arrEfInfo.length) {
                     this.indexEffTask = -1;
                     this.effTask = null;
                  }
               }
            }

            if (this.beginSound) {
               if (this.gx < 2) {
                  SmallImage.drawSmallImageNew(var1, 1366, this.cx, this.cy - this.chh, 0, 3);
               } else if (this.gx < 4) {
                  SmallImage.drawSmallImageNew(var1, 1367, this.cx, this.cy - this.chh, 0, 3);
               } else if (this.gx < 8) {
                  SmallImage.drawSmallImageNew(var1, 1368, this.cx, this.cy - this.chh, 0, 3);
               } else if (GameCanvas.u % 2 == 0) {
                  SmallImage.drawSmallImageNew(var1, 1369, this.cx, this.cy - this.chh, 0, 3);
               } else {
                  SmallImage.drawSmallImageNew(var1, 1370, this.cx, this.cy - this.chh, 0, 3);
               }
            }

            try {
               if (this.mobMe != null) {
                  this.mobMe.a(var1);
               }
            } catch (Exception var5) {
               var5.printStackTrace();
            }

            if (this.statusMe != 1 && this.statusMe != 6) {
               for(var7 = 0; var7 < this.vDomsang.size(); ++var7) {
                  ((Domsang)this.vDomsang.elementAt(var7)).a(var1);
               }
            }

            this.a(var1, this.cx, this.cy, 0);
         }
      }

   }

   public final void a(mGraphics var1, int var2, int var3) {
      int var4 = this.cHp * 26 / this.cMaxHp;
      if (this.statusMe != 5 && this.statusMe != 14 && var4 < 2) {
         var4 = 2;
      } else if (this.statusMe == 5 || this.statusMe == 14) {
         var4 = 0;
      }

      if (var4 > 26) {
         var4 = 0;
      }

      var1.a(16777215);
      var1.c(var2, var3, 26, 4);
      var1.a(this.w());
      var1.c(var2, var3, var4, 4);
      var1.a(0);
      var1.b(var2, var3, 26, 4);
   }

   private int[] aq() {
      int[] var1 = null;
      if (this.fallAttack && this.arrItemMounts[4].template.id == 485 && this.arrItemMounts[4].sys >= 3) {
         var1 = new int[]{2094, 2095, 2096};
      }

      return var1;
   }

   private int[] ar() {
      int[] var1 = null;
      if (this.fallAttack) {
         var1 = new int[]{2082, 2083, 2084, 2089};
      }

      return var1;
   }

   private int[] as() {
      int[] var1 = null;
      if (this.isJump) {
         var1 = new int[]{2085, 2086, 2087, 2088};
      }

      return var1;
   }

   public final int[] v() {
      int[] var1 = null;
      short var2 = -1;
      if (this.me) {
         if (this.arrItemBody[12] != null) {
            var2 = this.arrItemBody[12].template.id;
         }
      } else {
         var2 = this.coat;
      }

      if (var2 == -1) {
         return null;
      } else {
         if (var2 == 420) {
            if (!this.isJump && !this.fallAttack) {
               var1 = new int[]{1635, 1636, 1637, 1636};
            } else {
               var1 = new int[]{2029, 2030, 2031, 2030};
            }
         } else if (var2 == 421) {
            if (!this.isJump && !this.fallAttack) {
               var1 = new int[]{1652, 1653, 1654, 1653};
            } else {
               var1 = new int[]{2035, 2036, 2037, 2036};
            }
         } else if (var2 == 422) {
            if (!this.isJump && !this.fallAttack) {
               var1 = new int[]{1655, 1656, 1657, 1656};
            } else {
               var1 = new int[]{2032, 2033, 2034, 2033};
            }
         }

         return var1;
      }
   }

   public final int w() {
      int var1 = 9145227;
      if (this.nClass.classId != 1 && this.nClass.classId != 2) {
         if (this.nClass.classId != 3 && this.nClass.classId != 4) {
            if (this.nClass.classId == 5 || this.nClass.classId == 6) {
               var1 = 7443811;
            }
         } else {
            var1 = 33023;
         }
      } else {
         var1 = 16711680;
      }

      return var1;
   }

   public final void b(mGraphics var1) {
      if (this.isPaint()) {
         if (getMyChar().charFocus == null || !getMyChar().charFocus.equals(this)) {
            mFont.tahoma_7_yellow.a(var1, this.cName, this.cx, this.cy - this.ch - mFont.tahoma_7_green.d() - 5, 2, mFont.tahoma_7_grey);
            return;
         }

         if (getMyChar().charFocus != null && getMyChar().charFocus.equals(this)) {
            mFont.tahoma_7_yellow.a(var1, this.cName, this.cx, this.cy - this.ch - mFont.tahoma_7_green.d() - 10, 2, mFont.tahoma_7_grey);
         }
      }

   }

   public final void c(mGraphics var1) {
      int var2 = this.ch + 5 + (!this.isJump && !this.fallAttack ? 0 : 15);
      if (!this.isInvisible || this.me) {
         boolean var3;
         label126: {
            var3 = false;
            if (this.me) {
               GameScr.gI();
               if (GameScr.er != 1) {
                  if (this.npcFocus == null && this.charFocus == null && this.mobFocus == null && this.itemFocus == null) {
                     var3 = true;
                     var2 += mFont.tahoma_7.d();
                     if (!this.isHuman) {
                        mFont.tahoma_7_blue1.a(var1, this.cName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
                     } else {
                        mFont.tahoma_7_white.a(var1, this.cName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
                     }

                     ++var2;
                  }
                  break label126;
               }

               if (!GameScr.gI().es) {
                  var2 += mFont.tahoma_7.d();
                  mFont.tahoma_7_yellow.a(var1, mResources.as, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
               } else {
                  var2 += mFont.tahoma_7.d();
                  mFont.tahoma_7_yellow.a(var1, mResources.at, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
               }
            } else {
               if (getMyChar().charFocus != null && getMyChar().charFocus.equals(this)) {
                  var3 = true;
                  var2 += 5;
                  this.a(var1, this.cx - 13, this.cy - var2);
                  var2 += mFont.tahoma_7.d();
                  if (!this.isHuman) {
                     mFont.tahoma_7_blue1.a(var1, this.cName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
                  } else {
                     mFont.tahoma_7_white.a(var1, this.cName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
                  }

                  ++var2;
                  break label126;
               }

               if (!this.paintName) {
                  break label126;
               }

               var3 = true;
               var2 += mFont.tahoma_7.d();
               if (!this.isHuman) {
                  mFont.tahoma_7_blue1.a(var1, this.cName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
               } else {
                  mFont.tahoma_7_white.a(var1, this.cName, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
               }
            }

            ++var2;
         }

         if (this.charID == -getMyChar().charID) {
            var2 += mFont.tahoma_7.d();
            mFont.tahoma_7_yellow.a(var1, mResources.au + " " + getMyChar().cName + " " + mResources.dh, this.cx, this.cy - var2, 2, mFont.tahoma_7_grey);
            ++var2;
         }

         if (!this.cClanName.equals("") && var3) {
            var2 += mFont.tahoma_7.d() - 1;
            byte var4 = 0;
            if (this.ctypeClan > 0) {
               var4 = 5;
            }

            mFont.tahoma_7_white.a(var1, this.cClanName, this.cx + var4, this.cy - var2, 2, mFont.tahoma_7_blue);
            if (this.ctypeClan == 3) {
               SmallImage.drawSmallImageNew(var1, 1215, this.cx - (mFont.tahoma_7_white.a(this.cClanName) / 2 + (7 - var4)), this.cy - var2 + 1, 0, 17);
            } else if (this.ctypeClan == 4) {
               SmallImage.drawSmallImageNew(var1, 1216, this.cx - (mFont.tahoma_7_white.a(this.cClanName) / 2 + (7 - var4)), this.cy - var2 + 1, 0, 17);
            } else if (this.ctypeClan == 2) {
               SmallImage.drawSmallImageNew(var1, 1217, this.cx - (mFont.tahoma_7_white.a(this.cClanName) / 2 + (7 - var4)), this.cy - var2 + 1, 0, 17);
            }

            ++var2;
         }

         if (this.resultTest > 0 && this.resultTest < 30) {
            var2 += SmallImage.smallImg[1117][4];
            SmallImage.drawSmallImageNew(var1, 1117, this.cx, this.cy - var2, 0, 17);
            return;
         }

         if (this.resultTest > 30 && this.resultTest < 60) {
            var2 += SmallImage.smallImg[1117][4];
            SmallImage.drawSmallImageNew(var1, 1126, this.cx, this.cy - var2, 0, 17);
            return;
         }

         if (this.resultTest > 60 && this.resultTest < 90) {
            var2 += SmallImage.smallImg[1117][4];
            SmallImage.drawSmallImageNew(var1, 1118, this.cx, this.cy - var2, 0, 17);
            return;
         }

         if (this.charID >= 0) {
            if (this.killCharId >= 0) {
               var2 += SmallImage.smallImg[1122][4];
               SmallImage.drawSmallImageNew(var1, 1122, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cTypePk == 3) {
               var2 += SmallImage.smallImg[1121][4];
               SmallImage.drawSmallImageNew(var1, 1121, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cTypePk == 2) {
               var2 += SmallImage.smallImg[1124][4];
               SmallImage.drawSmallImageNew(var1, 1124, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cTypePk == 1) {
               var2 += SmallImage.smallImg[1123][4];
               SmallImage.drawSmallImageNew(var1, 1123, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cTypePk == 4) {
               var2 += SmallImage.smallImg[1240][4];
               SmallImage.drawSmallImageNew(var1, 1240, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.cTypePk == 5) {
               var2 += SmallImage.smallImg[1241][4];
               SmallImage.drawSmallImageNew(var1, 1241, this.cx, this.cy - var2, 0, 17);
               return;
            }

            if (this.testCharId > 0) {
               var2 += SmallImage.smallImg[1116][4];
               SmallImage.drawSmallImageNew(var1, 1116, this.cx, this.cy - var2, 0, 17);
            }
         }
      }

   }

   private void d(mGraphics var1) {
      try {
         Part var2 = GameScr.parts[this.head];
         Part var3 = GameScr.parts[this.leg];
         Part var4 = GameScr.parts[this.body];
         Part var5 = GameScr.parts[this.wp];
         if (this.arrItemBody != null && this.arrItemBody[11] != null) {
            var2 = GameScr.parts[this.arrItemBody[11].template.part];
            this.head = this.arrItemBody[11].template.part;
         }

         int var6;
         if (var2.a != null && var2.a.length >= 8) {
            for(var6 = 0; var6 < var2.a.length; ++var6) {
               if (var2.a[var6] == null || !SmallImage.drawSmallImageNew(var2.a[var6].id)) {
                  var2 = b(this.cgender);
                  break;
               }
            }
         } else {
            var2 = b(this.cgender);
         }

         int[] var7 = var2.a[CharInfo[this.cf][0][0]].id <= 4 ? null : (var2.a[CharInfo[this.cf][0][0]].id <= 4 ? null : this.v());
         if (((this.statusMe == 1 || this.statusMe == 6) && GameCanvas.u % 10 == 0 || (this.statusMe == 2 || this.statusMe == 10) && GameCanvas.u % 2 == 0 || GameCanvas.u % 3 == 0 && (this.statusMe == 4 || this.statusMe == 3)) && var7 != null) {
            ++this.tickCoat;
            if (this.tickCoat >= var7.length) {
               this.tickCoat = 0;
            }
         }

         if (this.statusMe == 14) {
            if (this.t()) {
               if (this.arrItemMounts[4].template.id == 485) {
                  if (this.arrItemMounts[4].sys < 2) {
                     SmallImage.drawSmallImageNew(var1, 1800, this.lcx, this.lcy, 2, 33);
                  } else {
                     SmallImage.drawSmallImageNew(var1, 2063, this.lcx, this.lcy, 2, 33);
                  }
               } else if (this.arrItemMounts[4].template.id == 524) {
                  if (this.arrItemMounts[4].sys < 2) {
                     SmallImage.drawSmallImageNew(var1, 2064, this.lcx, this.lcy, 2, 33);
                  } else {
                     SmallImage.drawSmallImageNew(var1, 2068, this.lcx, this.lcy, 2, 33);
                  }
               }
            }

            SmallImage.drawSmallImageNew(var1, 1040, this.cx, this.cy, 0, 33);
         } else if (this.isInvisible) {
            if (this.me) {
               if (GameCanvas.u % 50 != 48 && GameCanvas.u % 50 != 90) {
                  SmallImage.drawSmallImageNew(var1, 1195, this.cx, this.cy - 18, 0, 3);
               } else {
                  SmallImage.drawSmallImageNew(var1, 1196, this.cx, this.cy - 18, 0, 3);
               }
            }
         } else {
            var6 = 0;
            int var8 = 0;
            int var9 = 0;
            byte var10 = 0;
            int[] var11;
            if ((var11 = this.aq()) != null) {
               ++this.tickEffmoto;
               if (this.tickEffmoto >= var11.length) {
                  this.tickEffmoto = 0;
               }
            }

            if (this.fallAttack) {
               if (this.arrItemMounts[4].template.id == 485) {
                  if (this.arrItemMounts[4].sys < 2) {
                     if (this.statusMe != 1 && this.statusMe != 6) {
                        if (this.statusMe == 2 || this.statusMe == 10) {
                           var6 = GameCanvas.u % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.u % 20 > 12 ? 1 : 0;
                     }

                     if (this.statusMe == 3) {
                        var9 = -5 * this.cdir;
                     }

                     if (this.cdir == 1) {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 1711, this.cx, this.cy + 2, 0, 33);
                        } else {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 1709 : 1710, this.cx, this.cy, 0, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 0, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 0, 33);
                     } else {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 1711, this.cx, this.cy + 2, 2, 33);
                        } else {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 1709 : 1710, this.cx, this.cy, 2, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 2, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 2, 33);
                     }
                  } else {
                     if (this.statusMe != 1 && this.statusMe != 6) {
                        if (this.statusMe == 2 || this.statusMe == 10) {
                           var6 = GameCanvas.u % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.u % 20 > 12 ? 1 : 0;
                     }

                     if (this.statusMe == 3) {
                        var9 = -5 * this.cdir;
                     }

                     if (this.cdir == 1) {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2057, this.cx, this.cy + 2, 0, 33);
                        } else if (!this.isMoto) {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2056 : 2055, this.cx, this.cy, 0, 33);
                        } else {
                           SmallImage.drawSmallImageNew(var1, 2057, this.cx, this.cy, 0, 33);
                        }

                        if (this.statusMe == 2 && var11 != null) {
                           SmallImage.drawSmallImageNew(var1, var11[this.tickEffmoto], this.cx - 25, this.cy - 2, 0, 33);
                        }

                        if (!this.isMoto) {
                           SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 0, 17);
                           SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 0, 33);
                        } else {
                           SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir - 3, this.cy - 1 - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 0, 17);
                           SmallImage.drawSmallImageNew(var1, this.au(), this.cx - 3 + this.dyHead * this.cdir, this.cy - 1 - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 0, 33);
                        }
                     } else {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2057, this.cx, this.cy + 2, 2, 33);
                        } else if (!this.isMoto) {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2056 : 2055, this.cx, this.cy, 2, 33);
                        } else {
                           SmallImage.drawSmallImageNew(var1, 2057, this.cx, this.cy, 2, 33);
                        }

                        if (this.statusMe == 2 && var11 != null) {
                           SmallImage.drawSmallImageNew(var1, var11[this.tickEffmoto], this.cx + 25, this.cy - 2, 2, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 2, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 2, 33);
                     }
                  }
               } else if (this.arrItemMounts[4].template.id == 524) {
                  if (this.arrItemMounts[4].sys < 2) {
                     if (this.statusMe != 1 && this.statusMe != 6) {
                        if (this.statusMe == 2 || this.statusMe == 10) {
                           var6 = GameCanvas.u % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.u % 20 > 12 ? 1 : 0;
                     }

                     if (this.statusMe == 3) {
                        var9 = -5 * this.cdir;
                     }

                     if (this.cdir == 1) {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2066, this.cx, this.cy + 2, 0, 33);
                        } else {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2064 : 2065, this.cx, this.cy, 0, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 0, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 0, 33);
                     } else {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2066, this.cx, this.cy + 2, 2, 33);
                        } else {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2064 : 2065, this.cx, this.cy, 2, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 2, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 2, 33);
                     }
                  } else if (this.arrItemMounts[4].sys >= 2 && this.arrItemMounts[4].sys < 4) {
                     if ((var7 = this.ar()) != null) {
                        ++this.tickEffmoto;
                        if (this.tickEffmoto >= var7.length) {
                           this.tickEffmoto = 0;
                        }
                     }

                     if (this.statusMe != 1 && this.statusMe != 6) {
                        if (this.statusMe == 2 || this.statusMe == 10) {
                           var6 = GameCanvas.u % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.u % 20 > 12 ? 1 : 0;
                     }

                     if (this.statusMe == 3) {
                        var9 = -5 * this.cdir;
                     }

                     if (this.cdir == 1) {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2070, this.cx, this.cy + 2, 0, 33);
                        } else if (this.statusMe == 4) {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                        } else if (this.statusMe != 2 && this.statusMe != 10) {
                           if (this.statusMe == 1 || this.statusMe == 6) {
                              SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                           }
                        } else {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 0, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 0, 33);
                     } else {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2070, this.cx, this.cy + 2, 2, 33);
                        }

                        if (this.statusMe == 4) {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                        } else if (this.statusMe != 2 && this.statusMe != 10) {
                           if (this.statusMe == 1 || this.statusMe == 6) {
                              SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                           }
                        } else {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 2, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 2, 33);
                     }
                  } else {
                     if ((var7 = this.ar()) != null) {
                        ++this.tickEffmoto;
                        if (this.tickEffmoto >= var7.length) {
                           this.tickEffmoto = 0;
                        }
                     }

                     if (this.statusMe != 1 && this.statusMe != 6) {
                        if (this.statusMe == 2 || this.statusMe == 10) {
                           var6 = GameCanvas.u % 6 > 3 ? 1 : 0;
                        }
                     } else {
                        var6 = GameCanvas.u % 20 > 12 ? 1 : 0;
                     }

                     if (this.statusMe == 3) {
                        var9 = -5 * this.cdir;
                     }

                     if (this.cdir == 1) {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2070, this.cx, this.cy + 2, 0, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx + 13, this.cy - 17, 0, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx - 24, this.cy + 2, 0, 33);
                        } else if (this.statusMe == 4) {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx + 15, this.cy, 0, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx - 27, this.cy, 0, 33);
                        } else if (this.statusMe != 2 && this.statusMe != 10) {
                           if (this.statusMe == 1 || this.statusMe == 6) {
                              SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                              SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx + 15, this.cy, 0, 33);
                              SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx - 27, this.cy, 0, 33);
                           }
                        } else {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx + 15, this.cy, 0, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx - 27, this.cy, 0, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 0, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 0, 33);
                     } else {
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2070, this.cx, this.cy + 2, 2, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx - 12, this.cy - 17, 2, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx + 25, this.cy + 3, 2, 33);
                        }

                        if (this.statusMe == 4) {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx - 15, this.cy, 2, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx + 27, this.cy, 2, 33);
                        } else if (this.statusMe != 2 && this.statusMe != 10) {
                           if (this.statusMe == 1 || this.statusMe == 6) {
                              SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                              SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx - 15, this.cy, 2, 33);
                              SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx + 27, this.cy, 2, 33);
                           }
                        } else {
                           SmallImage.drawSmallImageNew(var1, var6 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx - 15, this.cy, 2, 33);
                           SmallImage.drawSmallImageNew(var1, var7[this.tickEffmoto], this.cx + 27, this.cy, 2, 33);
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 + var6 + this.dxHead, 2, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 8 + var6 + this.dxBody, 2, 33);
                     }
                  }
               }
            } else if (this.isJump) {
               if ((var7 = this.as()) != null) {
                  ++this.tickEffFireW;
                  if (this.tickEffFireW >= var7.length) {
                     this.tickEffFireW = 0;
                  }
               }

               if (this.statusMe != 1 && this.statusMe != 6) {
                  if (this.statusMe == 2 || this.statusMe == 10) {
                     if (GameCanvas.u % 12 <= 3) {
                        this.dyBody = 0;
                     } else if (GameCanvas.u % 12 <= 6) {
                        this.dyBody = 1;
                        var8 = 2;
                     } else if (GameCanvas.u % 12 <= 9) {
                        this.dyBody = 2;
                        var8 = 4;
                     } else {
                        this.dyBody = 3;
                        var8 = 2;
                     }
                  }
               } else {
                  this.dyBody = GameCanvas.u % 20 > 12 ? 1 : 0;
                  var8 = -this.dyBody;
               }

               var7 = new int[]{2050, 2053, 2049, 2052};
               int[] var12 = new int[]{2075, 2078, 2074, 2079};
               int[] var13 = new int[]{this.cy - 22, this.cy - 23, this.cy - 22, this.cy - 23};
               int[] var14 = new int[]{this.cy - 22, this.cy - 23, this.cy - 22, this.cy - 22};
               if (this.statusMe == 3) {
                  var9 = -5 * this.cdir;
                  var10 = 5;
               } else {
                  var9 = -3 * this.cdir;
               }

               mGraphics var15;
               int var16;
               if (this.arrItemMounts[4].template.id == 523) {
                  if (this.cdir == 1) {
                     label724: {
                        SmallImage.drawSmallImageNew(var1, var5.a[CharInfo[this.cf][3][0]].id, this.cx + CharInfo[this.cf][3][1] + var5.a[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var5.a[CharInfo[this.cf][3][0]].dy - 10, 0, 0);
                        if (this.statusMe == 3) {
                           var15 = var1;
                           var16 = 2051;
                        } else if (this.statusMe == 4) {
                           var15 = var1;
                           var16 = 2052;
                        } else {
                           if (this.statusMe != 1 && this.statusMe != 6) {
                              if (this.statusMe == 2 || this.statusMe == 10) {
                                 SmallImage.drawSmallImageNew(var1, var7[this.dyBody], this.cx, this.cy - var8, 0, 33);
                              }
                              break label724;
                           }

                           var15 = var1;
                           var16 = this.dyBody == 0 ? 2047 : 2048;
                        }

                        SmallImage.drawSmallImageNew(var15, var16, this.cx, this.cy, 0, 33);
                     }

                     SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 - var10 - var8 + this.dxHead, 0, 17);
                     SmallImage.drawSmallImageNew(var1, this.au(), this.cx + var9 + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 9 - var10 - var8 + this.dxBody, 0, 33);
                  } else {
                     label737: {
                        SmallImage.drawSmallImageNew(var1, var5.a[CharInfo[this.cf][3][0]].id, this.cx - CharInfo[this.cf][3][1] - var5.a[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var5.a[CharInfo[this.cf][3][0]].dy - 10, 2, 24);
                        if (this.statusMe == 3) {
                           var15 = var1;
                           var16 = 2051;
                        } else if (this.statusMe == 4) {
                           var15 = var1;
                           var16 = 2052;
                        } else {
                           if (this.statusMe != 1 && this.statusMe != 6) {
                              if (this.statusMe == 2 || this.statusMe == 10) {
                                 SmallImage.drawSmallImageNew(var1, var7[this.dyBody], this.cx, this.cy - var8, 2, 33);
                              }
                              break label737;
                           }

                           var15 = var1;
                           var16 = this.dyBody == 0 ? 2047 : 2048;
                        }

                        SmallImage.drawSmallImageNew(var15, var16, this.cx, this.cy, 2, 33);
                     }

                     SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 - var10 - var8 + this.dxHead, 2, 17);
                     SmallImage.drawSmallImageNew(var1, this.au(), this.cx + var9 + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 9 - var10 - var8 + this.dxBody, 2, 33);
                  }
               } else if (this.arrItemMounts[4].template.id == 443) {
                  if (this.arrItemMounts[4].sys >= 3) {
                     if (this.cdir == 1) {
                        SmallImage.drawSmallImageNew(var1, var5.a[CharInfo[this.cf][3][0]].id, this.cx + CharInfo[this.cf][3][1] + var5.a[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var5.a[CharInfo[this.cf][3][0]].dy - 10, 0, 0);
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2077, this.cx, this.cy, 0, 33);
                           var1.a(GameScr.dt, 0, this.gd * 3, 3, 3, 0, this.cx + 21, this.cy - 30, 0);
                        } else {
                           label749: {
                              if (this.statusMe == 4) {
                                 var15 = var1;
                                 var16 = 2076;
                              } else {
                                 if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe == 2 || this.statusMe == 10) {
                                       SmallImage.drawSmallImageNew(var1, var12[this.dyBody], this.cx, this.cy - var8, 0, 33);
                                       var1.a(GameScr.dt, 0, this.gd * 3, 3, 3, 0, this.cx + 21, var13[this.dyBody], 0);
                                    }
                                    break label749;
                                 }

                                 var15 = var1;
                                 var16 = this.dyBody == 0 ? 2073 : 2072;
                              }

                              SmallImage.drawSmallImageNew(var15, var16, this.cx, this.cy, 0, 33);
                              var1.a(GameScr.dt, 0, this.gd * 3, 3, 3, 0, this.cx + 21, this.cy - 19, 0);
                           }
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 - var10 - var8 + this.dxHead, 0, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + var9 + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 9 - var10 - var8 + this.dxBody, 0, 33);
                     } else {
                        SmallImage.drawSmallImageNew(var1, var5.a[CharInfo[this.cf][3][0]].id, this.cx - CharInfo[this.cf][3][1] - var5.a[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var5.a[CharInfo[this.cf][3][0]].dy - 10, 2, 24);
                        if (this.statusMe == 3) {
                           SmallImage.drawSmallImageNew(var1, 2077, this.cx, this.cy, 2, 33);
                           var1.a(GameScr.dt, 0, this.gd * 3, 3, 3, 0, this.cx - 23, this.cy - 30, 0);
                        } else {
                           label762: {
                              if (this.statusMe == 4) {
                                 var15 = var1;
                                 var16 = 2076;
                              } else {
                                 if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe == 2 || this.statusMe == 10) {
                                       SmallImage.drawSmallImageNew(var1, var12[this.dyBody], this.cx, this.cy - var8, 2, 33);
                                       var1.a(GameScr.dt, 0, this.gd * 3, 3, 3, 0, this.cx - 24, var14[this.dyBody], 0);
                                    }
                                    break label762;
                                 }

                                 var15 = var1;
                                 var16 = this.dyBody == 0 ? 2073 : 2072;
                              }

                              SmallImage.drawSmallImageNew(var15, var16, this.cx, this.cy, 2, 33);
                              var1.a(GameScr.dt, 0, this.gd * 3, 3, 3, 0, this.cx - 24, this.cy - 20, 0);
                           }
                        }

                        SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 - var10 - var8 + this.dxHead, 2, 17);
                        SmallImage.drawSmallImageNew(var1, this.au(), this.cx + var9 + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 9 - var10 - var8 + this.dxBody, 2, 33);
                     }
                  } else if (this.cdir == 1) {
                     label778: {
                        SmallImage.drawSmallImageNew(var1, var5.a[CharInfo[this.cf][3][0]].id, this.cx + CharInfo[this.cf][3][1] + var5.a[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var5.a[CharInfo[this.cf][3][0]].dy - 10, 0, 0);
                        if (this.statusMe == 3) {
                           var15 = var1;
                           var16 = 1716;
                        } else if (this.statusMe == 4) {
                           var15 = var1;
                           var16 = 1717;
                        } else {
                           if (this.statusMe != 1 && this.statusMe != 6) {
                              if (this.statusMe == 2 || this.statusMe == 10) {
                                 SmallImage.drawSmallImageNew(var1, this.idWolfW[this.dyBody], this.cx, this.cy - var8, 0, 33);
                              }
                              break label778;
                           }

                           var15 = var1;
                           var16 = this.dyBody == 0 ? 1712 : 1713;
                        }

                        SmallImage.drawSmallImageNew(var15, var16, this.cx, this.cy, 0, 33);
                     }

                     SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 - var10 - var8 + this.dxHead, 0, 17);
                     SmallImage.drawSmallImageNew(var1, this.au(), this.cx + var9 + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 9 - var10 - var8 + this.dxBody, 0, 33);
                  } else {
                     label792: {
                        SmallImage.drawSmallImageNew(var1, var5.a[CharInfo[this.cf][3][0]].id, this.cx - CharInfo[this.cf][3][1] - var5.a[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var5.a[CharInfo[this.cf][3][0]].dy - 10, 2, 24);
                        if (this.statusMe == 3) {
                           var15 = var1;
                           var16 = 1716;
                        } else if (this.statusMe == 4) {
                           var15 = var1;
                           var16 = 1717;
                        } else {
                           if (this.statusMe != 1 && this.statusMe != 6) {
                              if (this.statusMe == 2 || this.statusMe == 10) {
                                 SmallImage.drawSmallImageNew(var1, this.idWolfW[this.dyBody], this.cx, this.cy - var8, 2, 33);
                              }
                              break label792;
                           }

                           var15 = var1;
                           var16 = this.dyBody == 0 ? 1712 : 1713;
                        }

                        SmallImage.drawSmallImageNew(var15, var16, this.cx, this.cy, 2, 33);
                     }

                     SmallImage.drawSmallImageNew(var1, this.av(), this.cx + var9 + this.heightCharName * this.cdir, this.cy - CharInfo[0][0][2] + var2.a[CharInfo[0][0][0]].dy - 12 - var10 - var8 + this.dxHead, 2, 17);
                     SmallImage.drawSmallImageNew(var1, this.au(), this.cx + var9 + this.dyHead * this.cdir, this.cy - SmallImage.b(this.at()) - 9 - var10 - var8 + this.dxBody, 2, 33);
                  }
               }
            } else if (this.cdir == 1) {
               if (this.autoFall && !this.fallAttack && !this.isJump) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     if (this.arrItemMounts[4].sys <= 1) {
                        SmallImage.drawSmallImageNew(var1, 1800, this.lcx, this.lcy, 2, 33);
                     } else {
                        SmallImage.drawSmallImageNew(var1, 2063, this.lcx, this.lcy, 2, 33);
                     }
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     if (this.arrItemMounts[4].sys <= 1) {
                        SmallImage.drawSmallImageNew(var1, 2067, this.lcx, this.lcy, 2, 33);
                     } else {
                        SmallImage.drawSmallImageNew(var1, 2071, this.lcx, this.lcy, 2, 33);
                     }
                  }
               }

               if (var7 != null) {
                  if (this.tickCoat == 0) {
                     SmallImage.drawSmallImageNew(var1, var7[this.tickCoat], this.cx - 14, this.cy - 18, 0, 20);
                  } else if (this.tickCoat != 1 && this.tickCoat == 2) {
                     SmallImage.drawSmallImageNew(var1, var7[this.tickCoat], this.cx - 25, this.cy - 18, 0, 20);
                  } else {
                     SmallImage.drawSmallImageNew(var1, var7[this.tickCoat], this.cx - 22, this.cy - 18, 0, 20);
                  }
               }

               SmallImage.drawSmallImageNew(var1, var5.a[CharInfo[this.cf][3][0]].id, this.cx + CharInfo[this.cf][3][1] + var5.a[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var5.a[CharInfo[this.cf][3][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var3.a[CharInfo[this.cf][1][0]].id, this.cx + CharInfo[this.cf][1][1] + var3.a[CharInfo[this.cf][1][0]].dx, this.cy - CharInfo[this.cf][1][2] + var3.a[CharInfo[this.cf][1][0]].dy, 0, 0);
               if (this.statusMe != 2) {
                  this.b(var1, this.cx + 7, this.cy - 2);
               }

               SmallImage.drawSmallImageNew(var1, var2.a[CharInfo[this.cf][0][0]].id, this.cx + CharInfo[this.cf][0][1] + var2.a[CharInfo[this.cf][0][0]].dx, this.cy - CharInfo[this.cf][0][2] + var2.a[CharInfo[this.cf][0][0]].dy, 0, 0);
               SmallImage.drawSmallImageNew(var1, var4.a[CharInfo[this.cf][2][0]].id, this.cx + CharInfo[this.cf][2][1] + var4.a[CharInfo[this.cf][2][0]].dx, this.cy - CharInfo[this.cf][2][2] + var4.a[CharInfo[this.cf][2][0]].dy, 0, 0);
               if (this.statusMe == 2) {
                  this.d(var1, this.cx - 14, this.cy - 2);
                  this.c(var1, this.cx + 7, this.cy - 1);
               } else {
                  this.b(var1, this.cx - 7, this.cy - 2);
                  this.c(var1, this.cx + 11, this.cy - 2);
               }
            } else {
               if (this.autoFall && !this.fallAttack && !this.isJump) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     if (this.arrItemMounts[4].sys <= 0) {
                        SmallImage.drawSmallImageNew(var1, 1800, this.lcx, this.lcy, 2, 33);
                     } else {
                        SmallImage.drawSmallImageNew(var1, 2063, this.lcx, this.lcy, 2, 33);
                     }
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     if (this.arrItemMounts[4].sys <= 0) {
                        SmallImage.drawSmallImageNew(var1, 2067, this.lcx, this.lcy, 2, 33);
                     } else {
                        SmallImage.drawSmallImageNew(var1, 2071, this.lcx, this.lcy, 2, 33);
                     }
                  }
               }

               if (var7 != null) {
                  SmallImage.drawSmallImageNew(var1, var7[this.tickCoat], this.cx - 7, this.cy - 18, 2, 20);
               }

               SmallImage.drawSmallImageNew(var1, var5.a[CharInfo[this.cf][3][0]].id, this.cx - CharInfo[this.cf][3][1] - var5.a[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var5.a[CharInfo[this.cf][3][0]].dy, 2, 24);
               SmallImage.drawSmallImageNew(var1, var3.a[CharInfo[this.cf][1][0]].id, this.cx - CharInfo[this.cf][1][1] - var3.a[CharInfo[this.cf][1][0]].dx, this.cy - CharInfo[this.cf][1][2] + var3.a[CharInfo[this.cf][1][0]].dy, 2, 24);
               if (this.statusMe != 2) {
                  this.b(var1, this.cx - 7, this.cy - 2);
               }

               SmallImage.drawSmallImageNew(var1, var2.a[CharInfo[this.cf][0][0]].id, this.cx - CharInfo[this.cf][0][1] - var2.a[CharInfo[this.cf][0][0]].dx, this.cy - CharInfo[this.cf][0][2] + var2.a[CharInfo[this.cf][0][0]].dy, 2, 24);
               SmallImage.drawSmallImageNew(var1, var4.a[CharInfo[this.cf][2][0]].id, this.cx - CharInfo[this.cf][2][1] - var4.a[CharInfo[this.cf][2][0]].dx, this.cy - CharInfo[this.cf][2][2] + var4.a[CharInfo[this.cf][2][0]].dy, 2, 24);
               if (this.statusMe == 2) {
                  this.d(var1, this.cx + 14, this.cy - 2);
                  this.c(var1, this.cx - 3, this.cy - 2);
               } else {
                  this.b(var1, this.cx + 5, this.cy - 2);
                  this.c(var1, this.cx - 7, this.cy - 2);
               }
            }
         }

         if (this.isLockMove) {
            SmallImage.drawSmallImageNew(var1, 290, this.cx, this.cy, 0, 33);
            return;
         }
      } catch (Exception var17) {
      }

   }

   private int at() {
      switch (this.leg) {
         case 0:
            return 26;
         case 4:
            return 58;
         case 6:
            return 86;
         case 8:
            return 114;
         case 9:
            return 123;
         case 17:
            return 353;
         case 19:
            return 379;
         case 21:
            return 405;
         case 30:
            return 484;
         case 33:
            return 518;
         case 35:
            return 544;
         case 37:
            return 571;
         case 39:
            return 810;
         case 43:
            return 982;
         case 95:
            return 1156;
         case 142:
            return 1360;
         case 155:
            return 1494;
         case 157:
            return 1519;
         default:
            return 26;
      }
   }

   private int au() {
      this.dyHead = 0;
      this.dxBody = 0;
      if (this.statusMe == 3) {
         switch (this.body) {
            case 1:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -6;
               }

               return 13;
            case 3:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -6;
               }

               return 45;
            case 5:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 73;
            case 7:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 101;
            case 10:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 137;
            case 18:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 365;
            case 20:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 391;
            case 22:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 417;
            case 29:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -11;
                  this.dxBody = -6;
               }

               return 472;
            case 32:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -11;
                  this.dxBody = -6;
               }

               return 506;
            case 34:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 531;
            case 36:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 559;
            case 38:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 798;
            case 42:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 970;
            case 94:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -12;
                  this.dxBody = -7;
               }

               return 1142;
            case 141:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 1348;
            case 154:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -8;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -15;
                  this.dxBody = -3;
               }

               return 1487;
            case 156:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -10;
                  this.dxBody = -7;
               }

               return 1507;
            case 157:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 1812;
            case 173:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 1838;
            case 180:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 1959;
            case 183:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 1987;
            case 186:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -14;
                  this.dxBody = -5;
               }

               return 2117;
            case 189:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -14;
                  this.dxBody = -5;
               }

               return 2144;
            case 197:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -5;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -10;
                  this.dxBody = -6;
               }

               return 2342;
            case 199:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -5;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -10;
                  this.dxBody = -6;
               }

               return 2373;
            case 206:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -5;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -10;
                  this.dxBody = -6;
               }

               return 2459;
            default:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -7;
                  this.dxBody = -6;
               }

               return 13;
         }
      } else if (!this.isMoto) {
         switch (this.body) {
            case 1:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 2;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 2;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -2;
               }

               return 9;
            case 3:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -3;
               }

               return 41;
            case 5:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 70;
            case 7:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 97;
            case 10:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 133;
            case 18:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 369;
            case 20:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 395;
            case 22:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 421;
            case 29:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 468;
            case 32:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 502;
            case 34:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -2;
               }

               return 540;
            case 36:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -2;
               }

               return 555;
            case 38:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -2;
               }

               return 794;
            case 42:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -2;
               }

               return 966;
            case 94:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -2;
               }

               return 1139;
            case 141:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -2;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -2;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -7;
                  this.dxBody = -1;
               }

               return 1343;
            case 154:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = 1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -3;
                  this.dxBody = -1;
               }

               return 1479;
            case 156:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = 2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               }

               return 1502;
            case 157:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 1808;
            case 173:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 1834;
            case 180:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 1955;
            case 183:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               }

               return 1983;
            case 186:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -2;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -2;
               }

               return 2135;
            case 189:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -2;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -2;
               }

               return 2135;
            case 197:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -4;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -1;
               }

               return 2337;
            case 199:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -4;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -1;
               }

               return 2363;
            case 206:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -4;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -1;
               }

               return 2456;
            default:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 2;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 2;
                  this.dxBody = -1;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -5;
                  this.dxBody = -2;
               }

               return 9;
         }
      } else {
         switch (this.body) {
            case 1:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -6;
               }

               return 13;
            case 3:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -6;
               }

               return 45;
            case 5:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 73;
            case 7:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 101;
            case 10:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 137;
            case 18:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 365;
            case 20:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 391;
            case 22:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 417;
            case 29:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -11;
                  this.dxBody = -6;
               }

               return 472;
            case 32:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -11;
                  this.dxBody = -6;
               }

               return 506;
            case 34:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 531;
            case 36:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 559;
            case 38:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 798;
            case 42:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 970;
            case 94:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 0;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 0;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -12;
                  this.dxBody = -7;
               }

               return 1142;
            case 141:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -9;
                  this.dxBody = -7;
               }

               return 1348;
            case 154:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -8;
                  this.dxBody = 0;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -15;
                  this.dxBody = -3;
               }

               return 1487;
            case 156:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 1;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -4;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -10;
                  this.dxBody = -7;
               }

               return 1507;
            case 157:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 1812;
            case 173:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 1838;
            case 180:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 1959;
            case 183:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 4;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -8;
                  this.dxBody = -7;
               }

               return 1987;
            case 186:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -14;
                  this.dxBody = -5;
               }

               return 2117;
            case 189:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -3;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -6;
                  this.dxBody = -2;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -14;
                  this.dxBody = -5;
               }

               return 2144;
            case 197:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -5;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -10;
                  this.dxBody = -6;
               }

               return 2342;
            case 199:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -5;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -10;
                  this.dxBody = -6;
               }

               return 2373;
            case 206:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = -1;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = -5;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -10;
                  this.dxBody = -6;
               }

               return 2459;
            default:
               if (this.arrItemMounts[4].template.id == 443) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 523) {
                  this.dyHead = 3;
                  this.dxBody = -3;
               } else if (this.arrItemMounts[4].template.id == 485) {
                  this.dyHead = 0;
                  this.dxBody = -4;
               } else if (this.arrItemMounts[4].template.id == 524) {
                  this.dyHead = -7;
                  this.dxBody = -6;
               }

               return 13;
         }
      }
   }

   private int av() {
      this.heightCharName = this.dxHead = 0;
      if (this.statusMe == 3) {
         switch (this.head) {
            case 2:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 33;
            case 11:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 147;
            case 23:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 427;
            case 24:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 430;
            case 25:
               this.heightCharName = 3;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 433;
            case 26:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 436;
            case 27:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 439;
            case 28:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 442;
            case 112:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 148;
            case 113:
               this.heightCharName = -1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 443;
            case 124:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1235;
            case 125:
               this.heightCharName = -1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1237;
            case 126:
               this.heightCharName = -1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1255;
            case 127:
               this.heightCharName = -1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1257;
            case 137:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1309;
            case 138:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1311;
            case 139:
               this.heightCharName = 2;
               this.dxHead = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1315;
            case 140:
               this.heightCharName = 3;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1313;
            case 146:
               this.heightCharName = 1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1416;
            case 147:
               this.heightCharName = -2;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1418;
            case 148:
               this.heightCharName = 0;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1422;
            case 149:
               this.heightCharName = -2;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1424;
            case 150:
               this.heightCharName = 0;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1441;
            case 151:
               this.heightCharName = -2;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1439;
            case 152:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1447;
            case 153:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1445;
            case 158:
               this.heightCharName = -2;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1585;
            case 159:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1589;
            case 160:
               this.heightCharName = 2;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1587;
            case 161:
               this.heightCharName = 3;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1595;
            case 162:
               this.heightCharName = -5;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1597;
            case 163:
               this.heightCharName = -3;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1604;
            case 179:
               this.heightCharName = 3;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1978;
            case 182:
               this.heightCharName = 3;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2006;
            case 185:
               this.heightCharName = -4;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2129;
            case 188:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2156;
            case 205:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2451;
            case 210:
               this.heightCharName = 0;
               this.dxHead = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2519;
            case 211:
               this.heightCharName = -1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2521;
            case 212:
               this.heightCharName = -2;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2523;
            case 213:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2525;
            case 214:
               this.heightCharName = 1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2526;
            default:
               this.heightCharName = 2;
               this.dxHead = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 33;
         }
      } else if (!this.isMoto) {
         switch (this.head) {
            case 2:
               this.heightCharName = -1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 33;
            case 11:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 147;
            case 23:
               this.heightCharName = -1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 427;
            case 24:
               this.heightCharName = -1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 430;
            case 25:
               this.heightCharName = 1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 433;
            case 26:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 436;
            case 27:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 439;
            case 28:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 442;
            case 112:
               this.heightCharName = -1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 148;
            case 113:
               this.heightCharName = -3;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 443;
            case 124:
               this.heightCharName = -1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1235;
            case 125:
               this.heightCharName = -1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1237;
            case 126:
               this.heightCharName = -1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1255;
            case 127:
               this.heightCharName = -3;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1257;
            case 137:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1309;
            case 138:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1311;
            case 139:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1315;
            case 140:
               this.heightCharName = 1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1313;
            case 146:
               this.heightCharName = -1;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1416;
            case 147:
               this.heightCharName = -4;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1418;
            case 148:
               this.heightCharName = -2;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1422;
            case 149:
               this.heightCharName = -4;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1424;
            case 150:
               this.heightCharName = -2;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1441;
            case 151:
               this.heightCharName = -4;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1439;
            case 152:
               this.heightCharName = -1;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1447;
            case 153:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1445;
            case 158:
               this.heightCharName = -4;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1585;
            case 159:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1589;
            case 160:
               this.heightCharName = 0;
               this.dxHead = 0;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1587;
            case 161:
               this.heightCharName = 1;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1595;
            case 162:
               this.heightCharName = -7;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1597;
            case 163:
               this.heightCharName = -5;
               this.dxHead = 0;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1604;
            case 179:
               this.heightCharName = 1;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 1978;
            case 182:
               this.heightCharName = 1;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2006;
            case 185:
               this.heightCharName = -6;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2129;
            case 188:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2156;
            case 205:
               this.heightCharName = -2;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2451;
            case 210:
               this.heightCharName = -2;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2519;
            case 211:
               this.heightCharName = -3;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2521;
            case 212:
               this.heightCharName = -4;
               this.dxHead = 0;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2523;
            case 213:
               this.heightCharName = 0;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2525;
            case 214:
               this.heightCharName = -1;
               this.dxHead = -1;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 2526;
            default:
               this.heightCharName = -1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 5;
                     --this.dxHead;
                  }
               }

               return 33;
         }
      } else {
         switch (this.head) {
            case 2:
               this.heightCharName = 2;
               this.dxHead = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 33;
            case 11:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 147;
            case 23:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 427;
            case 24:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 430;
            case 25:
               this.heightCharName = 3;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 433;
            case 26:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 436;
            case 27:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 439;
            case 28:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 442;
            case 112:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 148;
            case 113:
               this.heightCharName = -1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 443;
            case 124:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1235;
            case 125:
               this.heightCharName = -1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1237;
            case 126:
               this.heightCharName = -1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1255;
            case 127:
               this.heightCharName = -1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1257;
            case 137:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1309;
            case 138:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1311;
            case 139:
               this.heightCharName = 2;
               this.dxHead = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1315;
            case 140:
               this.heightCharName = 3;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1313;
            case 146:
               this.heightCharName = 1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1416;
            case 147:
               this.heightCharName = -2;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1418;
            case 148:
               this.heightCharName = 0;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1422;
            case 149:
               this.heightCharName = -2;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1424;
            case 150:
               this.heightCharName = 0;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1441;
            case 151:
               this.heightCharName = -2;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1439;
            case 152:
               this.heightCharName = 1;
               this.dxHead = -4;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1447;
            case 153:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1445;
            case 158:
               this.heightCharName = -2;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1585;
            case 159:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1589;
            case 160:
               this.heightCharName = 2;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1587;
            case 161:
               this.heightCharName = 3;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1595;
            case 162:
               this.heightCharName = -5;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1597;
            case 163:
               this.heightCharName = -3;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1604;
            case 179:
               this.heightCharName = 3;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 1978;
            case 182:
               this.heightCharName = 3;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2006;
            case 185:
               this.heightCharName = -4;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2129;
            case 188:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2156;
            case 205:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2451;
            case 210:
               this.heightCharName = 0;
               this.dxHead = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2519;
            case 211:
               this.heightCharName = -1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2521;
            case 212:
               this.heightCharName = -2;
               this.dxHead = -2;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2523;
            case 213:
               this.heightCharName = 0;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2525;
            case 214:
               this.heightCharName = 1;
               this.dxHead = -3;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 2526;
            default:
               this.heightCharName = 2;
               this.dxHead = -5;
               if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                  if (this.arrItemMounts[4].template.id == 485) {
                     this.heightCharName -= 2;
                     ++this.dxHead;
                  } else if (this.arrItemMounts[4].template.id == 524) {
                     this.heightCharName -= 7;
                     --this.dxHead;
                  }
               }

               return 33;
         }
      }
   }

   private int[] aw() {
      if (this.statusMe != 6 && this.statusMe != 1 && this.statusMe != 2 && this.statusMe != 10 && this.statusMe != 11) {
         return null;
      } else {
         int[] var1 = null;
         if (this.me) {
            if (this.arrItemBody[13] != null) {
               if (this.arrItemBody[13].template.id == 425) {
                  var1 = new int[]{1687, 1688, 1689, 1690, 1691};
               } else if (this.arrItemBody[13].template.id == 426) {
                  var1 = new int[]{1682, 1683, 1684, 1685, 1686};
               } else if (this.arrItemBody[13].template.id == 427) {
                  var1 = new int[]{1677, 1678, 1679, 1680, 1681};
               }
            }
         } else {
            if (this.glove == -1) {
               return null;
            }

            if (this.glove == 425) {
               var1 = new int[]{1687, 1688, 1689, 1690, 1691};
            } else if (this.glove == 426) {
               var1 = new int[]{1682, 1683, 1684, 1685, 1686};
            } else if (this.glove == 427) {
               var1 = new int[]{1677, 1678, 1679, 1680, 1681};
            }
         }

         return var1;
      }
   }

   public final void b(mGraphics var1, int var2, int var3) {
      int[] var4;
      if ((var4 = this.aw()) != null) {
         int var5;
         if ((var5 = GameCanvas.u % 13) > 9) {
            SmallImage.drawSmallImageNew(var1, var4[0], var2, var3, 0, 33);
            return;
         }

         if (var5 > 6) {
            SmallImage.drawSmallImageNew(var1, var4[1], var2, var3 + 2, 0, 33);
            return;
         }

         if (var5 > 3) {
            SmallImage.drawSmallImageNew(var1, var4[2], var2 - 2, var3 + 1, 0, 33);
            return;
         }

         SmallImage.drawSmallImageNew(var1, var4[3], var2 - 2, var3, 0, 33);
      }

   }

   private void d(mGraphics var1, int var2, int var3) {
      int[] var4;
      if ((var4 = this.aw()) != null) {
         int var5 = this.cdir == 1 ? 6 : 5;
         int var6 = this.cdir == -1 ? 40 : 36;
         int var7;
         if ((var7 = GameCanvas.u % 13) > 9) {
            SmallImage.drawSmallImageNew(var1, var4[0], var2, var3, var5, var6);
            return;
         }

         if (var7 > 6) {
            SmallImage.drawSmallImageNew(var1, var4[1], var2, var3, var5, var6);
            return;
         }

         if (var7 > 3) {
            SmallImage.drawSmallImageNew(var1, var4[2], var2, var3, var5, var6);
            return;
         }

         SmallImage.drawSmallImageNew(var1, var4[3], var2, var3, var5, var6);
      }

   }

   public final void c(mGraphics var1, int var2, int var3) {
      int[] var4;
      if ((var4 = this.aw()) != null) {
         SmallImage.drawSmallImageNew(var1, var4[4], var2 - 2, var3, 0, 33);
      }

   }

   private void l(int var1) {
      this.indexEff = 0;
      this.eff = GameScr.v[var1];
   }

   public final void callEffTask(int var1) {
      this.indexEffTask = 0;
      this.effTask = GameScr.v[var1];
   }

   public static int d(int var0) {
      for(int var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
         if (((Char)GameScr.vCharInMap.elementAt(var1)).charID == var0) {
            return var1;
         }
      }

      return -1;
   }

   public final void a(int var1, int var2) {
      byte var3 = 0;
      var1 -= this.cx;
      var2 -= this.cy;
      if (var1 == 0 && var2 == 0) {
         var3 = 1;
      } else if (var2 == 0) {
         var3 = 2;
         if (this.fb.size() > 0) {
            MovePoint var4 = null;

            try {
               var4 = (MovePoint)this.fb.lastElement();
            } catch (Exception var6) {
            }

            if (var4 != null && TileMap.a(var4.xEnd, var4.yEnd, 64) && var4.yEnd % TileMap.i > 8) {
               var3 = 10;
            }
         }
      } else if (var2 != 0) {
         if (var2 < 0) {
            var3 = 3;
         }

         if (var2 > 0) {
            var3 = 4;
         }
      }

      int var7 = this.cx + var1;
      var1 = this.cy + var2;
      this.fb.addElement(new MovePoint(var7, var1, var3));
      this.statusMe = 6;
   }

   private void ax() {
      if (this.charFocus != null && this.charFocus.isNhanban) {
         this.charFocus = null;
      }

      if (fw && this.charFocus != null && (this.charFocus.statusMe == 15 || this.charFocus.isInvisible)) {
         this.charFocus = null;
      }

      if (GameCanvas.u % 2 != 0 && !isMeCanAttackOtherPlayer(this.charFocus)) {
         int var1 = 0;
         if (this.nClass.classId == 0 || this.nClass.classId == 1 || this.nClass.classId == 3 || this.nClass.classId == 5) {
            if (GameScr.er != 1) {
               var1 = 40;
            } else {
               var1 = 0;
            }
         }

         int[] var2 = new int[]{-1, -1, -1, -1};
         int var3 = GameScr.gW23 - 10;
         int var4 = GameScr.gW23 + GameCanvas.z + 10;
         int var5 = GameScr.gH2;
         int var6 = GameScr.gH2 + GameCanvas.aa - GameScr.gH3 + 10;
         if (fw) {
            if (this.mobFocus != null && this.mobFocus.status != 1 && this.mobFocus.status != 8 && this.mobFocus.status != 0 && var3 <= this.mobFocus.x && this.mobFocus.x <= var4 && var5 <= this.mobFocus.y && this.mobFocus.y <= var6 || this.npcFocus != null && var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6 || this.charFocus != null && var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 || this.itemFocus != null && var3 <= this.itemFocus.x && this.itemFocus.x <= var4 && var5 <= this.itemFocus.y && this.itemFocus.y <= var6) {
               return;
            }

            fw = false;
         }

         int var7;
         ItemMap var8;
         int var9;
         int var10;
         int var11;
         if (this.itemFocus == null) {
            for(var7 = 0; var7 < GameScr.vItemMap.size(); ++var7) {
               var8 = (ItemMap)GameScr.vItemMap.elementAt(var7);
               var9 = Math.abs(getMyChar().cx - var8.x);
               var10 = Math.abs(getMyChar().cy - var8.y);
               var11 = var9 > var10 ? var9 : var10;
               if (var9 <= 48 && var10 <= 48 && (this.itemFocus == null || var11 < var2[3])) {
                  if (GameScr.er != 0 && GameScr.h()) {
                     if (var8.template.type == 19) {
                        if (GameScr.en) {
                           this.itemFocus = null;
                        } else {
                           this.itemFocus = var8;
                        }

                        var2[3] = var11;
                     }
                  } else if (!isAPickYHM && !isAPickYHMS && !dm && !doa && !dp && !dt) {
                     if (GameScr.en) {
                        this.itemFocus = null;
                     } else {
                        this.itemFocus = var8;
                     }

                     var2[3] = var11;
                  } else if (isAPickYHM && var8.template.type == 19 || isAPickYHMS && (var8.template.type == 16 || var8.template.type == 17) || dm && var8.template.type == 26 || doa && var8.template.a() || dp && var8.template.b()) {
                     if (GameScr.en) {
                        this.itemFocus = null;
                     } else {
                        this.itemFocus = var8;
                     }

                     var2[3] = var11;
                  }
               }
            }
         } else {
            if (var3 <= this.itemFocus.x && this.itemFocus.x <= var4 && var5 <= this.itemFocus.y && this.itemFocus.y <= var6) {
               this.m(3);
               return;
            }

            this.itemFocus = null;

            for(var7 = 0; var7 < GameScr.vItemMap.size(); ++var7) {
               var8 = (ItemMap)GameScr.vItemMap.elementAt(var7);
               var9 = Math.abs(getMyChar().cx - var8.x);
               var10 = Math.abs(getMyChar().cy - var8.y);
               var11 = var9 > var10 ? var9 : var10;
               if (var3 <= var8.x && var8.x <= var4 && var5 <= var8.y && var8.y <= var6 && (this.itemFocus == null || var11 < var2[3])) {
                  GameScr.gI();
                  if (GameScr.er != 0) {
                     GameScr.gI();
                     if (GameScr.h()) {
                        if (var8.template.type == 19) {
                           if (GameScr.en) {
                              this.itemFocus = null;
                           } else {
                              this.itemFocus = var8;
                           }

                           var2[3] = var11;
                        }
                        continue;
                     }
                  }

                  if (!isAPickYHM && !isAPickYHMS && !dm && !doa && !dp && !dt) {
                     if (GameScr.en) {
                        this.itemFocus = null;
                     } else {
                        this.itemFocus = var8;
                     }

                     var2[3] = var11;
                  } else if (isAPickYHM && var8.template.type == 19 || isAPickYHMS && (var8.template.type == 16 || var8.template.type == 17) || dm && var8.template.type == 26 || doa && var8.template.a() || dp && var8.template.b()) {
                     if (GameScr.en) {
                        this.itemFocus = null;
                     } else {
                        this.itemFocus = var8;
                     }

                     var2[3] = var11;
                  }
               }
            }
         }

         Mob var12;
         Npc var13;
         Char var14;
         if (TileMap.typeMap != 3 && TileMap.mapID != 111) {
            var3 = getMyChar().cx - getMyChar().c() - 10;
            var4 = getMyChar().cx + getMyChar().c() + 10;
            var5 = getMyChar().cy - getMyChar().d() - var1;
            if ((var6 = getMyChar().cy + getMyChar().d()) > getMyChar().cy + 30) {
               var6 = getMyChar().cy + 30;
            }

            if (this.mobFocus == null) {
               for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                  var12 = (Mob)GameScr.vMobAttack.elementAt(var7);
                  var9 = Math.abs(getMyChar().cx - var12.x);
                  var10 = Math.abs(getMyChar().cy - var12.y);
                  var11 = var9 > var10 ? var9 : var10;
                  if ((var12.templateId != 97 || getMyChar().cTypePk != 4) && (var12.templateId != 96 || getMyChar().cTypePk != 5) && (var12.templateId != 98 || getMyChar().cTypePk != 4) && (var12.templateId != 167 || getMyChar().cTypePk != 4) && (var12.templateId != 99 || getMyChar().cTypePk != 5) && (var12.templateId != 166 || getMyChar().cTypePk != 5) && (var12.templateId != 202 || var12.status != 8 || var12.e()) && (!GameScr.en || var12.levelBoss != 3) && var12.templateId != 202 && var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && var12.status != 0 && var12.status != 1 && (this.mobFocus == null || var11 < var2[0])) {
                     this.mobFocus = var12;
                     var2[0] = var11;
                  }
               }
            } else {
               if (this.mobFocus.status != 1 && this.mobFocus.status != 0 && var3 <= this.mobFocus.x && this.mobFocus.x <= var4 && var5 <= this.mobFocus.y && this.mobFocus.y <= var6) {
                  this.m(0);
                  return;
               }

               this.mobFocus = null;

               for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                  var12 = (Mob)GameScr.vMobAttack.elementAt(var7);
                  var9 = Math.abs(getMyChar().cx - var12.x);
                  var10 = Math.abs(getMyChar().cy - var12.y);
                  var11 = var9 > var10 ? var9 : var10;
                  if ((var12.templateId != 97 || getMyChar().cTypePk != 4) && (var12.templateId != 96 || getMyChar().cTypePk != 5) && (var12.templateId != 98 || getMyChar().cTypePk != 4) && (var12.templateId != 167 || getMyChar().cTypePk != 4) && (var12.templateId != 99 || getMyChar().cTypePk != 5) && (var12.templateId != 166 || getMyChar().cTypePk != 5) && (var12.templateId != 202 || var12.status != 8 || var12.e()) && (!GameScr.en || var12.levelBoss != 3) && var12.templateId != 202 && var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && var12.status != 0 && var12.status != 1 && (this.mobFocus == null || var11 < var2[0])) {
                     this.mobFocus = var12;
                     var2[0] = var11;
                  }
               }
            }

            var3 = getMyChar().cx - 80;
            var4 = getMyChar().cx + 80;
            var5 = getMyChar().cy - 30;
            var6 = getMyChar().cy + 30;
            if (this.npcFocus != null && this.npcFocus.template.npcTemplateId == 13) {
               var3 = getMyChar().cx - 20;
               var4 = getMyChar().cx + 20;
               var5 = getMyChar().cy - 10;
               var6 = getMyChar().cy + 10;
            }

            if (this.npcFocus == null) {
               for(var7 = 0; var7 < GameScr.vSet.size(); ++var7) {
                  if ((var13 = (Npc)GameScr.vSet.elementAt(var7)).statusMe != 15 && TileMap.typeMap != 1) {
                     var9 = Math.abs(getMyChar().cx - var13.cx);
                     var10 = Math.abs(getMyChar().cy - var13.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     var3 = getMyChar().cx - 80;
                     var4 = getMyChar().cx + 80;
                     var5 = getMyChar().cy - 30;
                     var6 = getMyChar().cy + 30;
                     if (var13.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                     }

                     if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                        if (GameScr.en && GameScr.er == 1) {
                           break;
                        }

                        this.npcFocus = var13;
                        var2[1] = var11;
                     }
                  }
               }
            } else {
               if (var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6) {
                  this.m(1);
                  return;
               }

               this.y();

               for(var7 = 0; var7 < GameScr.vSet.size(); ++var7) {
                  if ((var13 = (Npc)GameScr.vSet.elementAt(var7)).statusMe != 15 && TileMap.typeMap != 1) {
                     var9 = Math.abs(getMyChar().cx - var13.cx);
                     var10 = Math.abs(getMyChar().cy - var13.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     var3 = getMyChar().cx - 80;
                     var4 = getMyChar().cx + 80;
                     var5 = getMyChar().cy - 30;
                     var6 = getMyChar().cy + 30;
                     if (var13.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                     }

                     if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                        if (GameScr.en && GameScr.er == 1) {
                           break;
                        }

                        this.npcFocus = var13;
                        var2[1] = var11;
                     }
                  }
               }
            }

            if (this.charFocus == null) {
               for(var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                  if (!(var14 = (Char)GameScr.vCharInMap.elementAt(var7)).isNhanban && var14.statusMe != 15 && !var14.isInvisible && var14.charID < -1 && this.wdx == 0 && this.wdy == 0 && var14.statusMe != 14 && var14.statusMe != 5) {
                     var9 = Math.abs(getMyChar().cx - var14.cx);
                     var10 = Math.abs(getMyChar().cy - var14.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                        this.charFocus = var14;
                        var2[2] = var11;
                     }
                  }
               }
            } else {
               if (var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 && this.charFocus.statusMe != 15 && !this.charFocus.isInvisible) {
                  this.m(2);
                  return;
               }

               this.charFocus = null;

               for(var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                  if (!(var14 = (Char)GameScr.vCharInMap.elementAt(var7)).isNhanban && var14.statusMe != 15 && !var14.isInvisible && var14.charID < 0 && this.wdx == 0 && this.wdy == 0 && var14.statusMe != 14 && var14.statusMe != 5) {
                     var9 = Math.abs(getMyChar().cx - var14.cx);
                     var10 = Math.abs(getMyChar().cy - var14.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                        this.charFocus = var14;
                        var2[2] = var11;
                     }
                  }
               }
            }

            var7 = -1;

            for(var1 = 0; var1 < 4; ++var1) {
               if (var7 == -1) {
                  if (var2[var1] != -1) {
                     var7 = var1;
                  }
               } else if (var2[var1] < var2[var7] && var2[var1] != -1) {
                  var7 = var1;
               }
            }

            if (GameScr.en && GameScr.er == 1 && !GameScr.gI().es) {
               GameScr.am();
            }
         } else {
            var3 = getMyChar().cx - getMyChar().c();
            var4 = getMyChar().cx + getMyChar().c();
            var5 = getMyChar().cy - getMyChar().d() - var1;
            if ((var6 = getMyChar().cy + getMyChar().d()) > getMyChar().cy + 30) {
               var6 = getMyChar().cy + 30;
            }

            if (this.mobFocus == null) {
               for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                  var12 = (Mob)GameScr.vMobAttack.elementAt(var7);
                  var9 = Math.abs(getMyChar().cx - var12.x);
                  var10 = Math.abs(getMyChar().cy - var12.y);
                  var11 = var9 > var10 ? var9 : var10;
                  if ((var12.templateId != 97 || getMyChar().cTypePk != 4) && (var12.templateId != 96 || getMyChar().cTypePk != 5) && (var12.templateId != 98 || getMyChar().cTypePk != 4) && (var12.templateId != 167 || getMyChar().cTypePk != 4) && (var12.templateId != 99 || getMyChar().cTypePk != 5) && (var12.templateId != 166 || getMyChar().cTypePk != 5) && var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && var12.status != 0 && var12.status != 1 && (this.mobFocus == null || var11 < var2[0])) {
                     this.mobFocus = var12;
                     var2[0] = var11;
                  }
               }
            } else {
               if (this.mobFocus.status != 1 && this.mobFocus.status != 0 && var3 <= this.mobFocus.x && this.mobFocus.x <= var4 && var5 <= this.mobFocus.y && this.mobFocus.y <= var6) {
                  this.m(0);
                  return;
               }

               this.mobFocus = null;

               for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                  var12 = (Mob)GameScr.vMobAttack.elementAt(var7);
                  var9 = Math.abs(getMyChar().cx - var12.x);
                  var10 = Math.abs(getMyChar().cy - var12.y);
                  var11 = var9 > var10 ? var9 : var10;
                  if ((var12.templateId != 97 || getMyChar().cTypePk != 4) && (var12.templateId != 96 || getMyChar().cTypePk != 5) && (var12.templateId != 98 || getMyChar().cTypePk != 4) && (var12.templateId != 167 || getMyChar().cTypePk != 4) && (var12.templateId != 99 || getMyChar().cTypePk != 5) && (var12.templateId != 166 || getMyChar().cTypePk != 5) && var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && var12.status != 0 && var12.status != 1 && (this.mobFocus == null || var11 < var2[0])) {
                     this.mobFocus = var12;
                     var2[0] = var11;
                  }
               }
            }

            var3 = getMyChar().cx - 80;
            var4 = getMyChar().cx + 80;
            var5 = getMyChar().cy - 30;
            var6 = getMyChar().cy + 30;
            if (this.npcFocus != null && this.npcFocus.template.npcTemplateId == 13) {
               var3 = getMyChar().cx - 20;
               var4 = getMyChar().cx + 20;
               var5 = getMyChar().cy - 10;
               var6 = getMyChar().cy + 10;
            }

            if (this.npcFocus == null) {
               for(var7 = 0; var7 < GameScr.vSet.size(); ++var7) {
                  if ((var13 = (Npc)GameScr.vSet.elementAt(var7)).statusMe != 15) {
                     var9 = Math.abs(getMyChar().cx - var13.cx);
                     var10 = Math.abs(getMyChar().cy - var13.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     var3 = getMyChar().cx - 80;
                     var4 = getMyChar().cx + 80;
                     var5 = getMyChar().cy - 30;
                     var6 = getMyChar().cy + 30;
                     if (var13.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                     }

                     if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                        if (GameScr.en && GameScr.er == 1) {
                           break;
                        }

                        this.npcFocus = var13;
                        var2[1] = var11;
                     }
                  }
               }
            } else {
               if (var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6) {
                  this.m(1);
                  return;
               }

               this.y();

               for(var7 = 0; var7 < GameScr.vSet.size(); ++var7) {
                  if ((var13 = (Npc)GameScr.vSet.elementAt(var7)).statusMe != 15) {
                     var9 = Math.abs(getMyChar().cx - var13.cx);
                     var10 = Math.abs(getMyChar().cy - var13.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     var3 = getMyChar().cx - 80;
                     var4 = getMyChar().cx + 80;
                     var5 = getMyChar().cy - 30;
                     var6 = getMyChar().cy + 30;
                     if (var13.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                     }

                     if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                        if (GameScr.en && GameScr.er == 1) {
                           break;
                        }

                        this.npcFocus = var13;
                        var2[1] = var11;
                     }
                  }
               }
            }

            var3 = getMyChar().cx - 40;
            var4 = getMyChar().cx + 40;
            var5 = getMyChar().cy - 30;
            var6 = getMyChar().cy + 30;
            if (this.charFocus == null) {
               for(var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                  if (!(var14 = (Char)GameScr.vCharInMap.elementAt(var7)).isNhanban) {
                     if (TileMap.mapID != 111) {
                        if (var14.statusMe == 15 || var14.isInvisible || var14.cTypePk == gv.cTypePk || this.wdx != 0 || this.wdy != 0 || var14.statusMe == 14 || var14.statusMe == 5) {
                           continue;
                        }
                     } else {
                        if (var14.statusMe == 15 || var14.isInvisible || this.wdx != 0 || this.wdy != 0) {
                           continue;
                        }

                        if (gv.nClass.classId == 6) {
                           if (gv.cTypePk == var14.cTypePk) {
                              if (var14.statusMe != 14 || var14.statusMe != 5) {
                                 continue;
                              }
                           } else if (var14.statusMe == 14 || var14.statusMe == 5) {
                              continue;
                           }
                        } else if (gv.cTypePk == var14.cTypePk || var14.statusMe == 14 || var14.statusMe == 5) {
                           continue;
                        }
                     }

                     var9 = Math.abs(getMyChar().cx - var14.cx);
                     var10 = Math.abs(getMyChar().cy - var14.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                        this.charFocus = var14;
                        var2[2] = var11;
                     }
                  }
               }
            } else {
               if (var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 && this.charFocus.statusMe != 15 && !this.charFocus.isInvisible && this.charFocus.statusMe != 14 && this.charFocus.statusMe != 5) {
                  this.m(2);
                  return;
               }

               this.charFocus = null;

               for(var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                  if (!(var14 = (Char)GameScr.vCharInMap.elementAt(var7)).isNhanban) {
                     if (TileMap.mapID != 111) {
                        if (var14.statusMe == 15 || var14.isInvisible || var14.cTypePk == gv.cTypePk || this.wdx != 0 || this.wdy != 0 || var14.statusMe == 14 || var14.statusMe == 5) {
                           continue;
                        }
                     } else {
                        if (var14.statusMe == 15 || var14.isInvisible || this.wdx != 0 || this.wdy != 0) {
                           continue;
                        }

                        if (gv.nClass.classId == 6) {
                           if (gv.cTypePk == var14.cTypePk) {
                              if (var14.statusMe != 14 || var14.statusMe != 5) {
                                 continue;
                              }
                           } else if (var14.statusMe == 14 || var14.statusMe == 5) {
                              continue;
                           }
                        } else if (gv.cTypePk == var14.cTypePk || var14.statusMe == 14 || var14.statusMe == 5) {
                           continue;
                        }
                     }

                     var9 = Math.abs(getMyChar().cx - var14.cx);
                     var10 = Math.abs(getMyChar().cy - var14.cy);
                     var11 = var9 > var10 ? var9 : var10;
                     if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                        this.charFocus = var14;
                        var2[2] = var11;
                     }
                  }
               }
            }

            var7 = -1;

            for(var1 = 0; var1 < 4; ++var1) {
               if (var7 == -1) {
                  if (var2[var1] != -1) {
                     var7 = var1;
                  }
               } else if (var2[var1] < var2[var7] && var2[var1] != -1) {
                  var7 = var1;
               }
            }
         }

         this.m(var7);
      }

   }

   private void m(int var1) {
      if (var1 == 0) {
         this.y();
         this.charFocus = null;
         this.itemFocus = null;
      } else if (var1 == 1) {
         this.mobFocus = null;
         this.charFocus = null;
         this.itemFocus = null;
      } else if (var1 == 2) {
         this.mobFocus = null;
         this.y();
         this.itemFocus = null;
      } else if (var1 == 3) {
         this.mobFocus = null;
         this.y();
         this.charFocus = null;
      }

   }

   public static boolean a(Char var0) {
      int var1 = GameScr.gW23;
      int var2 = GameScr.gW23 + GameCanvas.z;
      int var3 = GameScr.gH2 + 10;
      int var4 = GameScr.gH2 + GameScr.gH;
      return var0.statusMe != 15 && !var0.isInvisible && var1 <= var0.cx && var0.cx <= var2 && var3 <= var0.cy && var0.cy <= var4;
   }

   public final void x() {
      if (this.charFocus != null && this.charFocus.isNhanban) {
         this.charFocus = null;
      }

      if (getMyChar().fu == null && getMyChar().arrow == null) {
         this.focus.removeAllElements();
         int var1 = 0;
         int var2 = GameScr.gW23 + 10;
         int var3 = GameScr.gW23 + GameCanvas.z - 10;
         int var4 = GameScr.gH2 + 10;
         int var5 = GameScr.gH2 + GameScr.gH;
         int var6;
         Char var7;
         ItemMap var8;
         Mob var9;
         Npc var10;
         if (TileMap.typeMap != 3 && TileMap.mapID != 111) {
            for(var6 = 0; var6 < GameScr.vItemMap.size(); ++var6) {
               var8 = (ItemMap)GameScr.vItemMap.elementAt(var6);
               if (var2 <= var8.x && var8.x <= var3 && var4 <= var8.y && var8.y <= var5) {
                  this.focus.addElement(var8);
                  if (this.itemFocus != null && var8.equals(this.itemFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vMobAttack.size(); ++var6) {
               if (((var9 = (Mob)GameScr.vMobAttack.elementAt(var6)).templateId != 97 || getMyChar().cTypePk != 4) && (var9.templateId != 96 || getMyChar().cTypePk != 5) && (var9.templateId != 98 || getMyChar().cTypePk != 4) && (var9.templateId != 167 || getMyChar().cTypePk != 4) && (var9.templateId != 99 || getMyChar().cTypePk != 5) && (var9.templateId != 166 || getMyChar().cTypePk != 5) && (var9.templateId != 202 || var9.status != 8 || var9.e()) && var9.status != 1 && var9.status != 0 && var2 <= var9.x && var9.x <= var3 && var4 <= var9.y && var9.y <= var5) {
                  this.focus.addElement(var9);
                  if (this.mobFocus != null && var9.equals(this.mobFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vSet.size(); ++var6) {
               if ((var10 = (Npc)GameScr.vSet.elementAt(var6)).statusMe != 15 && var2 <= var10.cx && var10.cx <= var3 && var4 <= var10.cy && var10.cy <= var5) {
                  this.focus.addElement(var10);
                  if (this.npcFocus != null && var10.equals(this.npcFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
               if (!(var7 = (Char)GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.statusMe != 15 && !var7.isInvisible && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                  this.focus.addElement(var7);
                  if (this.charFocus != null && var7.equals(this.charFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            if (this.focus.size() <= 0) {
               this.mobFocus = null;
               this.y();
               this.charFocus = null;
               this.itemFocus = null;
               fw = false;
               return;
            }

            if (var1 >= this.focus.size()) {
               var1 = 0;
            }

            if (this.focus.elementAt(var1) instanceof Mob) {
               this.mobFocus = (Mob)this.focus.elementAt(var1);
               this.y();
               this.charFocus = null;
               this.itemFocus = null;
               fw = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof Npc) {
               this.mobFocus = null;
               this.y();
               this.npcFocus = (Npc)this.focus.elementAt(var1);
               this.charFocus = null;
               this.itemFocus = null;
               fw = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof Char) {
               this.mobFocus = null;
               this.y();
               this.charFocus = (Char)this.focus.elementAt(var1);
               this.itemFocus = null;
               fw = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof ItemMap) {
               this.mobFocus = null;
               this.y();
               this.charFocus = null;
               this.itemFocus = (ItemMap)this.focus.elementAt(var1);
               fw = true;
               return;
            }
         } else {
            if (TileMap.mapID != 98 && TileMap.mapID != 104) {
               for(var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
                  if (!(var7 = (Char)GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.statusMe != 15 && !var7.isInvisible && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                     if (TileMap.mapID != 111) {
                        if (var7.cTypePk != getMyChar().cTypePk && var7.statusMe != 14 && var7.statusMe != 5) {
                           this.focus.addElement(var7);
                           if (this.charFocus != null && var7.equals(this.charFocus)) {
                              var1 = this.focus.size();
                           }
                        }
                     } else if (gv.cTypePk == 0) {
                        this.focus.addElement(var7);
                        if (this.charFocus != null && var7.equals(this.charFocus)) {
                           var1 = this.focus.size();
                        }
                     } else if (gv.nClass.classId == 6) {
                        if (gv.cTypePk == var7.cTypePk) {
                           if (var7.statusMe == 14 || var7.statusMe == 5) {
                              this.focus.addElement(var7);
                              if (this.charFocus != null && var7.equals(this.charFocus)) {
                                 var1 = this.focus.size();
                              }
                           }
                        } else if ((gv.cTypePk != 4 || var7.cTypePk == 5) && (gv.cTypePk != 5 || var7.cTypePk == 4) && var7.statusMe != 14 && var7.statusMe != 5) {
                           this.focus.addElement(var7);
                           if (this.charFocus != null && var7.equals(this.charFocus)) {
                              var1 = this.focus.size();
                           }
                        }
                     } else if ((gv.cTypePk != 4 || var7.cTypePk == 5) && (gv.cTypePk != 5 || var7.cTypePk == 4) && var7.statusMe != 14 && var7.statusMe != 5) {
                        this.focus.addElement(var7);
                        if (this.charFocus != null && var7.equals(this.charFocus)) {
                           var1 = this.focus.size();
                        }
                     }
                  }
               }
            } else {
               for(var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
                  if (!(var7 = (Char)GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.statusMe != 15 && !var7.isInvisible && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                     this.focus.addElement(var7);
                     if (this.charFocus != null && var7.equals(this.charFocus)) {
                        var1 = this.focus.size();
                     }
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vItemMap.size(); ++var6) {
               var8 = (ItemMap)GameScr.vItemMap.elementAt(var6);
               if (var2 <= var8.x && var8.x <= var3 && var4 <= var8.y && var8.y <= var5) {
                  this.focus.addElement(var8);
                  if (this.itemFocus != null && var8.equals(this.itemFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vMobAttack.size(); ++var6) {
               if (((var9 = (Mob)GameScr.vMobAttack.elementAt(var6)).templateId != 97 || getMyChar().cTypePk != 4) && (var9.templateId != 96 || getMyChar().cTypePk != 5) && (var9.templateId != 98 || getMyChar().cTypePk != 4) && (var9.templateId != 167 || getMyChar().cTypePk != 4) && (var9.templateId != 99 || getMyChar().cTypePk != 5) && (var9.templateId != 166 || getMyChar().cTypePk != 5) && var9.status != 1 && var9.status != 0 && var2 <= var9.x && var9.x <= var3 && var4 <= var9.y && var9.y <= var5) {
                  this.focus.addElement(var9);
                  if (this.mobFocus != null && var9.equals(this.mobFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            for(var6 = 0; var6 < GameScr.vSet.size(); ++var6) {
               if ((var10 = (Npc)GameScr.vSet.elementAt(var6)).statusMe != 15 && var2 <= var10.cx && var10.cx <= var3 && var4 <= var10.cy && var10.cy <= var5) {
                  this.focus.addElement(var10);
                  if (this.npcFocus != null && var10.equals(this.npcFocus)) {
                     var1 = this.focus.size();
                  }
               }
            }

            if (this.focus.size() <= 0) {
               this.mobFocus = null;
               this.y();
               this.charFocus = null;
               this.itemFocus = null;
               fw = false;
               return;
            }

            if (var1 >= this.focus.size()) {
               var1 = 0;
            }

            if (this.focus.elementAt(var1) instanceof Char) {
               this.mobFocus = null;
               this.y();
               this.charFocus = (Char)this.focus.elementAt(var1);
               this.itemFocus = null;
               fw = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof Npc) {
               this.mobFocus = null;
               this.y();
               this.npcFocus = (Npc)this.focus.elementAt(var1);
               this.charFocus = null;
               this.itemFocus = null;
               fw = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof Mob) {
               this.mobFocus = (Mob)this.focus.elementAt(var1);
               this.y();
               this.charFocus = null;
               this.itemFocus = null;
               fw = true;
               return;
            }

            if (this.focus.elementAt(var1) instanceof ItemMap) {
               this.mobFocus = null;
               this.y();
               this.charFocus = null;
               this.itemFocus = (ItemMap)this.focus.elementAt(var1);
               fw = true;
               return;
            }
         }
      }

   }

   public final void y() {
      if (this.me && this.npcFocus != null) {
         this.npcFocus.chatPopup = null;
         this.npcFocus = null;
      }

   }

   private void ay() {
      if (!GameCanvas.a) {
         if (TileMap.a(this.cx, this.cy + 1, 1024)) {
            TileMap.b(this.cx, this.cy + 1);
            TileMap.b(this.cx, this.cy - 2);
         }

         if (TileMap.a(this.cx - TileMap.i, this.cy + 1, 512)) {
            TileMap.c(this.cx - TileMap.i, this.cy + 1);
            TileMap.c(this.cx - TileMap.i, this.cy - 2);
         }

         if (TileMap.a(this.cx + TileMap.i, this.cy + 1, 512)) {
            TileMap.c(this.cx + TileMap.i, this.cy + 1);
            TileMap.c(this.cx + TileMap.i, this.cy - 2);
         }
      }

   }

   public final void b(Message var1) {
      try {
         this.a(var1);
         getMyChar().eff5BuffHp = var1.reader().readShort();
         getMyChar().eff5BuffMp = var1.reader().readShort();
         int var2 = var1.reader().readUnsignedByte();
         Item var3;
         (var3 = this.arrItemMounts[var2]).typeUI = 3;
         this.arrItemMounts[var2] = null;
         var3.indexUI = var1.reader().readUnsignedByte();
         this.arrItemBag[var3.indexUI] = var3;
         if (var2 == 4) {
            this.isJump = this.fallAttack = this.autoFall = false;
         }

         GameScr.isPaintItemInfo = false;
         GameScr.gI().aj();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public final void itemBodyToBag(Message var1) {
      try {
         this.a(var1);
         getMyChar().eff5BuffHp = var1.reader().readShort();
         getMyChar().eff5BuffMp = var1.reader().readShort();
         Item var2;
         (var2 = this.arrItemBody[var1.reader().readUnsignedByte()]).typeUI = 3;
         if (var2.indexUI == 1) {
            this.wp = 15;
         } else if (var2.indexUI == 2) {
            this.p();
         } else if (var2.indexUI == 6) {
            this.q();
         }

         this.arrItemBody[var2.indexUI] = null;
         var2.indexUI = var1.reader().readUnsignedByte();
         getMyChar().head = var1.reader().readShort();
         this.arrItemBag[var2.indexUI] = var2;
         GameScr.gI().left = GameScr.gI().center = null;
         GameScr.gI().aj();
      } catch (Exception var3) {
         var3.printStackTrace();
         System.out.println("Char.itemBodyToBag()");
      }

   }

   public final void itemBagToBox(Message var1) {
      try {
         int var2 = var1.reader().readUnsignedByte();
         int var3 = var1.reader().readUnsignedByte();
         Item var4;
         if ((var4 = this.arrItemBag[var2]) != null) {
            if (var4.template.type == 16) {
               GameScr.r -= var4.quantity;
            }

            if (var4.template.type == 17) {
               GameScr.q -= var4.quantity;
            }

            this.arrItemBag[var2] = null;
            if (this.arrItemBox[var3] == null) {
               var4.indexUI = var3;
               var4.typeUI = 4;
               this.arrItemBox[var3] = var4;
            } else {
               Item var5 = this.arrItemBox[var3];
               var5.quantity += var4.quantity;
            }
         }

         GameScr.gI().left = GameScr.gI().center = null;
         GameScr.gI().ab();
      } catch (Exception var6) {
         var6.printStackTrace();
         System.out.println("Char.itemBagToBox()");
      }

   }

   public final void itemBoxToBag(Message var1) {
      try {
         int var2 = var1.reader().readUnsignedByte();
         int var3 = var1.reader().readUnsignedByte();
         Item var4;
         if ((var4 = this.arrItemBox[var2]) != null) {
            if (var4.template.type == 16) {
               GameScr.r += var4.quantity;
            }

            if (var4.template.type == 17) {
               GameScr.q += var4.quantity;
            }

            this.arrItemBox[var2] = null;
            if (this.arrItemBag[var3] == null) {
               var4.indexUI = var3;
               var4.typeUI = 3;
               this.arrItemBag[var3] = var4;
            } else {
               Item var5 = this.arrItemBag[var3];
               var5.quantity += var4.quantity;
            }
         }

         GameScr.gI().left = GameScr.gI().center = null;
         GameScr.gI().ab();
      } catch (Exception var6) {
         var6.printStackTrace();
         System.out.println("Char.itemBoxToBag()");
      }

   }

   public static void crystalCollect(Message var0, boolean var1) {
      try {
         for(int var2 = 0; var2 < GameScr.arrItemUpPeal.length; ++var2) {
            GameScr.arrItemUpPeal[var2] = null;
         }

         byte var7 = var0.reader().readByte();
         Item var3;
         (var3 = new Item()).typeUI = 3;
         var3.indexUI = var0.reader().readByte();
         var3.template = ItemTemplates.get(var0.reader().readShort());
         var3.isLock = var0.reader().readBoolean();
         var3.isExpires = var0.reader().readBoolean();
         var3.quantity = 1;
         if (var1) {
            getMyChar().xu = var0.reader().readInt();
         } else {
            getMyChar().yen = var0.reader().readInt();

            try {
               getMyChar().xu = var0.reader().readInt();
            } catch (Exception var5) {
            }
         }

         GameScr.arrItemUpPeal[0] = var3;
         GameScr.ey = GameScr.v[53];
         GameScr.ex = 0;
         GameScr.gI().left = GameScr.gI().center = null;
         GameScr.gI().updateCommandForUI();
         GameCanvas.n();
         if (var7 == 1) {
            getMyChar().arrItemBag[var3.indexUI] = var3;
            InfoMe.addInfo(mResources.fa + " " + var3.template.name);
         } else {
            InfoMe.addInfo(mResources.ez + " " + ItemTemplates.get((short)(var3.template.id + 1)).name + " " + mResources.fc + " " + var3.template.name, 25, mFont.tahoma_7_red);
            GameScr.arrItemUpPeal[0] = var3;
         }

         Class_cl.c();
      } catch (Exception var6) {
         var6.printStackTrace();
         System.out.println("Char.itemBagToBox()");
      }

   }

   private static void kickOption(Item var0, int var1) {
      int var2 = 0;
      if (var0 != null && var0.options != null) {
         for(int var3 = 0; var3 < var0.options.size(); ++var3) {
            ItemOption var4;
            (var4 = (ItemOption)var0.options.elementAt(var3)).active = 0;
            if (var4.optionTemplate.type == 2) {
               if (var2 < var1) {
                  var4.active = 1;
                  ++var2;
               }
            } else if (var4.optionTemplate.type == 3 && var0.upgrade >= 4) {
               var4.active = 1;
            } else if (var4.optionTemplate.type == 4 && var0.upgrade >= 8) {
               var4.active = 1;
            } else if (var4.optionTemplate.type == 5 && var0.upgrade >= 12) {
               var4.active = 1;
            } else if (var4.optionTemplate.type == 6 && var0.upgrade >= 14) {
               var4.active = 1;
            } else if (var4.optionTemplate.type == 7 && var0.upgrade >= 16) {
               var4.active = 1;
            }
         }
      }

   }

   public final void updateKickOption() {
      int var1 = 2;
      int var2 = 2;
      int var3 = 2;
      if (this.arrItemBody[0] == null) {
         --var1;
      }

      if (this.arrItemBody[6] == null) {
         --var1;
      }

      if (this.arrItemBody[5] == null) {
         --var1;
      }

      kickOption(this.arrItemBody[0], var1);
      kickOption(this.arrItemBody[6], var1);
      kickOption(this.arrItemBody[5], var1);
      if (this.arrItemBody[2] == null) {
         --var2;
      }

      if (this.arrItemBody[8] == null) {
         --var2;
      }

      if (this.arrItemBody[7] == null) {
         --var2;
      }

      kickOption(this.arrItemBody[2], var2);
      kickOption(this.arrItemBody[8], var2);
      kickOption(this.arrItemBody[7], var2);
      if (this.arrItemBody[4] == null) {
         --var3;
      }

      if (this.arrItemBody[3] == null) {
         --var3;
      }

      if (this.arrItemBody[9] == null) {
         --var3;
      }

      if (this.arrItemBody[1] != null) {
         ItemOption var4;
         if (this.arrItemBody[1].sys == this.e()) {
            if (this.arrItemBody[1].options != null) {
               for(var1 = 0; var1 < this.arrItemBody[1].options.size(); ++var1) {
                  if ((var4 = (ItemOption)this.arrItemBody[1].options.elementAt(var1)).optionTemplate.type == 2) {
                     var4.active = 1;
                  }
               }
            }
         } else if (this.arrItemBody[1].options != null) {
            for(var1 = 0; var1 < this.arrItemBody[1].options.size(); ++var1) {
               if ((var4 = (ItemOption)this.arrItemBody[1].options.elementAt(var1)).optionTemplate.type == 2) {
                  var4.active = 0;
               }
            }
         }
      }

      kickOption(this.arrItemBody[4], var3);
      kickOption(this.arrItemBody[3], var3);
      kickOption(this.arrItemBody[9], var3);
   }

   public final void doInjure(int var1, int var2, boolean var3, int var4) {
      this.cHp -= var1;
      this.cMP -= var2;
      if (!this.me) {
         this.cHp = this.cHpNew;
      }

      if (this.cHp < 0) {
         this.cHp = 0;
      }

      if (this.cMP < 0) {
         this.cMP = 0;
      }

      if (this.cHp <= 0 && this.statusMe != 14 && this.statusMe != 5) {
         this.cHp = 1;
      }

      if (var1 <= 0) {
         if (this.me) {
            GameScr.a("", this.cx, this.cy - this.ch, 7);
         } else {
            GameScr.a("", this.cx, this.cy - this.ch, 4);
         }
      } else {
         GameScr.a("-" + var1, this.cx, this.cy - this.ch, 0);
      }

      if (var1 > 0) {
         this.isInjure = 4;
      }

      if (var3) {
         if (var4 == 114) {
            ServerEffect.addServerEffect(32, this.cx, this.cy - this.chh, 1);
            return;
         }

         if (var4 == 115) {
            ServerEffect.addServerEffect(85, this.cx, this.cy, 1);
            return;
         }

         if (var4 == 139) {
            GameScr.ep = 1;
            GameScr.eq = 0;
            ServerEffect.addServerEffect(91, this, 2);
            return;
         }

         if (var4 == 144) {
            ServerEffect.addServerEffect(91, this, 1);
            return;
         }
      } else {
         this.l(49);
      }

   }

   private void startDie(short var1, short var2) {
      if (this.me) {
         ischangingMap = true;

         for(int var3 = 0; var3 < GameScr.vCharInMap.size(); ++var3) {
            ((Char)GameScr.vCharInMap.elementAt(var3)).killCharId = -9999;
         }
      }

      this.statusMe = 5;
      this.cp2 = var1;
      this.cp3 = var2;
      this.cp1 = 0;
      this.cHp = 0;
      this.testCharId = -9999;
      this.killCharId = -9999;
   }

   public final void waitToDie(short var1, short var2) {
      this.wdx = var1;
      this.wdy = var2;
   }

   private void changeStatusStand() {
      this.timeBocdau = 0;
      this.statusMe = 1;
      this.timeSummon = System.currentTimeMillis();
   }

   public final void liveFromDead() {
      this.cHp = this.cMaxHp;
      this.cMP = this.cMaxMP;
      this.changeStatusStand();
      this.cp1 = this.cp2 = this.cp3 = 0;
      ServerEffect.addServerEffect(20, this, 2);
      GameScr.gI().center = null;
   }

   public final boolean doUsePotion(int var1) {
      if (this.arrItemBag == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.arrItemBag.length; ++var2) {
            if (this.arrItemBag[var2] != null && this.arrItemBag[var2].template.type == var1 && this.arrItemBag[var2].template.level <= gv.clevel) {
               Service.gI().useItem(var2);
               return true;
            }
         }

         return false;
      }
   }

   private static boolean isLang() {
      return TileMap.mapID == 1 || TileMap.mapID == 27 || TileMap.mapID == 72 || TileMap.mapID == 10 || TileMap.mapID == 17 || TileMap.mapID == 22 || TileMap.mapID == 32 || TileMap.mapID == 38 || TileMap.mapID == 43 || TileMap.mapID == 48;
   }

   public static boolean isMeCanAttackOtherPlayer(Char var0) {
      if (var0 != null && var0.isNhanban) {
         return false;
      } else if (var0 != null && getMyChar().myskill != null && getMyChar().myskill.template.type != 2 && getMyChar().myskill.template.type != 3 && (getMyChar().myskill.template.type != 4 || var0.statusMe == 14 || var0.statusMe == 5)) {
         if (((getMyChar().cTypePk != 4 || var0.cTypePk != 5) && (getMyChar().cTypePk != 5 || var0.cTypePk != 4) || isTeam(var0) || isLang()) && (var0.cTypePk != 3 || isTeam(var0) || isLang()) && (getMyChar().cTypePk != 3 || isTeam(var0) || isLang()) && (getMyChar().cTypePk != 1 || var0.cTypePk != 1 || isTeam(var0) || isLang()) && (getMyChar().testCharId < 0 || getMyChar().testCharId != var0.charID) && (getMyChar().killCharId < 0 || getMyChar().killCharId != var0.charID || isLang()) && (var0.killCharId < 0 || var0.killCharId != getMyChar().charID || isLang())) {
            return false;
         } else {
            return var0.statusMe != 14 && var0.statusMe != 5;
         }
      } else {
         return false;
      }
   }

   private static boolean isTeam(Char var0) {
      for(int var1 = 0; var1 < GameScr.vParty.size(); ++var1) {
         Party var2 = (Party)GameScr.vParty.elementAt(var1);
         if (var0.charID == var2.charId) {
            return true;
         }
      }

      return false;
   }

   public static void clearTask() {
      getMyChar().callEffTask(21);
      getMyChar().taskMaint = null;

      for(int var0 = 0; var0 < getMyChar().arrItemBag.length; ++var0) {
         if (getMyChar().arrItemBag[var0] != null && (getMyChar().arrItemBag[var0].template.type == 25 || getMyChar().arrItemBag[var0].template.type == 23 || getMyChar().arrItemBag[var0].template.type == 24)) {
            getMyChar().arrItemBag[var0] = null;
         }
      }

      Npc.clearEffTask();
   }

   public static int getCT() {
      if (pointChienTruong >= 4000) {
         return 4;
      } else if (pointChienTruong >= 1500) {
         return 3;
      } else if (pointChienTruong >= 600) {
         return 2;
      } else {
         return pointChienTruong >= 200 ? 1 : 0;
      }
   }

   public final boolean isHumanz() {
      return this.isHuman;
   }

   public final boolean isNhanbanz() {
      return this.isNhanban;
   }

   public static Item f(int var0) {
      Item[] var1 = getMyChar().arrItemBag;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Item var3;
         if ((var3 = var1[var2]) != null && var3.template.id == var0) {
            return var3;
         }
      }

      return null;
   }

   public static int g(int var0) {
      Item[] var1 = getMyChar().arrItemBag;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].template.id == var0) {
            return var2;
         }
      }

      return -1;
   }

   public static boolean h(int var0) {
      Item[] var1 = getMyChar().arrItemBag;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].template.id == var0) {
            return true;
         }
      }

      return false;
   }

   public static int i(int var0) {
      Item[] var1 = getMyChar().arrItemBag;
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         if (var1[var3] != null && var1[var3].template.id == var0) {
            if (var1[var3].template.isUpToUp) {
               var2 += var1[var3].quantity;
            } else {
               ++var2;
            }
         }
      }

      return var2;
   }

   public static int af() {
      Item[] var0 = getMyChar().arrItemBag;
      int var1 = 0;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == null) {
            ++var1;
         }
      }

      return var1;
   }

   public static int ag() {
      Item[] var0 = getMyChar().arrItemBox;
      int var1 = 0;
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] == null) {
               ++var1;
            }
         }
      }

      return var1;
   }

   public static TaskOrder j(int var0) {
      for(int var1 = 0; var1 < getMyChar().taskOrders.size(); ++var1) {
         TaskOrder var2;
         if ((var2 = (TaskOrder)getMyChar().taskOrders.elementAt(var1)) != null && var2.taskId == var0) {
            return var2;
         }
      }

      return null;
   }

   public static boolean b(int var0, int var1) {
      Char var2 = getMyChar();
      if (var0 == -1) {
         var0 = var2.cx;
      }

      if (var1 == -1) {
         var1 = var2.cy;
      }

      if (var0 == var2.cx && var1 == var2.cy) {
         return false;
      } else {
         int var3 = var2.cx;
         int var4 = TileMap.a(var0, var1 - 12, 64) ? TileMap.b(var1) - 24 : var1;
         if (var0 > var3) {
            while(true) {
               var3 += 50;
               if (var3 >= var0) {
                  break;
               }

               Service.gI().charMove(var3, TileMap.e(var3, var4));
            }
         } else {
            while(true) {
               var3 -= 50;
               if (var3 <= var0) {
                  break;
               }

               Service.gI().charMove(var3, TileMap.e(var3, var4));
            }
         }

         Service.gI().charMove(var0, var1);
         var2.timeSendmove = System.currentTimeMillis();
         var2.cx = var2.cxSend = var0;
         var2.cy = var2.cySend = var1;
         Service.gI().charMove(var2.cx, var2.cy);
         return true;
      }
   }

   public static boolean c(int var0, int var1) {
      if (var0 == -1) {
         var0 = gv.cx;
      }

      if (var1 == -1) {
         var1 = gv.cy;
      }

      int[] var2 = new int[2];
      return !TileMap.a(var0, var1, var2) ? false : b(var2[0], var2[1]);
   }

   public static void d(int var0, int var1) {
      int var2 = gv.cx;
      int var3 = Res.abs(var0 - var2) / 50;
      var2 = gv.cy;
      int var4 = Res.abs(var1 - var2) / 10;
      var2 = gv.cx;
      int var5 = gv.cy;
      if (var4 < 3) {
         Service.gI().charMove(gv.cx, var5 = var1 - 60);
         var4 = 3;
      }

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         if (var0 > gv.cx) {
            var2 += 50;
         } else {
            var2 -= 50;
         }

         Service.gI().charMove(var2, var5);
      }

      Service.gI().charMove(var0, var5);

      for(var6 = 0; var6 < var4; ++var6) {
         if (var1 > gv.cy) {
            var5 += 10;
         } else {
            var5 -= 10;
         }

         Service.gI().charMove(var0, var5);
      }

      Service.gI().charMove(var0, var1);
      gv.timeSendmove = System.currentTimeMillis();
      gv.cx = gv.cxSend = var0;
      gv.cy = gv.cySend = var1;
   }

   public static void ah() {
      be = null;
      timeStartBlink = false;
      isAHP = false;
      isAMP = false;
      isAFood = false;
      isABuff = false;
      isAResuscitate = false;
      isAPickYen = false;
      isAPickYHM = false;
      isAPickYHMS = false;
      dm = false;
      dn = false;
      doa = false;
      dp = false;
      dq = false;
      dr = false;
      ds = false;
      dt = false;
      du = false;
      dv = false;
      dw = false;
      dx = false;
      dy = false;
      dz = false;
      ea = false;
      eb = false;
      ec = false;
      ed = false;
      ee = false;
      ef = false;
      eg = false;
      eh = false;
      ei = false;
      ej = false;
      ek = 0;
      el = 0;
      em = 0;
      en = 0;
      eo = 0;
      ep = 0;
      eq = 0;
      er = 0;
      et = 0;
      pointChienTruong = 0;
      CharInfo = (int[][][])null;
      gv = null;
      flag = false;
      ischangingMap = false;
      isSendMove = false;
      locate = null;
      delaySendmove = 0;
      fw = false;
   }

   static {
      Main.main(37);
      a();
   }
}

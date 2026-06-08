import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class GameScr extends mScreen implements IChatable, IActionListener {
    public static GameScr instance;
    public static int gW;
    public static int gH;
    public static int gW2;
    private static int gssw;
    private static int gssh;
    public static int gH34;
    public static int gW3;
    public static int gH3;
    public static int gH23;
    public static int gW23;
    public static int gH2;
    private static int csPadMaxH;
    private static int cmdBarH;
    private static int gW34;
    private static int gW6;
    public static int gH6;
    public static int cmx;
    private static int cmy;
    private static int cmdx;
    public static int cmdy;
    public static int cmvx;
    public static int cmvy;
    public static int p;
    private Command1 fz;
    private Command1 ga;
    private Command1 gb;
    private Command1 gc;
    private Command1 gd;
    private Command1 ge;
    public static int q;
    public static int r;
    public static SkillPaint[] s;
    public static Arrowpaint[] t;
    public static Part[] parts;
    public static EffectCharPaint[] v;
    private int gf = 0;
    private boolean gg = false;
    public static MyVector vMobSoul;
    public static MyVector vClan;
    public static MyVector vParty;
    public static MyVector vPtMap;
    public static MyVector vFriend;
    public static MyVector vList;
    public static MyVector vFriendWait;
    public static MyVector vEnemies;
    public static MyVector vCharInMap;
    public static MyVector vItemMap;
    public static MyVector vMobAttack;
    public static MyVector vSet;
    public static MyVector vMob;
    private static MyVector vNpc;
    public static NClass[] nClasss;
    private static int gi;
    private static int indexTitle;
    public static int indexSelect;
    public static int indexRow;
    private static int gk;
    public static int indexMenu;
    public static int an;
    private Item itemFocus;
    public static ItemOptionTemplate[] iOptionTemplates;
    public static SkillOptionTemplate[] sOptionTemplates;
    private static Scroll scrInfo;
    public static Scroll aq;
    public static Item[] arrItemNonNam;
    public static Item[] arrItemNonNu;
    public static Item[] arrItemAoNam;
    public static Item[] arrItemAoNu;
    public static Item[] arrItemGangTayNam;
    public static Item[] arrItemGangTayNu;
    public static Item[] arrItemQuanNam;
    public static Item[] arrItemQuanNu;
    public static Item[] arrItemGiayNam;
    public static Item[] arrItemGiayNu;
    public static Item[] arrItemLien;
    public static Item[] arrItemNhan;
    public static Item[] arrItemNgocBoi;
    public static Item[] arrItemPhu;
    public static Item[] arrItemWeapon;
    public static Item[] arrItemStack;
    public static Item[] arrItemStackLock;
    public static Item[] arrItemGrocery;
    public static Item[] arrItemGroceryLock;
    public static Item[] arrItemStore;
    public static Item[] arrItemElites;
    public static Item[] arrItemClanShop;
    public static Item[] arrItemBook;
    public static Item[] arrItemFashion;
    public static Item[] arrItemUpPeal;
    public static Item[] arrItemUpGrade;
    public static Item[] arrItemSplit;
    public static Item[] arrItemTradeMe;
    public static Item[] arrItemTradeOrder;
    public static Item[] arrItemConvert;
    public static ItemStands[] arrItemStands;
    public static short[] bw;
    public int bx;
    public static Item itemUpGrade;
    public static Item itemSplit;
    public static Item itemSell;
    private static boolean gn;
    private static boolean isViewNext;
    private static boolean gp;
    private static boolean gq;
    public static boolean cb;
    private static boolean gr;
    public static boolean cc;
    private static boolean gs;
    public static boolean isPaintAuctionSale;
    public static boolean isPaintAlert;
    private static boolean isPaintTask;
    private static boolean isPaintTeam;
    private static boolean isPaintFindTeam;
    public static boolean isPaintFriend;
    private static boolean isPaintList;
    private static boolean isPaintEnemies;
    public static boolean isPaintItemInfo;
    private static boolean gy;
    public static boolean isPaintInfoMe;
    private static boolean isPaintStore;
    private static boolean isPaintEliteShop;
    private static boolean isPaintNonNam;
    private static boolean isPaintNonNu;
    private static boolean isPaintAoNam;
    private static boolean isPaintAoNu;
    private static boolean isPaintGangTayNam;
    private static boolean isPaintGangTayNu;
    private static boolean isPaintQuanNam;
    private static boolean isPaintQuanNu;
    private static boolean isPaintGiayNam;
    private static boolean isPaintGiayNu;
    private static boolean isPaintLien;
    private static boolean isPaintNhan;
    private static boolean isPaintNgocBoi;
    private static boolean isPaintPhu;
    private static boolean isPaintWeapon;
    private static boolean isPaintStack;
    private static boolean isPaintStackLock;
    private static boolean isPaintGrocery;
    private static boolean isPaintGroceryLock;
    private static boolean isPaintUpGrade;
    private static boolean isPaintConvert;
    private static boolean hw;
    private static boolean isPaintUpPearl;
    private static boolean isPaintBox;
    private static boolean isPaintSplit;
    private static boolean isPaintCharInMap;
    public static boolean isPaintLuyenNgoc;
    private static boolean ib;
    public static boolean isPaintAuto;
    public static boolean isPaintMessage;
    private static boolean isPaintClan;
    private static boolean id;
    private static boolean isPaintLuckySpin;
    private static boolean isPaintAuctionBuy;
    private static boolean isPaintLuyenThach;
    private static boolean isPaintTinhluyen;
    private static boolean isPaintDichChuyen;
    private static boolean isPaintKhamNgoc;
    private static boolean isPaintGiaoDo;
    private static boolean isPaintThaoNgoc;
    private static boolean im;
    private static boolean isPaintLucky_Draw;
    private static boolean isPaintGotNgoc;
    public static Char currentCharViewInfo;
    public static long[] exps;
    public static int[] cn;
    public static int[] co;
    public static int[] cp;
    public static int[] cq;
    public static int[] cr;
    public static int[] cs;
    public static int[] ct;
    public static int[] cu;
    public static int[] cv;
    public static int[] cw;
    private static int[] ip;
    private int iq = 6;
    public int[] cx;
    private int[] ir;
    public int cy = 0;
    public int cz = 0;
    public int da = 0;
    public int db = 0;
    public int dc = 0;
    private int is = 0;
    private int it = 0;
    private int iu = 0;
    private int iv = -1;
    public int dd = -1;
    public int de = -1;
    private boolean iw;
    public static byte[][] df;
    public static byte[][] dg;
    private MyVector ix;
    private String iy;
    private TField iz = null;
    public static byte dh;
    public static byte di;
    public static byte dj;
    public static byte dk;
    public static byte dl;
    public static byte dm;
    public static byte dn;
    public static byte doa;
    private static Image ja;
    private static Image jb;
    private static Image jc;
    private static Image jd;
    private static Image je;
    private static Image jf;
    private static Image jg;
    private static Image jh;
    private static Image ji;
    private static Image jj;
    private static Image jk;
    private static Image jl;
    private static Image jm;
    private static Image jn;
    public static Image dp;
    public static Image dq;
    public static Image dr;
    public static Image ds;
    private static Image jo;
    public static Image dt;
    public static Image du;
    public String dv = "";
    public String dw = "";
    public int dx;
    public int dy;
    private static byte jp;
    public static byte dz;
    private int[] jq = new int[2];
    private int[] jr = new int[2];
    private int[] js;
    private int[] jt;
    public long ea;
    public String[] eb = new String[]{"10000", "20000", "30000", "50000", "100000", "200000", "500000", "1000000", "5000000"};
    public int ec;
    public int ed;
    public String[] ee;
    public static MyVector ef;
    public static MyVector eg;
    public static MyVector eh;
    private static Image ju;
    public static Image ei;
    public static Image ej;
    public static Image ek;
    public static Image el;
    public static Image em;
    public static boolean en;
    public static boolean eo;
    private static Skill[] keySkill;
    private static Skill[] onScreenSkill;
    private Command1 jx;
    private Command1 jy;
    private Command1 jz;
    private Command1 ka;
    static int ep;
    static int eq;
    private long kb;
    public static int er;
    public boolean es = false;
    private int kc = 0;
    private int kd = -1;
    private long ke;
    private int kf = 0;
    private static int kg;
    private static int kh;
    private static int ki;
    private static int kj;
    private static int kk;
    private static int kl;
    private static int km;
    private static int kn;
    private static int ko;
    private static int kp;
    private static int kq;
    private static int kr;
    private static int ks;
    private static int kt;
    private static int ku;
    private static int kv;
    private static int kw;
    private static int[] kx;
    private static int[] ky;
    private static int kz;
    private static int la;
    private static int lb;
    private static String[] lc;
    private static int[] ld;
    private static int[] le;
    private static int[] lf;
    private static int[] lg;
    private static int[] lh;
    private static int[] li;
    private static int[] lj;
    private static int[] lk;
    private static int[] ll;
    private static int[] lm;
    private static int[] ln;
    private static Image[] lo;
    private static int lp;
    private static int lq;
    private static int lr;
    private static int ls;
    private static int lt;
    private static int lu;
    private static int lv;
    private static int lw;
    private static int lx;
    private static int ly;
    private static int lz;
    private static Image[] ma;
    public static int et;
    public static int eu;
    private int mb = 0;
    private String[] mc = null;
    private String[] md = null;
    private int me = 0;
    private Command1 mf;
    private Command1 mg;
    private Command1 mh;
    private Command1 mi;
    private Command1 mj;
    private Command1 mk;
    private Command1 ml;
    private Command1 mm;
    private Command1 mn;
    private Command1 mo;
    private Command1 mp;
    private Command1 mq;
    private Command1 mr;
    private Command1 ms;
    private Command1 mt;
    private Command1 mu;
    private Command1 mv;
    private Command1 mw;
    private Command1 cmdStoreBuy;
    private Command1 cmdStoreView;
    private Command1 mz;
    private Command1 na;
    private Command1 nb;
    private Command1 nc;
    private Command1 nd;
    private Command1 ne;
    private Command1 nf;
    private Command1 ng;
    private Command1 nh;
    private Command1 ni;
    private Command1 nj;
    private Command1 nk;
    private Command1 nl;
    private Command1 nm;
    private Command1 nn;
    private Command1 no;
    private Command1 np;
    private Command1 nq;
    private String nr;
    private String ns;
    private static int nt;
    private static int nu;
    public static int ev;
    public static int ew;
    private static int nv;
    private static int nw;
    private static int nx;
    private static int ny;
    private static int nz;
    private static int oa;
    private int ob = 0;
    private int[] oc = new int[]{0, 0, 0, 0, 600841, 600841, 667658, 667658, 3346944, 3346688, 4199680, 5052928, 3276851, 3932211, 4587571, 5046280, 6684682, 3359744};
    private int[][] od = new int[][]{{18687, 16869, 15052, 13235, 11161, 9344}, {45824, 39168, 32768, 26112, 19712, 13056}, {16744192, 15037184, 13395456, 11753728, 10046464, 8404992}, {13500671, 12058853, 10682572, 9371827, 7995545, 6684800}, {16711705, 15007767, 13369364, 11730962, 10027023, 8388621}};
    private int[] oe = new int[]{2, 1, 1, 1, 1, 1};
    public static int ex;
    public static EffectCharPaint ey;
    private static int of;
    private static int og;
    private static int inforW;
    private static int inforH;
    public Command1 ez;
    private Command1 oj;
    private Command1 ok;
    private Command1 ol;
    private Command1 om;
    private Command1 on;
    private Command1 oo;
    private Command1 op;
    private int oq;
    private int or;
    private String os;
    private long ot;
    private static long ou;
    private static int ov;
    private static int[] ow;
    private static int[] ox;
    public static int fa;
    public static int fb;
    public static int fc;
    private short oy;
    private short oz;
    private short pa;
    private String pb;
    private String pc;
    private String pd;
    private String pe;
    private String pf;
    private long pg;
    private boolean ph;
    public static byte fd;
    private mFont pi;
    private byte[] pj;
    private byte pk;
    private MyVector pl;
    private int pm;
    private int pn;
    private int po;
    private int pp;
    private int pq;
    private int pr;
    private int ps;
    private int pt;
    private int pu;
    private int pv;
    private int pw;
    private int px;
    private int py;
    private int pz;
    private int qa;
    private int qb;
    private String qc;
    private int[][] qd;
    public static boolean fe;
    private static InfoDlg qe;
    public static boolean ff;
    public String[] fg = new String[]{"LEFT", "UP", "RIGHT"};
    protected int[] fh = new int[600];
    private static boolean isPaintTrade;
    private static MyVector qg;
    public static int fi;
    public static boolean fj;
    private static long qh;
    private static int indextabTrangbi = 0;

    public static void init() {
        vMobSoul = new MyVector();
        vClan = new MyVector();
        vParty = new MyVector();
        vPtMap = new MyVector();
        vFriend = new MyVector();
        vList = new MyVector();
        vFriendWait = new MyVector();
        vEnemies = new MyVector();
        vCharInMap = new MyVector();
        vItemMap = new MyVector();
        vMobAttack = new MyVector();
        vSet = new MyVector();
        vMob = new MyVector();
        vNpc = new MyVector();
        gi = 28;
        indexTitle = 0;
        indexSelect = 0;
        indexRow = -1;
        indexMenu = 0;
        an = -1;
        scrInfo = new Scroll();
        aq = new Scroll();
        qe = new InfoDlg();
        fe = true;
        gp = false;
        gq = false;
        cb = true;
        cc = false;
        gs = false;
        isPaintAuctionSale = false;
        isPaintAlert = false;
        isPaintTask = false;
        isPaintTeam = false;
        isPaintFindTeam = false;
        isPaintFriend = false;
        isPaintList = false;
        isPaintEnemies = false;
        isPaintItemInfo = false;
        gy = false;
        isPaintInfoMe = false;
        isPaintStore = false;
        isPaintEliteShop = false;
        isPaintNonNam = false;
        isPaintNonNu = false;
        isPaintAoNam = false;
        isPaintAoNu = false;
        isPaintGangTayNam = false;
        isPaintGangTayNu = false;
        isPaintQuanNam = false;
        isPaintQuanNu = false;
        isPaintGiayNam = false;
        isPaintGiayNu = false;
        isPaintLien = false;
        isPaintNhan = false;
        isPaintNgocBoi = false;
        isPaintPhu = false;
        isPaintWeapon = false;
        isPaintStack = false;
        isPaintStackLock = false;
        isPaintGrocery = false;
        isPaintGroceryLock = false;
        isPaintUpGrade = false;
        isPaintConvert = false;
        hw = false;
        isPaintUpPearl = false;
        isPaintBox = false;
        isPaintTrade = false;
        isPaintSplit = false;
        isPaintCharInMap = false;
        isPaintLuyenNgoc = false;
        ib = false;
        isPaintAuto = false;
        isPaintMessage = false;
        isPaintClan = false;
        id = false;
        isPaintLuckySpin = false;
        isPaintAuctionBuy = false;
        isPaintLucky_Draw = false;
        isPaintGotNgoc = false;
        ip = new int[]{0, 5000, 40000, 135000, 320000, 625000, 1080000, 1715000, 2560000, 3645000, 5000000};
        jp = 0;
        dz = 0;
        ef = new MyVector();
        eg = new MyVector();
        eh = new MyVector();
        en = false;
        eo = false;
        GameCanvas.aw = GameCanvas.loadImage("/plus12.png");
        ju = GameCanvas.loadImage("/trung1.png");
        jo = GameCanvas.loadImage("/u/select.png");
        dp = GameCanvas.loadImage("/hd/tf.png");
        ei = GameCanvas.loadImage("/eff/g132.png");
        ej = GameCanvas.loadImage("/eff/g10.png");
        ek = GameCanvas.loadImage("/eff/g6.png");
        el = GameCanvas.loadImage("/eff/g99.png");
        em = GameCanvas.loadImage("/eff/g9.png");
        if (GameCanvas.isTouch) {
            jh = GameCanvas.loadImage("/hd/button.png");
            ji = GameCanvas.loadImage("/hd/button2.png");
            jj = GameCanvas.loadImage("/hd/hpp.png");
            jk = GameCanvas.loadImage("/hd/mpp.png");
            jl = GameCanvas.loadImage("/hd/right.png");
            jm = GameCanvas.loadImage("/hd/right2.png");
            jn = GameCanvas.loadImage("/hd/skill.png");
            dr = GameCanvas.loadImage("/hd/btnl.png");
            ds = GameCanvas.loadImage("/hd/btnlf.png");
            jc = GameCanvas.loadImage("/hd/arrow.png");
            jd = GameCanvas.loadImage("/hd/arrow2.png");
            je = GameCanvas.loadImage("/hd/chat.png");
            jg = GameCanvas.loadImage("/hd/focus.png");
            jf = GameCanvas.loadImage("/hd/menu.png");
            ja = GameCanvas.loadImage("/hd/topbar.png");
            jb = GameCanvas.loadImage("/hd/transparent.png");
            dq = GameCanvas.loadImage("/hd/mapborder.png");
        }

        dt = GameCanvas.loadImage("/hd/mat.png");
        du = GameCanvas.loadImage("/hd/lua.png");
        byte[] var0 = mResources.b("dataVersion");
        byte[] var1 = mResources.b("mapVersion");
        byte[] var2 = mResources.b("skillVersion");
        byte[] var3 = mResources.b("itemVersion");
        if (var0 != null) {
            dh = var0[0];
        }

        if (var1 != null) {
            di = var1[0];
        }

        if (var2 != null) {
            dj = var2[0];
        }

        if (var3 != null) {
            dk = var3[0];
        }

        keySkill = new Skill[3];
        onScreenSkill = new Skill[5];
        eq = 0;
        ld = new int[5];
        le = new int[5];
        lf = new int[5];
        lg = new int[5];
        lh = new int[5];
        lc = new String[5];
        li = new int[8];

        for (int var4 = 0; var4 < 5; ++var4) {
            lh[var4] = -1;
        }

        ev = 140;
        ew = 160;
        nz = 6;
        ex = 0;
        fd = 0;
        qg = new MyVector();
        fi = 1;
        fj = true;
        qh = 0L;
    }

    public static long getMaxExp(int var0) {
        long var1 = 0L;

        for (int var3 = 0; var3 <= var0; ++var3) {
            var1 += exps[var3];
        }

        return var1;
    }

    public static void resetAllvector() {
        vCharInMap.removeAllElements();
        vItemMap.removeAllElements();
        vMobSoul.removeAllElements();
        Effect2.vEffect2.removeAllElements();
        Effect2.vAnimateEffect.removeAllElements();
        Effect2.vEffect2Outside.removeAllElements();
        vMobAttack.removeAllElements();
        vSet.removeAllElements();
        vMob.removeAllElements();
        Char.getMyChar().fb.removeAllElements();
    }

    public static void loadSkillShortcut() {
        Service.gI().loadRMS("KSkill");
        Service.gI().loadRMS("OSkill");
        Service.gI().loadRMS("CSkill");
    }

    public static void loadSkillShortcutNhanban() {
        Service.gI().loadRMS("KSkill");
        Service.gI().loadRMS("OSkill");
        Service.gI().loadRMS("CSkill");
    }

    public static void onOSkill(byte[] var0) {
        onScreenSkill = new Skill[5];
        int var1;
        if (var0 == null) {
            for (var1 = 0; var1 < onScreenSkill.length && var1 < Char.getMyChar().vSkillFight.size(); ++var1) {
                Skill var2 = (Skill) Char.getMyChar().vSkillFight.elementAt(var1);
                onScreenSkill[var1] = var2;
            }

            saveOnScreenSkillToRMS();
        } else {
            for (var1 = 0; var1 < var0.length; ++var1) {
                for (int var4 = 0; var4 < Char.getMyChar().vSkillFight.size(); ++var4) {
                    Skill var3;
                    if ((var3 = (Skill) Char.getMyChar().vSkillFight.elementAt(var4)).template.id == var0[var1]) {
                        onScreenSkill[var1] = var3;
                        break;
                    }
                }
            }
        }

    }

    public static void onKSkill(byte[] var0) {
        keySkill = new Skill[3];
        int var1;
        if (var0 == null) {
            for (var1 = 0; var1 < keySkill.length && var1 < Char.getMyChar().vSkillFight.size(); ++var1) {
                Skill var2 = (Skill) Char.getMyChar().vSkillFight.elementAt(var1);
                keySkill[var1] = var2;
            }

            saveKeySkillToRMS();
        } else {
            for (var1 = 0; var1 < var0.length; ++var1) {
                for (int var4 = 0; var4 < Char.getMyChar().vSkillFight.size(); ++var4) {
                    Skill var3;
                    if ((var3 = (Skill) Char.getMyChar().vSkillFight.elementAt(var4)).template.id == var0[var1]) {
                        keySkill[var1] = var3;
                        break;
                    }
                }
            }
        }

    }

    public static void onCSkill(byte[] var0) {
        if (var0 != null && var0.length != 0) {
            for (int var1 = 0; var1 < Char.getMyChar().vSkillFight.size(); ++var1) {
                Skill var2;
                if ((var2 = (Skill) Char.getMyChar().vSkillFight.elementAt(var1)).template.id == var0[0]) {
                    Char.getMyChar().myskill = var2;
                    Char.getMyChar().ga = var2;
                    break;
                }
            }
        } else if (Char.getMyChar().vSkillFight.size() > 0) {
            Char.getMyChar().myskill = (Skill) Char.getMyChar().vSkillFight.elementAt(0);
        }

        if (Char.getMyChar().myskill != null) {
            Service.gI().selectSkill(Char.getMyChar().myskill.template.id);
            Char.getMyChar();
        }

    }

    private static void doSetOnScreenSkill(SkillTemplate var0) {
        Skill var1 = Char.getMyChar().a(var0);
        MyVector var2 = new MyVector();

        for (int var3 = 0; var3 < 5; ++var3) {
            boolean var4 = false;
            if (onScreenSkill[var3] == null) {
                var4 = true;
            }

            Object[] var5;
            (var5 = new Object[2])[0] = var1;
            var5[1] = String.valueOf(var3);
            var2.addElement(new Command1(mResources.fn + " " + (var3 + 1), 11120, var5));
            if (var4) {
                break;
            }
        }

        GameCanvas.menu.startAt(var2);
    }

    private static void doSetKeySkill(SkillTemplate var0) {
        Skill var1 = Char.getMyChar().a(var0);
        String[] var2 = TField.h ? mResources.fo : mResources.fp;
        MyVector var3 = new MyVector();

        for (int var4 = 0; var4 < 3; ++var4) {
            Object[] var5;
            (var5 = new Object[2])[0] = var1;
            var5[1] = String.valueOf(var4);
            var3.addElement(new Command1(var2[var4], 11121, var5));
        }

        GameCanvas.menu.startAt(var3);
    }

    private static void saveOnScreenSkillToRMS() {
        byte[] var0 = new byte[onScreenSkill.length];

        for (int var1 = 0; var1 < onScreenSkill.length; ++var1) {
            if (onScreenSkill[var1] == null) {
                var0[var1] = -1;
            } else {
                var0[var1] = onScreenSkill[var1].template.id;
            }
        }

        if (Char.getMyChar().isHuman) {
            Service.gI().saveRms((String) "OSkill", (byte[]) var0, (byte) 0);
        } else {
            Service.gI().saveRms((String) "OSkill", (byte[]) var0, (byte) 1);
        }

    }

    private static void saveKeySkillToRMS() {
        byte[] var0 = new byte[keySkill.length];

        for (int var1 = 0; var1 < keySkill.length; ++var1) {
            if (keySkill[var1] == null) {
                var0[var1] = -1;
            } else {
                var0[var1] = keySkill[var1].template.id;
            }
        }

        if (Char.getMyChar().isHuman) {
            Service.gI().saveRms((String) "KSkill", (byte[]) var0, (byte) 0);
        } else {
            Service.gI().saveRms((String) "KSkill", (byte[]) var0, (byte) 1);
        }

    }

    public static void addSkillShortcut(Skill var0) {
        if (var0.template.type != 0) {
            int var1;
            for (var1 = 0; var1 < onScreenSkill.length; ++var1) {
                if (onScreenSkill[var1] == null) {
                    onScreenSkill[var1] = var0;
                    break;
                }
            }

            for (var1 = 0; var1 < keySkill.length; ++var1) {
                if (keySkill[var1] == null) {
                    keySkill[var1] = var0;
                    break;
                }
            }

            if (Char.getMyChar().myskill == null) {
                Char.getMyChar().myskill = var0;
            }

            saveKeySkillToRMS();
            saveOnScreenSkillToRMS();
        }

    }

    public static boolean h() {
        for (int var0 = Char.getMyChar().arrItemBag.length - 1; var0 >= 0; --var0) {
            if (Char.getMyChar().arrItemBag[var0] == null) {
                return false;
            }
        }

        return true;
    }

    public static void createMenu(String[] var0, Npc var1) {
        MyVector var2 = new MyVector();

        for (int var3 = 0; var3 < var0.length; ++var3) {
            var2.addElement(new Command1(var0[var3], 11057, var1));
        }

        GameCanvas.menu.startAt(var2);
    }

    public final void doBag() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 0;
        this.doMiniMenuInforMe();
    }

    private void doskill() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 1;
        this.doMiniMenuInforMe();
    }

    private void doTiemnangMe() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 2;
        this.doMiniMenuInforMe();
    }

    private void doInfo() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 3;
        this.doMiniMenuInforMe();
    }

    private void doTrangbi() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 4;
        this.doMiniMenuInforMe();
    }

    private void doThucuoi() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 5;
        this.doMiniMenuInforMe();
    }

    public static void readPart() {
        DataInputStream var0 = null;

        try {
            short var1;
            parts = new Part[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(mResources.b("nj_part")))).readShort()];

            for (int var2 = 0; var2 < var1; ++var2) {
                int var3 = var0.readByte();
                parts[var2] = new Part(var3);

                for (var3 = 0; var3 < parts[var2].a.length; ++var3) {
                    parts[var2].a[var3] = new PartImage();
                    parts[var2].a[var3].id = var0.readShort();
                    parts[var2].a[var3].dx = var0.readByte();
                    parts[var2].a[var3].dy = var0.readByte();
                }
            }
        } catch (Exception var12) {
            var12.printStackTrace();
        } finally {
            try {
                var0.close();
            } catch (IOException var11) {
                var11.printStackTrace();
            }

        }

    }

    public static void readEfect() {
        DataInputStream var0 = null;

        try {
            short var1;
            v = new EffectCharPaint[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(mResources.b("nj_effect")))).readShort()];

            for (int var2 = 0; var2 < var1; ++var2) {
                v[var2] = new EffectCharPaint();
                v[var2].idEf = var0.readShort();
                v[var2].arrEfInfo = new EffectInfoPaint[var0.readByte()];

                for (int var3 = 0; var3 < v[var2].arrEfInfo.length; ++var3) {
                    v[var2].arrEfInfo[var3] = new EffectInfoPaint();
                    v[var2].arrEfInfo[var3].idImg = var0.readShort();
                    v[var2].arrEfInfo[var3].dx = var0.readByte();
                    v[var2].arrEfInfo[var3].dy = var0.readByte();
                }
            }
        } catch (Exception var12) {
            var12.printStackTrace();
        } finally {
            try {
                var0.close();
            } catch (IOException var11) {
                var11.printStackTrace();
            }

        }

    }

    public static void readArrow() {
        DataInputStream var0 = null;

        try {
            short var1;
            t = new Arrowpaint[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(mResources.b("nj_arrow")))).readShort()];

            for (int var2 = 0; var2 < var1; ++var2) {
                t[var2] = new Arrowpaint();
                var0.readShort();
                t[var2].imgId[0] = var0.readShort();
                t[var2].imgId[1] = var0.readShort();
                t[var2].imgId[2] = var0.readShort();
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        } finally {
            try {
                var0.close();
            } catch (IOException var10) {
                var10.printStackTrace();
            }

        }

    }

    public static void readSkill() {
        DataInputStream var0 = null;

        try {
            short var1 = (var0 = new DataInputStream(new ByteArrayInputStream(mResources.b("nj_skill")))).readShort();
            int var2 = 0;

            int var3;
            for (var3 = 0; var3 < nClasss.length; ++var3) {
                var2 += nClasss[var3].c.length;
            }

            s = new SkillPaint[var2];

            for (var3 = 0; var3 < var1; ++var3) {
                short var4 = var0.readShort();
                s[var4] = new SkillPaint();
                s[var4].id = var0.readShort();
                var0.readByte();
                s[var4].skillStand = new SkillInfoPaint[var0.readByte()];

                int var5;
                for (var5 = 0; var5 < s[var4].skillStand.length; ++var5) {
                    s[var4].skillStand[var5] = new SkillInfoPaint();
                    s[var4].skillStand[var5].status = var0.readByte();
                    s[var4].skillStand[var5].effS0Id = var0.readShort();
                    s[var4].skillStand[var5].e0dx = var0.readShort();
                    s[var4].skillStand[var5].e0dy = var0.readShort();
                    s[var4].skillStand[var5].effS1Id = var0.readShort();
                    s[var4].skillStand[var5].e1dx = var0.readShort();
                    s[var4].skillStand[var5].e1dy = var0.readShort();
                    s[var4].skillStand[var5].effS2Id = var0.readShort();
                    s[var4].skillStand[var5].e2dx = var0.readShort();
                    s[var4].skillStand[var5].e2dy = var0.readShort();
                    s[var4].skillStand[var5].arrowId = var0.readShort();
                    s[var4].skillStand[var5].adx = var0.readShort();
                    s[var4].skillStand[var5].ady = var0.readShort();
                }

                s[var4].skillfly = new SkillInfoPaint[var0.readByte()];

                for (var5 = 0; var5 < s[var4].skillfly.length; ++var5) {
                    s[var4].skillfly[var5] = new SkillInfoPaint();
                    s[var4].skillfly[var5].status = var0.readByte();
                    s[var4].skillfly[var5].effS0Id = var0.readShort();
                    s[var4].skillfly[var5].e0dx = var0.readShort();
                    s[var4].skillfly[var5].e0dy = var0.readShort();
                    s[var4].skillfly[var5].effS1Id = var0.readShort();
                    s[var4].skillfly[var5].e1dx = var0.readShort();
                    s[var4].skillfly[var5].e1dy = var0.readShort();
                    s[var4].skillfly[var5].effS2Id = var0.readShort();
                    s[var4].skillfly[var5].e2dx = var0.readShort();
                    s[var4].skillfly[var5].e2dy = var0.readShort();
                    s[var4].skillfly[var5].arrowId = var0.readShort();
                    s[var4].skillfly[var5].adx = var0.readShort();
                    s[var4].skillfly[var5].ady = var0.readShort();
                }
            }
        } catch (Exception var14) {
            var14.printStackTrace();
        } finally {
            try {
                var0.close();
            } catch (IOException var13) {
                var13.printStackTrace();
            }

        }

    }

    public static void getLevelExp(long var0) {
        long var2 = var0;

        int var4;
        for (var4 = 0; var4 < exps.length && var2 >= exps[var4]; ++var4) {
            var2 -= exps[var4];
        }

        long[] var5 = new long[]{(long) var4, var2};
        Char.getMyChar().clevel = (int) var5[0];
        Char.getMyChar().ae = var5[1];
    }

    public static GameScr gI() {
        if (instance == null) {
            instance = new GameScr();
        }

        return instance;
    }

    public static void o() {
        instance = null;
        arrItemTradeOrder = null;
        arrItemTradeMe = null;
        arrItemSplit = null;
        arrItemUpGrade = null;
        arrItemUpPeal = null;
        itemSplit = null;
        itemUpGrade = null;
    }

    public final void p() {
        if (lo == null) {
            lo = new Image[3];

            for (int var1 = 0; var1 < 3; ++var1) {
                lo[var1] = GameCanvas.loadImage("/e/sp" + var1 + ".png");
            }
        }

        lj = new int[2];
        lk = new int[2];
        ll = new int[2];
        lm = new int[2];
        ln = new int[2];
        ll[0] = ll[1] = -1;
        this.bu();
        Res.init();
    }

    public GameScr() {
        this.ez = new Command1(mResources.nn[0], 11038);
        this.oq = 30;
        this.or = 0;
        this.os = "";
        this.pi = mFont.tahoma_7b_yellow;
        this.pj = new byte[]{-1, -1, -1, -1, -1, -1};
        this.pk = 0;
        this.pl = new MyVector();
        this.qc = "";
        this.qd = new int[][]{new int[2], {200, 10}, {500, 20}, {1000, 50}, {2000, 100}, {5000, 200}, {10000, 500}, {20000, 1000}, {50000, 2000}, {100000, 5000}, {100000, 10000}};
        if (GameCanvas.z == 128 || GameCanvas.aa <= 208) {
            gi = 20;
        }

        this.ka = new Command1(mResources.dm, 11002);
        this.jz = new Command1(mResources.hi, 11003);
        this.nq = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11004);
        this.np = new Command1(mResources.cc, 11005);
        this.jy = new Command1(mResources.hi, 11006);
        this.no = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11007);
        this.nn = new Command1(mResources.cc, 11008);
        this.nm = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11009);
        this.nl = new Command1(mResources.cc, 11010);
        this.nk = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11011);
        this.nj = new Command1(mResources.cc, 11012);
        this.ni = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11013);
        this.nh = new Command1(mResources.cc, 11014);
        this.ng = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11015);
        this.nf = new Command1(mResources.cc, 11016);
        this.nc = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11017);
        this.ne = new Command1(GameCanvas.isTouch ? mResources.bg : "", 13001);
        this.nb = new Command1(mResources.cc, 11018);
        this.nd = new Command1(mResources.cc, 13002);
        this.cmdStoreView = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11019);
        this.cmdStoreBuy = new Command1(mResources.cc, 11020);
        this.mv = new Command1(mResources.cc, 14022);
        this.mw = new Command1(GameCanvas.isTouch ? mResources.bg : "", 14023);
        this.na = new Command1(GameCanvas.isTouch ? mResources.bg : "", 14018);
        this.mz = new Command1(mResources.cc, 14019);
        this.mu = new Command1(mResources.aq, 11021);
        this.op = new Command1(mResources.dz, 11022);
        this.oo = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11023);
        this.om = new Command1(mResources.bo, 11024);
        this.on = new Command1(mResources.bp, 110244);
        this.ol = new Command1(mResources.aq, 11025);
        this.oj = new Command1(mResources.bm, 11026);
        this.ok = new Command1(mResources.bn, 110221);
        this.mt = new Command1(mResources.dz, 11027);
        this.ms = new Command1(mResources.dz, 11028);
        this.mr = new Command1(mResources.dz, 11029);
        this.mq = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11030);
        new Command1(mResources.ep, 11021);
        this.jx = new Command1(mResources.aj, 11000);
        this.ge = new Command1("Focus", 11001);
        this.mg = new Command1(mResources.hb, 11032);
        this.mh = new Command1(mResources.dm, 11033);
        this.ml = new Command1(mResources.bt, 11034);
        this.mm = new Command1(mResources.bt, 14014);
        this.mn = new Command1(mResources.bt, 11035);
        this.mo = new Command1(mResources.bw, 11036);
        this.mp = new Command1(mResources.bt, 11037);
        this.mi = new Command1(mResources.bt, 339);
        this.mj = new Command1(mResources.bt, 340);
        this.mk = new Command1(mResources.bt, 343);
        this.mf = new Command1(mResources.bt, 402);
        new Command1("240", 110381);
        new Command1("360", 1103911);
        new Command1("Toàn Map", 110401);
        if (GameCanvas.isTouch && GameCanvas.g) {
            this.jx.x = gW - 135;
            this.jx.y = 6;
            this.jx.img = jf;
            this.ge.x = gW;
            this.ge.y = gH;
            if (GameCanvas.h) {
                this.jx.x = gW / 2 - 38;
                this.jx.y = gH - 34;
            }
        }

        this.ge.img = GameCanvas.loadImage("/u/fc.png");
        super.left = this.jx;
        super.right = this.ge;
    }

    private void doCloseItemInfo() {
        if (!GameCanvas.isTouch || GameCanvas.isTouch && GameCanvas.z < 320 || isPaintInfoMe && indexMenu > 0 || isPaintClan && indexMenu == 0) {
            isPaintItemInfo = false;
        }

        isViewNext = false;
        if (isPaintUI()) {
            this.updateCommandForUI();
            super.right = this.mu;
        } else {
            this.aj();
        }

    }

    private void bb() {
        if (indexTitle > 0 && indexTitle <= 4 || GameCanvas.isTouch) {
            GameCanvas.inputDlg.a(mResources.ke, this.jy, 1);
        }

    }

    private void bc() {
        if (indexTitle > 0 && indexTitle <= 4) {
            GameCanvas.inputDlg.a(mResources.ke, this.jz, 1);
        }

    }

    private void bd() {
        if (isPaintFriend) {
            GameCanvas.inputDlg.a(mResources.em, this.ka, 0);
        }

    }

    private void doMiniMenuInforMe() {
        isPaintInfoMe = true;
        setPopupSize(175, 200);
        this.aj();
        if (indexMenu == 3 && currentCharViewInfo.charID == Char.getMyChar().charID) {
            Service.gI().viewInfo(currentCharViewInfo.cName);
        }

        if (indexMenu == 5) {
            this.js = new int[5];
            this.jt = new int[5];
            nt = eu + 5;
            nu = et + 35;
            this.js[0] = nt + 5;
            this.jt[0] = nu + 35;
            this.js[1] = nt + 5;
            this.jt[1] = nu + 70;
            this.js[2] = nt + 131;
            this.jt[2] = nu + 35;
            this.js[3] = nt + 131;
            this.jt[3] = nu + 70;
            this.js[4] = this.js[0] + gi + 7;
            this.jt[4] = this.jt[0] - 5;
        }

        super.right = new Command1(mResources.ep, 11060);
    }

    private void bf() {
        aq.clear();
        scrInfo.clear();
        isViewNext = false;
        this.fz = new Command1(mResources.fr[0], 1100011);
        this.ga = new Command1(mResources.fr[1], 1100012);
        this.gb = new Command1(mResources.fr[2], 1100013);
        this.gd = new Command1(mResources.fr[3], 1100014);
        this.gc = new Command1(mResources.fr[4], 1100015);
        MyVector var1;
        (var1 = new MyVector()).addElement(this.fz);
        var1.addElement(this.ga);
        var1.addElement(this.gb);
        var1.addElement(this.gd);
        var1.addElement(this.gc);
        var1.addElement(new Command1(mResources.fr[5], 1100016));
        GameCanvas.menu.startAt(var1);
    }

    private static void bg() {
        MyVector var0 = new MyVector();
        if (NSOT_MOB.b != null) {
            var0.addElement(new Command1("Tắt Auto", 1100073));
        } else {
            if (TileMap.mapID == 1 || TileMap.mapID == 27 || TileMap.mapID == 72) {
                var0.addElement(new Command1("Auto NV", 1100074));
            }

            var0.addElement(new Command1("Tàn sát", 1100069));
            var0.addElement(new Command1("Auto Tà Thú", 1100075));
        }

        var0.addElement(new Command1("NPC", 1100071));
        var0.addElement(new Command1("Item Nhặt", 1100076));
        var0.addElement(new Command1(NSOT_MOB.k ? "Hút VP" : "Nhặt Xa", 1100080));
        var0.addElement(new Command1(NSOT_MOB.g > 0 ? "KC Nhặt: " + NSOT_MOB.g : "Nhặt Full", 1100081));
        var0.addElement(new Command1(NSOT_MOB.h > 0 ? "KCTS: " + NSOT_MOB.h : "TS Full", 1100082));
        var0.addElement(new Command1("Đánh CVT: " + (NSOT_MOB.l ? "Bật" : "Tắt"), 1100083));
        var0.addElement(new Command1("Đánh CK: " + (NSOT_MOB.p ? "Bật" : "Tắt"), 1100089));
        var0.addElement(new Command1("Giữ Lvl: " + (NSOT_MOB.s ? "Bật" : "Tắt"), 1100084));
        var0.addElement(new Command1("SPGame: " + NSOT_MOB.t, 1100087));
        var0.addElement(new Command1("TĐ next map: " + NSOT_MOB.u, 11000877));
        var0.addElement(new Command1(mResources.oa[7], 1100068));
        GameCanvas.menu.startAt(var0);
    }

    private static void bh() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.ob[0], 110002));
        var0.addElement(new Command1(mResources.ob[1], 1100032));
        var0.addElement(new Command1(mResources.ob[2], 1100033));
        var0.addElement(new Command1(mResources.z, 1100034));
        var0.addElement(new Command1(mResources.be, LoginScr.mgI(), 1004, (Object) null));
        GameCanvas.menu.startAt(var0);
    }

    private static void bi() {
        MyVector var0 = new MyVector();
        if (Char.getMyChar().clevel >= 3 && SelectServerScr.b()) {
            var0.addElement(new Command1("Xác thực tài khoản", 1100181));
        }

        var0.addElement(new Command1(mResources.iv[1], 110001));
        var0.addElement(new Command1("AUTO NST", 110021));
        var0.addElement(new Command1(mResources.iv[3], 110003));
        var0.addElement(new Command1(mResources.iv[6], 110006));
        var0.addElement(new Command1(mResources.iv[14], 110014));
        var0.addElement(new Command1("Tự sát", 110020));
        var0.addElement(new Command1(mResources.iv[16], 110016));
        var0.addElement(new Command1(mResources.iv[18], 110018));
        var0.addElement(new Command1(mResources.iv[4], 110004));
        GameCanvas.menu.startAt(var0);
    }

    private void bj() {
        this.resetButton();
        isPaintTask = true;
        indexMenu = this.gf;
        this.iw = true;
        setPopupSize(175, 200);
        super.right = this.mu;
        super.left = new Command1(mResources.iv[2], 110002);
        super.center = new Command1(mResources.fl, 110019);
    }

    private void bk() {
        this.resetButton();
        isPaintFindTeam = true;
        this.iw = true;
        setPopupSize(175, 200);
        super.right = this.mu;
        Service.gI().openFindParty();
        this.s();
    }

    private void bl() {
        this.resetButton();
        if (this.dd > 0) {
            indexRow = Char.d(this.dd);
        } else {
            indexRow = 0;
            this.dd = -1;
        }

        isPaintCharInMap = true;
        this.iw = true;
        setPopupSize(175, 200);
        super.right = this.mu;
    }

    private void bm() {
        this.resetButton();
        isPaintTeam = true;
        this.iw = true;
        setPopupSize(175, 200);
        super.right = this.mu;
        this.t();
    }

    public final void q() {
        this.resetButton();
        gs = true;
        this.iw = true;
        setPopupSize(175, 200);
        super.right = this.mu;
        super.left = super.center = null;
        indexRow = 0;
    }

    public final void r() {
        this.resetButton();
        isPaintList = true;
        this.iw = true;
        setPopupSize(175, 200);
        super.right = this.mu;
        super.left = super.center = null;
        indexRow = 0;
    }

    private void bn() {
        this.resetButton();
        isPaintFriend = true;
        this.iw = true;
        setPopupSize(175, 200);
        super.right = this.mu;
        super.left = new Command1(mResources.doa, 11044);
        super.center = null;
        indexRow = 0;
        Service.gI().requestFriend();
    }

    private void bo() {
        this.resetButton();
        isPaintEnemies = true;
        this.iw = true;
        setPopupSize(175, 200);
        super.right = this.mu;
        super.left = new Command1(mResources.doa, 14017);
        super.center = null;
        indexRow = 0;
        Service.gI().requestEnemies();
    }

    public final void s() {
        if (isPaintFindTeam) {
            super.left = super.center = null;
            super.left = new Command1(mResources.aj, 11045);
            Party var1;
            if (vPtMap.size() > 0 && indexRow >= 0 && indexRow < vPtMap.size() && (var1 = (Party) vPtMap.elementAt(indexRow)) != null && !Char.getMyChar().cName.equals(var1.name)) {
                super.center = new Command1(mResources.dz, 11046);
            }
        }

    }

    public final void t() {
        if (isPaintTeam) {
            super.left = super.center = null;
            indexRow = 0;
            if (vParty.size() == 0) {
                super.center = null;
                super.left = new Command1(mResources.aj, 11047);
                return;
            }

            Party var1;
            if ((var1 = (Party) vParty.firstElement()).charId == Char.getMyChar().charID) {
                super.left = new Command1(mResources.nr, 11070, var1);
                return;
            }

            super.left = new Command1(mResources.nq, 11071);
        }

    }

    private static void bp() {
        if (TileMap.typeMap != 1) {
            MapScr.gI().switchToMe();
        }

    }

    public final void a(Message var1) {
        InfoDlg.hide();

        try {
            this.cx = new int[var1.reader().readByte()];
            this.ir = new int[this.cx.length];

            for (int var2 = 0; var2 < this.cx.length; ++var2) {
                this.cx[var2] = var1.reader().readByte();
                this.ir[var2] = var1.reader().readByte();
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        ib = true;
        indexSelect = TileMap.zoneID;
        setPopupSize(175, 200);
        super.left = new Command1(mResources.dz, 11067);
        super.center = new Command1("", 11067);
        super.right = this.mu;
    }

    public final void u() {
        try {
            this.resetButton();
            this.dw = "";
            this.cy = 0;
            this.cy = this.cz = this.da = this.db = 0;
            isPaintLuyenNgoc = true;
            arrItemTradeMe = new Item[12];
            arrItemTradeOrder = new Item[12];
            indexMenu = 0;
            setPopupSize(175, 200);
            super.right = this.mu;
        } catch (Exception var2) {
        }

    }

    public static final void a(boolean var0) {
        gW = GameCanvas.z;
        if (GameCanvas.isTouch && (!GameCanvas.isTouch || GameCanvas.g)) {
            gH3 = 8;
        } else {
            gH3 = 36;
            if (GameCanvas.isTouch) {
                gH3 += 3;
            }
        }

        gH = GameCanvas.aa - gH3 - 20;
        if (var0) {
            gH = GameCanvas.aa;
        }

        if (GameCanvas.isTouch && GameCanvas.g) {
            gH = GameCanvas.aa;
        }

        if (GameCanvas.aa == 160) {
            gH = 150;
        }

        lq = gW;
        if (GameCanvas.z > 176) {
            lq -= 50;
        }

        lp = GameCanvas.aa - Paint.hTab - gH3;
        int var1 = GameCanvas.aa;
        gW2 = gW >> 1;
        gW3 = gH >> 1;
        gH34 = 2 * gH / 3;
        gH23 = gW / 6;
        gssw = gW / TileMap.i + 2;
        gssh = gH / TileMap.i + 2;
        if (gW % 24 != 0) {
            ++gssw;
        }

        cmy = (TileMap.a - 1) * TileMap.i - gW;
        cmdx = (TileMap.b - 1) * TileMap.i - gH;
        if (GameCanvas.isTouch && GameCanvas.g) {
            cmdx += 60;
        }

        gW23 = gH6 = Char.getMyChar().cx - gW2 + gH23 * Char.getMyChar().cdir;
        gH2 = cmx = Char.getMyChar().cy - gH34;
        if (gW23 < 24) {
            gW23 = 24;
        }

        if (gW23 > cmy) {
            gW23 = cmy;
        }

        if (gH2 < 0) {
            gH2 = 0;
        }

        if (gH2 > cmdx) {
            gH2 = cmdx;
        }

        if ((cmdy = gW23 / TileMap.i - 1) < 0) {
            cmdy = 0;
        }

        cmvx = gH2 / TileMap.i;
        cmvy = cmdy + gssw;
        p = cmvx + gssh;
        if (cmvx < 0) {
            cmvx = 0;
        }

        if (p > TileMap.b - 1) {
            p = TileMap.b - 1;
        }

        if ((TileMap.ad = cmvy - cmdy << 2) > TileMap.a) {
            TileMap.ad = TileMap.a;
        }

        if ((TileMap.ae = p - cmvx << 2) > TileMap.b) {
            TileMap.ae = TileMap.b;
        }

        if ((TileMap.z = (Char.getMyChar().cx - 2 * gW) / TileMap.i) < 0) {
            TileMap.z = 0;
        }

        if ((TileMap.aa = TileMap.z + TileMap.ad) > TileMap.a) {
            TileMap.aa = TileMap.a;
        }

        if ((TileMap.ab = (Char.getMyChar().cy - 2 * gH) / TileMap.i) < 0) {
            TileMap.ab = 0;
        }

        if ((TileMap.ac = TileMap.ab + TileMap.ae) > TileMap.b) {
            TileMap.ac = TileMap.b;
        }

        ChatTextField.gI().parentScreen = instance;
        ChatTextField.gI().tfChat.b = GameCanvas.aa - 35 - ChatTextField.gI().tfChat.d;
        if (GameCanvas.isTouch && (!GameCanvas.isTouch || GameCanvas.g)) {
            TileMap.a(GameCanvas.z - 60, 0, 60, 42);
        } else {
            TileMap.a(GameCanvas.z - 51, lp - 4, 50, 40);
        }

        if (GameCanvas.isTouch) {
            kg = gH - 88;
            kj = gW - 100;
            kk = 2;
            if (GameCanvas.h) {
                kj = gW / 2 - 2;
                kk = kg + 50;
            }

            kh = 1;
            ki = kg + 50;
            kl = 42;
            km = kg + 50;
            kn = gW - 50;
            ko = kg + 35;
            kp = 22;
            kq = kg + 19;
            kr = gW - 74;
            ks = kg + 13;
            kt = gW - 85;
            ku = kg + 50;
            kv = gW - 37;
            kw = kg - 1;
            if (GameCanvas.z >= 450) {
                kq -= 15;
                kp += 28;
                kl += 45;
                kh += 10;
                kw -= 12;
                ks -= 7;
                kn -= 18;
                kv -= 10;
                kr -= 17;
                kt -= 24;
            } else if (GameCanvas.z >= 360) {
                kq -= 5;
                kp += 6;
                kl += 12;
                kw -= 2;
                ks -= 2;
                kr -= 2;
                kt -= 2;
            }
        }

        kx = new int[onScreenSkill.length];
        ky = new int[onScreenSkill.length];
        int var2;
        if (GameCanvas.isTouch) {
            if (GameCanvas.h) {
                kz = 2;
                la = 55;
                lb = 5;

                for (var2 = 0; var2 < kx.length; ++var2) {
                    kx[var2] = var2 * (25 + lb);
                    ky[var2] = la;
                }
            } else {
                if (GameCanvas.z <= 320) {
                    kz = gW2 - onScreenSkill.length * 25 / 2 - 15;
                } else {
                    kz = gW2 - onScreenSkill.length * 25 / 2;
                }

                la = kg + 58;
                lb = 5;

                for (var2 = 0; var2 < kx.length; ++var2) {
                    kx[var2] = var2 * (25 + lb);
                    ky[var2] = la;
                }
            }
        } else {
            kz = 0;

            for (var2 = 0; var2 < ky.length; ++var2) {
                kx[var2] = 2;
                ky[var2] = 2 + var2 * 25;
            }
        }

    }

    private static boolean bq() {
        if (Char.getMyChar().myskill != null && Char.getMyChar().cMP < Char.getMyChar().myskill.manaUse) {
            InfoMe.addInfo(mResources.jm);
            return false;
        } else if (Char.getMyChar().myskill != null && (Char.getMyChar().myskill.template.maxPoint <= 0 || Char.getMyChar().myskill.point != 0)) {
            if (Char.getMyChar().arrItemBody[1] == null) {
                GameCanvas.a(mResources.nb);
                return false;
            } else {
                return true;
            }
        } else {
            GameCanvas.a(mResources.na);
            return false;
        }
    }

    public final void resetButton() {
        if (Char.getMyChar().arrItemBag != null) {
            int var1;
            int var2;
            if ((isPaintUpPearl || isPaintLuyenThach) && arrItemUpPeal != null) {
                for (var2 = 0; var2 < arrItemUpPeal.length; ++var2) {
                    if (arrItemUpPeal[var2] != null) {
                        var1 = arrItemUpPeal[var2].indexUI;
                        Char.getMyChar().arrItemBag[var1] = arrItemUpPeal[var2];
                        arrItemUpPeal[var2] = null;
                    }
                }
            }

            if (isPaintUpGrade) {
                if (itemUpGrade != null) {
                    Char.getMyChar().arrItemBag[itemUpGrade.indexUI] = itemUpGrade;
                    itemUpGrade = null;
                }

                if (arrItemUpGrade != null) {
                    for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                        if (arrItemUpGrade[var2] != null) {
                            var1 = arrItemUpGrade[var2].indexUI;
                            Char.getMyChar().arrItemBag[var1] = arrItemUpGrade[var2];
                            arrItemUpGrade[var2] = null;
                        }
                    }
                }
            }

            if (isPaintGiaoDo) {
                if (itemUpGrade != null) {
                    Char.getMyChar().arrItemBag[itemUpGrade.indexUI] = itemUpGrade;
                    itemUpGrade = null;
                }

                if (itemSplit != null) {
                    Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                    itemSplit = null;
                }

                if (arrItemUpGrade != null) {
                    for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                        if (arrItemUpGrade[var2] != null) {
                            var1 = arrItemUpGrade[var2].indexUI;
                            Char.getMyChar().arrItemBag[var1] = arrItemUpGrade[var2];
                            arrItemUpGrade[var2] = null;
                        }
                    }
                }
            }

            if (isPaintGotNgoc && arrItemUpGrade != null) {
                for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                    if (arrItemUpGrade[var2] != null) {
                        var1 = arrItemUpGrade[var2].indexUI;
                        Char.getMyChar().arrItemBag[var1] = arrItemUpGrade[var2];
                        arrItemUpGrade[var2] = null;
                    }
                }
            }

            if (isPaintAuctionSale && itemSell != null) {
                Char.getMyChar().arrItemBag[itemSell.indexUI] = itemSell;
                itemSell = null;
            }

            if (isPaintConvert && arrItemConvert != null) {
                for (var2 = 0; var2 < arrItemConvert.length; ++var2) {
                    if (arrItemConvert[var2] != null) {
                        var1 = arrItemConvert[var2].indexUI;
                        Char.getMyChar().arrItemBag[var1] = arrItemConvert[var2];
                        arrItemConvert[var2] = null;
                    }
                }
            }

            if (isPaintSplit || isPaintDichChuyen || isPaintTinhluyen || isPaintKhamNgoc) {
                if (itemSplit != null) {
                    Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                    itemSplit = null;
                }

                if (arrItemSplit != null) {
                    for (var2 = 0; var2 < arrItemSplit.length; ++var2) {
                        if (arrItemSplit[var2] != null) {
                            if (isPaintTinhluyen || isPaintDichChuyen || isPaintKhamNgoc) {
                                var1 = arrItemSplit[var2].indexUI;
                                Char.getMyChar().arrItemBag[var1] = arrItemSplit[var2];
                            }

                            arrItemSplit[var2] = null;
                        }
                    }
                }
            }

            if (isPaintGotNgoc && arrItemSplit != null) {
                for (var2 = 0; var2 < arrItemSplit.length; ++var2) {
                    if (arrItemSplit[var2] != null) {
                        var1 = arrItemSplit[var2].indexUI;
                        Char.getMyChar().arrItemBag[var1] = arrItemSplit[var2];
                        arrItemSplit[var2] = null;
                    }
                }
            }

            if (isPaintLuyenNgoc) {
                InfoDlg.hide();
                if (this.da > 0) {
                    Char var3 = Char.getMyChar();
                    var3.xu += this.da;
                }

                if (arrItemTradeMe != null) {
                    for (var2 = 0; var2 < arrItemTradeMe.length; ++var2) {
                        if (arrItemTradeMe[var2] != null) {
                            var1 = arrItemTradeMe[var2].indexUI;
                            Char.getMyChar().arrItemBag[var1] = arrItemTradeMe[var2];
                            arrItemTradeMe[var2] = null;
                        }
                    }
                }

                if (arrItemTradeOrder != null) {
                    for (var2 = 0; var2 < arrItemTradeOrder.length; ++var2) {
                        arrItemTradeOrder[var2] = null;
                    }
                }
            }

            if ((isPaintThaoNgoc || im) && itemSplit != null) {
                Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                itemSplit = null;
            }
        }

        if (isPaintAuto || isPaintTrade) {
            Char.b();
        }

        if (isPaintLuyenNgoc) {
            Service.gI().cancelTrade();
        }

        GameCanvas.menu.showMenu = false;
        ChatTextField var4;
        (var4 = ChatTextField.gI()).tfChat.a("");
        var4.isShow = false;
        ChatTextField.gI().cmdChat = null;
        if (!GameCanvas.isTouch) {
            gy = false;
        }

        cc = false;
        hw = false;
        this.iw = false;
        ib = false;
        isPaintAuto = false;
        isPaintInfoMe = false;
        isPaintItemInfo = false;
        isPaintTask = false;
        isPaintTeam = false;
        isPaintMessage = false;
        isPaintClan = false;
        isPaintLuckySpin = false;
        id = false;
        isPaintCharInMap = false;
        isPaintFindTeam = false;
        isPaintFriend = false;
        isPaintAuctionBuy = false;
        isPaintList = false;
        gs = false;
        isPaintEnemies = false;
        isPaintAlert = false;
        isPaintLucky_Draw = false;
        this.cy = 0;
        isPaintStore = false;
        isPaintEliteShop = false;
        isPaintNonNam = false;
        isPaintNonNu = false;
        isPaintAoNam = false;
        isPaintAoNu = false;
        isPaintGangTayNam = false;
        isPaintGangTayNu = false;
        isPaintQuanNam = false;
        isPaintQuanNu = false;
        isPaintGiayNam = false;
        isPaintGiayNu = false;
        isPaintLien = false;
        isPaintNhan = false;
        isPaintNgocBoi = false;
        isPaintPhu = false;
        isPaintWeapon = false;
        isPaintStack = false;
        isPaintStackLock = false;
        isPaintGrocery = false;
        isPaintGroceryLock = false;
        isPaintUpGrade = false;
        isPaintAuctionSale = false;
        isPaintConvert = false;
        isPaintDichChuyen = false;
        isPaintTinhluyen = false;
        isPaintSplit = false;
        isPaintLuyenNgoc = false;
        isPaintLuyenThach = false;
        isPaintUpPearl = false;
        isPaintBox = false;
        isPaintTrade = false;
        isPaintGiaoDo = false;
        isPaintKhamNgoc = false;
        isPaintGotNgoc = false;
        isPaintThaoNgoc = false;
        im = false;
        indexMenu = 0;
        indexSelect = 0;
        this.iv = -1;
        indexRow = -1;
        gk = 0;
        indexTitle = 0;
        this.cy = this.cz = 0;
        super.left = this.jx;
        super.right = this.ge;
        this.js = this.jt = null;
        super.center = null;
        if (Char.getMyChar().cHp <= 0 || Char.getMyChar().statusMe == 14 || Char.getMyChar().statusMe == 5) {
            if (GameCanvas.h) {
                this.ez.caption = "";
            }

            super.center = this.ez;
        }

        aq.clear();
    }

    public final void keyPress(int var1) {
        if (this.iz != null && this.iz.e) {
            this.iz.keyPress(var1);
        }

        super.keyPress(var1);
    }

    public final void updateKey() {
        if (!GameCanvas.menu.showMenu && !InfoDlg.isLock) {
            int var1;
            boolean var2;
            if (GameCanvas.isTouch && !ChatTextField.gI().isShow && !GameCanvas.menu.showMenu) {
                GameScr var3 = this;
                int var4 = -1;
                if (GameCanvas.n) {
                    for (var1 = 0; var1 < var3.jq.length; ++var1) {
                        if (GameCanvas.b(var3.jq[var1], var3.jr[var1], 100, 12) && GameCanvas.o) {
                            var4 = var1;
                            break;
                        }
                    }
                }

                if (var4 != -1 && !ci() && !isPaintUI() && !isOpenUI()) {
                    if (var4 != 0) {
                        if (ChatManager.f) {
                            ChatManager.gI().switchToTab(1);
                        } else if (ChatManager.e) {
                            ChatManager.gI().switchToTab(3);
                        }

                        this.fm();
                        this.jq[1] = this.jr[1] = -1;
                    } else if (ChatManager.gI().waitList.size() > 0) {
                        ChatManager var5 = ChatManager.gI();
                        var1 = 3;

                        int var6;
                        label1500:
                        while (true) {
                            if (var1 >= var5.chatTabs.size()) {
                                var6 = -1;
                                break;
                            }

                            ChatTab var7 = (ChatTab) var5.chatTabs.elementAt(var1);

                            for (var4 = 0; var4 < var5.waitList.size(); ++var4) {
                                if (var7.ownerName.equals(var5.waitList.elementAt(var4).toString())) {
                                    var6 = var1;
                                    break label1500;
                                }
                            }

                            ++var1;
                        }

                        ChatManager.gI().switchToTab(var6);
                        this.fm();
                        this.jq[0] = this.jr[0] = -1;
                    }
                }

                var2 = false;
                mScreen.fq = -1;
                if (GameCanvas.b(TileMap.s, TileMap.t, TileMap.q, TileMap.r) && GameCanvas.n && GameCanvas.o) {
                    bp();
                    var2 = true;
                }

                if (GameCanvas.isTouch && (!GameCanvas.menu.showMenu || !GameCanvas.h) && GameCanvas.currentDialog == null && ChatPopup.b == null && !GameCanvas.menu.showMenu && !ci()) {
                    if (GameCanvas.b(kj, kk, 34, 34)) {
                        mScreen.fq = 15;
                        if (GameCanvas.n && GameCanvas.o) {
                            ChatTextField.gI().startChat(mResources.or[0]);
                            var2 = true;
                            GameCanvas.o = false;
                            GameCanvas.n = false;
                        }
                    }

                    if (!this.cj()) {
                        if (!Char.getMyChar().isCaptcha) {
                            if (fe) {
                                if (GameCanvas.b(kp, kq, 34, 34)) {
                                    System.out.println("ASD 2 " + GameCanvas.m + " " + GameCanvas.o);
                                    mScreen.fq = 3;
                                    GameCanvas.l[2] = true;
                                    this.br();
                                    var2 = true;
                                } else if (GameCanvas.m) {
                                    GameCanvas.l[2] = false;
                                }

                                if (GameCanvas.b(kp - 30, kq, 30, 34)) {
                                    GameCanvas.l[1] = true;
                                    this.br();
                                    var2 = true;
                                } else if (GameCanvas.m) {
                                    GameCanvas.l[1] = false;
                                }

                                if (GameCanvas.b(kp + 34, kq, 30, 34)) {
                                    GameCanvas.l[3] = true;
                                    this.br();
                                    var2 = true;
                                } else if (GameCanvas.m) {
                                    GameCanvas.l[3] = false;
                                }

                                if (GameCanvas.b(kh, ki, 34, 34)) {
                                    System.out.println("ASD 4 " + GameCanvas.m + " " + GameCanvas.o);
                                    mScreen.fq = 4;
                                    GameCanvas.l[4] = true;
                                    this.br();
                                    var2 = true;
                                } else if (GameCanvas.m) {
                                    GameCanvas.l[4] = false;
                                }

                                if (GameCanvas.b(kl - 5, km, 40, 34)) {
                                    System.out.println("ASD 6 " + GameCanvas.m + " " + GameCanvas.o);
                                    mScreen.fq = 6;
                                    GameCanvas.l[6] = true;
                                    this.br();
                                    var2 = true;
                                } else if (GameCanvas.m) {
                                    GameCanvas.l[6] = false;
                                }
                            } else {
                                qe.a();
                            }

                            if (GameCanvas.b(kn, ko, 54, 54)) {
                                GameCanvas.l[5] = true;
                                mScreen.fq = 5;
                                if (GameCanvas.o) {
                                    GameCanvas.k[5] = true;
                                    var2 = true;
                                }
                            }
                        } else {
                            if (GameCanvas.c(kh, ki, 34, 34) && GameCanvas.o) {
                                this.e((byte) 0);
                                GameCanvas.m();
                            }

                            if (GameCanvas.c(kp, kq, 34, 34) && GameCanvas.o) {
                                this.e((byte) 1);
                                GameCanvas.m();
                            }

                            if (GameCanvas.c(kl - 5, km, 40, 34) && GameCanvas.o) {
                                this.e((byte) 2);
                                GameCanvas.m();
                            }
                        }

                        if (Char.getMyChar().ctaskId > 1) {
                            if (GameCanvas.b(kt, ku, 34, 34)) {
                                mScreen.fq = 11;
                                if (GameCanvas.n && GameCanvas.o) {
                                    GameCanvas.k[11] = true;
                                    var2 = true;
                                }
                            }

                            if (GameCanvas.b(kr, ks, 34, 34)) {
                                mScreen.fq = 10;
                                if (GameCanvas.n && GameCanvas.o) {
                                    GameCanvas.k[10] = true;
                                    var2 = true;
                                }
                            }

                            if (GameCanvas.b(kv, kw, 34, 34)) {
                                mScreen.fq = 13;
                                if (GameCanvas.n && GameCanvas.o) {
                                    Char.getMyChar().x();
                                    var2 = true;
                                }
                            }
                        }

                        if (Char.getMyChar().vSkill.size() >= 2 && (GameCanvas.b(kz + kx[0], ky[0], onScreenSkill.length * 30, 30) || !GameCanvas.g && GameCanvas.b(kz + kx[0], ky[0], 30, onScreenSkill.length * 25)) && GameCanvas.n && GameCanvas.o) {
                            if (!GameCanvas.g) {
                                var4 = (GameCanvas.s - (la + ky[0])) / 25;
                            } else {
                                var4 = (GameCanvas.r - (kz + kx[0])) / 30;
                            }

                            this.kd = var4;
                            if (indexSelect < 0) {
                                indexSelect = 0;
                            }

                            if (this.kd > onScreenSkill.length - 1) {
                                this.kd = onScreenSkill.length - 1;
                            }

                            var2 = true;
                            Skill var11 = onScreenSkill[this.kd];
                            this.a(var11, false);
                            this.gg = true;
                        }

                        if (GameCanvas.o) {
                            GameCanvas.l[1] = false;
                            GameCanvas.l[2] = false;
                            GameCanvas.l[3] = false;
                            GameCanvas.l[4] = false;
                            GameCanvas.l[6] = false;
                        }

                        if (!var2 && !ci() && !isPaintUI() && !isOpenUI() && GameCanvas.n) {
                            var1 = 0;

                            label1448:
                            while (true) {
                                if (var1 >= vMobAttack.size()) {
                                    for (var1 = 0; var1 < vSet.size(); ++var1) {
                                        Npc var13;
                                        if ((var13 = (Npc) vSet.elementAt(var1)).isPaint() && GameCanvas.a(var13.cx - var13.cw / 2, var13.cy - var13.ch, var13.cw, var13.ch) && GameCanvas.o) {
                                            Char.getMyChar().mobFocus = null;
                                            Char.getMyChar().y();
                                            Char.getMyChar().npcFocus = var13;
                                            Char.getMyChar().charFocus = null;
                                            Char.getMyChar().itemFocus = null;
                                            Char.fw = true;
                                            break label1448;
                                        }
                                    }

                                    for (var1 = 0; var1 < vCharInMap.size(); ++var1) {
                                        Char var14;
                                        if ((var14 = (Char) vCharInMap.elementAt(var1)).isPaint() && !var14.isNhanbanz() && GameCanvas.a(var14.cx - var14.cw / 2, var14.cy - var14.ch, var14.cw, var14.ch) && GameCanvas.o) {
                                            Char.getMyChar().mobFocus = null;
                                            Char.getMyChar().y();
                                            Char.getMyChar().charFocus = var14;
                                            Char.getMyChar().itemFocus = null;
                                            Char.fw = true;
                                            break label1448;
                                        }
                                    }

                                    var1 = 0;

                                    while (true) {
                                        if (var1 >= vItemMap.size()) {
                                            break label1448;
                                        }

                                        ItemMap var16;
                                        if (GameCanvas.a((var16 = (ItemMap) vItemMap.elementAt(var1)).x - 12, var16.y - 24, 24, 24) && GameCanvas.o) {
                                            Char.getMyChar().mobFocus = null;
                                            Char.getMyChar().y();
                                            Char.getMyChar().charFocus = null;
                                            Char.getMyChar().itemFocus = var16;
                                            Char.fw = true;
                                            break label1448;
                                        }

                                        ++var1;
                                    }
                                }

                                Mob var12;
                                if ((var12 = (Mob) vMobAttack.elementAt(var1)).e() && GameCanvas.a(var12.x - var12.vy / 2, var12.y - var12.exp, var12.vy, var12.exp) && GameCanvas.o) {
                                    Char.getMyChar().mobFocus = var12;
                                    Char.getMyChar().y();
                                    Char.getMyChar().charFocus = null;
                                    Char.getMyChar().itemFocus = null;
                                    Char.fw = true;
                                    break;
                                }

                                ++var1;
                            }
                        }
                    }
                }
            }

            if (TileMap.mapID != 130 && !bs()) {
                label1619:
                {
                    long var8 = System.currentTimeMillis();
                    if (GameCanvas.k[2] || GameCanvas.k[4] || GameCanvas.k[6] || GameCanvas.k[1] || GameCanvas.k[3]) {
                        er = 0;
                        if (this.es) {
                            Char.getMyChar().isLockKey = false;
                            this.es = false;
                        }
                    }

                    if (GameCanvas.k[5] && !ci()) {
                        if (er == 0) {
                            if (var8 - this.kb < 800L && (Char.getMyChar().myskill == null || Char.getMyChar().cMP >= Char.getMyChar().myskill.manaUse) && Char.getMyChar().myskill != null && (Char.getMyChar().myskill.template.maxPoint <= 0 || Char.getMyChar().myskill.point != 0) && Char.getMyChar().arrItemBody[1] != null && Char.getMyChar().mobFocus != null) {
                                er = 10;
                                GameCanvas.k[5] = false;
                            }
                        } else {
                            if (!this.es && Char.getMyChar().statusMe != 14) {
                                this.es = !this.es;
                                Char.getMyChar().isLockKey = !Char.getMyChar().isLockKey;
                                this.kb = var8;
                                break label1619;
                            }

                            er = 0;
                            if (this.es) {
                                Char.getMyChar().isLockKey = false;
                                this.es = false;
                            }

                            GameCanvas.k[4] = GameCanvas.k[6] = false;
                        }

                        this.kb = var8;
                    }

                    if (GameCanvas.u % 10 == 0 && er > 0 && (Char.getMyChar().mobFocus != null || Char.getMyChar().itemFocus != null)) {
                        this.b(true);
                    }

                    if (er > 1) {
                        --er;
                    }
                }
            }

            if (GameCanvas.isTouch) {
                if (GameCanvas.m && !GameCanvas.o && GameCanvas.b(kv, kw, 34, 34) && !isPaintCharInMap && GameCanvas.n && GameCanvas.k()) {
                    this.bl();
                }
            } else if (GameCanvas.l[13] && !isPaintCharInMap && GameCanvas.k()) {
                this.bl();
            }

            if (ChatPopup.b != null) {
                Command1 var9 = ChatPopup.b.a;
                if ((GameCanvas.k[5] || mScreen.a(var9)) && var9 != null) {
                    GameCanvas.o = false;
                    GameCanvas.k[5] = false;
                    mScreen.fq = -1;
                    if (var9 != null) {
                        var9.a();
                    }
                }
            } else if (!ChatTextField.gI().isShow) {
                if ((GameCanvas.k[12] || mScreen.a(GameCanvas.currentScreen.left)) && super.left != null) {
                    GameCanvas.o = false;
                    GameCanvas.n = false;
                    GameCanvas.k[12] = false;
                    mScreen.fq = -1;
                    if (super.left != null) {
                        super.left.a();
                    }
                }

                if ((GameCanvas.k[13] || mScreen.a(GameCanvas.currentScreen.right)) && super.right != null) {
                    GameCanvas.o = false;
                    GameCanvas.n = false;
                    GameCanvas.k[13] = false;
                    mScreen.fq = -1;
                    if (super.right != null) {
                        super.right.a();
                    }
                }

                if ((GameCanvas.k[5] || mScreen.a(GameCanvas.currentScreen.center)) && super.center != null) {
                    GameCanvas.o = false;
                    GameCanvas.k[5] = false;
                    mScreen.fq = -1;
                    if (super.center != null) {
                        super.center.a();
                    }
                }
            } else {
                if (ChatTextField.gI().left != null && (GameCanvas.k[12] || mScreen.a(ChatTextField.gI().left)) && ChatTextField.gI().left != null) {
                    ChatTextField.gI().left.a();
                }

                if (ChatTextField.gI().right != null && (GameCanvas.k[13] || mScreen.a(ChatTextField.gI().right)) && ChatTextField.gI().right != null) {
                    ChatTextField.gI().right.a();
                }

                if (ChatTextField.gI().cmdChat != null && (GameCanvas.k[5] || mScreen.a(ChatTextField.gI().cmdChat)) && ChatTextField.gI().cmdChat != null) {
                    ChatTextField.gI().cmdChat.a();
                }
            }

            ScrollResult var10;
            if (ib && GameCanvas.currentDialog == null) {
                var2 = false;
                if (GameCanvas.k[4]) {
                    if (--indexSelect < 0) {
                        indexSelect = this.cx.length - 1;
                    }

                    var2 = true;
                } else if (GameCanvas.k[6]) {
                    if (++indexSelect >= this.cx.length) {
                        indexSelect = 0;
                    }

                    var2 = true;
                } else if (GameCanvas.k[8]) {
                    if (indexSelect + this.iq <= this.cx.length - 1) {
                        indexSelect += this.iq;
                    }

                    var2 = true;
                } else if (GameCanvas.k[2]) {
                    if (indexSelect - this.iq >= 0) {
                        indexSelect -= this.iq;
                    }

                    var2 = true;
                }

                if (var2) {
                    aq.a(indexSelect / nz * aq.h);
                    GameCanvas.m();
                    GameCanvas.l();
                }

                if (GameCanvas.isTouch && ((var10 = aq.b()).isDowning || var10.isFinish)) {
                    indexSelect = var10.selected;
                }
            }

            ScrollResult var15;
            if (gs || isPaintTeam || isPaintFindTeam || isPaintFriend || isPaintEnemies || isPaintCharInMap || isPaintList || isPaintAuctionBuy) {
                if (isPaintAuctionBuy) {
                    if (isPaintAuctionBuy && ((var15 = aq.b()).isDowning || var15.isFinish)) {
                        indexSelect = var15.selected;
                        if (var15.selected >= arrItemStands.length) {
                            indexSelect = -1;
                        }

                        if (indexSelect >= 0) {
                            indexTitle = 1;
                        }

                        this.updateCommandForUI();
                    }
                } else {
                    label1613:
                    {
                        if (isPaintTeam) {
                            if (vParty.size() == 0) {
                                break label1613;
                            }

                            if (GameCanvas.k[8]) {
                                if (++indexRow >= vParty.size()) {
                                    indexRow = vParty.size() - 1;
                                }

                                aq.a(indexRow * aq.h);
                            } else if (GameCanvas.k[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                aq.a(indexRow * aq.h);
                            }

                            this.ch();
                        } else if (isPaintFindTeam) {
                            if (GameCanvas.k[8]) {
                                if (++indexRow >= vPtMap.size()) {
                                    indexRow = vPtMap.size() - 1;
                                }

                                aq.a(indexRow * aq.h);
                            } else if (GameCanvas.k[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                aq.a(indexRow * aq.h);
                            }

                            this.s();
                        } else if (isPaintFriend) {
                            if (GameCanvas.k[8]) {
                                if (++indexRow >= gk) {
                                    indexRow = 0;
                                }

                                aq.a(indexRow * aq.h);
                            } else if (GameCanvas.k[2]) {
                                if (--indexRow < 0) {
                                    indexRow = gk - 1;
                                }

                                aq.a(indexRow * aq.h);
                            }

                            this.cg();
                        } else if (isPaintEnemies) {
                            if (GameCanvas.k[8]) {
                                if (++indexRow >= gk) {
                                    indexRow = 0;
                                }

                                aq.a(indexRow * aq.h);
                            } else if (GameCanvas.k[2]) {
                                if (--indexRow < 0) {
                                    indexRow = gk - 1;
                                }

                                aq.a(indexRow * aq.h);
                            }

                            this.cf();
                        } else if (isPaintCharInMap) {
                            if (GameCanvas.k[8]) {
                                if (++indexRow >= vCharInMap.size()) {
                                    indexRow = vCharInMap.size() - 1;
                                }

                                aq.a(indexRow * aq.h);
                            } else if (GameCanvas.k[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                aq.a(indexRow * aq.h);
                            }

                            if (this.dd > 0 && !GameCanvas.isTouch) {
                                aq.a(indexRow * aq.h);
                            }

                            this.cc();
                        } else if (isPaintList) {
                            if (GameCanvas.k[8]) {
                                if (++indexRow >= vList.size()) {
                                    indexRow = vList.size() - 1;
                                }

                                aq.a(indexRow * aq.h);
                            } else if (GameCanvas.k[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                aq.a(indexRow * aq.h);
                            }

                            this.ce();
                        } else if (gs) {
                            if (GameCanvas.k[8]) {
                                if (++indexRow >= vList.size()) {
                                    indexRow = vList.size() - 1;
                                }

                                aq.a(indexRow * aq.h);
                            } else if (GameCanvas.k[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                aq.a(indexRow * aq.h);
                            }

                            this.cd();
                        }

                        if (GameCanvas.isTouch && GameCanvas.currentDialog == null && !GameCanvas.menu.showMenu) {
                            MyVector var18 = null;
                            if (isPaintTeam) {
                                var18 = vParty;
                            } else if (isPaintFriend) {
                                var18 = vFriend;
                            } else if (isPaintEnemies) {
                                var18 = vEnemies;
                            } else if (isPaintFindTeam) {
                                var18 = vPtMap;
                            } else if (isPaintCharInMap) {
                                var18 = vCharInMap;
                            } else if (isPaintList) {
                                var18 = vList;
                            } else if (gs) {
                                var18 = vList;
                            }

                            if ((var10 = aq.b()).isDowning || var10.isFinish) {
                                indexRow = var10.selected;
                                if (var10.selected >= var18.size()) {
                                    indexRow = -1;
                                }

                                if (isPaintTeam) {
                                    this.ch();
                                } else if (isPaintFriend) {
                                    this.cg();
                                } else if (isPaintEnemies) {
                                    this.cf();
                                } else if (isPaintCharInMap) {
                                    this.cc();
                                } else if (isPaintList) {
                                    this.ce();
                                } else if (gs) {
                                    this.cd();
                                }
                            }
                        }

                        GameCanvas.m();
                        GameCanvas.l();
                    }
                }
            }

            this.ab();
            if (isPaintInfoMe && indexMenu != -1 && GameCanvas.currentDialog == null) {
                if (indexTitle == 0) {
                    super.left = super.center = null;
                    if (indexMenu == 0) {
                        super.left = new Command1(mResources.bn, 110221);
                    }

                    if (GameCanvas.k[8]) {
                        indexTitle = 1;
                        indexSelect = 0;
                        indexRow = 0;
                        aq.clear();
                        scrInfo.clear();
                    }

                    if (GameCanvas.k[4]) {
                        indexSelect = 0;
                        indexRow = -1;
                        --indexMenu;
                        aq.clear();
                        scrInfo.clear();
                        if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                            if (indexMenu < 3) {
                                indexMenu = 5;
                            }
                        } else if (indexMenu < 0) {
                            indexMenu = mResources.fr.length - 1;
                        }

                        this.doMiniMenuInforMe();
                    }

                    if (GameCanvas.k[6]) {
                        indexSelect = 0;
                        indexRow = -1;
                        ++indexMenu;
                        aq.clear();
                        scrInfo.clear();
                        if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                            if (indexMenu > 5) {
                                indexMenu = 3;
                            }
                        } else if (indexMenu > mResources.fr.length - 1) {
                            indexMenu = 0;
                        }

                        this.doMiniMenuInforMe();
                    }

                    this.aj();
                } else if (isPaintItemInfo) {
                    if (GameCanvas.k[2]) {
                        if (--indexRow < 0) {
                            indexRow = gk - 1;
                        }

                        scrInfo.a(indexRow * scrInfo.h);
                    } else if (GameCanvas.k[8]) {
                        if (++indexRow >= gk) {
                            indexRow = 0;
                        }

                        scrInfo.a(indexRow * scrInfo.h);
                    }
                } else if (indexMenu == 0) {
                    if (GameCanvas.k[4]) {
                        if (--indexSelect < 0) {
                            indexSelect = Char.getMyChar().arrItemBag.length - 1;
                        }

                        super.left = super.center = null;
                        this.aj();
                        aq.a(indexSelect / nz * aq.h);
                    } else if (GameCanvas.k[6]) {
                        if (++indexSelect >= Char.getMyChar().arrItemBag.length) {
                            indexSelect = 0;
                        }

                        super.left = super.center = null;
                        this.aj();
                        aq.a(indexSelect / nz * aq.h);
                    } else if (GameCanvas.k[8]) {
                        if (indexSelect + nz <= Char.getMyChar().arrItemBag.length - 1) {
                            indexSelect += nz;
                        }

                        super.left = super.center = null;
                        this.aj();
                        aq.a(indexSelect / nz * aq.h);
                    } else if (GameCanvas.k[2]) {
                        if (indexSelect >= 0 && indexSelect < nz) {
                            indexTitle = 0;
                            indexSelect = 0;
                        } else if (indexSelect - nz >= 0) {
                            indexSelect -= nz;
                        }

                        super.left = super.center = null;
                        this.aj();
                        aq.a(indexSelect / nz * aq.h);
                    }
                } else {
                    label1595:
                    {
                        if (indexMenu == 1) {
                            if (GameCanvas.k[2]) {
                                if (indexTitle == 1 && indexRow == -1) {
                                    --indexTitle;
                                } else if (indexTitle == 1 && indexRow >= 0) {
                                    --indexRow;
                                }

                                scrInfo.a(indexRow * scrInfo.h);
                                break label1595;
                            }

                            if (!GameCanvas.k[8]) {
                                if (GameCanvas.k[4]) {
                                    indexRow = -1;
                                    if (indexTitle == 1 && --indexSelect < 0) {
                                        indexSelect = Char.getMyChar().nClass.c.length - 1;
                                    }

                                    super.left = super.center = null;
                                    this.aj();
                                    aq.a(indexSelect * aq.h);
                                    scrInfo.clear();
                                    indexRow = 0;
                                } else if (GameCanvas.k[6]) {
                                    indexRow = -1;
                                    if (indexTitle == 1 && ++indexSelect >= Char.getMyChar().nClass.c.length) {
                                        indexSelect = 0;
                                    }

                                    super.left = super.center = null;
                                    this.aj();
                                    aq.a(indexSelect * aq.h);
                                    scrInfo.clear();
                                    indexRow = 0;
                                }
                                break label1595;
                            }

                            if (indexTitle == 0) {
                                ++indexTitle;
                            } else if (indexTitle == 1) {
                                if (++indexRow >= gk) {
                                    indexRow = 0;
                                }

                                scrInfo.a(indexRow * scrInfo.h);
                            }

                            super.left = super.center = null;
                        } else if (indexMenu == 2) {
                            if (GameCanvas.k[2]) {
                                --indexTitle;
                                break label1595;
                            }

                            if (!GameCanvas.k[8]) {
                                break label1595;
                            }

                            if (++indexTitle >= 5) {
                                indexTitle = 1;
                            }

                            super.left = super.center = null;
                        } else {
                            if (indexMenu == 3) {
                                if (indexRow < 0) {
                                    indexRow = 0;
                                }

                                if (GameCanvas.k[2]) {
                                    if (indexRow == 0) {
                                        --indexTitle;
                                        indexRow = -1;
                                    } else {
                                        --indexRow;
                                    }

                                    aq.a(indexRow * aq.h);
                                } else if (GameCanvas.k[8]) {
                                    if (++indexRow >= gk) {
                                        indexRow = 0;
                                    }

                                    aq.a(indexRow * aq.h);
                                }
                                break label1595;
                            }

                            if (indexMenu == 4) {
                                label1623:
                                {
                                    var1 = indexSelect;
                                    if (indexSelect != 11 && indexSelect != 12 && indexSelect != 13 && indexSelect != 14) {
                                        if (indexSelect == 9) {
                                            if (GameCanvas.k[2]) {
                                                indexSelect -= 2;
                                                break label1623;
                                            }

                                            if (GameCanvas.k[8]) {
                                                indexSelect = 15;
                                                break label1623;
                                            }

                                            if (!GameCanvas.k[4]) {
                                                if (GameCanvas.k[6]) {
                                                    ++indexSelect;
                                                }
                                                break label1623;
                                            }
                                        } else if (indexSelect == 10) {
                                            if (GameCanvas.k[2]) {
                                                indexSelect -= 2;
                                                break label1623;
                                            }

                                            if (!GameCanvas.k[4]) {
                                                if (GameCanvas.k[6] || GameCanvas.k[8]) {
                                                    ++indexSelect;
                                                }
                                                break label1623;
                                            }
                                        } else {
                                            if (indexSelect != 15) {
                                                if (GameCanvas.k[2]) {
                                                    if (indexSelect <= 1) {
                                                        indexSelect = 0;
                                                        indexTitle = 0;
                                                    } else {
                                                        indexSelect -= 2;
                                                    }
                                                } else if (GameCanvas.k[8]) {
                                                    if ((indexSelect += 2) > 15) {
                                                        indexSelect = 0;
                                                    }
                                                } else if (GameCanvas.k[4]) {
                                                    if (--indexSelect < 0) {
                                                        indexSelect = 15;
                                                    }
                                                } else if (GameCanvas.k[6] && ++indexSelect > 11) {
                                                    indexSelect = 0;
                                                }
                                                break label1623;
                                            }

                                            if (GameCanvas.k[2]) {
                                                indexSelect = 9;
                                                break label1623;
                                            }

                                            if (!GameCanvas.k[4]) {
                                                if (GameCanvas.k[8] || GameCanvas.k[6]) {
                                                    indexSelect = 0;
                                                }
                                                break label1623;
                                            }
                                        }
                                    } else if (!GameCanvas.k[2] && !GameCanvas.k[4]) {
                                        if (GameCanvas.k[6] || GameCanvas.k[8]) {
                                            ++indexSelect;
                                        }
                                        break label1623;
                                    }

                                    --indexSelect;
                                }

                                if (var1 == indexSelect) {
                                    break label1595;
                                }

                                super.left = super.center = null;
                            } else {
                                if (indexMenu != 5) {
                                    break label1595;
                                }

                                if (GameCanvas.k[2]) {
                                    if (indexSelect == 4) {
                                        indexSelect = 0;
                                        --indexTitle;
                                    } else if (--indexSelect < 0) {
                                        indexSelect = 0;
                                        --indexTitle;
                                    }

                                    this.aj();
                                    break label1595;
                                }

                                if (GameCanvas.k[4]) {
                                    if (indexSelect >= 2 && indexSelect != 4) {
                                        indexSelect = 4;
                                    } else {
                                        indexSelect = 0;
                                    }

                                    this.aj();
                                    break label1595;
                                }

                                if (GameCanvas.k[6]) {
                                    if (indexSelect < 2) {
                                        indexSelect = 4;
                                    } else {
                                        indexSelect = 2;
                                    }

                                    this.aj();
                                    break label1595;
                                }

                                if (!GameCanvas.k[8]) {
                                    break label1595;
                                }

                                if (++indexSelect >= 4) {
                                    indexSelect = 0;
                                }
                            }
                        }

                        this.aj();
                    }
                }

                if (GameCanvas.isTouch) {
                    this.bw();
                }

                GameCanvas.m();
                GameCanvas.l();
            }

            this.bx();
            if (isPaintTask) {
                if (indexTitle == 0) {
                    if (indexTitle == 0 && GameCanvas.k[8]) {
                        indexTitle = 1;
                        indexRow = -1;
                        aq.clear();
                        scrInfo.clear();
                    }
                } else {
                    if (indexRow < 0) {
                        indexRow = 0;
                    }

                    if (GameCanvas.k[2]) {
                        if (indexRow == 0) {
                            --indexTitle;
                            indexRow = -1;
                        } else {
                            --indexRow;
                        }

                        aq.a(indexRow * aq.h);
                    } else if (GameCanvas.k[8]) {
                        if (++indexRow >= gk) {
                            indexRow = 0;
                        }

                        aq.a(indexRow * aq.h);
                    }
                }

                if (GameCanvas.isTouch && ((var15 = aq.b()).isDowning || var15.isFinish)) {
                    indexRow = var15.selected;
                    indexTitle = 1;
                }
            }

            this.ca();
            this.cb();
            int var20;
            if (Char.getMyChar().currentMovePoint != null) {
                for (var20 = 0; var20 < GameCanvas.k.length; ++var20) {
                    if (GameCanvas.k[var20]) {
                        Char.getMyChar().currentMovePoint = null;
                        break;
                    }
                }
            }

            if (ChatTextField.gI().isShow && GameCanvas.at != 0) {
                ChatTextField var17 = ChatTextField.gI();
                var1 = GameCanvas.at;
                if (var17.isShow) {
                    var17.tfChat.keyPress(var1);
                }

                if (var17.tfChat.e().equals("")) {
                    var17.right.caption = mResources.aq;
                } else {
                    var17.right.caption = mResources.bf;
                }

                GameCanvas.at = 0;
            }

            if (this.iw) {
                GameCanvas.m();
            } else {
                if (GameCanvas.menu.showMenu || isOpenUI() || Char.ischangingMap) {
                    return;
                }

                if (GameCanvas.k[10]) {
                    GameCanvas.k[10] = false;
                    x();
                    GameCanvas.l();
                }

                if (GameCanvas.k[11]) {
                    GameCanvas.k[11] = false;
                    w();
                    GameCanvas.l();
                }

                if (GameCanvas.at != 0 && TField.h) {
                    if (GameCanvas.at == 32) {
                        x();
                        GameCanvas.at = 0;
                        GameCanvas.l();
                    } else if (GameCanvas.at == 64) {
                        w();
                        GameCanvas.at = 0;
                        GameCanvas.l();
                    } else if (GameCanvas.at == 48) {
                        w();
                        GameCanvas.at = 0;
                        GameCanvas.l();
                    } else if (GameCanvas.at == 63) {
                        w();
                        GameCanvas.at = 0;
                        GameCanvas.l();
                    }
                }

                if (Char.getMyChar().fu != null) {
                    return;
                }

                if (Char.getMyChar().isCaptcha) {
                    this.hm();
                } else {
                    if (Char.getMyChar().statusMe == 1) {
                        if (GameCanvas.k[5]) {
                            GameCanvas.k[5] = false;
                            this.b(false);
                        } else if (GameCanvas.l[2]) {
                            if (!Char.getMyChar().isLockKey && !Char.getMyChar().isLockAttack) {
                                k(0);
                            }
                        } else if (GameCanvas.l[1]) {
                            Char.getMyChar().cdir = -1;
                            if (!Char.getMyChar().isLockKey && !Char.getMyChar().isLockAttack) {
                                k(-4);
                            }
                        } else if (GameCanvas.l[3]) {
                            Char.getMyChar().cdir = 1;
                            if (!Char.getMyChar().isLockKey && !Char.getMyChar().isLockAttack) {
                                k(4);
                            }
                        } else if (GameCanvas.l[4]) {
                            Char.getMyChar().cchistlast = false;
                            if (Char.getMyChar().cdir == 1) {
                                Char.getMyChar().cdir = -1;
                            } else if (!Char.getMyChar().isLockKey && !Char.getMyChar().isLockAttack) {
                                Char.getMyChar().statusMe = 2;
                                Char.getMyChar().cvx = -Char.getMyChar().f();
                            }
                        } else if (GameCanvas.l[6]) {
                            Char.getMyChar().cchistlast = false;
                            if (Char.getMyChar().cdir == -1) {
                                Char.getMyChar().cdir = 1;
                            } else if (!Char.getMyChar().isLockKey && !Char.getMyChar().isLockAttack) {
                                Char.getMyChar().statusMe = 2;
                                Char.getMyChar().cvx = Char.getMyChar().f();
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 2) {
                        if (GameCanvas.k[5]) {
                            GameCanvas.k[5] = false;
                            this.b(false);
                        } else if (GameCanvas.l[2]) {
                            Char.getMyChar().cvy = Char.getMyChar().canJumpHigh ? -10 : -8;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        } else if (GameCanvas.l[1]) {
                            Char.getMyChar().cdir = -1;
                            Char.getMyChar().cvy = Char.getMyChar().canJumpHigh ? -10 : -8;
                            Char.getMyChar().cvx = -4;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        } else if (GameCanvas.l[3]) {
                            Char.getMyChar().cdir = 1;
                            Char.getMyChar().cvy = Char.getMyChar().canJumpHigh ? -10 : -8;
                            Char.getMyChar().cvx = 4;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        } else {
                            Char var19;
                            if (GameCanvas.l[4]) {
                                if (Char.getMyChar().cdir == 1) {
                                    Char.getMyChar().cdir = -1;
                                } else {
                                    var19 = Char.getMyChar();
                                    var20 = -Char.getMyChar().f();
                                    Char.getMyChar();
                                    var19.cvx = var20;
                                }
                            } else if (GameCanvas.l[6]) {
                                if (Char.getMyChar().cdir == -1) {
                                    Char.getMyChar().cdir = 1;
                                } else {
                                    var19 = Char.getMyChar();
                                    var20 = Char.getMyChar().f();
                                    Char.getMyChar();
                                    var19.cvx = var20;
                                }
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 3) {
                        if (GameCanvas.k[5]) {
                            GameCanvas.k[5] = false;
                            this.b(false);
                        }

                        if (!GameCanvas.l[4] && !GameCanvas.l[1]) {
                            if (GameCanvas.l[6] || GameCanvas.l[3]) {
                                if (Char.getMyChar().cdir == -1) {
                                    Char.getMyChar().cdir = 1;
                                } else {
                                    Char.getMyChar().cvx = Char.getMyChar().f();
                                }
                            }
                        } else if (Char.getMyChar().cdir == 1) {
                            Char.getMyChar().cdir = -1;
                        } else {
                            Char.getMyChar().cvx = -Char.getMyChar().f();
                        }

                        if ((GameCanvas.l[2] || GameCanvas.l[1] || GameCanvas.l[3]) && Char.getMyChar().canJumpHigh && Char.getMyChar().cp1 == 0 && Char.getMyChar().cvy > -4) {
                            ++Char.getMyChar().cp1;
                            Char.getMyChar().cvy = -7;
                        }
                    } else if (Char.getMyChar().statusMe == 4) {
                        if (GameCanvas.k[5]) {
                            GameCanvas.k[5] = false;
                            this.b(false);
                        }

                        if (GameCanvas.k[2]) {
                            GameCanvas.l();
                        }

                        if (GameCanvas.l[4]) {
                            if (Char.getMyChar().cdir == 1) {
                                Char.getMyChar().cdir = -1;
                            } else {
                                Char.getMyChar().cvx = -Char.getMyChar().f();
                            }
                        } else if (GameCanvas.l[6]) {
                            if (Char.getMyChar().cdir == -1) {
                                Char.getMyChar().cdir = 1;
                            } else {
                                Char.getMyChar().cvx = Char.getMyChar().f();
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 10) {
                        if (GameCanvas.k[5]) {
                            GameCanvas.k[5] = false;
                            this.b(false);
                        }

                        if (GameCanvas.l[2]) {
                            Char.getMyChar().cvy = -10;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        } else if (GameCanvas.l[4]) {
                            if (Char.getMyChar().cdir == 1) {
                                Char.getMyChar().cdir = -1;
                            } else {
                                Char.getMyChar().cvx = -5;
                            }
                        } else if (GameCanvas.l[6]) {
                            if (Char.getMyChar().cdir == -1) {
                                Char.getMyChar().cdir = 1;
                            } else {
                                Char.getMyChar().cvx = 5;
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 7) {
                        if (GameCanvas.k[5]) {
                            GameCanvas.k[5] = false;
                        }

                        if (GameCanvas.l[4]) {
                            if (Char.getMyChar().cdir == 1) {
                                Char.getMyChar().cdir = -1;
                            } else {
                                Char.getMyChar().cvx = -Char.getMyChar().f() + 2;
                            }
                        } else if (GameCanvas.l[6]) {
                            if (Char.getMyChar().cdir == -1) {
                                Char.getMyChar().cdir = 1;
                            } else {
                                Char.getMyChar().cvx = Char.getMyChar().f() - 2;
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 11) {
                        if (GameCanvas.k[5]) {
                            GameCanvas.k[5] = false;
                            this.b(false);
                        }

                        if (GameCanvas.l[2]) {
                            Char.getMyChar().cvy = -10;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        }
                    }

                    if (GameCanvas.k[8] && GameCanvas.at != 56) {
                        GameCanvas.k[8] = false;
                        this.bt();
                    }
                }

                if (GameCanvas.at != 0) {
                    if (TField.h) {
                        if (GameCanvas.at == 113) {
                            this.gg = true;
                            if (keySkill[0] != null) {
                                this.a(keySkill[0], true);
                            }
                        } else if (GameCanvas.at == 119) {
                            this.gg = true;
                            if (keySkill[1] != null) {
                                this.a(keySkill[1], true);
                            }
                        } else if (GameCanvas.at == 101) {
                            this.gg = true;
                            if (keySkill[2] != null) {
                                this.a(keySkill[2], true);
                            }
                        } else {
                            ChatTextField.gI().startChat(GameCanvas.at, this, mResources.or[0]);
                        }
                    } else if (!GameCanvas.b) {
                        ChatTextField.gI().startChat(GameCanvas.at, this, mResources.or[0]);
                    } else if (GameCanvas.at == 55) {
                        this.gg = true;
                        if (keySkill[0] != null) {
                            this.a(keySkill[0], true);
                        }
                    } else if (GameCanvas.at == 56) {
                        this.gg = true;
                        if (keySkill[1] != null) {
                            this.a(keySkill[1], true);
                        }
                    } else if (GameCanvas.at == 57) {
                        this.gg = true;
                        if (keySkill[2] != null) {
                            this.a(keySkill[2], true);
                        }
                    } else if (GameCanvas.at == 48) {
                        ChatTextField.gI().startChat(mResources.or[0]);
                    }

                    GameCanvas.at = 0;
                }
            }

            GameCanvas.l();
        }

    }

    private void br() {
        er = 0;
        this.es = Char.getMyChar().isLockKey = false;
    }

    public static void w() {
        if (!Char.getMyChar().doUsePotion(17)) {
            for (int var0 = 0; var0 < Char.getMyChar().arrItemBag.length; ++var0) {
                if (Char.getMyChar().arrItemBag[var0] != null && Char.getMyChar().arrItemBag[var0].template.type == 17) {
                    InfoMe.addInfo(mResources.nh);
                    return;
                }
            }

            if (er != 1) {
                InfoMe.addInfo(mResources.ni);
            }
        }

    }

    public static void x() {
        int var0 = (int) (System.currentTimeMillis() / 1000L);

        int var1;
        for (var1 = 0; var1 < Char.getMyChar().vEff.size(); ++var1) {
            Effect var2;
            if ((var2 = (Effect) Char.getMyChar().vEff.elementAt(var1)).template.id == 21 && var2.timeLenght - (var0 - var2.timeStart) >= 2) {
                return;
            }
        }

        if (!Char.getMyChar().doUsePotion(16)) {
            for (var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
                if (Char.getMyChar().arrItemBag[var1] != null && Char.getMyChar().arrItemBag[var1].template.type == 16) {
                    InfoMe.addInfo(mResources.nh);
                    return;
                }
            }

            if (er != 1) {
                InfoMe.addInfo(mResources.nj);
            }
        }

    }

    private static boolean bs() {
        if (Char.getMyChar().mobFocus == null) {
            return false;
        } else {
            return Char.getMyChar().mobFocus.d().mobTemplateId == 142 && Char.getMyChar().cTypePk == 4 || Char.getMyChar().mobFocus.d().mobTemplateId == 143 && Char.getMyChar().cTypePk == 5;
        }
    }

    private void b(boolean var1) {
        if (Char.getMyChar().statusMe != 14) {
            boolean var2;
            MyVector var3;
            label395:
            {
                if (!InfoDlg.isLock && !Char.getMyChar().isLockMove && !Char.ischangingMap && !Char.getMyChar().isLockAttack) {
                    label416:
                    {
                        if (Char.getMyChar().mobFocus != null && (Char.getMyChar().mobFocus.templateId == 97 && Char.getMyChar().cTypePk == 4 || Char.getMyChar().mobFocus.templateId == 98 && Char.getMyChar().cTypePk == 4 || Char.getMyChar().mobFocus.templateId == 96 && Char.getMyChar().cTypePk == 5 || Char.getMyChar().mobFocus.templateId == 99 && Char.getMyChar().cTypePk == 5)) {
                            var2 = false;
                            break label395;
                        }

                        if (Char.getMyChar().myskill != null && Char.getMyChar().myskill.template.type == 2 && Char.getMyChar().npcFocus == null) {
                            var2 = bq();
                            break label395;
                        }

                        if (Char.getMyChar().fu != null || Char.getMyChar().charFocus != null && Char.getMyChar().charFocus.isNhanban || Char.getMyChar().mobFocus == null && Char.getMyChar().npcFocus == null && Char.getMyChar().charFocus == null && Char.getMyChar().itemFocus == null) {
                            var2 = false;
                            break label395;
                        }

                        int var4;
                        int var5;
                        if (Char.getMyChar().mobFocus != null) {
                            label375:
                            {
                                if (Char.getMyChar().myskill == null) {
                                    break label416;
                                }

                                if (Char.getMyChar().arrItemBody[1] == null) {
                                    InfoMe.addInfo(mResources.ol);
                                    break label416;
                                }

                                if (Char.getMyChar().mobFocus.status != 1 && Char.getMyChar().mobFocus.status != 0 && Char.getMyChar().myskill.template.type != 4) {
                                    if (!bq()) {
                                        break label416;
                                    }

                                    if (Char.getMyChar().cx < Char.getMyChar().mobFocus.x) {
                                        Char.getMyChar().cdir = 1;
                                    } else {
                                        Char.getMyChar().cdir = -1;
                                    }

                                    var4 = Math.abs(Char.getMyChar().cx - Char.getMyChar().mobFocus.x);
                                    var5 = Math.abs(Char.getMyChar().cy - Char.getMyChar().mobFocus.y);
                                    Char.getMyChar().cvx = 0;
                                    if (Char.getMyChar().g()) {
                                        if (var4 <= Char.getMyChar().myskill.b() && var5 <= Char.getMyChar().myskill.c()) {
                                            GameCanvas.m();
                                            GameCanvas.l();
                                            break label375;
                                        }

                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().mobFocus.x, Char.getMyChar().cy);
                                        GameCanvas.m();
                                        GameCanvas.l();
                                        break label416;
                                    }

                                    if ((Char.getMyChar().myskill.template.id == 24 || Char.getMyChar().myskill.template.id == 40 || Char.getMyChar().myskill.template.id == 42) && var4 <= Char.getMyChar().myskill.b() && var5 <= Char.getMyChar().myskill.c()) {
                                        GameCanvas.m();
                                        GameCanvas.l();
                                        Char.getMyChar().cvx = 0;
                                        break label375;
                                    }

                                    if (var4 <= Char.getMyChar().myskill.b() && var5 <= Char.getMyChar().myskill.c() && Char.getMyChar().cy >= Char.getMyChar().mobFocus.y - 10) {
                                        GameCanvas.m();
                                        GameCanvas.l();
                                        Char.getMyChar().cvx = 0;
                                        break label375;
                                    }

                                    Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().mobFocus.x + Char.getMyChar().mobFocus.dir * 12, Char.getMyChar().cy);
                                    GameCanvas.m();
                                    GameCanvas.l();
                                    break label416;
                                }

                                var2 = false;
                                break label395;
                            }
                        } else {
                            if (Char.getMyChar().npcFocus != null) {
                                if (Char.getMyChar().cx < Char.getMyChar().npcFocus.cx) {
                                    Char.getMyChar().cdir = 1;
                                } else {
                                    Char.getMyChar().cdir = -1;
                                }

                                if (Char.getMyChar().cx < Char.getMyChar().npcFocus.cx) {
                                    Char.getMyChar().npcFocus.cdir = -1;
                                } else {
                                    Char.getMyChar().npcFocus.cdir = 1;
                                }

                                var4 = Math.abs(Char.getMyChar().cx - Char.getMyChar().npcFocus.cx);
                                var5 = Math.abs(Char.getMyChar().cy - Char.getMyChar().npcFocus.cy);
                                if (var4 < 60 && var5 < 40) {
                                    GameCanvas.m();
                                    GameCanvas.l();
                                    if (Char.getMyChar().npcFocus.template.npcTemplateId == 13) {
                                        InfoDlg.showWait();
                                        Service.gI().openUIZone();
                                    } else {
                                        Service.gI().openMenu(Char.getMyChar().npcFocus.template.npcTemplateId);
                                        InfoDlg.showWait();
                                    }
                                } else {
                                    Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().npcFocus.cx, Char.getMyChar().cy);
                                    GameCanvas.m();
                                    GameCanvas.l();
                                }

                                var2 = false;
                                break label395;
                            }

                            if (Char.getMyChar().charFocus != null) {
                                if (Char.getMyChar().cx < Char.getMyChar().charFocus.cx) {
                                    Char.getMyChar().cdir = 1;
                                } else {
                                    Char.getMyChar().cdir = -1;
                                }

                                var4 = Math.abs(Char.getMyChar().cx - Char.getMyChar().charFocus.cx);
                                var5 = Math.abs(Char.getMyChar().cy - Char.getMyChar().charFocus.cy);
                                Char.getMyChar();
                                if (!Char.isMeCanAttackOtherPlayer(Char.getMyChar().charFocus)) {
                                    if (var4 < 60 && var5 < 40 && Char.getMyChar().charFocus.charID >= 0) {
                                        GameCanvas.m();
                                        if (Char.getMyChar().charFocus.statusMe != 14 && Char.getMyChar().charFocus.statusMe != 5 && TileMap.typeMap == 1) {
                                            break label416;
                                        }

                                        if (!this.gg) {
                                            (var3 = new MyVector()).addElement(new Command1(mResources.nk[6], 110397));
                                            var3.addElement(new Command1(mResources.nk[4], 110391));
                                            if ((Char.getMyChar().ctypeClan == 4 || Char.getMyChar().ctypeClan == 3 || Char.getMyChar().ctypeClan == 2) && Char.getMyChar().charFocus.cClanName.equals("")) {
                                                var3.addElement(new Command1(mResources.nk[8], 110398));
                                            }

                                            if ((Char.getMyChar().charFocus.ctypeClan == 4 || Char.getMyChar().charFocus.ctypeClan == 3 || Char.getMyChar().charFocus.ctypeClan == 2) && Char.getMyChar().cClanName.equals("")) {
                                                var3.addElement(new Command1(mResources.nk[9], 110399));
                                            }

                                            var3.addElement(new Command1(mResources.nk[7], 12004, Char.getMyChar().charFocus.cName));
                                            if (Char.getMyChar().nClass.classId == 6) {
                                                var3.addElement(new Command1(mResources.nk[11] + ": " + (!Char.ei ? mResources.az : mResources.ba), 1103991));
                                            }

                                            if (Char.getMyChar().charFocus.statusMe != 14 && Char.getMyChar().charFocus.statusMe != 5) {
                                                var3.addElement(new Command1(mResources.nk[0], 110392));
                                                var3.addElement(new Command1(mResources.nk[1], 110393));
                                                var3.addElement(new Command1(mResources.nk[2], 110394));
                                            } else if (Char.getMyChar().myskill.template.type == 4) {
                                                var3.addElement(new Command1(mResources.nk[5], 110395));
                                            }

                                            var3.addElement(new Command1(mResources.nk[3], 110396));
                                            GameCanvas.menu.startAt(var3);
                                        }

                                        this.gg = false;
                                    } else {
                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().charFocus.cx, Char.getMyChar().cy);
                                        GameCanvas.m();
                                        GameCanvas.l();
                                    }

                                    var2 = false;
                                    break label395;
                                }

                                if (Char.getMyChar().myskill == null) {
                                    break label416;
                                }

                                if (Char.getMyChar().arrItemBody[1] == null) {
                                    InfoMe.addInfo(mResources.ol);
                                    break label416;
                                }

                                if (!bq()) {
                                    break label416;
                                }

                                if (Char.getMyChar().cx < Char.getMyChar().charFocus.cx) {
                                    Char.getMyChar().cdir = 1;
                                } else {
                                    Char.getMyChar().cdir = -1;
                                }

                                Char.getMyChar().cvx = 0;
                                if (Char.getMyChar().g()) {
                                    if (var4 > Char.getMyChar().myskill.b() || var5 > Char.getMyChar().myskill.c()) {
                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().charFocus.cx, Char.getMyChar().cy);
                                        GameCanvas.m();
                                        GameCanvas.l();
                                        break label416;
                                    }

                                    GameCanvas.m();
                                    GameCanvas.l();
                                } else if ((Char.getMyChar().myskill.template.id == 24 || Char.getMyChar().myskill.template.id == 40 || Char.getMyChar().myskill.template.id == 42) && var4 <= Char.getMyChar().myskill.b() && var5 <= Char.getMyChar().myskill.c()) {
                                    GameCanvas.m();
                                    GameCanvas.l();
                                    Char.getMyChar().cvx = 0;
                                } else {
                                    if (var4 > Char.getMyChar().myskill.b() || var5 > Char.getMyChar().myskill.c() || Char.getMyChar().cy < Char.getMyChar().charFocus.cy) {
                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().charFocus.cx + Char.getMyChar().charFocus.cdir * 12, Char.getMyChar().cy);
                                        GameCanvas.m();
                                        GameCanvas.l();
                                        break label416;
                                    }

                                    GameCanvas.m();
                                    GameCanvas.l();
                                    Char.getMyChar().cvx = 0;
                                }
                            } else if (Char.getMyChar().itemFocus != null) {
                                if (Char.getMyChar().statusMe == 1) {
                                    if (Char.getMyChar().cx < Char.getMyChar().itemFocus.x) {
                                        Char.getMyChar().cdir = 1;
                                    } else {
                                        Char.getMyChar().cdir = -1;
                                    }

                                    var4 = Math.abs(Char.getMyChar().cx - Char.getMyChar().itemFocus.x);
                                    var5 = Math.abs(Char.getMyChar().cy - Char.getMyChar().itemFocus.y);
                                    if ((var4 > 35 || var5 >= 35) && (er == 0 || var4 > 48 || var5 > 48)) {
                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().itemFocus.x, Char.getMyChar().cy);
                                        GameCanvas.m();
                                        GameCanvas.l();
                                    } else {
                                        GameCanvas.m();
                                        GameCanvas.l();
                                        Service.gI().pickItem(Char.getMyChar().itemFocus.g);
                                    }

                                    var2 = false;
                                    break label395;
                                }
                                break label416;
                            }
                        }

                        var2 = true;
                        break label395;
                    }
                }

                var2 = false;
            }

            if (var2) {
                if (bs()) {
                    (var3 = new MyVector()).addElement(new Command1(mResources.se, 151301));
                    GameCanvas.menu.startAt(var3);
                    return;
                }

                if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.d().mobTemplateId == 144 && TileMap.mapID == 130) {
                    (var3 = new MyVector()).addElement(new Command1(mResources.si, 151301));
                    GameCanvas.menu.startAt(var3);
                    return;
                }

                Char.getMyChar().a((SkillPaint) s[Char.getMyChar().myskill.template.id], 0);
                Char.getMyChar().gb = var1;
                if (Char.getMyChar().isJump) {
                    Char.getMyChar().isJump = false;
                    Char.getMyChar().timeSummon = System.currentTimeMillis();
                    if (Char.getMyChar().vitaWolf >= 500) {
                        ServerEffect.addServerEffect(60, Char.getMyChar(), 1);
                    }
                }

                if (Char.getMyChar().t() && !Char.getMyChar().autoFall) {
                    Char.getMyChar().fallAttack = false;
                    Char.getMyChar().autoFall = true;
                    ServerEffect.addServerEffect(60, Char.getMyChar(), 1);
                }
            }
        }

        if (!var1) {
            Char.getMyChar().ga = Char.getMyChar().myskill;
        }

    }

    private void bt() {
        this.kc = 0;

        int var1;
        for (var1 = 0; var1 < onScreenSkill.length; ++var1) {
            if (onScreenSkill[var1] != null) {
                ++this.kc;
            }
        }

        if (this.kc <= 1) {
            InfoMe.isEmpty();
        } else {
            if (!gy || this.kd == -1) {
                gy = true;

                for (var1 = 0; var1 < onScreenSkill.length; ++var1) {
                    if (onScreenSkill[var1] == Char.getMyChar().myskill) {
                        this.kd = var1;
                        break;
                    }
                }
            }

            ++this.kd;
            if (this.kd >= onScreenSkill.length) {
                this.kd = 0;
            }

            if (onScreenSkill[this.kd] == null) {
                this.kd = 0;
            }

            super.center = new Command1("", 11059);
        }

    }

    public final void a(Skill var1, boolean var2) {
        this.kd = -1;
        if (var1 != null) {
            if (var1.template.type == 4 && Char.getMyChar().charFocus != null) {
                if (Char.getMyChar().charFocus.isNhanban) {
                    return;
                }

                if (Char.getMyChar().charFocus.statusMe == 14 || Char.getMyChar().charFocus.statusMe == 5) {
                    Service.gI().buffLive(Char.getMyChar().charFocus.charID);
                    if ((TileMap.a(Char.getMyChar().cx, Char.getMyChar().cy) & 2) == 2) {
                        Char.getMyChar().a((SkillPaint) s[49], 0);
                    } else {
                        Char.getMyChar().a((SkillPaint) s[49], 1);
                    }
                }
            } else {
                Service.gI().selectSkill(var1.template.id);
            }
        }

        if (var1.template.type != 2) {
            this.resetButton();
        }

        if (var1 != null) {
            Char.getMyChar().myskill = var1;
            if (var1.template.type == 1 && NSOT_MOB.b != null) {
                Auto.g = var1;
            }

            if (Char.getMyChar().npcFocus == null && var1.template.type != 4) {
                this.b(var2);
            }
        }

    }

    public static void c(int var0) {
        MyVector var1 = var0 == 0 ? vFriend : vEnemies;

        for (int var2 = 0; var2 < var1.size() - 1; ++var2) {
            Friend var3 = (Friend) var1.elementAt(var2);

            for (int var4 = var2 + 1; var4 < var1.size(); ++var4) {
                Friend var5;
                Friend var6;
                if ((var5 = (Friend) var1.elementAt(var4)).type > var3.type) {
                    var6 = var5;
                    var5 = var3;
                    var3 = var6;
                    var1.setElementAt(var6, var2);
                    var1.setElementAt(var5, var4);
                } else if (var5.type == var3.type && var3.friendName.compareTo(var5.friendName) > 0) {
                    var6 = var5;
                    var5 = var3;
                    var3 = var6;
                    var1.setElementAt(var6, var2);
                    var1.setElementAt(var5, var4);
                }
            }
        }

    }

    public static void y() {
        for (int var0 = 0; var0 < vClan.size() - 1; ++var0) {
            Member var1 = (Member) vClan.elementAt(var0);

            for (int var2 = var0 + 1; var2 < vClan.size(); ++var2) {
                Member var3 = (Member) vClan.elementAt(var2);
                Member var4;
                if (gp && !gq) {
                    if (var3.isOnline && !var1.isOnline) {
                        var4 = var3;
                        var3 = var1;
                        var1 = var4;
                        vClan.setElementAt(var4, var0);
                        vClan.setElementAt(var3, var2);
                    } else if (var3.isOnline && var1.isOnline) {
                        if (var3.type > var1.type) {
                            var4 = var3;
                            var3 = var1;
                            var1 = var4;
                            vClan.setElementAt(var4, var0);
                            vClan.setElementAt(var3, var2);
                        } else if (var3.type == var1.type) {
                            if (var3.pointClan > var1.pointClan) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            } else if (var1.pointClan == var3.pointClan) {
                                if (var3.pointClanWeek > var1.pointClanWeek) {
                                    var4 = var3;
                                    var3 = var1;
                                    var1 = var4;
                                    vClan.setElementAt(var4, var0);
                                    vClan.setElementAt(var3, var2);
                                } else if (var1.pointClanWeek == var3.pointClanWeek) {
                                    if (var3.level > var1.level) {
                                        var4 = var3;
                                        var3 = var1;
                                        var1 = var4;
                                        vClan.setElementAt(var4, var0);
                                        vClan.setElementAt(var3, var2);
                                    } else if (var1.level == var3.level && var1.name.compareTo(var3.name) > 0) {
                                        var4 = var3;
                                        var3 = var1;
                                        var1 = var4;
                                        vClan.setElementAt(var4, var0);
                                        vClan.setElementAt(var3, var2);
                                    }
                                }
                            }
                        }
                    }
                } else if (gq) {
                    if (gp) {
                        if (var3.isOnline && !var1.isOnline) {
                            var4 = var3;
                            var3 = var1;
                            var1 = var4;
                            vClan.setElementAt(var4, var0);
                            vClan.setElementAt(var3, var2);
                        } else if (var3.isOnline && var1.isOnline) {
                            if (var3.pointClanWeek > var1.pointClanWeek) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            } else if (var1.pointClanWeek == var3.pointClanWeek) {
                                if (var3.pointClan > var1.pointClan) {
                                    var4 = var3;
                                    var3 = var1;
                                    var1 = var4;
                                    vClan.setElementAt(var4, var0);
                                    vClan.setElementAt(var3, var2);
                                } else if (var1.pointClan == var3.pointClan) {
                                    if (var3.type > var1.type) {
                                        var4 = var3;
                                        var3 = var1;
                                        var1 = var4;
                                        vClan.setElementAt(var4, var0);
                                        vClan.setElementAt(var3, var2);
                                    } else if (var3.type == var1.type && var1.level == var3.level && var1.name.compareTo(var3.name) > 0) {
                                        var4 = var3;
                                        var3 = var1;
                                        var1 = var4;
                                        vClan.setElementAt(var4, var0);
                                        vClan.setElementAt(var3, var2);
                                    }
                                }
                            }
                        }
                    } else if (var3.pointClanWeek > var1.pointClanWeek) {
                        var4 = var3;
                        var3 = var1;
                        var1 = var4;
                        vClan.setElementAt(var4, var0);
                        vClan.setElementAt(var3, var2);
                    } else if (var1.pointClanWeek == var3.pointClanWeek) {
                        if (var3.pointClan > var1.pointClan) {
                            var4 = var3;
                            var3 = var1;
                            var1 = var4;
                            vClan.setElementAt(var4, var0);
                            vClan.setElementAt(var3, var2);
                        } else if (var1.pointClan == var3.pointClan) {
                            if (var3.type > var1.type) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            } else if (var3.type == var1.type && var1.level == var3.level && var1.name.compareTo(var3.name) > 0) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            }
                        }
                    }
                } else if (var3.type > var1.type) {
                    var4 = var3;
                    var3 = var1;
                    var1 = var4;
                    vClan.setElementAt(var4, var0);
                    vClan.setElementAt(var3, var2);
                } else if (var3.type == var1.type) {
                    if (var3.pointClan > var1.pointClan) {
                        var4 = var3;
                        var3 = var1;
                        var1 = var4;
                        vClan.setElementAt(var4, var0);
                        vClan.setElementAt(var3, var2);
                    } else if (var1.pointClan == var3.pointClan) {
                        if (var3.pointClanWeek > var1.pointClanWeek) {
                            var4 = var3;
                            var3 = var1;
                            var1 = var4;
                            vClan.setElementAt(var4, var0);
                            vClan.setElementAt(var3, var2);
                        } else if (var1.pointClanWeek == var3.pointClanWeek) {
                            if (var3.level > var1.level) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            } else if (var1.level == var3.level && var1.name.compareTo(var3.name) > 0) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            }
                        }
                    }
                }
            }
        }

    }

    public static void z() {
        for (int var0 = 0; var0 < Char.getMyChar().vSkillFight.size() - 1; ++var0) {
            Skill var1 = (Skill) Char.getMyChar().vSkillFight.elementAt(var0);

            for (int var2 = var0 + 1; var2 < Char.getMyChar().vSkillFight.size(); ++var2) {
                Skill var3;
                if ((var3 = (Skill) Char.getMyChar().vSkillFight.elementAt(var2)).template.id < var1.template.id) {
                    Skill var4 = var3;
                    var3 = var1;
                    var1 = var4;
                    Char.getMyChar().vSkillFight.setElementAt(var4, var0);
                    Char.getMyChar().vSkillFight.setElementAt(var3, var2);
                }
            }
        }

    }

    private static void k(int var0) {
        Char.getMyChar().cvy = Char.getMyChar().canJumpHigh ? -10 : -8;
        Char.getMyChar().cvx = var0;
        Char.getMyChar().statusMe = 3;
        Char.getMyChar().cp1 = 0;
    }

    public final void update() {
        if (ep != 0 && !GameCanvas.a) {
            if (NSOT_MOB.b == null) {
                gW23 += NinjaUtil.randomNumber();
                if (++eq > 20) {
                    ep = 0;
                    eq = 0;
                }
            } else {
                ep = 0;
                eq = 0;
            }
        } else if (gW23 != gH6 || gH2 != cmx) {
            if (NSOT_MOB.b == null) {
                if (!en) {
                    gW34 = gH6 - gW23 << 2;
                    gW6 = cmx - gH2 << 2;
                } else {
                    gW34 = gH6 - gW23 << 1;
                    gW6 = cmx - gH2 << 2;
                }

                csPadMaxH += gW34;
                gW23 += csPadMaxH >> 4;
                csPadMaxH &= 15;
                cmdBarH += gW6;
                gH2 += cmdBarH >> 4;
                cmdBarH &= 15;
            } else {
                gW23 = gH6;
                gH2 = cmx;
            }

            if (gW23 < 24) {
                gW23 = 24;
            }

            if (gW23 > cmy) {
                gW23 = cmy;
            }

            if (gH2 < 0) {
                gH2 = 0;
            }

            if (gH2 > cmdx) {
                gH2 = cmdx;
            }
        }

        if ((cmdy = gW23 / TileMap.i - 1) < 0) {
            cmdy = 0;
        }

        cmvx = gH2 / TileMap.i;
        cmvy = cmdy + gssw;
        p = cmvx + gssh;
        if (cmvx < 0) {
            cmvx = 0;
        }

        if (p > TileMap.b - 1) {
            p = TileMap.b - 1;
        }

        if ((TileMap.z = (Char.getMyChar().cx - 2 * gW) / TileMap.i) < 0) {
            TileMap.z = 0;
        }

        if ((TileMap.aa = TileMap.z + TileMap.ad) > TileMap.a) {
            TileMap.aa = TileMap.a;
            TileMap.z = TileMap.a - TileMap.ad;
        }

        if ((TileMap.ab = (Char.getMyChar().cy - 2 * gH) / TileMap.i) < 0) {
            TileMap.ab = 0;
        }

        if ((TileMap.ac = TileMap.ab + TileMap.ae) > TileMap.b) {
            TileMap.ac = TileMap.b;
            TileMap.ab = TileMap.b - TileMap.ae;
        }

        aq.c();
        scrInfo.c();
        ChatTextField var1;
        if ((var1 = ChatTextField.gI()).isShow) {
            var1.tfChat.d();
            if (var1.tfChat.i) {
                var1.tfChat.i = false;
                var1.parentScreen.onChatFromMe(var1.tfChat.e(), var1.g);
                var1.tfChat.a("");
                var1.right.caption = mResources.aq;
            }
        }

        TileMap.c();
        TileMap.g();
        GameCanvas.g();
        int var2;
        Char var6;
        if (GameCanvas.c) {
            MyVector var3 = new MyVector();
            long var4 = System.currentTimeMillis();

            for (var2 = 0; var2 < vCharInMap.size(); ++var2) {
                (var6 = (Char) vCharInMap.elementAt(var2)).update();
                if (var6.isPaint()) {
                    if (var6.fz && var4 - var6.cEXP > 10000L && var4 - this.ke > 10000L) {
                        var6.fz = false;
                        var6.cEXP = var4;
                        var3.addElement(var6);
                    }
                } else {
                    var6.cEXP = var4;
                    var6.fz = true;
                }
            }

            if (var3.size() > 0) {
                Service.gI().requestPlayerInfo(var3);
                this.ke = var4;
            }
        } else {
            for (var2 = 0; var2 < vCharInMap.size(); ++var2) {
                ((Char) vCharInMap.elementAt(var2)).update();
            }
        }

        Char.getMyChar().update();
        if (Char.getMyChar().cHp <= 0 && TileMap.ah && !Class_cl.a) {
            TileMap.i();
        }

        if (Char.getMyChar().statusMe == 1 && GameCanvas.u % 100 == 0) {
            System.gc();
        }

        for (var2 = 0; var2 < vMobAttack.size(); ++var2) {
            ((Mob) vMobAttack.elementAt(var2)).update();
        }

        for (var2 = 0; var2 < vSet.size(); ++var2) {
            ((Npc) vSet.elementAt(var2)).update();
        }

        GameCanvas.c().s();

        int var7;
        int[] var8;
        for (var7 = 0; var7 < 5; ++var7) {
            if (lh[var7] != -1) {
                var8 = lh;
                var8[var7] += Res.abs(lg[var7]);
                if (lh[var7] > 30) {
                    lh[var7] = -1;
                }

                var8 = ld;
                var8[var7] += lf[var7];
                var8 = le;
                var8[var7] += lg[var7];
            }
        }

        for (var7 = 0; var7 < vNpc.size(); ++var7) {
            Class_fh var5;
            Class_fh var12 = var5 = (Class_fh) vNpc.elementAt(var7);
            var12.b -= var5.c;
            if (var5.d - var5.b > 150) {
                var5.e = true;
            }

            if (((Class_fh) vNpc.elementAt(var7)).e) {
                vNpc.removeElementAt(var7);
            }
        }

        for (var7 = 0; var7 < 2; ++var7) {
            if (ll[var7] != -1) {
                int var10003 = ll[var7]++;
                var8 = lj;
                var8[var7] += ln[var7] << 2;
                var10003 = lk[var7]--;
                if (ll[var7] >= 6) {
                    ll[var7] = -1;
                } else {
                    lm[var7] = (ll[var7] >> 1) % 3;
                }
            }
        }

        if (indexMenu != -1) {
            if (nv != 0) {
                ny = 0 - nv << 2;
                nx += ny;
                nv += nx >> 4;
                nx &= 15;
            }

            if (Math.abs(0 - nv) < 15 && nv < 0) {
                nw = 0;
            }

            if (Math.abs(0 - nv) < 15 && nv > 0) {
                nw = 0;
            }
        }

        GameCanvas.h();

        for (var2 = 0; var2 < vItemMap.size(); ++var2) {
            ItemMap var9;
            if ((var9 = (ItemMap) vItemMap.elementAt(var2)).i == 2 && var9.x == var9.xEnd && var9.y == var9.yEnd) {
                vItemMap.removeElement(var9);
                if (Char.getMyChar().itemFocus != null && Char.getMyChar().itemFocus.equals(var9)) {
                    Char.getMyChar().itemFocus = null;
                }
            } else if (var9.i <= 0) {
                var9.i = (byte) (var9.i - 4);
                if (var9.i < -12) {
                    var9.y -= 12;
                    var9.i = 1;
                }
            } else {
                if (var9.e == 0) {
                    var9.x = var9.xEnd;
                }

                if (var9.f == 0) {
                    var9.y = var9.yEnd;
                }

                if (var9.x != var9.xEnd) {
                    var9.x += var9.e;
                    if (var9.e > 0 && var9.x > var9.xEnd || var9.e < 0 && var9.x < var9.xEnd) {
                        var9.x = var9.xEnd;
                    }
                }

                if (var9.y != var9.yEnd) {
                    var9.y += var9.f;
                    if (var9.f > 0 && var9.y > var9.yEnd || var9.f < 0 && var9.y < var9.yEnd) {
                        var9.y = var9.yEnd;
                    }
                }
            }

            if (var9.k && System.currentTimeMillis() - var9.l >= 10000L) {
                var9.k = false;
            }
        }

        for (var2 = 0; var2 < vMobSoul.size(); ++var2) {
            ((MobSoul) vMobSoul.elementAt(var2)).update();
        }

        if ((TileMap.a * TileMap.y >= TileMap.q || TileMap.b * TileMap.y >= TileMap.r) && System.currentTimeMillis() / 100L > 20L) {
            TileMap.b();
        }

        for (var2 = Effect2.vRemoveEffect2.size() - 1; var2 >= 0; --var2) {
            Effect2.vEffect2.removeElement(Effect2.vRemoveEffect2.elementAt(var2));
            Effect2.vRemoveEffect2.removeElementAt(var2);
        }

        for (var2 = 0; var2 < Effect2.vEffect2.size(); ++var2) {
            ((Effect2) Effect2.vEffect2.elementAt(var2)).update();
        }

        for (var2 = 0; var2 < Effect2.vEffect2Outside.size(); ++var2) {
            ((Effect2) Effect2.vEffect2Outside.elementAt(var2)).update();
        }

        for (var2 = 0; var2 < Effect2.vAnimateEffect.size(); ++var2) {
            ((Effect2) Effect2.vAnimateEffect.elementAt(var2)).update();
        }

        for (var2 = 0; var2 < Mob.vEggMonter.size(); ++var2) {
            EggMonters var10;
            EggMonters var14;
            if ((var10 = var14 = (EggMonters) Mob.vEggMonter.elementAt(var2)).isPaint()) {
                if (var10.status == 0) {
                    ++var10.vy;
                    var10.y += var10.vy;
                    ++var10.frame;
                    if (var10.frame > 3) {
                        var10.frame = 0;
                    }

                    if ((TileMap.a(var10.x, var10.y) & 2) == 2) {
                        var10.status = 1;
                        var10.vy = 0;
                    }
                } else if (var10.status == 1) {
                    ++var10.frame;
                    if (var10.frame > 6) {
                        var10.frame = 6;
                        EggMonters.ownerEgg.status = 5;
                    }
                }
            }

            if (var14.frame == 6) {
                Mob.vEggMonter.removeElementAt(var2);
            }
        }

        SmallImage.b();
        if (this.dd >= 0 && vCharInMap.size() > 0) {
            int var11;
            if ((var11 = Char.d(this.dd)) >= 0 && var11 < vCharInMap.size()) {
                if ((var6 = (Char) vCharInMap.elementAt(var11)) != null && Char.a(var6) && !var6.isNhanban) {
                    Char.getMyChar().mobFocus = null;
                    Char.getMyChar().y();
                    Char.getMyChar().itemFocus = null;
                    Char.getMyChar();
                    Char.fw = true;
                    Char.getMyChar().charFocus = var6;
                }
            } else {
                this.dd = -1;
                Char.getMyChar().charFocus = null;
            }
        } else {
            this.dd = -1;
        }

        Info.update();
        InfoMe.update();
        if (currentCharViewInfo != null && currentCharViewInfo.charID != Char.getMyChar().charID) {
            currentCharViewInfo.update();
        }

        ++this.kf;
        if (this.kf > 3) {
            this.kf = 0;
        }

        if (gs) {
            gi = 40;
        } else {
            gi = 28;
        }

        EffectAuto.c();
        EffectAuto.d();
        boolean var13 = GameCanvas.av;
    }

    public final void paint(mGraphics var1) {
        if (Char.flag) {
            var1.a(0);
            var1.c(0, 0, GameCanvas.z, GameCanvas.aa);
            mFont.tahoma_7b_yellow.a(var1, mResources.eo, GameCanvas.ab, GameCanvas.ac + 20, 2);
            GameCanvas.a(GameCanvas.ab, GameCanvas.ac, var1);
        } else {
            GameCanvas.paintBGGameScr(var1);
            var1.translate(-gW23, -gH2);

            int var2;
            for (var2 = 0; var2 < eg.size(); ++var2) {
                ((ItemTree) eg.elementAt(var2)).a(var1);
            }

            TileMap.a(var1);

            for (var2 = 0; var2 < eh.size(); ++var2) {
                ((ItemTree) eh.elementAt(var2)).a(var1);
            }

            for (var2 = 0; var2 < vMobAttack.size(); ++var2) {
                ((Mob) vMobAttack.elementAt(var2)).a(var1);
            }

            for (var2 = 0; var2 < Mob.vEggMonter.size(); ++var2) {
                EggMonters var3;
                if ((var3 = (EggMonters) Mob.vEggMonter.elementAt(var2)).isPaint()) {
                    var1.a(ju, 0, var3.frame << 5, 32, 32, 0, var3.x, var3.y, 33);
                }
            }

            for (var2 = 0; var2 < vMob.size(); ++var2) {
                BuNhin var4;
                BuNhin var16;
                if ((var4 = var16 = (BuNhin) vMob.elementAt(var2)).x >= gW23 && var4.x <= gW23 + gW && var4.y >= gH2 && var4.y <= gH2 + gH + 30) {
                    mFont.tahoma_7_yellow.a(var1, var16.name, var16.x, var16.y - 32, 2, mFont.tahoma_7_grey);
                    SmallImage.drawSmallImageNew(var1, 1180, var16.x, var16.y, 0, 33);
                    if (var16.isInjure) {
                        SmallImage.drawSmallImageNew(var1, 288, var16.x, var16.y, 0, 33);
                        var16.isInjure = false;
                    }
                }
            }

            for (var2 = 0; var2 < vSet.size(); ++var2) {
                ((Npc) vSet.elementAt(var2)).paint(var1);
            }

            mGraphics var17 = var1;
            GameScr var18 = this;

            int var5;
            int var6;
            for (var5 = 0; var5 < TileMap.vGo.size(); ++var5) {
                Waypoint var7;
                if ((var7 = (Waypoint) TileMap.vGo.elementAt(var5)).minY != 0 && var7.maxY < TileMap.d - 24) {
                    if (var7.maxX <= TileMap.c / 2) {
                        if (!GameCanvas.isTouch) {
                            SmallImage.drawSmallImageNew(var17, 1213, var7.maxX + 12 + var18.kf, var7.maxY - 12, 2, StaticObj.VCENTER_HCENTER);
                        } else {
                            SmallImage.drawSmallImageNew(var17, 1213, var7.maxX + 12 + var18.kf, var7.maxY - 32, 2, StaticObj.VCENTER_HCENTER);
                        }
                    } else if (var7.minX >= TileMap.c / 2) {
                        if (!GameCanvas.isTouch) {
                            SmallImage.drawSmallImageNew(var17, 1213, var7.minX - 12 - var18.kf, var7.maxY - 12, 0, StaticObj.VCENTER_HCENTER);
                        } else {
                            SmallImage.drawSmallImageNew(var17, 1213, var7.minX - 12 - var18.kf, var7.maxY - 32, 0, StaticObj.VCENTER_HCENTER);
                        }
                    }
                } else if (var7.maxY <= TileMap.d / 2) {
                    var6 = var7.minX + (var7.maxX - var7.minX) / 2;
                    var2 = var7.minY + (var7.maxY - var7.minY) / 2 + var18.kf;
                    if (GameCanvas.isTouch) {
                        var2 = var7.maxY + (var7.maxY - var7.minY) + var18.kf + 10;
                    }

                    SmallImage.drawSmallImageNew(var17, 1213, var6, var2, 6, StaticObj.VCENTER_HCENTER);
                } else if (var7.minY >= TileMap.d / 2) {
                    SmallImage.drawSmallImageNew(var17, 1213, var7.minX + (var7.maxX - var7.minX) / 2, var7.minY - 12 - var18.kf, 4, StaticObj.VCENTER_HCENTER);
                }
            }

            var1.d(0, -200, GameCanvas.z - var1.b(), 200 + GameCanvas.aa - var1.c());
            GameCanvas.c().b(var1);

            for (var2 = 0; var2 < vCharInMap.size(); ++var2) {
                Char var19 = null;

                try {
                    var19 = (Char) vCharInMap.elementAt(var2);
                } catch (Exception var14) {
                }

                if (var19 != null) {
                    if (TileMap.mapID == 111 && var2 > 19) {
                        var19.c(var1);
                    } else {
                        var19.paint(var1);
                    }
                }
            }

            for (var2 = 0; var2 < vParty.size(); ++var2) {
                Party var20;
                if ((var20 = (Party) vParty.elementAt(var2)).c != null && var20.c != Char.getMyChar()) {
                    var20.c.b(var1);
                }
            }

            mGraphics var22 = var1;

            for (var2 = 0; var2 < 5; ++var2) {
                if (lh[var2] != -1 && GameCanvas.e(ld[var2], le[var2])) {
                    if (li[var2] == 0) {
                        mFont.number_red.a(var22, lc[var2], ld[var2], le[var2], 2);
                    } else if (li[var2] == 1) {
                        mFont.number_yellow.a(var22, lc[var2], ld[var2], le[var2], 2);
                    } else if (li[var2] == 2) {
                        mFont.number_green.a(var22, lc[var2], ld[var2], le[var2], 2);
                    } else if (li[var2] == 3) {
                        mFont.tahoma_7b_yellow.a(var22, lc[var2], ld[var2], le[var2], 2, mFont.tahoma_7b_blue);
                    } else if (li[var2] == 8) {
                        mFont.tahoma_7b_white.a(var22, lc[var2], ld[var2], le[var2], 2, mFont.tahoma_7b_blue);
                    } else if (li[var2] == 4) {
                        SmallImage.drawSmallImageNew(var22, 1062, ld[var2], le[var2], 0, 3);
                    } else if (li[var2] == 5) {
                        mFont.number_orange.a(var22, lc[var2], ld[var2], le[var2], 2);
                    } else if (li[var2] == 6) {
                        mFont.tahoma_7_yellow.a(var22, lc[var2], ld[var2], le[var2], 2, mFont.tahoma_7_red);
                    } else if (li[var2] == 7) {
                        SmallImage.drawSmallImageNew(var22, 655, ld[var2], le[var2], 0, 3);
                    }
                }
            }

            var22 = var1;

            for (var2 = 0; var2 < vNpc.size(); ++var2) {
                Class_fh var8 = (Class_fh) vNpc.elementAt(var2);
                if (GameCanvas.u % 10 < 8) {
                    SmallImage.drawSmallImageNew(var22, 1292, var8.a, var8.b, 0, 3);
                } else {
                    SmallImage.drawSmallImageNew(var22, 1291, var8.a, var8.b, 0, 3);
                }
            }

            var22 = var1;

            for (var2 = 0; var2 < 2; ++var2) {
                if (ll[var2] != -1) {
                    if (ln[var2] == 1) {
                        var22.a(lo[lm[var2]], lj[var2], lk[var2], 3);
                    } else {
                        var22.a(lo[lm[var2]], 0, 0, mGraphics.a(lo[lm[var2]]), mGraphics.b(lo[lm[var2]]), 2, lj[var2], lk[var2], 3);
                    }
                }
            }

            Char.getMyChar().paint(var1);
            var17 = var1;
            var18 = this;
            if (Char.getMyChar().isCaptcha) {
                for (var6 = 0; var6 < var18.pj.length; ++var6) {
                    if (var18.pj[var6] != -1) {
                        byte var21 = 0;
                        if (var18.pj[var6] == 0) {
                            var21 = 2;
                        } else if (var18.pj[var6] == 1) {
                            var21 = 6;
                        } else if (var18.pj[var6] == 2) {
                            var21 = 0;
                        }

                        SmallImage.drawSmallImageNew(var17, 989, Char.getMyChar().cx + var6 * 10 - (var18.pj.length - 1) * 10 / 2, Char.getMyChar().cy - 40, var21, 3);
                    }
                }
            }

            byte var24;
            for (var2 = 0; var2 < vItemMap.size(); ++var2) {
                ItemMap var9;
                if ((var9 = (ItemMap) vItemMap.elementAt(var2)).imgCaptcha != null && var9.imgCaptcha.img != null) {
                    var24 = 0;
                    if (var9.i <= 0) {
                        var24 = var9.i;
                    }

                    var1.a(var9.imgCaptcha.img, var9.x, var9.y + var24, 33);
                } else {
                    var24 = 0;
                    if (var9.i <= 0) {
                        var24 = var9.i;
                    }

                    SmallImage.drawSmallImageNew(var1, var9.template.iconID, var9.x, var9.y + var24, 0, 33);
                    if (Char.getMyChar().itemFocus != null && Char.getMyChar().itemFocus.equals(var9) && var9.i != 2) {
                        SmallImage.drawSmallImageNew(var1, 988, var9.x, var9.y - 20, 0, 3);
                    }
                }
            }

            for (var2 = 0; var2 < vMobSoul.size(); ++var2) {
                ((MobSoul) vMobSoul.elementAt(var2)).paint(var1);
            }

            TileMap.c(var1);
            if (NSOT_MOB.h > 0) {
                var1.a(16711680);
                var1.c(NSOT_MOB.i - NSOT_MOB.h, NSOT_MOB.j - NSOT_MOB.h, NSOT_MOB.h << 1, NSOT_MOB.h << 1, 0, 360);
            }

            // vòng xanh kc nhặt
//         if (Class_cx.g > 0) {
//            var1.a(65280);
//            var1.c(Class_at.h().j - Class_cx.g, Class_at.h().k - Class_cx.g, Class_cx.g << 1, Class_cx.g << 1, 0, 360);
//         }

            for (var2 = 0; var2 < Effect2.vEffect2.size(); ++var2) {
                ((Effect2) Effect2.vEffect2.elementAt(var2)).paint(var1);
            }

            for (var2 = 0; var2 < ef.size(); ++var2) {
                ((ItemTree) ef.elementAt(var2)).a(var1);
            }

            if (!GameCanvas.a) {
                for (var2 = 0; var2 < Effect2.vAnimateEffect.size(); ++var2) {
                    ((Effect2) Effect2.vAnimateEffect.elementAt(var2)).paint(var1);
                }
            }

            var17 = var1;

            int var23;
            try {
                if ((var24 = af()) != -1) {
                    Npc var10 = null;

                    for (var23 = 0; var23 < vSet.size(); ++var23) {
                        Npc var11;
                        if ((var11 = (Npc) vSet.elementAt(var23)).template.npcTemplateId == var24) {
                            if (var10 == null) {
                                var10 = var11;
                            } else if (Res.abs(var11.cx - Char.getMyChar().cx) < Res.abs(var10.cx - Char.getMyChar().cx)) {
                                var10 = var11;
                            }
                        }
                    }

                    if (var10 != null && var10.statusMe != 15 && (var10.cx <= gW23 || var10.cx >= gW23 + gW || var10.cy <= gH2 || var10.cy >= gH2 + gH) && GameCanvas.u % 10 >= 5) {
                        var23 = var10.cx - Char.getMyChar().cx;
                        var5 = var10.cy - Char.getMyChar().cy;
                        var6 = 0;
                        var2 = 0;
                        byte var26 = 0;
                        if (var23 > 0 && var5 >= 0) {
                            if (Res.abs(var23) >= Res.abs(var5)) {
                                var6 = gW - 10;
                                var2 = gH / 2 + 30;
                                if (GameCanvas.isTouch) {
                                    var2 = gH / 2 + 10;
                                }

                                var26 = 0;
                            } else {
                                var6 = gW / 2;
                                var2 = gH - 10;
                                var26 = 5;
                            }
                        } else if (var23 >= 0 && var5 < 0) {
                            if (Res.abs(var23) >= Res.abs(var5)) {
                                var6 = gW - 10;
                                var2 = gH / 2 + 30;
                                if (GameCanvas.isTouch) {
                                    var2 = gH / 2 + 10;
                                }

                                var26 = 0;
                            } else {
                                var6 = gW / 2;
                                var2 = 10;
                                var26 = 6;
                            }
                        }

                        if (var23 < 0 && var5 >= 0) {
                            if (Res.abs(var23) >= Res.abs(var5)) {
                                var6 = 10;
                                var2 = gH / 2 + 30;
                                if (GameCanvas.isTouch) {
                                    var2 = gH / 2 + 10;
                                }

                                var26 = 3;
                            } else {
                                var6 = gW / 2;
                                var2 = gH - 10;
                                var26 = 5;
                            }
                        } else if (var23 <= 0 && var5 < 0) {
                            if (Res.abs(var23) >= Res.abs(var5)) {
                                var6 = 10;
                                var2 = gH / 2 + 30;
                                if (GameCanvas.isTouch) {
                                    var2 = gH / 2 + 10;
                                }

                                var26 = 3;
                            } else {
                                var6 = gW / 2;
                                var2 = 10;
                                var26 = 6;
                            }
                        }

                        b(var17);
                        SmallImage.drawSmallImageNew(var17, 992, var6, var2, var26, StaticObj.VCENTER_HCENTER);
                    }
                }
            } catch (Exception var15) {
            }

            var17 = var1;
            long var25;
            if (GameCanvas.isTouch) {
                b(var1);
                this.bv();
                var6 = Char.getMyChar().cHp * lw / Char.getMyChar().cMaxHp;
                var2 = Char.getMyChar().cMP * lx / Char.getMyChar().cMaxMP;
                var23 = (int) (Char.getMyChar().ae * (long) ly / exps[Char.getMyChar().clevel]);
                if (var6 > lw) {
                    var6 = 0;
                }

                var1.a(-10585344);
                var1.c(0, lv - 10, ly, 3);
                var1.a(-10427136);
                var1.c(0, lv - 10, var23, 3);
                var1.a(-9756672);
                var1.c(0, lv - 10, ly, 1);
                var1.c(0, lv - 7, ly, 1);

                for (var5 = 0; var5 < 10; ++var5) {
                    var17.c(var5 * ly / 10 - 1, lv - 10, 1, 3);
                }

                var17.a(-1769452);
                var17.a(jb, lu - 1, lv, 0);
                var17.c(lu, lv, var6, 9);
                var17.a(-16755227);
                var17.a(jb, lu - 28, lv + 13, 0);
                var17.c(lu, lv + 16, var2, 7);
                var17.a(ja, 0, lv - 7, 0);
                mFont.number_white.a(var17, "" + Char.getMyChar().cHp, lu + lw / 2 - 30, lv + 1, 0);
                mFont.number_white.a(var17, "" + Char.getMyChar().cMP, lu + lw / 2 - 30, lv + 15, 0);
                mFont.tahoma_8b.a(var17, "" + Char.getMyChar().clevel, lu - 27, lv + 1, 2);
                if (Char.getMyChar().cExpDown > 0L) {
                    var25 = Char.getMyChar().cExpDown * 10000L / exps[Char.getMyChar().clevel];
                } else {
                    var25 = Char.getMyChar().ae * 10000L / exps[Char.getMyChar().clevel];
                }

                var2 = (int) (var25 % 100L);
                mFont.tahoma_7_white.a(var17, (Char.getMyChar().cExpDown > 0L ? "-" + var25 / 100L : "" + var25 / 100L) + "." + (var2 < 10 ? "0" + var2 : String.valueOf(var2)) + "%", lu - 27, lv + 13, 2);
            }

            if (!Char.getMyChar().isCaptcha) {
                this.g(var1);
                b(var1);
                this.f(var1);
                b(var1);
                TileMap.b(var1);
                var1.translate(-var1.b(), -var1.c());
                if (GameCanvas.isTouch && (!GameCanvas.isTouch || GameCanvas.g)) {
                    Paint.a(var1);
                } else {
                    var1.d(0, lp - 4, GameCanvas.z, 100);
                    var1.a(3612190);
                    var1.c(lu - 44, lv, 19, 19);
                    var1.a(265220);
                    var1.c(lr, lp + 35, lt, 1);
                    var1.c(lr, lp + 33, lt, 1);
                    var1.c(lr, lp + 30, lt, 1);
                    var1.c(lr, lp + 28, lt, 1);
                    var1.c(lr, lp + 26, lt, 1);
                    var1.c(lr, lp + 12, lt, 1);
                    var1.c(lr, lp + 24, lt, 1);
                    var1.c(lr, lp + 18, lt, 1);
                    var1.c(lr, lp + 16, lt, 1);
                    var1.c(lr, lp + 2, lt, 1);
                    var1.c(lr, lp + 4, lt, 1);
                    var1.c(lr, lp + 6, lt, 1);
                    var1.c(lr, lp + 14, lt, 1);
                    var1.a(12562018);
                    var1.c(lr, lp + 5, lt, 1);
                    var1.c(lr, lp + 17, lt, 1);
                    var1.c(lr, lp + 34, lt, 1);
                    var1.c(lr, lp + 29, lt, 1);
                    var1.a(14667167);
                    var1.c(lr, lp + 3, lt, 1);
                    var1.c(lr, lp + 15, lt, 1);
                    var1.c(lr, lp + 27, lt, 1);
                    var1.a(3355443);
                    var1.c(lr, lp + 7, lt, 5);
                    var1.c(lr, lp + 19, lt, 5);
                    var1.c(lr, lp + 31, lt, 2);
                    var1.a(12281361);
                    var1.c(lr, lp + 25, lt, 1);
                    var1.c(lr, lp + 13, lt, 1);
                    var1.a(ma[0], 0, lp + 2, 0);
                    var1.a(ma[1], 0 + lq, lp - 4, 24);
                    if ((var6 = Char.getMyChar().cHp * lw / Char.getMyChar().cMaxHp) > lw) {
                        var6 = 0;
                    }

                    var1.a(7798784);
                    var1.c(lu, lv, var6, 2);
                    var1.a(13369344);
                    var1.c(lu, lv + 1, var6, 4);
                    if ((var6 = Char.getMyChar().cMP * lw / Char.getMyChar().cMaxMP) > lw) {
                        var6 = 0;
                    }

                    var1.a(4488);
                    var1.c(lu, lv + 12, var6, 2);
                    var1.a(4573);
                    var1.c(lu, lv + 14, var6, lz - 2);
                    var2 = (int) (Char.getMyChar().ae * (long) ly / exps[Char.getMyChar().clevel]);
                    var1.a(94373);
                    var1.c(46, lp + 31, var2, 1);
                    var1.a(65535);
                    var1.c(46, lp + 32, var2, 1);
                    mFont.number_yellow.a(var1, "" + Char.getMyChar().clevel, 28, lp + 9, 2);
                    if (Char.getMyChar().cExpDown > 0L) {
                        var25 = Char.getMyChar().cExpDown * 10000L / exps[Char.getMyChar().clevel];
                    } else {
                        var25 = Char.getMyChar().ae * 10000L / exps[Char.getMyChar().clevel];
                    }

                    var6 = (int) (var25 % 100L);
                    mFont.tahoma_7_white.a(var1, (Char.getMyChar().cExpDown > 0L ? "-" + var25 / 100L : "" + var25 / 100L) + "." + (var6 < 10 ? "0" + var6 : String.valueOf(var6)) + "%", 24, lp + 23, 2);
                    mFont.number_green.a(var1, "" + r, lq - 11, lp + 6, 2);
                    mFont.number_green.a(var1, "" + q, lq - 11, lp + 18, 2);
                    mFont.number_white.a(var1, "" + Char.getMyChar().cHp, lu + lw / 2, lp + 6, 2);
                    mFont.number_white.a(var1, "" + Char.getMyChar().cMP, lu + lw / 2, lp + 18, 2);
                    if (Char.getMyChar().vSkillFight.size() > 0 && Char.getMyChar().myskill != null) {
                        int var12 = lr - 28;
                        int var13 = lv + 7;
                        Char.getMyChar().myskill.paint(var12, var13, var1);
                    }

                    var1.a(9463099);
                    var1.c(0, lp + 35, GameCanvas.z, 1);
                }

                if (GameCanvas.isTouch) {
                    gy = true;
                }

                b(var1);
                this.i(var1);
                b(var1);
                var1.d(0, 0, GameCanvas.z, GameCanvas.aa);

                for (var2 = 0; var2 < Effect2.vEffect2Outside.size(); ++var2) {
                    ((Effect2) Effect2.vEffect2Outside.elementAt(var2)).paint(var1);
                }

                b(var1);
                if (isPaintInfoMe) {
                    if (indexMenu == 0) {
                        this.a(var1, mResources.fr);
                    }

                    this.n(var1);
                    ad(var1);
                    if (indexMenu == 3) {
                        label809:
                        {
                            b(var1);
                            Paint.a(eu, et, ev, ew, var1);
                            if (indexTitle == 1) {
                                var1.a(Paint.COLORDARK);
                                var1.c(eu + 7, et + 32, ev - 14, ew - 40);
                                var1.a(16777215);
                            } else {
                                var1.a(10249521);
                            }

                            var1.b(eu + 7, et + 32, ev - 14, ew - 40);
                            a(var1, mResources.fr[indexMenu], true);
                            nt = eu + 17;
                            nu = et + 34;
                            aq.a(gk, 12, eu, et + 35, ev, ew - 44, true, 1);
                            aq.a(var1);
                            String var27;
                            if (jp == 0) {
                                gk = 19;
                                var6 = nu;
                                if (currentCharViewInfo == null) {
                                    break label809;
                                }

                                mFont.tahoma_7b_white.a(var1, mResources.ix[0] + currentCharViewInfo.cName, nt, var6, 0);
                                var27 = mResources.ix[1] + currentCharViewInfo.cPk;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[2] + currentCharViewInfo.clevel;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[3] + currentCharViewInfo.nClass.name;
                                var6 += 12;
                                mFont.tahoma_7_blue1.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[4] + mResources.ks[currentCharViewInfo.e()];
                                var6 += 12;
                                mFont.tahoma_7_blue1.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[5] + currentCharViewInfo.cHp + "/" + currentCharViewInfo.cMaxHp;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[6] + currentCharViewInfo.cMP + "/" + currentCharViewInfo.cMaxMP;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[7] + currentCharViewInfo.f();
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[8] + (currentCharViewInfo.cdame - currentCharViewInfo.cdame / 10) + "-" + currentCharViewInfo.cdame;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[9] + currentCharViewInfo.cResFire;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[10] + currentCharViewInfo.cResIce;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[11] + currentCharViewInfo.cResWind;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[12] + currentCharViewInfo.cdameDown;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[13] + currentCharViewInfo.cExactly;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[14] + currentCharViewInfo.cMiss;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[15] + currentCharViewInfo.cFatal;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[16] + currentCharViewInfo.cReactDame;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[17] + currentCharViewInfo.sysUp;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ix[18] + currentCharViewInfo.sysDown;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                            } else if (jp == 1) {
                                gk = 20;
                                var6 = nu;
                                if (currentCharViewInfo == null) {
                                    break label809;
                                }

                                mFont.tahoma_7b_white.a(var1, mResources.ja[15] + (currentCharViewInfo.cClanName.equals("") ? mResources.hy : currentCharViewInfo.cClanName), nt, var6, 0);
                                var27 = mResources.ja[0] + currentCharViewInfo.pointUydanh;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[11] + currentCharViewInfo.countFinishDay + "/20";
                                var6 += 12;
                                mFont.tahoma_7_blue1.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[12] + currentCharViewInfo.countLoopBoos + mResources.iy;
                                var6 += 12;
                                mFont.tahoma_7_blue1.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[16] + currentCharViewInfo.countPB + mResources.iy;
                                var6 += 12;
                                mFont.tahoma_7_blue1.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[13] + currentCharViewInfo.limitTiemnangso;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[14] + currentCharViewInfo.limitKynangso;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[18] + currentCharViewInfo.limitPhongLoi + mResources.iy;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[19] + currentCharViewInfo.limitBangHoa + mResources.iy;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[17] + currentCharViewInfo.pointTinhTu;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[1] + currentCharViewInfo.pointVukhi;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[2] + currentCharViewInfo.pointLien;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[3] + currentCharViewInfo.pointNhan;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[4] + currentCharViewInfo.pointNgocboi;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[5] + currentCharViewInfo.pointPhu;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[6] + currentCharViewInfo.pointNon;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[7] + currentCharViewInfo.pointAo;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[8] + currentCharViewInfo.pointGangtay;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[9] + currentCharViewInfo.pointQuan;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                                var27 = mResources.ja[10] + currentCharViewInfo.pointGiay;
                                var6 += 12;
                                mFont.tahoma_7_white.a(var1, var27, nt, var6, 0);
                            }

                            if (indexTitle == 1 && indexRow >= 0) {
                                SmallImage.drawSmallImageNew(var1, 942, nt - 8, nu + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                            }
                        }
                    }

                    this.j(var1);
                    this.k(var1);
                } else if (isPaintUI()) {
                    if (isPaintStore) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.gm, arrItemStore);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.gm, arrItemBook);
                        } else if (indexMenu == 2) {
                            this.a(var1, mResources.gm, arrItemFashion);
                        } else if (indexMenu == 3) {
                            this.a(var1, mResources.gm, arrItemClanShop);
                        }
                    }

                    if (isPaintNonNam) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemNonNam);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.ft);
                        }
                    }

                    if (isPaintNonNu) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemNonNu);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.ft);
                        }
                    }

                    if (isPaintAoNam) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemAoNam);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fu);
                        }
                    }

                    if (isPaintAoNu) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemAoNu);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fu);
                        }
                    }

                    if (isPaintGangTayNam) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemGangTayNam);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fv);
                        }
                    }

                    if (isPaintGangTayNu) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemGangTayNu);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fv);
                        }
                    }

                    if (isPaintQuanNam) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemQuanNam);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fw);
                        }
                    }

                    if (isPaintQuanNu) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fw, arrItemQuanNu);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fw);
                        }
                    }

                    if (isPaintGiayNam) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemGiayNam);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fx);
                        }
                    }

                    if (isPaintGiayNu) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fs, arrItemGiayNu);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fx);
                        }
                    }

                    if (isPaintLien) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fy, arrItemLien);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fy);
                        }
                    }

                    if (isPaintNhan) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.fz, arrItemNhan);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.fz);
                        }
                    }

                    if (isPaintNgocBoi) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.ga, arrItemNgocBoi);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.ga);
                        }
                    }

                    if (isPaintPhu) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.gb, arrItemPhu);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.gb);
                        }
                    }

                    if (isPaintWeapon) {
                        if (indexMenu == 0) {
                            this.a(var1, mResources.gc, arrItemWeapon);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.gc);
                        }
                    }

                    if (isPaintEliteShop) {
                        this.a(var1, mResources.gn, arrItemElites);
                    }

                    this.o(var1);
                    this.p(var1);
                    this.q(var1);
                    this.r(var1);
                    this.s(var1);
                    if (isPaintUpGrade) {
                        if (indexMenu == 0) {
                            this.b(var1, mResources.gh);
                        } else if (indexMenu == 1) {
                            this.a(var1, mResources.gh);
                        }
                    }

                    this.t(var1);
                    ai(var1);
                    this.u(var1);
                    this.v(var1);
                    this.w(var1);
                    this.x(var1);
                    this.z(var1);
                    this.aa(var1);
                    this.ab(var1);
                    this.y(var1);
                    this.aq(var1);
                    this.ar(var1);
                    this.au(var1);
                    this.as(var1);
                    this.at(var1);
                    this.ac(var1);
                } else if (ib) {
                    this.ae(var1);
                }

                c(var1);
                this.ak(var1);
                this.e(var1);
                ah(var1);
                ag(var1);
                aj(var1);
                d(var1);
                this.l(var1);
                this.al(var1);
                an(var1);
                b(var1);
                if (GameCanvas.isTouch && GameCanvas.z >= 320) {
                    if (super.left != null && super.left != this.jx) {
                        super.left.x = GameCanvas.z / 2 - 160;
                        super.left.y = GameCanvas.aa - 26;
                    }

                    if (super.center != null) {
                        super.center.x = GameCanvas.z / 2 - 35;
                        super.center.y = GameCanvas.aa - 26;
                    }

                    if (super.right != null && super.right != this.ge) {
                        super.right.x = GameCanvas.z / 2 + 88;
                        super.right.y = GameCanvas.aa - 26;
                    }
                }
            }

            super.paint(var1);
            if (GameCanvas.isTouch && GameCanvas.g) {
                this.h(var1);
                gy = true;
            }

            b(var1);
            this.af(var1);
            b(var1);
            this.ao(var1);
            b(var1);
            Info.paint(var1);
            b(var1);
            ChatTextField.gI().paint(var1);
            b(var1);
            InfoMe.paint(var1);
        }

    }

    private static void c(mGraphics var0) {
        if (isPaintAuto) {
            b(var0);
            Paint.a(eu, et, ev, ew, var0);
            if (indexTitle == 1) {
                var0.a(Paint.COLORDARK);
                var0.c(eu + 7, et + 32, ev - 14, ew - 55);
                var0.a(16777215);
            } else {
                var0.a(10249521);
            }

            var0.b(eu + 7, et + 32, ev - 14, ew - 55);
            a(var0, mResources.oa[7], false);
            nt = eu + 17;
            nu = et + 45;
            gk = 33;
            aq.a(gk, 30, eu, et + 39, ev, ew - 63, true, 1);
            aq.a(var0);
            int var1 = nu;
            a(var0, mResources.ri[0], Char.timeStartBlink, Char.ek + "%", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[1], Char.isAHP, Char.el + "%", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[2], Char.isAMP, String.valueOf(Char.em), nt, var1);
            var1 += 30;
            a(var0, mResources.ri[3], Char.isAFood, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[4], Char.isABuff, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[5], Char.isAResuscitate, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[6], Char.isAPickYen, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[7], Char.isAPickYHM, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[8], Char.isAPickYHMS, "LV: " + Char.en, nt, var1);
            var1 += 30;
            a(var0, mResources.ri[9], Char.dm, "LV: " + Char.eo, nt, var1);
            var1 += 30;
            a(var0, mResources.ri[10], Char.dn, "LV: " + Char.ep, nt, var1);
            var1 += 30;
            a(var0, mResources.ri[11], Char.doa, "LV: " + Char.eq, nt, var1);
            var1 += 30;
            a(var0, mResources.ri[13], Char.dp, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[14], Char.dq, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[15], Char.dr, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[16], Char.ds, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[17], Char.dt, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[20], Char.du, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[21], Char.dv, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[22], Char.dw, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[23], Char.dx, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[24], Char.dy, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[25], Char.dz, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[26], Char.ea, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[27], Char.eb, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[28], Char.ec, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[29], Char.ed, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[30], Char.ee, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[31], Char.ef, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[32], Char.eg, "", nt, var1);
            var1 += 30;
            a(var0, mResources.ri[33], Char.eh, "", nt, var1);
            var1 += 30;
            a(var0, "Tải tại nsotiensv4.com", true, "", nt, var1);
            if (indexTitle == 1 && indexRow >= 0 && !GameCanvas.isTouch) {
                SmallImage.drawSmallImageNew(var0, 942, nt - 8, nu + 2 + indexRow * 30, 0, StaticObj.TOP_LEFT);
            }

            b(var0);
            mFont.tahoma_7_green.a(var0, GameCanvas.isTouch ? mResources.rk : mResources.rj, eu + ev / 2, et + ew - 17, 2);
        }

    }

    private static void a(mGraphics var0, String var1, boolean var2, String var3, int var4, int var5) {
        var0.a(16777215);
        var0.c(var4, var5, 12, 12);
        if (var2) {
            var0.a(9650442);
            var0.a(var4 + 2, var5 + 2, var4 + 2 + 7, var5 + 2 + 7);
            var0.a(var4 + 2, var5 + 2 + 7, var4 + 2 + 7, var5 + 2);
        }

        mFont var6;
        (var6 = var2 ? mFont.tahoma_7_white : mFont.tahoma_7_grey).a(var0, var1, var4 + 18, var5, 0);
        if (!var3.equals("")) {
            var0.a(Paint.COLORLIGHT);
            var0.c(var4 + 115, var5 - 3, 30, 20);
            var0.a(var2 ? 16777215 : 0);
            var0.b(var4 + 115, var5 - 3, 30, 20);
            var6.a(var0, var3, var4 + 133, var5 + 2, 2);
        }

    }

    private static void d(mGraphics var0) {
        if (isPaintList) {
            Paint.a(eu, et, ev, ew, var0);
            a(var0, mResources.doa, false);
            nt = eu + 5;
            nu = et + 40;
            if (vList.size() == 0) {
                mFont.tahoma_7_white.a(var0, mResources.nx, eu + ev / 2, et + 40, 2);
                return;
            }

            var0.a(-16770791);
            var0.c(nt - 2, nu - 2, ev - 6, gi * 5 + 8);
            b(var0);
            aq.a(vList.size(), gi, nt, nu, ev - 3, gi * 5 + 4, true, 1);
            aq.a(var0, nt, nu, ev - 3, gi * 5 + 6);
            gk = vList.size();

            for (int var1 = 0; var1 < vList.size(); ++var1) {
                DunItem var2 = null;

                try {
                    var2 = (DunItem) vList.elementAt(var1);
                } catch (Exception var4) {
                }

                if (var2 != null) {
                    if (indexRow == var1) {
                        var0.a(Paint.COLORLIGHT);
                        var0.c(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                        var0.a(16777215);
                        var0.b(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                    } else {
                        var0.a(Paint.COLORBACKGROUND);
                        var0.c(nt + 2, nu + var1 * gi + 2, ev - 15, gi - 4);
                        var0.a(13932896);
                        var0.b(nt + 2, nu + var1 * gi + 2, ev - 15, gi - 4);
                    }

                    mFont.tahoma_7_yellow.a(var0, var2.name1, nt + (ev - 10) / 2 - ev / 4, nu + var1 * gi + gi / 2 - 6, 2);
                    mFont.tahoma_7b_red.a(var0, " vs ", nt + (ev - 10) / 2, nu + var1 * gi + gi / 2 - 6, 2);
                    mFont.tahoma_7_yellow.a(var0, var2.name2, nt + (ev - 10) / 2 + ev / 4, nu + var1 * gi + gi / 2 - 6, 2);
                }
            }

            m(var0);
        }

    }

    private void e(mGraphics var1) {
        if (isPaintCharInMap) {
            Paint.a(eu, et, ev, ew, var1);
            a(var1, mResources.doa, false);
            nt = eu + 5;
            nu = et + 40;
            if (vCharInMap.size() == 0) {
                mFont.tahoma_7_white.a(var1, mResources.lp, eu + ev / 2, et + 40, 2);
                return;
            }

            var1.a(-16770791);
            var1.c(nt - 2, nu - 2, ev - 6, gi * 5 + 8);
            b(var1);
            aq.a(vCharInMap.size(), gi, nt, nu, ev - 3, gi * 5 + 4, true, 1);
            aq.a(var1, nt, nu, ev - 3, gi * 5 + 6);
            gk = vCharInMap.size();

            for (int var2 = 0; var2 < vCharInMap.size(); ++var2) {
                Char var3 = null;

                try {
                    if ((var3 = (Char) vCharInMap.elementAt(var2)).isNhanban) {
                        continue;
                    }
                } catch (Exception var5) {
                }

                if (var3 != null) {
                    if (indexRow == var2) {
                        var1.a(Paint.COLORLIGHT);
                        var1.c(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                        var1.a(16777215);
                        var1.b(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                    } else {
                        var1.a(Paint.COLORBACKGROUND);
                        var1.c(nt + 2, nu + var2 * gi + 2, ev - 15, gi - 4);
                        var1.a(13932896);
                        var1.b(nt + 2, nu + var2 * gi + 2, ev - 15, gi - 4);
                    }

                    SmallImage.drawSmallImageNew(var1, 647, nt + 12, nu + var2 * gi + gi / 2, 0, 3);
                    if (this.dd > 0 && this.dd == var3.charID) {
                        mFont.tahoma_7_yellow.a(var1, var3.cName + " - " + mResources.eg + ": " + var3.clevel, nt + 22, nu + var2 * gi + gi / 2 - 6, 0);
                    } else if (var3.statusMe == 14) {
                        mFont.tahoma_7_grey.a(var1, var3.cName + " - " + mResources.eg + ": " + var3.clevel, nt + 22, nu + var2 * gi + gi / 2 - 6, 0);
                    } else {
                        mFont.tahoma_7_green.a(var1, var3.cName + " - " + mResources.eg + ": " + var3.clevel, nt + 22, nu + var2 * gi + gi / 2 - 6, 0);
                    }
                }
            }

            m(var1);
        }

    }

    private void f(mGraphics var1) {
        try {
            int var2 = (int) (System.currentTimeMillis() / 1000L);
            int var3 = 5;
            if (GameCanvas.isTouch && GameCanvas.g) {
                var3 = 45 + Info.hI;
            }

            if (GameCanvas.h && Char.getMyChar().vSkillFight.size() > 4) {
                var3 += 25;
            }

            b(var1);
            if (!GameCanvas.isTouchControlLargeScreen) {
                int var4;
                for (int var5 = 0; var5 < Char.getMyChar().vEff.size(); ++var5) {
                    Effect var6 = (Effect) Char.getMyChar().vEff.elementAt(var5);
                    SmallImage.drawSmallImageNew(var1, var6.template.iconId, GameCanvas.z - 13 - (var5 * 13 << 1), var3 + 14, 0, 33);
                    var4 = var2 - var6.timeStart;
                    int var7 = var6.timeLenght - (var2 - var6.timeStart);
                    var4 = var6.timeLenght - var4;
                    if (var7 >= 0) {
                        mFont.tahoma_7_white.a(var1, NinjaUtil.getTime(var4), GameCanvas.z - 13 - (var5 * 13 << 1), var3 + 15, 2, mFont.tahoma_7_grey);
                    }
                }

                var4 = this.dx - (var2 - this.dy);
                if (Char.getMyChar().vEff.size() > 0) {
                    var3 += 27;
                }

                if (var4 > 0) {
                    mFont.tahoma_7_white.a(var1, mResources.dp + ": " + NinjaUtil.getTime(var4), GameCanvas.z - 2, var3, 1, mFont.tahoma_7_grey);
                    var3 += 12;
                }

                if (TileMap.typeMap == 1) {
                    mFont.tahoma_7_white.a(var1, mResources.dq + ": " + Char.getMyChar().countKill, GameCanvas.z - 2, var3, 1, mFont.tahoma_7_grey);
                    var3 += 12;
                    mFont.tahoma_7_white.a(var1, mResources.dr + ": " + Char.getMyChar().countKillMax, GameCanvas.z - 2, var3, 1, mFont.tahoma_7_grey);
                    var3 += 12;
                } else if (TileMap.typeMap != 2 && TileMap.mapID != 114 && TileMap.mapID != 115 && TileMap.mapID != 116) {
                    if (TileMap.typeMap == 3) {
                        mFont.tahoma_7_white.a(var1, mResources.ds + ": " + Char.pointChienTruong, GameCanvas.z - 2, var3, 1, mFont.tahoma_7_grey);
                        var3 += 12;
                        mFont.tahoma_7_white.a(var1, mResources.iz[Char.getCT()], GameCanvas.z - 2, var3, 1, mFont.tahoma_7_grey);
                        var3 += 12;
                    }
                } else {
                    mFont.tahoma_7_white.a(var1, mResources.ds + ": " + Char.et, GameCanvas.z - 2, var3, 1, mFont.tahoma_7_grey);
                    var3 += 12;
                }
            }

            if (vParty.size() > 0 && GameCanvas.z > 128 && !isPaintUI()) {
                var3 -= 18;

                for (var2 = 0; var2 < vParty.size(); ++var2) {
                    Party var9;
                    if ((var9 = (Party) vParty.elementAt(var2)).c != null) {
                        String var10 = var9.name + "(" + var9.c.clevel + ")";
                        int var11 = GameCanvas.z - 14;
                        var3 += 18;
                        mFont.tahoma_7_white.a(var1, var10, var11, var3, 1, mFont.tahoma_7_grey);
                        var9.c.a(var1, GameCanvas.z - 41, var3 + 12);
                        SmallImage.drawSmallImageNew(var1, var9.iconId, GameCanvas.z - 7, var3 + 9, 0, 3);
                    } else {
                        var3 += 16;
                        mFont.tahoma_7_green.a(var1, var9.name, GameCanvas.z - 14, var3 + 5, 1, mFont.tahoma_7_grey);
                        SmallImage.drawSmallImageNew(var1, var9.iconId, GameCanvas.z - 7, var3 + 11, 0, 3);
                    }
                }

                return;
            }
        } catch (Exception var8) {
        }

    }

    public static void b(mGraphics var0) {
        var0.translate(-var0.b(), -var0.c());
        var0.d(0, -200, GameCanvas.z, 200 + GameCanvas.aa);
    }

    private void g(mGraphics var1) {
        try {
            if (!GameCanvas.menu.showMenu && !InfoDlg.isShow && !ci()) {
                int var2 = -7;
                int var3 = 3;
                if ((!GameCanvas.isTouch || GameCanvas.isTouch && !GameCanvas.g) && gy) {
                    var3 += 30;
                }

                if (GameCanvas.isTouch) {
                    var2 = 38 + Info.hI;
                    if (GameCanvas.h) {
                        var2 += 35;
                    }
                }

                var1.translate(-var1.b(), -var1.c());
                int var4;
                String var5;
                if (GameCanvas.isTouchControlLargeScreen) {
                    int var6 = (int) (System.currentTimeMillis() / 1000L);

                    for (int var7 = 0; var7 < Char.getMyChar().vEff.size(); ++var7) {
                        Effect var8 = (Effect) Char.getMyChar().vEff.elementAt(var7);
                        SmallImage.drawSmallImageNew(var1, var8.template.iconId, var3 + 13 + (var7 * 13 << 1), var2 + 27, 0, 33);
                        int var9 = var6 - var8.timeStart;
                        int var10 = var8.timeLenght - (var6 - var8.timeStart);
                        var4 = var8.timeLenght - var9;
                        if (var10 >= 0) {
                            mFont.tahoma_7_white.a(var1, NinjaUtil.getTime(var4), var3 + 13 + (var7 * 13 << 1), var2 + 28, 2, mFont.tahoma_7_grey);
                        }
                    }

                    var4 = this.dx - (var6 - this.dy);
                    if (Char.getMyChar().vEff.size() > 0) {
                        var2 += 27;
                    }

                    if (var4 > 0) {
                        var5 = mResources.dp + ": " + NinjaUtil.getTime(var4);
                        var2 += 12;
                        mFont.tahoma_7_white.a(var1, var5, var3, var2, 0, mFont.tahoma_7_grey);
                    }
                }

                String var12;
                if (Char.getMyChar().clevel <= 20) {
                    if (Char.getMyChar().pPoint > 0) {
                        var12 = "+" + Char.getMyChar().pPoint + " " + mResources.dk;
                        var2 += 12;
                        mFont.tahoma_7_yellow.a(var1, var12, var3, var2, 0, mFont.tahoma_7_grey);
                    }

                    if (Char.getMyChar().sPoint > 0) {
                        var12 = "+" + Char.getMyChar().sPoint + " " + mResources.dl;
                        var2 += 12;
                        mFont.tahoma_7_yellow.a(var1, var12, var3, var2, 0, mFont.tahoma_7_grey);
                    }
                }

                if (NSOT_MOB.b != null) {
                    var2 += 12;
                    mFont.tahoma_7_yellow.a(var1, NSOT_MOB.b.toString(), var3, var2, 0, mFont.tahoma_7_grey);
                }

                if (NSOT_MOB.l) {
                    var2 += 12;
                    mFont.tahoma_7_white.a(var1, "Vị trí: " + (NSOT_MOB.m + 1) + "/" + NSOT_MOB.n.size(), var3, var2, 0, mFont.tahoma_7_grey);
                }

                if (NSOT_MOB.ah > 0L) {
                    var2 += 12;
                    mFont.tahoma_7_yellow.a(var1, "Up Còn: " + NinjaUtil.getTime((int) (NSOT_MOB.ah / 1000L)) + " , IG dk: " + NSOT_MOB.ae, var3, var2, 0, mFont.tahoma_7_grey);
                }

                if (NSOT_MOB.as) {
                    var2 += 12;
                    mFont.tahoma_7_white.a(var1, "Off: " + NSOT_MOB.v + "h" + NSOT_MOB.w + "p On: " + NSOT_MOB.x + "h" + NSOT_MOB.y + "p", var3, var2, 0, mFont.tahoma_7_grey);
                }

                if (ChatManager.gI().waitList.size() > 0) {
                    this.jq[0] = var3;
                    this.jr[0] = var2 + 12;
                    var12 = "+" + ChatManager.gI().waitList.size() + " " + mResources.df;
                    if (GameCanvas.u % 10 > 4) {
                        var2 += 12;
                        mFont.tahoma_7_red.a(var1, var12, var3, var2, 0, mFont.tahoma_7_grey);
                    } else {
                        var2 += 12;
                        mFont.tahoma_7_yellow.a(var1, var12, var3, var2, 0, mFont.tahoma_7_grey);
                    }
                }

                if (ChatManager.e || ChatManager.f) {
                    var12 = "";
                    this.jq[1] = var3;
                    this.jr[1] = var2 + 12;
                    if (ChatManager.e && ChatManager.f) {
                        var12 = mResources.dg[0];
                    } else if (ChatManager.e) {
                        var12 = mResources.dg[1];
                    } else if (ChatManager.f) {
                        var12 = mResources.dg[2];
                    }

                    if (GameCanvas.u % 10 > 7) {
                        var2 += 12;
                        mFont.tahoma_7_red.a(var1, var12, var3, var2, 0, mFont.tahoma_7_grey);
                    } else {
                        var2 += 12;
                        mFont.tahoma_7_yellow.a(var1, var12, var3, var2, 0, mFont.tahoma_7_grey);
                    }
                }

                if (TileMap.typeMap == 3) {
                    if (Char.getMyChar().charFocus != null) {
                        if (Char.getMyChar().charFocus.cTypePk == 4) {
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, mResources.ii, var3, var2, 0, mFont.tahoma_7_grey);
                        } else if (Char.getMyChar().charFocus.cTypePk == 5) {
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, mResources.ij, var3, var2, 0, mFont.tahoma_7_grey);
                        }
                    } else if (Char.getMyChar().mobFocus != null) {
                        if (Char.getMyChar().mobFocus.templateId == 96) {
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, mResources.ij, var3, var2, 0, mFont.tahoma_7_grey);
                        } else if (Char.getMyChar().mobFocus.templateId == 97) {
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, mResources.ii, var3, var2, 0, mFont.tahoma_7_grey);
                        } else {
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, mResources.ik, var3, var2, 0, mFont.tahoma_7_grey);
                        }
                    }
                } else if (Char.getMyChar().isHuman) {
                    if (Char.getMyChar().taskMaint == null) {
                        byte var13;
                        if ((var13 = ae()) >= 0) {
                            var5 = mResources.ih + " " + TileMap.v[var13];
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, var5, var3, var2, 0, mFont.tahoma_7_grey);
                        }
                    } else {
                        var12 = Char.getMyChar().taskMaint.subNames[Char.getMyChar().taskMaint.index];

                        for (var4 = 0; var12 == null; var12 = Char.getMyChar().taskMaint.subNames[Char.getMyChar().taskMaint.index - var4]) {
                            ++var4;
                        }

                        if (Char.getMyChar().taskMaint.counts[Char.getMyChar().taskMaint.index] != -1) {
                            var12 = var12 + " " + Char.getMyChar().taskMaint.count + "/" + Char.getMyChar().taskMaint.counts[Char.getMyChar().taskMaint.index];
                        }

                        if (GameCanvas.v > 0 && GameCanvas.u % 10 > 4) {
                            var2 += 12;
                            mFont.tahoma_7_yellow.a(var1, var12, var3, var2, 0, mFont.tahoma_7_grey);
                        } else {
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, var12, var3, var2, 0, mFont.tahoma_7_grey);
                        }
                    }
                }

                if (Char.getMyChar().mobFocus != null) {
                    MobTemplate var14 = Char.getMyChar().mobFocus.d();
                    var5 = var14.name + " lv" + Char.getMyChar().mobFocus.w;
                    if (Char.getMyChar().mobFocus.templateId != 0 && Char.getMyChar().mobFocus.templateId != 142 && Char.getMyChar().mobFocus.templateId != 143) {
                        var5 = var5 + ": " + Char.getMyChar().mobFocus.hp + "/" + Char.getMyChar().mobFocus.maxHp;
                    }

                    var1.a(Char.getMyChar().mobFocus.f());
                    var2 += 12;
                    var1.c(var3, var2 + 3, 5, 5);
                    var1.a(0);
                    var1.b(var3, var2 + 3, 5, 5);
                    mFont.tahoma_7_white.a(var1, var5, var3 + 12, var2, 0, mFont.tahoma_7_grey);
                } else if (Char.getMyChar().npcFocus != null) {
                    var2 += 12;
                    mFont.tahoma_7_yellow.a(var1, Char.getMyChar().npcFocus.template.name, var3, var2, 0, mFont.tahoma_7_grey);
                } else if (Char.getMyChar().charFocus != null) {
                    var1.a(Char.getMyChar().charFocus.w());
                    var2 += 12;
                    var1.c(var3, var2 + 3, 5, 5);
                    var1.a(0);
                    var1.b(var3, var2 + 3, 5, 5);
                    mFont.tahoma_7_white.a(var1, Char.getMyChar().charFocus.cName + " lv" + Char.getMyChar().charFocus.clevel + ": " + Char.getMyChar().charFocus.cHp + "/" + Char.getMyChar().charFocus.cMaxHp, var3 + 12, var2, 0, mFont.tahoma_7_grey);
                }

                if (GameCanvas.isTouchControlLargeScreen) {
                    if (TileMap.typeMap == 1) {
                        var5 = mResources.dq + ": " + Char.getMyChar().countKill;
                        var2 += 12;
                        mFont.tahoma_7_white.a(var1, var5, var3, var2, 0, mFont.tahoma_7_grey);
                        var5 = mResources.dr + ": " + Char.getMyChar().countKillMax;
                        var2 += 12;
                        mFont.tahoma_7_white.a(var1, var5, var3, var2, 0, mFont.tahoma_7_grey);
                    } else if (TileMap.typeMap != 2 && TileMap.mapID != 114 && TileMap.mapID != 115 && TileMap.mapID != 116) {
                        if (TileMap.typeMap == 3) {
                            var5 = mResources.ds + ": " + Char.pointChienTruong;
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, var5, var3, var2, 0, mFont.tahoma_7_grey);
                            var5 = mResources.iz[Char.getCT()];
                            var2 += 12;
                            mFont.tahoma_7_white.a(var1, var5, var3, var2, 0, mFont.tahoma_7_grey);
                        }
                    } else {
                        var5 = mResources.ds + ": " + Char.et;
                        var2 += 12;
                        mFont.tahoma_7_white.a(var1, var5, var3, var2, 0, mFont.tahoma_7_grey);
                    }
                }

                var1.translate(-var1.b(), -var1.c());
                return;
            }
        } catch (Exception var11) {
        }

    }

    private void h(mGraphics var1) {
        if (GameCanvas.isTouch && (!GameCanvas.menu.showMenu || !GameCanvas.h) && GameCanvas.currentDialog == null && ChatPopup.b == null && !GameCanvas.menu.showMenu && !ci()) {
            b(var1);
            if (!ChatTextField.gI().isShow) {
                var1.a(je, kj + 17, kk + 17, 3);
            }

            if (!this.cj()) {
                if (!fe) {
                    InfoDlg var2 = qe;
                    var1.a((Image) null, var2.a, var2.b, 3);
                    var1.a((Image) null, var2.c, var2.d, 3);
                } else {
                    var1.a(jh, kh, ki, 0);
                    var1.a(jc, 0, 0, mGraphics.a(jc), mGraphics.b(jc), 3, kh + 15, ki + 16, 3);
                    if (mScreen.fq == 4) {
                        var1.a(ji, kh, ki, 0);
                        var1.a(jd, 0, 0, mGraphics.a(jc), mGraphics.b(jc), 3, kh + 15, ki + 16, 3);
                    }

                    var1.a(jh, kl, km, 0);
                    var1.a(jc, 0, 0, mGraphics.a(jc), mGraphics.b(jc), 0, kl + 17, km + 16, 3);
                    if (mScreen.fq == 6) {
                        var1.a(ji, kl, km, 0);
                        var1.a(jd, 0, 0, mGraphics.a(jc), mGraphics.b(jc), 0, kl + 17, km + 16, 3);
                    }

                    var1.a(jh, kp, kq, 0);
                    var1.a(jc, 0, 0, mGraphics.a(jc), mGraphics.b(jc), 7, kp + 17, kq + 14, 3);
                    if (mScreen.fq == 3) {
                        var1.a(ji, kp, kq, 0);
                        var1.a(jd, 0, 0, mGraphics.a(jc), mGraphics.b(jc), 7, kp + 17, kq + 14, 3);
                    }
                }

                if (Char.getMyChar().ctaskId > 1) {
                    var1.a(jh, kr, ks, 0);
                    if (mScreen.fq == 10) {
                        var1.a(ji, kr, ks, 0);
                    }

                    var1.a(jj, kr + 16, ks + 15, 3);
                    mFont.number_white.a(var1, "" + r, kr + 22, ks + 20, 1);
                    var1.a(jh, kt, ku, 0);
                    if (mScreen.fq == 11) {
                        var1.a(ji, kt, ku, 0);
                    }

                    var1.a(jk, kt + 16, ku + 15, 3);
                    mFont.number_white.a(var1, "" + q, kt + 22, ku + 20, 1);
                    var1.a(jh, kv, kw, 0);
                    if (mScreen.fq == 13) {
                        var1.a(ji, kv, kw, 0);
                    }

                    var1.a(jg, kv + 16, kw + 16, 3);
                }

                var1.a(jl, kn, ko, 0);
                if (mScreen.fq == 5) {
                    var1.a(jm, kn, ko, 0);
                }
            }
        }

    }

    private void i(mGraphics var1) {
        if (GameCanvas.currentDialog == null && ChatPopup.b == null && !GameCanvas.menu.showMenu && !ci() && super.center != this.ez && (!GameCanvas.isTouch || Char.getMyChar().vSkill.size() >= 2) && gy) {
            for (int var2 = 0; var2 < onScreenSkill.length; ++var2) {
                if (GameCanvas.h) {
                    if (Info.hI > 0) {
                        ky[var2] = 55 + Info.hI;
                    } else {
                        ky[var2] = 55;
                    }
                }

                if (GameCanvas.isTouch && GameCanvas.g) {
                    var1.a(jn, kz + kx[var2] - 1, ky[var2] - 1, 0);
                } else {
                    var1.a(16764040);
                    var1.b(kz + kx[var2] - 1, ky[var2] - 1, 25, 25);
                }

                Skill var3 = onScreenSkill[var2];
                if (var2 == this.kd && !isPaintUI() && GameCanvas.u % 10 > 5) {
                    var1.a(16777215);
                    var1.c(kz + kx[var2] + 1, ky[var2] + 1, 22, 22);
                } else if (!GameCanvas.isTouch) {
                    var1.a(0);
                    var1.c(kz + kx[var2], ky[var2], 24, 24);
                }

                if (var3 != null) {
                    if (var3 == Char.getMyChar().myskill) {
                        var1.a(16711680);
                        var1.b(kz + kx[var2] - 1, ky[var2] - 1, 25, 25);
                    }

                    var3.paint(kz + kx[var2] + 12, ky[var2] + 12, var1);
                }
            }
        }

    }

    public static final void a(String var0, int var1, int var2, int var3) {
        int var4 = -1;

        for (int var5 = 0; var5 < 5; ++var5) {
            if (lh[var5] == -1) {
                var4 = var5;
                break;
            }
        }

        if (var4 != -1) {
            li[var4] = var3;
            lc[var4] = var0;
            ld[var4] = var1;
            le[var4] = var2;
            lf[var4] = 0;
            lg[var4] = -2;
            lh[var4] = 0;
        }

    }

    public static final void a(int var0, int var1) {
        vNpc.addElement(new Class_fh(var0, var1));
    }

    public static final boolean a(int var0, int var1, int var2) {
        int var3 = ll[0] == -1 ? 0 : 1;
        if (ll[var3] != -1) {
            return false;
        } else {
            ll[var3] = 0;
            ln[var3] = var2;
            lj[var3] = var0;
            lk[var3] = var1;
            return true;
        }
    }

    private void bu() {
        if (ma == null) {
            ma = new Image[2];

            for (int var1 = 0; var1 < 2; ++var1) {
                ma[var1] = GameCanvas.loadImage("/u/c" + var1 + ".png");
            }
        }

        lr = mGraphics.a(ma[0]);
        ls = mGraphics.a(ma[1]);
        lt = gW - lr - ls + 1;
        lu = 63;
        lv = lp + 7;
        lw = gW - 84 - 30 + 15;
        ly = gW - 44 - 4;
        lz = 5;
        if (GameCanvas.z > 176) {
            lt -= 50;
            lw -= 50;
            ly -= 50;
            lu += 15;
            lw -= 15;
        }

        this.bv();
    }

    private void bv() {
        if (GameCanvas.isTouch) {
            lw = 82;
            lx = 57;
            lu = 52;
            boolean var1 = GameCanvas.au;
            lv = 10 + Info.hI;
            ly = gW - 61;
            if (GameCanvas.h) {
                kj = gW / 2 - 2;
                kk = kg + 50;
            } else {
                this.jx.y = 6 + Info.hI;
                kj = gW - 100;
                kk = 2 + Info.hI;
            }

            int var2 = GameCanvas.z - 60;
            boolean var3 = GameCanvas.au;
            TileMap.a(var2, Info.hI, 60, 42);
        }

    }

    private void j(mGraphics var1) {
        if (indexMenu == 4) {
            var1.translate(-var1.b(), -var1.c());
            Paint.a(eu, et, ev, ew, var1);
            var1.a(Paint.COLORBACKGROUND);
            a(var1, mResources.fr[indexMenu], true);
            if (currentCharViewInfo.arrItemBody == null) {
                GameCanvas.a(eu + 90, et + 75, var1);
                mFont.tahoma_7b_white.a(var1, mResources.ag, eu + ev / 2, et + 90, 2);
                return;
            }

            var1.a(13606712);
            var1.b(eu + 33, et + (GameCanvas.isTouchControlLargeScreen ? 87 : 34), ev - 67, GameCanvas.isTouchControlLargeScreen ? 76 : 128);
            int var2 = gi - 2;
            int var3 = 0;

            int var4;
            int var5;
            int var6;
            for (var4 = 0; var4 < 16; ++var4) {
                if (var4 != 0 && var4 != 2 && var4 != 4 && var4 != 6 && var4 != 8) {
                    if (var4 != 1 && var4 != 3 && var4 != 5 && var4 != 7 && var4 != 9) {
                        if (var4 == 9 || var4 == 10 || var4 == 11 || var4 == 12 || var4 == 13 || var4 == 14 || var4 == 15) {
                            var5 = eu + 4 + 1 + var3 * (var2 + 2);
                            var6 = et + 35 + var2 * 5 + 1;
                            var1.a(0);
                            var1.c(var5, et + 35 + var2 * 5 + 1, var2 - 1, var2 - 1);
                            if (indextabTrangbi == 0) {
                                if (mResources.kr[var4].length > 1) {
                                    mFont.tahoma_7_grey.a(var1, mResources.kr[var4][0], var5 + var2 / 2, var6 + 2, 2);
                                    mFont.tahoma_7_grey.a(var1, mResources.kr[var4][1], var5 + var2 / 2, var6 + 2 + 9, 2);
                                } else {
                                    mFont.tahoma_7_grey.a(var1, mResources.kr[var4][0], var5 + var2 / 2, var6 + 2 + 5, 2);
                                }
                            }
                            ++var3;
                        }
                    } else {
                        var1.a(0);
                        var1.c(eu + ev - var2 - 4, et + 35 + var4 / 2 * var2 + 1, var2 - 1, var2 - 1);
                        if (indextabTrangbi == 0) {
                            if (mResources.kr[var4].length > 1) {
                                mFont.tahoma_7_grey.a(var1, mResources.kr[var4][0], eu + ev - var2 / 2 - 4, et + 36 + var4 / 2 * var2 + 2, 2);
                                mFont.tahoma_7_grey.a(var1, mResources.kr[var4][1], eu + ev - var2 / 2 - 4, et + 36 + var4 / 2 * var2 + 2 + 9, 2);
                            } else {
                                mFont.tahoma_7_grey.a(var1, mResources.kr[var4][0], eu + ev - var2 / 2 - 4, et + 36 + var4 / 2 * var2 + 2 + 5, 2);
                            }
                        }
                    }
                } else {
                    var1.a(0);
                    var1.c(eu + 4 + 1, et + 35 + var4 / 2 * var2 + 1, var2 - 1, var2 - 1);
                    if (indextabTrangbi == 0) {
                        if (mResources.kr[var4].length > 1) {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[var4][0], eu + 7 + 11, et + 36 + var4 / 2 * var2 + 2, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[var4][1], eu + 7 + 11, et + 36 + var4 / 2 * var2 + 2 + 9, 2);
                        } else {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[var4][0], eu + 7 + 11, et + 36 + var4 / 2 * var2 + 2 + 5, 2);
                        }
                    }
                }
            }
            if (indextabTrangbi == 0) {
                for (var4 = 0; var4 < 16; ++var4) {
                    Item var7;
                    if ((var7 = currentCharViewInfo.arrItemBody[var4]) != null) {
                        if (var7.p == null) {
                            var7.p = v[56];
                        }

                        int var8;
                        if (var7.indexUI != 0 && var7.indexUI != 2 && var7.indexUI != 4 && var7.indexUI != 6 && var7.indexUI != 8 && var7.indexUI != 10) {
                            if (var7.indexUI != 1 && var7.indexUI != 3 && var7.indexUI != 5 && var7.indexUI != 7 && var7.indexUI != 9) {
                                if (var7.indexUI == 11 || var7.indexUI == 12 || var7.indexUI == 13 || var7.indexUI == 14 || var7.indexUI == 15) {
                                    if (var7.indexUI == 10) {
                                        var3 = 1;
                                    } else if (var7.indexUI == 11) {
                                        var3 = 2;
                                    } else if (var7.indexUI == 12) {
                                        var3 = 3;
                                    } else if (var7.indexUI == 13) {
                                        var3 = 4;
                                    } else if (var7.indexUI == 14) {
                                        var3 = 5;
                                    } else if (var7.indexUI == 15) {
                                        var3 = 6;
                                    }

                                    var6 = eu + 2 + 1 + var3 * (var2 + 2) - var2;
                                    var8 = et + 35 + var2 * 5;
                                    this.a(var1, var7, var6 - 2, var8 - 1, 0, 1);
                                }
                            } else {
                                var6 = eu + ev - var2 - 5;
                                var8 = et + 35 + var7.indexUI / 2 * var2;
                                this.a(var1, var7, var6 - 1, var8 - 1, 0, 1);
                            }
                        } else {
                            var6 = eu + 4;
                            var8 = et + 34 + var7.indexUI / 2 * var2;
                            this.a(var1, var7, var6 - 1, var8, 0, 1);
                        }

                        if (GameCanvas.u % 4 == 0) {
                            ++var7.q;
                            if (var7.q >= var7.p.arrEfInfo.length) {
                                var7.q = 0;
                            }
                        }
                    }
                }
            }

            if (indextabTrangbi > 0) {
                for (var4 = 0; var4 < 16; ++var4) {
                    Item var7;

                    if ((var7 = currentCharViewInfo.arrItemBody[var4 + indextabTrangbi]) != null) {
                        int index_new = var7.indexUI - 16;
                        if (var7.p == null) {
                            var7.p = v[56];
                        }

                        int var8;
                        if (index_new != 0 && index_new != 2 && index_new != 4 && index_new != 6 && index_new != 8 && index_new != 10) {
                            if (index_new != 1 && index_new != 3 && index_new != 5 && index_new != 7 && index_new != 9) {
                                if (index_new == 11 || index_new == 12 || index_new == 13 || index_new == 14 || index_new == 15) {
                                    if (index_new == 10) {
                                        var3 = 1;
                                    } else if (index_new == 11) {
                                        var3 = 2;
                                    } else if (index_new == 12) {
                                        var3 = 3;
                                    } else if (index_new == 13) {
                                        var3 = 4;
                                    } else if (index_new == 14) {
                                        var3 = 5;
                                    } else if (index_new == 15) {
                                        var3 = 6;
                                    }

                                    var6 = eu + 2 + 1 + var3 * (var2 + 2) - var2;
                                    var8 = et + 35 + var2 * 5;
                                    this.a(var1, var7, var6 - 2, var8 - 1, 0, 1);
                                }
                            } else {
                                var6 = eu + ev - var2 - 5;
                                var8 = et + 35 + index_new / 2 * var2;
                                this.a(var1, var7, var6 - 1, var8 - 1, 0, 1);
                            }
                        } else {
                            var6 = eu + 4;
                            var8 = et + 34 + index_new / 2 * var2;
                            this.a(var1, var7, var6 - 1, var8, 0, 1);
                        }

                        if (GameCanvas.u % 4 == 0) {
                            ++var7.q;
                            if (var7.q >= var7.p.arrEfInfo.length) {
                                var7.q = 0;
                            }
                        }
                    }
                }
            }

            for (var4 = 0; var4 < 16; ++var4) {
                if (indexTitle == 1 && var4 == indexSelect) {
                    if (var4 != 0 && var4 != 2 && var4 != 4 && var4 != 6 && var4 != 8) {
                        if (var4 != 1 && var4 != 3 && var4 != 5 && var4 != 7 && var4 != 9) {
                            if (var4 == 9 || var4 == 10 || var4 == 11 || var4 == 12 || var4 == 13 || var4 == 14 || var4 == 15) {
                                if (var4 == 9) {
                                    var3 = 0;
                                } else if (var4 == 10) {
                                    var3 = 1;
                                } else if (var4 == 11) {
                                    var3 = 2;
                                } else if (var4 == 12) {
                                    var3 = 3;
                                } else if (var4 == 13) {
                                    var3 = 4;
                                } else if (var4 == 14) {
                                    var3 = 5;
                                } else if (var4 == 15) {
                                    var3 = 6;
                                }

                                var5 = eu + 2 + 1 + var3 * (var2 + 2) - var2;
                                var6 = et + 35 + var2 * 5;
                                var1.a(16777215);
                                var1.b(var5 - 1, var6, var2, var2);
                                a(var5 - 2, var6 - 1, var1);
                            }
                        } else {
                            var1.a(16777215);
                            var1.b(eu + ev - var2 - 4 - 1, et + 35 + var4 / 2 * var2, var2, var2);
                            a(eu + ev - var2 - 4 - 2, et + 35 + var4 / 2 * var2 - 1, var1);
                        }
                    } else {
                        var1.a(16777215);
                        var1.b(eu + 4, et + 35 + var4 / 2 * var2, var2, var2);
                        a(eu + 5 - 2, et + 35 + var4 / 2 * var2 - 1, var1);
                    }
                }
            }

            var4 = GameCanvas.isTouchControlLargeScreen ? -25 : 16;
            Part var12 = parts[currentCharViewInfo.head];
            Part var13 = parts[currentCharViewInfo.leg];
            Part var9 = parts[currentCharViewInfo.body];
            Part var10 = parts[currentCharViewInfo.wp];
            if (currentCharViewInfo.arrItemBody != null && currentCharViewInfo.arrItemBody[11] != null) {
                var12 = parts[currentCharViewInfo.arrItemBody[11].template.part];
            }

            label438:
            {
                if (var12.a != null && var12.a.length >= 8) {
                    var3 = 0;

                    while (true) {
                        if (var3 >= var12.a.length) {
                            break label438;
                        }

                        if (var12.a[var3] == null || !SmallImage.drawSmallImageNew(var12.a[var3].id)) {
                            Char.getMyChar();
                            break;
                        }

                        ++var3;
                    }
                }

                var12 = Char.b(Char.getMyChar().cgender);
            }

            int[] var11;
            if ((var11 = currentCharViewInfo.v()) != null) {
                if (Char.getMyChar().tickCoat == 0) {
                    SmallImage.drawSmallImageNew(var1, var11[Char.getMyChar().tickCoat], gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dx - 2, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy + 16, 0, 0);
                } else if (Char.getMyChar().tickCoat == 1) {
                    SmallImage.drawSmallImageNew(var1, var11[Char.getMyChar().tickCoat], gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dx - 9, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy + 16, 0, 0);
                } else if (Char.getMyChar().tickCoat == 2) {
                    SmallImage.drawSmallImageNew(var1, var11[Char.getMyChar().tickCoat], gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dx - 12, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy + 16, 0, 0);
                } else {
                    SmallImage.drawSmallImageNew(var1, var11[Char.getMyChar().tickCoat], gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dx - 9, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy + 16, 0, 0);
                }
            }

            currentCharViewInfo.b(var1, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][1] + var9.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dx + 18, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][2] + var13.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dy + 5);
            SmallImage.drawSmallImageNew(var1, var10.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][0]].id, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][1] + var10.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][0]].dx, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][2] + var10.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][0]].dy, 0, 0);
            SmallImage.drawSmallImageNew(var1, var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].id, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dx, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2] + var12.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy, 0, 0);
            SmallImage.drawSmallImageNew(var1, var13.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].id, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][1] + var13.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dx, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][2] + var13.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dy, 0, 0);
            SmallImage.drawSmallImageNew(var1, var9.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].id, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][1] + var9.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dx, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][2] + var9.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dy, 0, 0);
            currentCharViewInfo.b(var1, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][1] + var9.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dx + 5, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][2] + var13.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dy + 5);
            currentCharViewInfo.c(var1, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][1] + var9.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dx + 22, gW3 + var4 - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][2] + var13.a[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dy + 5);
        }

    }

    private void k(mGraphics var1) {
        if (indexMenu == 5) {
            var1.translate(-var1.b(), -var1.c());
            Paint.a(eu, et, ev, ew, var1);
            var1.a(Paint.COLORBACKGROUND);
            a(var1, mResources.fr[indexMenu], true);
            b(var1);
            var1.a(0);
            var1.c(eu + 2, et + 31, 171, ew - 34);
            var1.a(13606712);
            var1.b(eu + 3, et + 32, 168, ew - 37);
            var1.a(Paint.COLORBACKGROUND);
            var1.c(eu + 4, et + 34, 166, ew - 39);
            int var2;
            int var3;
            if (currentCharViewInfo.arrItemMounts[4] != null) {
                mFont.tahoma_7b_white.a(var1, currentCharViewInfo.arrItemMounts[4].template.name, eu + 90, nu + 2, 2);
                var2 = currentCharViewInfo.arrItemMounts[4].sys + 1;

                for (var3 = 0; var3 < var2; ++var3) {
                    SmallImage.drawSmallImageNew(var1, 628, eu + 90 + var3 * 12 - var2 * 6, nu + 20, 0, 3);
                }
            } else {
                mFont.tahoma_7b_white.a(var1, mResources.rr, eu + 90, nu + 2, 2);
            }

            for (var2 = 0; var2 < currentCharViewInfo.arrItemMounts.length - 1; ++var2) {
                if (currentCharViewInfo.arrItemMounts[var2] != null) {
                    this.a(var1, currentCharViewInfo.arrItemMounts[var2], this.js[var2], this.jt[var2]);
                } else {
                    var1.a(6425);
                    var1.c(this.js[var2] - 1, this.jt[var2] - 1, gi + 3, gi + 3);
                    if (var2 == 0) {
                        if (currentCharViewInfo.t()) {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[22][0], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 - 10, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[22][1], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 + 2, 2);
                        } else {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[19][0], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 - 10, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[19][1], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 + 2, 2);
                        }
                    } else if (var2 == 1) {
                        if (currentCharViewInfo.t()) {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[20][0], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 - 10, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[20][1], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 + 2, 2);
                        } else {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[16][0], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 - 10, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[16][1], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 + 2, 2);
                        }
                    } else if (var2 == 2) {
                        if (currentCharViewInfo.t()) {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[21][0], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 - 10, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[21][1], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 + 2, 2);
                        } else {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[17][0], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 - 10, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[17][1], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 + 2, 2);
                        }
                    } else if (var2 == 3) {
                        if (currentCharViewInfo.t()) {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[23][0], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 - 10, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[23][1], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 + 2, 2);
                        } else {
                            mFont.tahoma_7_grey.a(var1, mResources.kr[18][0], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 - 10, 2);
                            mFont.tahoma_7_grey.a(var1, mResources.kr[18][1], this.js[var2] + gi / 2, this.jt[var2] + gi / 2 + 2, 2);
                        }
                    }
                }

                if (indexSelect == var2 && indexTitle == 1 && indexSelect < 4) {
                    var1.a(16777215);
                } else {
                    var1.a(12281361);
                }

                var1.b(this.js[var2], this.jt[var2], gi, gi);
            }

            var2 = this.js[0] + gi + 7;
            var3 = this.jt[0] - 5;
            var1.a(6425);
            var1.c(var2, var3, 84, 75);
            if (indexSelect == 4) {
                var1.a(16777215);
            } else {
                var1.a(12281361);
            }

            var1.b(var2, var3, 84, 75);
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            if (currentCharViewInfo.arrItemMounts[4] != null) {
                if (currentCharViewInfo.t()) {
                    if (currentCharViewInfo.arrItemMounts[4].template.id == 485) {
                        if (currentCharViewInfo.arrItemMounts[4].sys < 2) {
                            SmallImage.drawSmallImageNew(var1, 1800, var2 + 45, var3 + 35, 0, 3);
                        } else {
                            SmallImage.drawSmallImageNew(var1, 2063, var2 + 45, var3 + 35, 0, 3);
                        }
                    } else if (currentCharViewInfo.arrItemMounts[4].template.id == 524) {
                        if (currentCharViewInfo.arrItemMounts[4].sys < 2) {
                            SmallImage.drawSmallImageNew(var1, 2067, var2 + 45, var3 + 35, 0, 3);
                        } else {
                            SmallImage.drawSmallImageNew(var1, 2071, var2 + 45, var3 + 35, 0, 3);
                        }
                    }
                } else if (currentCharViewInfo.s()) {
                    if (currentCharViewInfo.arrItemMounts[4].template.id == 443) {
                        if (currentCharViewInfo.arrItemMounts[4].sys < 2) {
                            if (GameCanvas.u % 20 > 15) {
                                SmallImage.drawSmallImageNew(var1, 1801, var2 + 45, var3 + 35, 0, 3);
                            } else {
                                SmallImage.drawSmallImageNew(var1, 1802, var2 + 45, var3 + 35, 0, 3);
                            }
                        } else if (GameCanvas.u % 20 > 15) {
                            SmallImage.drawSmallImageNew(var1, 2080, var2 + 45, var3 + 35, 0, 3);
                        } else {
                            SmallImage.drawSmallImageNew(var1, 2081, var2 + 45, var3 + 35, 0, 3);
                        }
                    } else if (currentCharViewInfo.arrItemMounts[4].template.id == 523) {
                        if (GameCanvas.u % 20 > 15) {
                            SmallImage.drawSmallImageNew(var1, 2062, var2 + 45, var3 + 35, 0, 3);
                        } else {
                            SmallImage.drawSmallImageNew(var1, 2061, var2 + 45, var3 + 35, 0, 3);
                        }
                    }
                }

                if (currentCharViewInfo.arrItemMounts[4].options != null) {
                    for (var2 = 0; var2 < currentCharViewInfo.arrItemMounts[4].options.size(); ++var2) {
                        ItemOption var9;
                        if ((var9 = (ItemOption) currentCharViewInfo.arrItemMounts[4].options.elementAt(var2)).optionTemplate.id == 65) {
                            var4 = var9.param;
                        } else if (var9.optionTemplate.id == 66) {
                            var5 = var9.param;
                        }
                    }
                }

                var6 = var4 * 85 / 1000;
                var7 = var5 * 85 / 1000;
                var8 = currentCharViewInfo.arrItemMounts[4].upgrade + 1;
            }

            var2 = nt + 5;
            var3 = nu + 112;
            mFont.tahoma_7b_white.a(var1, mResources.ef + ": ", var2, var3, 0);
            mFont.tahoma_7b_white.a(var1, String.valueOf(var8), var2 + 70, var3, 0);
            String var10;
            if (currentCharViewInfo.t()) {
                var10 = mResources.sg + ": ";
                var3 += 15;
                mFont.tahoma_7b_white.a(var1, var10, var2, var3, 0);
            } else {
                var10 = mResources.hj + ": ";
                var3 += 15;
                mFont.tahoma_7b_white.a(var1, var10, var2, var3, 0);
            }

            var1.a(6425);
            var1.c(var2 + 70, var3, 85, 14);
            var1.a(371981);
            var1.c(var2 + 70, var3, var6, 14);
            var1.a(5131338);
            var1.b(var2 + 70, var3, 85, 14);
            mFont.tahoma_7_white.a(var1, var4 + "/1000", var2 + 113, var3 + 2, 2);
            if (currentCharViewInfo.t()) {
                var10 = mResources.sh + ": ";
                var3 += 17;
                mFont.tahoma_7b_white.a(var1, var10, var2, var3, 0);
            } else {
                var10 = mResources.rq + ": ";
                var3 += 17;
                mFont.tahoma_7b_white.a(var1, var10, var2, var3, 0);
            }

            var1.a(6425);
            var1.c(var2 + 70, var3, 85, 14);
            var1.a(16711680);
            var1.c(var2 + 70, var3, var7, 14);
            var1.a(5131338);
            var1.b(var2 + 70, var3, 85, 14);
            mFont.tahoma_7_white.a(var1, var5 + "/1000", var2 + 113, var3 + 2, 2);
        }

    }

    private void l(mGraphics var1) {
        if (isPaintClan) {
            b(var1);
            Paint.a(eu, et, ev, ew, var1);
            a(var1, mResources.mq[indexMenu], true);
            if (indexMenu == 0) {
                if (Char.be != null && Char.be.name != null && !Char.be.name.equals("")) {
                    int[] var6 = new int[]{1692, 1693, 1694, 1695, 1696};

                    for (int var5 = 0; var5 < 5; ++var5) {
                        var1.a(6425);
                        var1.c(eu + var5 * gi + 18, et + 32, gi - 2, gi - 2);
                        if (indexTitle == 1 && var5 == indexSelect) {
                            var1.a(16777215);
                        } else {
                            var1.a(12281361);
                        }

                        var1.b(eu + var5 * gi + 18, et + 32, gi - 2, gi - 2);
                        if (var5 > Char.be.itemLevel - 1) {
                            SmallImage.drawSmallImageNew(var1, 1697, eu + var5 * gi + 18 + gi / 2, et + 32 + gi / 2, 0, 3);
                        } else {
                            SmallImage.drawSmallImageNew(var1, var6[var5], eu + var5 * gi + 18 + gi / 2, et + 32 + gi / 2, 0, 3);
                        }
                    }

                    if (indexTitle == 2) {
                        var1.a(Paint.COLORDARK);
                        var1.c(eu + 7, et + 60, ev - 14, ew - 68);
                        var1.a(16777215);
                    } else {
                        var1.a(10249521);
                    }

                    var1.b(eu + 7, et + 60, ev - 14, ew - 68);
                    nt = eu + 17;
                    nu = et + 62;
                    gk = 12;
                    aq.a(gk, 12, eu, et + 62, ev, ew - 72, true, 1);
                    aq.a(var1);
                    mFont.tahoma_7b_yellow.a(var1, mResources.mr[0] + Char.be.name, nt, nu, 0);
                    mFont.tahoma_7_blue1.a(var1, mResources.mr[1] + Char.be.main_name, nt, nu += 12, 0);
                    mFont.tahoma_7_white.a(var1, mResources.mr[2] + Char.be.use_card + "/" + (Char.be.level * 5 + 45), nt, nu += 12, 0);
                    mFont.tahoma_7_white.a(var1, mResources.mr[3] + Char.be.level, nt, nu += 12, 0);
                    mFont.tahoma_7_white.a(var1, mResources.mr[4] + Char.be.exp + "/" + Char.be.expNext, nt, nu += 12, 0);
                    mFont.tahoma_7_white.a(var1, mResources.mr[5] + NinjaUtil.numberToString(String.valueOf(Char.be.coin)) + " " + mResources.ki, nt, nu += 12, 0);
                    mFont.tahoma_7_white.a(var1, mResources.mr[8] + NinjaUtil.numberToString(String.valueOf(Char.be.freeCoin)) + " " + mResources.ki, nt, nu += 12, 0);
                    mFont.tahoma_7_white.a(var1, mResources.mr[9] + NinjaUtil.numberToString(String.valueOf(Char.be.coinUp)) + " " + mResources.ki, nt, nu += 12, 0);
                    if (mFont.tahoma_7_white.a(mResources.mr[10] + Char.be.icon + " " + mResources.mp) > inforW - 10) {
                        this.b(var1, mFont.tahoma_7_white, mResources.mr[10] + Char.be.icon + " " + mResources.mp, nt, nu += 12, ev - 20);
                    } else {
                        mFont.tahoma_7_white.a(var1, mResources.mr[10] + Char.be.icon + " " + mResources.mp, nt, nu += 12, 0);
                    }

                    if (mFont.tahoma_7_white.a(mResources.mr[12] + Char.be.openDun + " " + mResources.mp) > inforW - 10) {
                        this.b(var1, mFont.tahoma_7_white, mResources.mr[12] + Char.be.openDun + " " + mResources.mp, nt, nu += 12, ev - 20);
                    } else {
                        mFont.tahoma_7_white.a(var1, mResources.mr[12] + Char.be.openDun + " " + mResources.mp, nt, nu += 12, 0);
                    }

                    mFont.tahoma_7_white.a(var1, mResources.mr[6] + Char.be.assist_name, nt, nu += 12, 0);
                    if (this.mc == null) {
                        this.mc = a(mFont.tahoma_7_yellow, Char.be.alert);
                    }

                    this.a(var1, mFont.tahoma_7_yellow, this.mc, nt, nu += 12);
                    if (indexTitle == 2 && indexRow >= 0) {
                        SmallImage.drawSmallImageNew(var1, 942, nt - 8, et + 62 + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                    }

                    aq.a(gk, 12, eu, et + 62, ev, ew - 72, true, 1);
                    return;
                }

                gk = 1;
                mFont.tahoma_7_white.a(var1, mResources.nx, eu + ev / 2, et + 40, 2);
                return;
            }

            if (indexMenu == 1) {
                nt = eu + 5;
                nu = et + 32;
                if (vClan.size() == 0) {
                    mFont.tahoma_7_white.a(var1, mResources.nx, eu + ev / 2, et + 40, 2);
                    return;
                }

                var1.a(6425);
                var1.c(nt - 2, nu - 2, ev - 6, gi * 5 + 8);
                b(var1);
                aq.a(var1, nt, nu, ev - 3, gi * 5 + 6);
                this.mb = 0;

                for (int var4 = 0; var4 < vClan.size(); ++var4) {
                    Member var3 = (Member) vClan.elementAt(var4);
                    if (!gp || var3.isOnline) {
                        if (var4 * (gi + gi / 2) >= aq.b - (gi + gi / 2) && var4 * (gi + gi / 2) < aq.b + gi * 5 + 8) {
                            if (indexRow == this.mb) {
                                var1.a(Paint.COLORLIGHT);
                                var1.c(nt + 2, nu + indexRow * (gi + gi / 2) + 2, ev - 15, gi + gi / 2 - 4);
                                var1.a(16777215);
                                var1.b(nt + 2, nu + indexRow * (gi + gi / 2) + 2, ev - 15, gi + gi / 2 - 4);
                            } else {
                                var1.a(Paint.COLORBACKGROUND);
                                var1.c(nt + 2, nu + this.mb * (gi + gi / 2) + 2, ev - 15, gi + gi / 2 - 4);
                                var1.a(13932896);
                                var1.b(nt + 2, nu + this.mb * (gi + gi / 2) + 2, ev - 15, gi + gi / 2 - 4);
                            }

                            SmallImage.drawSmallImageNew(var1, var3.iconId, nt + 12, nu + this.mb * (gi + gi / 2) + 13, 0, 3);
                            if (var3.type == 4) {
                                SmallImage.drawSmallImageNew(var1, 1216, nt + 12, nu + this.mb * (gi + gi / 2) + 30, 0, 3);
                                if (var3.isOnline) {
                                    mFont.tahoma_7_yellow.a(var1, mResources.od[0] + " ", nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0, mFont.tahoma_7_grey);
                                    mFont.tahoma_7_white.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 45, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_green.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                    mFont.tahoma_7_blue1.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                                } else {
                                    mFont.tahoma_7_grey.a(var1, mResources.od[0] + " ", nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_grey.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 45, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_grey.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                    mFont.tahoma_7_grey.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                                }
                            } else if (var3.type == 3) {
                                SmallImage.drawSmallImageNew(var1, 1215, nt + 12, nu + this.mb * (gi + gi / 2) + 30, 0, 3);
                                if (var3.isOnline) {
                                    mFont.tahoma_7_yellow.a(var1, mResources.od[1] + " ", nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0, mFont.tahoma_7_grey);
                                    mFont.tahoma_7_white.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 45, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_green.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                    mFont.tahoma_7_blue1.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                                } else {
                                    mFont.tahoma_7_grey.a(var1, mResources.od[1] + " ", nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_grey.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 45, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_grey.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                    mFont.tahoma_7_grey.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                                }
                            } else if (var3.type == 2) {
                                SmallImage.drawSmallImageNew(var1, 1217, nt + 12, nu + this.mb * (gi + gi / 2) + 30, 0, 3);
                                if (var3.isOnline) {
                                    mFont.tahoma_7_yellow.a(var1, mResources.od[2] + " ", nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0, mFont.tahoma_7_grey);
                                    mFont.tahoma_7_white.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 45, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_green.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                    mFont.tahoma_7_blue1.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                                } else {
                                    mFont.tahoma_7_grey.a(var1, mResources.od[2] + " ", nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_grey.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 45, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_grey.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                    mFont.tahoma_7_grey.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                                }
                            } else if (var3.type == 1) {
                                SmallImage.drawSmallImageNew(var1, 1214, nt + 12, nu + this.mb * (gi + gi / 2) + 30, 0, 3);
                                if (var3.isOnline) {
                                    mFont.tahoma_7_yellow.a(var1, mResources.od[3] + " ", nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0, mFont.tahoma_7_grey);
                                    mFont.tahoma_7_white.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 45, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_green.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                    mFont.tahoma_7_blue1.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                                } else {
                                    mFont.tahoma_7_grey.a(var1, mResources.od[3] + " ", nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_grey.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 45, nu + this.mb * (gi + gi / 2) + 5, 0);
                                    mFont.tahoma_7_grey.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                    mFont.tahoma_7_grey.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                                }
                            } else if (var3.isOnline) {
                                mFont.tahoma_7_white.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0);
                                mFont.tahoma_7_green.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                mFont.tahoma_7_blue1.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                            } else {
                                mFont.tahoma_7_grey.a(var1, var3.name + " - " + mResources.eg + ": " + var3.level, nt + 22, nu + this.mb * (gi + gi / 2) + 5, 0);
                                mFont.tahoma_7_grey.a(var1, mResources.mr[7] + var3.pointClan, nt + 22, nu + this.mb * (gi + gi / 2) + 16, 0);
                                mFont.tahoma_7_grey.a(var1, mResources.mr[11] + var3.pointClanWeek, nt + 22, nu + this.mb * (gi + gi / 2) + 26, 0);
                            }
                        }

                        ++this.mb;
                    }
                }

                aq.a(this.mb, gi + gi / 2, nt, nu, ev - 3, gi * 5 + 4, true, 1);
                gk = this.mb;
                m(var1);
                return;
            }

            if (indexMenu != 2) {
                if (indexMenu == 3) {
                    if (Char.be != null && Char.be.name != null && !Char.be.name.equals("") && !Char.be.log.equals("")) {
                        gk = 1;
                        nt = eu + 17;
                        nu = et + 34;
                        inforW = ev - 30;
                        aq.a(var1);
                        if (this.md == null) {
                            this.md = a(mFont.tahoma_7_white, Char.be.log);
                        }

                        this.a(var1, mFont.tahoma_7_white, this.md, nt, nu);
                        if (indexTitle == 1 && indexRow >= 0) {
                            SmallImage.drawSmallImageNew(var1, 942, nt - 8, et + 34 + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                        }

                        aq.a(gk, 12, eu, et + 35, ev, ew - 44, true, 1);
                        return;
                    }

                    gk = 1;
                    mFont.tahoma_7_white.a(var1, mResources.nx, eu + ev / 2, et + 40, 2);
                    return;
                }

                if (indexMenu == 4) {
                    this.ap(var1);
                    return;
                }
            } else {
                nt = eu + 3;
                nu = et + 32;
                var1.a(6425);
                var1.c(nt - 1, nu - 1, nz * gi + 3, 5 * gi + 3);
                Item[] var2;
                if (Char.be != null && Char.be.items != null) {
                    var2 = Char.be.items;
                } else {
                    var2 = new Item[30];
                }

                this.a(var1, var2);
            }
        }

    }

    private static void m(mGraphics var0) {
        b(var0);
        int var1 = indexRow;
        if (isPaintAuctionBuy) {
            var1 = indexSelect;
        }

        if (var1 >= 0 && gk > 0) {
            var1 = var1 + 1 < gk ? var1 + 1 : gk;
            mFont.tahoma_7_yellow.a(var0, var1 + "/" + gk, eu + ev / 2, et + ew - 12, 2, mFont.tahoma_7_grey);
        }

    }

    private void bw() {
        if (!GameCanvas.menu.showMenu && GameCanvas.currentDialog == null) {
            if (GameCanvas.o && GameCanvas.b(eu, et, ev, this.oq) && (!isPaintItemInfo || GameCanvas.z >= 320) && GameCanvas.n) {
                if (GameCanvas.b(gW2 - 90, et + 5, 60, 40)) {
                    indexSelect = 0;
                    --indexMenu;
                }

                if (GameCanvas.b(gW2 + 20, et + 5, 60, 40)) {
                    indexSelect = 0;
                    ++indexMenu;
                }

                isPaintItemInfo = false;
                aq.clear();
                scrInfo.clear();
                if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                    if (indexMenu < 3) {
                        indexMenu = mResources.fr.length - 1;
                    }

                    if (indexMenu > mResources.fr.length - 1) {
                        indexMenu = 3;
                    }
                } else {
                    if (indexMenu < 0) {
                        indexMenu = mResources.fr.length - 1;
                    }

                    if (indexMenu > mResources.fr.length - 1) {
                        indexMenu = 0;
                    }
                }

                indexTitle = 1;
                indexSelect = -1;
                this.doMiniMenuInforMe();
            }

            ScrollResult var1;
            if (isPaintItemInfo) {
                if ((var1 = scrInfo.b()).isDowning || var1.isFinish) {
                    indexRow = var1.selected;
                    indexTitle = 1;
                }

                if (GameCanvas.h) {
                    return;
                }
            }

            if (indexMenu == 0) {
                if ((var1 = aq.b()).isDowning || var1.isFinish) {
                    if (indexSelect != var1.selected) {
                        indexSelect = var1.selected;
                        super.left = super.center = null;
                        if (GameCanvas.h) {
                            this.aj();
                        } else if (getItemFocus(3) != null) {
                            this.gt();
                        } else {
                            isPaintItemInfo = false;
                            super.left = this.ok;
                        }
                    }

                    indexTitle = 1;
                    return;
                }
            } else if (indexMenu == 1) {
                if ((var1 = aq.b()).isDowning || var1.isFinish) {
                    if (indexSelect != var1.selected) {
                        indexSelect = var1.selected;
                        if (var1.selected >= Char.getMyChar().nClass.c.length) {
                            indexSelect = -1;
                        }

                        super.left = super.center = null;
                        this.aj();
                        scrInfo.clear();
                        indexRow = 0;
                    }

                    indexTitle = 1;
                    return;
                }

                if (((var1 = scrInfo.b()).isDowning || var1.isFinish) && indexRow != var1.selected) {
                    indexRow = var1.selected;
                    return;
                }
            } else {
                int var2;
                if (indexMenu == 2) {
                    if (GameCanvas.o && GameCanvas.b(eu + 5, et + 52, ev - 10, 130) && GameCanvas.n) {
                        var2 = (GameCanvas.q - (et + 52)) / 32;
                        ++var2;
                        if (var2 == this.me) {
                            MyVector var3;
                            (var3 = new MyVector()).addElement(new Command1(mResources.di, 11064));
                            var3.addElement(new Command1(mResources.dj, 11065));
                            GameCanvas.menu.startAt(var3);
                        }

                        indexTitle = var2;
                        this.me = var2;
                        this.aj();
                        return;
                    }
                } else if (indexMenu == 3) {
                    if ((var1 = aq.b()).isDowning || var1.isFinish) {
                        indexRow = var1.selected;
                        indexTitle = 1;
                        return;
                    }
                } else if (indexMenu == 4) {
                    if (GameCanvas.o) {
                        indexTitle = 1;
                        if (GameCanvas.b(eu + 4, et + 35, gi, 130)) {
                            indexSelect = (GameCanvas.q - (et + 35)) / gi << 1;
                            super.left = super.center = null;
                            this.aj();
                        }

                        if (GameCanvas.b(eu + ev - 30, et + 35, gi, 130)) {
                            indexSelect = ((GameCanvas.s - (et + 35)) / gi << 1) + 1;
                            super.left = super.center = null;
                            this.aj();
                        }

                        if (GameCanvas.b(eu + 4, et + 165, ev - 8, gi)) {
                            var2 = (GameCanvas.r - (eu + 4)) / gi;
                            var2 += 10;
                            indexSelect = var2;
                            super.left = super.center = null;
                            this.aj();
                            return;
                        }
                    }
                } else if (indexMenu == 5 && GameCanvas.o) {
                    for (var2 = 0; var2 < this.js.length; ++var2) {
                        if (var2 == 4) {
                            if (GameCanvas.b(this.js[var2], this.jt[var2], 84, 75) && GameCanvas.n) {
                                indexTitle = 1;
                                indexSelect = 4;
                                this.aj();
                                if (!GameCanvas.h && super.center != null) {
                                    this.b(super.center.idAction, super.center.p);
                                }
                            }
                        } else if (GameCanvas.b(this.js[var2], this.jt[var2], gi, gi) && GameCanvas.n) {
                            indexTitle = 1;
                            indexSelect = var2;
                            this.aj();
                            if (!GameCanvas.h) {
                                if (currentCharViewInfo.arrItemMounts[indexSelect] != null) {
                                    this.b(super.center.idAction, super.center.p);
                                } else {
                                    isPaintItemInfo = false;
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private void bx() {
        if (isPaintClan) {
            if (indexTitle == 0) {
                if (GameCanvas.k[8]) {
                    if (Char.be == null) {
                        indexTitle = 0;
                    } else {
                        indexTitle = 1;
                    }

                    indexSelect = 0;
                    indexRow = -1;
                    if (indexMenu == 0) {
                        indexSelect = Char.be.itemLevel;
                    }

                    aq.clear();
                    scrInfo.clear();
                }

                if (GameCanvas.k[4]) {
                    indexSelect = 0;
                    indexRow = -1;
                    --indexMenu;
                    aq.clear();
                    scrInfo.clear();
                    if (indexMenu < 0) {
                        indexMenu = mResources.mq.length - 1;
                    }

                    if (indexMenu >= mResources.mq.length) {
                        indexMenu = 0;
                    }

                    if (indexMenu == 1 && id) {
                        Service.gI().requestClanMember();
                        id = false;
                    } else if (indexMenu == 2) {
                        Service.gI().requestClanItem();
                    } else if (indexMenu == 3) {
                        Service.gI().requestClanLog();
                    } else if (indexMenu == 4) {
                        Service.gI().requestClanItem();
                    }

                    setPopupSize(175, 200);
                }

                if (GameCanvas.k[6]) {
                    indexSelect = 0;
                    indexRow = -1;
                    ++indexMenu;
                    aq.clear();
                    scrInfo.clear();
                    if (indexMenu < 0) {
                        indexMenu = mResources.mq.length - 1;
                    }

                    if (indexMenu >= mResources.mq.length) {
                        indexMenu = 0;
                    }

                    if (indexMenu == 1 && id) {
                        Service.gI().requestClanMember();
                        id = false;
                    } else if (indexMenu == 2) {
                        Service.gI().requestClanItem();
                    } else if (indexMenu == 3) {
                        Service.gI().requestClanLog();
                    } else if (indexMenu == 4) {
                        Service.gI().requestClanItem();
                    }

                    setPopupSize(175, 200);
                }

                this.bz();
            } else if (isPaintItemInfo) {
                if (GameCanvas.k[2]) {
                    if (--indexRow < 0) {
                        indexRow = gk - 1;
                    }

                    scrInfo.a(indexRow * scrInfo.h);
                } else if (GameCanvas.k[8]) {
                    if (++indexRow >= gk) {
                        indexRow = 0;
                    }

                    scrInfo.a(indexRow * scrInfo.h);
                }
            } else {
                if (indexRow < 0) {
                    indexRow = 0;
                }

                if (indexMenu == 2) {
                    if (Char.be != null && Char.be.items != null) {
                        if (GameCanvas.k[4]) {
                            if (--indexSelect < 0) {
                                indexSelect = Char.be.items.length - 1;
                            }
                        } else if (GameCanvas.k[6]) {
                            if (++indexSelect >= Char.be.items.length) {
                                indexSelect = 0;
                            }
                        } else if (GameCanvas.k[8]) {
                            if (indexSelect + nz <= Char.be.items.length - 1) {
                                indexSelect += nz;
                            }
                        } else if (GameCanvas.k[2]) {
                            if (indexSelect >= 0 && indexSelect < nz) {
                                indexTitle = 0;
                                indexSelect = 0;
                            } else if (indexSelect - nz >= 0) {
                                indexSelect -= nz;
                            }
                        }

                        aq.a(indexSelect / nz * aq.h);
                    }
                } else if (indexMenu == 0 && indexTitle == 1) {
                    if (GameCanvas.k[8]) {
                        ++indexTitle;
                    } else if (GameCanvas.k[2]) {
                        --indexTitle;
                    }
                } else if (indexMenu == 4) {
                    if (GameCanvas.k[2]) {
                        if (indexRow == 0) {
                            --indexTitle;
                            indexRow = -1;
                        } else {
                            --indexRow;
                        }

                        aq.a(indexRow * aq.h);
                    } else if (GameCanvas.k[8]) {
                        if (++indexRow >= gk) {
                            indexRow = 0;
                        }

                        aq.a(indexRow * aq.h);
                    } else if (GameCanvas.k[4]) {
                        --this.pk;
                        if (this.pk < 0) {
                            this.pk = 0;
                        }
                    } else if (GameCanvas.k[6]) {
                        ++this.pk;
                        if (this.pk > this.pl.size() - 1) {
                            this.pk = (byte) (this.pl.size() - 1);
                        }
                    }
                } else if (GameCanvas.k[2]) {
                    if (indexRow == 0) {
                        --indexTitle;
                        indexRow = -1;
                    } else {
                        --indexRow;
                    }

                    aq.a(indexRow * aq.h);
                    if (indexMenu == 1 && id) {
                        Service.gI().requestClanMember();
                        id = false;
                    }
                } else if (GameCanvas.k[8]) {
                    if (++indexRow >= gk) {
                        indexRow = 0;
                    }

                    aq.a(indexRow * aq.h);
                }

                this.bz();
            }

            if (GameCanvas.isTouch && GameCanvas.currentDialog == null && !GameCanvas.menu.showMenu) {
                label368:
                {
                    if (GameCanvas.o) {
                        if (GameCanvas.b(eu, et, ev, this.oq) && (!isPaintItemInfo || GameCanvas.z >= 320) && GameCanvas.n) {
                            if (GameCanvas.b(gW2 - 90, et + 5, 60, 40)) {
                                indexSelect = 0;
                                --indexMenu;
                                indexRow = 0;
                            }

                            if (GameCanvas.b(gW2 + 20, et + 5, 60, 40)) {
                                indexSelect = 0;
                                ++indexMenu;
                                indexRow = 0;
                            }

                            isPaintItemInfo = false;
                            aq.clear();
                            scrInfo.clear();
                            if (indexMenu < 0) {
                                indexMenu = mResources.mq.length - 1;
                            }

                            if (indexMenu > mResources.mq.length - 1) {
                                indexMenu = 0;
                            }

                            indexTitle = 1;
                            if (indexMenu == 1 && id) {
                                Service.gI().requestClanMember();
                                id = false;
                            } else if (indexMenu == 2 && Char.be != null && Char.be.items == null) {
                                Service.gI().requestClanItem();
                            }

                            if (indexMenu == 3) {
                                Service.gI().requestClanLog();
                            }

                            if (indexMenu == 4) {
                                Service.gI().requestClanItem();
                            }

                            setPopupSize(175, 200);
                            this.bz();
                        }

                        if (indexMenu == 4) {
                            int var1 = this.pu - this.pw / 2;
                            int var2 = this.pv - this.pw / 2;
                            int var3 = (this.pw + 5) * this.pl.size();
                            int var4 = this.pw;
                            if (GameCanvas.b(var1, var2, var3, var4) && (var1 = (GameCanvas.p - var1) / (this.pw + 5)) >= 0 && var1 < this.pl.size()) {
                                this.pk = (byte) var1;
                            }
                        }
                    }

                    ScrollResult var5;
                    if (isPaintItemInfo) {
                        if ((var5 = scrInfo.b()).isDowning || var5.isFinish) {
                            indexRow = var5.selected;
                            indexTitle = 1;
                        }

                        if (GameCanvas.h) {
                            break label368;
                        }
                    }

                    if (indexMenu == 2) {
                        if ((var5 = aq.b()).isDowning || var5.isFinish) {
                            indexSelect = var5.selected;
                            indexTitle = 1;
                            this.b(1509, (Object) null);
                        }
                    } else if (indexMenu == 0 && GameCanvas.b(eu + 18, et + 32, 5 * gi, gi) && GameCanvas.o && GameCanvas.n) {
                        if (Char.be != null) {
                            indexSelect = Char.be.itemLevel;
                            indexTitle = 1;
                        }
                    } else if (indexMenu != 0 && indexMenu != 3) {
                        if (indexMenu == 1 && vClan.size() != 0 && ((var5 = aq.b()).isDowning || var5.isFinish)) {
                            indexRow = var5.selected;
                            this.updateCommandForUI();
                        }
                    } else if (!isPaintItemInfo && ((var5 = aq.b()).isDowning || var5.isFinish)) {
                        indexRow = var5.selected;
                        indexTitle = indexMenu == 0 ? 2 : 1;
                        if (var5.isFinish) {
                            aq.a(indexRow * aq.h);
                        }
                    }
                }
            }

            GameCanvas.m();
            GameCanvas.l();
        }

    }

    private static Member by() {
        return (Member) vClan.elementAt(indexRow);
    }

    private void bz() {
        if (!isPaintItemInfo) {
            super.left = super.center = null;
            if (indexMenu == 0) {
                if (Char.getMyChar().ctypeClan == 4) {
                    super.left = new Command1(mResources.oc[0], 14004);
                }

                if (Char.getMyChar().ctypeClan == 3) {
                    super.left = new Command1(mResources.oc[1], 14004);
                }

                if (Char.getMyChar().ctypeClan == 2) {
                    super.left = new Command1(mResources.oc[2], 14004);
                }

                if (!Char.getMyChar().cClanName.equals("")) {
                    if (indexTitle == 1) {
                        super.center = new Command1(mResources.bg, 140101);
                        return;
                    }

                    super.center = new Command1(mResources.oe[3], 14010);
                    return;
                }
            } else if (indexMenu == 1) {
                Member var1;
                if (vClan.size() > 0 && indexRow >= 0 && indexRow < vClan.size() && (var1 = by()) != null) {
                    if (Char.getMyChar().ctypeClan == 4) {
                        super.left = new Command1(mResources.oc[0], 14005);
                    }

                    if (Char.getMyChar().ctypeClan == 3) {
                        super.left = new Command1(mResources.oc[1], 14005);
                    }

                    if (Char.getMyChar().ctypeClan != 4 && Char.getMyChar().ctypeClan != 3) {
                        super.left = new Command1(mResources.oc[4], 14005);
                    }

                    if (!var1.name.equals(Char.getMyChar().cName) && (!gp || this.mb != 0)) {
                        super.center = new Command1(mResources.dz, 14006, var1.name);
                        return;
                    }
                }
            } else if (indexMenu == 2 && indexTitle == 1) {
                if (Char.be == null || Char.be.items == null) {
                    return;
                }

                super.left = new Command1(mResources.dz, 1508);
                if (!GameCanvas.isTouchControlLargeScreen) {
                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 1509);
                }
            }
        }

    }

    private void ca() {
        if (isPaintAlert && GameCanvas.currentDialog == null) {
            boolean var1 = false;
            if (GameCanvas.k[8]) {
                if (++indexRow >= this.ix.size()) {
                    indexRow = 0;
                }

                var1 = true;
            } else if (GameCanvas.k[2]) {
                if (--indexRow < 0) {
                    indexRow = this.ix.size() - 1;
                }

                var1 = true;
            }

            if (var1) {
                aq.a(indexRow * aq.h);
                GameCanvas.m();
                GameCanvas.l();
            }

            ScrollResult var2;
            if (GameCanvas.isTouch && ((var2 = aq.b()).isDowning || var2.isFinish)) {
                indexRow = var2.selected;
                var1 = true;
            }

            ChatTab var3;
            if (isPaintMessage && !GameCanvas.isTouch && (var3 = ChatManager.gI().getCurrentChatTab()).type == 2 && indexRow == 0) {
                ChatTextField.gI().cmdChat = new Command1(mResources.ar, 120051, var3);
            }

            if (var1 && indexRow >= 0 && indexRow < this.ix.size()) {
                String var4 = (String) this.ix.elementAt(indexRow);
                this.ns = null;
                this.nr = null;
                super.center = null;
                ChatTextField.gI().cmdChat = null;
                int var5;
                if ((var5 = var4.indexOf("http://")) >= 0) {
                    this.nr = var4.substring(var5);
                    super.center = new Command1(mResources.bb, 12000);
                    if (!GameCanvas.isTouch) {
                        ChatTextField.gI().cmdChat = new Command1(mResources.bb, (IActionListener) null, 12000, (Object) null);
                        return;
                    }
                } else if (var4.indexOf("@") >= 0) {
                    var5 = (var4 = var4.substring(2).trim()).indexOf("@");
                    String var6;
                    int var7;
                    if ((var7 = (var6 = var4.substring(var5)).indexOf(" ")) <= 0) {
                        var7 = var5 + var6.length();
                    } else {
                        var7 += var5;
                    }

                    this.ns = var4.substring(var5 + 1, var7);
                    if (!this.ns.equals("") && !this.ns.equals(Char.getMyChar().cName) && !this.ns.equals(mResources.qx.substring(0, 5)) && !this.ns.equals(mResources.qx)) {
                        super.center = new Command1(mResources.dz, 12009, this.ns);
                        if (!GameCanvas.isTouch) {
                            ChatTextField.gI().cmdChat = new Command1(mResources.dz, (IActionListener) null, 12009, this.ns);
                            return;
                        }
                    } else {
                        this.ns = null;
                        super.center = null;
                    }
                }
            }
        }

    }

    private void cb() {
        if (isPaintMessage) {
            boolean var1 = false;
            if (GameCanvas.k[4]) {
                var1 = true;
                ChatManager.gI().switchToPreviousTab();
            } else if (GameCanvas.k[6]) {
                var1 = true;
                ChatManager.gI().switchToNextTab();
            }

            if (var1) {
                this.fm();
            }

            if (GameCanvas.isTouch && GameCanvas.b(eu, et, ev, this.oq) && (!isPaintItemInfo || GameCanvas.z >= 320) && GameCanvas.n && GameCanvas.o) {
                if (GameCanvas.b(gW2 - 90, et + 5, 60, 40)) {
                    ChatManager.gI().switchToPreviousTab();
                    this.fm();
                }

                if (GameCanvas.b(gW2 + 20, et + 5, 60, 40)) {
                    ChatManager.gI().switchToNextTab();
                    this.fm();
                }
            }
        }

    }

    private void cc() {
        if (indexRow >= 0 && vCharInMap.size() > 0) {
            if (Char.d(this.dd) == indexRow) {
                super.left = new Command1(mResources.ea, 14002);
            } else {
                super.left = new Command1(mResources.dz, 14003);
                super.center = new Command1("", 14003);
            }
        } else {
            super.left = super.center = null;
        }

    }

    private void cd() {
        if (vList.size() > 0 && indexRow >= 0 && gk > 0) {
            super.center = new Command1(mResources.ac, 14024);
            super.left = new Command1(mResources.ad, 14025);
        } else {
            super.center = null;
            super.left = null;
        }

    }

    private void ce() {
        if (vList.size() > 0 && indexRow >= 0 && gk > 0) {
            super.center = new Command1(mResources.dz, 14021);
        } else {
            super.center = null;
        }

    }

    private void cf() {
        if (vEnemies.size() > 0 && indexRow >= 0 && gk > 0) {
            super.center = new Command1(mResources.dz, 11078);
        } else {
            super.center = null;
        }

    }

    private void cg() {
        if (vFriend.size() > 0 && indexRow >= 0 && gk > 0 && indexRow < vFriend.size()) {
            vFriend.elementAt(indexRow);
            super.center = new Command1(mResources.dz, 11079);
        } else {
            super.center = null;
        }

    }

    private void ch() {
        super.center = null;
        if (indexRow != -1) {
            Party var1;
            if (((Party) vParty.elementAt(0)).charId == Char.getMyChar().charID) {
                if ((var1 = (Party) vParty.elementAt(indexRow)).charId != Char.getMyChar().charID) {
                    super.center = new Command1(mResources.dz, 11080, var1.name);
                    return;
                }
            } else if ((var1 = (Party) vParty.elementAt(indexRow)).charId != Char.getMyChar().charID) {
                super.center = new Command1(mResources.dz, 12009, var1.name);
            }
        }

    }

    private static boolean ci() {
        return gs || isPaintLuckySpin || isPaintItemInfo || isPaintInfoMe || isPaintStore || isPaintEliteShop || isPaintAuctionBuy || isPaintWeapon || isPaintNonNam || isPaintNonNu || isPaintAoNam || isPaintAoNu || isPaintGangTayNam || isPaintGangTayNu || isPaintQuanNam || isPaintQuanNu || isPaintGiayNam || isPaintGiayNu || isPaintLien || isPaintNhan || isPaintNgocBoi || isPaintPhu || isPaintStack || isPaintStackLock || isPaintGrocery || isPaintGroceryLock || isPaintUpGrade || isPaintAuctionSale || isPaintConvert || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintUpPearl || isPaintLuyenThach || isPaintBox || isPaintTrade || isPaintLuyenNgoc || isPaintAlert || ib || isPaintAuto || isPaintTeam || isPaintClan || isPaintFindTeam || isPaintTask || isPaintFriend || isPaintList || isPaintEnemies || isPaintCharInMap || isPaintMessage || isPaintLucky_Draw || isPaintKhamNgoc || isPaintGiaoDo || isPaintGotNgoc || isPaintThaoNgoc || im;
    }

    private boolean cj() {
        if (!GameCanvas.isTouch || Char.flag || ib || isPaintAuto || ChatTextField.gI().isShow || super.center == this.ez && GameCanvas.isTouchControlLargeScreen) {
            return true;
        } else {
            return GameCanvas.currentDialog != null || ChatPopup.b != null || GameCanvas.menu.showMenu || ci();
        }
    }

    public static boolean isPaintUI() {
        return isPaintAuto || isPaintStore || isPaintLuckySpin || isPaintEliteShop || isPaintWeapon || isPaintNonNam || isPaintNonNu || isPaintAoNam || isPaintAoNu || isPaintGangTayNam || isPaintGangTayNu || isPaintQuanNam || isPaintQuanNu || isPaintGiayNam || isPaintGiayNu || isPaintLien || isPaintNhan || isPaintNgocBoi || isPaintPhu || isPaintStack || isPaintStackLock || isPaintGrocery || isPaintGroceryLock || isPaintUpGrade || isPaintAuctionBuy || isPaintAuctionSale || isPaintConvert || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintUpPearl || isPaintLuyenThach || isPaintBox || isPaintTrade || isPaintLuyenNgoc || isPaintKhamNgoc || isPaintGiaoDo || isPaintGotNgoc || isPaintThaoNgoc || im;
    }

    private static boolean isOpenUI() {
        return isPaintAuto || isPaintItemInfo || isPaintLuckySpin || isPaintInfoMe || isPaintStore || isPaintEliteShop || isPaintWeapon || isPaintNonNam || isPaintNonNu || isPaintAoNam || isPaintAoNu || isPaintGangTayNam || isPaintGangTayNu || isPaintQuanNam || isPaintQuanNu || isPaintGiayNam || isPaintGiayNu || isPaintLien || isPaintNhan || isPaintNgocBoi || isPaintPhu || isPaintStack || isPaintStackLock || isPaintGrocery || isPaintGroceryLock || isPaintUpGrade || isPaintAuctionBuy || isPaintAuctionSale || isPaintConvert || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintUpPearl || isPaintLuyenThach || isPaintBox || isPaintTrade || isPaintLuyenNgoc || isPaintKhamNgoc || isPaintGiaoDo || isPaintGotNgoc || isPaintThaoNgoc || im;
    }

    private static boolean isSmallUI() {
        return gs || isPaintInfoMe && indexMenu > 0 && indexMenu < 5 || isPaintAuto || ib || isPaintClan && (indexMenu == 0 || indexMenu == 1 || indexMenu == 3 || indexMenu == 4) || isPaintCharInMap || isPaintTeam || isPaintFindTeam || isPaintFriend || isPaintList || isPaintEnemies || isPaintTask || isPaintMessage || isPaintAlert || isPaintLucky_Draw;
    }

    private static void a(Item var0) {
        Command1 var1 = new Command1(mResources.dm, 11055, var0);
        GameCanvas.inputDlg.a(mResources.kg, var1, 1);
    }

    private static void b(Item var0) {
        if (var0.upgrade > 0 && var0.isTypeBody()) {
            GameCanvas.msgdlg.setInfo(mResources.kw, (Command1) null, new Command1(mResources.aq, 110561), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else if (var0.quantity > 1) {
            Command1 var1 = new Command1(mResources.dm, 110562, var0);
            GameCanvas.inputDlg.a(mResources.kg, var1, 1);
        } else {
            GameCanvas.a(mResources.kq, new Command1(mResources.br, 11061, var0), new Command1(mResources.ce, 1));
        }

    }

    private static void cm() {
        Command1 var0 = new Command1(mResources.dm, 11042);
        GameCanvas.inputDlg.a(mResources.kf, var0, 1);
    }

    private static void cn() {
        Command1 var0 = new Command1(mResources.dm, 110361);
        GameCanvas.inputDlg.a(mResources.kf, var0, 1);
    }

    private static void co() {
        Command1 var0 = new Command1(mResources.dm, 11043);
        GameCanvas.inputDlg.a(mResources.kf, var0, 1);
    }

    public final void ab() {
        if (GameCanvas.currentDialog == null && isPaintUI()) {
            int var1;
            int var2;
            int var3;
            int var4;
            if (indexTitle == 0) {
                GameScr var8 = this;
                super.left = super.center = null;
                if (!isPaintLuckySpin) {
                    if (isPaintBox) {
                        if (indexMenu == 0) {
                            super.left = new Command1(mResources.aj, 11115);
                        } else if (indexMenu == 1) {
                            super.left = new Command1(mResources.aj, 11116);
                        }
                    } else if (indexMenu == 1 && isPaintLuyenNgoc && this.cy == 0) {
                        super.left = this.mo;
                    } else if (indexMenu == 1 && !isPaintStore && !isPaintEliteShop && !isPaintUpPearl && !isPaintLuyenThach && !isPaintUpGrade && !isPaintConvert && !isPaintSplit && !isPaintTinhluyen && !isPaintDichChuyen && !isPaintLuyenNgoc && !isPaintAuctionBuy && !isPaintAuctionSale && !isPaintKhamNgoc && !isPaintGiaoDo && !isPaintGotNgoc && !isPaintThaoNgoc && !im) {
                        super.left = new Command1(mResources.bn, 110221);
                    }

                    if (isPaintLuyenThach && indexMenu == 0) {
                        var1 = 0;
                        var2 = 0;
                        var3 = 0;
                        var4 = 0;

                        for (int var6 = 0; var6 < arrItemUpPeal.length; ++var6) {
                            Item var7;
                            if ((var7 = arrItemUpPeal[var6]) != null) {
                                if (var7.template.id == 455) {
                                    ++var1;
                                } else if (var7.template.id == 456) {
                                    ++var2;
                                } else if (var7.template.type == 26) {
                                    ++var3;
                                    var4 = var7.template.id;
                                }
                            }
                        }

                        if (var1 >= 9 || var2 >= 9 || var4 >= 10 && var1 >= 3 && var3 == 1 || var4 >= 11 && var2 >= 3 && var3 == 1) {
                            super.left = new Command1(mResources.fg, 1600);
                        }
                    }

                    if (isPaintUpPearl && indexMenu == 0) {
                        var1 = 0;

                        for (var2 = 0; var2 < arrItemUpPeal.length; ++var2) {
                            if (arrItemUpPeal[var2] != null) {
                                ++var1;
                                if (var1 >= 2) {
                                    super.left = new Command1(mResources.fg, 11062);
                                    break;
                                }
                            }
                        }
                    }

                    if (isPaintUpGrade && indexMenu == 0 && itemUpGrade != null) {
                        for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                            if (arrItemUpGrade[var1] != null) {
                                super.center = new Command1("", 110981);
                                super.left = new Command1(mResources.fg, 110981);
                                break;
                            }
                        }
                    }

                    if (isPaintGiaoDo && indexMenu == 0 && itemUpGrade != null && itemSplit != null) {
                        for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                            if (arrItemUpGrade[var1] != null) {
                                super.center = new Command1("", 341);
                                super.left = new Command1(mResources.fg, 341);
                                break;
                            }
                        }
                    }

                    if (isPaintAuctionSale && indexMenu == 0 && itemSell != null && this.iz != null && !this.iz.e().equals("") && Char.getMyChar().xu >= 5000) {
                        super.left = new Command1(mResources.by, 15002);
                    }

                    if (isPaintConvert && indexMenu == 0 && indexTitle == 0) {
                        for (var1 = 0; var1 < arrItemConvert.length; ++var1) {
                            if (arrItemConvert[var1] == null) {
                                var8.left = null;
                                break;
                            }

                            if (var1 == arrItemConvert.length - 1) {
                                var8.left = new Command1(mResources.fg, 140131);
                            }
                        }
                    }

                    if (isPaintSplit && indexMenu == 0 && itemSplit != null && itemSplit.upgrade > 0) {
                        var8.left = new Command1(mResources.fg, 11105);
                    }

                    if (isPaintLuyenNgoc && indexMenu == 0) {
                        if (var8.cy == 0) {
                            var8.left = var8.mg;
                        } else if (var8.cy == 1 && var8.cz > 0 && (long) var8.dc - System.currentTimeMillis() / 1000L <= 0L) {
                            var8.left = var8.mh;
                        }
                    }

                    if (GameCanvas.k[8]) {
                        indexTitle = 1;
                        indexSelect = 0;
                        indexRow = -1;
                        aq.clear();
                        scrInfo.clear();
                        var8.updateCommandForUI();
                    }

                    if (GameCanvas.k[4]) {
                        indexSelect = 0;
                        indexRow = -1;
                        --indexMenu;
                        aq.clear();
                        scrInfo.clear();
                        if (isPaintAuctionBuy) {
                            if (indexMenu < 0) {
                                indexMenu = mResources.qw.length - 1;
                            }

                            Service.gI().menu(28, 0, indexMenu);
                            arrItemStands = null;
                            indexSelect = -1;
                        } else if (!isPaintEliteShop && !isPaintAuto) {
                            if (indexMenu < 0) {
                                if (isPaintStore) {
                                    indexMenu = mResources.gm.length - 1;
                                } else {
                                    indexMenu = 1;
                                }
                            }
                        } else {
                            indexMenu = 0;
                        }

                        var8.left = var8.center = null;
                        if (isPaintStore) {
                            cq();
                        }

                        if (isPaintEliteShop && arrItemElites == null && indexMenu == 0) {
                            Service.gI().requestItem(35);
                        }
                    }

                    if (GameCanvas.k[6]) {
                        indexSelect = 0;
                        indexRow = -1;
                        ++indexMenu;
                        aq.clear();
                        scrInfo.clear();
                        if (isPaintAuctionBuy) {
                            if (indexMenu > mResources.qw.length - 1) {
                                indexMenu = 0;
                            }

                            Service.gI().menu(28, 0, indexMenu);
                            arrItemStands = null;
                            indexSelect = -1;
                        } else {
                            label1419:
                            {
                                if (!isPaintEliteShop && !isPaintAuto) {
                                    if (isPaintStore) {
                                        if (indexMenu <= mResources.gm.length - 1) {
                                            break label1419;
                                        }
                                    } else if (indexMenu <= 1) {
                                        break label1419;
                                    }
                                }

                                indexMenu = 0;
                            }
                        }

                        var8.left = var8.center = null;
                        if (isPaintStore) {
                            cq();
                        }

                        if (isPaintEliteShop && arrItemElites == null && indexMenu == 0) {
                            Service.gI().requestItem(35);
                        }
                    }
                }
            } else if (indexTitle > 0) {
                if (isPaintItemInfo) {
                    if (GameCanvas.k[2]) {
                        if (--indexRow < 0) {
                            indexRow = gk - 1;
                        }

                        scrInfo.a(indexRow * scrInfo.h);
                    } else if (GameCanvas.k[8]) {
                        if (++indexRow >= gk) {
                            indexRow = 0;
                        }

                        scrInfo.a(indexRow * scrInfo.h);
                    }
                } else {
                    if (isPaintAuto) {
                        if (GameCanvas.k[2]) {
                            if (--indexRow < 0) {
                                indexRow = gk;
                            }

                            aq.a(indexRow * aq.h);
                        } else if (GameCanvas.k[4]) {
                            if (indexRow == 0) {
                                if (Char.ek <= 10) {
                                    if (--Char.ek <= 0) {
                                        Char.ek = 1;
                                    }
                                } else {
                                    Char.ek -= 10;
                                }
                            } else if (indexRow == 1) {
                                if (Char.el <= 10) {
                                    if (--Char.el <= 0) {
                                        Char.el = 1;
                                    }
                                } else {
                                    Char.el -= 10;
                                }
                            } else if (indexRow == 2) {
                                if ((Char.em -= 10) <= 0) {
                                    Char.em = 1;
                                }
                            } else if (indexRow == 7) {
                                if ((Char.en -= 20) <= 0) {
                                    Char.en = 1;
                                }
                            } else if (indexRow == 8) {
                                if (--Char.eo <= 0) {
                                    Char.eo = 1;
                                }
                            } else if (indexRow == 9) {
                                if (--Char.ep <= 4) {
                                    Char.ep = 4;
                                }
                            } else if (indexRow == 10 && (Char.eq -= 10) <= 0) {
                                Char.eq = 1;
                            }
                        } else if (GameCanvas.k[6]) {
                            if (indexRow == 0) {
                                if (Char.ek >= 90) {
                                    if (++Char.ek >= 100) {
                                        Char.ek = 99;
                                    }
                                } else {
                                    Char.ek += 10;
                                }
                            } else if (indexRow == 1) {
                                if (Char.el >= 90) {
                                    if (++Char.el >= 100) {
                                        Char.el = 99;
                                    }
                                } else {
                                    Char.el += 10;
                                }
                            } else if (indexRow == 2) {
                                if (Char.em == 1) {
                                    Char.em = 10;
                                } else if ((Char.em += 10) > 70) {
                                    Char.em = 70;
                                }
                            } else if (indexRow == 7) {
                                if (Char.en == 1) {
                                    Char.en = 10;
                                } else if ((Char.en += 20) > 70) {
                                    Char.en = 70;
                                }
                            } else if (indexRow == 8) {
                                if (++Char.eo > 7) {
                                    Char.eo = 7;
                                }
                            } else if (indexRow == 9) {
                                if (++Char.ep > 12) {
                                    Char.ep = 12;
                                }
                            } else if (indexRow == 10) {
                                if (Char.eq == 1) {
                                    Char.eq = 10;
                                } else if ((Char.eq += 10) > 70) {
                                    Char.eq = 70;
                                }
                            }
                        } else if (GameCanvas.k[8]) {
                            if (++indexRow > gk) {
                                indexRow = 0;
                            }

                            aq.a(indexRow * aq.h);
                        }

                        if (!GameCanvas.isTouch) {
                            GameCanvas.m();
                            GameCanvas.l();
                        }
                    } else if (isPaintLuyenNgoc && indexMenu == 0) {
                        if (indexTitle == 1) {
                            if (GameCanvas.k[4]) {
                                if (--indexSelect < 0) {
                                    indexSelect = 11;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.k[6]) {
                                if (indexSelect == 2) {
                                    indexTitle = 2;
                                    indexSelect = 0;
                                } else if (indexSelect == 5) {
                                    indexTitle = 2;
                                    indexSelect = 3;
                                } else if (indexSelect == 8) {
                                    indexTitle = 2;
                                    indexSelect = 6;
                                } else if (indexSelect == 11) {
                                    indexTitle = 2;
                                    indexSelect = 9;
                                } else if (indexSelect == 14) {
                                    indexTitle = 2;
                                    indexSelect = 12;
                                } else if (++indexSelect >= 12) {
                                    indexSelect = 0;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.k[8]) {
                                if (indexSelect + 3 <= 11) {
                                    indexSelect += 3;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.k[2]) {
                                if (indexSelect >= 0 && indexSelect < 3) {
                                    indexTitle = 0;
                                    indexSelect = 0;
                                } else if (indexSelect - 3 >= 0) {
                                    indexSelect -= 3;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            }
                        } else if (indexTitle == 2) {
                            if (GameCanvas.k[4]) {
                                if (indexSelect == 0) {
                                    indexTitle = 1;
                                    indexSelect = 2;
                                } else if (indexSelect == 3) {
                                    indexTitle = 1;
                                    indexSelect = 5;
                                } else if (indexSelect == 6) {
                                    indexTitle = 1;
                                    indexSelect = 8;
                                } else if (indexSelect == 9) {
                                    indexTitle = 1;
                                    indexSelect = 11;
                                } else if (indexSelect == 12) {
                                    indexTitle = 1;
                                    indexSelect = 14;
                                } else if (--indexSelect < 0) {
                                    indexSelect = 11;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.k[6]) {
                                if (++indexSelect >= 12) {
                                    indexSelect = 0;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.k[8]) {
                                if (indexSelect + 3 <= 11) {
                                    indexSelect += 3;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.k[2]) {
                                if (indexSelect >= 0 && indexSelect < 3) {
                                    indexTitle = 0;
                                    indexSelect = 0;
                                } else if (indexSelect - 3 >= 0) {
                                    indexSelect -= 3;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            }
                        }

                        if (!GameCanvas.isTouch) {
                            GameCanvas.m();
                            GameCanvas.l();
                        }
                    } else if (isPaintLuckySpin) {
                        if (GameCanvas.k[4]) {
                            if (--indexSelect < 0) {
                                indexSelect = 8;
                            }
                        } else if (GameCanvas.k[6]) {
                            if (++indexSelect > 8) {
                                indexSelect = 0;
                            }
                        } else if (GameCanvas.k[8]) {
                            if (indexSelect + 3 < 9) {
                                indexSelect += 3;
                            }
                        } else if (GameCanvas.k[2] && indexSelect - 3 >= 0) {
                            indexSelect -= 3;
                        }

                        if (!GameCanvas.isTouch) {
                            GameCanvas.m();
                            GameCanvas.l();
                        }
                    } else if (isPaintAuctionSale && indexMenu == 0) {
                        if (GameCanvas.k[2]) {
                            if (--indexTitle < 0) {
                                indexTitle = 0;
                            }
                        } else if (GameCanvas.k[8] && ++indexTitle > 2) {
                            indexTitle = 2;
                        }

                        this.updateCommandForUI();
                    } else if (isPaintAuctionBuy) {
                        if (GameCanvas.k[4]) {
                            if (arrItemStands != null) {
                                if ((indexSelect -= 5) < 0) {
                                    indexSelect = arrItemStands.length - 1;
                                }

                                aq.a(indexSelect * aq.h);
                                this.updateCommandForUI();
                            }
                        } else if (GameCanvas.k[6]) {
                            if (arrItemStands != null) {
                                if ((indexSelect += 5) >= arrItemStands.length) {
                                    indexSelect = 0;
                                }

                                aq.a(indexSelect * aq.h);
                                this.updateCommandForUI();
                            }
                        } else if (GameCanvas.k[8]) {
                            if (arrItemStands != null) {
                                if (++indexSelect >= arrItemStands.length) {
                                    indexSelect = 0;
                                }

                                aq.a(indexSelect * aq.h);
                                this.updateCommandForUI();
                            }
                        } else if (GameCanvas.k[2] && arrItemStands != null) {
                            if (--indexSelect < 0) {
                                indexTitle = 0;
                            }

                            aq.a(indexSelect * aq.h);
                            this.updateCommandForUI();
                        }

                        GameCanvas.m();
                        GameCanvas.l();
                    } else if ((isPaintGotNgoc || isPaintGiaoDo || isPaintUpGrade || isPaintConvert) && indexTitle == 1 && indexMenu == 0) {
                        if (GameCanvas.k[4]) {
                            if (--indexSelect < 0) {
                                indexSelect = 1;
                            }

                            super.left = super.center = null;
                            this.updateCommandForUI();
                        } else if (GameCanvas.k[6]) {
                            if (++indexSelect > 1) {
                                indexSelect = 0;
                            }

                            super.left = super.center = null;
                            this.updateCommandForUI();
                        } else if (GameCanvas.k[8]) {
                            indexTitle = 2;
                            indexSelect = 0;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                        } else if (GameCanvas.k[2]) {
                            indexTitle = 0;
                            indexSelect = 0;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                        }

                        if (!GameCanvas.isTouch) {
                            GameCanvas.m();
                            GameCanvas.l();
                        }
                    } else if ((isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintKhamNgoc) && indexTitle == 1 && indexMenu == 0) {
                        if (GameCanvas.k[8]) {
                            indexTitle = 2;
                            indexSelect = 0;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                        } else if (GameCanvas.k[2]) {
                            indexTitle = 0;
                            indexSelect = 0;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                        }

                        GameCanvas.m();
                        GameCanvas.l();
                    } else if ((isPaintThaoNgoc || im) && indexMenu == 0) {
                        if (GameCanvas.k[2]) {
                            if (--indexTitle < 0) {
                                indexTitle = 0;
                            }
                        } else if (GameCanvas.k[8] && ++indexTitle > 1) {
                            indexTitle = 1;
                        }

                        this.updateCommandForUI();
                    }

                    int var5 = cp();
                    if (GameCanvas.k[4]) {
                        if (--indexSelect < 0) {
                            indexSelect = var5 - 1;
                        }

                        super.left = super.center = null;
                        this.updateCommandForUI();
                        aq.a(indexSelect / nz * aq.h);
                    } else if (GameCanvas.k[6]) {
                        if (++indexSelect >= var5) {
                            indexSelect = 0;
                        }

                        super.left = super.center = null;
                        this.updateCommandForUI();
                        aq.a(indexSelect / nz * aq.h);
                    } else if (GameCanvas.k[8]) {
                        if (indexSelect + nz <= var5 - 1) {
                            indexSelect += nz;
                        }

                        super.left = super.center = null;
                        this.updateCommandForUI();
                        aq.a(indexSelect / nz * aq.h);
                    } else if (GameCanvas.k[2]) {
                        if (indexSelect >= 0 && indexSelect < nz) {
                            indexTitle = 0;
                            indexSelect = 0;
                            if ((isPaintGiaoDo || isPaintUpGrade || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintConvert || isPaintKhamNgoc) && indexMenu == 0) {
                                indexTitle = 1;
                            }
                        } else if (indexSelect - nz >= 0) {
                            indexSelect -= nz;
                        }

                        super.left = super.center = null;
                        this.updateCommandForUI();
                        aq.a(indexSelect / nz * aq.h);
                    }
                }
            }

            if (GameCanvas.isTouch && !GameCanvas.menu.showMenu && GameCanvas.currentDialog == null) {
                label1661:
                {
                    if (GameCanvas.o && GameCanvas.b(eu, et, ev, this.oq) && (!isPaintItemInfo || GameCanvas.z >= 320) && GameCanvas.n) {
                        if (GameCanvas.b(gW2 - 80, et + 5, 60, 40)) {
                            indexSelect = 0;
                            --indexMenu;
                            this.updateCommandForUI();
                        }

                        if (GameCanvas.b(gW2 + 10, et + 5, 60, 40)) {
                            indexSelect = 0;
                            ++indexMenu;
                            this.updateCommandForUI();
                        }

                        indexTitle = 0;
                        if (!isPaintUI()) {
                            if (indexMenu < 0) {
                                indexMenu = mResources.fr.length - 1;
                            }

                            if (indexMenu > mResources.fr.length - 1) {
                                indexMenu = 0;
                            }
                        } else {
                            if (isPaintStore) {
                                if (indexMenu < 0) {
                                    indexMenu = mResources.gm.length - 1;
                                } else if (indexMenu > mResources.gm.length - 1) {
                                    indexMenu = 0;
                                }

                                cq();
                            } else if (isPaintAuctionBuy) {
                                if (indexMenu < 0) {
                                    indexMenu = mResources.qw.length - 1;
                                } else if (indexMenu > mResources.qw.length - 1) {
                                    indexMenu = 0;
                                }

                                Service.gI().menu(28, 0, indexMenu);
                                indexSelect = -1;
                            } else {
                                label1386:
                                {
                                    if (!isPaintEliteShop && !isPaintAuto) {
                                        if (indexMenu < 0) {
                                            indexMenu = 1;
                                            break label1386;
                                        }

                                        if (indexMenu <= 1) {
                                            break label1386;
                                        }
                                    }

                                    indexMenu = 0;
                                }
                            }

                            if (isPaintEliteShop) {
                                indexMenu = 0;
                            }
                        }

                        isPaintItemInfo = false;
                        aq.clear();
                    }

                    ScrollResult var9;
                    if (isPaintItemInfo) {
                        if ((var9 = scrInfo.b()).isDowning || var9.isFinish) {
                            indexRow = var9.selected;
                            indexTitle = 1;
                        }

                        if (!GameCanvas.isTouchControlLargeScreen) {
                            break label1661;
                        }
                    }

                    if (isPaintAuto) {
                        if (((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                            indexTitle = 1;
                            indexRow = var9.selected;
                            this.updateCommandForUI();
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 5, 16, 16, aq) && GameCanvas.n) {
                            Char.timeStartBlink = !Char.timeStartBlink;
                            if (dz == 1) {
                                Char.timeStartBlink = false;
                                InfoMe.addInfo(mResources.rp, 20, mFont.tahoma_7_yellow);
                            }

                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 35, 16, 16, aq) && GameCanvas.n) {
                            Char.isAHP = !Char.isAHP;
                            if (dz == 1) {
                                Char.isAHP = false;
                                InfoMe.addInfo(mResources.rp, 20, mFont.tahoma_7_yellow);
                            }

                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 65, 16, 16, aq) && GameCanvas.n) {
                            Char.isAMP = !Char.isAMP;
                            if (dz == 1) {
                                Char.isAMP = false;
                                InfoMe.addInfo(mResources.rp, 20, mFont.tahoma_7_yellow);
                            }

                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 95, 16, 16, aq) && GameCanvas.n) {
                            Char.isAFood = !Char.isAFood;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 125, 16, 16, aq) && GameCanvas.n) {
                            Char.isABuff = !Char.isABuff;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 155, 16, 16, aq) && GameCanvas.n) {
                            Char.isAResuscitate = !Char.isAResuscitate;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 185, 16, 16, aq) && GameCanvas.n) {
                            Char.isAPickYen = !Char.isAPickYen;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 215, 16, 16, aq) && GameCanvas.n) {
                            Char.isAPickYHM = !Char.isAPickYHM;
                            GameCanvas.m = false;
                            if (Char.isAPickYHM) {
                                Char.dt = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 245, 16, 16, aq) && GameCanvas.n) {
                            Char.isAPickYHMS = !Char.isAPickYHMS;
                            GameCanvas.m = false;
                            if (Char.isAPickYHMS) {
                                Char.dt = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 275, 16, 16, aq) && GameCanvas.n) {
                            Char.dm = !Char.dm;
                            GameCanvas.m = false;
                            if (Char.dm) {
                                Char.dt = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 305, 16, 16, aq) && GameCanvas.n) {
                            Char.dn = !Char.dn;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 335, 16, 16, aq) && GameCanvas.n) {
                            Char.doa = !Char.doa;
                            GameCanvas.m = false;
                            if (Char.doa) {
                                Char.dt = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 365, 16, 16, aq) && GameCanvas.n) {
                            Char.dp = !Char.dp;
                            GameCanvas.m = false;
                            if (Char.dp) {
                                Char.dt = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 395, 16, 16, aq) && GameCanvas.n) {
                            Char.dq = !Char.dq;
                            GameCanvas.m = false;
                            if (Char.dq) {
                                Char.dt = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 425, 16, 16, aq) && GameCanvas.n) {
                            Char.dr = !Char.dr;
                            GameCanvas.m = false;
                            if (Char.dr) {
                                Char.dt = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 455, 16, 16, aq) && GameCanvas.n) {
                            Char.ds = !Char.ds;
                            GameCanvas.m = false;
                            if (Char.ds) {
                                Char.dt = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 485, 16, 16, aq) && GameCanvas.n) {
                            Char.dt = !Char.dt;
                            GameCanvas.m = false;
                            if (Char.dt) {
                                Char.dm = false;
                                Char.isAPickYHMS = false;
                                Char.isAPickYHM = false;
                                Char.doa = false;
                                Char.dp = false;
                                Char.dq = false;
                            }
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 515, 16, 16, aq) && GameCanvas.n) {
                            Char.du = !Char.du;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 545, 16, 16, aq) && GameCanvas.n) {
                            Char.dv = !Char.dv;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 575, 16, 16, aq) && GameCanvas.n) {
                            Char.dw = !Char.dw;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 605, 16, 16, aq) && GameCanvas.n) {
                            Char.dx = !Char.dx;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 635, 16, 16, aq) && GameCanvas.n) {
                            Char.dy = !Char.dy;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 665, 16, 16, aq) && GameCanvas.n) {
                            Char.dz = !Char.dz;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 695, 16, 16, aq) && GameCanvas.n) {
                            Char.ea = !Char.ea;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 725, 16, 16, aq) && GameCanvas.n) {
                            Char.eb = !Char.eb;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 755, 16, 16, aq) && GameCanvas.n) {
                            Char.ec = !Char.ec;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 785, 16, 16, aq) && GameCanvas.n) {
                            Char.ed = !Char.ed;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 815, 16, 16, aq) && GameCanvas.n) {
                            Char.ee = !Char.ee;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 845, 16, 16, aq) && GameCanvas.n) {
                            Char.ef = !Char.ef;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 875, 16, 16, aq) && GameCanvas.n) {
                            Char.eg = !Char.eg;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 16, aq.d + 905, 16, 16, aq) && GameCanvas.n) {
                            Char.eh = !Char.eh;
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 131, aq.d + 2, 30, 20, aq) && GameCanvas.n && Char.timeStartBlink) {
                            GameCanvas.inputDlg.a(mResources.rm, new Command1(mResources.ch, 1511), 1);
                            GameCanvas.m = false;
                        }

                        if (GameCanvas.a(aq.c + 131, aq.d + 32, 30, 20, aq) && GameCanvas.n && Char.isAHP) {
                            GameCanvas.inputDlg.a(mResources.rm, new Command1(mResources.ch, 1512), 1);
                            GameCanvas.m = false;
                        }

                        MyVector var10;
                        if (GameCanvas.a(aq.c + 131, aq.d + 62, 30, 20, aq) && GameCanvas.n && Char.isAMP) {
                            (var10 = new MyVector()).addElement(new Command1(mResources.rn[0], 15130));
                            var10.addElement(new Command1(mResources.rn[1], 15131));
                            var10.addElement(new Command1(mResources.rn[2], 15132));
                            var10.addElement(new Command1(mResources.rn[3], 15133));
                            var10.addElement(new Command1(mResources.rn[4], 15134));
                            var10.addElement(new Command1(mResources.rn[5], 15135));
                            var10.addElement(new Command1(mResources.rn[6], 15136));
                            var10.addElement(new Command1(mResources.rn[7], 15137));
                            GameCanvas.menu.startAt(var10);
                            GameCanvas.menu.c = true;
                        }

                        if (GameCanvas.a(aq.c + 131, aq.d + 242, 30, 20, aq) && GameCanvas.n && Char.isAPickYHMS) {
                            (var10 = new MyVector()).addElement(new Command1(mResources.rn[0], 15150));
                            var10.addElement(new Command1(mResources.rn[1], 15151));
                            var10.addElement(new Command1(mResources.rn[3], 15153));
                            var10.addElement(new Command1(mResources.rn[5], 15155));
                            var10.addElement(new Command1(mResources.rn[7], 15157));
                            GameCanvas.menu.startAt(var10);
                            GameCanvas.menu.c = true;
                        }

                        if (GameCanvas.a(aq.c + 131, aq.d + 272, 30, 20, aq) && GameCanvas.n && Char.dm) {
                            (var10 = new MyVector()).addElement(new Command1(mResources.ro[0], 15161));
                            var10.addElement(new Command1(mResources.ro[1], 15162));
                            var10.addElement(new Command1(mResources.ro[2], 15163));
                            var10.addElement(new Command1(mResources.ro[3], 15164));
                            var10.addElement(new Command1(mResources.ro[4], 15165));
                            var10.addElement(new Command1(mResources.ro[5], 15166));
                            var10.addElement(new Command1(mResources.ro[6], 15167));
                            GameCanvas.menu.startAt(var10);
                            GameCanvas.menu.c = true;
                        }

                        if (GameCanvas.a(aq.c + 131, aq.d + 302, 30, 20, aq) && GameCanvas.n && Char.dn) {
                            (var10 = new MyVector()).addElement(new Command1(mResources.ro[3], 15174));
                            var10.addElement(new Command1(mResources.ro[4], 15175));
                            var10.addElement(new Command1(mResources.ro[5], 15176));
                            var10.addElement(new Command1(mResources.ro[6], 15177));
                            var10.addElement(new Command1(mResources.ro[7], 15178));
                            var10.addElement(new Command1(mResources.ro[8], 15179));
                            var10.addElement(new Command1(mResources.ro[9], 151710));
                            var10.addElement(new Command1(mResources.ro[10], 151711));
                            var10.addElement(new Command1(mResources.ro[11], 151712));
                            GameCanvas.menu.startAt(var10);
                            GameCanvas.menu.c = true;
                        }

                        if (GameCanvas.a(aq.c + 131, aq.d + 332, 30, 20, aq) && GameCanvas.n && Char.doa) {
                            (var10 = new MyVector()).addElement(new Command1(mResources.rn[0], 15130));
                            var10.addElement(new Command1(mResources.rn[1], 15141));
                            var10.addElement(new Command1(mResources.rn[2], 15142));
                            var10.addElement(new Command1(mResources.rn[3], 15143));
                            var10.addElement(new Command1(mResources.rn[4], 15144));
                            var10.addElement(new Command1(mResources.rn[5], 15145));
                            var10.addElement(new Command1(mResources.rn[6], 15146));
                            var10.addElement(new Command1(mResources.rn[7], 15147));
                            GameCanvas.menu.startAt(var10);
                            GameCanvas.menu.c = true;
                        }
                    } else if (!isPaintEliteShop && !isPaintStore && !isPaintBox && !isPaintTrade && !isPaintGrocery && !isPaintGroceryLock && !isPaintStack && !isPaintStackLock && !isPaintNonNam && !isPaintNonNu && !isPaintAoNam && !isPaintAoNu && !isPaintGangTayNam && !isPaintGangTayNu && !isPaintQuanNam && !isPaintQuanNu && !isPaintGiayNam && !isPaintGiayNu && !isPaintWeapon && !isPaintLien && !isPaintNhan && !isPaintNgocBoi && !isPaintPhu) {
                        if (isPaintLuyenNgoc) {
                            if (indexMenu == 0) {
                                this.a(eu + 4, et + this.oq + 15, 3, 4, 1);
                                this.a(eu + ev - 3 - 3 * gi, et + this.oq + 15, 3, 4, 2);
                            } else if (indexMenu == 1 && ((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                                indexTitle = 1;
                                indexSelect = var9.selected;
                                this.updateCommandForUI();
                            }
                        } else if (!isPaintUpPearl && !isPaintLuyenThach) {
                            if (!isPaintSplit && !isPaintTinhluyen && !isPaintDichChuyen && !isPaintKhamNgoc) {
                                if (!isPaintUpGrade && !isPaintConvert && !isPaintGiaoDo) {
                                    if (isPaintGotNgoc) {
                                        if (indexMenu == 0) {
                                            if (((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                                                indexTitle = 1;
                                                indexSelect = var9.selected;
                                                super.left = super.center = null;
                                                isPaintItemInfo = false;
                                                this.updateCommandForUI();
                                            }
                                        } else if (indexMenu == 1 && ((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                                            indexTitle = 1;
                                            indexSelect = var9.selected;
                                            this.updateCommandForUI();
                                        }
                                    } else if (isPaintAuctionSale) {
                                        if (indexMenu == 0) {
                                            if (GameCanvas.b(eu + 75, et + 69, gi, gi)) {
                                                if (GameCanvas.n && GameCanvas.o) {
                                                    indexTitle = 1;
                                                    this.updateCommandForUI();
                                                }
                                            } else if (GameCanvas.b(this.iz.a, this.iz.b, this.iz.c, this.iz.d) && GameCanvas.n && GameCanvas.o) {
                                                indexTitle = 2;
                                                this.iz.b();
                                                this.updateCommandForUI();
                                            }
                                        } else if (indexMenu == 1 && ((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                                            indexTitle = 1;
                                            indexSelect = var9.selected;
                                            this.updateCommandForUI();
                                        }
                                    } else if (isPaintLuckySpin) {
                                        if (GameCanvas.b(nt, nu, 120, 120) && GameCanvas.o && GameCanvas.n) {
                                            indexSelect = (GameCanvas.r - nt) / 40 + (GameCanvas.s - nu) / 40 * 3;
                                            indexTitle = 1;
                                            this.updateCommandForUI();
                                            this.da();
                                        }
                                    } else if (isPaintThaoNgoc || im) {
                                        if (indexMenu == 0) {
                                            if (GameCanvas.b(eu + 75, et + 69, gi, gi) && GameCanvas.n && GameCanvas.o) {
                                                indexTitle = 1;
                                                this.updateCommandForUI();
                                            }
                                        } else if (indexMenu == 1 && ((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                                            indexTitle = 1;
                                            indexSelect = var9.selected;
                                            this.updateCommandForUI();
                                        }
                                    }
                                } else if (indexMenu == 0) {
                                    var1 = eu + 45;
                                    var2 = et + 32;
                                    var3 = eu + 100;
                                    if (GameCanvas.o) {
                                        if (GameCanvas.b(var1, var2, 29, 29)) {
                                            indexTitle = 1;
                                            indexSelect = 0;
                                            this.updateCommandForUI();
                                        }

                                        if (GameCanvas.b(var3, var2, 29, 29)) {
                                            indexTitle = 1;
                                            indexSelect = 1;
                                            this.updateCommandForUI();
                                            if (isPaintUpPearl && indexMenu == 0) {
                                                for (var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
                                                    if (arrItemUpPeal[var4] != null) {
                                                        super.center = new Command1(mResources.dm, 11062);
                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        if (GameCanvas.b(eu, et + 2 * this.oq + 5, ev, ew - this.oq * 3)) {
                                            this.a(eu, et + 2 * this.oq + 5, 6, 3, 2);
                                        }
                                    }
                                } else if (indexMenu == 1 && ((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                                    indexTitle = 1;
                                    indexSelect = var9.selected;
                                    this.updateCommandForUI();
                                }
                            } else if (indexMenu == 0) {
                                if (GameCanvas.b(eu + 74, nu - gi - 3, gi, gi)) {
                                    indexTitle = 1;
                                    indexSelect = 0;
                                    this.updateCommandForUI();
                                }

                                this.a(eu + 4, et + 2 * this.oq + 5, 6, 4, 2);
                            } else if (indexMenu == 1 && ((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                                indexTitle = 1;
                                indexSelect = var9.selected;
                                this.updateCommandForUI();
                            }
                        } else if (indexMenu == 0) {
                            this.a(eu + 4, et + this.oq + 3, 6, 4, 1);
                        } else if (indexMenu == 1 && ((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                            indexTitle = 1;
                            indexSelect = var9.selected;
                            this.updateCommandForUI();
                        }
                    } else if (((var9 = aq.b()).isFinish || var9.isDowning) && indexSelect != var9.selected) {
                        indexTitle = 1;
                        indexSelect = var9.selected;
                        super.left = super.center = null;
                        isPaintItemInfo = false;
                        this.updateCommandForUI();
                    }
                }
            }

            GameCanvas.m();
            GameCanvas.l();
        }

    }

    private static int cp() {
        int var0 = 0;

        try {
            if (isPaintEliteShop) {
                if (arrItemElites.length % nz == 0) {
                    var0 = arrItemElites.length;
                } else {
                    var0 = (arrItemElites.length / nz + 1) * nz;
                }
            } else if (isPaintStore) {
                if (indexMenu == 0) {
                    if (arrItemStore.length % nz == 0) {
                        var0 = arrItemStore.length;
                    } else {
                        var0 = (arrItemStore.length / nz + 1) * nz;
                    }
                } else if (indexMenu == 1) {
                    if (arrItemBook.length % nz == 0) {
                        var0 = arrItemBook.length;
                    } else {
                        var0 = (arrItemBook.length / nz + 1) * nz;
                    }
                } else if (indexMenu == 2) {
                    if (arrItemFashion.length % nz == 0) {
                        var0 = arrItemFashion.length;
                    } else {
                        var0 = (arrItemFashion.length / nz + 1) * nz;
                    }
                }
            } else if (isPaintNonNam) {
                if (arrItemNonNam.length % nz == 0) {
                    var0 = arrItemNonNam.length;
                } else {
                    var0 = (arrItemNonNam.length / nz + 1) * nz;
                }
            } else if (isPaintNonNu) {
                if (arrItemNonNu.length % nz == 0) {
                    var0 = arrItemNonNu.length;
                } else {
                    var0 = (arrItemNonNu.length / nz + 1) * nz;
                }
            } else if (isPaintAoNam) {
                if (arrItemAoNam.length % nz == 0) {
                    var0 = arrItemAoNam.length;
                } else {
                    var0 = (arrItemAoNam.length / nz + 1) * nz;
                }
            } else if (isPaintAoNu) {
                if (arrItemAoNu.length % nz == 0) {
                    var0 = arrItemAoNu.length;
                } else {
                    var0 = (arrItemAoNu.length / nz + 1) * nz;
                }
            } else if (isPaintGangTayNam) {
                if (arrItemGangTayNam.length % nz == 0) {
                    var0 = arrItemGangTayNam.length;
                } else {
                    var0 = (arrItemGangTayNam.length / nz + 1) * nz;
                }
            } else if (isPaintGangTayNu) {
                if (arrItemGangTayNu.length % nz == 0) {
                    var0 = arrItemGangTayNu.length;
                } else {
                    var0 = (arrItemGangTayNu.length / nz + 1) * nz;
                }
            } else if (isPaintQuanNam) {
                if (arrItemQuanNam.length % nz == 0) {
                    var0 = arrItemQuanNam.length;
                } else {
                    var0 = (arrItemQuanNam.length / nz + 1) * nz;
                }
            } else if (isPaintQuanNu) {
                if (arrItemQuanNu.length % nz == 0) {
                    var0 = arrItemQuanNu.length;
                } else {
                    var0 = (arrItemQuanNu.length / nz + 1) * nz;
                }
            } else if (isPaintGiayNam) {
                if (arrItemGiayNam.length % nz == 0) {
                    var0 = arrItemGiayNam.length;
                } else {
                    var0 = (arrItemGiayNam.length / nz + 1) * nz;
                }
            } else if (isPaintGiayNu) {
                if (arrItemGiayNu.length % nz == 0) {
                    var0 = arrItemGiayNu.length;
                } else {
                    var0 = (arrItemGiayNu.length / nz + 1) * nz;
                }
            } else if (isPaintLien) {
                if (arrItemLien.length % nz == 0) {
                    var0 = arrItemLien.length;
                } else {
                    var0 = (arrItemLien.length / nz + 1) * nz;
                }
            } else if (isPaintNhan) {
                if (arrItemNhan.length % nz == 0) {
                    var0 = arrItemNhan.length;
                } else {
                    var0 = (arrItemNhan.length / nz + 1) * nz;
                }
            } else if (isPaintNgocBoi) {
                if (arrItemNgocBoi.length % nz == 0) {
                    var0 = arrItemNgocBoi.length;
                } else {
                    var0 = (arrItemNgocBoi.length / nz + 1) * nz;
                }
            } else if (isPaintPhu) {
                if (arrItemPhu.length % nz == 0) {
                    var0 = arrItemPhu.length;
                } else {
                    var0 = (arrItemPhu.length / nz + 1) * nz;
                }
            } else if (isPaintWeapon) {
                if (arrItemWeapon.length % nz == 0) {
                    var0 = arrItemWeapon.length;
                } else {
                    var0 = (arrItemWeapon.length / nz + 1) * nz;
                }
            } else if (isPaintStack) {
                if (arrItemStack.length % nz == 0) {
                    var0 = arrItemStack.length;
                } else {
                    var0 = (arrItemStack.length / nz + 1) * nz;
                }
            } else if (isPaintStackLock) {
                if (arrItemStackLock.length % nz == 0) {
                    var0 = arrItemStackLock.length;
                } else {
                    var0 = (arrItemStackLock.length / nz + 1) * nz;
                }
            } else if (isPaintGrocery) {
                if (arrItemGrocery.length % nz == 0) {
                    var0 = arrItemGrocery.length;
                } else {
                    var0 = (arrItemGrocery.length / nz + 1) * nz;
                }
            } else if (isPaintGroceryLock) {
                if (arrItemGroceryLock.length % nz == 0) {
                    var0 = arrItemGroceryLock.length;
                } else {
                    var0 = (arrItemGroceryLock.length / nz + 1) * nz;
                }
            }

            if (isPaintBox) {
                var0 = Char.getMyChar().arrItemBox.length;
            }

            if (indexMenu == 1 && !isPaintStore) {
                var0 = Char.getMyChar().arrItemBag.length;
            }
        } catch (Exception var2) {
        }

        if ((isPaintUpPearl || isPaintLuyenThach || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintKhamNgoc) && indexMenu == 0) {
            var0 = 24;
        } else if ((isPaintGiaoDo || isPaintUpGrade || isPaintConvert) && indexMenu == 0) {
            var0 = 18;
        } else if (var0 < 30) {
            var0 = 30;
        }

        return var0;
    }

    private static void cq() {
        if (indexMenu == 0) {
            Service.gI().requestItem(14);
        } else if (indexMenu == 1) {
            Service.gI().requestItem(15);
        } else if (indexMenu == 2) {
            Service.gI().requestItem(32);
        } else if (indexMenu == 3) {
            Service.gI().requestItem(34);
        }

    }

    private void cr() {
        if (Char.getMyChar().arrItemBag[indexSelect].quantity > 1) {
            super.left = new Command1(mResources.by, 11072);
        } else {
            super.left = new Command1(mResources.by, 11073);
        }

    }

    public final void updateCommandForUI() {
        super.left = super.center = null;
        if (indexSelect >= 0) {
            if (isPaintAuto) {
                if (indexTitle == 1 && !GameCanvas.isTouch) {
                    super.left = new Command1(mResources.dz, 1510);
                    return;
                }
            } else if (isPaintLuckySpin) {
                if (indexTitle == 1) {
                    super.left = new Command1(mResources.dz, 1506);
                    super.center = new Command1("", 1507);
                    return;
                }
            } else if (isPaintEliteShop) {
                if (indexMenu == 0 && getItemFocus(35) != null) {
                    super.left = this.mv;
                    if (!GameCanvas.isTouchControlLargeScreen) {
                        super.center = this.mw;
                        return;
                    }

                    this.actView((byte) 35);
                    return;
                }
            } else if (isPaintStore) {
                if (indexMenu == 0) {
                    if (getItemFocus(14) != null) {
                        super.left = this.cmdStoreBuy;
                        if (!GameCanvas.isTouchControlLargeScreen) {
                            super.center = this.cmdStoreView;
                            return;
                        }

                        this.actView((byte) 14);
                        return;
                    }
                } else if (indexMenu == 1) {
                    if (getItemFocus(15) != null) {
                        super.left = this.nb;
                        if (!GameCanvas.isTouchControlLargeScreen) {
                            super.center = this.nc;
                            return;
                        }

                        this.actView((byte) 15);
                        return;
                    }
                } else if (indexMenu == 2) {
                    if (getItemFocus(32) != null) {
                        super.left = this.nd;
                        if (!GameCanvas.isTouchControlLargeScreen) {
                            super.center = this.ne;
                            return;
                        }

                        this.actView((byte) 32);
                        return;
                    }
                } else if (indexMenu == 3 && getItemFocus(34) != null) {
                    super.left = this.mz;
                    if (!GameCanvas.isTouchControlLargeScreen) {
                        super.center = this.na;
                        return;
                    }

                    this.actView((byte) 34);
                    return;
                }
            } else {
                if (isPaintNonNam) {
                    if (indexMenu == 0) {
                        if (getItemFocus(20) != null) {
                            super.left = this.nf;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.ng;
                            } else {
                                this.actView((byte) 20);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.cr();
                    }
                } else if (isPaintNonNu) {
                    if (indexMenu == 0) {
                        if (getItemFocus(21) != null) {
                            super.left = this.nh;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.ni;
                            } else {
                                this.actView((byte) 21);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.cr();
                    }
                } else if (isPaintAoNam) {
                    if (indexMenu == 0) {
                        if (getItemFocus(22) != null) {
                            super.left = this.nj;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.nk;
                            } else {
                                this.actView((byte) 22);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.cr();
                    }
                } else if (isPaintAoNu) {
                    if (indexMenu == 0) {
                        if (getItemFocus(23) != null) {
                            super.left = this.nl;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.nm;
                            } else {
                                this.actView((byte) 23);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.cr();
                    }
                } else if (isPaintGangTayNam) {
                    if (indexMenu == 0) {
                        if (getItemFocus(24) != null) {
                            super.left = this.nn;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.no;
                            } else {
                                this.actView((byte) 24);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.cr();
                    }
                } else if (isPaintGangTayNu) {
                    if (indexMenu == 0) {
                        if (getItemFocus(25) != null) {
                            super.left = this.np;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.nq;
                            } else {
                                this.actView((byte) 25);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.cr();
                    }
                } else {
                    Item var1;
                    if (isPaintQuanNam) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(26)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (!GameCanvas.isTouchControlLargeScreen) {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11088, var1);
                                } else {
                                    this.updateItemInfo((int) 26, (Item) var1);
                                }
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintQuanNu) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(27)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (!GameCanvas.isTouchControlLargeScreen) {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11089);
                                } else {
                                    this.updateItemInfo((int) 27, (Item) var1);
                                }
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintGiayNam) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(28)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (!GameCanvas.isTouchControlLargeScreen) {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11090);
                                } else {
                                    this.updateItemInfo((int) 28, (Item) var1);
                                }
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintGiayNu) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(29)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (!GameCanvas.isTouchControlLargeScreen) {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11091);
                                } else {
                                    this.updateItemInfo((int) 29, (Item) var1);
                                }
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintLien) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(16)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 16, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 110923);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintNhan) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(17)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 17, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 110924);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintNgocBoi) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(18)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 18, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 110925);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintPhu) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(19)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 19, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 110926);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintWeapon) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(2)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 2, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11093);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.cr();
                        }
                    } else if (isPaintStack) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(6)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 6, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11094);
                                }
                            }
                        } else if (indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                this.cr();
                            } else {
                                super.left = this.ok;
                            }
                        }
                    } else if (isPaintStackLock) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(7)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 7, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11095);
                                }
                            }
                        } else if (indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                this.cr();
                            } else {
                                super.left = this.ok;
                            }
                        }
                    } else if (isPaintGrocery) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(8)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 8, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11096);
                                }
                            }
                        } else if (indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                this.cr();
                            } else {
                                super.left = this.ok;
                            }
                        }
                    } else if (isPaintGroceryLock) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(9)) != null) {
                                super.left = new Command1(mResources.cc, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 9, (Item) var1);
                                } else {
                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11097);
                                }
                            }
                        } else if (indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                this.cr();
                            } else {
                                super.left = this.ok;
                            }
                        }
                    } else {
                        int var2;
                        if (isPaintUpGrade) {
                            if (indexMenu == 0) {
                                if (indexTitle == 1) {
                                    if (itemUpGrade != null) {
                                        if (indexSelect == 0) {
                                            super.left = new Command1(mResources.dz, 11098);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                isViewNext = false;
                                                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                                            } else {
                                                super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11099);
                                            }
                                        } else if (indexSelect == 1 && !itemUpGrade.isUpMax()) {
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                isViewNext = true;
                                                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                                            } else {
                                                super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 110991);
                                            }
                                        }
                                    } else {
                                        isPaintItemInfo = false;
                                    }
                                } else if (indexTitle == 2) {
                                    var1 = getItemFocus(10);
                                    isViewNext = false;
                                    if (var1 != null) {
                                        super.left = new Command1(mResources.dz, 11100);
                                        if (GameCanvas.isTouchControlLargeScreen) {
                                            this.updateItemInfo((int) 3, (Item) var1);
                                        } else {
                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11101);
                                        }
                                    } else {
                                        super.left = null;
                                        isPaintItemInfo = false;
                                        if (itemUpGrade != null) {
                                            for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                                                if (arrItemUpGrade[var2] != null) {
                                                    super.left = new Command1(mResources.fg, 110981);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (indexMenu == 1) {
                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                    super.left = new Command1(mResources.dz, 11102);
                                } else {
                                    super.left = null;
                                }
                            }
                        } else {
                            int var3;
                            if (isPaintConvert) {
                                if (indexMenu != 0) {
                                    if (indexMenu == 1) {
                                        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                            super.left = new Command1(mResources.dz, 14012);
                                        } else {
                                            super.left = null;
                                        }
                                    }
                                } else if (indexTitle == 1) {
                                    if (indexSelect == 0) {
                                        if (arrItemConvert[0] != null) {
                                            super.left = new Command1(mResources.dz, 14013);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.updateItemInfo((int) 3, (Item) arrItemConvert[indexSelect]);
                                            } else {
                                                super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 14016);
                                            }
                                        }
                                    } else if (indexSelect == 1) {
                                        if (arrItemConvert[1] != null) {
                                            super.left = new Command1(mResources.dz, 14013);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.updateItemInfo((int) 3, (Item) arrItemConvert[indexSelect]);
                                            } else {
                                                super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 14016);
                                            }
                                        }
                                    } else {
                                        isPaintItemInfo = false;
                                    }
                                } else if (indexTitle == 2) {
                                    var1 = null;
                                    if ((var2 = indexSelect + 2) <= arrItemConvert.length - 1) {
                                        var1 = arrItemConvert[var2];
                                    }

                                    if (var1 != null) {
                                        super.left = new Command1(mResources.bt, 140151);
                                        if (GameCanvas.isTouchControlLargeScreen) {
                                            this.updateItemInfo((int) 3, (Item) var1);
                                        } else {
                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 140161);
                                        }
                                    } else {
                                        super.left = new Command1(mResources.fg, 140131);

                                        for (var3 = 0; var3 < arrItemConvert.length; ++var3) {
                                            if (arrItemConvert[var3] == null) {
                                                super.left = null;
                                                break;
                                            }
                                        }

                                        isPaintItemInfo = false;
                                    }
                                }
                            } else {
                                int var4;
                                if (isPaintAuctionSale) {
                                    if (indexMenu == 0) {
                                        if (indexTitle == 2) {
                                            this.iz.e = true;
                                            super.right = this.iz.k;
                                        } else {
                                            this.iz.e = false;
                                            super.right = this.mu;
                                        }

                                        var4 = 0;

                                        try {
                                            var4 = Integer.parseInt(this.iz.e());
                                        } catch (Exception var10) {
                                        }

                                        if (itemSell != null && var4 > 0 && Char.getMyChar().xu >= 5000) {
                                            super.left = new Command1(mResources.by, 15002);
                                        }

                                        if (indexTitle == 1 && itemSell != null) {
                                            super.left = new Command1(mResources.dz, 1500);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.updateItemInfo((int) 3, (Item) itemSell);
                                            } else {
                                                super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 1501);
                                            }
                                        }
                                    } else if (indexMenu == 1) {
                                        super.right = this.mu;
                                        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                            super.left = new Command1(mResources.dz, 1503);
                                        } else {
                                            super.left = null;
                                            isPaintItemInfo = false;
                                        }
                                    }
                                } else {
                                    if (isPaintAuctionBuy) {
                                        if (indexTitle == 1 && arrItemStands != null && indexSelect >= 0 && indexSelect < arrItemStands.length && arrItemStands[indexSelect] != null) {
                                            super.left = new Command1(mResources.dz, 1504);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.b(1505, (Object) null);
                                                return;
                                            }

                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 1505);
                                        }

                                        return;
                                    }

                                    if (isPaintSplit) {
                                        if (indexMenu == 0) {
                                            if (indexTitle != 1) {
                                                if (indexTitle == 2) {
                                                    if ((var1 = arrItemSplit[indexSelect]) != null) {
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            this.updateItemInfo((int) 3, (Item) var1);
                                                        } else {
                                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, var1);
                                                        }
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }

                                                    if (itemSplit != null && itemSplit.upgrade > 0) {
                                                        super.left = new Command1(mResources.fg, 11105);
                                                    }
                                                }
                                            } else {
                                                if (itemSplit != null && itemSplit.upgrade > 0) {
                                                    super.left = new Command1(mResources.dz, 11103);
                                                } else if (itemSplit != null) {
                                                    super.left = this.mn;
                                                } else {
                                                    isPaintItemInfo = false;
                                                }

                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                    this.updateItemInfo((int) 3, (Item) itemSplit);
                                                } else {
                                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, itemSplit);
                                                }
                                            }
                                        } else if (indexMenu == 1) {
                                            if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                super.left = null;
                                                isPaintItemInfo = false;
                                            } else {
                                                super.left = new Command1(mResources.dz, 11106);
                                            }
                                        }
                                    } else if (isPaintTinhluyen) {
                                        try {
                                            if (indexMenu == 0) {
                                                if (indexTitle == 1) {
                                                    if (itemSplit != null) {
                                                        super.left = new Command1(mResources.dz, 11103);
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }

                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 3, (Item) itemSplit);
                                                    } else {
                                                        super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, itemSplit);
                                                    }
                                                } else if (indexTitle == 2) {
                                                    if ((var1 = arrItemSplit[indexSelect]) != null) {
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            this.updateItemInfo((int) 3, (Item) var1);
                                                        } else {
                                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, var1);
                                                        }

                                                        super.left = new Command1(mResources.bt, 1605);
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }

                                                    if (itemSplit != null) {
                                                        super.left = new Command1(mResources.dz, 1604);
                                                    }
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                    super.left = null;
                                                    isPaintItemInfo = false;
                                                } else {
                                                    super.left = new Command1(mResources.dz, 11106);
                                                }
                                            }
                                        } catch (Exception var9) {
                                        }
                                    } else if (isPaintDichChuyen) {
                                        if (indexMenu == 0) {
                                            if (indexTitle != 1) {
                                                if (indexTitle == 2) {
                                                    if ((var1 = arrItemSplit[indexSelect]) != null) {
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            this.updateItemInfo((int) 3, (Item) var1);
                                                        } else {
                                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, var1);
                                                        }
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }

                                                    if (itemSplit != null && itemSplit.upgrade > 11) {
                                                        super.left = new Command1(mResources.dz, 1604);
                                                    }
                                                }
                                            } else {
                                                if (itemSplit != null && itemSplit.upgrade > 11) {
                                                    super.left = new Command1(mResources.dz, 11103);
                                                } else if (itemSplit != null) {
                                                    super.left = this.mn;
                                                } else {
                                                    isPaintItemInfo = false;
                                                }

                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                    this.updateItemInfo((int) 3, (Item) itemSplit);
                                                } else {
                                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, itemSplit);
                                                }
                                            }
                                        } else if (indexMenu == 1) {
                                            if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                super.left = null;
                                                isPaintItemInfo = false;
                                            } else {
                                                super.left = new Command1(mResources.dz, 1606);
                                            }
                                        }
                                    } else if (isPaintUpPearl) {
                                        if (indexMenu != 0) {
                                            if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command1(mResources.dz, 11109);
                                                } else {
                                                    isPaintItemInfo = false;
                                                    super.left = null;
                                                }
                                            }
                                        } else {
                                            var4 = 0;

                                            for (var2 = 0; var2 < arrItemUpPeal.length; ++var2) {
                                                if (arrItemUpPeal[var2] != null) {
                                                    ++var4;
                                                    if (var4 >= 2) {
                                                        break;
                                                    }
                                                }
                                            }

                                            if ((var1 = getItemFocus(11)) != null) {
                                                if (var4 >= 2) {
                                                    super.left = new Command1(mResources.dz, 11107);
                                                } else {
                                                    super.left = new Command1(mResources.bt, 111071);
                                                }

                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                    this.updateItemInfo((int) 3, (Item) var1);
                                                } else {
                                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11108);
                                                }
                                            } else {
                                                isPaintItemInfo = false;
                                                if (var4 >= 2) {
                                                    super.left = new Command1(mResources.fg, 11062);
                                                }
                                            }
                                        }
                                    } else if (!isPaintLuyenThach) {
                                        if (isPaintLuyenNgoc) {
                                            if (indexMenu == 0) {
                                                if (indexTitle == 1) {
                                                    if (arrItemTradeMe[indexSelect] != null) {
                                                        if (this.cy == 0) {
                                                            super.left = this.mt;
                                                        } else if (this.cy == 1 && this.cz > 0 && (long) this.dc - System.currentTimeMillis() / 1000L <= 0L) {
                                                            super.left = this.mh;
                                                        }

                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            var1 = arrItemTradeMe[indexSelect];
                                                            this.updateItemInfo((int) 3, (Item) var1);
                                                        } else {
                                                            super.center = this.mq;
                                                        }
                                                    } else {
                                                        isPaintItemInfo = false;
                                                        if (this.cy == 0) {
                                                            super.left = this.mg;
                                                        } else if (this.cy == 1 && this.cz > 0 && (long) this.dc - System.currentTimeMillis() / 1000L <= 0L) {
                                                            super.left = this.mh;
                                                        }
                                                    }
                                                }

                                                if (indexTitle == 2) {
                                                    if (arrItemTradeOrder[indexSelect] != null) {
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            var1 = arrItemTradeOrder[indexSelect];
                                                            this.updateItemInfo((int) 30, (Item) var1);
                                                        } else {
                                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11110);
                                                        }
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }
                                                }
                                            } else if (indexMenu == 1 && this.cy == 0) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = this.ms;
                                                } else {
                                                    super.left = this.mo;
                                                }
                                            }
                                        } else if (isPaintBox) {
                                            if (indexMenu == 0) {
                                                if ((var1 = getItemFocus(4)) != null) {
                                                    super.left = new Command1(mResources.bs, 111101);
                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 4, (Item) var1);
                                                    } else {
                                                        super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11111);
                                                    }
                                                } else {
                                                    super.left = new Command1(mResources.bn, 11112);
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command1(mResources.bx, 11113);
                                                } else {
                                                    super.left = this.ok;
                                                }
                                            }
                                        } else if (isPaintTrade) {
                                            if (indexMenu == 0) {
                                                if (indexSelect >= 0 && indexSelect <= NSOT_MOB.f.length && NSOT_MOB.f[indexSelect] > 0) {
                                                    super.left = new Command1(mResources.su, 1100077);
                                                } else {
                                                    super.left = new Command1(mResources.bn, 1100078);
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command1(mResources.sv, 1100079);
                                                } else {
                                                    super.left = this.ok;
                                                }
                                            }
                                        } else if (isPaintKhamNgoc) {
                                            GameScr var12 = this;

                                            try {
                                                if (indexMenu == 0) {
                                                    if (indexTitle == 1) {
                                                        if (itemSplit != null) {
                                                            var12.left = new Command1(mResources.dz, 11103);
                                                        } else {
                                                            isPaintItemInfo = false;
                                                        }

                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            var12.updateItemInfo((int) 3, (Item) itemSplit);
                                                        } else {
                                                            var12.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, itemSplit);
                                                        }
                                                    } else if (indexTitle == 2) {
                                                        if ((var1 = arrItemSplit[indexSelect]) != null) {
                                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                                var12.updateItemInfo((int) 3, (Item) var1);
                                                            } else {
                                                                var12.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, var1);
                                                            }

                                                            var12.left = new Command1(mResources.bt, 1605);
                                                        } else {
                                                            isPaintItemInfo = false;
                                                        }

                                                        if (itemSplit != null) {
                                                            var12.left = new Command1(mResources.dz, 1604);
                                                        }
                                                    }
                                                } else if (indexMenu == 1) {
                                                    if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                        var12.left = null;
                                                        isPaintItemInfo = false;
                                                    } else {
                                                        var12.left = new Command1(mResources.dz, 222);
                                                    }
                                                }
                                            } catch (Exception var8) {
                                            }
                                        } else if (isPaintGiaoDo) {
                                            if (indexMenu == 0) {
                                                if (indexTitle == 1) {
                                                    if (itemSplit != null && indexSelect == 0) {
                                                        super.left = new Command1(mResources.dz, 338);
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            isViewNext = false;
                                                            this.updateItemInfo((int) 3, (Item) itemSplit);
                                                        } else {
                                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 335);
                                                        }
                                                    }

                                                    if (itemUpGrade != null && indexSelect == 1) {
                                                        super.left = new Command1(mResources.dz, 344);
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            isViewNext = false;
                                                            this.updateItemInfo((int) 3, (Item) itemUpGrade);
                                                        } else {
                                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 336);
                                                        }
                                                    }

                                                    if (itemSplit == null && itemUpGrade == null) {
                                                        isPaintItemInfo = false;
                                                    }
                                                } else if (indexTitle == 2) {
                                                    var1 = getItemFocus(47);
                                                    isViewNext = false;
                                                    if (var1 != null) {
                                                        super.left = new Command1(mResources.dz, 345);
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            this.updateItemInfo((int) 3, (Item) var1);
                                                        } else {
                                                            super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11101);
                                                        }
                                                    } else {
                                                        super.left = null;
                                                        isPaintItemInfo = false;
                                                        if (itemUpGrade != null && itemSplit != null) {
                                                            for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                                                                if (arrItemUpGrade[var2] != null) {
                                                                    super.left = new Command1(mResources.fg, 341);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command1(mResources.dz, 337);
                                                } else {
                                                    super.left = null;
                                                }
                                            }
                                        } else if (isPaintGotNgoc) {
                                            if (indexMenu == 0) {
                                                var1 = getItemFocus(48);
                                                isViewNext = false;
                                                if (var1 != null) {
                                                    super.left = new Command1(mResources.dz, 401);
                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 3, (Item) var1);
                                                    } else {
                                                        super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11101);
                                                    }
                                                } else {
                                                    for (var2 = 0; var2 < arrItemSplit.length; ++var2) {
                                                        if (arrItemSplit[var2] != null) {
                                                            super.left = new Command1(mResources.gv[0], 403);
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command1(mResources.dz, 400);
                                                } else {
                                                    super.left = null;
                                                }
                                            }
                                        } else if (isPaintThaoNgoc || im) {
                                            if (indexMenu == 0) {
                                                if (itemSplit != null) {
                                                    super.left = new Command1(mResources.dz, 11103);
                                                } else {
                                                    isPaintItemInfo = false;
                                                }

                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                    this.updateItemInfo((int) 3, (Item) itemSplit);
                                                } else {
                                                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11104, itemSplit);
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                    super.left = null;
                                                    isPaintItemInfo = false;
                                                } else {
                                                    super.left = new Command1(mResources.dz, 405);
                                                }
                                            }
                                        }
                                    } else if (indexMenu != 0) {
                                        if (indexMenu == 1) {
                                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                super.left = new Command1(mResources.dz, 1603);
                                            } else {
                                                isPaintItemInfo = false;
                                                super.left = null;
                                            }
                                        }
                                    } else {
                                        var4 = 0;
                                        var2 = 0;
                                        var3 = 0;
                                        short var5 = 0;

                                        for (int var6 = 0; var6 < arrItemUpPeal.length; ++var6) {
                                            Item var7;
                                            if ((var7 = arrItemUpPeal[var6]) != null) {
                                                if (var7.template.id == 455) {
                                                    ++var4;
                                                } else if (var7.template.id == 456) {
                                                    ++var2;
                                                } else if (var7.template.type == 26) {
                                                    var5 = var7.template.id;
                                                    ++var3;
                                                }
                                            }

                                            if (var4 >= 9 || var2 >= 9 || var5 == 10 && var4 >= 3 || var5 == 11 && var2 >= 3) {
                                                break;
                                            }
                                        }

                                        Item var11;
                                        if ((var11 = getItemFocus(43)) == null) {
                                            isPaintItemInfo = false;
                                            if (var4 >= 9 || var2 >= 9 || var5 >= 10 && (var4 >= 3 || var2 >= 3)) {
                                                super.left = new Command1(mResources.fg, 1600);
                                            }
                                        } else {
                                            if (var4 != 9 && var2 != 9 && (var5 != 10 || var4 != 3 || var3 != 1) && (var5 != 11 || var2 != 3 || var3 != 1)) {
                                                super.left = new Command1(mResources.bt, 111071);
                                            } else {
                                                super.left = new Command1(mResources.dz, 1601);
                                            }

                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.updateItemInfo((int) 43, (Item) var11);
                                            } else {
                                                super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 1602);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (isPaintUI() && indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                    if (GameCanvas.isTouchControlLargeScreen) {
                        this.updateItemInfo((int) 3, (Item) Char.getMyChar().arrItemBag[indexSelect]);
                        return;
                    }

                    super.center = new Command1(GameCanvas.isTouch ? mResources.bg : "", 11114);
                }
            }
        }

    }

    public static void setPopupSize(int var0, int var1) {
        if (GameCanvas.z == 128 || GameCanvas.aa <= 208) {
            var0 = 126;
            var1 = 160;
        }

        ev = var0;
        ew = var1;
        eu = gW2 - var0 / 2;
        et = gW3 - var1 / 2;
        if (GameCanvas.aa <= 250) {
            et -= 10;
        }

        if (GameCanvas.isTouchControlLargeScreen && !isSmallUI() && GameCanvas.currentScreen instanceof GameScr) {
            ev = 310;
            eu = gW / 2 - ev / 2;
        }

        if (et < -10) {
            et = -10;
        }

        if (GameCanvas.aa > 208 && et < 0) {
            et = 0;
        }

        if (GameCanvas.aa == 208 && et < 10) {
            et = 10;
        }

    }

    private void a(mGraphics var1, Skill var2) {
        if (Char.getMyChar().clevel >= var2.level) {
            mFont.tahoma_7_white.a(var1, mResources.id + " " + var2.level, nt + 5, this.ob += 12, 0);
        } else {
            mFont.tahoma_7_red.a(var1, mResources.id + " " + var2.level, nt + 5, this.ob += 12, 0);
        }

        if (var2.template.type != 0) {
            gk += 4;
            mFont.tahoma_7_white.a(var1, mResources.lj + ": " + var2.d(), nt + 5, this.ob += 12, 0);
            mFont.tahoma_7_white.a(var1, mResources.ll + ": " + var2.manaUse, nt + 5, this.ob += 12, 0);
            mFont.tahoma_7_white.a(var1, mResources.lk + ": " + var2.b(), nt + 5, this.ob += 12, 0);
            StringBuffer var3 = (new StringBuffer(String.valueOf(mResources.lm))).append(": ");
            String var5;
            if (var2.coolDown % 1000 == 0) {
                var5 = String.valueOf(var2.coolDown / 1000);
            } else {
                int var6 = var2.coolDown % 1000;
                var5 = var2.coolDown / 1000 + "." + (var6 % 100 == 0 ? var6 / 100 : var6 / 10);
            }

            mFont.tahoma_7_white.a(var1, var3.append(var5).append(" ").append(mResources.lh).toString(), nt + 5, this.ob += 12, 0);
        }

        ++gk;
    }

    private void b(mGraphics var1, Skill var2) {
        SkillOption[] var3 = var2.k;

        for (int var4 = 0; var4 < var3.length; ++var4) {
            SkillOption var5 = var3[var4];
            if (mFont.tahoma_7_white.a(var5.getOptionString()) > 145) {
                MyVector var6 = mFont.tahoma_7_white.a(var5.getOptionString(), 145);

                for (int var7 = 0; var7 < var6.size(); ++var7) {
                    mFont.tahoma_7_white.a(var1, var6.elementAt(var7).toString(), nt + 5, this.ob += 12, 0);
                    ++gk;
                }
            } else {
                mFont.tahoma_7_white.a(var1, var5.getOptionString(), nt + 5, this.ob += 12, 0);
                ++gk;
            }
        }

    }

    private void n(mGraphics var1) {
        if (indexMenu == 1) {
            b(var1);
            Paint.a(eu, et, ev, ew, var1);
            a(var1, mResources.fr[indexMenu], true);
            mFont.tahoma_7b_white.a(var1, mResources.jl, eu + 10, et + 32, 0);
            mFont.tahoma_7b_white.a(var1, "" + Char.getMyChar().sPoint, eu + ev - 10, et + 32, 1);
            var1.a(0);
            var1.c(eu + 4, et + 44, ev - 7, gi + 3);
            var1.a(12281361);
            var1.b(eu + 5, et + 45, ev - 10, gi);
            if (indexTitle > 0) {
                var1.a(Paint.COLORBORDER);
                var1.b(eu + 5, et + 48 + gi, ev - 10, ew - 64 - gi);
            }

            int var2 = Char.getMyChar().nClass.c.length;
            nt = eu + 5;
            nu = et + 45;
            aq.a(var2, gi + 2, nt + 1, nu, ev - 12, gi + 2, false, 1);
            aq.a(var1);

            for (int var3 = 0; var3 < var2; ++var3) {
                int var4 = nt + var3 * (gi + 2) + gi / 2;
                SmallImage.drawSmallImageNew(var1, Char.getMyChar().nClass.c[var3].iconId, var4, nu + gi / 2, 0, 3);
                if (indexTitle == 1 && var3 == indexSelect) {
                    var1.a(16777215);
                    var1.b(nt + var3 * (gi + 2) + 2, nu + 2, gi - 4, gi - 4);
                    a(nt + var3 * (gi + 2), nu, var1);
                }
            }

            nt += 8;
            nu += 6;
            if (indexTitle == 1 && indexSelect >= 0) {
                b(var1);
                SkillTemplate var10 = Char.getMyChar().nClass.c[indexSelect];
                gk = 4 + var10.description.length;
                Skill var11 = Char.getMyChar().a(var10);
                int var5 = eu;
                int var6 = nu + gi + 2;
                int var7 = ev - 6;
                int var8 = ew - 70 - gi;
                scrInfo.a(var1, var5, var6, var7, var8);
                this.ob = nu + 18;
                int var9;
                if (var11 == null) {
                    var11 = var10.skills.length > 1 ? var10.skills[1] : var10.skills[0];
                    mFont.tahoma_7b_red.a(var1, var10.name, nt + 5, this.ob += 12, 0);

                    for (var9 = 0; var9 < var10.description.length; ++var9) {
                        mFont.tahoma_7_white.a(var1, var10.description[var9], nt + 5, this.ob += 12, 0);
                    }

                    mFont.tahoma_7_white.a(var1, mResources.iw[var10.type], nt + 5, this.ob += 12, 0);
                    mFont.tahoma_7_white.a(var1, mResources.ib + ": " + var10.maxPoint, nt + 5, this.ob += 12, 0);
                    mFont.tahoma_7_red.a(var1, mResources.b(mResources.hz, String.valueOf(var11.point)), nt + 5, this.ob += 12, 0);
                    this.a(var1, var11);
                    this.b(var1, var11);
                } else {
                    mFont.tahoma_7b_white.a(var1, var10.name, nt + 5, this.ob += 12, 0);

                    for (var9 = 0; var9 < var10.description.length; ++var9) {
                        mFont.tahoma_7_white.a(var1, var10.description[var9], nt + 5, this.ob += 12, 0);
                    }

                    mFont.tahoma_7_white.a(var1, mResources.iw[var10.type], nt + 5, this.ob += 12, 0);
                    mFont.tahoma_7_white.a(var1, mResources.ib + ": " + var10.maxPoint, nt + 5, this.ob += 12, 0);
                    if (var11.point == var10.maxPoint) {
                        mFont.tahoma_7_blue.a(var1, mResources.ic, nt + 5, this.ob += 12, 0);
                        this.a(var1, var11);
                        this.b(var1, var11);
                    } else {
                        mFont.tahoma_7_blue.a(var1, mResources.b(mResources.ia, String.valueOf(var11.point)), nt + 5, this.ob += 12, 0);
                        this.a(var1, var11);
                        this.b(var1, var11);

                        for (var9 = 0; var9 < var10.skills.length; ++var9) {
                            if (var10.skills[var9].equals(var11)) {
                                ++var9;
                                break;
                            }
                        }

                        mFont.tahoma_7_red.a(var1, mResources.b(mResources.hz, String.valueOf(var10.skills[var9].point)), nt + 5, this.ob += 12, 0);
                        this.a(var1, var10.skills[var9]);
                        ++gk;
                        this.b(var1, var10.skills[var9]);
                    }
                }

                scrInfo.a(gk, 12, var5, var6, var7, var8, true, 1);
                if (indexRow >= 0) {
                    SmallImage.drawSmallImageNew(var1, 942, nt + 2, nu + 32 + indexRow * 12, 0, StaticObj.TOP_RIGHT);
                }
            }
        }

    }

    private void a(mGraphics var1, String[] var2) {
        try {
            b(var1);
            a(var1, var2, true);
            this.a(var1, Char.getMyChar().arrItemBag);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    private void a(mGraphics var1, Item[] var2) {
        oa = var2.length / nz;
        aq.a(oa, gi, nt, nu, nz * gi, 5 * gi, true, 6);
        aq.a(var1, nt, nu, aq.e + 2, aq.f + 2);

        int var3;
        int var4;
        for (var3 = 0; var3 < oa; ++var3) {
            for (var4 = 0; var4 < nz; ++var4) {
                SmallImage.drawSmallImageNew(var1, 154, nt + var4 * gi + gi / 2, nu + var3 * gi + gi / 2, 0, 3);
                var1.a(12281361);
                var1.b(nt + var4 * gi, nu + var3 * gi, gi, gi);
            }
        }

        for (var3 = 0; var3 < var2.length; ++var3) {
            Item var5;
            if ((var5 = var2[var3]) != null) {
                int var6 = var5.indexUI / nz;
                int var7 = var5.indexUI - var6 * nz;
                this.a(var1, var5, nt + var7 * gi, nu + var6 * gi);
                if (var5.quantity > 1) {
                    mFont.number_yellow.a(var1, "" + var5.quantity, nt + var7 * gi + gi, nu + var6 * gi + gi - mFont.number_yellow.d(), 1);
                }
            }
        }

        if (indexTitle > 0 && indexSelect >= 0) {
            var3 = indexSelect / nz;
            var4 = indexSelect - var3 * nz;
            var1.a(16777215);
            var1.b(nt + var4 * gi, nu + var3 * gi, gi, gi);
            a(nt + var4 * gi, nu + var3 * gi, var1);
        }

    }

    private static void a(int var0, int var1, mGraphics var2) {
        var2.a(jo, var0 - 5, var1 - 5, 0);
    }

    private static int l(int var0) {
        int var1 = gi - 2;
        if ((var0 %= var1 << 2) >= 0 && var0 < var1) {
            return 0;
        } else if (var1 <= var0 && var0 < var1 << 1) {
            return var0 % var1;
        } else {
            return var1 << 1 <= var0 && var0 < var1 * 3 ? var1 : var1 - var0 % var1;
        }
    }

    private static int m(int var0) {
        int var1 = gi - 2;
        if ((var0 %= var1 << 2) >= 0 && var0 < var1) {
            return var0 % var1;
        } else if (var1 <= var0 && var0 < var1 << 1) {
            return var1;
        } else {
            return var1 << 1 <= var0 && var0 < var1 * 3 ? var1 - var0 % var1 : 0;
        }
    }

    private void a(mGraphics var1, String[] var2, Item[] var3) {
        try {
            b(var1);
            a(var1, var2, true);
            if (var3 == null) {
                GameCanvas.a(eu + 90, et + 75, var1);
                mFont.tahoma_7b_white.a(var1, mResources.ag, eu + 90, et + 90, 2);
                return;
            }

            if (var3.length <= 30) {
                oa = 5;
            } else if (var3.length % nz == 0) {
                oa = var3.length / nz;
            } else {
                oa = var3.length / nz + 1;
            }

            aq.a(oa, gi, nt, nu, nz * gi, 5 * gi, true, 6);
            aq.a(var1, nt, nu, aq.e + 2, aq.f + 2);

            int var4;
            int var5;
            for (var4 = 0; var4 < oa; ++var4) {
                for (var5 = 0; var5 < nz; ++var5) {
                    SmallImage.drawSmallImageNew(var1, 154, nt + var5 * gi + gi / 2, nu + var4 * gi + gi / 2, 0, 3);
                    var1.a(12281361);
                    var1.b(nt + var5 * gi, nu + var4 * gi, gi, gi);
                }
            }

            for (var4 = 0; var4 < var3.length; ++var4) {
                Item var6;
                if ((var6 = var3[var4]) != null) {
                    int var7 = var6.indexUI / nz;
                    int var8 = var6.indexUI - var7 * nz;
                    if (!var6.isLock) {
                        var1.a(12083);
                        var1.c(nt + var8 * gi + 1, nu + var7 * gi + 1, gi - 1, gi - 1);
                        SmallImage.drawSmallImageNew(var1, 154, nt + var8 * gi + gi / 2, nu + var7 * gi + gi / 2, 0, 3);
                    }

                    SmallImage.drawSmallImageNew(var1, var6.template.iconID, nt + var8 * gi + gi / 2, nu + var7 * gi + gi / 2, 0, 3);
                }
            }

            if (indexTitle > 0 && indexSelect >= 0) {
                var4 = indexSelect / nz;
                var5 = indexSelect - var4 * nz;
                var1.a(16777215);
                var1.b(nt + var5 * gi, nu + var4 * gi, gi, gi);
                a(nt + var5 * gi, nu + var4 * gi, var1);
                return;
            }
        } catch (Exception var9) {
        }

    }

    private static void a(mGraphics var0, String[] var1, boolean var2) {
        Paint.a(eu, et, ev, ew, var0);
        if (var2) {
            mFont.tahoma_7_white.a(var0, mResources.ki + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().xu)), eu + 6, et + ew - 26, 0);
            mFont.tahoma_7_white.a(var0, mResources.kj + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().yen)), eu + ev - 6, et + ew - 26, 1);
            if (isPaintLuyenNgoc) {
                if (GameCanvas.u % 10 > 4) {
                    mFont.tahoma_7_yellow.a(var0, mResources.fj, eu + ev / 2, et + ew - 14, 2);
                }
            } else if (isPaintUpPearl) {
                if (GameCanvas.u % 10 > 4) {
                    mFont.tahoma_7_yellow.a(var0, mResources.fh, eu + ev / 2, et + ew - 14, 2);
                }
            } else if (isPaintSplit) {
                if (GameCanvas.u % 10 > 4) {
                    mFont.tahoma_7_yellow.a(var0, mResources.fi, eu + ev / 2, et + ew - 14, 2);
                }
            } else {
                mFont.tahoma_7_yellow.a(var0, mResources.kk + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().luong)), eu + ev / 2, et + ew - 14, 2);
            }
        }

        a(var0, var1[indexMenu], var1.length > 1);
        nt = eu + 3;
        nu = et + 32;
        var0.a(6425);
        var0.c(nt - 1, nu - 1, nz * gi + 3, 5 * gi + 3);
    }

    private void b(mGraphics var1, String[] var2) {
        try {
            oa = 3;
            Paint.a(eu, et, ev, ew, var1);
            a(var1, var2[indexMenu], var2.length > 1);
            nt = eu + 3;
            nu = et + 34 + gi;
            int var3 = eu + 45;
            int var4 = eu + 100;
            int var5 = nu - gi - 3;
            if (itemUpGrade != null) {
                this.a(var1, itemUpGrade, var3, var5);
                var1.a(12281361);
                var1.b(var3, var5, gi, gi);
                mFont.tahoma_7_yellow.a(var1, "(+" + itemUpGrade.upgrade + ")", var3 - 5, var5 + gi / 2 - 5, 1);
            } else {
                var1.a(6425);
                var1.c(var3 - 1, var5 - 1, gi + 3, gi + 3);
                SmallImage.drawSmallImageNew(var1, 154, var3 + gi / 2, var5 + gi / 2, 0, 3);
                var1.a(12281361);
                var1.b(var3, var5, gi, gi);
            }

            SmallImage.drawSmallImageNew(var1, 942, var3 + 43, nu - 15, 0, StaticObj.VCENTER_HCENTER);
            if (itemUpGrade != null && !itemUpGrade.isUpMax()) {
                this.a(var1, itemUpGrade, var4, var5, 1, 0);
                var1.a(12281361);
                var1.b(var4, var5, gi, gi);
                mFont.tahoma_7_yellow.a(var1, "(+" + (itemUpGrade.upgrade + 1) + ")", var4 + gi + 10, var5 + gi / 2 - 5, 0);
            } else {
                var1.a(6425);
                var1.c(var4 - 1, var5 - 1, gi + 3, gi + 3);
                SmallImage.drawSmallImageNew(var1, 154, var4 + gi / 2, var5 + gi / 2, 0, 3);
                var1.a(12281361);
                var1.b(var4, var5, gi, gi);
            }

            if (indexTitle == 1) {
                if (indexSelect == 0) {
                    var1.a(16777215);
                    var1.b(var3, var5, gi, gi);
                }

                if (indexSelect == 1) {
                    var1.a(16777215);
                    var1.b(var4, var5, gi, gi);
                }
            }

            int var6;
            int var7;
            if (itemUpGrade == null) {
                for (var4 = 0; var4 < 3; ++var4) {
                    mFont.tahoma_7_white.a(var1, mResources.gz[var4], nt, nu + oa * gi + 5 + var4 * 12, 0);
                }
            } else if (itemUpGrade.isUpMax()) {
                if (!GameCanvas.isTouchControlLargeScreen) {
                    mFont.tahoma_7_yellow.a(var1, mResources.gz[3], eu + ev / 2, nu + oa * gi + 5, 2);
                } else {
                    mFont.tahoma_7_yellow.a(var1, mResources.gz[3], eu + 7, nu + oa * gi + 5, 0);
                }
            } else {
                var4 = 0;

                for (var6 = 0; var6 < arrItemUpGrade.length; ++var6) {
                    if (arrItemUpGrade[var6] != null && arrItemUpGrade[var6].template.type == 26) {
                        var4 += cn[arrItemUpGrade[var6].template.id];
                    }
                }

                var7 = 0;
                if (itemUpGrade.isTypeClothe()) {
                    if ((var6 = var4 * 100 / co[itemUpGrade.upgrade]) > cv[itemUpGrade.upgrade]) {
                        var6 = cv[itemUpGrade.upgrade];
                    }

                    if (hw) {
                        var6 = (int) ((double) var6 * 5.30239915E-315);
                        var7 = cw[itemUpGrade.upgrade];
                    }

                    if (cs[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                        mFont.tahoma_7_red.a(var1, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(cs[itemUpGrade.upgrade]))), nt, nu + oa * gi + 5, 0);
                    } else {
                        mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(cs[itemUpGrade.upgrade]))), nt, nu + oa * gi + 5, 0);
                    }

                    if (var7 > Char.getMyChar().luong) {
                        mFont.tahoma_7_red.a(var1, mResources.b(mResources.he, String.valueOf(var7)), nt, nu + oa * gi + 17, 0);
                    } else {
                        mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.he, String.valueOf(var7)), nt, nu + oa * gi + 17, 0);
                    }

                    mFont.tahoma_7_yellow.a(var1, mResources.hg + ": " + var6 + "%", nt, nu + oa * gi + 29, 0);
                } else if (itemUpGrade.isTypeAdorn()) {
                    if ((var6 = var4 * 100 / cp[itemUpGrade.upgrade]) > cv[itemUpGrade.upgrade]) {
                        var6 = cv[itemUpGrade.upgrade];
                    }

                    if (hw) {
                        var6 = (int) ((double) var6 * 5.30239915E-315);
                        var7 = cw[itemUpGrade.upgrade];
                    }

                    if (ct[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                        mFont.tahoma_7_red.a(var1, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(ct[itemUpGrade.upgrade]))), nt, nu + oa * gi + 5, 0);
                    } else {
                        mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(ct[itemUpGrade.upgrade]))), nt, nu + oa * gi + 5, 0);
                    }

                    if (var7 > Char.getMyChar().luong) {
                        mFont.tahoma_7_red.a(var1, mResources.b(mResources.he, String.valueOf(var7)), nt, nu + oa * gi + 17, 0);
                    } else {
                        mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.he, String.valueOf(var7)), nt, nu + oa * gi + 17, 0);
                    }

                    mFont.tahoma_7_yellow.a(var1, mResources.hg + ": " + var6 + "%", nt, nu + oa * gi + 29, 0);
                } else if (itemUpGrade.isTypeWeapon()) {
                    if ((var6 = var4 * 100 / cq[itemUpGrade.upgrade]) > cv[itemUpGrade.upgrade]) {
                        var6 = cv[itemUpGrade.upgrade];
                    }

                    if (hw) {
                        var6 = (int) ((double) var6 * 5.30239915E-315);
                        var7 = cw[itemUpGrade.upgrade];
                    }

                    if (cu[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                        mFont.tahoma_7_red.a(var1, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(cu[itemUpGrade.upgrade]))), nt, nu + oa * gi + 5, 0);
                    } else {
                        mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(cu[itemUpGrade.upgrade]))), nt, nu + oa * gi + 5, 0);
                    }

                    if (var7 > Char.getMyChar().luong) {
                        mFont.tahoma_7_red.a(var1, mResources.b(mResources.he, String.valueOf(var7)), nt, nu + oa * gi + 17, 0);
                    } else {
                        mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.he, String.valueOf(var7)), nt, nu + oa * gi + 17, 0);
                    }

                    mFont.tahoma_7_yellow.a(var1, mResources.hg + ": " + var6 + "%", nt, nu + oa * gi + 29, 0);
                }
            }

            var1.a(0);
            var1.c(nt - 1, nu - 1, nz * gi + 3, oa * gi + 3);

            for (var4 = 0; var4 < oa; ++var4) {
                for (var6 = 0; var6 < nz; ++var6) {
                    SmallImage.drawSmallImageNew(var1, 154, nt + var6 * gi + gi / 2, nu + var4 * gi + gi / 2, 0, 3);
                    var1.a(12281361);
                    var1.b(nt + var6 * gi, nu + var4 * gi, gi, gi);
                }
            }

            if (indexTitle == 2) {
                var4 = indexSelect / nz;
                var6 = indexSelect - var4 * nz;
                var1.a(16777215);
                var1.b(nt + var6 * gi, nu + var4 * gi, gi, gi);
            }

            for (var4 = 0; var4 < arrItemUpGrade.length; ++var4) {
                Item var8;
                if ((var8 = arrItemUpGrade[var4]) != null) {
                    var7 = var4 / nz;
                    int var9 = var4 - var7 * nz;
                    if (!var8.isLock) {
                        var1.a(12083);
                        var1.c(nt + var9 * gi + 1, nu + var7 * gi + 1, gi - 1, gi - 1);
                    }

                    SmallImage.drawSmallImageNew(var1, var8.template.iconID, nt + var9 * gi + gi / 2, nu + var7 * gi + gi / 2, 0, 3);
                }
            }

            if (ey != null) {
                SmallImage.drawSmallImageNew(var1, ey.arrEfInfo[ex].idImg, var3 + gi / 2 + ey.arrEfInfo[ex].dx + 1, var5 + gi / 2 + 9 + ey.arrEfInfo[ex].dy, 0, 3);
                if (GameCanvas.u % 2 == 0 && ++ex >= ey.arrEfInfo.length) {
                    ex = 0;
                    ey = null;
                    return;
                }
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }

    }

    private void a(mGraphics var1, Item var2, int var3, int var4) {
        this.a(var1, var2, var3, var4, 0, 0);
    }

    private void a(mGraphics var1, Item var2, int var3, int var4, int var5, int var6) {
        if (!var2.isTypeMounts()) {
            if ((var5 += var2.upgrade) > 0) {
                if (var5 >= 4) {
                    var1.a(this.oc[var5]);
                    var1.c(var3 + 1 + var6, var4 + 1 + var6, gi - 1 - (var6 << 1), gi - 1 - (var6 << 1));
                    SmallImage.drawSmallImageNew(var1, 154, var3 + gi / 2, var4 + gi / 2, 0, 3);
                } else {
                    a(var1, var2, var3, var4, var6);
                }

                if (var5 > 0) {
                    var6 = var3 + gi / 2;
                    int var7 = var4 + gi / 2;
                    mGraphics var8 = var1;
                    var7 = var7;
                    var6 = var6;
                    GameScr var9 = this;
                    int var10 = gi - 2;
                    int var11 = var5 < 4 ? 0 : (var5 < 8 ? 1 : (var5 < 12 ? 2 : (var5 <= 14 ? 3 : 4)));

                    int var12;
                    int var13;
                    int var14;
                    for (var12 = 0; var12 < var9.oe.length; ++var12) {
                        var13 = var6 - var10 / 2 + m(GameCanvas.u - (var12 << 2));
                        var14 = var7 - var10 / 2 + l(GameCanvas.u - (var12 << 2));
                        var8.a(var9.od[var11][var12]);
                        var8.c(var13 - var9.oe[var12] / 2, var14 - var9.oe[var12] / 2, var9.oe[var12], var9.oe[var12]);
                    }

                    if (var5 == 4 || var5 == 8) {
                        for (var12 = 0; var12 < var9.oe.length; ++var12) {
                            var13 = var6 - var10 / 2 + m(GameCanvas.u - (var10 << 1) - (var12 << 2));
                            var14 = var7 - var10 / 2 + l(GameCanvas.u - (var10 << 1) - (var12 << 2));
                            var8.a(var9.od[var11 - 1][var12]);
                            var8.c(var13 - var9.oe[var12] / 2, var14 - var9.oe[var12] / 2, var9.oe[var12], var9.oe[var12]);
                        }
                    }

                    if (var5 != 1 && var5 != 4 && var5 != 8) {
                        for (var12 = 0; var12 < var9.oe.length; ++var12) {
                            var13 = var6 - var10 / 2 + m(GameCanvas.u - (var10 << 1) - (var12 << 2));
                            var14 = var7 - var10 / 2 + l(GameCanvas.u - (var10 << 1) - (var12 << 2));
                            var8.a(var9.od[var11][var12]);
                            var8.c(var13 - var9.oe[var12] / 2, var14 - var9.oe[var12] / 2, var9.oe[var12], var9.oe[var12]);
                        }
                    }

                    if (var5 != 1 && var5 != 4 && var5 != 8 && var5 != 12 && var5 != 2 && var5 != 5 && var5 != 9) {
                        for (var12 = 0; var12 < var9.oe.length; ++var12) {
                            var13 = var6 - var10 / 2 + m(GameCanvas.u - var10 - (var12 << 2));
                            var14 = var7 - var10 / 2 + l(GameCanvas.u - var10 - (var12 << 2));
                            var8.a(var9.od[var11][var12]);
                            var8.c(var13 - var9.oe[var12] / 2, var14 - var9.oe[var12] / 2, var9.oe[var12], var9.oe[var12]);
                        }
                    }

                    if (var5 != 1 && var5 != 4 && var5 != 8 && var5 != 12 && var5 != 2 && var5 != 5 && var5 != 9 && var5 != 13 && var5 != 3 && var5 != 6 && var5 != 10 && var5 != 15) {
                        for (var12 = 0; var12 < var9.oe.length; ++var12) {
                            var13 = var6 - var10 / 2 + m(GameCanvas.u - var10 * 3 - (var12 << 2));
                            var14 = var7 - var10 / 2 + l(GameCanvas.u - var10 * 3 - (var12 << 2));
                            var8.a(var9.od[var11][var12]);
                            var8.c(var13 - var9.oe[var12] / 2, var14 - var9.oe[var12] / 2, var9.oe[var12], var9.oe[var12]);
                        }
                    }
                }
            } else {
                a(var1, var2, var3, var4, var6);
            }
        }

        SmallImage.drawSmallImageNew(var1, var2.template.iconID, var3 + gi / 2, var4 + gi / 2, 0, 3);
    }

    private static void a(mGraphics var0, Item var1, int var2, int var3, int var4) {
        if (!var1.isLock) {
            var0.a(12083);
        } else {
            var0.a(6425);
        }

        var0.c(var2 + 1 + var4, var3 + 1 + var4, gi - 2 - (var4 << 1), gi - 2 - (var4 << 1));
        SmallImage.drawSmallImageNew(var0, 154, var2 + gi / 2, var3 + gi / 2, 0, 3);
    }

    private void c(mGraphics var1, String[] var2) {
        try {
            Paint.a(eu, et, ev, ew, var1);
            a(var1, var2[indexMenu], var2.length > 1);
            nt = eu + 3;
            nu = et + 34 + gi;
            int var3 = eu + 74;
            int var4 = nu - gi - 3;
            oa = 4;
            if (itemSplit != null) {
                this.a(var1, itemSplit, var3, var4);
            } else {
                var1.a(6425);
                var1.c(var3 - 1, var4 - 1, gi + 3, gi + 3);
                SmallImage.drawSmallImageNew(var1, 154, var3 + gi / 2, var4 + gi / 2, 0, 3);
            }

            var1.a(12281361);
            var1.b(var3, var4, gi, gi);
            var1.a(6425);
            var1.c(nt - 1, nu - 1, gi * nz + 3, gi * oa + 3);

            int var5;
            int var6;
            for (var5 = 0; var5 < oa; ++var5) {
                for (var6 = 0; var6 < nz; ++var6) {
                    SmallImage.drawSmallImageNew(var1, 154, nt + var6 * gi + gi / 2, nu + var5 * gi + gi / 2, 0, 3);
                    var1.a(12281361);
                    var1.b(nt + var6 * gi, nu + var5 * gi, gi, gi);
                }
            }

            for (var5 = 0; var5 < arrItemSplit.length; ++var5) {
                Item var7;
                if ((var7 = arrItemSplit[var5]) != null) {
                    var6 = var5 / nz;
                    int var8 = var5 - var6 * nz;
                    if (!var7.isLock) {
                        var1.a(12083);
                        var1.c(nt + var8 * gi + 1, nu + var6 * gi + 1, gi - 1, gi - 1);
                    }

                    SmallImage.drawSmallImageNew(var1, var7.template.iconID, nt + var8 * gi + gi / 2, nu + var6 * gi + gi / 2, 0, 3);
                }
            }

            if (indexTitle == 1) {
                var1.a(16777215);
                var1.b(var3, var4, gi, gi);
            } else if (indexTitle == 2) {
                var5 = indexSelect / nz;
                var6 = indexSelect - var5 * nz;
                var1.a(16777215);
                var1.b(nt + var6 * gi, nu + var5 * gi, gi, gi);
            }

            if (ey != null) {
                SmallImage.drawSmallImageNew(var1, ey.arrEfInfo[ex].idImg, var3 + gi / 2 + ey.arrEfInfo[ex].dx, var4 + gi / 2 + ey.arrEfInfo[ex].dy, 0, 3);
                if (GameCanvas.u % 2 == 0 && ++ex >= ey.arrEfInfo.length) {
                    ex = 0;
                    ey = null;
                }
            }

            if (isPaintTinhluyen && itemSplit != null) {
                ItemOption var12 = null;

                for (var6 = 0; var6 < itemSplit.options.size() && (var12 = (ItemOption) itemSplit.options.elementAt(var6)).optionTemplate.id != 85; ++var6) {
                    var12 = null;
                }

                if (var12 != null) {
                    int[] var13 = new int[]{60, 45, 34, 26, 20, 15, 11, 8, 6};
                    int[] var9 = new int[]{150000, 247500, 408375, 673819, 1111801, 2056832, 4010822, 7420021, 12243035};
                    byte[] var10 = new byte[]{3, 5, 9, 4, 7, 10, 5, 7, 9};
                    mFont.tahoma_7_yellow.a(var1, mResources.sf + ": " + NinjaUtil.numberToString(String.valueOf(var12.param + 1)), nt + 1, nu + 114, 0);
                    mFont.tahoma_7_yellow.a(var1, mResources.hh + var13[var12.param] + "%)", nt + 70, nu + 114, 0);
                    mFont.tahoma_7_yellow.a(var1, mResources.ak + ": " + NinjaUtil.numberToString(String.valueOf(var9[var12.param])) + " " + mResources.kj + ", " + var10[var12.param] + " " + (var12.param < 3 ? mResources.sj[1] : (var12.param < 6 ? mResources.sj[2] : mResources.sj[3])), nt + 1, nu + 126, 0);
                    return;
                }

                mFont.tahoma_7_red.a(var1, mResources.sb, nt + 1, nu + 120, 0);
                return;
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }

    }

    private static void d(mGraphics var0, String[] var1) {
        try {
            b(var0);
            Paint.a(eu, et, ev, ew, var0);
            a(var0, var1[indexMenu], var1.length > 1);
            nt = eu + 3;
            nu = et + 32;
            var0.a(6425);
            oa = 4;
            int var2;
            int var3;
            int var4;
            int var5;
            if (!isPaintUpPearl) {
                mFont.tahoma_7_white.a(var0, mResources.rs[0], nt + 3, nu + oa * gi + 9, 0);
                mFont.tahoma_7_white.a(var0, mResources.rs[1], nt + 3, nu + oa * gi + 21, 0);
                mFont.tahoma_7_white.a(var0, mResources.rs[2], nt + 3, nu + oa * gi + 33, 0);
            } else {
                var3 = 0;
                var5 = 0;
                var2 = 0;
                boolean var6 = false;

                for (var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
                    if (arrItemUpPeal[var4] != null) {
                        if (arrItemUpPeal[var4].isLock) {
                            var6 = true;
                        }

                        var3 += cn[arrItemUpPeal[var4].template.id];
                        ++var5;
                    }
                }

                if (var3 > 0) {
                    for (var2 = cn.length - 1; var2 >= 0 && var3 <= cn[var2]; --var2) {
                    }
                }

                if (var2 >= cn.length - 1) {
                    var2 = cn.length - 2;
                }

                if (gn) {
                    if (var5 > 1) {
                        mFont.tahoma_7_yellow.a(var0, mResources.hc + " " + (var2 + 2) + " " + (var6 ? mResources.av : ""), nt + 3, nu + oa * gi + 9, 0);
                        if (cr[var2 + 1] > Char.getMyChar().xu) {
                            mFont.tahoma_7_red.a(var0, mResources.b(mResources.hf, NinjaUtil.numberToString(String.valueOf(cr[var2 + 1]))), nt + 3, nu + oa * gi + 21, 0);
                        } else {
                            mFont.tahoma_7_yellow.a(var0, mResources.b(mResources.hf, NinjaUtil.numberToString(String.valueOf(cr[var2 + 1]))), nt + 3, nu + oa * gi + 21, 0);
                        }

                        mFont.tahoma_7_yellow.a(var0, mResources.hg + ": " + var3 * 100 / cn[var2 + 1] + "%", nt + 3, nu + oa * gi + 33, 0);
                    } else {
                        for (var4 = 1; var4 <= 2; ++var4) {
                            mFont.tahoma_7_white.a(var0, mResources.gy[var4], nt + 3, nu + oa * gi + 5 + (var4 - 1) * 12, 0);
                        }
                    }
                } else if (var5 > 1) {
                    mFont.tahoma_7_yellow.a(var0, mResources.hc + " " + (var2 + 2) + " " + mResources.av, nt + 3, nu + oa * gi + 9, 0);
                    if (cr[var2 + 1] > Char.getMyChar().xu + Char.getMyChar().yen) {
                        mFont.tahoma_7_red.a(var0, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(cr[var2 + 1]))), nt + 3, nu + oa * gi + 21, 0);
                    } else {
                        mFont.tahoma_7_yellow.a(var0, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(cr[var2 + 1]))), nt + 3, nu + oa * gi + 21, 0);
                    }

                    mFont.tahoma_7_yellow.a(var0, mResources.hg + ": " + var3 * 100 / cn[var2 + 1] + "%", nt + 3, nu + oa * gi + 33, 0);
                } else {
                    for (var4 = 0; var4 < 3; ++var4) {
                        mFont.tahoma_7_white.a(var0, mResources.gy[var4], nt + 3, nu + oa * gi + 5 + var4 * 12, 0);
                    }
                }
            }

            var0.a(0);
            var0.c(nt, nu, nz * gi + 1, oa * gi + 1);

            for (var3 = 0; var3 < oa; ++var3) {
                for (var5 = 0; var5 < nz; ++var5) {
                    SmallImage.drawSmallImageNew(var0, 154, nt + var5 * gi + gi / 2, nu + var3 * gi + gi / 2, 0, 3);
                    var0.a(12281361);
                    var0.b(nt + var5 * gi, nu + var3 * gi, gi, gi);
                }
            }

            for (var3 = 0; var3 < arrItemUpPeal.length; ++var3) {
                Item var8;
                if ((var8 = arrItemUpPeal[var3]) != null) {
                    var2 = var3 / nz;
                    var4 = var3 - var2 * nz;
                    if (!var8.isLock) {
                        var0.a(4543829);
                        var0.c(nt + var4 * gi + 1, nu + var2 * gi + 1, gi - 1, gi - 1);
                    }

                    SmallImage.drawSmallImageNew(var0, var8.template.iconID, nt + var4 * gi + gi / 2, nu + var2 * gi + gi / 2, 0, 3);
                }
            }

            if (indexTitle > 0) {
                var3 = indexSelect / nz;
                var5 = indexSelect - var3 * nz;
                var0.a(16777215);
                var0.b(nt + var5 * gi, nu + var3 * gi, gi, gi);
            }

            if (ey != null) {
                SmallImage.drawSmallImageNew(var0, ey.arrEfInfo[ex].idImg, nt + gi / 2 + ey.arrEfInfo[ex].dx + 1, nu + gi / 2 + 9 + ey.arrEfInfo[ex].dy, 0, 3);
                if (GameCanvas.u % 2 == 0 && ++ex >= ey.arrEfInfo.length) {
                    ex = 0;
                    ey = null;
                    return;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }

    private void o(mGraphics var1) {
        if (isPaintLuckySpin) {
            b(var1);
            Paint.a(eu, et, ev, ew, var1);
            int var2 = ev;
            if (GameCanvas.isTouchControlLargeScreen) {
                var2 = ev / 2 + 20;
            }

            var1.a(0);
            var1.c(eu + 7, et + 31, var2 - 14, ew - 58);
            var1.a(-3170504);
            var1.b(eu + 8, et + 32, var2 - 16, ew - 60);
            var1.a(Paint.COLORBACKGROUND);
            var1.c(eu + 9, et + 33, var2 - 18, ew - 62);
            a(var1, mResources.qz, false);
            nt = eu + 33;
            nu = et + 40;

            int var3;
            for (var2 = 0; var2 < 3; ++var2) {
                for (var3 = 0; var3 < 3; ++var3) {
                    var1.a(Paint.COLORDARK);
                    var1.c(nt + var3 * 40, nu + 10 + var2 * 40, 29, 29);
                    var1.a(-6527695);
                    var1.b(nt + var3 * 40, nu + 10 + var2 * 40, 29, 29);
                    var1.a(-6737152);
                    var1.c(nt + var3 * 40 + 2, nu + 12 + var2 * 40, 26, 26);
                    var1.a(Paint.COLORDARK);
                    var1.c(nt + var3 * 40 + 4, nu + 14 + var2 * 40, 22, 22);
                    SmallImage.drawSmallImageNew(var1, 1414, nt + var3 * 40 + 20 - 5, nu + var2 * 40 + 20 + 4, 0, StaticObj.VCENTER_HCENTER);
                }
            }

            for (var2 = 0; var2 < 9; ++var2) {
                int var4;
                int var5;
                mGraphics var6;
                label77:
                {
                    var3 = var2 / 3;
                    var5 = var2 - var3 * 3;
                    if (bw != null) {
                        var1.a(-16770791);
                        var1.c(nt + var5 * 40 + 4, nu + 14 + var3 * 40, 22, 22);
                        var1.a(var2 == indexSelect ? -1 : -6527695);
                        var1.b(nt + var5 * 40 + 4, nu + 14 + var3 * 40, 21, 21);
                        SmallImage.drawSmallImageNew(var1, 154, nt + var5 * 40 + 17 - 3, nu + 7 + var3 * 40 + 17, 0, 3);
                        if (System.currentTimeMillis() - this.ea < 1000L) {
                            if (var2 == an) {
                                SmallImage.drawSmallImageNew(var1, ItemTemplates.getIcon(bw[an]), nt + var5 * 40 + 17 - 3, nu + 7 + var3 * 40 + 17, 0, 3);
                            } else {
                                SmallImage.drawSmallImageNew(var1, 1414, nt + var5 * 40 + 17 - 2, nu + 7 + var3 * 40 + 17, 0, StaticObj.VCENTER_HCENTER);
                            }
                        } else if (bw[var2] >= 0 && bw[var2] < ItemTemplates.itemTemplates.size()) {
                            SmallImage.drawSmallImageNew(var1, ItemTemplates.getIcon(bw[var2]), nt + var5 * 40 + 17 - 3, nu + 7 + var3 * 40 + 17, 0, 3);
                        } else {
                            SmallImage.drawSmallImageNew(var1, ItemTemplates.getIcon((short) 242), nt + var5 * 40 + 17 - 3, nu + 7 + var3 * 40 + 17, 0, 3);
                        }

                        if (an == var2 && this.ec > 0) {
                            this.ee[var2] = String.valueOf(this.ec);
                        }

                        if (indexTitle != 1) {
                            continue;
                        }

                        if (an == var2 && GameCanvas.u % 10 > 4) {
                            var6 = var1;
                            var4 = -3368653;
                            break label77;
                        }

                        if (var2 == indexSelect) {
                            var6 = var1;
                            var4 = -1;
                            break label77;
                        }

                        var6 = var1;
                    } else {
                        if (indexTitle != 1) {
                            continue;
                        }

                        var6 = var1;
                        if (var2 == indexSelect) {
                            var4 = -1;
                            break label77;
                        }
                    }

                    var4 = Paint.COLORLIGHT;
                }

                var6.a(var4);
                var1.b(nt + var5 * 40, nu + 10 + var3 * 40, 29, 29);
            }

            mFont.tahoma_7_yellow.a(var1, mResources.ra + this.bx, eu + ev / 2, et + ew - 20, 2);
        }

    }

    private void p(mGraphics var1) {
        if (isPaintStack) {
            if (indexMenu == 0) {
                this.a(var1, mResources.gd, arrItemStack);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gd);
            }
        }

    }

    private void q(mGraphics var1) {
        if (isPaintStackLock) {
            if (indexMenu == 0) {
                this.a(var1, mResources.ge, arrItemStackLock);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.ge);
            }
        }

    }

    private void r(mGraphics var1) {
        if (isPaintGrocery) {
            if (indexMenu == 0) {
                this.a(var1, mResources.gf, arrItemGrocery);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gf);
            }
        }

    }

    private void s(mGraphics var1) {
        if (isPaintGroceryLock) {
            if (indexMenu == 0) {
                this.a(var1, mResources.gg, arrItemGroceryLock);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gg);
            }
        }

    }

    private void t(mGraphics var1) {
        if (isPaintAuctionSale) {
            if (indexMenu == 0) {
                String[] var2 = mResources.gi;
                var1 = var1;
                GameScr var3 = this;

                try {
                    oa = 5;
                    Paint.a(eu, et, ev, ew, var1);
                    a(var1, var2, false);
                    var1.a(6693376);
                    var1.c(eu + 3, et + 32, 168, 140);
                    var1.a(13408563);
                    var1.b(eu + 3, et + 32, 168, 140);
                    int var4 = eu + 74;
                    int var5 = et + 40 + gi;
                    mFont.tahoma_7_white.a(var1, mResources.nd, var4 + gi / 2, var5 - gi / 2 - 4, 2);
                    if (itemSell != null) {
                        var1.a(6425);
                        var1.c(var4 - 1, var5 - 1, gi + 3, gi + 3);
                        SmallImage.drawSmallImageNew(var1, 154, var4 + gi / 2, var5 + gi / 2, 0, 3);
                        var3.a(var1, itemSell, var4, var5);
                        if (itemSell.quantity > 1) {
                            mFont.number_yellow.a(var1, String.valueOf(itemSell.quantity), var4 + gi, var5 + gi / 2 + 6, 1);
                        }

                        var1.a(indexTitle == 1 ? 16777215 : 12281361);
                        var1.b(var4, var5, gi, gi);
                    } else {
                        var1.a(6425);
                        var1.c(var4 - 1, var5 - 1, gi + 3, gi + 3);
                        SmallImage.drawSmallImageNew(var1, 154, var4 + gi / 2, var5 + gi / 2, 0, 3);
                        var1.a(12281361);
                        var1.b(var4, var5, gi, gi);
                    }

                    mFont.tahoma_7_white.a(var1, mResources.ne, var4 + gi / 2, var5 + 3 * gi / 2 + 2, 2);
                    if (Char.getMyChar().xu < 5000) {
                        mFont.tahoma_7_red.a(var1, mResources.qo, var4 + gi / 2, et + ew - 25, 2);
                        mFont.tahoma_7_red.a(var1, mResources.qp, var4 + gi / 2, et + ew - 13, 2);
                    } else {
                        mFont.tahoma_7_white.a(var1, mResources.qo, var4 + gi / 2, et + ew - 25, 2);
                        mFont.tahoma_7_white.a(var1, mResources.qp, var4 + gi / 2, et + ew - 13, 2);
                    }

                    var3.iz.a = eu + 40;
                    var3.iz.b = et + 130;
                    var3.iz.a(var1);
                    return;
                } catch (Exception var6) {
                    var6.printStackTrace();
                    return;
                }
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gi);
            }
        }

    }

    private void u(mGraphics var1) {
        if (isPaintConvert) {
            if (indexMenu == 0) {
                String[] var2 = mResources.gj;
                var1 = var1;
                GameScr var3 = this;

                try {
                    oa = 3;
                    Paint.a(eu, et, ev, ew, var1);
                    a(var1, var2[indexMenu], var2.length > 1);
                    nt = eu + 3;
                    nu = et + 34 + gi;
                    int var4 = eu + 45;
                    int var5 = eu + 100;
                    int var6 = nu - gi - 3;
                    if (arrItemConvert[0] != null) {
                        var3.a(var1, arrItemConvert[0], var4, var6);
                        var1.a(12281361);
                        var1.b(var4, var6, gi, gi);
                        mFont.tahoma_7_yellow.a(var1, "(+" + arrItemConvert[0].upgrade + ")", var4 - 5, var6 + gi / 2 - 5, 1);
                    } else {
                        var1.a(6425);
                        var1.c(var4 - 1, var6 - 1, gi + 3, gi + 3);
                        SmallImage.drawSmallImageNew(var1, 154, var4 + gi / 2, var6 + gi / 2, 0, 3);
                        var1.a(12281361);
                        var1.b(var4, var6, gi, gi);
                    }

                    SmallImage.drawSmallImageNew(var1, 942, var4 + 43, nu - 15, 0, StaticObj.VCENTER_HCENTER);
                    Item var7;
                    if (arrItemConvert[1] != null) {
                        var7 = arrItemConvert[1].clone();
                        if (arrItemConvert[0] != null && arrItemConvert[0].template.type == var7.template.type && arrItemConvert[1].template.level >= arrItemConvert[0].template.level) {
                            var7.upgrade = arrItemConvert[0].upgrade;
                        }

                        var3.a(var1, var7, var5, var6);
                        var1.a(12281361);
                        var1.b(var5, var6, gi, gi);
                        mFont.tahoma_7_yellow.a(var1, "(+" + var7.upgrade + ")", var5 + gi + 10, var6 + gi / 2 - 5, 0);
                    } else {
                        var1.a(6425);
                        var1.c(var5 - 1, var6 - 1, gi + 3, gi + 3);
                        SmallImage.drawSmallImageNew(var1, 154, var5 + gi / 2, var6 + gi / 2, 0, 3);
                        var1.a(12281361);
                        var1.b(var5, var6, gi, gi);
                    }

                    if (indexTitle == 1) {
                        if (indexSelect == 0) {
                            var1.a(16777215);
                            var1.b(var4, var6, gi, gi);
                        }

                        if (indexSelect == 1) {
                            var1.a(16777215);
                            var1.b(var5, var6, gi, gi);
                        }
                    }

                    var1.a(0);
                    var1.c(nt - 1, nu - 1, nz * gi + 3, oa * gi + 3);

                    int var8;
                    for (var4 = 0; var4 < oa; ++var4) {
                        for (var8 = 0; var8 < nz; ++var8) {
                            SmallImage.drawSmallImageNew(var1, 154, nt + var8 * gi + gi / 2, nu + var4 * gi + gi / 2, 0, 3);
                            var1.a(12281361);
                            var1.b(nt + var8 * gi, nu + var4 * gi, gi, gi);
                        }
                    }

                    if ((var7 = arrItemConvert[2]) != null) {
                        var8 = 0 / nz;
                        var4 = 0 - var8 * nz;
                        if (!var7.isLock) {
                            var1.a(12083);
                            var1.c(nt + var4 * gi + 1, nu + var8 * gi + 1, gi - 1, gi - 1);
                        }

                        SmallImage.drawSmallImageNew(var1, var7.template.iconID, nt + var4 * gi + gi / 2, nu + var8 * gi + gi / 2, 0, 3);
                    }

                    mFont.tahoma_7_white.a(var1, "- " + mResources.fb[0], nt, nu + oa * gi + 10, 0);
                    mFont.tahoma_7_white.a(var1, "  " + mResources.fb[1], nt, nu + oa * gi + 22, 0);
                    mFont.tahoma_7_white.a(var1, "- " + mResources.fb[2], nt, nu + oa * gi + 34, 0);
                    if (indexTitle == 2) {
                        var8 = indexSelect / nz;
                        var4 = indexSelect - var8 * nz;
                        var1.a(16777215);
                        var1.b(nt + var4 * gi, nu + var8 * gi, gi, gi);
                        return;
                    }
                } catch (Exception var9) {
                    var9.printStackTrace();
                }

                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gh);
            }
        }

    }

    private void v(mGraphics var1) {
        if (isPaintSplit) {
            if (indexMenu == 0) {
                this.c(var1, mResources.go);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.go);
            }
        }

    }

    private void w(mGraphics var1) {
        if (isPaintDichChuyen) {
            if (indexMenu == 0) {
                this.c(var1, mResources.gr);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gr);
            }
        }

    }

    private void x(mGraphics var1) {
        if (isPaintTinhluyen) {
            if (indexMenu == 0) {
                this.c(var1, mResources.gs);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gs);
            }
        }

    }

    private void y(mGraphics var1) {
        if (isPaintLuyenNgoc) {
            if (indexMenu == 0) {
                String[] var2 = mResources.gp;
                var1 = var1;
                GameScr var3 = this;

                try {
                    Paint.a(eu, et, ev, ew, var1);
                    a(var1, var2[indexMenu], var2.length > 1);
                    nt = eu + 3;
                    nu = et + 45;
                    oa = 4;
                    int var4 = nt + 1;
                    int var5 = nu - 12;
                    mFont.tahoma_7_yellow.a(var1, Char.getMyChar().cName, var4, var5, 0);
                    int var6 = nt;

                    int var7;
                    for (var7 = 0; var7 < 3; ++var7) {
                        if (var7 == var3.cy) {
                            mFont.tahoma_7_blue1.a(var1, String.valueOf(var7 + 1), var6 + 2 + var7 * 20, nu + oa * (gi + 3) + 8, 0);
                        } else {
                            mFont.tahoma_7_grey.a(var1, String.valueOf(var7 + 1), var6 + 2 + var7 * 20, nu + oa * (gi + 3) + 8, 0);
                        }

                        if (var7 < 2) {
                            SmallImage.drawSmallImageNew(var1, 942, var6 + 14 + var7 * 20, nu + oa * (gi + 3) + 13, 0, StaticObj.VCENTER_HCENTER);
                        }
                    }

                    mFont.tahoma_7_white.a(var1, NinjaUtil.numberToString(String.valueOf(var3.da)) + " " + mResources.ki, nt, nu + oa * gi + 4, 0);
                    if (var3.cy == 0) {
                        var1.a(0);
                    }

                    if (var3.cy == 1) {
                        var1.a(210986);
                    }

                    if (var3.cy == 2) {
                        var1.a(805690);
                    }

                    var1.c(nt - 1, nu - 1, gi * 3 + 3, (gi << 2) + 3);

                    for (var7 = 0; var7 < oa; ++var7) {
                        for (var6 = 0; var6 < 3; ++var6) {
                            SmallImage.drawSmallImageNew(var1, 154, nt + var6 * gi + gi / 2, nu + var7 * gi + gi / 2, 0, 3);
                            var1.a(12281361);
                            var1.b(nt + var6 * gi, nu + var7 * gi, gi, gi);
                        }
                    }

                    if (indexTitle == 1) {
                        var7 = indexSelect / 3;
                        var6 = indexSelect - var7 * 3;
                        var1.a(16777215);
                        var1.b(nt + var6 * gi, nu + var7 * gi, gi, gi);
                    }

                    int var8;
                    Item var9;
                    if (arrItemTradeMe != null) {
                        for (var7 = 0; var7 < arrItemTradeMe.length; ++var7) {
                            if ((var9 = arrItemTradeMe[var7]) != null) {
                                var6 = var7 / 3;
                                var8 = var7 - var6 * 3;
                                if (!var9.isLock) {
                                    var1.a(12083);
                                    var1.c(nt + var8 * gi + 1, nu + var6 * gi + 1, gi - 1, gi - 1);
                                }

                                SmallImage.drawSmallImageNew(var1, var9.template.iconID, nt + var8 * gi + gi / 2, nu + var6 * gi + gi / 2, 0, 3);
                                if (var9.quantity > 1) {
                                    mFont.number_yellow.a(var1, String.valueOf(var9.quantity), nt + var8 * gi + gi, nu + var6 * gi + gi - mFont.number_yellow.d(), 1);
                                }

                                if (var9.quantity > 1) {
                                    mFont.number_yellow.a(var1, String.valueOf(var9.quantity), nt + var8 * gi + gi, nu + var6 * gi + gi - mFont.number_yellow.d(), 1);
                                }
                            }
                        }
                    }

                    nt = eu + ev - 2 - gi * 3;
                    oa = 4;
                    mFont.tahoma_7_yellow.a(var1, var3.dv, eu + ev - 2, nu - 12, 1);
                    var6 = eu + ev - 3 - 60;

                    for (var7 = 0; var7 < 3; ++var7) {
                        if (var7 == var3.cz) {
                            mFont.tahoma_7_blue1.a(var1, String.valueOf(var7 + 1), var6 + 2 + var7 * 20, nu + oa * (gi + 3) + 8, 0);
                        } else {
                            mFont.tahoma_7_grey.a(var1, String.valueOf(var7 + 1), var6 + 2 + var7 * 20, nu + oa * (gi + 3) + 8, 0);
                        }

                        if (var7 < 2) {
                            SmallImage.drawSmallImageNew(var1, 942, var6 + 14 + var7 * 20, nu + oa * (gi + 3) + 13, 0, StaticObj.VCENTER_HCENTER);
                        }
                    }

                    mFont.tahoma_7_white.a(var1, NinjaUtil.numberToString(String.valueOf(var3.db)) + " " + mResources.ki, eu + ev - 2, nu + oa * gi + 4, 1);
                    if (var3.cz == 0) {
                        var1.a(0);
                    }

                    if (var3.cz == 1) {
                        var1.a(210986);
                    }

                    if (var3.cz == 2) {
                        var1.a(805690);
                    }

                    var1.c(nt - 1, nu - 1, gi * 3 + 3, (gi << 2) + 3);

                    for (var7 = 0; var7 < oa; ++var7) {
                        for (var6 = 0; var6 < 3; ++var6) {
                            SmallImage.drawSmallImageNew(var1, 154, nt + var6 * gi + gi / 2, nu + var7 * gi + gi / 2, 0, 3);
                            var1.a(12281361);
                            var1.b(nt + var6 * gi, nu + var7 * gi, gi, gi);
                        }
                    }

                    if (indexTitle == 2) {
                        var7 = indexSelect / 3;
                        var6 = indexSelect - var7 * 3;
                        var1.a(16777215);
                        var1.b(nt + var6 * gi, nu + var7 * gi, gi, gi);
                    }

                    if (arrItemTradeOrder != null) {
                        for (var7 = 0; var7 < arrItemTradeOrder.length; ++var7) {
                            if ((var9 = arrItemTradeOrder[var7]) != null) {
                                var6 = var7 / 3;
                                var8 = var7 - var6 * 3;
                                if (!var9.isLock) {
                                    var1.a(12083);
                                    var1.c(nt + var8 * gi + 1, nu + var6 * gi + 1, gi - 1, gi - 1);
                                }

                                SmallImage.drawSmallImageNew(var1, var9.template.iconID, nt + var8 * gi + gi / 2, nu + var6 * gi + gi / 2, 0, 3);
                                if (var9.quantity > 1) {
                                    mFont.number_yellow.a(var1, String.valueOf(var9.quantity), nt + var8 * gi + gi, nu + var6 * gi + gi - mFont.number_yellow.d(), 1);
                                }

                                if (var9.quantity > 1) {
                                    mFont.number_yellow.a(var1, String.valueOf(var9.quantity), nt + var8 * gi + gi, nu + var6 * gi + gi - mFont.number_yellow.d(), 1);
                                }
                            }
                        }
                    }

                    var7 = (int) (System.currentTimeMillis() / 1000L);
                    if (var3.dc - var7 > 0 && var3.cy == 1 && var3.cz == 1) {
                        mFont.tahoma_7_white.a(var1, mResources.ai + " " + (var3.dc - var7) + " " + mResources.lh, eu + ev / 2, et + ew - 13, 2);
                        return;
                    }

                    if (var3.cy == 0) {
                        mFont.tahoma_7_white.a(var1, mResources.fk, eu + ev / 2, et + ew - 13, 2);
                        return;
                    }
                } catch (Exception var10) {
                    var10.printStackTrace();
                }

                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gp);
            }
        }

    }

    private void z(mGraphics var1) {
        if (isPaintUpPearl) {
            if (indexMenu == 0) {
                d(var1, mResources.gk);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gk);
            }
        }

    }

    private void aa(mGraphics var1) {
        if (isPaintLuyenThach) {
            if (indexMenu == 0) {
                d(var1, mResources.gq);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gq);
            }
        }

    }

    private void ab(mGraphics var1) {
        if (isPaintBox) {
            if (indexMenu == 0) {
                String[] var2 = mResources.gl;
                var1 = var1;
                GameScr var3 = this;

                try {
                    b(var1);
                    a(var1, var2, false);
                    if (Char.getMyChar().arrItemBox == null) {
                        GameCanvas.a(eu + 90, et + 75, var1);
                        mFont.tahoma_7b_white.a(var1, mResources.ag, eu + 90, et + 90, 2);
                        return;
                    }

                    mFont.tahoma_7_white.a(var1, mResources.ff + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().xuInBox)), eu + ev / 2, et + ew - 18, 2);
                    var3.a(var1, Char.getMyChar().arrItemBox);
                    return;
                } catch (Exception var5) {
                    var5.printStackTrace();
                    return;
                }
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gl);
            }
        }

    }

    private void ac(mGraphics var1) {
        if (isPaintTrade) {
            if (indexMenu == 0) {
                b(var1);
                a(var1, mResources.st, false);
                short[] var2 = NSOT_MOB.f;
                var1 = var1;
                oa = var2.length / nz;
                aq.a(oa, gi, nt, nu, nz * gi, 5 * gi, true, 6);
                aq.a(var1, nt, nu, aq.e + 2, aq.f + 2);

                int var3;
                int var4;
                for (var3 = 0; var3 < oa; ++var3) {
                    for (var4 = 0; var4 < nz; ++var4) {
                        SmallImage.drawSmallImageNew(var1, 154, nt + var4 * gi + gi / 2, nu + var3 * gi + gi / 2, 0, 3);
                        var1.a(12281361);
                        var1.b(nt + var4 * gi, nu + var3 * gi, gi, gi);
                    }
                }

                for (var3 = 0; var3 < var2.length; ++var3) {
                    short var5;
                    if ((var5 = var2[var3]) > 0) {
                        int var6 = var3 / nz;
                        int var7 = var3 - var6 * nz;
                        ItemTemplate var8;
                        if ((var8 = ItemTemplates.get(var5)) != null) {
                            SmallImage.drawSmallImageNew(var1, var8.iconID, nt + var7 * gi + gi / 2, nu + var6 * gi + gi / 2, 0, 3);
                        }
                    }
                }

                if (indexTitle > 0 && indexSelect >= 0) {
                    var3 = indexSelect / nz;
                    var4 = indexSelect - var3 * nz;
                    var1.a(16777215);
                    var1.b(nt + var4 * gi, nu + var3 * gi, gi, gi);
                    a(nt + var4 * gi, nu + var3 * gi, var1);
                }

                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.st);
            }
        }

    }

    private static void ad(mGraphics var0) {
        if (indexMenu == 2) {
            var0.translate(-var0.b(), -var0.c());
            Paint.a(eu, et, ev, ew, var0);
            a(var0, mResources.fr[indexMenu], true);
            mFont.tahoma_8b.a(var0, mResources.jk, eu + 10, et + 33, 0);
            mFont.tahoma_8b.a(var0, "" + Char.getMyChar().pPoint, eu + ev - 10, et + 33, 1);
            int var1 = (ew - 80) / 5;

            for (int var2 = 0; var2 < Char.getMyChar().potential.length; ++var2) {
                var0.a(Paint.COLORBORDER);
                if (indexTitle > 0 && indexTitle - 1 == var2) {
                    var0.a(Paint.COLORDARK);
                    var0.c(eu + 5, et + 52 + var2 * (var1 + 4), ev - 10, var1);
                    var0.a(Paint.COLORFOCUS);
                }

                var0.b(eu + 5, et + 52 + var2 * (var1 + 4), ev - 10, var1);
                mFont.tahoma_7b_white.a(var0, "" + Char.getMyChar().potential[var2], eu + ev - 10, et + 52 + (var1 - 10) / 2 + var2 * (var1 + 4), 1);
                mFont.tahoma_7b_white.a(var0, mResources.jd[var2], eu + 10, et + 52 + (var1 - 10) / 2 + var2 * (var1 + 4), 0);
            }

            if (indexTitle > 0) {
                switch (Char.getMyChar().nClass.classId) {
                    case 0:
                        mFont.tahoma_7_green.a(var0, mResources.on[0], eu + 10, et + 52 + (var1 - 10) / 2 + 4 * (var1 + 4), 0);
                        return;
                    case 1:
                    case 3:
                    case 5:
                        mFont.tahoma_7_green.a(var0, mResources.oo[indexTitle - 1], eu + 10, et + 52 + (var1 - 10) / 2 + 4 * (var1 + 4), 0);
                        return;
                    case 2:
                    case 4:
                    case 6:
                        mFont.tahoma_7_green.a(var0, mResources.op[indexTitle - 1], eu + 10, et + 52 + (var1 - 10) / 2 + 4 * (var1 + 4), 0);
                }
            }
        }

    }

    private static Item getItemFocus(int var0) {
        try {
            if (indexSelect < 0) {
                return null;
            }

            switch (var0) {
                case 2:
                    if (arrItemWeapon.length > indexSelect) {
                        return arrItemWeapon[indexSelect];
                    }

                    return null;
                case 3:
                    return Char.getMyChar().arrItemBag[indexSelect];
                case 4:
                    return Char.getMyChar().arrItemBox[indexSelect];
                case 5:
                    return currentCharViewInfo.arrItemBody[indexSelect + indextabTrangbi];
                case 6:
                    if (arrItemStack.length > indexSelect) {
                        return arrItemStack[indexSelect];
                    }

                    return null;
                case 7:
                    if (arrItemStackLock.length > indexSelect) {
                        return arrItemStackLock[indexSelect];
                    }

                    return null;
                case 8:
                    if (arrItemGrocery.length > indexSelect) {
                        return arrItemGrocery[indexSelect];
                    }

                    return null;
                case 9:
                    if (arrItemGroceryLock.length > indexSelect) {
                        return arrItemGroceryLock[indexSelect];
                    }

                    return null;
                case 10:
                    return arrItemUpGrade[indexSelect];
                case 11:
                    return arrItemUpPeal[indexSelect];
                case 12:
                case 13:
                case 30:
                case 31:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                default:
                    break;
                case 14:
                    if (arrItemStore.length > indexSelect) {
                        return arrItemStore[indexSelect];
                    }

                    return null;
                case 15:
                    if (arrItemBook.length > indexSelect) {
                        return arrItemBook[indexSelect];
                    }

                    return null;
                case 16:
                    if (arrItemLien.length > indexSelect) {
                        return arrItemLien[indexSelect];
                    }

                    return null;
                case 17:
                    if (arrItemNhan.length > indexSelect) {
                        return arrItemNhan[indexSelect];
                    }

                    return null;
                case 18:
                    if (arrItemNgocBoi.length > indexSelect) {
                        return arrItemNgocBoi[indexSelect];
                    }

                    return null;
                case 19:
                    if (arrItemPhu.length > indexSelect) {
                        return arrItemPhu[indexSelect];
                    }

                    return null;
                case 20:
                    if (arrItemNonNam.length > indexSelect) {
                        return arrItemNonNam[indexSelect];
                    }

                    return null;
                case 21:
                    if (arrItemNonNu.length > indexSelect) {
                        return arrItemNonNu[indexSelect];
                    }

                    return null;
                case 22:
                    if (arrItemAoNam.length > indexSelect) {
                        return arrItemAoNam[indexSelect];
                    }

                    return null;
                case 23:
                    if (arrItemAoNu.length > indexSelect) {
                        return arrItemAoNu[indexSelect];
                    }

                    return null;
                case 24:
                    if (arrItemGangTayNam.length > indexSelect) {
                        return arrItemGangTayNam[indexSelect];
                    }

                    return null;
                case 25:
                    if (arrItemGangTayNu.length > indexSelect) {
                        return arrItemGangTayNu[indexSelect];
                    }

                    return null;
                case 26:
                    if (arrItemQuanNam.length > indexSelect) {
                        return arrItemQuanNam[indexSelect];
                    }

                    return null;
                case 27:
                    if (arrItemQuanNu.length > indexSelect) {
                        return arrItemQuanNu[indexSelect];
                    }

                    return null;
                case 28:
                    if (arrItemGiayNam.length > indexSelect) {
                        return arrItemGiayNam[indexSelect];
                    }

                    return null;
                case 29:
                    if (arrItemGiayNu.length > indexSelect) {
                        return arrItemGiayNu[indexSelect];
                    }

                    return null;
                case 32:
                    if (arrItemFashion.length > indexSelect) {
                        return arrItemFashion[indexSelect];
                    }

                    return null;
                case 34:
                    if (arrItemClanShop.length > indexSelect) {
                        return arrItemClanShop[indexSelect];
                    }

                    return null;
                case 35:
                    if (arrItemElites.length > indexSelect) {
                        return arrItemElites[indexSelect];
                    }

                    return null;
                case 43:
                    return arrItemUpPeal[indexSelect];
                case 44:
                    return arrItemSplit[indexSelect];
                case 45:
                    return arrItemSplit[indexSelect];
                case 46:
                    return arrItemSplit[indexSelect];
                case 47:
                    return arrItemUpGrade[indexSelect];
                case 48:
                    return arrItemSplit[indexSelect];
            }
        } catch (Exception var2) {
        }

        return null;
    }

    public static void ad() {
        TileMap.e();
    }

    private static void a(mGraphics var0, String var1, boolean var2) {
        int var3 = gW / 2;
        var0.a(Paint.COLORDARK);
        var0.b(var3 - mFont.tahoma_8b.a(var1) / 2 - 12, et + 4, mFont.tahoma_8b.a(var1) + 22, 24, 6, 6);
        if ((indexTitle == 0 || GameCanvas.isTouch) && var2) {
            SmallImage.drawSmallImageNew(var0, 989, var3 - mFont.tahoma_8b.a(var1) / 2 - 15 - 7 - (GameCanvas.u % 8 <= 3 ? 2 : 0), et + 16, 2, StaticObj.VCENTER_HCENTER);
            SmallImage.drawSmallImageNew(var0, 989, var3 + mFont.tahoma_8b.a(var1) / 2 + 15 + 5 + (GameCanvas.u % 8 <= 3 ? 2 : 0), et + 16, 0, StaticObj.VCENTER_HCENTER);
        }

        if (indexTitle == 0) {
            var0.a(Paint.COLORFOCUS);
        } else {
            var0.a(Paint.COLORBORDER);
        }

        var0.a(var3 - mFont.tahoma_8b.a(var1) / 2 - 12, et + 4, mFont.tahoma_8b.a(var1) + 22, 24, 6, 6);
        mFont.tahoma_8b.a(var0, var1, var3, et + 9, 2);
    }

    private void ae(mGraphics var1) {
        if (ib) {
            b(var1);
            a(var1, new String[]{mResources.ml}, false);
            mFont.tahoma_7_yellow.a(var1, TileMap.mapName, eu + ev / 2, et + ew - 25, 2);
            if (indexSelect >= 0 && indexSelect < this.cx.length) {
                mFont.tahoma_7_white.a(var1, mResources.mm + ": " + this.cx[indexSelect] + ", " + mResources.mn + ": " + this.ir[indexSelect], eu + ev / 2, et + ew - 13, 2);
            }

            int var2 = indexSelect / this.iq;
            int var3 = indexSelect % this.iq;
            oa = this.cx.length / this.iq;
            if (this.cx.length % this.iq > 0) {
                ++oa;
            }

            if (oa < 5) {
                oa = 5;
            }

            aq.a(oa, gi, nt, nu, nz * gi + 2, 5 * gi + 2, true, 6);
            aq.a(var1);
            int var4 = 0;

            for (int var5 = 0; var5 < oa; ++var5) {
                for (int var6 = 0; var6 < this.iq; ++var6) {
                    var1.a(12281361);
                    var1.b(nt + var6 * gi, nu + var5 * gi, gi, gi);
                    if (var4 < this.cx.length) {
                        SmallImage.drawSmallImageNew(var1, 154, nt + var6 * gi + gi / 2, nu + var5 * gi + gi / 2, 0, 3);
                        if (this.cx[var4] >= 20) {
                            mFont.tahoma_7b_red.a(var1, String.valueOf(var4), nt + var6 * gi + gi / 2, nu + var5 * gi + gi / 2 - 4, 2);
                        } else if (this.cx[var4] >= 15) {
                            mFont.tahoma_7b_yellow.a(var1, String.valueOf(var4), nt + var6 * gi + gi / 2, nu + var5 * gi + gi / 2 - 4, 2);
                        } else {
                            mFont.tahoma_7b_white.a(var1, String.valueOf(var4), nt + var6 * gi + gi / 2, nu + var5 * gi + gi / 2 - 4, 2);
                        }

                        ++var4;
                    }
                }
            }

            if (indexSelect >= 0) {
                var1.a(16777215);
                var1.b(nt + var3 * gi, nu + var2 * gi, gi, gi);
            }
        }

    }

    private static void cs() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = false;
        boolean var3 = false;

        int var4;
        for (var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
            if (arrItemUpPeal[var4] != null) {
                ++var0;
                var1 += cn[arrItemUpPeal[var4].template.id];
                if (arrItemUpPeal[var4].template.id == 11) {
                    GameCanvas.msgdlg.setInfo(mResources.lr, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                    return;
                }
            }

            if (arrItemUpPeal[var4] != null && arrItemUpPeal[var4].isLock) {
                var2 = true;
            }

            if (arrItemUpPeal[var4] != null && !arrItemUpPeal[var4].isLock) {
                var3 = true;
            }
        }

        if (var0 <= 1) {
            GameCanvas.msgdlg.setInfo(mResources.ln, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            for (var4 = cn.length - 1; var4 >= 0 && var1 <= cn[var4]; --var4) {
            }

            if (var4 >= cn.length - 1) {
                var4 = cn.length - 2;
            }

            if (gn) {
                if (cr[var4 + 1] > Char.getMyChar().xu) {
                    GameCanvas.msgdlg.setInfo(mResources.lt, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                } else if (var2) {
                    GameCanvas.a(mResources.ls, 88813, arrItemUpPeal, 8882, (Object) null);
                } else {
                    Service.gI().crystalCollect(arrItemUpPeal);
                }
            } else if (cr[var4 + 1] > Char.getMyChar().xu + Char.getMyChar().yen) {
                GameCanvas.msgdlg.setInfo(mResources.lt, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            } else if (var3) {
                GameCanvas.a(mResources.ls, 88814, arrItemUpPeal, 8882, (Object) null);
            } else {
                Service.gI().crystalCollectLock(arrItemUpPeal);
            }
        }

    }

    private static void ct() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        short var3 = 0;

        for (int var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
            Item var5;
            if ((var5 = arrItemUpPeal[var4]) != null) {
                if (var5.template.id == 455) {
                    ++var0;
                } else if (var5.template.id == 456) {
                    ++var1;
                } else if (var5.template.type == 26) {
                    ++var2;
                    var3 = var5.template.id;
                }
            }
        }

        if (var2 > 1) {
            GameCanvas.a(mResources.rv);
        } else if (var0 <= 9 && var1 <= 9 && (var3 < 10 || var0 <= 3 && var1 <= 3)) {
            if (var0 + var1 < 3) {
                GameCanvas.a(mResources.rz);
            } else if ((var3 != 10 || var1 != 3) && (var3 != 11 || var0 != 3)) {
                Service.gI().luyenthach(arrItemUpPeal);
            } else {
                GameCanvas.a(mResources.rw);
            }
        } else {
            GameCanvas.a(mResources.sa);
        }

    }

    public static byte ae() {
        if (Char.getMyChar().ctaskId >= df.length) {
            return -3;
        } else {
            byte var0;
            if (Char.getMyChar().taskMaint == null) {
                var0 = dg[Char.getMyChar().ctaskId][0];
            } else {
                var0 = dg[Char.getMyChar().ctaskId][Char.getMyChar().taskMaint.index + 1];
            }

            if (var0 == -1) {
                if (Char.getMyChar().nClass.classId == 0 && Char.getMyChar().ctaskId == 9) {
                    var0 = -2;
                } else if (Char.getMyChar().nClass.classId != 0 && Char.getMyChar().nClass.classId != 1 && Char.getMyChar().nClass.classId != 2) {
                    if (Char.getMyChar().nClass.classId != 3 && Char.getMyChar().nClass.classId != 4) {
                        if (Char.getMyChar().nClass.classId == 5 || Char.getMyChar().nClass.classId == 6) {
                            var0 = 27;
                        }
                    } else {
                        var0 = 72;
                    }
                } else {
                    var0 = 1;
                }
            }

            return var0;
        }
    }

    public static byte af() {
        try {
            if (Char.getMyChar().ctaskId >= df.length) {
                return -3;
            } else {
                byte var0;
                if (Char.getMyChar().taskMaint == null) {
                    var0 = df[Char.getMyChar().ctaskId][0];
                } else {
                    var0 = df[Char.getMyChar().ctaskId][Char.getMyChar().taskMaint.index + 1];
                }

                if (var0 == -1) {
                    if (Char.getMyChar().nClass.classId == 0 && Char.getMyChar().ctaskId == 9) {
                        var0 = -2;
                    } else if (Char.getMyChar().nClass.classId != 0 && Char.getMyChar().nClass.classId != 1 && Char.getMyChar().nClass.classId != 2) {
                        if (Char.getMyChar().nClass.classId != 3 && Char.getMyChar().nClass.classId != 4) {
                            if (Char.getMyChar().nClass.classId == 5 || Char.getMyChar().nClass.classId == 6) {
                                var0 = 11;
                            }
                        } else {
                            var0 = 10;
                        }
                    } else {
                        var0 = 9;
                    }
                }

                return var0;
            }
        } catch (Exception var1) {
            return -1;
        }
    }

    private static void cu() {
        int var0 = 0;

        for (int var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
            if (arrItemUpGrade[var1] != null && arrItemUpGrade[var1].template.type == 26) {
                var0 += cn[arrItemUpGrade[var1].template.id];
            }
        }

        boolean var4 = false;
        boolean var2 = false;
        int var3 = 0;
        if (itemUpGrade.isTypeClothe()) {
            if (cs[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                var4 = true;
            }

            var3 = var0 * 100 / co[itemUpGrade.upgrade];
        } else if (itemUpGrade.isTypeAdorn()) {
            if (ct[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                var4 = true;
            }

            var3 = var0 * 100 / cp[itemUpGrade.upgrade];
        } else if (itemUpGrade.isTypeWeapon()) {
            if (cu[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                var4 = true;
            }

            var3 = var0 * 100 / cq[itemUpGrade.upgrade];
        }

        if (hw && cw[itemUpGrade.upgrade] > Char.getMyChar().luong) {
            var2 = true;
        }

        if (var4) {
            InfoMe.addInfo(mResources.lv, 15, mFont.tahoma_7_red);
        } else if (var2) {
            InfoMe.addInfo(mResources.lu, 15, mFont.tahoma_7_red);
        } else if (var3 > 250) {
            GameCanvas.a(mResources.lw, 88815, (Object) null, 8882, (Object) null);
        } else {
            ag();
        }

    }

    public static void ag() {
        if (!itemUpGrade.isLock) {
            GameCanvas.a(mResources.lx, new Command1(mResources.br, 11063), new Command1(mResources.ce, 1));
        } else {
            Service.gI().upgradeItem(itemUpGrade, arrItemUpGrade, hw);
        }

    }

    private static void cv() {
        if (isPaintKhamNgoc) {
            Service.gI().ngockham((byte) 1, (Item) null, itemSplit, arrItemSplit);
        } else if (isPaintTinhluyen) {
            Service.gI().tinhluyen(itemSplit, arrItemSplit);
        } else if (isPaintDichChuyen) {
            Service.gI().dichchuyen(itemSplit, arrItemSplit);
        } else if (itemSplit.upgrade == 0) {
            GameCanvas.msgdlg.setInfo(mResources.ly, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            int var0 = -1;
            int var1 = 0;

            int var2;
            for (var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
                if (Char.getMyChar().arrItemBag[var2] == null) {
                    ++var0;
                }
            }

            for (var2 = 0; var2 < arrItemSplit.length; ++var2) {
                if (arrItemSplit[var2] != null) {
                    ++var1;
                }
            }

            if (var1 > var0) {
                GameCanvas.msgdlg.setInfo(mResources.lz, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            } else {
                GameCanvas.a(mResources.ma, new Command1(mResources.br, 11087, itemSplit), new Command1(mResources.ce, 1));
            }
        }

    }

    private void a(Item var1, Command1 var2) {
        this.updateItemInfo((int) 3, (Item) var1);
        if (var2 != null) {
            super.left = new Command1(var2.caption, 11040);
        }

    }

    private void updateItemInfo(int var1, Item var2) {
        if (var2 != null) {
            this.itemFocus = var2;
            inforW = 120;
            inforH = 120;
            if (GameCanvas.isTouch && !GameCanvas.h) {
                inforH += 18;
            }

            isPaintItemInfo = true;
            scrInfo.clear();
            indexRow = 0;
            if (var2.expires == 0L) {
                if (isPaintTinhluyen || isPaintDichChuyen || isPaintKhamNgoc || isPaintGiaoDo || im || isPaintThaoNgoc) {
                    Service.gI().requestItemInfo(var2.typeUI, var2.indexUI);
                }

                if (isPaintAuctionBuy) {
                    Service.gI().requestItemAuction(var2.c);
                } else if (currentCharViewInfo.charID == Char.getMyChar().charID) {
                    Service.gI().requestItemInfo(var1, var2.indexUI);
                } else {
                    Service.gI().requestItemPlayer(currentCharViewInfo.charID, var2.indexUI);
                }
            }

            if (var1 == 5) {
                Char.getMyChar().updateKickOption();
            }

            if (!GameCanvas.isTouch || GameCanvas.isTouch && GameCanvas.h || isPaintInfoMe && indexMenu > 0 && indexMenu < 4 || isPaintClan && indexMenu == 0) {
                super.center = this.ol;
                super.right = null;
                super.left = null;
            }

            GameCanvas.m();
            GameCanvas.l();
        }

    }

    public final void a(String var1, String var2, boolean var3) {
        InfoDlg.hide();
        isPaintAlert = true;
        this.iw = true;
        indexRow = 0;
        setPopupSize(175, 200);
        if (var3) {
            ew -= 60;
        }

        super.right = new Command1(mResources.aq, 3);
        super.left = super.center = null;
        this.iy = var1;
        this.ix = mFont.tahoma_7.a(var2, ev - 30);
    }

    public final void ah() {
        isPaintAlert = false;
        this.iy = null;
        this.ix = null;
        super.center = null;
        this.resetButton();
    }

    public final void ai() {
        gk = this.ix.size();
        aq.a(gk, 12, eu, nu + 12, ev, ew - 42 - (this.iy != null ? 10 : 0), true, 1);
        indexRow = this.ix.size() - 1;
        aq.a(indexRow * aq.h);
    }

    private void af(mGraphics var1) {
        if (this.ix != null && isPaintAlert) {
            b(var1);
            Paint.a(eu, et, ev, ew, var1);
            if (this.iy != null) {
                a(var1, this.iy, isPaintMessage);
            }

            nt = eu + 15;
            nu = et + 15;
            if (this.iy != null) {
                nu += 10;
            }

            gk = this.ix.size();
            aq.a(gk, 12, eu, nu + 12, ev, ew - 42 - (this.iy != null ? 10 : 0), true, 1);
            aq.a(var1);
            this.ob = nu;
            mFont var2 = mFont.tahoma_7_white;

            String var3;
            for (int var4 = 0; var4 < this.ix.size() && (var3 = (String) this.ix.elementAt(var4)) != null && this.ix != null && var2 != null; ++var4) {
                if (var3.startsWith("c")) {
                    if (var3.startsWith("c0")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7_white;
                    } else if (var3.startsWith("c1")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7b_yellow;
                    } else if (var3.startsWith("c2")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7b_white;
                    } else if (var3.startsWith("c3")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7_yellow;
                    } else if (var3.startsWith("c4")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7b_red;
                    } else if (var3.startsWith("c5")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7_red;
                    } else if (var3.startsWith("c6")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7_grey;
                    } else if (var3.startsWith("c7")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7b_blue;
                    } else if (var3.startsWith("c8")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7_blue;
                    } else if (var3.startsWith("c9")) {
                        var3 = var3.substring(2);
                        var2 = mFont.tahoma_7_green;
                    }
                }

                var2.a(var1, var3, nt + 5, this.ob += 12, 0);
            }

            if (indexRow >= 0) {
                SmallImage.drawSmallImageNew(var1, 942, nt - 5, nu + 12 + 1 + indexRow * 12, 0, StaticObj.TOP_LEFT);
            }
        }

    }

    private static void ag(mGraphics var0) {
        if (isPaintFindTeam) {
            Paint.a(eu, et, ev, ew, var0);
            a(var0, mResources.im, false);
            nt = eu + 5;
            nu = et + 40;
            if (vPtMap.size() == 0) {
                mFont.tahoma_7_white.a(var0, mResources.ny, eu + ev / 2, et + 40, 2);
            } else {
                var0.a(6425);
                var0.c(nt - 2, nu - 2, ev - 6, gi * 5 + 8);
                b(var0);
                aq.a(vPtMap.size(), gi, nt, nu, ev - 3, gi * 5 + 4, true, 1);
                aq.a(var0, nt, nu, ev - 3, gi * 5 + 6);
                gk = vPtMap.size();

                for (int var1 = 0; var1 < vPtMap.size(); ++var1) {
                    Party var2 = (Party) vPtMap.elementAt(var1);
                    if (indexRow == var1) {
                        var0.a(Paint.COLORLIGHT);
                        var0.c(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                        var0.a(16777215);
                        var0.b(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                    } else {
                        var0.a(Paint.COLORBACKGROUND);
                        var0.c(nt + 2, nu + var1 * gi + 2, ev - 15, gi - 4);
                        var0.a(13932896);
                        var0.b(nt + 2, nu + var1 * gi + 2, ev - 15, gi - 4);
                    }

                    SmallImage.drawSmallImageNew(var0, 647, nt + 12, nu + var1 * gi + gi / 2, 0, 3);
                    mFont.tahoma_7_white.a(var0, var2.name + " - " + mResources.eg + ": " + var2.level + " (" + var2.size + ")", nt + 22, nu + var1 * gi + gi / 2 - 6, 0);
                }
            }

            m(var0);
        }

    }

    private static void ah(mGraphics var0) {
        if (isPaintTeam) {
            Paint.a(eu, et, ev, ew, var0);
            a(var0, mResources.il, false);
            nt = eu + 5;
            nu = et + 40;
            if (vParty.size() == 0) {
                mFont.tahoma_7_white.a(var0, mResources.nw, eu + ev / 2, et + 40, 2);
            } else {
                var0.a(6425);
                var0.c(nt - 2, nu - 2, ev - 6, gi * 5 + 8);
                b(var0);
                aq.a(vParty.size(), gi, nt, nu, ev - 3, gi * 5 + 4, true, 1);
                aq.a(var0, nt, nu, ev - 3, gi * 5 + 6);
                gk = vParty.size();

                for (int var1 = 0; var1 < vParty.size(); ++var1) {
                    Party var2 = (Party) vParty.elementAt(var1);
                    if (indexRow == var1) {
                        var0.a(Paint.COLORLIGHT);
                        var0.c(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                        var0.a(16777215);
                        var0.b(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                    } else {
                        var0.a(Paint.COLORBACKGROUND);
                        var0.c(nt + 2, nu + var1 * gi + 2, ev - 15, gi - 4);
                        var0.a(13932896);
                        var0.b(nt + 2, nu + var1 * gi + 2, ev - 15, gi - 4);
                    }

                    SmallImage.drawSmallImageNew(var0, var2.iconId, nt + 12, nu + var1 * gi + gi / 2, 0, 3);
                    if (var2.c == null) {
                        mFont.tahoma_7_green.a(var0, var2.name, nt + 22, nu + var1 * gi + gi / 2 - 6, 0);
                    } else if (var1 == 0) {
                        mFont.tahoma_7_yellow.a(var0, var2.name + " - " + mResources.eg + ": " + var2.c.clevel, nt + 22, nu + var1 * gi + gi / 2 - 6, 0);
                    } else {
                        mFont.tahoma_7_white.a(var0, var2.name + " - " + mResources.eg + ": " + var2.c.clevel, nt + 22, nu + var1 * gi + gi / 2 - 6, 0);
                    }
                }
            }

            m(var0);
        }

    }

    private static void ai(mGraphics var0) {
        if (isPaintAuctionBuy) {
            int var1 = ev;
            if (GameCanvas.isTouchControlLargeScreen) {
                var1 = ev / 2 + 20;
            }

            Paint.a(eu, et, ev, ew, var0);
            a(var0, mResources.qw[indexMenu], GameCanvas.isTouch ? true : indexTitle == 0);
            var0.a(6425);
            var0.c(nt - 2, nu - 2, var1 - 6, gi * 5 + 4);
            if (arrItemStands == null) {
                GameCanvas.a(eu + 90, et + 75, var0);
                mFont.tahoma_7b_white.a(var0, mResources.ag, eu + 90, et + 90, 2);
                return;
            }

            ItemStands[] var2 = arrItemStands;
            nt = eu + 5;
            nu = et + 33;
            if (var2.length > 0) {
                gk = var2.length;
                b(var0);
                aq.a(gk, gi, nt, nu, var1 - 3, gi * 5, true, 1);
                aq.a(var0, nt, nu, var1 - 3, gi * 5 + 2);

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    ItemStands var4;
                    if ((var4 = var2[var3]) != null && var4.item != null && var4.item.template != null) {
                        int var5 = (int) (System.currentTimeMillis() / 1000L);
                        if (var3 * gi >= aq.b - gi && var3 * gi < aq.b + gi * 5 + 4) {
                            if (indexSelect == var3) {
                                var0.a(Paint.COLORLIGHT);
                                var0.c(nt + 2, nu + indexSelect * gi + 2, var1 - 15, gi - 4);
                                var0.a(16777215);
                                var0.b(nt + 2, nu + indexSelect * gi + 2, var1 - 15, gi - 4);
                            } else {
                                var0.a(Paint.COLORBACKGROUND);
                                var0.c(nt + 2, nu + var3 * gi + 2, var1 - 15, gi - 4);
                                var0.a(13932896);
                                var0.b(nt + 2, nu + var3 * gi + 2, var1 - 15, gi - 4);
                            }

                            var0.a(0);
                            var0.c(nt + 4, nu + var3 * gi + 4, gi - 1, gi - 8);
                            var0.a(indexSelect == var3 ? 16777215 : 12281361);
                            var0.b(nt + 4, nu + var3 * gi + 4, gi - 1, gi - 8);
                            SmallImage.drawSmallImageNew(var0, var4.item.template.iconID, nt + gi / 2, nu + var3 * gi + gi / 2, 0, 3);
                            if (var4.item.quantity > 1) {
                                mFont.number_yellow.a(var0, String.valueOf(var4.item.quantity), nt + gi, nu + var3 * gi + gi / 2 + 2, 1);
                            }

                            var5 = var4.timeEnd - (var5 - var4.timeStart);
                            mFont.tahoma_7_white.a(var0, mResources.qs + ": " + var4.seller, nt + gi + 7, nu + var3 * gi + gi / 2 - mFont.number_yellow.d() - 2, 0);
                            mFont.tahoma_7_white.a(var0, mResources.cb + ": " + NinjaUtil.numberToString(String.valueOf(var4.price)) + " " + mResources.ki, nt + gi + 7, nu + var3 * gi + gi / 2 - mFont.number_yellow.d() + 9, 0);
                            if (var5 < 60) {
                                mFont.tahoma_7_blue.a(var0, mResources.qu, nt + var1 - 30, nu + var3 * gi + gi / 2 - mFont.number_yellow.d() - 2, 2);
                                mFont.tahoma_7_blue.a(var0, mResources.qv, nt + var1 - 30, nu + var3 * gi + gi / 2 - mFont.number_yellow.d() + 9, 2);
                            } else {
                                mFont.tahoma_7_green.a(var0, mResources.qt, nt + var1 - 30, nu + var3 * gi + gi / 2 - mFont.number_yellow.d() - 2, 2);
                                mFont.tahoma_7_green.a(var0, NinjaUtil.getTime(var5), nt + var1 - 30, nu + var3 * gi + gi / 2 - mFont.number_yellow.d() + 9, 2);
                            }
                        }
                    }
                }
            } else {
                gk = var2.length;
                mFont.tahoma_7_white.a(var0, mResources.nx, eu + var1 / 2, et + 40, 2);
            }

            m(var0);
        }

    }

    private static void aj(mGraphics var0) {
        if (isPaintFriend || isPaintEnemies) {
            String var1 = isPaintFriend ? mResources.io[0] : mResources.io[1];
            MyVector var2 = isPaintFriend ? vFriend : vEnemies;
            Paint.a(eu, et, ev, ew, var0);
            a(var0, var1, false);
            if (var2.size() <= 0) {
                mFont.tahoma_7_white.a(var0, isPaintFriend ? mResources.ip : mResources.je, eu + ev / 2, et + 40, 2);
            } else {
                nt = eu + 5;
                nu = et + 40;
                var0.a(6425);
                var0.c(nt - 2, nu - 2, ev - 6, gi * 5 + 8);
                b(var0);
                aq.a(var2.size(), gi, nt, nu, ev - 3, gi * 5 + 4, true, 1);
                aq.a(var0, nt, nu, ev - 3, gi * 5 + 6);
                gk = var2.size();
                int var3 = 0;
                int var4 = 0;

                while (true) {
                    if (var4 >= var2.size()) {
                        gk = var3;
                        aq.a(var3, gi, nt, nu, ev - 3, gi * 5 + 4, true, 1);
                        break;
                    }

                    Friend var5 = (Friend) var2.elementAt(var4);
                    if (!gp || var5.type == 3) {
                        mFont var6 = mFont.tahoma_7_grey;
                        if (var5.type != 1 && var5.type != 2) {
                            if (var5.type == 3) {
                                var6 = mFont.tahoma_7_white;
                            } else if (var5.type == 4) {
                                var6 = mFont.tahoma_7_red;
                            }
                        } else {
                            var6 = mFont.tahoma_7_green;
                        }

                        if (var4 * gi >= aq.b - gi && var4 * gi < aq.b + gi * 5 + 8) {
                            if (indexRow == var4) {
                                var0.a(Paint.COLORLIGHT);
                                var0.c(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                                var0.a(16777215);
                                var0.b(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                            } else {
                                var0.a(Paint.COLORBACKGROUND);
                                var0.c(nt + 2, nu + var4 * gi + 2, ev - 15, gi - 4);
                                var0.a(13932896);
                                var0.b(nt + 2, nu + var4 * gi + 2, ev - 15, gi - 4);
                            }

                            if (var5.type == 4) {
                                if (GameCanvas.u % 10 > 7) {
                                    var6.a(var0, var5.friendName, nt + 8, nu + var4 * gi + gi / 2 - 6, 0);
                                } else {
                                    mFont.tahoma_7_yellow.a(var0, var5.friendName, nt + 8, nu + var4 * gi + gi / 2 - 6, 0);
                                }

                                mFont.tahoma_7_blue.a(var0, mResources.iq, nt + ev - 15, nu + var4 * gi + gi / 2 - 6, 1);
                            } else {
                                var6.a(var0, var5.friendName, nt + 8, nu + var4 * gi + gi / 2 - 6, 0);
                            }
                        }

                        ++var3;
                    }

                    ++var4;
                }
            }

            m(var0);
        }

    }

    private void ak(mGraphics var1) {
        if (isPaintTask) {
            gk = 0;
            b(var1);
            Paint.a(eu, et, ev, ew, var1);
            a(var1, mResources.ifa[indexMenu], false);
            nt = eu + 10;
            nu = et + 32;
            int var2;
            String var3;
            if (indexMenu == 0) {
                boolean var9 = false;
                aq.a(gk, 12, eu, et + 32, ev, ew - 40, true, 1);
                aq.a(var1);
                int var5;
                if (Char.getMyChar().taskMaint != null) {
                    for (var2 = 0; var2 < Char.getMyChar().taskMaint.names.length; ++var2) {
                        mFont.tahoma_7b_white.a(var1, Char.getMyChar().taskMaint.names[var2], nt, this.ob = nu, 0);
                        ++gk;
                    }

                    var2 = 0;

                    for (var5 = 0; var5 < Char.getMyChar().taskMaint.subNames.length; ++var5) {
                        mFont var10;
                        if (Char.getMyChar().taskMaint.subNames[var5] != null) {
                            var2 = var5;
                            var3 = "- " + Char.getMyChar().taskMaint.subNames[var5];
                            if (Char.getMyChar().taskMaint.counts[var5] != -1) {
                                if (Char.getMyChar().taskMaint.index == var5) {
                                    var3 = var3 + " " + Char.getMyChar().taskMaint.count + "/" + Char.getMyChar().taskMaint.counts[var5];
                                    if (Char.getMyChar().taskMaint.count == Char.getMyChar().taskMaint.counts[var5]) {
                                        mFont.tahoma_7_white.a(var1, var3, nt + 5, this.ob += 12, 0);
                                    } else {
                                        var10 = mFont.tahoma_7_grey;
                                        if (!var9) {
                                            var9 = true;
                                            var10 = mFont.tahoma_7_yellow;
                                        }

                                        var10.a(var1, var3, nt + 5, this.ob += 12, 0);
                                    }
                                } else if (Char.getMyChar().taskMaint.index > var5) {
                                    var3 = var3 + " " + Char.getMyChar().taskMaint.counts[var5] + "/" + Char.getMyChar().taskMaint.counts[var5];
                                    mFont.tahoma_7_white.a(var1, var3, nt + 5, this.ob += 12, 0);
                                } else {
                                    var3 = var3 + " 0/" + Char.getMyChar().taskMaint.counts[var5];
                                    var10 = mFont.tahoma_7_grey;
                                    if (!var9) {
                                        var9 = true;
                                        var10 = mFont.tahoma_7_yellow;
                                    }

                                    var10.a(var1, var3, nt + 5, this.ob += 12, 0);
                                }
                            } else if (Char.getMyChar().taskMaint.index > var5) {
                                mFont.tahoma_7_white.a(var1, var3, nt + 5, this.ob += 12, 0);
                            } else {
                                var10 = mFont.tahoma_7_grey;
                                if (!var9) {
                                    var9 = true;
                                    var10 = mFont.tahoma_7_yellow;
                                }

                                var10.a(var1, var3, nt + 5, this.ob += 12, 0);
                            }

                            ++gk;
                        } else if (Char.getMyChar().taskMaint.index <= var5) {
                            var3 = "- " + Char.getMyChar().taskMaint.subNames[var2];
                            var10 = mFont.tahoma_7_grey;
                            if (!var9) {
                                var9 = true;
                                var10 = mFont.tahoma_7_yellow;
                            }

                            var10.a(var1, var3, nt + 5, this.ob, 0);
                        }
                    }

                    this.ob += 5;

                    for (var5 = 0; var5 < Char.getMyChar().taskMaint.details.length; ++var5) {
                        mFont.tahoma_7_white.a(var1, Char.getMyChar().taskMaint.details[var5], nt, this.ob += 12, 0);
                        ++gk;
                    }
                } else {
                    byte var6 = ae();
                    var5 = af();
                    String var7;
                    if (var6 != -3 && var5 != -3) {
                        if (Char.getMyChar().taskMaint == null && Char.getMyChar().ctaskId == 9 && Char.getMyChar().nClass.classId == 0) {
                            var7 = mResources.no;
                        } else {
                            if (var5 < 0 || var6 < 0) {
                                return;
                            }

                            var7 = mResources.nm[0] + Npc.arrNpcTemplate[var5].name + mResources.nm[1] + TileMap.v[var6] + mResources.nm[2];
                        }
                    } else {
                        var7 = mResources.nm[3];
                    }

                    String[] var8 = mFont.tahoma_7_white.splitFontArray(var7, 150);

                    for (var2 = 0; var2 < var8.length; ++var2) {
                        if (var2 == 0) {
                            mFont.tahoma_7_white.a(var1, var8[var2], nt + 5, this.ob = nu, 0);
                        } else {
                            mFont.tahoma_7_white.a(var1, var8[var2], nt + 5, this.ob += 12, 0);
                        }

                        ++gk;
                    }
                }

                if (indexTitle == 1 && indexRow >= 0 && gk > 0) {
                    SmallImage.drawSmallImageNew(var1, 942, nt - 8, nu + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                }

                aq.a(gk, 12, eu, et + 32, ev, ew - 44, true, 1);
                return;
            }

            if (indexMenu == 1) {
                this.ob = nu - 12;
                aq.a(Char.getMyChar().taskOrders.size(), 12, eu, et + 32, ev, ew - 44, true, 1);
                aq.a(var1);
                gk = 0;

                for (var2 = 0; var2 < Char.getMyChar().taskOrders.size(); ++var2) {
                    TaskOrder var4 = (TaskOrder) Char.getMyChar().taskOrders.elementAt(var2);
                    mFont.tahoma_7b_white.a(var1, var4.name, nt + 5, this.ob += 12, 0);
                    var3 = "";
                    if (var4.taskId != 0 && var4.taskId != 3) {
                        if (var4.taskId == 1) {
                            var3 = mResources.hm + " " + Mob.arrMobTemplate[var4.killId].name;
                        } else if (var4.taskId == 2) {
                            var3 = mResources.qy;
                        } else if (var4.taskId == 4) {
                            var3 = mResources.hn + " " + Mob.arrMobTemplate[var4.killId].name;
                        } else if (var4.taskId == 5) {
                            var3 = mResources.ho + " " + Mob.arrMobTemplate[var4.killId].name;
                        } else if (var4.taskId == 6) {
                            var3 = mResources.hp;
                        }
                    } else {
                        var3 = mResources.hl + " " + Mob.arrMobTemplate[var4.killId].name;
                    }

                    if (var4.taskId == 6) {
                        if (var4.count == var4.maxCount) {
                            mFont.tahoma_7_white.a(var1, var3, nt + 5, this.ob += 12, 0);
                        } else {
                            mFont.tahoma_7_yellow.a(var1, var3, nt + 5, this.ob += 12, 0);
                        }
                    } else if (var4.count == var4.maxCount) {
                        mFont.tahoma_7_white.a(var1, var3 + " " + var4.count + "/" + var4.maxCount, nt + 5, this.ob += 12, 0);
                    } else {
                        mFont.tahoma_7_yellow.a(var1, var3 + " " + var4.count + "/" + var4.maxCount, nt + 5, this.ob += 12, 0);
                    }

                    gk += 3;
                    inforW = ev - 25;
                    this.a(var1, mFont.tahoma_7_white, var4.description, nt + 5, this.ob += 12, 0);
                    this.ob += 12;
                }

                if (this.ed > 0) {
                    mFont.tahoma_7_white.a(var1, mResources.l, nt + 5, this.ob += 12, 0);
                    switch (this.ed) {
                        case 1:
                            mFont.tahoma_7_white.a(var1, mResources.m, nt + 5, this.ob += 12, 0);
                            break;
                        case 2:
                            mFont.tahoma_7_white.a(var1, mResources.n, nt + 5, this.ob += 12, 0);
                            break;
                        case 3:
                            mFont.tahoma_7_white.a(var1, mResources.o, nt + 5, this.ob += 12, 0);
                            break;
                        case 4:
                            mFont.tahoma_7_white.a(var1, mResources.p, nt + 5, this.ob += 12, 0);
                            break;
                        case 5:
                            mFont.tahoma_7_white.a(var1, mResources.q, nt + 5, this.ob += 12, 0);
                            break;
                        case 6:
                            mFont.tahoma_7_white.a(var1, mResources.r, nt + 5, this.ob += 12, 0);
                            break;
                        case 7:
                            mFont.tahoma_7_white.a(var1, mResources.s, nt + 5, this.ob += 12, 0);
                            break;
                        case 8:
                            mFont.tahoma_7_white.a(var1, mResources.t, nt + 5, this.ob += 12, 0);
                    }
                }

                if (indexTitle == 1 && indexRow >= 0 && gk > 0) {
                    SmallImage.drawSmallImageNew(var1, 942, nt - 8, nu + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                }

                ++gk;
                aq.a(gk, 12, eu, et + 32, ev, ew - 44, true, 1);
            }
        }

    }

    private static String[] a(mFont var0, String var1) {
        return var0.splitFontArray(var1, ev - 20);
    }

    private void a(mGraphics var1, mFont var2, String[] var3, int var4, int var5) {
        int var6 = var5;

        for (int var7 = 0; var7 < var3.length; ++var7) {
            String var8;
            if ((var8 = var3[var7]).startsWith("c")) {
                if (var8.startsWith("c0")) {
                    var8 = var8.substring(2);
                    var2 = mFont.tahoma_7_white;
                } else if (var8.startsWith("c1")) {
                    var8 = var8.substring(2);
                    var2 = mFont.tahoma_7_yellow;
                } else if (var8.startsWith("c2")) {
                    var8 = var8.substring(2);
                    var2 = mFont.tahoma_7_green;
                }
            }

            if (var7 == 0) {
                var2.a(var1, var8, var4, var5, 0);
            } else {
                if (var7 * aq.h + var6 >= aq.b - 12 && var7 * aq.h < aq.b + ew - 44) {
                    var5 += 12;
                    var2.a(var1, var8, var4, var5, 0);
                } else {
                    var5 += 12;
                }

                this.ob += 12;
                ++gk;
            }
        }

    }

    private void a(mGraphics var1, mFont var2, String var3, int var4, int var5, int var6) {
        int var7 = GameCanvas.isTouch && GameCanvas.z >= 320 ? 20 : 10;
        int var8 = var5;
        String[] var9 = var2.splitFontArray(var3, inforW - var7);

        for (var7 = 0; var7 < var9.length; ++var7) {
            if (var7 == 0) {
                var2.a(var1, var9[var7], var4, var5, var6);
            } else {
                if (var7 * aq.h + var8 >= aq.b - 12 && var7 * aq.h < aq.b + ew - 44) {
                    String var10 = var9[var7];
                    var5 += 12;
                    var2.a(var1, var10, var4, var5, var6);
                    this.ob += 12;
                } else {
                    var5 += 12;
                }

                ++gk;
            }
        }

    }

    private void b(mGraphics var1, mFont var2, String var3, int var4, int var5, int var6) {
        int var7 = var5;
        String[] var8 = var2.splitFontArray(var3, var6);

        for (var6 = 0; var6 < var8.length; ++var6) {
            if (var6 == 0) {
                var2.a(var1, var8[var6], var4, var5, 0);
            } else {
                if (var6 * aq.h + var7 >= aq.b - 12 && var6 * aq.h < aq.b + ew - 44) {
                    String var9 = var8[var6];
                    var5 += 12;
                    var2.a(var1, var9, var4, var5, 0);
                    this.ob += 12;
                } else {
                    var5 += 12;
                }

                ++gk;
            }
        }

    }

    private void al(mGraphics var1) {
        if (GameCanvas.isTouchControlLargeScreen && !isSmallUI() && (isOpenUI() || ci() || isPaintUI())) {
            cw();
            am(var1);
            b(var1);
            this.a(var1, mFont.tahoma_7_white, mResources.eb, of + inforW / 2, og + inforH / 2 - 20, 2);
        }

        if (isPaintItemInfo && this.itemFocus != null && this.itemFocus.template != null) {
            Item var2 = this.itemFocus;
            if (isViewNext && !this.itemFocus.isUpMax() && indexMenu == 0) {
                var2 = this.itemFocus.viewNext(this.itemFocus.upgrade + 1);
            }

            if (isPaintConvert && indexMenu == 0 && indexTitle == 1 && var2.isTypeBody() && var2.upgrade == 0 && arrItemConvert[0] != null && arrItemConvert[0].template.type == arrItemConvert[1].template.type && arrItemConvert[1].template.level >= arrItemConvert[0].template.level) {
                var2 = this.itemFocus.viewNext(arrItemConvert[0].upgrade);
            }

            b(var1);
            int var3;
            int var4;
            if (var2.expires != 0L && var2.options != null && var2.options.size() > 0) {
                for (var4 = 0; var4 < var2.options.size(); ++var4) {
                    if ((var3 = ((ItemOption) var2.options.elementAt(var4)).getOptionString().length() * 5) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                        inforW = var3;
                    }
                }
            }

            if ((var3 = mFont.tahoma_7b_white.a(var2.template.name) + 10) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                inforW = var3;
            }

            if (inforW > GameCanvas.z - 4) {
                inforW = GameCanvas.z - 4;
            }

            if (inforH > GameCanvas.aa - 4) {
                inforW = GameCanvas.aa - 4;
            }

            of = gW / 2 - inforW / 2;
            og = gH / 2 - inforH / 2;
            cw();
            if (of < 2) {
                of = 2;
            }

            if (og < 2) {
                og = 2;
            }

            am(var1);
            if (isPaintClan && indexMenu == 0) {
                if (Char.be != null) {
                    this.ob = og - 9;
                    gk = 2;
                    scrInfo.a(var1, of, og + 2, inforW, inforH - 2);
                    inforW = mFont.tahoma_7_white.a(mResources.rh[Char.be.itemLevel][1]) + 10;

                    for (var4 = 0; var4 < 2; ++var4) {
                        mFont.tahoma_7_white.a(var1, mResources.rh[Char.be.itemLevel][var4], of + 8, this.ob += 12, 0);
                    }

                    if (indexRow >= 0 && (!GameCanvas.isTouch || GameCanvas.isTouch && GameCanvas.z < 320)) {
                        SmallImage.drawSmallImageNew(var1, 942, of + 1, og + 5 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                    }

                    scrInfo.a(gk, 12, of, og + 2, inforW, inforH - 4, true, 1);
                    return;
                }
            } else {
                scrInfo.a(var1, of, og + 2, inforW, inforH - 2);
                gk = 3;
                this.ob = og + 3;
                mFont var5 = mFont.tahoma_7b_white;
                if (!var2.isTypeMounts()) {
                    if (var2.upgrade > 0 && var2.upgrade < 4) {
                        var5 = mFont.tahoma_7b_blue;
                    } else if (var2.upgrade >= 4 && var2.upgrade < 8) {
                        var5 = mFont.tahoma_7b_green;
                    } else if (var2.upgrade >= 8 && var2.upgrade < 12) {
                        var5 = mFont.tahoma_7b_yellow;
                    } else if (var2.upgrade >= 12 && var2.upgrade < 15) {
                        var5 = mFont.tahoma_7b_purple;
                    } else if (var2.upgrade >= 15) {
                        var5 = mFont.tahoma_7b_red;
                    }
                }

                if (var2.r != null) {
                    var1.a(var2.r, 0, 0, mGraphics.a(var2.r), mGraphics.b(var2.r), 0, of + inforW / 2, this.ob + inforH - 10, 33);
                }

                if (var2.isTypeMounts()) {
                    this.a(var1, var5, var2.template.name, of + 8, this.ob, 0);
                } else {
                    this.a(var1, var5, var2.template.name + (var2.upgrade > 0 ? " +" + var2.upgrade : ""), of + 8, this.ob, 0);
                }

                if (var2.upgrade >= 15 && !gr && !var2.isTypeMounts()) {
                    if (var5.splitFontArray(var2.template.name + (var2.upgrade > 0 ? " +" + var2.upgrade : ""), inforW - (GameCanvas.isTouch && GameCanvas.z >= 320 ? 20 : 10)).length > 1) {
                        this.ob -= 12;
                    }

                    if (var2.isTypeMounts()) {
                        this.a(var1, mFont.tahoma_7b_white, var2.template.name, of + 8, this.ob, 0);
                    } else {
                        this.a(var1, mFont.tahoma_7b_white, var2.template.name + (var2.upgrade > 0 ? " +" + var2.upgrade : ""), of + 8, this.ob, 0);
                    }
                }

                if (!var2.isTypeBody()) {
                    if (var2.isTypeMounts() && Char.getMyChar().arrItemMounts[4] != null) {
                        this.ob += 12;
                        var3 = Char.getMyChar().arrItemMounts[4].sys + 1;

                        for (var4 = 0; var4 < var3; ++var4) {
                            SmallImage.drawSmallImageNew(var1, 633, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                        }
                    }
                } else {
                    this.ob += 12;
                    ++gk;
                    if (gr && GameCanvas.u % 5 == 0) {
                        gr = !gr;
                    } else if (!gr && GameCanvas.u % 5 == 0) {
                        gr = !gr;
                    }

                    var3 = var2.upgrade / 2 + 1;
                    if (var2.upgrade == 0) {
                        for (var4 = 0; var4 < var3; ++var4) {
                            SmallImage.drawSmallImageNew(var1, 633, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                        }
                    } else if (var2.upgrade > 0 && var2.upgrade < 4) {
                        for (var4 = 0; var4 < var3; ++var4) {
                            SmallImage.drawSmallImageNew(var1, 625, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                        }

                        if (var2.upgrade == 3) {
                            SmallImage.drawSmallImageNew(var1, 635, of + 12 + var3 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                        }
                    } else if (var2.upgrade >= 4 && var2.upgrade < 8) {
                        for (var4 = 0; var4 < var3; ++var4) {
                            SmallImage.drawSmallImageNew(var1, 626, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                        }

                        if (var2.upgrade % 2 != 0) {
                            SmallImage.drawSmallImageNew(var1, 636, of + 12 + var3 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                        }
                    } else if (var2.upgrade >= 8 && var2.upgrade < 12) {
                        for (var4 = 0; var4 < var3; ++var4) {
                            if (gr) {
                                SmallImage.drawSmallImageNew(var1, 627, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImageNew(var1, 628, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }

                        if (var2.upgrade % 2 != 0) {
                            if (gr) {
                                SmallImage.drawSmallImageNew(var1, 637, of + 12 + var3 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImageNew(var1, 638, of + 12 + var3 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }
                    } else if (var2.upgrade >= 12 && var2.upgrade < 15) {
                        for (var4 = 0; var4 < var3; ++var4) {
                            if (gr) {
                                SmallImage.drawSmallImageNew(var1, 629, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImageNew(var1, 630, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }

                        if (var2.upgrade % 2 != 0) {
                            if (gr) {
                                SmallImage.drawSmallImageNew(var1, 639, of + 12 + var3 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImageNew(var1, 640, of + 12 + var3 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }
                    } else {
                        for (var4 = 0; var4 < var3; ++var4) {
                            if (gr) {
                                SmallImage.drawSmallImageNew(var1, 631, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImageNew(var1, 632, of + 12 + var4 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }

                        if (var2.upgrade % 2 != 0) {
                            if (gr) {
                                SmallImage.drawSmallImageNew(var1, 641, of + 12 + var3 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImageNew(var1, 642, of + 12 + var3 * 10, this.ob + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }
                    }
                }

                mFont.tahoma_7_white.a(var1, var2.isLock ? mResources.hk : mResources.hq, of + 8, this.ob += 12, 0);
                String var6;
                if ((var2.isTypeBody() || var2.isTypeMounts()) && (var6 = var2.template.type == 12 ? mResources.ey : (var2.template.level >= 10 && var2.template.type < 10 ? (var2.upgrade == 0 ? mResources.ew : null) : mResources.ex)) != null) {
                    this.a(var1, mFont.tahoma_7_white, var6, of + 8, this.ob += 12, 0);
                    ++gk;
                }

                if (var2.template.gender == 0 || var2.template.gender == 1) {
                    if (var2.template.gender == Char.getMyChar().cgender) {
                        mFont.tahoma_7_white.a(var1, mResources.mk[var2.template.gender], of + 8, this.ob += 12, 0);
                        ++gk;
                    } else {
                        mFont.tahoma_7_red.a(var1, mResources.mk[var2.template.gender], of + 8, this.ob += 12, 0);
                        ++gk;
                    }
                }

                if (Char.getMyChar().clevel != -1) {
                    if (Char.getMyChar().clevel >= var2.template.level) {
                        this.a(var1, mFont.tahoma_7_white, mResources.id + " " + var2.template.level, of + 8, this.ob += 12, 0);
                    } else {
                        this.a(var1, mFont.tahoma_7_red, mResources.id + " " + var2.template.level, of + 8, this.ob += 12, 0);
                    }
                }

                if ((var2.template.id < 40 || var2.template.id > 48) && var2.template.id != 311 && var2.template.id != 375 && var2.template.id != 397 && var2.template.id != 552 && var2.template.id != 558) {
                    if ((var2.template.id < 49 || var2.template.id > 57) && var2.template.id != 312 && var2.template.id != 376 && var2.template.id != 398 && var2.template.id != 553 && var2.template.id != 559) {
                        if ((var2.template.id < 58 || var2.template.id > 66) && var2.template.id != 313 && var2.template.id != 377 && var2.template.id != 399 && var2.template.id != 554 && var2.template.id != 560) {
                            if ((var2.template.id < 67 || var2.template.id > 75) && var2.template.id != 314 && var2.template.id != 378 && var2.template.id != 400 && var2.template.id != 555 && var2.template.id != 561) {
                                if ((var2.template.id < 76 || var2.template.id > 84) && var2.template.id != 315 && var2.template.id != 379 && var2.template.id != 401 && var2.template.id != 556 && var2.template.id != 562) {
                                    if (var2.template.id >= 85 && var2.template.id <= 93 || var2.template.id == 316 || var2.template.id == 380 || var2.template.id == 402 || var2.template.id == 557 || var2.template.id == 563) {
                                        if (Char.getMyChar().nClass.classId == 6) {
                                            mFont.tahoma_7_white.a(var1, mResources.ie + " " + nClasss[6].name, of + 8, this.ob += 12, 0);
                                        } else {
                                            mFont.tahoma_7_red.a(var1, mResources.ie + " " + nClasss[6].name, of + 8, this.ob += 12, 0);
                                        }

                                        ++gk;
                                    }
                                } else {
                                    if (Char.getMyChar().nClass.classId == 5) {
                                        mFont.tahoma_7_white.a(var1, mResources.ie + " " + nClasss[5].name, of + 8, this.ob += 12, 0);
                                    } else {
                                        mFont.tahoma_7_red.a(var1, mResources.ie + " " + nClasss[5].name, of + 8, this.ob += 12, 0);
                                    }

                                    ++gk;
                                }
                            } else {
                                if (Char.getMyChar().nClass.classId == 4) {
                                    mFont.tahoma_7_white.a(var1, mResources.ie + " " + nClasss[4].name, of + 8, this.ob += 12, 0);
                                } else {
                                    mFont.tahoma_7_red.a(var1, mResources.ie + " " + nClasss[4].name, of + 8, this.ob += 12, 0);
                                }

                                ++gk;
                            }
                        } else {
                            if (Char.getMyChar().nClass.classId == 3) {
                                mFont.tahoma_7_white.a(var1, mResources.ie + " " + nClasss[3].name, of + 8, this.ob += 12, 0);
                            } else {
                                mFont.tahoma_7_red.a(var1, mResources.ie + " " + nClasss[3].name, of + 8, this.ob += 12, 0);
                            }

                            ++gk;
                        }
                    } else {
                        if (Char.getMyChar().nClass.classId == 2) {
                            mFont.tahoma_7_white.a(var1, mResources.ie + " " + nClasss[2].name, of + 8, this.ob += 12, 0);
                        } else {
                            mFont.tahoma_7_red.a(var1, mResources.ie + " " + nClasss[2].name, of + 8, this.ob += 12, 0);
                        }

                        ++gk;
                    }
                } else {
                    if (Char.getMyChar().nClass.classId == 1) {
                        mFont.tahoma_7_white.a(var1, mResources.ie + " " + nClasss[1].name, of + 8, this.ob += 12, 0);
                    } else {
                        mFont.tahoma_7_red.a(var1, mResources.ie + " " + nClasss[1].name, of + 8, this.ob += 12, 0);
                    }

                    ++gk;
                }

                if (!var2.isTypeMounts()) {
                    if (var2.template.id == 420) {
                        if (Char.getMyChar().nClass.classId != 1 && Char.getMyChar().nClass.classId != 2) {
                            mFont.tahoma_7_red.a(var1, mResources.kt[1], of + 8, this.ob += 12, 0);
                        } else {
                            mFont.tahoma_7_white.a(var1, mResources.kt[1], of + 8, this.ob += 12, 0);
                        }

                        ++gk;
                    } else if (var2.template.id == 421) {
                        if (Char.getMyChar().nClass.classId != 3 && Char.getMyChar().nClass.classId != 4) {
                            mFont.tahoma_7_red.a(var1, mResources.kt[2], of + 8, this.ob += 12, 0);
                        } else {
                            mFont.tahoma_7_white.a(var1, mResources.kt[2], of + 8, this.ob += 12, 0);
                        }

                        ++gk;
                    } else if (var2.template.id == 422) {
                        if (Char.getMyChar().nClass.classId != 5 && Char.getMyChar().nClass.classId != 6) {
                            mFont.tahoma_7_red.a(var1, mResources.kt[3], of + 8, this.ob += 12, 0);
                        } else {
                            mFont.tahoma_7_white.a(var1, mResources.kt[3], of + 8, this.ob += 12, 0);
                        }

                        ++gk;
                    }
                }

                if (var2.expires > 0L) {
                    if (!var2.isTypeUIShop() && !var2.isTypeUIShopLock() && !var2.isTypeUIStore() && !var2.isTypeUIBook() && !var2.isTypeUIFashion() && !var2.isTypeUIClanShop() && var2.typeUI != 39) {
                        if ((var3 = mFont.tahoma_7.a(mResources.hr + ": " + var2.getExpiresString()) + 10) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                            inforW = var3;
                        }

                        this.a(var1, mFont.tahoma_7_yellow, mResources.hr + ": " + var2.getExpiresString(), of + 8, this.ob += 12, 0);
                    } else {
                        if ((var3 = mFont.tahoma_7.a(mResources.hr + ": " + var2.getExpiresShopString()) + 10) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                            inforW = var3;
                        }

                        this.a(var1, mFont.tahoma_7_yellow, mResources.hr + ": " + var2.getExpiresShopString(), of + 8, this.ob += 12, 0);
                    }

                    ++gk;
                }

                if (!var2.template.description.equals("")) {
                    this.a(var1, mFont.tahoma_7_white, var2.template.description, of + 8, this.ob += 12, 0);
                    ++gk;
                }

                if (!var2.isTypeUIMe() && var2.typeUI != 37) {
                    if (var2.isTypeUIShop() || var2.isTypeUIShopLock() || var2.isTypeUIStore() || var2.isTypeUIBook() || var2.isTypeUIFashion() || var2.isTypeUIClanShop()) {
                        if (var2.buyCoinLock > 0) {
                            if (var2.isTypeUIClanShop()) {
                                if ((var3 = mFont.tahoma_7.a(mResources.b(mResources.hu, NinjaUtil.numberToString(String.valueOf(var2.buyCoinLock)))) + 10) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                                    inforW = var3;
                                }

                                mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.hu, NinjaUtil.numberToString(String.valueOf(var2.buyCoinLock))), of + 8, this.ob += 12, 0);
                            } else {
                                mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.ht, NinjaUtil.numberToString(String.valueOf(var2.buyCoinLock))), of + 8, this.ob += 12, 0);
                            }

                            ++gk;
                        } else if (var2.buyGold > 0) {
                            mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.hv, NinjaUtil.numberToString(String.valueOf(var2.buyGold))), of + 8, this.ob += 12, 0);
                            ++gk;
                        } else if (var2.buyGoldLock > 0) {
                            mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.hw, NinjaUtil.numberToString(String.valueOf(var2.buyGoldLock))), of + 8, this.ob += 12, 0);
                            ++gk;
                        }
                    }
                } else {
                    mFont.tahoma_7_yellow.a(var1, mResources.b(mResources.hs, NinjaUtil.numberToString(String.valueOf(var2.saleCoinLock))), of + 8, this.ob += 12, 0);
                    ++gk;
                }

                if (var2.template.type == 33) {
                    mFont.tahoma_7_yellow.a(var1, mResources.ef + ": " + (var2.upgrade + 1), of + 8, this.ob += 12, 0);
                    ++gk;
                }

                if (var2.isTypeBody() && var2.sys != 0) {
                    mFont.tahoma_7_blue1.a(var1, mResources.kt[var2.sys], of + 8, this.ob += 12, 0);
                    ++gk;
                }

                if (var2.expires != 0L && var2.options != null && var2.options.size() > 0) {
                    boolean var7 = false;
                    boolean var8 = false;

                    for (int var9 = 0; var9 < var2.options.size(); ++var9) {
                        ItemOption var10 = (ItemOption) var2.options.elementAt(var9);
                        if (!var7 && var10.optionTemplate.type == 2) {
                            var7 = true;
                            String var11 = mResources.mx[0] + ": ";
                            if (var2.template.type == 1) {
                                var11 = var11 + mResources.mw[var2.template.type] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 0) {
                                var11 = var11 + mResources.mw[6] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[5] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 6) {
                                var11 = var11 + mResources.mw[0] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[5] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 5) {
                                var11 = var11 + mResources.mw[0] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[6] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 2) {
                                var11 = var11 + mResources.mw[8] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[7] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 8) {
                                var11 = var11 + mResources.mw[2] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[7] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 7) {
                                var11 = var11 + mResources.mw[2] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[8] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 4) {
                                var11 = var11 + mResources.mw[3] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[9] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 3) {
                                var11 = var11 + mResources.mw[4] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[9] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 9) {
                                var11 = var11 + mResources.mw[4] + "(" + mResources.my[this.itemFocus.sys] + "), " + mResources.mw[3] + "(" + mResources.my[this.itemFocus.sys] + ")";
                            }

                            if ((var3 = mFont.tahoma_7_white.a(var11) + 15) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                                inforW = var3;
                            }

                            this.a(var1, mFont.tahoma_7_white, var11, of + 8, this.ob += 12, 0);
                            ++gk;
                        }

                        if (!var8 && var10.optionTemplate.type > 2 && var10.optionTemplate.type < 8) {
                            var8 = true;
                            mFont.tahoma_7_white.a(var1, mResources.mx[1], of + 8, this.ob += 12, 0);
                            ++gk;
                        }

                        if (var10.optionTemplate.id == 65) {
                            this.a(var1, mFont.tahoma_7_blue, var2.template.id == 485 ? NinjaUtil.replace(var10.getOptionString(), mResources.hj, mResources.sg) : var10.getOptionString(), of + 8, this.ob += 12, 0);
                        } else if (var10.optionTemplate.id == 66) {
                            this.a(var1, mFont.tahoma_7_blue1, var2.template.id == 485 ? NinjaUtil.replace(var10.getOptionString(), mResources.rq, mResources.sh) : var10.getOptionString(), of + 8, this.ob += 12, 0);
                        } else if (var10.optionTemplate.type == 0) {
                            this.a(var1, mFont.tahoma_7_blue1, var2.isTypeUIShopView() ? var10.getOptionShopString() : var10.getOptionString(), of + 8, this.ob += 12, 0);
                        } else if (var10.optionTemplate.type == 1) {
                            this.a(var1, mFont.tahoma_7_green, var2.isTypeUIShopView() ? var10.getOptionShopString() : var10.getOptionString(), of + 8, this.ob += 12, 0);
                        } else {
                            label963:
                            {
                                String var14;
                                GameScr var15;
                                mGraphics var12;
                                mFont var13;
                                if (var10.optionTemplate.type == 8) {
                                    if (var10.optionTemplate.id == 85) {
                                        this.a(var1, mFont.tahoma_7_yellow, var2.isTypeUIShopView() ? var10.getOptionShopString() : NinjaUtil.replace(var10.optionTemplate.name, "#", String.valueOf(var10.param)), of + 8, this.ob += 12, 0);
                                        break label963;
                                    }

                                    var15 = this;
                                    var12 = var1;
                                    var13 = mFont.tahoma_7b_blue;
                                    var14 = var10.getOptionShopString();
                                } else {
                                    if ((var10.optionTemplate.type != 2 || var2.typeUI != 5 || var10.active != 1) && (var10.optionTemplate.type != 3 || var2.upgrade < 4) && (var10.optionTemplate.type != 4 || var2.upgrade < 8) && (var10.optionTemplate.type != 5 || var2.upgrade < 12) && (var10.optionTemplate.type != 6 || var2.upgrade < 14) && (var10.optionTemplate.type != 7 || var2.upgrade < 16)) {
                                        this.a(var1, mFont.tahoma_7_grey, var2.isTypeUIShopView() ? var10.getOptionShopString() : var10.getOptionString(), of + 8, this.ob += 12, 0);
                                        break label963;
                                    }

                                    var15 = this;
                                    var12 = var1;
                                    var13 = mFont.tahoma_7_green;
                                    var14 = var2.isTypeUIShopView() ? var10.getOptionShopString() : var10.getOptionString();
                                }

                                var15.a(var12, var13, var14, of + 8, this.ob += 12, 0);
                            }
                        }

                        ++gk;
                    }
                }

                if (isPaintLuckySpin) {
                    if (var2.template.id == 12) {
                        mFont.tahoma_7_red.a(var1, NinjaUtil.numberToString(this.ee[indexSelect]) + " " + mResources.kj, of + 8, this.ob += 12, 0);
                    }

                    if (var2.template.type >= 0 && var2.template.type <= 9) {
                        mFont.tahoma_7_yellow.a(var1, mResources.rc, of + 8, this.ob += 12, 0);
                    }

                    ++gk;
                }

                if (indexRow >= 0 && (!GameCanvas.isTouch || GameCanvas.isTouch && GameCanvas.z < 320)) {
                    SmallImage.drawSmallImageNew(var1, 942, of + 1, og + 5 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                }

                scrInfo.a(gk, 12, of, og + 2, inforW, inforH - 4, true, 1);
            }
        }

    }

    private static void am(mGraphics var0) {
        b(var0);
        var0.a(0);
        var0.c(of - 2, og - 2, inforW + 5, inforH + 5);
        var0.a(13606712);
        var0.b(of - 1, og - 1, inforW + 2, inforH + 2);
        var0.a(Paint.COLORBACKGROUND);
        var0.c(of, og, inforW, inforH);
    }

    private static void cw() {
        if (GameCanvas.isTouchControlLargeScreen && (!isPaintClan || indexMenu != 0)) {
            of = eu + 175;
            inforW = ev - 179;
            og = et + 33;
            inforH = 138;
            if (isPaintLuyenNgoc && indexMenu == 0) {
                of = eu + 6 + 3 * gi;
                inforW = ev - (11 + 6 * gi);
            }

            if (isPaintInfoMe) {
                if (indexMenu == 4) {
                    of = eu + 33;
                    og = et + 87;
                    inforW = ev - 67;
                    inforH = 75;
                    return;
                }

                if (indexMenu == 5) {
                    inforH = 161;
                }
            }
        }

    }

    public final void aj() {
        super.center = null;
        if (indexTitle == 0 && (indexMenu == 1 || indexMenu == 3 || indexMenu == 4)) {
            super.left = null;
        } else {
            switch (indexMenu) {
                case 0:
                    if (indexTitle != 1) {
                        break;
                    }

                    if (getItemFocus(3) == null) {
                        isPaintItemInfo = false;
                        super.left = this.ok;
                    } else {
                        super.left = this.op;
                        if (GameCanvas.isTouch && GameCanvas.z < 320 || !GameCanvas.isTouch) {
                            super.center = this.oo;
                        }
                    }
                    break;
                case 1:
                    if (indexTitle != 1) {
                        break;
                    }

                    super.left = null;
                    if (indexSelect < 0) {
                        break;
                    }

                    SkillTemplate var3 = Char.getMyChar().nClass.c[indexSelect];
                    Skill var2;
                    if ((var2 = Char.getMyChar().a(var3)) == null) {
                        break;
                    }

                    if (var2.point < var3.maxPoint) {
                        super.left = new Command1(mResources.di, 14001);
                    }

                    if (var2.template.type != 1 && var2.template.type != 4 && var2.template.type != 2 && var2.template.type != 3) {
                        super.center = null;
                        break;
                    }

                    super.center = new Command1(mResources.ec, 11081);
                    break;
                case 2:
                    if (indexTitle > 0) {
                        super.left = new Command1(mResources.di, 11084);
                        super.center = new Command1("", 11084);
                    }
                    break;
                case 3:
                    super.left = null;
                    super.center = new Command1(mResources.fl, 110854);
                    break;
                case 4:
                    if (indexTitle == 1) {
                        super.left = null;
                        super.center = new Command1(indextabTrangbi > 0 ? "Tbi 1" : "Tbi 2", 2003);
                        Item var1;
                        if ((var1 = getItemFocus(5)) != null) {
                            if (currentCharViewInfo.charID == Char.getMyChar().charID) {
                                super.left = new Command1(mResources.dz, 11082);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 5, (Item) var1);
                                } else {
                                    super.center = new Command1(mResources.bg, 11083);
                                }
                            } else if (GameCanvas.isTouchControlLargeScreen) {
                                this.updateItemInfo((int) 5, (Item) var1);
                            } else {
                                super.center = new Command1(mResources.bg, 11083);
                            }
                        } else {
                            isPaintItemInfo = false;
                        }
                    }
                    break;
                case 5:
                    super.left = null;
                    if (indexTitle == 1 && indexSelect >= 0 && currentCharViewInfo.arrItemMounts[indexSelect] != null) {
                        if (Char.getMyChar().charID == currentCharViewInfo.charID) {
                            super.left = new Command1(mResources.bt, 1516);
                        }

                        super.center = new Command1(GameCanvas.isTouchControlLargeScreen ? "" : mResources.bg, 1515);
                    }
            }

            if (currentCharViewInfo.charID == Char.getMyChar().charID) {
                super.right = new Command1(mResources.ep, 11086);
            } else {
                super.right = this.mu;
            }
        }

    }

    public final void d(int var1) {
        indexTitle = 0;
        super.right = this.mu;
        switch (var1) {
            case 2:
                indexMenu = 0;
                isPaintWeapon = true;
                if (arrItemWeapon == null) {
                    Service.gI().requestItem(2);
                }
            case 3:
            case 5:
            case 30:
            case 39:
            case 41:
            case 42:
            default:
                break;
            case 4:
                indexMenu = 0;
                isPaintBox = true;
                if (Char.getMyChar().arrItemBox == null) {
                    Service.gI().requestItem(4);
                }
                break;
            case 6:
                indexMenu = 0;
                isPaintStack = true;
                if (arrItemStack == null) {
                    Service.gI().requestItem(6);
                }
                break;
            case 7:
                indexMenu = 0;
                isPaintStackLock = true;
                if (arrItemStackLock == null) {
                    Service.gI().requestItem(7);
                }
                break;
            case 8:
                indexMenu = 0;
                isPaintGrocery = true;
                if (arrItemGrocery == null) {
                    Service.gI().requestItem(8);
                }
                break;
            case 9:
                indexMenu = 0;
                isPaintGroceryLock = true;
                if (arrItemGroceryLock == null) {
                    Service.gI().requestItem(9);
                }
                break;
            case 10:
                indexMenu = 0;
                isPaintUpGrade = true;
                arrItemUpGrade = new Item[18];
                break;
            case 11:
                indexMenu = 0;
                isPaintUpPearl = true;
                gn = true;
                arrItemUpPeal = new Item[24];
                break;
            case 12:
                indexMenu = 0;
                isPaintUpPearl = true;
                gn = false;
                arrItemUpPeal = new Item[24];
                break;
            case 13:
                indexMenu = 0;
                isPaintSplit = true;
                arrItemSplit = new Item[24];
                break;
            case 14:
                isPaintStore = true;
                indexMenu = 0;
                if (arrItemStore == null) {
                    Service.gI().requestItem(14);
                }
                break;
            case 15:
                isPaintStore = true;
                indexMenu = 1;
                if (arrItemBook == null) {
                    Service.gI().requestItem(15);
                }
                break;
            case 16:
                indexMenu = 0;
                isPaintLien = true;
                if (arrItemLien == null) {
                    Service.gI().requestItem(16);
                }
                break;
            case 17:
                indexMenu = 0;
                isPaintNhan = true;
                if (arrItemNhan == null) {
                    Service.gI().requestItem(17);
                }
                break;
            case 18:
                indexMenu = 0;
                isPaintNgocBoi = true;
                if (arrItemNgocBoi == null) {
                    Service.gI().requestItem(18);
                }
                break;
            case 19:
                indexMenu = 0;
                isPaintPhu = true;
                if (arrItemPhu == null) {
                    Service.gI().requestItem(19);
                }
                break;
            case 20:
                indexMenu = 0;
                isPaintNonNam = true;
                if (arrItemNonNam == null) {
                    Service.gI().requestItem(20);
                }
                break;
            case 21:
                indexMenu = 0;
                isPaintNonNu = true;
                if (arrItemNonNu == null) {
                    Service.gI().requestItem(21);
                }
                break;
            case 22:
                indexMenu = 0;
                isPaintAoNam = true;
                if (arrItemAoNam == null) {
                    Service.gI().requestItem(22);
                }
                break;
            case 23:
                indexMenu = 0;
                isPaintAoNu = true;
                if (arrItemAoNu == null) {
                    Service.gI().requestItem(23);
                }
                break;
            case 24:
                indexMenu = 0;
                isPaintGangTayNam = true;
                if (arrItemGangTayNam == null) {
                    Service.gI().requestItem(24);
                }
                break;
            case 25:
                indexMenu = 0;
                isPaintGangTayNu = true;
                if (arrItemGangTayNu == null) {
                    Service.gI().requestItem(25);
                }
                break;
            case 26:
                indexMenu = 0;
                isPaintQuanNam = true;
                if (arrItemQuanNam == null) {
                    Service.gI().requestItem(26);
                }
                break;
            case 27:
                indexMenu = 0;
                isPaintQuanNu = true;
                if (arrItemQuanNu == null) {
                    Service.gI().requestItem(27);
                }
                break;
            case 28:
                indexMenu = 0;
                isPaintGiayNam = true;
                if (arrItemGiayNam == null) {
                    Service.gI().requestItem(28);
                }
                break;
            case 29:
                indexMenu = 0;
                isPaintGiayNu = true;
                if (arrItemGiayNu == null) {
                    Service.gI().requestItem(29);
                }
                break;
            case 31:
                indexMenu = 0;
                isPaintUpGrade = true;
                hw = true;
                arrItemUpGrade = new Item[18];
                break;
            case 32:
                isPaintStore = true;
                indexMenu = 2;
                if (arrItemFashion == null) {
                    Service.gI().requestItem(32);
                }
                break;
            case 33:
                indexMenu = 0;
                isPaintConvert = true;
                arrItemConvert = new Item[3];
                break;
            case 34:
                isPaintStore = true;
                indexMenu = 3;
                if (arrItemClanShop == null) {
                    Service.gI().requestItem(34);
                }
                break;
            case 35:
                isPaintEliteShop = true;
                indexMenu = 0;
                if (arrItemElites == null) {
                    Service.gI().requestItem(35);
                }
                break;
            case 36:
                indexMenu = 0;
                isPaintAuctionSale = true;
                itemSell = null;
                this.iz = new TField();
                this.iz.b(9);
                this.iz.c(1);
                this.iz.c = 100;
                this.iz.d = mScreen.fn + 2;
                break;
            case 37:
                isPaintAuctionBuy = true;
                this.updateCommandForUI();
                break;
            case 38:
                bw = null;
                isPaintLuckySpin = true;
                indexTitle = 1;
                this.updateCommandForUI();
                break;
            case 40:
                isPaintAuto = true;
                indexTitle = 1;
                indexRow = 0;
                this.updateCommandForUI();
                break;
            case 43:
                indexMenu = 0;
                isPaintLuyenThach = true;
                arrItemUpPeal = new Item[24];
                break;
            case 44:
                indexMenu = 0;
                isPaintTinhluyen = true;
                arrItemSplit = new Item[24];
                break;
            case 45:
                indexMenu = 0;
                isPaintDichChuyen = true;
                arrItemSplit = new Item[24];
                break;
            case 46:
                indexMenu = 0;
                isPaintKhamNgoc = true;
                arrItemSplit = new Item[24];
                break;
            case 47:
                indexMenu = 0;
                isPaintGiaoDo = true;
                arrItemUpGrade = new Item[18];
                break;
            case 48:
                indexMenu = 0;
                isPaintGotNgoc = true;
                arrItemSplit = new Item[18];
                break;
            case 49:
                indexMenu = 0;
                isPaintThaoNgoc = true;
                itemSplit = null;
                break;
            case 50:
                indexMenu = 0;
                im = true;
                itemSplit = null;
        }

        setPopupSize(175, 200);
    }

    public static Char e(int var0) {
        for (int var1 = 0; var1 < vCharInMap.size(); ++var1) {
            Char var2;
            if ((var2 = (Char) vCharInMap.elementAt(var1)).charID == var0) {
                return var2;
            }
        }

        return null;
    }

    public static BuNhin f(int var0) {
        return vMob.size() > 0 ? (BuNhin) vMob.elementAt(var0) : null;
    }

    public final void onChatFromMe(String var1, String var2) {
        if (!isPaintMessage || GameCanvas.isTouch) {
            ChatTextField.gI().isShow = false;
        }

        if (!var1.equals("")) {
            if (var2.equals(mResources.or[0])) {
                if (!Class_an.a.a(var1)) {
                    Service.gI().chat(var1);
                    return;
                }
            } else {
                if (var2.equals(mResources.os[0])) {
                    if (vParty.size() == 0) {
                        ChatManager.gI().getCurrentChatTab().addInfo(mResources.mo);
                        return;
                    }

                    Service.gI().chatParty(var1);
                    return;
                }

                if (var2.equals(mResources.ot[0])) {
                    Service.gI().chatGlobal(var1);
                    return;
                }

                if (var2.equals(mResources.ou[0])) {
                    if (Char.getMyChar().cClanName.equals("")) {
                        ChatManager.gI().getCurrentChatTab().addInfo(mResources.mt);
                        return;
                    }

                    Service.gI().chatClan(var1);
                    return;
                }

                ChatManager.gI().addChat(var2, Char.getMyChar().cName, var1);
                Service.gI().chatPrivate(var2, var1);
            }
        }

    }

    public final void onCancelChat() {
        if (isPaintMessage) {
            this.ah();
            isPaintMessage = false;
            ChatTextField.gI().cmdChat = null;
        }

    }

    private void a(int var1, int var2, int var3, int var4, int var5) {
        if (isPaintUpPearl || isPaintLuyenThach || isPaintTinhluyen || isPaintDichChuyen || isPaintSplit || isPaintLuyenNgoc || isPaintUpGrade || isPaintConvert || isPaintAuctionSale || isPaintKhamNgoc || isPaintGiaoDo || isPaintThaoNgoc || im) {
            int var6 = var3 * gi;
            var4 *= gi;
            aq.clear();
            if (GameCanvas.b(var1, var2, var6, var4)) {
                indexTitle = var5;
                if (GameCanvas.n) {
                    if ((var1 = (GameCanvas.r - var1) / gi + (GameCanvas.s - var2) / gi * var3) / nz < oa) {
                        indexSelect = var1;
                    }

                    super.left = super.center = null;
                    if (isPaintLuyenNgoc) {
                        if (indexSelect < 0) {
                            indexSelect = 11;
                        }

                        if (indexSelect > 11) {
                            indexSelect = 11;
                        }
                    }

                    boolean var7 = GameCanvas.o;
                    this.updateCommandForUI();
                }
            }
        }

    }

    public final void b(int var1, Object var2) {
        Member var3;
        String var4;
        NSOT_MOB var5;
        int var6;
        MyVector var7;
        MyVector var8;
        Item var9;
        Npc var10;
        Skill var11;
        Object[] var12;
        MobTemplate var16;
        Npc var18;
        switch (var1) {
            case 1:
                GameCanvas.n();
                return;
            case 2:
                GameCanvas.n();
                super.left = super.center = null;
                this.updateCommandForUI();
                return;
            case 3:
                this.ah();
                return;
            case 222:
                this.hn();
                return;
            case 333:
                this.d((int) 47);
                return;
            case 334:
                this.el();
                return;
            case 335:
                isViewNext = false;
                this.updateItemInfo((int) 3, (Item) itemSplit);
                return;
            case 336:
                isViewNext = false;
                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                return;
            case 337:
                this.ho();
                return;
            case 338:
                this.r(0);
                return;
            case 339:
                this.s(0);
                return;
            case 340:
                this.s(1);
                return;
            case 341:
                hp();
                return;
            case 342:
                hq();
                return;
            case 343:
                this.s(2);
                return;
            case 344:
                this.r(1);
                return;
            case 345:
                this.r(2);
                return;
            case 400:
                this.hs();
                return;
            case 401:
                this.ht();
                return;
            case 402:
                this.hu();
                return;
            case 403:
                hv();
                return;
            case 405:
                hr();
                return;
            case 999:
                this.d((int) 35);
                return;
            case 1000:
                Service.gI().rewardPB();
                this.resetButton();
                return;
            case 1500:
                (var8 = new MyVector()).addElement(new Command1(mResources.bt, 15001));
                if (Char.getMyChar().xu >= 5000) {
                    var8.addElement(new Command1(mResources.by, 15002));
                }

                GameCanvas.menu.startAt(var8);
                return;
            case 1501:
                this.updateItemInfo((int) 3, (Item) itemSell);
                return;
            case 1502:
                this.iz.b();
                return;
            case 1503:
                df();
                return;
            case 1504:
                dd();
                return;
            case 1505:
                this.updateItemInfo((int) 3, (Item) arrItemStands[indexSelect].item);
                return;
            case 1506:
                if (bw != null) {
                    this.ec = 0;
                    isPaintItemInfo = false;
                    an = -1;
                    bw = null;
                    gI().left = new Command1(mResources.dz, 1506);
                    return;
                }

                an = indexSelect;
                Service.gI().selectCard();
                GameCanvas.p();
                return;
            case 1507:
                this.da();
                return;
            case 1508:
                var8 = new MyVector();
                if ((var9 = Char.be.items[indexSelect]) != null) {
                    if (var9.template.id == 281) {
                        var8.addElement(new Command1(mResources.bm, 15081));
                    } else {
                        var8.addElement(new Command1(mResources.mu, 15082));
                    }

                    GameCanvas.menu.startAt(var8);
                    return;
                }
                break;
            case 1509:
                if (indexSelect >= 0 && Char.be != null) {
                    this.updateItemInfo((int) 39, (Item) Char.be.items[indexSelect]);
                    return;
                }

                isPaintItemInfo = false;
                return;
            case 1510:
                cz();
                return;
            case 1511:
                var4 = GameCanvas.inputDlg.tfInput.e();
                GameCanvas.n();

                try {
                    if (var4.equals("")) {
                        GameCanvas.a(mResources.qi);
                        return;
                    }

                    if ((var1 = Integer.parseInt(var4)) > 0 && var1 < 100) {
                        Char.ek = var1;
                        return;
                    }

                    GameCanvas.a(mResources.qi);
                    return;
                } catch (Exception var29) {
                    GameCanvas.a(mResources.qi);
                    return;
                }
            case 1512:
                var4 = GameCanvas.inputDlg.tfInput.e();
                GameCanvas.n();

                try {
                    if (var4.equals("")) {
                        GameCanvas.a(mResources.qi);
                        return;
                    }

                    if ((var1 = Integer.parseInt(var4)) >= 10 && var1 <= 90) {
                        Char.el = var1;
                        return;
                    }

                    GameCanvas.a(mResources.qi);
                    return;
                } catch (Exception var28) {
                    GameCanvas.a(mResources.qi);
                    return;
                }
            case 1515:
                this.updateItemInfo((int) 41, (Item) currentCharViewInfo.arrItemMounts[indexSelect]);
                return;
            case 1516:
                Service.gI().itemMonToBag(indexSelect);
                return;
            case 1600:
                ct();
                return;
            case 1601:
                eh();
                return;
            case 1602:
                var9 = getItemFocus(43);
                this.updateItemInfo((int) 3, (Item) var9);
                return;
            case 1603:
                this.ee();
                return;
            case 1604:
                var8 = new MyVector();
                if (arrItemSplit[indexSelect] != null) {
                    var8.addElement(new Command1(mResources.bt, 1605));
                }

                var8.addElement(new Command1(mResources.fg, 11105));
                GameCanvas.menu.startAt(var8);
                return;
            case 1605:
                this.cy();
                return;
            case 1606:
                this.cx();
                return;
            case 1700:
                this.hj();
                return;
            case 1701:
                hk();
                return;
            case 1702:
                this.hl();
                return;
            case 2000:
                Service.gI().rewardCT();
                this.resetButton();
                return;
            case 2003:
                if (indextabTrangbi == 0) {
                    indextabTrangbi = 16;
                    // this.gg.a = TextGame.si;
                    super.center.caption = "Tbi 1";
                    return;
                }

                indextabTrangbi = 0;
                // this.gg.a = TextGame.sj;
                super.center.caption = "Tbi 2";
                if (!GameCanvas.isTouch) {
                    super.right = new Command1("Đang đăng ký", 11082);
                    return;
                }
                break;
            case 11000:
                bi();
                return;
            case 11001:
                Char.getMyChar().x();
                return;
            case 11002:
                hh();
                return;
            case 11003:
                hg();
                return;
            case 11004:
                this.actView((byte) 25);
                return;
            case 11005:
                he();
                return;
            case 11006:
                hf();
                return;
            case 11007:
                this.actView((byte) 24);
                return;
            case 11008:
                hd();
                return;
            case 11009:
                this.actView((byte) 23);
                return;
            case 11010:
                hc();
                return;
            case 11011:
                this.actView((byte) 22);
                return;
            case 11012:
                hb();
                return;
            case 11013:
                this.actView((byte) 21);
                return;
            case 11014:
                ha();
                return;
            case 11015:
                this.actView((byte) 20);
                return;
            case 11016:
                gz();
                return;
            case 11017:
                this.actView((byte) 15);
                return;
            case 11018:
                gx();
                return;
            case 11019:
                this.actView((byte) 14);
                return;
            case 11020:
                gw();
                return;
            case 11021:
                this.resetButton();
                return;
            case 11022:
                this.gu();
                return;
            case 11023:
                this.gt();
                return;
            case 11024:
                gs();
                return;
            case 11025:
                this.doCloseItemInfo();
                return;
            case 11026:
                gp();
                return;
            case 11027:
                this.go();
                return;
            case 11028:
                this.gn();
                return;
            case 11029:
                this.gm();
                return;
            case 11030:
                this.gl();
                return;
            case 11032:
                this.gk();
                return;
            case 11033:
                this.gj();
                return;
            case 11034:
                this.gh();
                return;
            case 11035:
                this.gg();
                return;
            case 11036:
                cn();
                return;
            case 11037:
                this.gf();
                return;
            case 11038:
                gd();
                return;
            case 11040:
                this.ga();
                return;
            case 11041:
                this.fz();
                return;
            case 11042:
                fw();
                return;
            case 11043:
                fu();
                return;
            case 11044:
                dl();
                return;
            case 11045:
                dr();
                return;
            case 11046:
                dq();
                return;
            case 11047:
                dn();
                return;
            case 11048:
                fq();
                return;
            case 11049:
                cm();
                return;
            case 11050:
                co();
                return;
            case 11051:
                fp();
                return;
            case 11052:
                var9 = (Item) var2;
                Service.gI().useItemChangeMap(var9.indexUI, GameCanvas.menu.menuSelectedItem);
                return;
            case 11053:
                g((Item) var2);
                return;
            case 11054:
                this.fj();
                return;
            case 11055:
                f((Item) var2);
                return;
            case 11057:
                var10 = (Npc) var2;
                Service.gI().getTask(var10.template.npcTemplateId, GameCanvas.menu.menuSelectedItem);
                return;
            case 11058:
                var9 = (Item) var2;
                GameCanvas.n();
                Service.gI().saleItem(var9.indexUI, Integer.parseInt(GameCanvas.inputDlg.tfInput.e()));
                return;
            case 11059:
                this.fi();
                return;
            case 11060:
                this.fh();
                return;
            case 11061:
                d((Item) var2);
                return;
            case 11062:
                cs();
                return;
            case 11063:
                fg();
                return;
            case 11064:
                Service.gI().upPotential(indexTitle - 1, 1);
                this.aj();
                return;
            case 11065:
                this.bb();
                return;
            case 11066:
                this.ah();
                isPaintMessage = false;
                cc = false;
                ChatTextField.gI().cmdChat = null;
                return;
            case 11067:
                if (TileMap.zoneID != indexSelect) {
                    Service.gI().requestChangeZone(indexSelect, this.iv);
                    InfoDlg.showWait();
                    return;
                }

                InfoMe.addInfo(mResources.nl);
                return;
            case 11068:
                var4 = (String) var2;
                this.g(var4);
                return;
            case 11069:
                this.ff();
                return;
            case 11070:
                a((Party) var2);
                return;
            case 11071:
                Service.gI().outParty();
                return;
            case 11072:
                fe();
                return;
            case 11073:
                b(Char.getMyChar().arrItemBag[indexSelect]);
                return;
            case 11074:
                short var13 = Short.parseShort(String.valueOf((var8 = (MyVector) var2).elementAt(0)));
                var4 = String.valueOf(var8.elementAt(1));
                this.a(var13, var4);
                return;
            case 11075:
                this.fd();
                return;
            case 11076:
                var4 = (String) var2;
                Service.gI().addParty(var4);
                return;
            case 11077:
                f((String) var2);
                return;
            case 11078:
                fc();
                return;
            case 11079:
                fa();
                return;
            case 11080:
                d((String) var2);
                return;
            case 11081:
                ey();
                return;
            case 11082:
                ex();
                return;
            case 11083:
                this.actView((byte) 5);
                return;
            case 11084:
                ew();
                return;
            case 11085:
                ev();
                return;
            case 11086:
                this.eu();
                return;
            case 11087:
                var9 = (Item) var2;
                GameCanvas.n();
                Service.gI().splitItem(var9);
                return;
            case 11088:
                this.actView((byte) 26);
                return;
            case 11089:
                this.actView((byte) 27);
                return;
            case 11090:
                this.actView((byte) 28);
                return;
            case 11091:
                this.actView((byte) 29);
                return;
            case 11092:
                c((Item) var2);
                return;
            case 11093:
                this.actView((byte) 2);
                return;
            case 11094:
                this.actView((byte) 6);
                return;
            case 11095:
                this.actView((byte) 7);
                return;
            case 11096:
                this.actView((byte) 8);
                return;
            case 11097:
                this.actView((byte) 9);
                return;
            case 11098:
                this.es();
                return;
            case 11099:
                isViewNext = false;
                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                return;
            case 11100:
                eq();
                return;
            case 11101:
                var9 = getItemFocus(10);
                this.updateItemInfo((int) 3, (Item) var9);
                return;
            case 11102:
                this.el();
                return;
            case 11103:
                this.ek();
                return;
            case 11104:
                this.updateItemInfo((int) 3, (Item) ((Item) var2));
                return;
            case 11105:
                cv();
                return;
            case 11106:
                this.ej();
                return;
            case 11107:
                ei();
                return;
            case 11108:
                this.actView((byte) 3);
                return;
            case 11109:
                this.ef();
                return;
            case 11110:
                var9 = arrItemTradeOrder[indexSelect];
                this.updateItemInfo((int) 30, (Item) var9);
                return;
            case 11111:
                var9 = getItemFocus(4);
                this.updateItemInfo((int) 4, (Item) var9);
                return;
            case 11112:
                Service.gI().boxSort();
                return;
            case 11113:
                Service.gI().itemBagToBox(Char.getMyChar().arrItemBag[indexSelect].indexUI);
                return;
            case 11114:
                this.updateItemInfo((int) 3, (Item) Char.getMyChar().arrItemBag[indexSelect]);
                return;
            case 11115:
                ed();
                return;
            case 11116:
                ec();
                return;
            case 11120:
                var11 = (Skill) (var12 = (Object[]) var2)[0];
                var1 = Integer.parseInt((String) var12[1]);
                onScreenSkill[var1] = var11;
                saveOnScreenSkillToRMS();
                return;
            case 11121:
                var11 = (Skill) (var12 = (Object[]) var2)[0];
                var1 = Integer.parseInt((String) var12[1]);
                keySkill[var1] = var11;
                saveKeySkillToRMS();
                return;
            case 12000:
                this.fo();
                return;
            case 12001:
                ChatManager.gI().switchToTab(((Integer) var2).intValue());
                this.fm();
                return;
            case 12002:
            case 12004:
                var4 = (String) var2;
                ChatTab var14;
                if ((var14 = ChatManager.gI().findTab(var4)) == null) {
                    ChatManager.gI().addNewTab(var4);
                    ChatManager.gI().switchToLastTab();
                } else {
                    ChatManager.gI().switchToTab(var14);
                }

                this.fm();
                isPaintFindTeam = false;
                isPaintClan = false;
                isPaintEnemies = false;
                isPaintFriend = false;
                isPaintTeam = false;
                ChatTextField.gI().cmdChat = null;
                return;
            case 12003:
                this.bn();
                return;
            case 12005:
                fn();
                return;
            case 12006:
                fk();
                return;
            case 12007:
                this.or = 1;
                this.os = "";
                this.di();
                return;
            case 12008:
                dh();
                return;
            case 12009:
                var4 = (String) var2;
                (var8 = new MyVector()).addElement(new Command1(mResources.nk[7], 12002, var4));
                var8.addElement(new Command1(mResources.og[2], 110803, var4));
                if (isPaintTeam) {
                    var8.addElement(new Command1(mResources.nk[6], 110804));
                }

                if (isPaintMessage) {
                    var8.addElement(new Command1(mResources.al, 14020, var4));
                    var8.addElement(new Command1(mResources.nk[6], 1108041, var4));
                }

                GameCanvas.menu.startAt(var8);
                return;
            case 13001:
                this.actView((byte) 32);
                return;
            case 13002:
                gy();
                return;
            case 14001:
                ez();
                return;
            case 14002:
                this.dy();
                return;
            case 14003:
                this.dz();
                return;
            case 14004:
                dp();
                return;
            case 14005:
                du();
                return;
            case 14006:
                c((String) var2);
                return;
            case 14007:
                dj();
                return;
            case 14008:
                GameCanvas.a(mResources.ko, new Command1(mResources.br, 140081), new Command1(mResources.ce, 1));
                return;
            case 14009:
                ds();
                return;
            case 14010:
                GameCanvas.inputDlg.a(mResources.pr, new Command1(mResources.dm, GameCanvas.instance, 88833, (Object) null), 1);
                return;
            case 14011:
                cc = false;
                return;
            case 14012:
                this.em();
                return;
            case 14013:
                this.er();
                return;
            case 14014:
                this.gi();
                return;
            case 14015:
                this.eo();
                return;
            case 14016:
                this.updateItemInfo((int) 3, (Item) arrItemConvert[indexSelect]);
                return;
            case 14017:
                dk();
                return;
            case 14018:
                this.actView((byte) 34);
                return;
            case 14019:
                dg();
                return;
            case 14020:
                if (dv()) {
                    var4 = (String) var2;
                    Service.gI().textBoxId((short) 1, (String) var4);
                    return;
                }

                GameCanvas.a(mResources.pe);
                return;
            case 14021:
                fb();
                return;
            case 14022:
                gv();
                return;
            case 14023:
                this.actView((byte) 35);
                return;
            case 14024:
                this.a((byte) 1);
                return;
            case 14025:
                this.a((byte) 0);
                return;
            case 15001:
                this.de();
                return;
            case 15002:
                try {
                    if ((var1 = Integer.parseInt(this.iz.e())) <= 0) {
                        GameCanvas.a(mResources.qi);
                    }

                    GameCanvas.a(mResources.b(mResources.qq, NinjaUtil.numberToString(String.valueOf(var1))), new Command1(mResources.br, 150021), new Command1(mResources.ce, 1));
                    return;
                } catch (Exception var27) {
                    GameCanvas.a(mResources.qi);
                    return;
                }
            case 15041:
                dc();
                return;
            case 15042:
                GameCanvas.a(mResources.b(mResources.qr, NinjaUtil.numberToString(String.valueOf(arrItemStands[indexSelect].price))), new Command1(mResources.br, 150421), new Command1(mResources.ce, 1));
                return;
            case 15081:
                Service.gI().useClanItem();
                return;
            case 15082:
                GameCanvas.inputDlg.a(mResources.rg, new Command1(mResources.ch, GameCanvas.instance, 88843, new Integer(indexSelect)), 0);
                return;
            case 15130:
                Char.em = 1;
                return;
            case 15131:
                Char.em = 10;
                return;
            case 15132:
                Char.em = 20;
                return;
            case 15133:
                Char.em = 30;
                return;
            case 15134:
                Char.em = 40;
                return;
            case 15135:
                Char.em = 50;
                return;
            case 15136:
                Char.em = 60;
                return;
            case 15137:
                Char.em = 70;
                return;
            case 15140:
                Char.eq = 1;
                return;
            case 15141:
                Char.eq = 10;
                return;
            case 15142:
                Char.eq = 20;
                return;
            case 15143:
                Char.eq = 30;
                return;
            case 15144:
                Char.eq = 40;
                return;
            case 15145:
                Char.eq = 50;
                return;
            case 15146:
                Char.eq = 60;
                return;
            case 15147:
                Char.eq = 70;
                return;
            case 15150:
                Char.en = 1;
                return;
            case 15151:
                Char.en = 10;
                return;
            case 15153:
                Char.en = 30;
                return;
            case 15155:
                Char.en = 50;
                return;
            case 15157:
                Char.en = 70;
                return;
            case 15161:
                Char.eo = 1;
                return;
            case 15162:
                Char.eo = 2;
                return;
            case 15163:
                Char.eo = 3;
                return;
            case 15164:
                Char.eo = 4;
                return;
            case 15165:
                Char.eo = 5;
                return;
            case 15166:
                Char.eo = 6;
                return;
            case 15167:
                Char.eo = 7;
                return;
            case 15174:
                Char.ep = 4;
                return;
            case 15175:
                Char.ep = 5;
                return;
            case 15176:
                Char.ep = 6;
                return;
            case 15177:
                Char.ep = 7;
                return;
            case 15178:
                Char.ep = 8;
                return;
            case 15179:
                Char.ep = 9;
                return;
            case 110001:
                this.bf();
                return;
            case 110002:
                bp();
                return;
            case 110003:
                bh();
                return;
            case 110004:
                gc();
                return;
            case 110005:
                this.d((int) 14);
                return;
            case 110006:
                fy();
                return;
            case 110007:
                this.d((int) 7);
                return;
            case 110008:
                this.d((int) 6);
                return;
            case 110009:
                this.d((int) 9);
                return;
            case 110010:
                this.d((int) 8);
                return;
            case 110011:
                this.d((int) 10);
                return;
            case 110012:
                this.d((int) 11);
                return;
            case 110013:
                this.d((int) 12);
                return;
            case 110014:
                if ((var10 = i(5)) != null && (Math.abs(var10.cx - Char.getMyChar().cx) > 22 || Math.abs(var10.cy - Char.getMyChar().cy) > 22)) {
                    Char.b(var10.cx, var10.cy);
                }

                this.d((int) 4);
                return;
            case 110015:
                this.d((int) 13);
                return;
            case 110016:
                if ((var10 = i(13)) != null && var10.statusMe != 15) {
                    if (Math.abs(var10.cx - Char.getMyChar().cx) > 22 || Math.abs(var10.cy - Char.getMyChar().cy) > 22) {
                        Char.b(var10.cx, var10.cy);
                    }

                    Service.gI().openUIZone();
                    return;
                }

                if ((var1 = Char.g(37)) < 0) {
                    var1 = Char.g(35);
                }

                if (var1 >= 0) {
                    this.iv = var1;
                    Service.gI().openUIZone();
                }

                return;
            case 110017:
                this.u();
                return;
            case 110018:
                fl();
                return;
            case 110019:
                this.ea();
                return;
            case 110020:
                var5 = NSOT_MOB.mod_nst;
                NSOT_MOB.o();
                return;
            case 110021:
                bg();
                return;
            case 110051:
                b((byte) 25);
                return;
            case 110052:
                c((byte) 25);
                return;
            case 110081:
                b((byte) 24);
                return;
            case 110082:
                c((byte) 24);
                return;
            case 110101:
                b((byte) 23);
                return;
            case 110102:
                c((byte) 23);
                return;
            case 110121:
                b((byte) 22);
                return;
            case 110122:
                c((byte) 22);
                return;
            case 110141:
                b((byte) 21);
                return;
            case 110142:
                c((byte) 21);
                return;
            case 110161:
                b((byte) 20);
                return;
            case 110162:
                c((byte) 20);
                return;
            case 110181:
                b((byte) 15);
                return;
            case 110182:
                c((byte) 15);
                return;
            case 110201:
                b((byte) 14);
                return;
            case 110202:
                c((byte) 14);
                return;
            case 110221:
                ge();
                return;
            case 110244:
                gr();
                return;
            case 110261:
                gq();
                return;
            case 110262:
                if ((var9 = getItemFocus(3)) != null) {
                    NSOT_MOB.b((int) var9.template.id);
                }

                return;
            case 110263:
                if ((var9 = getItemFocus(3)) != null) {
                    NSOT_MOB.c(var9.template.id);
                }

                return;
            case 110264:
                if ((var9 = getItemFocus(3)) != null) {
                    NSOT_MOB.a(var9);
                }

                return;
            case 110265:
                if ((var9 = getItemFocus(3)) != null) {
                    NSOT_MOB.b(var9);
                }

                return;
            case 110266:
                return;
            case 110267:
                if ((var9 = getItemFocus(3)) != null) {
                    NSOT_MOB.d(var9.template.id);
                }

                return;
            case 110268:
                if ((var9 = getItemFocus(3)) != null) {
                    var6 = 5000;

                    try {
                        var6 = Integer.parseInt(GameCanvas.inputDlg.tfInput.e());
                    } catch (Exception var26) {
                    }

                    if (var6 < 5000) {
                        addChatPopup("Giá > 5000k");
                    } else {
                        NSOT_MOB.b(var9.template.id, var6);
                    }
                }

                GameCanvas.n();
                return;
            case 110361:
                this.fv();
                return;
            case 110382:
                Service.gI().returnTownFromDead();
                return;
            case 110383:
                Service.gI().wakeUpFromDead();
                return;
            case 110391:
                this.q(1);
                return;
            case 110392:
                this.q(2);
                return;
            case 110393:
                this.q(3);
                return;
            case 110394:
                this.q(4);
                return;
            case 110395:
                this.q(5);
                return;
            case 110396:
                this.q(6);
                return;
            case 110397:
                this.q(7);
                return;
            case 110398:
                this.q(8);
                return;
            case 110399:
                this.q(9);
                return;
            case 110441:
                this.bd();
                return;
            case 110451:
                ft();
                return;
            case 110452:
                fs();
                return;
            case 110471:
                fr();
                return;
            case 110531:
                var9 = (Item) var2;
                Service.gI().useItemChangeMap(var9.indexUI, GameCanvas.menu.menuSelectedItem + 3);
                return;
            case 110561:
                GameCanvas.n();
                this.updateCommandForUI();
                return;
            case 110562:
                e((Item) var2);
                return;
            case 110701:
                Service.gI().outParty();
                return;
            case 110702:
                Service.gI().lockParty(true);
                return;
            case 110703:
                Service.gI().lockParty(false);
                return;
            case 110721:
                Service.gI().saleItem(indexSelect, 1);
                return;
            case 110722:
                b(Char.getMyChar().arrItemBag[indexSelect]);
                return;
            case 110723:
                Service.gI().saleItem(indexSelect, Char.getMyChar().arrItemBag[indexSelect].quantity);
                return;
            case 110771:
                var4 = (String) var2;
                GameCanvas.n();
                Service.gI().removeFriend(var4);
                return;
            case 110791:
                var4 = (String) var2;
                Service.gI().addParty(var4);
                return;
            case 110792:
                e((String) var2);
                return;
            case 110801:
                Service.gI().moveMember(indexRow);
                return;
            case 110802:
                Service.gI().changeTeamLeader(indexRow);
                return;
            case 110803:
                var4 = (String) var2;
                Service.gI().addFriend(var4);
                return;
            case 110804:
                eb();
                return;
            case 110805:
                dt();
                return;
            case 110811:
                doSetKeySkill(Char.getMyChar().nClass.c[indexSelect]);
                return;
            case 110812:
                doSetOnScreenSkill(Char.getMyChar().nClass.c[indexSelect]);
                return;
            case 110821:
                Service.gI().itemBodyToBag(indexSelect + indextabTrangbi);
                return;
            case 110841:
                Service.gI().upPotential(indexTitle - 1, 1);
                this.aj();
                return;
            case 110842:
                this.bb();
                return;
            case 110851:
                var9 = (Item) var2;
                Service.gI().buyItem(var9.typeUI, var9.indexUI, 1);
                return;
            case 110852:
                a((Item) var2);
                return;
            case 110854:
                et();
                return;
            case 110921:
                var9 = (Item) var2;
                Service.gI().buyItem(var9.typeUI, var9.indexUI, 1);
                return;
            case 110922:
                a((Item) var2);
                return;
            case 110923:
                this.actView((byte) 16);
                return;
            case 110924:
                this.actView((byte) 17);
                return;
            case 110925:
                this.actView((byte) 18);
                return;
            case 110926:
                this.actView((byte) 19);
                return;
            case 110981:
                cu();
                return;
            case 110991:
                isViewNext = true;
                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                return;
            case 111001:
                this.ep();
                return;
            case 111031:
                if (isPaintTinhluyen) {
                    Service.gI().tinhluyen(itemSplit, arrItemSplit);
                    return;
                }

                if (isPaintDichChuyen) {
                    Service.gI().dichchuyen(itemSplit, arrItemSplit);
                    return;
                }

                if (isPaintKhamNgoc) {
                    Service.gI().ngockham((byte) 1, (Item) null, itemSplit, arrItemSplit);
                    return;
                }

                if (isPaintThaoNgoc) {
                    Service.gI().ngockham((byte) 2, (Item) null, itemSplit, (Item[]) null);
                    return;
                }

                if (im) {
                    Service.gI().ngockham((byte) 3, (Item) null, itemSplit, (Item[]) null);
                    return;
                }
                break;
            case 111071:
                this.eg();
                return;
            case 111101:
                var9 = getItemFocus(4);
                Service.gI().itemBoxToBag(var9.indexUI);
                return;
            case 120051:
                ChatTab var15 = (ChatTab) var2;
                ChatManager.gI().chatTabs.removeElement(var15);
                if (ChatManager.gI().currentTabIndex > ChatManager.gI().chatTabs.size() - 1) {
                    ChatManager.gI().switchToPreviousTab();
                }

                if (ChatManager.gI().getCurrentChatTab() != null) {
                    this.fm();
                    return;
                }

                ChatTextField.gI().isShow = false;
                this.resetButton();
                return;
            case 120061:
                ChatManager.c = !ChatManager.c;
                GameCanvas.a(mResources.ov + (ChatManager.c ? mResources.az : mResources.ba));
                return;
            case 120062:
                ChatManager.d = !ChatManager.d;
                GameCanvas.a(mResources.ow + (ChatManager.d ? mResources.az : mResources.ba));
                return;
            case 120071:
                this.or = 2;
                if (GameCanvas.input2Dlg.tfInput.e().equals("")) {
                    GameCanvas.a(mResources.jz);
                    return;
                }

                if (GameCanvas.input2Dlg.tfInput2.e().equals("")) {
                    GameCanvas.a(mResources.ka);
                    return;
                }

                this.os = "Loại thẻ: " + GameCanvas.input2Dlg.tfInput.e();
                this.os = this.os + ", Mệnh giá: " + GameCanvas.input2Dlg.tfInput2.e();
                GameCanvas.n();
                this.di();
                return;
            case 120072:
                if (GameCanvas.input2Dlg.tfInput.e().equals("")) {
                    GameCanvas.a(mResources.kb);
                    return;
                }

                if (GameCanvas.input2Dlg.tfInput2.e().equals("")) {
                    GameCanvas.a(mResources.kc);
                    return;
                }

                this.os = this.os + ", Số seri: " + GameCanvas.input2Dlg.tfInput.e();
                this.os = this.os + ", Khoảng thời gian nạp: " + GameCanvas.input2Dlg.tfInput2.e();
                Service.gI().adminChat(this.os);
                GameCanvas.n();
                return;
            case 120081:
                GameCanvas.inputDlg.tfInput.b(11);
                GameCanvas.inputDlg.a(mResources.ph, new Command1("OK", (IActionListener) null, 120082, (Object) null), 1);
                return;
            case 120082:
                if ((var4 = GameCanvas.inputDlg.tfInput.e()).equals("")) {
                    GameCanvas.a(mResources.pi);
                    return;
                }

                Service.gI().adminChat("Số điện thoại đăng ký: " + var4);
                GameCanvas.n();
                return;
            case 130011:
                var10 = (Npc) var2;
                Service.gI().getTask(var10.template.npcTemplateId, 0);
                var10.chatPopup = null;
                this.resetButton();
                return;
            case 130012:
                ((Npc) var2).chatPopup = null;
                this.resetButton();
                return;
            case 130021:
                b((byte) 32);
                return;
            case 130022:
                c((byte) 32);
                return;
            case 140011:
                Service.gI().upSkill(Char.getMyChar().nClass.c[indexSelect].id, 1);
                this.aj();
                return;
            case 140012:
                this.bc();
                return;
            case 140041:
                GameCanvas.inputDlg.tfInput.b(180);
                GameCanvas.inputDlg.a(mResources.pp, new Command1(mResources.dm, GameCanvas.instance, 88832, (Object) null), 0);
                return;
            case 140042:
                Service.gI().clanUpLevel();
                return;
            case 140043:
                GameCanvas.inputDlg.a(mResources.pq, new Command1(mResources.dm, GameCanvas.instance, 88834, (Object) null), 0);
                return;
            case 140044:
                Service.gI().unlockClanItem();
                return;
            case 140071:
                indexRow = 0;
                indexSelect = 0;
                aq.clear();
                gp = !gp;
                y();
                return;
            case 140072:
                indexRow = 0;
                indexSelect = 0;
                aq.clear();
                gq = !gq;
                y();
                return;
            case 140081:
                Service.gI().outClan();
                GameCanvas.n();
                return;
            case 140091:
                Service.gI().changeClanType(((Member) vClan.elementAt(indexRow)).name, 3);
                return;
            case 140092:
                Service.gI().changeClanType(((Member) vClan.elementAt(indexRow)).name, 2);
                return;
            case 140093:
                GameCanvas.a(mResources.km, new Command1(mResources.br, 1400931), new Command1(mResources.ce, 1));
                return;
            case 140094:
                GameCanvas.a(mResources.kn, new Command1(mResources.br, 1400941), new Command1(mResources.ce, 1));
                return;
            case 140095:
                var3 = (Member) vClan.elementAt(indexRow);
                Service.gI().inviteClanDun(var3.name);
                return;
            case 140096:
                (var8 = new MyVector()).addElement(new Command1(mResources.rd, 1400961));
                var8.addElement(new Command1(mResources.re, 1400962));
                GameCanvas.menu.startAt(var8);
                return;
            case 140101:
                (var9 = new Item()).template = ItemTemplates.get((short) 0);
                var9.expires = -1L;
                this.updateItemInfo((int) 39, (Item) var9);
                return;
            case 140131:
                GameCanvas.a(mResources.mb, new Command1(mResources.br, 140132), new Command1(mResources.ce, 1));
                return;
            case 140132:
                doa();
                return;
            case 140151:
                this.en();
                return;
            case 140161:
                this.updateItemInfo((int) 3, (Item) arrItemConvert[2]);
                return;
            case 140191:
                b((byte) 34);
                return;
            case 140192:
                c((byte) 34);
                return;
            case 140221:
                b((byte) 35);
                return;
            case 140222:
                c((byte) 35);
                return;
            case 150021:
                GameCanvas.o();
                var1 = 0;

                try {
                    var1 = Integer.parseInt(this.iz.e());
                } catch (Exception var25) {
                }

                Service.gI().sendToSaleItem(itemSell, var1);
                return;
            case 150411:
                this.it = 0;
                this.iu = 0;
                if (this.is == 0) {
                    this.is = 1;
                } else if (this.is == 1) {
                    this.is = 2;
                } else if (this.is == 2) {
                    this.is = 1;
                }

                this.db();
                return;
            case 150412:
                this.it = 0;
                this.is = 0;
                if (this.iu == 0) {
                    this.iu = 1;
                } else if (this.iu == 1) {
                    this.iu = 2;
                } else if (this.iu == 2) {
                    this.iu = 1;
                }

                this.db();
                return;
            case 150413:
                this.is = 0;
                this.iu = 0;
                if (this.it == 0) {
                    this.it = 1;
                } else if (this.it == 1) {
                    this.it = 2;
                } else if (this.it == 2) {
                    this.it = 1;
                }

                this.db();
                return;
            case 150421:
                GameCanvas.n();
                Service.gI().buyItemAuction(arrItemStands[indexSelect].item.c);
                return;
            case 151301:
                Service.gI().sendCatkeo(Char.getMyChar().mobFocus.d().mobTemplateId);
                return;
            case 151710:
                Char.ep = 10;
                return;
            case 151711:
                Char.ep = 11;
                return;
            case 151712:
                Char.ep = 12;
                return;
            case 909090:
                this.d((int) 38);
                return;
            case 1100011:
                this.doBag();
                return;
            case 1100012:
                this.doskill();
                return;
            case 1100013:
                this.doTiemnangMe();
                return;
            case 1100014:
                this.doInfo();
                return;
            case 1100015:
                this.doTrangbi();
                return;
            case 1100016:
                this.doThucuoi();
                return;
            case 1100032:
                this.bj();
                return;
            case 1100033:
                dx();
                return;
            case 1100034:
                hi();
                return;
            case 1100041:
                gb();
                return;
            case 1100061:
                this.bk();
                return;
            case 1100062:
                this.bm();
                return;
            case 1100063:
                this.bn();
                return;
            case 1100064:
                this.bo();
                return;
            case 1100065:
                fx();
                return;
            case 1100067:
                dm();
                return;
            case 1100068:
                this.d((int) 40);
                return;
            case 1100069:
                (var7 = new MyVector()).addElement(new Command1("Tàn sát all", 1100070, (Object) null));

                for (var6 = 0; var6 < qg.size(); ++var6) {
                    var16 = (MobTemplate) qg.elementAt(var6);
                    var7.addElement(new Command1(var16.name, 1100070, var16));
                }

                GameCanvas.menu.startAt(var7);
                return;
            case 1100070:
                var16 = (MobTemplate) var2;
                NSOT_MOB.mod_nst.a(var16 != null ? var16.mobTemplateId : -1, TileMap.mapID);
                return;
            case 1100071:
                MyVector var17 = new MyVector();
                var7 = new MyVector();

                for (var6 = 0; var6 < vSet.size(); ++var6) {
                    var18 = (Npc) vSet.elementAt(var6);
                    if (!var7.contains(var18.template)) {
                        var7.addElement(var18.template);
                        var17.addElement(new Command1(var18.template.name, 1100072, var18));
                    }
                }

                GameCanvas.menu.startAt(var17);
                return;
            case 1100072:
                if ((var18 = (Npc) var2) != null) {
                    if (Math.abs(var18.cx - Char.getMyChar().cx) > 22) {
                        Char.b(var18.cx, var18.cy);
                    }

                    Service.gI().openMenu(var18.template.npcTemplateId);
                }

                return;
            case 1100073:
                var5 = NSOT_MOB.mod_nst;
                NSOT_MOB.g();
                return;
            case 1100074:
                NSOT_MOB.mod_nst.e();
                return;
            case 1100075:
                NSOT_MOB.mod_nst.f();
                return;
            case 1100076:
                super.right = this.mu;
                indexMenu = 0;
                isPaintTrade = true;
                setPopupSize(175, 200);
                return;
            case 1100077:
                NSOT_MOB.b(NSOT_MOB.f[indexSelect]);
                return;
            case 1100078:
                NSOT_MOB.n();
                return;
            case 1100079:
                NSOT_MOB.a(Char.getMyChar().arrItemBag[indexSelect].template.id);
                return;
            case 1100080:
                NSOT_MOB.k = !NSOT_MOB.k;
                return;
            case 1100081:
                GameCanvas.inputDlg.a("KC Nhặt", new Command1("Đặt", 1100085), 1);
                GameCanvas.inputDlg.tfInput.a(String.valueOf(NSOT_MOB.g));
                return;
            case 1100082:
                GameCanvas.inputDlg.a("KC Tàn sát", new Command1("Đặt", 1100086), 1);
                GameCanvas.inputDlg.tfInput.a(String.valueOf(NSOT_MOB.h));
                return;
            case 1100083:
                NSOT_MOB.l = !NSOT_MOB.l;
                return;
            case 1100084:
                NSOT_MOB.s = !NSOT_MOB.s;
                return;
            case 1100085:
                try {
                    NSOT_MOB.g = Integer.parseInt(GameCanvas.inputDlg.tfInput.e());
                } catch (Exception var24) {
                }

                GameCanvas.n();
                return;
            case 1100086:
                try {
                    NSOT_MOB.h = Integer.parseInt(GameCanvas.inputDlg.tfInput.e());
                } catch (Exception var23) {
                }

                GameCanvas.n();
                return;
            case 1100087:
                GameCanvas.inputDlg.a("Độ Trễ", new Command1("Đặt", 1100088), 1);
                GameCanvas.inputDlg.tfInput.a(String.valueOf(NSOT_MOB.t));
                return;
            case 1100088:
                var1 = NSOT_MOB.t;

                try {
                    var1 = Integer.parseInt(GameCanvas.inputDlg.tfInput.e());
                } catch (Exception var22) {
                }

                if (var1 >= 0 && var1 < 100) {
                    NSOT_MOB.t = var1;
                } else {
                    addChatPopup("Tốc độ game từ 0 đến 99");
                }

                GameCanvas.n();
                return;
            case 1100089:
                if (NSOT_MOB.p = !NSOT_MOB.p) {
                    GameCanvas.inputDlg.a("Khu-Mỗi khu cách nhau bằng dấu cách", new Command1("Đặt", 1100090), 0);
                    GameCanvas.inputDlg.tfInput.a(NSOT_MOB.m());
                }

                return;
            case 1100090:
                NSOT_MOB.d(GameCanvas.inputDlg.tfInput.e());
                GameCanvas.n();
                return;
            case 1100181:
                GameCanvas.a(mResources.k, new Command1(mResources.sq, 1100182), new Command1(mResources.ce, GameCanvas.instance, 8882, (Object) null));
                return;
            case 1100182:
                GameCanvas.currentDialog = null;
                GameCanvas.loginScr.b();
                return;
            case 1103991:
                this.q(10);
                return;
            case 1107921:
                var4 = (String) var2;
                GameCanvas.n();
                Service.gI().removeFriend(var4);
                a(var4);
                return;
            case 1107931:
                var4 = (String) var2;
                Service.gI().addFriend(var4);
                return;
            case 1107932:
                a((String) var2);
                return;
            case 1108041:
                var4 = (String) var2;
                Service.gI().viewInfo(var4);
                gI().resetButton();
                return;
            case 1400931:
                Service.gI().changeClanType(((Member) vClan.elementAt(indexRow)).name, 0);
                GameCanvas.n();
                return;
            case 1400941:
                Service.gI().moveOutClan(((Member) vClan.elementAt(indexRow)).name);
                GameCanvas.n();
                return;
            case 1400961:
                var3 = (Member) vClan.elementAt(indexRow);
                Service.gI().inviteClanBattlefield(var3.name);
                return;
            case 1400962:
                Service.gI().inviteClanBattlefieldAll();
                return;
            case 11000601:
                this.d((int) 36);
                return;
            case 11000602:
                this.d((int) 43);
                return;
            case 11000603:
                this.d((int) 44);
                return;
            case 11000604:
                this.d((int) 45);
                return;
            case 11000651:
                p(1);
                return;
            case 11000652:
                p(2);
                return;
            case 11000653:
                p(3);
                return;
            case 11000661:
                indexMenu = 0;
                this.dw();
                return;
            case 11000662:
                indexMenu = 1;
                this.dw();
                Service.gI().requestClanMember();
                return;
            case 11000663:
                indexMenu = 2;
                this.dw();
                Service.gI().requestClanItem();
                return;
            case 11000664:
                indexMenu = 3;
                this.dw();
                Service.gI().requestClanLog();
                return;
            case 11000665:
                if (cb = !cb) {
                    mResources.a(Char.getMyChar().cName + "vci", 1);
                    return;
                }

                mResources.a(Char.getMyChar().cName + "vci", 0);
                return;
            case 11000666:
                indexMenu = 4;
                this.dw();
                Service.gI().requestClanItem();
                return;
            case 11000671:
                GameCanvas.a(mResources.pf, 88836, (Object) null, 8882, (Object) null);
                return;
            case 11000672:
                GameCanvas.inputDlg.tfInput.b(6);
                GameCanvas.inputDlg.a(mResources.pg, new Command1(mResources.dm, GameCanvas.instance, 88837, (Object) null), 1);
                return;
            case 11000673:
                GameCanvas.input2Dlg.a(mResources.pm, mResources.pn);
                GameCanvas.input2Dlg.tfInput.b(6);
                GameCanvas.input2Dlg.tfInput2.b(6);
                GameCanvas.input2Dlg.a(mResources.pg, new Command1(mResources.aq, GameCanvas.instance, 8882, (Object) null), new Command1(mResources.dm, GameCanvas.instance, 88838, (Object) null), 1, 1);
                return;
            case 11000674:
                GameCanvas.inputDlg.tfInput.b(6);
                GameCanvas.inputDlg.a(mResources.pg, new Command1(mResources.dm, GameCanvas.instance, 88839, (Object) null), 1);
                return;
            case 11000877:
                GameCanvas.inputDlg.a("TĐ next map", new Command1("Đặt", 110008778), 1);
                GameCanvas.inputDlg.tfInput.a(String.valueOf(NSOT_MOB.u));
                return;
            case 110008778:
                int var19 = NSOT_MOB.u;

                try {
                    var19 = Integer.parseInt(GameCanvas.inputDlg.tfInput.e());
                } catch (Exception var21) {
                }

                if (var19 > 0 && var19 <= 100) {
                    NSOT_MOB.u = var19;
                } else {
                    addChatPopup("Tốc độ next map từ 1 đến 99");
                }

                GameCanvas.n();
                return;
        }

    }

    private void cx() {
        try {
            if (Char.getMyChar().arrItemBag[indexSelect].template.id == 454) {
                if (arrItemSplit == null) {
                    arrItemSplit = new Item[24];
                }

                for (int var1 = 0; var1 < arrItemSplit.length; ++var1) {
                    if (var1 == 20) {
                        GameCanvas.a(mResources.jw);
                        return;
                    }

                    if (arrItemSplit[var1] == null) {
                        arrItemSplit[var1] = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        super.left = super.center = null;
                        this.updateCommandForUI();
                        return;
                    }
                }
            } else if (Char.getMyChar().arrItemBag[indexSelect].upgrade > 11) {
                if (itemSplit == null) {
                    itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                } else {
                    Item var3 = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                    itemSplit = var3;
                }

                Service.gI().requestItemInfo(itemSplit.typeUI, itemSplit.indexUI);
            } else {
                GameCanvas.a(mResources.sd);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    private void cy() {
        Item var1 = getItemFocus(44);
        arrItemSplit[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void cz() {
        switch (indexRow) {
            case 0:
                Char.timeStartBlink = !Char.timeStartBlink;
                if (dz == 1) {
                    Char.timeStartBlink = false;
                    InfoMe.addInfo(mResources.rp, 20, mFont.tahoma_7_yellow);
                }

                return;
            case 1:
                Char.isAHP = !Char.isAHP;
                if (dz == 1) {
                    Char.isAHP = false;
                    InfoMe.addInfo(mResources.rp, 20, mFont.tahoma_7_yellow);
                }

                return;
            case 2:
                Char.isAMP = !Char.isAMP;
                if (dz == 1) {
                    Char.isAMP = false;
                    InfoMe.addInfo(mResources.rp, 20, mFont.tahoma_7_yellow);
                }

                return;
            case 3:
                Char.isAFood = !Char.isAFood;
                return;
            case 4:
                Char.isABuff = !Char.isABuff;
                return;
            case 5:
                Char.isAResuscitate = !Char.isAResuscitate;
                return;
            case 6:
                Char.isAPickYen = !Char.isAPickYen;
                return;
            case 7:
                if (Char.isAPickYHM = !Char.isAPickYHM) {
                    Char.dt = false;
                }

                return;
            case 8:
                if (Char.isAPickYHMS = !Char.isAPickYHMS) {
                    Char.dt = false;
                }

                return;
            case 9:
                if (Char.dm = !Char.dm) {
                    Char.dt = false;
                }

                return;
            case 10:
                Char.dn = !Char.dn;
                return;
            case 11:
                if (Char.doa = !Char.doa) {
                    Char.dt = false;
                }

                return;
            case 12:
                if (Char.dp = !Char.dp) {
                    Char.dt = false;
                }

                return;
            case 13:
                if (Char.dq = !Char.dq) {
                    Char.dt = false;
                }

                return;
            case 14:
                if (Char.dr = !Char.dr) {
                    Char.dt = false;
                }

                return;
            case 15:
                if (Char.ds = !Char.ds) {
                    Char.dt = false;
                }

                return;
            case 16:
                if (Char.dt = !Char.dt) {
                    Char.dm = false;
                    Char.isAPickYHMS = false;
                    Char.isAPickYHM = false;
                    Char.doa = false;
                    Char.dp = false;
                    Char.dq = false;
                    Char.dr = false;
                    Char.ds = false;
                }

                return;
            case 17:
                Char.du = !Char.du;
                return;
            case 18:
                Char.dv = !Char.dv;
                return;
            case 19:
                Char.dw = !Char.dw;
                return;
            case 20:
                Char.dx = !Char.dx;
                return;
            case 21:
                Char.dy = !Char.dy;
                return;
            case 22:
                Char.dz = !Char.dz;
                return;
            case 23:
                Char.ea = !Char.ea;
                return;
            case 24:
                Char.eb = !Char.eb;
                return;
            case 25:
                Char.ec = !Char.ec;
                return;
            case 26:
                Char.ed = !Char.ed;
                return;
            case 27:
                Char.ee = !Char.ee;
                return;
            case 28:
                Char.ef = !Char.ef;
                return;
            case 29:
                Char.eg = !Char.eg;
                return;
            case 30:
                Char.eh = !Char.eh;
                return;
            default:
        }
    }

    private void da() {
        if (bw != null) {
            Item var1;
            (var1 = new Item()).template = ItemTemplates.get(bw[indexSelect]);
            this.updateItemInfo((int) 38, (Item) var1);
        }

    }

    private void db() {
        if (this.it != 0 || this.is != 0 || this.iu != 0) {
            for (int var1 = 0; var1 < arrItemStands.length - 1; ++var1) {
                for (int var2 = var1 + 1; var2 < arrItemStands.length; ++var2) {
                    ItemStands var3;
                    if (this.is == 1) {
                        if (arrItemStands[var1].price < arrItemStands[var2].price) {
                            var3 = arrItemStands[var1];
                            arrItemStands[var1] = arrItemStands[var2];
                            arrItemStands[var2] = var3;
                        }
                    } else if (this.is == 2 && arrItemStands[var1].price > arrItemStands[var2].price) {
                        var3 = arrItemStands[var1];
                        arrItemStands[var1] = arrItemStands[var2];
                        arrItemStands[var2] = var3;
                    }

                    if (this.iu == 1) {
                        if (!arrItemStands[var1].item.template.name.equals(arrItemStands[var2].item.template.name) && arrItemStands[var1].item.template.name.compareTo(arrItemStands[var2].item.template.name) > 0) {
                            var3 = arrItemStands[var1];
                            arrItemStands[var1] = arrItemStands[var2];
                            arrItemStands[var2] = var3;
                        }
                    } else if (this.iu == 2 && !arrItemStands[var1].item.template.name.equals(arrItemStands[var2].item.template.name) && arrItemStands[var1].item.template.name.compareTo(arrItemStands[var2].item.template.name) < 0) {
                        var3 = arrItemStands[var1];
                        arrItemStands[var1] = arrItemStands[var2];
                        arrItemStands[var2] = var3;
                    }

                    if (this.it == 1) {
                        if (arrItemStands[var1].item.template.level < arrItemStands[var2].item.template.level) {
                            var3 = arrItemStands[var1];
                            arrItemStands[var1] = arrItemStands[var2];
                            arrItemStands[var2] = var3;
                        }
                    } else if (this.it == 2 && arrItemStands[var1].item.template.level > arrItemStands[var2].item.template.level) {
                        var3 = arrItemStands[var1];
                        arrItemStands[var1] = arrItemStands[var2];
                        arrItemStands[var2] = var3;
                    }
                }
            }
        }

    }

    private static void dc() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.qk, 150411));
        var0.addElement(new Command1(mResources.qm, 150412));
        var0.addElement(new Command1(mResources.ql, 150413));
        GameCanvas.menu.startAt(var0);
    }

    private static void dd() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.bn, 15041));
        var0.addElement(new Command1(mResources.cc, 15042));
        GameCanvas.menu.startAt(var0);
    }

    private void de() {
        Char.getMyChar().arrItemBag[itemSell.indexUI] = itemSell;
        itemSell = null;
        super.left = super.center = null;
    }

    private static void df() {
        Item var0;
        if ((var0 = Char.getMyChar().arrItemBag[indexSelect]) != null) {
            if (!var0.isLock && !var0.isExpires) {
                if (itemSell == null) {
                    itemSell = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    return;
                }

                var0 = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                Char.getMyChar().arrItemBag[itemSell.indexUI] = itemSell;
                itemSell = var0;
                return;
            }

            GameCanvas.a(mResources.jo);
        }

    }

    private static void dg() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 140191));
        var0.addElement(new Command1(mResources.cd, 140192));
        GameCanvas.menu.startAt(var0);
    }

    private static void dh() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.bj, (IActionListener) null, 120081, (Object) null));
        var0.addElement(new Command1(mResources.bk, (IActionListener) null, 12007, (Object) null));
        GameCanvas.menu.startAt(var0);
    }

    private void di() {
        if (this.or == 1) {
            GameCanvas.input2Dlg.a(mResources.pw, mResources.pv);
            GameCanvas.input2Dlg.a(mResources.ps, new Command1(mResources.aq, GameCanvas.c(), 8882, (Object) null), new Command1(mResources.bl, (IActionListener) null, 120071, (Object) null), 0, 0);
        } else {
            GameCanvas.input2Dlg.a(mResources.px, mResources.py);
            GameCanvas.input2Dlg.a(mResources.pt, new Command1(mResources.aq, GameCanvas.c(), 8882, (Object) null), new Command1(mResources.ch, (IActionListener) null, 120072, (Object) null), 0, 0);
        }

    }

    public static void a(String var0) {
        int var1;
        for (var1 = 0; var1 < vFriend.size(); ++var1) {
            Friend var2;
            if ((var2 = (Friend) vFriend.elementAt(var1)).friendName.equals(var0) && var2.type == 4) {
                vFriend.removeElementAt(var1);
                break;
            }
        }

        for (var1 = 0; var1 < vFriendWait.size(); ++var1) {
            if (((Friend) vFriendWait.elementAt(var1)).friendName.equals(var0)) {
                vFriendWait.removeElementAt(var1);
                return;
            }
        }

    }

    private static void dj() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.oe[0] + ": " + (gp ? mResources.ba : mResources.az), 140071));
        var0.addElement(new Command1(mResources.of, 140072));
        GameCanvas.menu.startAt(var0);
    }

    private static void dk() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.oe[0] + ": " + (gp ? mResources.ba : mResources.az), 140071));
        GameCanvas.menu.startAt(var0);
    }

    private static void dl() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.ok, 110441));
        var0.addElement(new Command1(mResources.oe[0] + ": " + (gp ? mResources.ba : mResources.az), 140071));
        GameCanvas.menu.startAt(var0);
    }

    private static void dm() {
        MyVector var0 = new MyVector();
        if (dz == 0) {
            var0.addElement(new Command1(mResources.bd, 11000671));
        } else if (dz == 1) {
            var0.addElement(new Command1(mResources.aw, 11000672));
        }

        if (dz == 1 || dz == 2) {
            var0.addElement(new Command1(mResources.pl, 11000674));
            var0.addElement(new Command1(mResources.pk, 11000673));
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void dn() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.np, 110471));
        var0.addElement(new Command1(mResources.oa[4], 1100061));
        GameCanvas.menu.startAt(var0);
    }

    private static void doa() {
        GameCanvas.n();
        Service.gI().doConvertUpgrade(arrItemConvert[0].indexUI, arrItemConvert[1].indexUI, arrItemConvert[2].indexUI);
    }

    private static void dp() {
        MyVector var0 = new MyVector();
        if (Char.getMyChar().ctypeClan == 3 || Char.getMyChar().ctypeClan == 4) {
            if (indexTitle == 1) {
                var0.addElement(new Command1(mResources.oe[8], 140044));
            }

            var0.addElement(new Command1(mResources.oe[2], 140041));
            var0.addElement(new Command1(mResources.oe[5], 140042));
            if (Char.getMyChar().ctypeClan == 4) {
                var0.addElement(new Command1(mResources.oe[4], 140043));
            }

            var0.addElement(new Command1(mResources.nk[10] + ": " + (cb ? mResources.ba : mResources.az), 11000665));
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void dq() {
        Party var0;
        if ((var0 = (Party) vPtMap.elementAt(indexRow)) != null && !Char.getMyChar().cName.equals(var0.name)) {
            MyVector var1;
            (var1 = new MyVector()).addElement(new Command1(mResources.nk[6], 1108041, var0.name));
            var1.addElement(new Command1(mResources.cg, 12002, var0.name));
            var1.addElement(new Command1(mResources.og[2], 110803, var0.name));
            GameCanvas.menu.startAt(var1);
        }

    }

    private static void dr() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.nv, 110452));
        if (vPtMap.size() > 0) {
            var0.addElement(new Command1(mResources.nu, 110451));
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void ds() {
        Member var0 = (Member) vClan.elementAt(indexRow);
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command1(mResources.oc[1], 140091, var0.name));
        var1.addElement(new Command1(mResources.oc[2], 140092, var0.name));
        GameCanvas.menu.startAt(var1);
    }

    private static void dt() {
        Member var0;
        if (indexRow >= 0 && indexRow < vClan.size() && (var0 = by()) != null && !var0.name.equals("")) {
            Service.gI().viewInfo(var0.name);
            isPaintClan = false;
            gI().resetButton();
        }

    }

    private static void du() {
        Member var0 = by();
        MyVector var1 = new MyVector();
        if (Char.getMyChar().ctypeClan == 4) {
            if (var0.type != 4) {
                if (var0.type != 3 && var0.type != 2) {
                    var1.addElement(new Command1(mResources.ox, 14009, var0.name));
                } else {
                    var1.addElement(new Command1(mResources.oy, 140093, var0.name));
                }

                if (TileMap.mapID != 98 && TileMap.mapID != 104) {
                    var1.addElement(new Command1(mResources.oe[6], 140095, var0.name));
                } else {
                    var1.addElement(new Command1(mResources.oe[7], 140096, var0.name));
                }

                var1.addElement(new Command1(mResources.oz, 140094, var0.name));
            }

            var1.addElement(new Command1(mResources.be, 14007));
        } else if (Char.getMyChar().ctypeClan == 3) {
            if (var0.type != 4 && !var0.name.equals(Char.getMyChar().cName)) {
                var1.addElement(new Command1(mResources.oz, 140094, var0.name));
                if (TileMap.mapID != 98 && TileMap.mapID != 104) {
                    var1.addElement(new Command1(mResources.oe[6], 140095, var0.name));
                } else {
                    var1.addElement(new Command1(mResources.oe[7], 140096, var0.name));
                }
            }

            var1.addElement(new Command1(mResources.be, 14007));
            var1.addElement(new Command1(mResources.oe[1], 14008, var0.name));
        } else {
            var1.addElement(new Command1(mResources.be, 14007));
            var1.addElement(new Command1(mResources.oe[1], 14008, var0.name));
        }

        GameCanvas.menu.startAt(var1);
    }

    private static boolean dv() {
        for (int var0 = 0; var0 < Char.getMyChar().arrItemBag.length; ++var0) {
            Item var1;
            if ((var1 = Char.getMyChar().arrItemBag[var0]) != null && var1.template.id == 279 && var1.template.level <= Char.getMyChar().clevel) {
                return true;
            }
        }

        return false;
    }

    private static void c(String var0) {
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command1(mResources.nk[6], 110805));
        var1.addElement(new Command1(mResources.cg, 12002, var0));
        var1.addElement(new Command1(mResources.oj, 110791, var0));
        var1.addElement(new Command1(mResources.al, 14020, var0));
        var1.addElement(new Command1(mResources.og[2], 110803, var0));
        GameCanvas.menu.startAt(var1);
    }

    private void dw() {
        isPaintClan = true;
        id = true;
        gq = false;
        this.mc = this.md = null;
        setPopupSize(175, 200);
        this.updateCommandForUI();
        super.right = this.mu;
        Service.gI().requestClanInfo();
    }

    private static void dx() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.mq[0], 11000661));
        var0.addElement(new Command1(mResources.mq[1], 11000662));
        var0.addElement(new Command1(mResources.mq[2], 11000663));
        var0.addElement(new Command1(mResources.mq[3], 11000664));
        var0.addElement(new Command1(mResources.mq[4], 11000666));
        GameCanvas.menu.startAt(var0);
    }

    private void dy() {
        Char.getMyChar().charFocus = null;
        Char.fw = false;
        this.dd = -1;
        isPaintCharInMap = false;
        this.resetButton();
    }

    private void dz() {
        Char var1;
        if (!(var1 = (Char) vCharInMap.elementAt(indexRow)).isNhanban) {
            this.dd = var1.charID;
            Char.getMyChar().mobFocus = null;
            Char.getMyChar().y();
            Char.getMyChar().itemFocus = null;
            Char.getMyChar();
            Char.fw = true;
            isPaintCharInMap = false;
            Char.getMyChar().charFocus = var1;
        }

        this.resetButton();
    }

    private void ea() {
        if (indexMenu == 0) {
            indexMenu = 1;
        } else {
            indexMenu = 0;
        }

        indexRow = 0;
        this.gf = indexMenu;
    }

    private static void eb() {
        Party var0;
        if ((var0 = (Party) vParty.elementAt(indexRow)).c != null && var0.c != Char.getMyChar()) {
            Service.gI().viewInfo(var0.c.cName);
            isPaintTeam = false;
            gI().resetButton();
        }

    }

    private static void ec() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.bn, 110221));
        var0.addElement(new Command1(mResources.bv, 11050));
        GameCanvas.menu.startAt(var0);
    }

    private static void ed() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.bn, 11048));
        var0.addElement(new Command1(mResources.bu, 11049));
        GameCanvas.menu.startAt(var0);
    }

    private void ee() {
        if (Char.getMyChar().arrItemBag[indexSelect].template.type != 26 && Char.getMyChar().arrItemBag[indexSelect].template.id != 455 && Char.getMyChar().arrItemBag[indexSelect].template.id != 456) {
            if (Char.getMyChar().arrItemBag[indexSelect].template.id == 457) {
                GameCanvas.msgdlg.setInfo(mResources.rt, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            } else {
                GameCanvas.msgdlg.setInfo(mResources.ru, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            }
        } else {
            if (Char.getMyChar().arrItemBag[indexSelect].template.type == 26 && Char.getMyChar().arrItemBag[indexSelect].template.id < 10) {
                GameCanvas.a(mResources.rx);
                return;
            }

            short var1 = 0;
            int var2 = 0;
            boolean var3 = arrItemUpPeal[12] != null;

            int var4;
            for (var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
                if (arrItemUpPeal[var4] != null && arrItemUpPeal[var4].template.type != 26) {
                    var1 = arrItemUpPeal[var4].template.id;
                    ++var2;
                }
            }

            for (var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
                if (arrItemUpPeal[var4] == null) {
                    if (Char.getMyChar().arrItemBag[indexSelect].template.type == 26) {
                        if (arrItemUpPeal[12] == null) {
                            arrItemUpPeal[12] = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                        } else {
                            Item var5 = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                            Char.getMyChar().arrItemBag[arrItemUpPeal[12].indexUI] = arrItemUpPeal[12];
                            arrItemUpPeal[12] = var5;
                        }
                    } else if (var1 > 0 && Char.getMyChar().arrItemBag[indexSelect].template.id != var1) {
                        GameCanvas.a(mResources.ry);
                    } else if ((!var3 || var2 < 3) && var2 < 9) {
                        arrItemUpPeal[var4] = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                    } else {
                        GameCanvas.a(mResources.sa);
                    }

                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.jw, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
        }

        GameCanvas.currentDialog = GameCanvas.msgdlg;
    }

    private void ef() {
        if (Char.getMyChar().arrItemBag[indexSelect].template.type != 26) {
            GameCanvas.msgdlg.setInfo(mResources.jp, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            for (int var1 = 0; var1 < arrItemUpPeal.length; ++var1) {
                if (arrItemUpPeal[var1] == null) {
                    arrItemUpPeal[var1] = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.jw, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }

    }

    private void eg() {
        Item var1 = getItemFocus(11);
        arrItemUpPeal[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void eh() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.bt, 111071));

        for (int var1 = 0; var1 < arrItemUpPeal.length; ++var1) {
            if (arrItemUpPeal[var1] != null) {
                var0.addElement(new Command1(mResources.fg, 1600));
                break;
            }
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void ei() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.bt, 111071));

        for (int var1 = 0; var1 < arrItemUpPeal.length; ++var1) {
            if (arrItemUpPeal[var1] != null) {
                var0.addElement(new Command1(mResources.fg, 11062));
                break;
            }
        }

        GameCanvas.menu.startAt(var0);
    }

    private void ej() {
        try {
            int var1;
            int var2;
            if (isPaintTinhluyen) {
                if (!Char.getMyChar().arrItemBag[indexSelect].isTypeBody() && !Char.getMyChar().arrItemBag[indexSelect].isTypeMounts() && Char.getMyChar().arrItemBag[indexSelect].template.id != 455 && Char.getMyChar().arrItemBag[indexSelect].template.id != 456 && Char.getMyChar().arrItemBag[indexSelect].template.id != 457) {
                    GameCanvas.msgdlg.setInfo(mResources.sb, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                } else if (Char.getMyChar().arrItemBag[indexSelect].template.id != 455 && Char.getMyChar().arrItemBag[indexSelect].template.id != 456 && Char.getMyChar().arrItemBag[indexSelect].template.id != 457) {
                    ItemOption var3 = null;

                    for (var1 = 0; var1 < Char.getMyChar().arrItemBag[indexSelect].options.size() && (var3 = (ItemOption) Char.getMyChar().arrItemBag[indexSelect].options.elementAt(var1)).optionTemplate.id != 85; ++var1) {
                        var3 = null;
                    }

                    if (var3 != null && var3.param >= 9) {
                        GameCanvas.a(mResources.sk);
                    } else {
                        if (itemSplit == null) {
                            itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                        } else {
                            Item var4 = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                            Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                            itemSplit = var4;
                        }

                        Service.gI().requestItemInfo(itemSplit.typeUI, itemSplit.indexUI);
                    }
                } else {
                    if (arrItemSplit == null) {
                        arrItemSplit = new Item[24];
                    }

                    for (var2 = 0; var2 < arrItemSplit.length; ++var2) {
                        if (arrItemSplit[var2] == null) {
                            arrItemSplit[var2] = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                            return;
                        }

                        if (var2 == arrItemSplit.length - 1) {
                            GameCanvas.a(mResources.jw);
                        }
                    }
                }
            } else if (Char.getMyChar().arrItemBag[indexSelect].isTypeBody() && Char.getMyChar().arrItemBag[indexSelect].upgrade > 0) {
                if (itemSplit == null) {
                    itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                } else {
                    Item var6 = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                    itemSplit = var6;
                }

                if (itemSplit != null) {
                    var2 = 0;
                    if (itemSplit.isTypeClothe()) {
                        for (var1 = 0; var1 < itemSplit.upgrade; ++var1) {
                            var2 += co[var1];
                        }
                    } else if (itemSplit.isTypeAdorn()) {
                        for (var1 = 0; var1 < itemSplit.upgrade; ++var1) {
                            var2 += cp[var1];
                        }
                    } else if (itemSplit.isTypeWeapon()) {
                        for (var1 = 0; var1 < itemSplit.upgrade; ++var1) {
                            var2 += cq[var1];
                        }
                    }

                    var2 /= 2;
                    var1 = 0;
                    arrItemSplit = new Item[24];

                    for (int var7 = cn.length - 1; var7 >= 0; --var7) {
                        if (var2 >= cn[var7]) {
                            arrItemSplit[var1] = new Item();
                            arrItemSplit[var1].typeUI = 3;
                            arrItemSplit[var1].template = ItemTemplates.get((short) var7);
                            arrItemSplit[var1].isLock = itemSplit.isLock;
                            arrItemSplit[var1].expires = -1L;
                            var2 -= cn[var7];
                            ++var7;
                            ++var1;
                        }
                    }
                }

                super.left = super.center = null;
                this.updateCommandForUI();
            } else {
                GameCanvas.msgdlg.setInfo(mResources.ju, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            }
        } catch (Exception var5) {
            GameCanvas.msgdlg.setInfo(mResources.sb, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }

    }

    private void ek() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.mn);
        if (itemSplit != null) {
            var1.addElement(new Command1(mResources.fg, 111031));
        }

        GameCanvas.menu.startAt(var1);
    }

    private void el() {
        if (Char.getMyChar().arrItemBag[indexSelect].isTypeBody()) {
            if (Char.getMyChar().arrItemBag[indexSelect].template.level >= 10 && Char.getMyChar().arrItemBag[indexSelect].template.type < 10) {
                if (Char.getMyChar().arrItemBag[indexSelect].upgrade >= Char.getMyChar().arrItemBag[indexSelect].getUpMax()) {
                    GameCanvas.msgdlg.setInfo(mResources.jt, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                } else {
                    if (itemUpGrade == null) {
                        itemUpGrade = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                    } else {
                        Item var1 = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        Char.getMyChar().arrItemBag[itemUpGrade.indexUI] = itemUpGrade;
                        itemUpGrade = var1;
                    }

                    super.left = super.center = null;
                    this.updateCommandForUI();
                }
            } else {
                GameCanvas.msgdlg.setInfo(mResources.js, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            }
        } else if (Char.getMyChar().arrItemBag[indexSelect].template.type != 26 && Char.getMyChar().arrItemBag[indexSelect].template.type != 28) {
            GameCanvas.msgdlg.setInfo(mResources.jq, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            int var4;
            if (Char.getMyChar().arrItemBag[indexSelect].template.type == 28) {
                for (var4 = 0; var4 < arrItemUpGrade.length; ++var4) {
                    if (arrItemUpGrade[var4] != null && arrItemUpGrade[var4].template.type == 28) {
                        Item var2 = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        int var3 = arrItemUpGrade[var4].indexUI;
                        Char.getMyChar().arrItemBag[var3] = arrItemUpGrade[var4];
                        arrItemUpGrade[var4] = var2;
                        return;
                    }
                }
            }

            for (var4 = 0; var4 < arrItemUpGrade.length; ++var4) {
                if (arrItemUpGrade[var4] == null) {
                    arrItemUpGrade[var4] = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.jw, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }

    }

    private void o(int var1) {
        if (arrItemConvert[var1] == null) {
            arrItemConvert[var1] = Char.getMyChar().arrItemBag[indexSelect];
            Char.getMyChar().arrItemBag[indexSelect] = null;
        } else {
            Item var2 = Char.getMyChar().arrItemBag[indexSelect];
            Char.getMyChar().arrItemBag[indexSelect] = null;
            int var3 = arrItemConvert[var1].indexUI;
            Char.getMyChar().arrItemBag[var3] = arrItemConvert[var1];
            arrItemConvert[var1] = var2;
        }

        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void em() {
        if (Char.getMyChar().arrItemBag[indexSelect].isTypeBody()) {
            if (Char.getMyChar().arrItemBag[indexSelect].upgrade > 0) {
                this.o(0);
            } else {
                this.o(1);
            }
        } else if (Char.getMyChar().arrItemBag[indexSelect].template.id != 269 && Char.getMyChar().arrItemBag[indexSelect].template.id != 270 && Char.getMyChar().arrItemBag[indexSelect].template.id != 271) {
            GameCanvas.msgdlg.setInfo(mResources.jr, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            this.o(2);
        }

    }

    private void en() {
        Item var1 = arrItemConvert[2];
        arrItemConvert[2] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void eo() {
        Item var1 = arrItemConvert[indexSelect];
        arrItemConvert[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void ep() {
        Item var1 = getItemFocus(10);
        arrItemUpGrade[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void eq() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.bt, 111001));
        if (itemUpGrade != null) {
            for (int var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                if (arrItemUpGrade[var1] != null) {
                    var0.addElement(new Command1(mResources.fg, 110981));
                    break;
                }
            }
        }

        GameCanvas.menu.startAt(var0);
    }

    private void er() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.mm);

        for (int var2 = 0; var2 < arrItemConvert.length; ++var2) {
            if (arrItemConvert[var2] == null) {
                super.left = null;
                break;
            }

            if (var2 == arrItemConvert.length - 1) {
                var1.addElement(new Command1(mResources.fg, 140131));
            }
        }

        GameCanvas.menu.startAt(var1);
    }

    private void es() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.ml);

        for (int var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
            if (arrItemUpGrade[var2] != null) {
                var1.addElement(new Command1(mResources.fg, 110981));
                break;
            }
        }

        GameCanvas.menu.startAt(var1);
    }

    private static void c(Item var0) {
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command1(mResources.cc, 110921, var0));
        var1.addElement(new Command1(mResources.cd, 110922, var0));
        GameCanvas.menu.startAt(var1);
    }

    private static void et() {
        indexRow = 0;
        aq.clear();
        if (jp == 0) {
            jp = 1;
        } else {
            jp = 0;
        }

    }

    private void eu() {
        indexMenu = 0;
        isPaintInfoMe = false;
        super.left = this.jx;
        super.right = this.ge;
        super.center = null;
        System.gc();
        this.resetButton();
        this.bf();
    }

    private static void ev() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110851));
        var0.addElement(new Command1(mResources.cd, 110852));
        GameCanvas.menu.startAt(var0);
    }

    private static void ew() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.di, 110841));
        var0.addElement(new Command1(mResources.dj, 110842));
        GameCanvas.menu.startAt(var0);
    }

    private static void ex() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.kl, 110821));
        GameCanvas.menu.startAt(var0);
    }

    private static void ey() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.qb[0], 110811));
        var0.addElement(new Command1(mResources.qb[1], 110812));
        GameCanvas.menu.startAt(var0);
    }

    private static void d(String var0) {
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command1(mResources.og[0], 110801));
        var1.addElement(new Command1(mResources.og[1], 110802));
        var1.addElement(new Command1(mResources.og[2], 110803, var0));
        var1.addElement(new Command1(mResources.nk[7], 12002, var0));
        var1.addElement(new Command1(mResources.nk[6], 110804));
        GameCanvas.menu.startAt(var1);
    }

    private static void ez() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.di, 140011));
        var0.addElement(new Command1(mResources.dj, 140012));
        GameCanvas.menu.startAt(var0);
    }

    private static void e(String var0) {
        GameCanvas.a(mResources.om, new Command1(mResources.br, 1107921, var0), new Command1(mResources.ce, 1));
    }

    private static void fa() {
        Friend var0 = (Friend) vFriend.elementAt(indexRow);
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command1(mResources.nk[6], 1108041, var0.friendName));
        var1.addElement(new Command1(mResources.cg, 12002, var0.friendName));
        if (var0.type == 4) {
            var1.addElement(new Command1(mResources.dm, 1107931, var0.friendName));
            var1.addElement(new Command1(mResources.dn, 1107932, var0.friendName));
        } else {
            var1.addElement(new Command1(mResources.oj, 110791, var0.friendName));
            var1.addElement(new Command1(mResources.al, 14020, var0.friendName));
            var1.addElement(new Command1(mResources.bf, 110792, var0.friendName));
        }

        GameCanvas.menu.startAt(var1);
    }

    private void a(byte var1) {
        if (indexRow >= 0 && indexRow < vList.size()) {
            try {
                Ranked var2;
                String var3;
                if ((var2 = (Ranked) vList.elementAt(indexRow)) != null) {
                    var3 = var2.name;
                } else {
                    var3 = "raned=null";
                }

                Service.gI().requestForgetPassByIMEI(var1, var3);
                this.resetButton();
                return;
            } catch (Exception var4) {
            }
        }

    }

    private static void fb() {
        if (indexRow >= 0 && indexRow < vList.size()) {
            int var0 = ((DunItem) vList.elementAt(indexRow)).id;
            Service.gI().requestMatchInfo(var0);
        }

    }

    private static void fc() {
        Friend var0 = (Friend) vEnemies.elementAt(indexRow);
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command1(mResources.nk[6], 1108041, var0.friendName));
        var1.addElement(new Command1(mResources.cg, 12002, var0.friendName));
        var1.addElement(new Command1(mResources.oj, 11076, var0.friendName));
        var1.addElement(new Command1(mResources.al, 14020, var0.friendName));
        var1.addElement(new Command1(mResources.bf, 11077, var0.friendName));
        GameCanvas.menu.startAt(var1);
    }

    private static void f(String var0) {
        GameCanvas.a(mResources.om, new Command1(mResources.br, 110771, var0), new Command1(mResources.ce, 1));
    }

    private void fd() {
        isPaintAlert = false;
        this.iy = null;
        this.ix = null;
        super.center = null;
        this.resetButton();
    }

    private void a(short var1, String var2) {
        NinjaUtil.sendMsDK(var2, var1);
        isPaintAlert = false;
        this.iy = null;
        this.ix = null;
        super.center = null;
        this.resetButton();
    }

    private static void fe() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.by, 110721));
        var0.addElement(new Command1(mResources.bz, 110722));
        var0.addElement(new Command1(mResources.ca, 110723));
        GameCanvas.menu.startAt(var0);
    }

    private static void a(Party var0) {
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command1(mResources.nq, 110701));
        if (!var0.isLock) {
            var1.addElement(new Command1(mResources.ns, 110702));
        } else {
            var1.addElement(new Command1(mResources.nt, 110703));
        }

        GameCanvas.menu.startAt(var1);
    }

    private void ff() {
        isPaintAlert = false;
        this.iy = null;
        this.ix = null;
        super.center = null;
        this.resetButton();
    }

    private void g(String var1) {
        NinjaUtil.downloadGame(var1);
        isPaintAlert = false;
        this.iy = null;
        this.ix = null;
        super.center = null;
        this.resetButton();
    }

    private static void fg() {
        GameCanvas.n();
        Service.gI().upgradeItem(itemUpGrade, arrItemUpGrade, hw);
    }

    private static void d(Item var0) {
        GameCanvas.n();
        Service.gI().saleItem(var0.indexUI, 1);
    }

    private void fh() {
        indexMenu = 0;
        isPaintInfoMe = false;
        this.resetButton();
        if (currentCharViewInfo.charID == Char.getMyChar().charID) {
            this.bf();
        }

    }

    private void fi() {
        if (this.kd >= 0 && this.kd < onScreenSkill.length) {
            Skill var1 = onScreenSkill[this.kd];
            this.a(var1, false);
        }

    }

    private static void e(Item var0) {
        String var1;
        if (!(var1 = GameCanvas.inputDlg.tfInput.e()).trim().equals("")) {
            int var2;
            try {
                var2 = Integer.parseInt(var1);
            } catch (Exception var4) {
                GameCanvas.n();
                return;
            }

            if (var2 <= 0) {
                GameCanvas.n();
                return;
            }

            if (var2 > var0.quantity) {
                GameCanvas.a(mResources.la);
                return;
            }

            GameCanvas.n();
            GameCanvas.a(mResources.kq, new Command1(mResources.br, 11058, var0), new Command1(mResources.ce, 1));
        }

    }

    private static void f(Item var0) {
        String var1;
        if ((var1 = GameCanvas.inputDlg.tfInput.e()).trim().equals("")) {
            GameCanvas.msgdlg.setInfo(mResources.kv, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            int var2;
            try {
                var2 = Integer.parseInt(var1);
            } catch (Exception var4) {
                GameCanvas.n();
                return;
            }

            if (var2 <= 0) {
                GameCanvas.n();
            } else {
                Service.gI().buyItem(var0.typeUI, var0.indexUI, var2);
                GameCanvas.n();
            }
        }

    }

    public void fj() {
        int var1 = indexSelect;
        this.resetButton();
        this.iv = var1;
        Service.gI().openUIZone();
    }

    private static void g(Item var0) {
        MyVector var1 = new MyVector();

        for (int var2 = 1; var2 < mResources.mv[3].length; ++var2) {
            var1.addElement(new Command1(mResources.mv[3][var2], 110531, var0));
        }

        GameCanvas.menu.startAt(var1);
    }

    private static void fk() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.ov + (ChatManager.c ? mResources.az : mResources.ba), 120061));
        var0.addElement(new Command1(mResources.ow + (ChatManager.d ? mResources.az : mResources.ba), 120062));
        GameCanvas.menu.startAt(var0);
    }

    private static void fl() {
        MyVector var0 = new MyVector();

        for (int var1 = 0; var1 < ChatManager.gI().chatTabs.size(); ++var1) {
            ChatTab var2 = (ChatTab) ChatManager.gI().chatTabs.elementAt(var1);
            var0.addElement(new Command1(var2.ownerName, 12001, new Integer(var1)));
        }

        var0.addElement(new Command1(mResources.pz, 12006));
        var0.addElement(new Command1(mResources.qa, 12008));
        GameCanvas.menu.startAt(var0);
        cc = true;
    }

    private void fm() {
        ChatTab var1 = ChatManager.gI().getCurrentChatTab();
        isPaintAlert = true;
        isPaintMessage = true;
        this.iw = true;
        setPopupSize(175, 200);
        if (GameCanvas.aa - ew < 40 && !GameCanvas.isTouch) {
            ew -= 52;
        }

        super.right = new Command1(mResources.aq, 11066);
        super.left = super.center = null;
        if (!GameCanvas.isTouch) {
            fn();
        } else {
            super.left = new Command1(mResources.cg, 12005);
        }

        if (var1.type == 2) {
            super.center = new Command1(mResources.ar, 120051, var1);
        }

        ChatTextField.gI().cmdChat = null;
        this.iy = var1.ownerName;
        this.ix = var1.contents;
        ChatManager.gI().removeFromWaitList(var1.ownerName);
        if (var1.type == 1) {
            ChatManager.f = false;
        }

        if (var1.type == 4) {
            ChatManager.e = false;
        }

        this.ai();
    }

    private static void fn() {
        ChatTab var0;
        if ((var0 = ChatManager.gI().getCurrentChatTab()).type == 0) {
            ChatTextField.gI().startChat(mResources.or[0]);
        }

        if (var0.type == 1) {
            ChatTextField.gI().startChat(mResources.os[0]);
        }

        if (var0.type == 2) {
            ChatTextField.gI().startChat(var0.ownerName);
        }

        if (var0.type == 3) {
            ChatTextField.gI().startChat(mResources.ot[0]);
        }

        if (var0.type == 4) {
            ChatTextField.gI().startChat(mResources.ou[0]);
        }

    }

    private void fo() {
        try {
            GameMidlet.instance.platformRequest(this.nr);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    private static void fp() {
        GameCanvas.n();
        Service.gI().useItem(indexSelect);
    }

    private static void fq() {
        Service.gI().boxSort();
    }

    private static void fr() {
        Service.gI().createParty();
    }

    private static void fs() {
        indexRow = 0;
        Service.gI().openFindParty();
    }

    private static void ft() {
        Party var0;
        if (indexRow >= 0 && indexRow < vPtMap.size() && (var0 = (Party) vPtMap.elementAt(indexRow)) != null) {
            Service.gI().pleaseInputParty(var0.name);
        }

    }

    private static void p(int var0) {
        switch (var0) {
            case 1:
                Service.gI().changePk(0);
                return;
            case 2:
                Service.gI().changePk(1);
                return;
            case 3:
                Service.gI().changePk(3);
            default:
        }
    }

    private static void fu() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.e()).trim().equals("")) {
            GameCanvas.n();
        } else {
            int var1;
            try {
                var1 = Integer.parseInt(var0);
            } catch (Exception var3) {
                GameCanvas.n();
                return;
            }

            if (var1 <= 0) {
                GameCanvas.n();
            } else if (Char.getMyChar().xu != 0 && var1 <= Char.getMyChar().xu) {
                Service.gI().boxCoinIn(var1);
                GameCanvas.n();
            } else {
                GameCanvas.a(mResources.ky);
            }
        }

    }

    private void fv() {
        String var1;
        if ((var1 = GameCanvas.inputDlg.tfInput.e()).trim().equals("")) {
            GameCanvas.n();
        } else {
            int var2;
            try {
                var2 = Integer.parseInt(var1);
            } catch (Exception var4) {
                GameCanvas.n();
                return;
            }

            if (var2 <= 0) {
                GameCanvas.n();
            } else if (Char.getMyChar().xu != 0 && var2 <= Char.getMyChar().xu) {
                this.da += var2;
                Char var3 = Char.getMyChar();
                var3.xu -= var2;
                GameCanvas.n();
            } else {
                GameCanvas.a(mResources.kx);
            }
        }

    }

    private static void fw() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.e()).trim().equals("")) {
            GameCanvas.n();
        } else {
            int var1;
            try {
                var1 = Integer.parseInt(var0);
            } catch (Exception var3) {
                GameCanvas.n();
                return;
            }

            if (var1 <= 0) {
                GameCanvas.n();
            } else if (Char.getMyChar().xuInBox != 0 && var1 <= Char.getMyChar().xuInBox) {
                Service.gI().boxCoinOut(var1);
                GameCanvas.n();
            } else {
                GameCanvas.a(mResources.kz);
            }
        }

    }

    private static void fx() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.nz[0], 11000651));
        var0.addElement(new Command1(mResources.nz[1], 11000652));
        var0.addElement(new Command1(mResources.nz[3], 11000653));
        GameCanvas.menu.startAt(var0);
    }

    private static void fy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.oa[6], 1100067));
        var0.addElement(new Command1(mResources.oa[3], 1100062));
        var0.addElement(new Command1(mResources.oa[1], 1100063));
        var0.addElement(new Command1(mResources.oa[2], 1100064));
        var0.addElement(new Command1(mResources.oa[0], 1100065));
        var0.addElement(new Command1(mResources.oa[8], 11000601));
        var0.addElement(new Command1(mResources.oa[9], 11000602));
        var0.addElement(new Command1(mResources.oa[10], 11000603));
        var0.addElement(new Command1(mResources.oa[11], 11000604));
        var0.addElement(new Command1(mResources.oa[7], 1100068));
        GameCanvas.menu.startAt(var0);
    }

    private void fz() {
        this.doCloseItemInfo();
        if (super.right != null) {
            super.right.a();
        }

    }

    private void ga() {
        this.doCloseItemInfo();
        if (super.left != null) {
            super.left.a();
        }

    }

    private void q(int var1) {
        if (Char.getMyChar().charFocus != null && !Char.getMyChar().charFocus.isNhanban) {
            switch (var1) {
                case 1:
                    Service.gI().addParty(Char.getMyChar().charFocus.cName);
                    return;
                case 2:
                    Service.gI().tradeInvite(Char.getMyChar().charFocus.charID);
                    return;
                case 3:
                    Service.gI().testInvite(Char.getMyChar().charFocus.charID);
                    return;
                case 4:
                    Service.gI().addCuuSat(Char.getMyChar().charFocus.charID);
                    return;
                case 5:
                    this.g(Char.getMyChar().charFocus.charID);
                    return;
                case 6:
                    Service.gI().addFriend(Char.getMyChar().charFocus.cName);
                    return;
                case 7:
                    Service.gI().viewInfo(Char.getMyChar().charFocus.cName);
                    gI().resetButton();
                    return;
                case 8:
                    Service.gI().clanInvite(Char.getMyChar().charFocus.charID);
                    return;
                case 9:
                    Service.gI().clanPlease(Char.getMyChar().charFocus.charID);
                    return;
                case 10:
                    Char.ei = !Char.ei;
                    Char.er = Char.getMyChar().charFocus.charID;
            }
        }

    }

    public final void g(int var1) {
        if (System.currentTimeMillis() - this.ot > 500L) {
            Service.gI().buffLive(var1);
            this.ot = System.currentTimeMillis();
        }

        if ((TileMap.a(Char.getMyChar().cx, Char.getMyChar().cy) & 2) == 2) {
            Char.getMyChar().a((SkillPaint) s[49], 0);
        } else {
            Char.getMyChar().a((SkillPaint) s[49], 1);
        }

    }

    private static void gb() {
        GameCanvas.o();
        ChatManager.clear();
        Session_ME.getInstance().close();
        mResources.e = 9999;
        mResources.f = System.currentTimeMillis() + 1000L;
        mResources.g = true;
    }

    private static void gc() {
        GameCanvas.a(mResources.eh, new Command1(mResources.br, 1100041), new Command1(mResources.ce, 1));
    }

    private static void gd() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.nn[1], 110381));
        var0.addElement(new Command1(mResources.nn[2], 110382));
        var0.addElement(new Command1(mResources.nn[3], 110383));
        GameCanvas.menu.startAt(var0);
    }

    private static void ge() {
        Service.gI().bagSort();
    }

    private void gf() {
        Item var1 = arrItemTradeMe[indexSelect];
        arrItemTradeMe[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void gg() {
        Item var1 = itemSplit;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        itemSplit = null;
        if (!isPaintTinhluyen && !isPaintDichChuyen && !isPaintKhamNgoc && arrItemSplit != null) {
            for (int var2 = 0; var2 < arrItemSplit.length; ++var2) {
                arrItemSplit[var2] = null;
            }
        }

        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void gh() {
        Item var1 = itemUpGrade;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        itemUpGrade = null;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void gi() {
        Item var1 = arrItemConvert[indexSelect];
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        arrItemConvert[indexSelect] = null;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void gj() {
        Service.gI().tradeAccept();
        this.cy = 2;
        if (gI().cy >= 2 && gI().cz >= 2) {
            InfoDlg.showWait();
        }

    }

    private void gk() {
        Service.gI().tradeItemLock(this.da, arrItemTradeMe);
        this.cy = 1;
        if (gI().cy == 1 && gI().cz == 1) {
            gI().dc = (int) (System.currentTimeMillis() / 1000L + 5L);
        }

        super.left = this.mh;
    }

    private void gl() {
        Item var1 = arrItemTradeMe[indexSelect];
        this.updateItemInfo((int) 3, (Item) var1);
    }

    private void gm() {
        if (Char.getMyChar().arrItemBag[indexSelect].isLock) {
            GameCanvas.msgdlg.setInfo(mResources.jn, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            for (int var1 = 0; var1 < arrItemTradeMe.length; ++var1) {
                if (arrItemTradeMe[var1] == null) {
                    arrItemTradeMe[var1] = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.jv, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }

    }

    private void gn() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.mr);
        var1.addElement(this.mo);
        GameCanvas.menu.startAt(var1);
    }

    private void go() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.mp);
        if (this.cy == 0) {
            var1.addElement(this.mg);
        } else if (this.cy == 1 && this.cz > 0 && (long) this.dc - System.currentTimeMillis() / 1000L <= 0L) {
            var1.addElement(this.mh);
        }

        GameCanvas.menu.startAt(var1);
    }

    private static void gp() {
        try {
            Item var0;
            if ((var0 = getItemFocus(3)).template.gender != 2 && var0.template.gender != Char.getMyChar().cgender) {
                GameCanvas.msgdlg.setInfo(mResources.lo, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            } else if (var0.template.level > Char.getMyChar().clevel) {
                GameCanvas.msgdlg.setInfo(mResources.lq, (Command1) null, new Command1(mResources.aq, 1), (Command1) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            } else if ((var0.isTypeBody() || var0.isTypeMounts()) && !var0.isLock) {
                GameCanvas.a(mResources.kp, new Command1(mResources.br, 11051, (Object) null), new Command1(mResources.ce, 1));
            } else if (var0.template.id != 35 && var0.template.id != 37) {
                if (var0.template.id == 514) {
                    GameCanvas.input2Dlg.a("Đến: ", "Lời chúc: ");
                    GameCanvas.input2Dlg.a("Chúc tết", new Command1(mResources.aq, GameCanvas.instance, 8882, (Object) null), new Command1("Gửi", GameCanvas.instance, 1608, (Object) null), 0, 0);
                } else if (var0.template.id == 515) {
                    GameCanvas.input2Dlg.a("Đến: ", "Lời chúc: ");
                    GameCanvas.input2Dlg.a("Chúc tết", new Command1(mResources.aq, GameCanvas.instance, 8882, (Object) null), new Command1("Gửi", GameCanvas.instance, 16081, (Object) null), 0, 0);
                } else {
                    Service.gI().useItem(indexSelect);
                }
            } else {
                MyVector var1 = new MyVector();

                for (int var2 = 0; var2 < 3; ++var2) {
                    var1.addElement(new Command1(mResources.mv[var2][0], 11052, var0));
                }

                var1.addElement(new Command1(mResources.mv[3][0], 11053, var0));
                var1.addElement(new Command1(mResources.mv[4][0], 11054));
                GameCanvas.menu.startAt(var1);
            }
        } catch (Exception var3) {
        }

    }

    private static void gq() {
        Item var0;
        if ((var0 = getItemFocus(3)) != null) {
            if (var0.template.level > Char.getMyChar().clevel) {
                GameCanvas.msgdlg.setInfo(mResources.kw, (Command1) null, new Command1(mResources.ae, 1), (Command1) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
                return;
            }

            (new Thread(new Class_ba(var0))).start();
        }

    }

    private static void gr() {
        if (Char.getMyChar().arrItemBag[indexSelect] != null && Char.getMyChar().arrItemBag[indexSelect].quantity > 1) {
            GameCanvas.inputDlg.a(mResources.pu, new Command1(mResources.ch, GameCanvas.instance, 88835, String.valueOf(indexSelect)), 1);
        }

    }

    private static void gs() {
        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
            if (Char.getMyChar().arrItemBag[indexSelect].isLock) {
                InfoMe.addInfo(mResources.nc);
                return;
            }

            Service.gI().throwItem(indexSelect);
        }

    }

    private void gt() {
        if (indexTitle == 1) {
            Item var1 = getItemFocus(3);
            if (GameCanvas.isTouchControlLargeScreen) {
                this.a(var1, this.oj);
                return;
            }

            this.a(var1, (Command1) null);
        }

    }

    private void gu() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.oj);
        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
            if (NSOT_MOB.a((int) Char.getMyChar().arrItemBag[indexSelect].template.id)) {
                var1.addElement(new Command1("Tắt Tự Dùng", 110263));
            } else {
                var1.addElement(new Command1("Tự Dùng", 110262));
            }
        }

        if (Char.getMyChar().arrItemBag[indexSelect] != null && Char.getMyChar().arrItemBag[indexSelect].quantity > 1) {
            var1.addElement(new Command1("Mở all", 110261));
            var1.addElement(this.on);
        }

        var1.addElement(new Command1(mResources.by, Char.getMyChar().arrItemBag[indexSelect].quantity > 1 ? 11072 : 11073));
        var1.addElement(this.om);
        var1.addElement(new Command1(mResources.bn, 110221));
        GameCanvas.menu.startAt(var1);
    }

    private static void gv() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 140221));
        var0.addElement(new Command1(mResources.cd, 140222));
        GameCanvas.menu.startAt(var0);
    }

    private static void gw() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110201));
        var0.addElement(new Command1(mResources.cd, 110202));
        GameCanvas.menu.startAt(var0);
    }

    private static void gx() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110181));
        var0.addElement(new Command1(mResources.cd, 110182));
        GameCanvas.menu.startAt(var0);
    }

    private static void gy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 130021));
        var0.addElement(new Command1(mResources.cd, 130022));
        GameCanvas.menu.startAt(var0);
    }

    private static void gz() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110161));
        var0.addElement(new Command1(mResources.cd, 110162));
        GameCanvas.menu.startAt(var0);
    }

    private static void ha() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110141));
        var0.addElement(new Command1(mResources.cd, 110142));
        GameCanvas.menu.startAt(var0);
    }

    private static void hb() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110121));
        var0.addElement(new Command1(mResources.cd, 110122));
        GameCanvas.menu.startAt(var0);
    }

    private static void hc() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110101));
        var0.addElement(new Command1(mResources.cd, 110102));
        GameCanvas.menu.startAt(var0);
    }

    private static void hd() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110081));
        var0.addElement(new Command1(mResources.cd, 110082));
        GameCanvas.menu.startAt(var0);
    }

    private static void he() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command1(mResources.cc, 110051));
        var0.addElement(new Command1(mResources.cd, 110052));
        GameCanvas.menu.startAt(var0);
    }

    private static void b(byte var0) {
        Item var1 = getItemFocus(var0);
        Service.gI().buyItem(var1.typeUI, var1.indexUI, 1);
    }

    private static void c(byte var0) {
        a(getItemFocus(var0));
    }

    private void actView(byte var1) {
        Item var2 = getItemFocus(var1);
        this.updateItemInfo(var2.typeUI, var2);
    }

    private static void hf() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.e()).trim().equals("")) {
            GameCanvas.a(mResources.jy);
        } else {
            int var1;
            try {
                var1 = Integer.parseInt(var0);
            } catch (Exception var3) {
                GameCanvas.n();
                return;
            }

            if (var1 <= 0) {
                GameCanvas.n();
            } else if (Char.getMyChar().pPoint != 0 && var1 <= Char.getMyChar().pPoint) {
                Service.gI().upPotential(indexTitle - 1, var1);
                GameCanvas.n();
            } else {
                GameCanvas.a(mResources.jx);
            }
        }

    }

    private static void hg() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.e()).trim().equals("")) {
            GameCanvas.a(mResources.jy);
        } else {
            int var1;
            try {
                var1 = Integer.parseInt(var0);
            } catch (Exception var3) {
                GameCanvas.n();
                return;
            }

            if (Char.getMyChar().sPoint != 0 && var1 <= Char.getMyChar().sPoint) {
                Service.gI().upSkill(Char.getMyChar().nClass.c[indexSelect].id, var1);
                GameCanvas.n();
            } else {
                GameCanvas.a(mResources.jy);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            }
        }

    }

    private static void hh() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.e()).trim().equals("")) {
            GameCanvas.a(mResources.kd);
        } else {
            Service.gI().addFriend(var0);
            GameCanvas.n();
        }

    }

    public final void perform(int var1, Object var2) {
        GameCanvas.instance.t();
    }

    public final void al() {
        this.aj();
        indexMenu = 3;
        isPaintInfoMe = true;
        setPopupSize(175, 200);
        super.right = this.mu;
    }

    public static void am() {
        ow = new int[vMobAttack.size()];
        ox = new int[vMobAttack.size()];

        int var0;
        Mob var1;
        for (var0 = 0; var0 < vMobAttack.size(); ++var0) {
            if (var0 != ov) {
                var1 = (Mob) vMobAttack.elementAt(var0);
                int var2;
                int var3;
                if (!eo) {
                    var2 = Math.abs(var1.xFirst - fa);
                    ow[var0] = var2;
                    var3 = Math.abs(var1.yFirst - fb);
                    ox[var0] = var3;
                } else {
                    var2 = Math.abs(var1.xFirst - Char.getMyChar().cx);
                    ow[var0] = var2;
                    var3 = Math.abs(var1.yFirst - Char.getMyChar().cy);
                    ox[var0] = var3;
                    fc = 700;
                }
            }
        }

        if (er == 1 && Char.getMyChar().mobFocus == null && Char.getMyChar().npcFocus == null && Char.getMyChar().mobFocus == null && Char.getMyChar().statusMe != 14 && Char.getMyChar().cMP > 0 && Char.getMyChar().itemFocus == null && System.currentTimeMillis() - ou + 2000L >= 0L) {
            if (!eo && Char.getMyChar().mobFocus != null && (Char.getMyChar().cx < fa - fc || Char.getMyChar().cy > fa + fc || Char.getMyChar().cy < fb - fc || Char.getMyChar().cy > fb + fc)) {
                Char.getMyChar().cx = fa;
                Char.getMyChar().cy = fb;
            }

            for (var0 = 0; var0 < vMobAttack.size(); ++var0) {
                if (var0 != ov && ow[var0] < fc && ox[var0] < fc && Char.getMyChar().mobFocus == null && (var1 = (Mob) vMobAttack.elementAt(var0)).status != 0 && var1.status != 1 && var1.levelBoss != 3) {
                    ServerEffect.addServerEffect(141, Char.getMyChar().cx, Char.getMyChar().cy, 2);
                    Char.getMyChar().cx = var1.xFirst;
                    Char.getMyChar().cy = var1.yFirst;
                    Char.getMyChar().statusMe = 4;
                    Char.getMyChar().mobFocus = var1;
                    ServerEffect.addServerEffect(141, Char.getMyChar().cx, Char.getMyChar().cy, 2);
                    Char.getMyChar().cxSend = var1.xFirst;
                    Char.getMyChar().cySend = var1.yFirst;
                    Service.gI().sendAttackMobFast(var1.mobId);
                    ov = var0;
                    ou = System.currentTimeMillis();
                }
            }
        }

    }

    private static void an(mGraphics var0) {
        if (gs) {
            Paint.a(eu, et, ev, ew, var0);
            a(var0, mResources.ac, false);
            nt = eu + 5;
            nu = et + 40;
            if (vList.size() == 0) {
                mFont.tahoma_7_white.a(var0, mResources.nx, eu + ev / 2, et + 40, 2);
                return;
            }

            var0.a(-16770791);
            var0.c(nt - 2, nu - 2, ev - 6, gi * 3 + 8);
            b(var0);
            aq.a(vList.size(), gi, nt, nu, ev - 3, gi * 3 + 4, true, 1);
            aq.a(var0, nt, nu, ev - 3, gi * 3 + 6);
            gk = vList.size();

            for (int var1 = 0; var1 < vList.size(); ++var1) {
                Ranked var2 = null;

                try {
                    var2 = (Ranked) vList.elementAt(var1);
                } catch (Exception var4) {
                }

                if (var2 != null) {
                    if (indexRow == var1) {
                        var0.a(Paint.COLORLIGHT);
                        var0.c(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                        var0.a(16777215);
                        var0.b(nt + 2, nu + indexRow * gi + 2, ev - 15, gi - 4);
                    } else {
                        var0.a(Paint.COLORBACKGROUND);
                        var0.c(nt + 2, nu + var1 * gi + 2, ev - 15, gi - 4);
                        var0.a(13932896);
                        var0.b(nt + 2, nu + var1 * gi + 2, ev - 15, gi - 4);
                    }

                    mFont.tahoma_7_yellow.a(var0, var2.name, nt + (ev - 10) / 2 - ev / 4, nu + var1 * gi + gi / 2 - 10, 2);
                    mFont.tahoma_7_yellow.a(var0, "-", nt + (ev - 10) / 2, nu + var1 * gi + gi / 2 - 10, 2);
                    mFont.tahoma_7_yellow.a(var0, mResources.ab + ": " + var2.ranked, nt + (ev - 10) / 2 + ev / 4, nu + var1 * gi + gi / 2 - 10, 2);
                    mFont.tahoma_7_white.a(var0, var2.stt, nt + ev / 2, nu + var1 * gi + gi / 2 + 5, 2);
                }
            }
        }

    }

    private static void hi() {
        Service.gI().luckyDraw((short) 102, "", fd);
    }

    private void hj() {
        this.ph = true;
        Service.gI().luckyDraw((short) 101, "", fd);
    }

    private static void hk() {
        Short var0 = new Short((short) 1);
        GameCanvas.inputDlg.a(mResources.z, new Command1(mResources.aa, GameCanvas.instance, 1700, var0), 1);
    }

    public final void a(String var1, short var2, String var3, short var4, String var5, short var6, String var7, String var8, byte var9) {
        InfoDlg.hide();
        isPaintLucky_Draw = true;
        this.iw = true;
        indexRow = 0;
        setPopupSize(175, 200);
        super.left = null;
        super.center = new Command1(mResources.aa, 1701);
        super.right = new Command1(mResources.aq, 1702);
        fd = var9;
        this.iy = var1;
        this.oy = var2;
        this.pc = var3;
        this.oz = var4;
        this.pd = var5;
        this.pa = var6;
        this.pe = var7;
        this.pf = var8;
        var1 = this.pf == "" ? "" : mResources.x + this.pf + mResources.ki;
        var1 = "c3" + this.pc + "" + mResources.y + var6 + "" + var1 + "c0" + this.pe;
        this.ix = mFont.tahoma_7.a(var1, ev - 30);
        this.pg = System.currentTimeMillis();
        this.pb = a(this.pg, this.oy);
        this.ph = false;
    }

    private static String a(long var0, int var2) {
        long var3;
        if ((var3 = (var0 + (long) (var2 * 1000) - System.currentTimeMillis()) / 1000L) <= 0L) {
            return "";
        } else {
            long var5;
            if ((var5 = var3 / 60L) <= 0L) {
                return var3 < 10L ? "0" + var3 + "s" : var3 + "s";
            } else if (var5 < 10L) {
                return var3 % 60L >= 0L && var3 % 60L < 10L ? "0" + var5 + ":0" + var3 % 60L : "0" + var5 + ":" + var3 % 60L;
            } else {
                return var3 % 60L >= 0L && var3 % 60L < 10L ? var5 + ":0" + var3 % 60L : var5 + ":" + var3 % 60L;
            }
        }
    }

    private void hl() {
        isPaintLucky_Draw = false;
        this.iy = null;
        this.ix = null;
        super.center = null;
        super.left = null;
        super.right = null;
        this.resetButton();
    }

    private void ao(mGraphics var1) {
        if (this.ix != null && isPaintLucky_Draw) {
            if (!this.ph) {
                if (this.pa > 1) {
                    this.pb = a(this.pg, this.oy);
                }

                if (this.pb == "") {
                    this.hj();
                }

                long var2;
                if ((var2 = (this.pg + (long) (this.oy * 1000) - System.currentTimeMillis()) / 1000L) > 8L && var2 % 5L == 0L) {
                    this.hj();
                }

                if (var2 <= 10L) {
                    super.center = null;
                }

                if (var2 <= 20L) {
                    this.pi = mFont.tahoma_7b_red;
                } else {
                    this.pi = mFont.tahoma_7b_yellow;
                }
            }

            b(var1);
            Paint.a(eu, et, ev, ew, var1);
            if (this.iy != null) {
                a(var1, this.iy, isPaintMessage);
            }

            nt = eu + 15;
            nu = et + 15;
            if (this.iy != null) {
                nu += 10;
            }

            this.pi.a(var1, this.pb, eu + ev / 2, nu + 12, 2);
            mFont.tahoma_7_yellow.a(var1, mResources.w, eu + ev / 2, nu + 30, 2);
            int var9 = eu + ev / 2;
            int var3 = nu + 42;
            int var4 = ev / 2;
            String var5 = this.oz + "." + this.pd + "%";
            int var6 = this.oz;
            var1.a(0);
            var1.c(var9 - var4 / 2, var3, var4, 12);
            if ((var6 = var6 * var4 / 100) <= 0) {
                var6 = 1;
            }

            var1.d(var9 - var4 / 2, var3, var6, 12);
            var1.a(16711680);
            var1.c(var9 - var4 / 2, var3, var4, 12);
            b(var1);
            mFont.tahoma_7_yellow.a(var1, var5, eu + ev / 2, var3, 2);
            gk = this.ix.size();
            aq.a(gk, 12, eu, nu + 48, ev, ew - 42 - (this.iy != null ? 10 : 0), true, 1);
            aq.a(var1);
            this.ob = nu + 48;
            mFont var7 = mFont.tahoma_7_white;

            String var8;
            for (var3 = 0; var3 < this.ix.size() && (var8 = (String) this.ix.elementAt(var3)) != null && this.ix != null && var7 != null; ++var3) {
                if (var8.startsWith("c")) {
                    if (var8.startsWith("c0")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7_white;
                    } else if (var8.startsWith("c1")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7b_yellow;
                    } else if (var8.startsWith("c2")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7b_white;
                    } else if (var8.startsWith("c3")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7_yellow;
                    } else if (var8.startsWith("c4")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7b_red;
                    } else if (var8.startsWith("c5")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7_red;
                    } else if (var8.startsWith("c6")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7_grey;
                    } else if (var8.startsWith("c7")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7b_blue;
                    } else if (var8.startsWith("c8")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7_blue;
                    } else if (var8.startsWith("c9")) {
                        var8 = var8.substring(2);
                        var7 = mFont.tahoma_7_green;
                    }
                }

                var7.a(var1, var8, eu + ev / 2, this.ob += 12, 2);
            }
        }

    }

    public final void switchToMe() {
        TileMap.f();
        Session_ME.isCancel = false;
        Session_ME.f();
        TileMap.ag = false;
        NSOT_MOB.mod_nst.b();
        ToolCuoc.tool.startTool();
        super.switchToMe();
    }

    public final void an() {
        this.pj = new byte[]{-1, -1, -1, -1, -1, -1};
    }

    private void hm() {
        if (GameCanvas.l[4]) {
            this.e((byte) 0);
            GameCanvas.m();
        } else if (GameCanvas.l[2]) {
            this.e((byte) 1);
            GameCanvas.m();
        } else if (GameCanvas.l[6]) {
            this.e((byte) 2);
            GameCanvas.m();
        }

    }

    public final void a(Image var1) {
        var1.getRGB(this.fh, 0, 60, 0, 15, 60, 10);
        (new Thread(new Class_bc(this))).start();
    }

    private void e(byte var1) {
        for (int var2 = 0; var2 < this.pj.length; ++var2) {
            if (var2 != this.pj.length - 1) {
                this.pj[var2] = this.pj[var2 + 1];
            } else {
                this.pj[var2] = var1;
                Service.gI().a(var1);
            }
        }

    }

    private void ap(mGraphics var1) {
        try {
            gk = 1;
            this.po = ev;
            this.pp = ew;
            this.pm = eu;
            this.pn = et;
            this.px = this.pm + 25;
            this.py = this.pn + 60;
            this.pz = this.po - 50;
            this.qa = 70;
            this.ps = this.po - 49;
            this.pt = 10;
            this.pq = GameCanvas.ab - this.ps / 2;
            this.pr = this.py + this.qa - this.pt;
            this.pw = 18;
            this.pu = GameCanvas.ab - (this.pl.size() - 1) * ((this.pw + 5) / 2);
            this.pv = this.pn + this.pp - this.pw / 2 - 5;
            Clan_ThanThu var2;
            if (this.pl.size() > 0 && this.pk <= this.pl.size()) {
                var2 = (Clan_ThanThu) this.pl.elementAt(this.pk);
            } else {
                var2 = null;
            }

            if (var2 == null) {
                var1.a(13606712);
                var1.b(this.px - 1, this.py - 1, this.pz + 1, this.qa + 1);
                var1.d(this.px, this.py, this.pz, this.qa);
                var1.a(6425);
                var1.c(this.px, this.py, this.pz, this.qa);
            } else {
                mFont.tahoma_7b_white.a(var1, var2.name, GameCanvas.ab, this.pn + 35, 2);
                var1.a(13606712);
                var1.b(this.px - 1, this.py - 1, this.pz + 1, this.qa + 1);
                var1.d(this.px, this.py, this.pz, this.qa);
                var1.a(6425);
                var1.c(this.px, this.py, this.pz, this.qa);
                SmallImage.drawSmallImageNew(var1, var2.idThanThu, this.px + this.pz / 2, this.py + this.qa / 2 - 10, 0, 3);
                b(var1);
                int var3;
                if (var2.time_aptrung >= 0) {
                    this.qc = Res.getTimeCountDown(var2.timeStartThanThu, var2.time_aptrung);
                    if (!this.qc.equals("")) {
                        mFont.tahoma_7_yellow.a(var1, var2.str_trungno + " " + this.qc, this.px, this.pr + 15, 0);
                    } else {
                        --this.qb;
                        if (this.qb <= 0) {
                            Service.gI().requestClanItem();
                            this.qb = 100;
                        }
                    }
                } else {
                    for (var3 = 0; var3 < var2.stars; ++var3) {
                        SmallImage.drawSmallImageNew(var1, 628, this.pm + 95 + var3 * 12 - var2.stars * 6, this.pn + 50, 0, 3);
                    }

                    var3 = var2.curExp * this.ps / var2.maxExp;
                    var1.a(2506246);
                    var1.c(this.pq, this.pr, this.ps, this.pt);
                    var1.a(371981);
                    var1.c(this.pq, this.pr, var3, this.pt);
                    var1.a(13606712);
                    var1.b(this.pq, this.pr, this.ps, this.pt);
                    mFont.tahoma_7_white.a(var1, var2.curExp + "/" + var2.maxExp, this.pq + this.ps / 2, this.pr, 2);

                    for (int var4 = 0; var4 < var2.vecInfo.size(); ++var4) {
                        String var5 = (String) var2.vecInfo.elementAt(var4);
                        mFont.tahoma_7_yellow.a(var1, var5, this.px + this.pz / 2, this.pr + 15 + var4 * 10, 2);
                    }
                }

                for (var3 = 0; var3 < this.pl.size(); ++var3) {
                    Clan_ThanThu var7;
                    if (this.pl.size() > 0 && var3 <= this.pl.size()) {
                        var7 = (Clan_ThanThu) this.pl.elementAt(var3);
                    } else {
                        var7 = null;
                    }

                    if (var7 != null) {
                        var1.a(0);
                        var1.c(this.pu + var3 * (this.pw + 5) - this.pw / 2, this.pv - this.pw / 2, this.pw, this.pw);
                        SmallImage.drawSmallImageNew(var1, 154, this.pu + var3 * (this.pw + 5), this.pv, 0, 3);
                        var1.a(12281361);
                        var1.b(this.pu + var3 * (this.pw + 5) - this.pw / 2, this.pv - this.pw / 2, this.pw, this.pw);
                        SmallImage.drawSmallImageNew(var1, var7.idIconItem, this.pu + var3 * (this.pw + 5), this.pv, 0, 3);
                    }
                }

                var1.a(16777215);
                var1.b(this.pu + this.pk * (this.pw + 5) - this.pw / 2, this.pv - this.pw / 2, this.pw, this.pw);
            }
        } catch (Exception var6) {
            System.out.println("e:" + var6.toString());
        }

    }

    public final void a(Clan_ThanThu var1) {
        this.pl.addElement(var1);
    }

    public final void ao() {
        this.pl.removeAllElements();
    }

    private void hn() {
        try {
            if (isPaintKhamNgoc && Char.getMyChar().arrItemBag[indexSelect].isTypeNgocKham()) {
                if (itemSplit == null) {
                    if (Char.getMyChar().arrItemBag[indexSelect].upgrade < 10) {
                        itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        return;
                    }

                    GameCanvas.msgdlg.setInfo(mResources.i, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                    return;
                }

                if (arrItemSplit == null) {
                    arrItemSplit = new Item[24];
                }

                for (int var1 = 0; var1 < arrItemSplit.length; ++var1) {
                    if (arrItemSplit[var1] == null) {
                        arrItemSplit[var1] = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        super.left = super.center = null;
                        this.updateCommandForUI();
                        return;
                    }

                    if (var1 == arrItemSplit.length - 1) {
                        GameCanvas.a(mResources.jw);
                    }
                }

                return;
            }
        } catch (Exception var2) {
            GameCanvas.msgdlg.setInfo(mResources.i, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
            var2.printStackTrace();
        }

    }

    private void ho() {
        Item var1;
        if (Char.getMyChar().arrItemBag[indexSelect].isTypeNgocKham()) {
            if (itemSplit == null) {
                itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
            } else {
                var1 = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                itemSplit = var1;
            }

            super.left = super.center = null;
            this.updateCommandForUI();
        } else if (Char.getMyChar().arrItemBag[indexSelect].isTypeBody()) {
            if (itemUpGrade == null) {
                itemUpGrade = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
            } else {
                var1 = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                Char.getMyChar().arrItemBag[itemUpGrade.indexUI] = itemUpGrade;
                itemUpGrade = var1;
            }

            super.left = super.center = null;
            this.updateCommandForUI();
        } else if (Char.getMyChar().arrItemBag[indexSelect].template.type != 26 && Char.getMyChar().arrItemBag[indexSelect].template.type != 28) {
            GameCanvas.msgdlg.setInfo(mResources.jq, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            int var2;
            if (Char.getMyChar().arrItemBag[indexSelect].template.type == 28) {
                for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                    if (arrItemUpGrade[var2] != null && arrItemUpGrade[var2].template.type == 28) {
                        Item var3 = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        int var4 = arrItemUpGrade[var2].indexUI;
                        Char.getMyChar().arrItemBag[var4] = arrItemUpGrade[var2];
                        arrItemUpGrade[var2] = var3;
                        return;
                    }
                }
            }

            for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                if (arrItemUpGrade[var2] == null) {
                    arrItemUpGrade[var2] = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.jw, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }

    }

    private void r(int var1) {
        MyVector var2 = new MyVector();
        if (var1 == 0) {
            var2.addElement(this.mi);
        } else if (var1 == 1) {
            var2.addElement(this.mj);
        } else if (var1 == 2) {
            var2.addElement(this.mk);
        }

        if (itemUpGrade != null && itemSplit != null) {
            for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                if (arrItemUpGrade[var1] != null) {
                    var2.addElement(new Command1(mResources.fg, 341));
                    break;
                }
            }
        }

        GameCanvas.menu.startAt(var2);
    }

    private void s(int var1) {
        Item var2 = itemSplit;
        if (var1 == 1) {
            var2 = itemUpGrade;
            itemUpGrade = null;
        } else if (var1 == 2) {
            var2 = getItemFocus(47);
            arrItemUpGrade[indexSelect] = null;
        } else {
            itemSplit = null;
        }

        Char.getMyChar().arrItemBag[var2.indexUI] = var2;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void hp() {
        int var0 = 0;

        for (int var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
            if (arrItemUpGrade[var1] != null && arrItemUpGrade[var1].template.type == 26) {
                var0 += cn[arrItemUpGrade[var1].template.id];
            }
        }

        boolean var3 = false;
        int var2 = 0;
        if (itemSplit != null) {
            if (cu[itemSplit.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                var3 = true;
            }

            var2 = var0 * 100 / cq[itemSplit.upgrade];
        }

        if (var3) {
            InfoMe.addInfo(mResources.lv, 15, mFont.tahoma_7_red);
        } else if (var2 > 250) {
            GameCanvas.a(mResources.lw, new Command1(mResources.br, 342), new Command1(mResources.ce, 1));
        } else if (itemSplit != null && itemUpGrade != null && arrItemUpGrade.length > 0) {
            if (!itemUpGrade.isLock) {
                GameCanvas.a(mResources.lx, new Command1(mResources.br, 342), new Command1(mResources.ce, 1));
                return;
            }

            Service.gI().ngockham((byte) 0, itemUpGrade, itemSplit, arrItemUpGrade);
        }

    }

    private static void hq() {
        GameCanvas.n();
        if (itemSplit != null && itemUpGrade != null && arrItemUpGrade.length > 0) {
            Service.gI().ngockham((byte) 0, itemUpGrade, itemSplit, arrItemUpGrade);
        }

    }

    private void aq(mGraphics var1) {
        if (isPaintKhamNgoc) {
            if (indexMenu == 0) {
                String[] var2 = mResources.gu;
                var1 = var1;
                GameScr var3 = this;

                try {
                    Paint.a(eu, et, ev, ew, var1);
                    a(var1, var2[indexMenu], var2.length > 1);
                    nt = eu + 3;
                    nu = et + 34 + gi;
                    int var4 = eu + 74;
                    int var5 = nu - gi - 3;
                    oa = 4;
                    int var6;
                    int var7;
                    if (itemSplit == null) {
                        var1.a(6425);
                        var1.c(var4 - 1, var5 - 1, gi + 3, gi + 3);
                        SmallImage.drawSmallImageNew(var1, 154, var4 + gi / 2, var5 + gi / 2, 0, 3);
                    } else {
                        var3.a(var1, itemSplit, var4, var5);
                        var6 = var4 + 35;
                        var7 = var5 + 25;
                        GameScr var8 = var3;
                        int var9 = var3.qd[itemSplit.upgrade][0];
                        int var10 = 0;
                        int var11;
                        if (itemSplit.options != null) {
                            for (var11 = 0; var11 < itemSplit.options.size(); ++var11) {
                                ItemOption var12;
                                if ((var12 = (ItemOption) itemSplit.options.elementAt(var11)).optionTemplate.id == 104) {
                                    var10 = var12.param;
                                }
                            }
                        }

                        var11 = 0;

                        int var17;
                        for (var17 = 0; var17 < arrItemSplit.length; ++var17) {
                            Item var13;
                            if ((var13 = arrItemSplit[var17]) != null) {
                                var11 += var8.qd[var13.upgrade][1];
                            }
                        }

                        var1.a(0);
                        var1.c(var6, var7 - 5, 60, 5);
                        if ((var17 = var10 * 60 / var9) <= 0) {
                            var17 = 0;
                        } else if (var17 > 60) {
                            var17 = 60;
                        }

                        var1.a(-16711936);
                        var1.c(var6, var7 - 5, var17, 5);
                        int var18;
                        if ((var18 = var11 * 60 / var9) >= 60 - var17) {
                            var18 = 60 - var17;
                        }

                        var1.a(-16346586);
                        var1.c(var6 + var17, var7 - 5, var18, 5);
                        mFont.tahoma_7_yellow.a(var1, var11 + var10 + "/" + var9, var6 + 30, var7 - 5 - 15, 2);
                    }

                    var1.a(12281361);
                    var1.b(var4, var5, gi, gi);
                    var1.a(6425);
                    var1.c(nt - 1, nu - 1, gi * nz + 3, gi * oa + 3);

                    int var15;
                    for (var15 = 0; var15 < oa; ++var15) {
                        for (var6 = 0; var6 < nz; ++var6) {
                            SmallImage.drawSmallImageNew(var1, 154, nt + var6 * gi + gi / 2, nu + var15 * gi + gi / 2, 0, 3);
                            var1.a(12281361);
                            var1.b(nt + var6 * gi, nu + var15 * gi, gi, gi);
                        }
                    }

                    for (var15 = 0; var15 < arrItemSplit.length; ++var15) {
                        Item var16;
                        if ((var16 = arrItemSplit[var15]) != null) {
                            var6 = var15 / nz;
                            var7 = var15 - var6 * nz;
                            if (!var16.isLock) {
                                var1.a(12083);
                                var1.c(nt + var7 * gi + 1, nu + var6 * gi + 1, gi - 1, gi - 1);
                            }

                            var3.a(var1, var16, nt + var7 * gi, nu + var6 * gi);
                            if (var16.quantity > 1) {
                                mFont.number_yellow.a(var1, String.valueOf(var16.quantity), nt + var7 * gi + gi, nu + var6 * gi + gi - mFont.number_yellow.d(), 1);
                            }
                        }
                    }

                    if (indexTitle == 1) {
                        var1.a(16777215);
                        var1.b(var4, var5, gi, gi);
                        return;
                    }

                    if (indexTitle == 2) {
                        var15 = indexSelect / nz;
                        var6 = indexSelect - var15 * nz;
                        var1.a(16777215);
                        var1.b(nt + var6 * gi, nu + var15 * gi, gi, gi);
                        return;
                    }
                } catch (Exception var14) {
                    var14.printStackTrace();
                }

                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gu);
            }
        }

    }

    private void ar(mGraphics var1) {
        if (isPaintGiaoDo) {
            if (indexMenu == 0) {
                String[] var2 = mResources.gt;
                var1 = var1;
                GameScr var3 = this;

                try {
                    oa = 3;
                    Paint.a(eu, et, ev, ew, var1);
                    a(var1, var2[indexMenu], var2.length > 1);
                    nt = eu + 3;
                    nu = et + 34 + gi;
                    int var4 = eu + 45;
                    int var5 = eu + 100;
                    int var6 = nu - gi - 3;
                    if (itemSplit != null) {
                        var3.a(var1, itemSplit, var4, var6);
                    } else {
                        var1.a(6425);
                        var1.c(var4 - 1, var6 - 1, gi + 3, gi + 3);
                        SmallImage.drawSmallImageNew(var1, 154, var4 + gi / 2, var6 + gi / 2, 0, 3);
                    }

                    var1.a(12281361);
                    var1.b(var4, var6, gi, gi);
                    if (itemUpGrade != null) {
                        var3.a(var1, itemUpGrade, var5, var6);
                    } else {
                        var1.a(6425);
                        var1.c(var5 - 1, var6 - 1, gi + 3, gi + 3);
                        SmallImage.drawSmallImageNew(var1, 154, var5 + gi / 2, var6 + gi / 2, 0, 3);
                    }

                    var1.a(12281361);
                    var1.b(var4, var6, gi, gi);
                    var1.b(var5, var6, gi, gi);
                    mFont.tahoma_7b_yellow.a(var1, "+", var4 + gi + 15, var6 + gi / 2 - 5, 2);
                    if (indexTitle == 1) {
                        if (indexSelect == 0) {
                            var1.a(16777215);
                            var1.b(var4, var6, gi, gi);
                        }

                        if (indexSelect == 1) {
                            var1.a(16777215);
                            var1.b(var5, var6, gi, gi);
                        }
                    }

                    int var7;
                    for (var7 = 0; var7 < oa; ++var7) {
                        for (var4 = 0; var4 < nz; ++var4) {
                            var1.a(6425);
                            var1.c(nt + var4 * gi, nu + var7 * gi, gi + 3, gi + 3);
                            SmallImage.drawSmallImageNew(var1, 154, nt + var4 * gi + gi / 2, nu + var7 * gi + gi / 2, 0, 3);
                            var1.a(12281361);
                            var1.b(nt + var4 * gi, nu + var7 * gi, gi, gi);
                        }
                    }

                    if (indexTitle == 2) {
                        var7 = indexSelect / nz;
                        var4 = indexSelect - var7 * nz;
                        var1.a(16777215);
                        var1.b(nt + var4 * gi, nu + var7 * gi, gi, gi);
                    }

                    int var8;
                    int var9;
                    for (var7 = 0; var7 < arrItemUpGrade.length; ++var7) {
                        Item var10;
                        if ((var10 = arrItemUpGrade[var7]) != null) {
                            var9 = var7 / nz;
                            var8 = var7 - var9 * nz;
                            if (!var10.isLock) {
                                var1.a(12083);
                                var1.c(nt + var8 * gi + 1, nu + var9 * gi + 1, gi - 1, gi - 1);
                            }

                            SmallImage.drawSmallImageNew(var1, var10.template.iconID, nt + var8 * gi + gi / 2, nu + var9 * gi + gi / 2, 0, 3);
                        }
                    }

                    if (itemUpGrade != null && itemSplit != null) {
                        var7 = 0;

                        for (var4 = 0; var4 < arrItemUpGrade.length; ++var4) {
                            if (arrItemUpGrade[var4] != null && arrItemUpGrade[var4].template.type == 26) {
                                var7 += cn[arrItemUpGrade[var4].template.id];
                            }
                        }

                        if ((var4 = var7 * 100 / cq[itemSplit.upgrade]) > cv[itemSplit.upgrade]) {
                            var4 = cv[itemSplit.upgrade];
                        }

                        if (hw) {
                            var4 = (int) ((double) var4 * 5.30239915E-315);
                        }

                        mFont var13 = mFont.tahoma_7_yellow;
                        var8 = 0;
                        if (itemSplit.options != null) {
                            for (var9 = 0; var9 < itemSplit.options.size(); ++var9) {
                                ItemOption var11;
                                if ((var11 = (ItemOption) itemSplit.options.elementAt(var9)).optionTemplate.id == 123) {
                                    var8 = var11.param;
                                }
                            }
                        } else {
                            Service.gI().requestItemInfo(itemSplit.typeUI, itemSplit.indexUI);
                        }

                        if (var8 > Char.getMyChar().xu + Char.getMyChar().yen) {
                            var13 = mFont.tahoma_7_red;
                        }

                        var13.a(var1, mResources.b(mResources.hd, NinjaUtil.numberToString(String.valueOf(var8))), nt, nu + oa * gi + 5, 0);
                        mFont.tahoma_7_yellow.a(var1, mResources.hg + ": " + var4 + "%", nt, nu + oa * gi + 17, 0);
                    } else {
                        for (var7 = 0; var7 < mResources.ha.length; ++var7) {
                            mFont.tahoma_7_white.a(var1, mResources.ha[var7], nt, nu + oa * gi + 5 + var7 * 12, 0);
                        }
                    }

                    if (ey != null) {
                        SmallImage.drawSmallImageNew(var1, ey.arrEfInfo[ex].idImg, var5 + gi / 2 + ey.arrEfInfo[ex].dx + 1, var6 + gi / 2 + 9 + ey.arrEfInfo[ex].dy, 0, 3);
                        if (GameCanvas.u % 2 == 0 && ++ex >= ey.arrEfInfo.length) {
                            ex = 0;
                            ey = null;
                            return;
                        }
                    }
                } catch (Exception var12) {
                    var12.printStackTrace();
                }

                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gt);
            }
        }

    }

    private void as(mGraphics var1) {
        if (isPaintThaoNgoc) {
            if (indexMenu == 0) {
                this.a(var1, mResources.gw, (byte) 0);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gw);
            }
        }

    }

    private void at(mGraphics var1) {
        if (im) {
            if (indexMenu == 0) {
                this.a(var1, mResources.gx, (byte) 1);
                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gx);
            }
        }

    }

    private void a(mGraphics var1, String[] var2, byte var3) {
        try {
            oa = 5;
            Paint.a(eu, et, ev, ew, var1);
            a(var1, var2, false);
            var1.a(6693376);
            var1.c(eu + 3, et + 32, 168, 140);
            var1.a(13408563);
            var1.b(eu + 3, et + 32, 168, 140);
            int var4 = eu + 74;
            int var5 = et + 40 + gi;
            if (itemSplit != null) {
                var1.a(6425);
                var1.c(var4 - 1, var5 - 1, gi + 3, gi + 3);
                SmallImage.drawSmallImageNew(var1, 154, var4 + gi / 2, var5 + gi / 2, 0, 3);
                this.a(var1, itemSplit, var4, var5);
                if (itemSplit.quantity > 1) {
                    mFont.number_yellow.a(var1, "" + itemSplit.quantity, var4 + gi, var5 + gi / 2 + 6, 1);
                }

                var1.a(indexTitle == 1 ? 16777215 : 12281361);
                var1.b(var4, var5, gi, gi);
            } else {
                var1.a(6425);
                var1.c(var4 - 1, var5 - 1, gi + 3, gi + 3);
                SmallImage.drawSmallImageNew(var1, 154, var4 + gi / 2, var5 + gi / 2, 0, 3);
                var1.a(12281361);
                var1.b(var4, var5, gi, gi);
            }

            if (itemSplit != null) {
                int var6 = 0;
                if (itemSplit.options != null) {
                    for (int var7 = 0; var7 < itemSplit.options.size(); ++var7) {
                        ItemOption var8;
                        if ((var8 = (ItemOption) itemSplit.options.elementAt(var7)).optionTemplate.id == 122) {
                            var6 = var8.param;
                        }
                    }
                } else {
                    Service.gI().requestItemInfo(itemSplit.typeUI, itemSplit.indexUI);
                }

                String var12 = mResources.nf;
                String var13 = var6 + mResources.kj;
                String var9 = mResources.v;
                if (var3 == 0) {
                    var12 = mResources.ne;
                    var13 = ip[itemSplit.upgrade] + mResources.ki;
                    var9 = mResources.u;
                }

                mFont.tahoma_7_white.a(var1, var12, var4 + gi / 2, var5 + 3 * gi / 2 + 2, 2);
                mFont.tahoma_7_yellow.a(var1, var13, var4 + gi / 2, var5 + 3 * gi / 2 + 14, 2);
                String[] var10 = mFont.tahoma_7_white.splitFontArray(var9, 130);

                for (var5 = 0; var5 < var10.length; ++var5) {
                    mFont.tahoma_7_white.a(var1, var10[var5], var4 + gi / 2, et + ew - 25 + var5 * 12 - 2, 2);
                }

                return;
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }

    }

    private static void hr() {
        try {
            if (isPaintThaoNgoc) {
                if (Char.getMyChar().arrItemBag[indexSelect].isTypeNgocKham()) {
                    itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    return;
                }
            } else if (im && Char.getMyChar().arrItemBag[indexSelect].isTypeBody()) {
                itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                return;
            }
        } catch (Exception var1) {
            GameCanvas.msgdlg.setInfo(mResources.j, (Command1) null, new Command1(mResources.aq, 2), (Command1) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }

    }

    private void au(mGraphics var1) {
        if (isPaintGotNgoc) {
            if (indexMenu == 0) {
                Item[] var2 = arrItemSplit;
                String[] var3 = mResources.gv;
                var1 = var1;

                try {
                    b(var1);
                    a(var1, var3, true);
                    if (var2 == null) {
                        GameCanvas.a(eu + 90, et + 75, var1);
                        mFont.tahoma_7b_white.a(var1, mResources.ag, eu + 90, et + 90, 2);
                        return;
                    }

                    if (var2.length <= 30) {
                        oa = 5;
                    } else if (var2.length % nz == 0) {
                        oa = var2.length / nz;
                    } else {
                        oa = var2.length / nz + 1;
                    }

                    aq.a(oa, gi, nt, nu, nz * gi, 5 * gi, true, 6);
                    aq.a(var1, nt, nu, aq.e + 2, aq.f + 2);

                    int var4;
                    int var5;
                    for (var5 = 0; var5 < oa; ++var5) {
                        for (var4 = 0; var4 < nz; ++var4) {
                            SmallImage.drawSmallImageNew(var1, 154, nt + var4 * gi + gi / 2, nu + var5 * gi + gi / 2, 0, 3);
                            var1.a(12281361);
                            var1.b(nt + var4 * gi, nu + var5 * gi, gi, gi);
                        }
                    }

                    for (var5 = 0; var5 < var2.length; ++var5) {
                        Item var6;
                        if ((var6 = var2[var5]) != null) {
                            int var7 = var5 / nz;
                            int var8 = var5 - var7 * nz;
                            if (!var6.isLock) {
                                var1.a(12083);
                                var1.c(nt + var8 * gi + 1, nu + var7 * gi + 1, gi - 1, gi - 1);
                                SmallImage.drawSmallImageNew(var1, 154, nt + var8 * gi + gi / 2, nu + var7 * gi + gi / 2, 0, 3);
                            }

                            SmallImage.drawSmallImageNew(var1, var6.template.iconID, nt + var8 * gi + gi / 2, nu + var7 * gi + gi / 2, 0, 3);
                        }
                    }

                    if (indexTitle > 0 && indexSelect >= 0) {
                        var5 = indexSelect / nz;
                        var4 = indexSelect - var5 * nz;
                        var1.a(16777215);
                        var1.b(nt + var4 * gi, nu + var5 * gi, gi, gi);
                        a(nt + var4 * gi, nu + var5 * gi, var1);
                        return;
                    }
                } catch (Exception var9) {
                }

                return;
            }

            if (indexMenu == 1) {
                this.a(var1, mResources.gv);
            }
        }

    }

    private void hs() {
        for (int var1 = 0; var1 < arrItemSplit.length; ++var1) {
            if (arrItemSplit[var1] == null) {
                arrItemSplit[var1] = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                super.left = super.center = null;
                this.updateCommandForUI();
                return;
            }
        }

    }

    private void ht() {
        MyVector var1 = new MyVector();

        for (int var2 = 0; var2 < arrItemSplit.length; ++var2) {
            if (arrItemSplit[var2] != null) {
                var1.addElement(this.mf);
                break;
            }
        }

        if (arrItemSplit.length > 0) {
            var1.addElement(new Command1(mResources.gv[0], 403));
        }

        GameCanvas.menu.startAt(var1);
    }

    private void hu() {
        Item var1 = getItemFocus(48);
        arrItemSplit[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void hv() {
        Service.gI().giaodo(arrItemSplit);
    }

    public static void a(Mob var0, int var1) {
        MobTemplate var2;
        if ((var2 = Mob.arrMobTemplate[var0.templateId]).type != 0) {
            var0.dir = var1 % 3 == 0 ? -1 : 1;
            var0.x += 10 - var1 % 20;
        }

        Auto.a(var0);
        if (!qg.contains(var2) && !var0.isBoss && (var0.templateId != 179 && var0.templateId != 175 && var0.templateId != 202 || var0.status != 8)) {
            qg.addElement(var2);
        }

        vMobAttack.addElement(var0);
    }

    public static void h(int var0) {
        Npc var1;
        if ((var1 = i(var0)) != null) {
            Char.b(var1.cx, var1.cy);
            Char.getMyChar().npcFocus = var1;
            Service.gI().openMenu(var1.template.npcTemplateId);
        }

    }

    public static void b(int var0, int var1, int var2) {
        if (System.currentTimeMillis() < 500L) {
            ThreadUtil.ThreadCatch(500L - System.currentTimeMillis());
        }

        Npc var3;
        if ((var3 = i(var0)) != null) {
            Char.b(var3.cx, var3.cy);
            Char.getMyChar().npcFocus = var3;
            Service.gI().openMenu(var3.template.npcTemplateId);
            Service.gI().menu(var0, var1, var2);
        }

    }

    public static Npc i(int var0) {
        Char var1 = Char.getMyChar();
        MyVector var2 = vSet;
        int var3 = -1;
        Npc var4 = null;

        for (int var5 = 0; var5 < var2.size(); ++var5) {
            Npc var6;
            if ((var6 = (Npc) var2.elementAt(var5)) != null && var0 == var6.template.npcTemplateId) {
                int var7 = Res.a(var1.cx, var1.cy, var6.cx, var6.cy);
                if (var3 == -1 || var7 < var3) {
                    var3 = var7;
                    var4 = var6;
                }
            }
        }

        return var4;
    }

    public static void addChatPopup(String var0) {
        ChatPopup.addChatPopupMultiLine("[" + mResources.ag + "] " + var0, Char.getMyChar());
    }

    public final void j(int var1) {
        (new Thread(new Class_bd(this, var1))).start();
    }

    static void a(GameScr var0, byte var1) {
        var0.e(var1);
    }

    public static void ap() {
        instance = null;
        gW = 0;
        gH = 0;
        gW2 = 0;
        gssw = 0;
        gssh = 0;
        gH34 = 0;
        gW3 = 0;
        gH3 = 0;
        gH23 = 0;
        gW23 = 0;
        gH2 = 0;
        csPadMaxH = 0;
        cmdBarH = 0;
        gW34 = 0;
        gW6 = 0;
        gH6 = 0;
        cmx = 0;
        cmy = 0;
        cmdx = 0;
        cmdy = 0;
        cmvx = 0;
        cmvy = 0;
        p = 0;
        q = 0;
        r = 0;
        s = null;
        t = null;
        parts = null;
        v = null;
        vMobSoul = null;
        vClan = null;
        vParty = null;
        vPtMap = null;
        vFriend = null;
        vList = null;
        vFriendWait = null;
        vEnemies = null;
        vCharInMap = null;
        vItemMap = null;
        vMobAttack = null;
        vSet = null;
        vMob = null;
        vNpc = null;
        nClasss = null;
        gi = 0;
        indexTitle = 0;
        indexSelect = 0;
        indexRow = 0;
        gk = 0;
        indexMenu = 0;
        an = 0;
        iOptionTemplates = null;
        sOptionTemplates = null;
        scrInfo = null;
        aq = null;
        arrItemNonNam = null;
        arrItemNonNu = null;
        arrItemAoNam = null;
        arrItemAoNu = null;
        arrItemGangTayNam = null;
        arrItemGangTayNu = null;
        arrItemQuanNam = null;
        arrItemQuanNu = null;
        arrItemGiayNam = null;
        arrItemGiayNu = null;
        arrItemLien = null;
        arrItemNhan = null;
        arrItemNgocBoi = null;
        arrItemPhu = null;
        arrItemWeapon = null;
        arrItemStack = null;
        arrItemStackLock = null;
        arrItemGrocery = null;
        arrItemGroceryLock = null;
        arrItemStore = null;
        arrItemElites = null;
        arrItemClanShop = null;
        arrItemBook = null;
        arrItemFashion = null;
        arrItemUpPeal = null;
        arrItemUpGrade = null;
        arrItemSplit = null;
        arrItemTradeMe = null;
        arrItemTradeOrder = null;
        arrItemConvert = null;
        arrItemStands = null;
        bw = null;
        itemUpGrade = null;
        itemSplit = null;
        itemSell = null;
        gn = false;
        isViewNext = false;
        gp = false;
        gq = false;
        cb = false;
        gr = false;
        cc = false;
        gs = false;
        isPaintAuctionSale = false;
        isPaintAlert = false;
        isPaintTask = false;
        isPaintTeam = false;
        isPaintFindTeam = false;
        isPaintFriend = false;
        isPaintList = false;
        isPaintEnemies = false;
        isPaintItemInfo = false;
        gy = false;
        isPaintInfoMe = false;
        isPaintStore = false;
        isPaintEliteShop = false;
        isPaintNonNam = false;
        isPaintNonNu = false;
        isPaintAoNam = false;
        isPaintAoNu = false;
        isPaintGangTayNam = false;
        isPaintGangTayNu = false;
        isPaintQuanNam = false;
        isPaintQuanNu = false;
        isPaintGiayNam = false;
        isPaintGiayNu = false;
        isPaintLien = false;
        isPaintNhan = false;
        isPaintNgocBoi = false;
        isPaintPhu = false;
        isPaintWeapon = false;
        isPaintStack = false;
        isPaintStackLock = false;
        isPaintGrocery = false;
        isPaintGroceryLock = false;
        isPaintUpGrade = false;
        isPaintConvert = false;
        hw = false;
        isPaintUpPearl = false;
        isPaintBox = false;
        isPaintSplit = false;
        isPaintCharInMap = false;
        isPaintLuyenNgoc = false;
        ib = false;
        isPaintAuto = false;
        isPaintMessage = false;
        isPaintClan = false;
        id = false;
        isPaintLuckySpin = false;
        isPaintAuctionBuy = false;
        isPaintLuyenThach = false;
        isPaintTinhluyen = false;
        isPaintDichChuyen = false;
        isPaintKhamNgoc = false;
        isPaintGiaoDo = false;
        isPaintThaoNgoc = false;
        im = false;
        isPaintLucky_Draw = false;
        isPaintGotNgoc = false;
        currentCharViewInfo = null;
        exps = null;
        cn = null;
        co = null;
        cp = null;
        cq = null;
        cr = null;
        cs = null;
        ct = null;
        cu = null;
        cv = null;
        cw = null;
        ip = null;
        df = (byte[][]) null;
        dg = (byte[][]) null;
        dh = 0;
        di = 0;
        dj = 0;
        dk = 0;
        dl = 0;
        dm = 0;
        dn = 0;
        doa = 0;
        ja = null;
        jb = null;
        jc = null;
        jd = null;
        je = null;
        jf = null;
        jg = null;
        jh = null;
        ji = null;
        jj = null;
        jk = null;
        jl = null;
        jm = null;
        jn = null;
        dp = null;
        dq = null;
        dr = null;
        ds = null;
        jo = null;
        dt = null;
        du = null;
        jp = 0;
        dz = 0;
        ef = null;
        eg = null;
        eh = null;
        ju = null;
        ei = null;
        ej = null;
        ek = null;
        el = null;
        em = null;
        en = false;
        eo = false;
        keySkill = null;
        onScreenSkill = null;
        ep = 0;
        eq = 0;
        er = 0;
        kg = 0;
        kh = 0;
        ki = 0;
        kj = 0;
        kk = 0;
        kl = 0;
        km = 0;
        kn = 0;
        ko = 0;
        kp = 0;
        kq = 0;
        kr = 0;
        ks = 0;
        kt = 0;
        ku = 0;
        kv = 0;
        kw = 0;
        kx = null;
        ky = null;
        kz = 0;
        la = 0;
        lb = 0;
        lc = null;
        ld = null;
        le = null;
        lf = null;
        lg = null;
        lh = null;
        li = null;
        lj = null;
        lk = null;
        ll = null;
        lm = null;
        ln = null;
        lo = null;
        lp = 0;
        lq = 0;
        lr = 0;
        ls = 0;
        lt = 0;
        lu = 0;
        lv = 0;
        lw = 0;
        lx = 0;
        ly = 0;
        lz = 0;
        ma = null;
        et = 0;
        eu = 0;
        nt = 0;
        nu = 0;
        ev = 0;
        ew = 0;
        nv = 0;
        nw = 0;
        nx = 0;
        ny = 0;
        nz = 0;
        oa = 0;
        ex = 0;
        ey = null;
        of = 0;
        og = 0;
        inforW = 0;
        inforH = 0;
        ou = 0L;
        ov = 0;
        ow = null;
        ox = null;
        fa = 0;
        fb = 0;
        fc = 0;
        fd = 0;
        fe = false;
        qe = null;
        ff = false;
        isPaintTrade = false;
        qg = null;
        fi = 0;
        fj = false;
        qh = 0L;
    }

    static {
        Main.main(2);
        init();
    }
}

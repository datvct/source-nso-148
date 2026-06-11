import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class TileMap {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int tileID;
    public static char[] f;
    public static int[] g;
    private static Image ai;
    private static Image aj;
    public static Image h;
    private static Image ak;
    private static Image al;
    private static Image am;
    private static Image an;
    private static Image ao;
    public static byte i;
    private static int ap;
    private static int aq;
    public static String j;
    public static String mapName;
    public static byte zoneID;
    public static byte bgID;
    public static byte typeMap;
    public static short mapID;
    public static short p;
    private static int ar;
    private static int as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static int ax;
    private static int ay;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static MyVector vGo;
    public static String[] v;
    public static mHashtable w;
    public static mHashtable x;
    private static int az;
    public static int y;
    public static int z;
    public static int aa;
    public static int ab;
    public static int ac;
    public static int ad;
    public static int ae;
    private static int[] ba;
    private static short[][] bb;
    private static boolean[] bc;
    private static int[] bd;
    private static short[] be;
    public static int af;
    public static boolean ag;
    public static boolean ah;
    private static Object bf;
    private static byte[][] bg;
    private static Image[] bh;
    private static Image[] bi;

    public static void a() {
        i = 24;
        j = null;
        mapName = "";
        p = 0;
        vGo = new MyVector();
        w = new mHashtable();
        x = new mHashtable();
        y = 2;
        ba = new int[]{5257738, 8807192};
        bb = new short[160][];
        bc = new boolean[160];
        bd = new int[160];
        be = new short[160];
        bb[0] = new short[]{27};
        bb[1] = new short[]{2, 3, 27, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80};
        bb[2] = new short[]{6, 1};
        bb[3] = new short[]{1, 4};
        bb[4] = new short[]{3, 5};
        bb[5] = new short[]{7, 4};
        bb[6] = new short[]{7, 2, 20, 21};
        bb[7] = new short[]{6, 5, 8};
        bb[8] = new short[]{7, 9};
        bb[9] = new short[]{8, 10};
        bb[10] = new short[]{9, 11, 17, 22, 32, 38, 43, 48, 139};
        bb[11] = new short[]{12, 10};
        bb[12] = new short[]{11, 57};
        bb[13] = new short[]{57, 14};
        bb[14] = new short[]{13, 15};
        bb[15] = new short[]{14, 16};
        bb[16] = new short[]{15, 17};
        bb[17] = new short[]{16, 18, 10, 22, 32, 38, 43, 48, 139};
        bb[18] = new short[]{17, 19};
        bb[19] = new short[]{18, 58};
        bb[20] = new short[]{6};
        bb[21] = new short[]{22, 6};
        bb[22] = new short[]{23, 21, 10, 17, 32, 38, 43, 48, 139};
        bb[23] = new short[]{22, 69, 25};
        bb[24] = new short[]{59, 36};
        bb[25] = new short[]{23, 26};
        bb[26] = new short[]{27, 25};
        bb[27] = new short[]{26, 28, 1, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80};
        bb[28] = new short[]{27, 60};
        bb[29] = new short[]{60, 30};
        bb[30] = new short[]{29, 31};
        bb[31] = new short[]{32, 30};
        bb[32] = new short[]{31, 61, 10, 17, 22, 38, 43, 48, 139};
        bb[33] = new short[]{61, 34};
        bb[34] = new short[]{35, 33};
        bb[35] = new short[]{34, 66};
        bb[36] = new short[]{37, 24};
        bb[37] = new short[]{36};
        bb[38] = new short[]{67, 68, 10, 17, 22, 32, 43, 48, 139};
        bb[39] = new short[]{72, 46, 40};
        bb[40] = new short[]{39, 65, 41};
        bb[41] = new short[]{42, 40, 43};
        bb[42] = new short[]{62, 41};
        bb[43] = new short[]{41, 44, 10, 17, 22, 32, 38, 48, 139};
        bb[44] = new short[]{43, 45};
        bb[45] = new short[]{44, 53};
        bb[46] = new short[]{63, 39, 47};
        bb[47] = new short[]{46, 48};
        bb[48] = new short[]{47, 50, 10, 17, 22, 32, 38, 43, 139};
        bb[49] = new short[]{50, 51};
        bb[50] = new short[]{48, 49};
        bb[51] = new short[]{52, 49};
        bb[52] = new short[]{51, 64};
        bb[53] = new short[]{54, 45};
        bb[54] = new short[]{55, 53};
        bb[55] = new short[]{54};
        bb[56] = new short[]{72};
        bb[57] = new short[]{12, 13};
        bb[58] = new short[]{19};
        bb[59] = new short[]{68, 24};
        bb[60] = new short[]{28, 29};
        bb[61] = new short[]{33, 32};
        bb[62] = new short[]{42};
        bb[63] = new short[]{46};
        bb[64] = new short[]{52};
        bb[65] = new short[]{40};
        bb[66] = new short[]{67, 35};
        bb[67] = new short[]{66, 38};
        bb[68] = new short[]{59, 38};
        bb[69] = new short[]{70, 23};
        bb[70] = new short[]{69, 71};
        bb[71] = new short[]{72, 70};
        bb[72] = new short[]{71, 39, 1, 27, 91, 94, 105, 114, 125, 157, 139, 113, 80};
        bb[73] = new short[]{1};
        bb[74] = new short[0];
        bb[75] = new short[0];
        bb[76] = new short[0];
        bb[77] = new short[0];
        bb[78] = new short[0];
        bb[79] = new short[0];
        bb[80] = new short[]{81, 82, 83};
        bb[81] = new short[]{80, 84};
        bb[82] = new short[]{80, 85};
        bb[83] = new short[]{80, 86};
        bb[84] = new short[]{81, 87};
        bb[85] = new short[]{82, 88};
        bb[86] = new short[]{83, 89};
        bb[87] = new short[]{84, 90};
        bb[88] = new short[]{85, 90};
        bb[89] = new short[]{86, 90};
        bb[90] = new short[0];
        bb[91] = new short[]{92};
        bb[92] = new short[]{91, 93};
        bb[93] = new short[]{92};
        bb[94] = new short[]{95};
        bb[95] = new short[]{94, 96};
        bb[96] = new short[]{95, 97};
        bb[97] = new short[]{96};
        bb[98] = new short[]{99};
        bb[99] = new short[]{98, 101, 100, 102};
        bb[100] = new short[]{99, 103};
        bb[101] = new short[]{99, 103};
        bb[102] = new short[]{99, 103};
        bb[103] = new short[]{101, 102, 104, 100};
        bb[104] = new short[]{103};
        bb[105] = new short[]{107, 106, 108};
        bb[106] = new short[]{105, 109};
        bb[107] = new short[]{105, 109};
        bb[108] = new short[]{105, 109};
        bb[109] = new short[]{106, 107, 108};
        bb[110] = new short[0];
        bb[111] = new short[0];
        bb[112] = new short[]{113};
        bb[113] = new short[]{112};
        bb[114] = new short[]{115};
        bb[115] = new short[]{114, 116};
        bb[116] = new short[]{115};
        bb[117] = new short[0];
        bb[118] = new short[0];
        bb[119] = new short[0];
        bb[120] = new short[0];
        bb[121] = new short[0];
        bb[122] = new short[0];
        bb[123] = new short[0];
        bb[124] = new short[0];
        bb[125] = new short[]{126};
        bb[126] = new short[]{125, 127};
        bb[127] = new short[]{126, 128};
        bb[128] = new short[]{127};
        bb[129] = new short[0];
        bb[130] = new short[0];
        bb[131] = new short[0];
        bb[132] = new short[0];
        bb[133] = new short[0];
        bb[134] = new short[]{138};
        bb[135] = new short[]{138};
        bb[136] = new short[]{138};
        bb[137] = new short[]{138};
        bb[138] = new short[]{134, 135, 136, 137};
        bb[139] = new short[]{140};
        bb[140] = new short[]{139, 141};
        bb[141] = new short[]{140, 142};
        bb[142] = new short[]{141, 143};
        bb[143] = new short[]{142, 144};
        bb[144] = new short[]{143, 145};
        bb[145] = new short[]{144, 146};
        bb[146] = new short[]{145, 147};
        bb[147] = new short[]{146, 148};
        bb[148] = new short[]{147};
        bb[149] = new short[0];
        bb[150] = new short[0];
        bb[151] = new short[0];
        bb[152] = new short[0];
        bb[153] = new short[0];
        bb[154] = new short[0];
        bb[155] = new short[0];
        bb[156] = new short[0];
        bb[157] = new short[]{158, 159};
        bb[158] = new short[]{157, 159};
        bb[159] = new short[]{158, 157};
        af = -1;
        ag = false;
        ah = false;
        bf = new Object();
        bg = new byte[160][];

        for (int var0 = 0; var0 < 160; ++var0) {
            int var1 = var0;
            InputStream var2 = null;

            try {
                var2 = "".getClass().getResourceAsStream("/map/" + var1);
                bg[var1] = new byte[var2.available()];
                var2.read(bg[var1]);
                var2.close();
            } catch (Exception var12) {
                var12.printStackTrace();
            } finally {
                try {
                    var2.close();
                } catch (Exception var11) {
                }

            }
        }

        bh = new Image[5];
        bi = new Image[5];
    }

    public static void a(int var0, int var1, int var2, int var3) {
        q = var2;
        r = var3;
        s = var0;
        t = var1;
    }

    public static void b() {
        av = Char.getMyChar().cx / 12;
        ar = Char.getMyChar().cy / 12;
        if (av > a * y - q / 2) {
            av = a * y - q;
        } else if (av < q / 2) {
            av = 0;
        } else {
            av -= q / 2;
        }

        if (ar < r / 2) {
            ar = 0;
        } else {
            ar -= r / 2;
        }

        if (ar > b * y - r) {
            ar = b * y - r;
        }

    }

    public static void c() {
        if (a * y >= q || b * y >= r) {
            if (as != ar) {
                au = ar - as << 2;
                at += au;
                as += at >> 4;
                at &= 15;
            }

            if (aw != av) {
                ay = av - aw << 2;
                ax += ay;
                aw += ax >> 4;
                ax &= 15;
            }
        }

    }

    public static void d() {
        ai = null;
        System.gc();
    }

    static final void e() {
        if (an == null) {
            an = GameCanvas.loadImage("/t/uwt.png");
        }

        if (ak == null) {
            ak = GameCanvas.loadImage("/t/wtf.png");
        }

        if (al == null) {
            al = GameCanvas.loadImage("/t/twtf.png");
        }

        if (am == null) {
            am = GameCanvas.loadImage("/t/wts.png");
        }

        if (ao == null) {
            ao = GameCanvas.loadImage("/t/wts1.png");
        }

        System.gc();
    }

    public static void a(int var0) {
        d = b * i;
        c = a * i;

        try {
            for (int var1 = 0; var1 < a * b; ++var1) {
                int[] var6;
                if (w != null && w.get(String.valueOf(var1)) != null) {
                    var6 = g;
                    var6[var1] |= 2;
                }

                if (var0 == 4) {
                    if (f[var1] == 1 || f[var1] == 2 || f[var1] == 3 || f[var1] == 4 || f[var1] == 5 || f[var1] == 6 || f[var1] == '\t' || f[var1] == '\n' || f[var1] == 'O' || f[var1] == 'P' || f[var1] == '\r' || f[var1] == 14 || f[var1] == '+' || f[var1] == ',' || f[var1] == '-' || f[var1] == '2') {
                        var6 = g;
                        var6[var1] |= 2;
                    }

                    if (f[var1] == '\t' || f[var1] == 11) {
                        var6 = g;
                        var6[var1] |= 4;
                    }

                    if (f[var1] == '\n' || f[var1] == '\f') {
                        var6 = g;
                        var6[var1] |= 8;
                    }

                    if (f[var1] == '\r' || f[var1] == 14) {
                        var6 = g;
                        var6[var1] |= 1024;
                    }

                    if (f[var1] == 'L' || f[var1] == 'M') {
                        var6 = g;
                        var6[var1] |= 64;
                        if (f[var1] == 'N') {
                            var6 = g;
                            var6[var1] |= 4096;
                        }
                    }
                }

                if (var0 == 1) {
                    if (f[var1] == 22) {
                        az = f[var1] - 1;
                    }

                    if (f[var1] == 1 || f[var1] == 2 || f[var1] == 3 || f[var1] == 4 || f[var1] == 5 || f[var1] == 6 || f[var1] == 7 || f[var1] == '$' || f[var1] == '%' || f[var1] == '6' || f[var1] == '[' || f[var1] == '\\' || f[var1] == ']' || f[var1] == '^' || f[var1] == 'I' || f[var1] == 'J' || f[var1] == 'a' || f[var1] == 'b' || f[var1] == 't' || f[var1] == 'u' || f[var1] == 'v' || f[var1] == 'x' || f[var1] == '=') {
                        var6 = g;
                        var6[var1] |= 2;
                    }

                    if (f[var1] == 2 || f[var1] == 3 || f[var1] == 4 || f[var1] == 5 || f[var1] == 6 || f[var1] == 20 || f[var1] == 21 || f[var1] == 22 || f[var1] == 23 || f[var1] == '$' || f[var1] == '%' || f[var1] == '&' || f[var1] == '\'' || f[var1] == '=') {
                        var6 = g;
                        var6[var1] |= 4096;
                    }

                    if (f[var1] == '\b' || f[var1] == '\t' || f[var1] == '\n' || f[var1] == '\f' || f[var1] == '\r' || f[var1] == 14 || f[var1] == 30) {
                        var6 = g;
                        var6[var1] |= 16;
                    }

                    if (f[var1] == 17) {
                        var6 = g;
                        var6[var1] |= 32;
                    }

                    if (f[var1] == 18) {
                        var6 = g;
                        var6[var1] |= 128;
                    }

                    if (f[var1] == '%' || f[var1] == '&' || f[var1] == '=') {
                        var6 = g;
                        var6[var1] |= 4;
                    }

                    if (f[var1] == '$' || f[var1] == '\'' || f[var1] == '=') {
                        var6 = g;
                        var6[var1] |= 8;
                    }

                    if (f[var1] == 19) {
                        var6 = g;
                        var6[var1] |= 64;
                        if ((g[var1 - a] & 4096) == 4096) {
                            var6 = g;
                            var6[var1] |= 4096;
                        }
                    }

                    if (f[var1] == '#') {
                        var6 = g;
                        var6[var1] |= 2048;
                    }

                    if (f[var1] == 7) {
                        var6 = g;
                        var6[var1] |= 1024;
                    }

                    if (f[var1] == ' ' || f[var1] == '!' || f[var1] == '"') {
                        var6 = g;
                        var6[var1] |= 256;
                    }
                }

                if (var0 == 2) {
                    if (f[var1] == 22 || f[var1] == 'g' || f[var1] == 'o') {
                        az = f[var1] - 1;
                    }

                    if (f[var1] == 1 || f[var1] == 2 || f[var1] == 3 || f[var1] == 4 || f[var1] == 5 || f[var1] == 6 || f[var1] == 7 || f[var1] == '$' || f[var1] == '%' || f[var1] == '6' || f[var1] == '=' || f[var1] == 'I' || f[var1] == 'L' || f[var1] == 'M' || f[var1] == 'N' || f[var1] == 'O' || f[var1] == 'R' || f[var1] == 'S' || f[var1] == 'b' || f[var1] == 'c' || f[var1] == 'd' || f[var1] == 'f' || f[var1] == 'g' || f[var1] == 'l' || f[var1] == 'm' || f[var1] == 'n' || f[var1] == 'p' || f[var1] == 'q' || f[var1] == 't' || f[var1] == 'u' || f[var1] == '}' || f[var1] == '~' || f[var1] == 127 || f[var1] == 129 || f[var1] == 130) {
                        var6 = g;
                        var6[var1] |= 2;
                    }

                    if (f[var1] == 1 || f[var1] == 3 || f[var1] == 4 || f[var1] == 5 || f[var1] == 6 || f[var1] == 20 || f[var1] == 21 || f[var1] == 22 || f[var1] == 23 || f[var1] == '$' || f[var1] == '%' || f[var1] == '&' || f[var1] == '\'' || f[var1] == '7' || f[var1] == 'm' || f[var1] == 'o' || f[var1] == 'p' || f[var1] == 'q' || f[var1] == 'r' || f[var1] == 's' || f[var1] == 't' || f[var1] == 127 || f[var1] == 129 || f[var1] == 130) {
                        var6 = g;
                        var6[var1] |= 4096;
                    }

                    if (f[var1] == '\b' || f[var1] == '\t' || f[var1] == '\n' || f[var1] == '\f' || f[var1] == '\r' || f[var1] == 14 || f[var1] == 30 || f[var1] == 135) {
                        var6 = g;
                        var6[var1] |= 16;
                    }

                    if (f[var1] == 17) {
                        var6 = g;
                        var6[var1] |= 32;
                    }

                    if (f[var1] == 18) {
                        var6 = g;
                        var6[var1] |= 128;
                    }

                    if (f[var1] == '=' || f[var1] == '%' || f[var1] == '&' || f[var1] == 127 || f[var1] == 130 || f[var1] == 131) {
                        var6 = g;
                        var6[var1] |= 4;
                    }

                    if (f[var1] == '=' || f[var1] == '$' || f[var1] == '\'' || f[var1] == 127 || f[var1] == 129 || f[var1] == 132) {
                        var6 = g;
                        var6[var1] |= 8;
                    }

                    if (f[var1] == 19) {
                        var6 = g;
                        var6[var1] |= 64;
                        if ((g[var1 - a] & 4096) == 4096) {
                            var6 = g;
                            var6[var1] |= 4096;
                        }
                    }

                    if (f[var1] == 134) {
                        var6 = g;
                        var6[var1] |= 64;
                        if ((g[var1 - a] & 4096) == 4096) {
                            var6 = g;
                            var6[var1] |= 4096;
                        }
                    }

                    if (f[var1] == '#') {
                        var6 = g;
                        var6[var1] |= 2048;
                    }

                    if (f[var1] == 7) {
                        var6 = g;
                        var6[var1] |= 1024;
                    }

                    if (f[var1] == ' ' || f[var1] == '!' || f[var1] == '"') {
                        var6 = g;
                        var6[var1] |= 256;
                    }

                    if (f[var1] == '=' || f[var1] == 127) {
                        var6 = g;
                        var6[var1] |= 8192;
                    }
                }

                if (var0 == 3) {
                    if (f[var1] == '\f' || f[var1] == '3' || f[var1] == 'X' || f[var1] == 't' || f[var1] == 128) {
                        az = f[var1] - 1;
                    }

                    if (f[var1] == 'm' || f[var1] == 'n') {
                        az = f[var1];
                    }

                    if (f[var1] == 1 || f[var1] == 2 || f[var1] == 3 || f[var1] == 4 || f[var1] == 5 || f[var1] == 6 || f[var1] == 7 || f[var1] == 11 || f[var1] == 14 || f[var1] == 17 || f[var1] == '+' || f[var1] == '3' || f[var1] == '?' || f[var1] == 'A' || f[var1] == 'C' || f[var1] == 'D' || f[var1] == 'G' || f[var1] == 'H' || f[var1] == 'S' || f[var1] == 'T' || f[var1] == 'U' || f[var1] == 'W' || f[var1] == '[' || f[var1] == '^' || f[var1] == 'a' || f[var1] == 'b' || f[var1] == 'j' || f[var1] == 'k' || f[var1] == 'o' || f[var1] == 'q' || f[var1] == 'u' || f[var1] == 'v' || f[var1] == 'w' || f[var1] == '}' || f[var1] == '~' || f[var1] == 129 || f[var1] == 130 || f[var1] == 131 || f[var1] == 133 || f[var1] == 136 || f[var1] == 138 || f[var1] == 139 || f[var1] == 142) {
                        var6 = g;
                        var6[var1] |= 2;
                    }

                    if (f[var1] == '|' || f[var1] == 't' || f[var1] == '{' || f[var1] == ',' || f[var1] == '\f' || f[var1] == 15 || f[var1] == 16 || f[var1] == '-' || f[var1] == '\n' || f[var1] == '\t') {
                        var6 = g;
                        var6[var1] |= 4096;
                    }

                    if (f[var1] == 23) {
                        var6 = g;
                        var6[var1] |= 32;
                    }

                    if (f[var1] == 24) {
                        var6 = g;
                        var6[var1] |= 128;
                    }

                    if (f[var1] == 6 || f[var1] == 15 || f[var1] == '3' || f[var1] == '_' || f[var1] == 'a' || f[var1] == 'j' || f[var1] == 'o' || f[var1] == '{' || f[var1] == '}' || f[var1] == 138 || f[var1] == 140) {
                        var6 = g;
                        var6[var1] |= 4;
                    }

                    if (f[var1] == 7 || f[var1] == 16 || f[var1] == '3' || f[var1] == '`' || f[var1] == 'b' || f[var1] == 'k' || f[var1] == 'o' || f[var1] == '|' || f[var1] == '~' || f[var1] == 139 || f[var1] == 141) {
                        var6 = g;
                        var6[var1] |= 8;
                    }

                    if (f[var1] == 25) {
                        var6 = g;
                        var6[var1] |= 64;
                        if ((g[var1 - a] & 4096) == 4096) {
                            var6 = g;
                            var6[var1] |= 4096;
                        }
                    }

                    if (f[var1] == '"') {
                        var6 = g;
                        var6[var1] |= 2048;
                    }

                    if (f[var1] == 17) {
                        var6 = g;
                        var6[var1] |= 1024;
                    }

                    if (f[var1] == '!' || f[var1] == 'g' || f[var1] == 'h' || f[var1] == 'i' || f[var1] == 26 || f[var1] == '!') {
                        var6 = g;
                        var6[var1] |= 256;
                    }

                    if (f[var1] == '3' || f[var1] == 'o' || f[var1] == 'D') {
                        var6 = g;
                        var6[var1] |= 8192;
                    }

                    if (f[var1] == 'R' || f[var1] == 'n' || f[var1] == 143) {
                        var6 = g;
                        var6[var1] |= 16384;
                    }

                    if (f[var1] == 'q') {
                        var6 = g;
                        var6[var1] |= 65536;
                    }

                    if (f[var1] == 142) {
                        var6 = g;
                        var6[var1] |= 32768;
                    }

                    if (f[var1] == '(' || f[var1] == ')') {
                        var6 = g;
                        var6[var1] |= 131072;
                    }

                    if (f[var1] == 'n') {
                        var6 = g;
                        var6[var1] |= 262144;
                    }

                    if (f[var1] == 143) {
                        var6 = g;
                        var6[var1] |= 524288;
                    }
                }
            }

            h = Image.createImage(a * y * mGraphics.b, b * y * mGraphics.b);
            mGraphics var5;
            (var5 = new mGraphics(h.getGraphics())).a(0);
            var5.c(0, 0, a * y, b * y);

            for (var0 = 0; var0 < a; ++var0) {
                for (int var7 = 0; var7 < b; ++var7) {
                    int var3;
                    if ((var3 = f[var7 * a + var0] - 1) != -1) {
                        var5.a(aj, 0, var3 * y, y, y, 0, var0 * y, var7 * y, 0);
                    }
                }
            }

            if (!GameCanvas.a) {
                if (mapID == 0 || mapID <= 4 || mapID >= 16 && mapID <= 18 || mapID >= 24 && mapID <= 27 || mapID == 22 || mapID == 33 || mapID == 34 || mapID == 38 || mapID == 57 || mapID == 58 || mapID == 60 || mapID == 68 || mapID >= 70 && mapID <= 75 || mapID == 81) {
                    Effect2.vAnimateEffect.addElement(new AnimateEffect((byte) 1, 10));
                }

                if (mapID >= 39 && mapID <= 44 || mapID >= 46 && mapID <= 48 || mapID == 56 || mapID >= 62 && mapID <= 65) {
                    Effect2.vAnimateEffect.addElement(new AnimateEffect((byte) 3, Res.random(150, 200)));
                    return;
                }
            }
        } catch (Exception var4) {
            System.out.println("Error Load Map");
            var4.printStackTrace();
            GameMidlet var2 = GameMidlet.instance;
            MotherCanvas.c = false;
            System.gc();
            var2.notifyDestroyed();
        }

    }

    public static final void a(mGraphics var0) {
        for (int var1 = GameScr.cmdy; var1 < GameScr.cmvy; ++var1) {
            for (int var2 = GameScr.cmvx; var2 < GameScr.p; ++var2) {
                int var3 = f[var2 * a + var1] - 1;
                if ((g(var1, var2) & 256) != 256) {
                    if (tileID == 4 && (g(var1, var2) & 64) == 64) {
                        var3 = var2 - 1;
                        if ((var3 = f[var3 * a + var1] - 1) == 15) {
                            var0.a(ai, 0, 17 * i, 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if (var3 == 5) {
                            var0.a(ai, 0, 7 * i, 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if (var3 == 18 || var3 == 22 || var3 == 15) {
                            var0.a(ai, 0, 17 * i, 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if (var3 == 44 || var3 == 52 || var3 == 51) {
                            var0.a(ai, 0, 56 * i, 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if (var3 == 24 || var3 == 23 || var3 == 20 || var3 == 21 || var3 == 19 || var3 == 12 || var3 == 13) {
                            continue;
                        }

                        if (var3 != -1) {
                            var0.a(ai, 0, var3 * i, 24, 24, 0, var1 * i, var2 * i, 0);
                        } else if (var3 == -1) {
                            continue;
                        }
                    }

                    if (tileID == 1) {
                        if ((g(var1, var2) & 32) == 32) {
                            var0.a(ak, 0, 24 * (GameCanvas.u % 4), 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if ((g(var1, var2) & 64) == 64 || (g(var1, var2) & 2048) == 2048) {
                            if ((g(var1, var2 - 1) & 32) == 32) {
                                var0.a(ak, 0, 24 * (GameCanvas.u % 4), 24, 24, 0, var1 * i, var2 * i, 0);
                                continue;
                            }

                            if ((g(var1, var2 - 1) & 4096) == 4096) {
                                var0.a(ai, 0, 504, 24, 24, 0, var1 * i, var2 * i, 0);
                                continue;
                            }
                        }
                    }

                    if (tileID == 2) {
                        if ((g(var1, var2) & 32) == 32) {
                            var0.a(ak, 0, 24 * (GameCanvas.u % 8 >> 1), 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if (var3 == 17) {
                            var0.a(al, 0, 24 * (GameCanvas.u % 8 >> 1), 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if (var3 == 133) {
                            var0.a(ai, 0, 132 * i, 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if ((g(var1, var2) & 64) == 64 || (g(var1, var2) & 2048) == 2048) {
                            if ((g(var1, var2 - 1) & 32) == 32) {
                                var0.a(ak, 0, 24 * (GameCanvas.u % 4), 24, 24, 0, var1 * i, var2 * i, 0);
                                continue;
                            }

                            if ((g(var1, var2 - 1) & 4096) == 4096) {
                                if ((var3 = f(var1, var2 - 1)) == 55) {
                                    var3 = 54;
                                } else if (var3 != 19 && var3 != 35) {
                                    if (var3 < 40) {
                                        var3 = 21;
                                    } else {
                                        var3 = 110;
                                    }
                                } else if ((var3 = f(var1, var2 - 2)) == 55) {
                                    var3 = 54;
                                } else if (var3 < 40) {
                                    var3 = 21;
                                }

                                var0.a(ai, 0, var3 * 24, 24, 24, 0, var1 * i, var2 * i, 0);
                                continue;
                            }
                        }
                    }

                    if (tileID == 3) {
                        if ((g(var1, var2) & 32) == 32) {
                            var0.a(ak, 0, 24 * (GameCanvas.u % 8 >> 1), 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if (var3 == 23) {
                            var0.a(al, 0, 24 * (GameCanvas.u % 8 >> 1), 24, 24, 0, var1 * i, var2 * i, 0);
                            continue;
                        }

                        if ((g(var1, var2) & 64) == 64 || (g(var1, var2) & 2048) == 2048) {
                            if ((g(var1, var2 - 1) & 32) == 32) {
                                var0.a(ak, 0, 24 * (GameCanvas.u % 4), 24, 24, 0, var1 * i, var2 * i, 0);
                                continue;
                            }

                            if ((g(var1, var2 - 1) & 4096) == 4096) {
                                if ((var3 = f(var1, var2 - 1)) == 25) {
                                    var3 = f(var1, var2 - 2);
                                }

                                if (var3 == 45) {
                                    var3 = 44;
                                }

                                --var3;
                                var0.a(ai, 0, var3 * 24, 24, 24, 0, var1 * i, var2 * i, 0);
                                continue;
                            }
                        }
                    }

                    if ((g(var1, var2) & 16) == 16) {
                        ap = var1 * i - GameScr.gW23 - GameScr.gW2;
                        aq = (i - 2) * ap / i + GameScr.gW2;
                        var0.a(ai, 0, var3 * i, 24, 24, 0, aq + GameScr.gW23, var2 * i, 0);
                    } else if ((g(var1, var2) & 512) == 512) {
                        if (var3 != -1) {
                            var0.a(ai, 0, var3 * i, 24, 1, 0, var1 * i, var2 * i, 0);
                            var0.a(ai, 0, var3 * i, 24, 24, 0, var1 * i, var2 * i + 1, 0);
                        }
                    } else if (var3 != -1) {
                        var0.a(ai, 0, var3 * i, 24, 24, 0, var1 * i, var2 * i, 0);
                    }
                }
            }
        }

    }

    public static final void b(mGraphics var0) {
        if (GameCanvas.z > 176) {
            Res.resetTrans(var0);
            var0.translate(s + 1, t + 2);
            var0.a(0);
            var0.c(-2, -2, q + 2, r);
            var0.d(-2, -2, q + 4, r + 4);

            int var1;
            for (var1 = 0; var1 < 2; ++var1) {
                var0.a(ba[var1]);
                var0.b(var1 - 2, var1 - 2, q + 2 - (var1 << 1), r - (var1 << 1));
            }

            var0.d(0, 0, q - 2, r - 3);
            if (mGraphics.a(h) > q || mGraphics.b(h) > r) {
                var0.translate(-aw, -as);
            }

            var0.a(h, 0, 0, 0);

            int var2;
            int var3;
            for (var3 = 0; var3 < Auto.n.size(); ++var3) {
                Mob var4;
                var1 = (var4 = (Mob) Auto.n.elementAt(var3)).x / 12;
                var2 = var4.y / 12;
                if (var1 < ay) {
                    var1 = ay;
                }

                if (var2 < au) {
                    var2 = au;
                }

                if (var1 > ay + q) {
                    var1 = ay + q;
                }

                if (var2 > au + r) {
                    var2 = au + r;
                }

                if (GameCanvas.u % 10 < 8) {
                    var0.a(16777215);
                    var0.c(var1 - 2, var2 - 2, 5, 5);
                    var0.a(var4.levelBoss == 1 ? 255 : (var4.levelBoss == 2 ? 16711935 : '\uffff'));
                    var0.c(var1 - 1, var2 - 1, 3, 3);
                }
            }

            var1 = Char.getMyChar().cx / 12;
            var2 = Char.getMyChar().cy / 12;
            var0.a(16777215);
            var0.c(var1 - 2, var2 - 2, 5, 5);
            var0.a(16711680);
            var0.c(var1 - 1, var2 - 1, 3, 3);
            if (NSOT_MOB.l) {
                for (var3 = 0; var3 < NSOT_MOB.n.size(); ++var3) {
                    var1 = ((Integer) NSOT_MOB.n.elementAt(var3)).intValue() / 12;
                    var2 = ((Integer) NSOT_MOB.o.elementAt(var3)).intValue() / 12;
                    if (NSOT_MOB.m == var3) {
                        var0.a(16777215);
                        var0.c(var1 - 2, var2 - 2, 5, 5);
                    }

                    var0.a(16777215);
                    var0.c(var1 - 1, var2 - 1, 3, 3);
                }
            }

            for (var3 = 0; var3 < GameScr.vParty.size(); ++var3) {
                Party var5;
                if ((var5 = (Party) GameScr.vParty.elementAt(var3)).c != null && var5.c != Char.getMyChar()) {
                    var1 = var5.c.cx / 12;
                    var2 = var5.c.cy / 12;
                    if (var1 < ay) {
                        var1 = ay;
                    }

                    if (var2 < au) {
                        var2 = au;
                    }

                    if (var1 > ay + q) {
                        var1 = ay + q;
                    }

                    if (var2 > au + r) {
                        var2 = au + r;
                    }

                    if (GameCanvas.u % 10 < 8) {
                        var0.a(16777215);
                        var0.c(var1 - 2, var2 - 2, 5, 5);
                        var0.a(65280);
                        var0.c(var1 - 1, var2 - 1, 3, 3);
                    }
                }
            }

            Res.resetTrans(var0);
            if (GameCanvas.isTouch) {
                var0.a(GameScr.dq, s - 1, t, 0);
            }
            mFont.tahoma_7b_yellow.a(var0, "Map: " + mapID, s + 2, t + 2, 0);
            mFont.tahoma_7b_yellow.a(var0, "Khu: " + zoneID, s + 2, t + 13, 0);
            mFont.tahoma_7b_yellow.a(var0, "XY:" + Char.getMyChar().cx + "-" + Char.getMyChar().cy, s + 2, t + 24, 0);
        }

    }

    public static final void c(mGraphics var0) {
        if (!GameCanvas.a) {
            int var1;
            int var2;
            for (var1 = GameScr.cmdy; var1 < GameScr.cmvy; ++var1) {
                for (var2 = GameScr.cmvx; var2 < GameScr.p; ++var2) {
                    Image var3;
                    if (tileID == 4) {
                        var3 = ao;
                    } else {
                        var3 = am;
                    }

                    if ((g(var1, var2) & 2048) == 2048) {
                        var0.a(an, var1, var2, 0);
                    }

                    if ((g(var1, var2) & 64) == 64) {
                        var0.a(var3, 0, (GameCanvas.u % 8 >> 2) * 24, 24, 24, 0, var1 * i, var2 * i, 0);
                    }

                    if ((g(var1, var2) & 256) == 256) {
                        var0.a(ai, 0, (f[var2 * a + var1] - 1) * i, 24, 24, 0, var1 * i, var2 * i, 0);
                    }
                }
            }

            if (tileID != 4 && GameCanvas.isTouch && GameCanvas.g && GameScr.p >= b - 2) {
                for (var1 = GameScr.cmdy; var1 < GameScr.cmvy; ++var1) {
                    var2 = b - 2;
                    int var5 = f[var2 * a + var1] - 1;
                    int var4;
                    if ((g(var1, var2) & 32) == 32) {
                        for (var4 = 1; var4 <= 4; ++var4) {
                            var0.a(ak, 0, 24 * (GameCanvas.u % 4), 24, 24, 0, var1 * i, (var2 + var4) * i, 0);
                        }
                    } else {
                        if (mapID == 64) {
                            az = 115;
                        }

                        if ((g(var1, var2) & 2) == 2 || (g(var1, var2) & 64) == 64) {
                            var5 = az;
                        }

                        if (var5 >= 0) {
                            for (var4 = 1; var4 <= 4; ++var4) {
                                var0.a(ai, 0, var5 * i, 24, 24, 0, var1 * i, (var2 + var4) * i, 0);
                            }
                        }
                    }
                }
            }
        }

    }

    private static int f(int var0, int var1) {
        try {
            return f[var1 * a + var0];
        } catch (Exception var3) {
            return 1000;
        }
    }

    private static int g(int var0, int var1) {
        try {
            return g[var1 * a + var0];
        } catch (Exception var3) {
            return 1000;
        }
    }

    public static final int a(int var0, int var1) {
        try {
            return g[var1 / i * a + var0 / i];
        } catch (Exception var3) {
            return 1000;
        }
    }

    public static final boolean a(int var0, int var1, int var2) {
        try {
            return (g[var1 / i * a + var0 / i] & var2) == var2;
        } catch (Exception var4) {
            return false;
        }
    }

    public static final void b(int var0, int var1) {
        int[] var2 = g;
        int var3 = var1 / i * a + var0 / i;
        var2[var3] |= 512;
    }

    public static final void c(int var0, int var1) {
        int[] var2 = g;
        int var3 = var1 / i * a + var0 / i;
        var2[var3] &= -513;
    }

    public static final int b(int var0) {
        return var0 / i * i;
    }

    public static final int c(int var0) {
        return var0 / i * i;
    }

    public static void f() {
        if (p != mapID) {
            switch (mapID) {
                case 1:
                    return;
                case 10:
                    return;
                case 17:
                    return;
                case 22:
                    return;
                case 27:
                    return;
                case 32:
                    return;
                case 38:
                    return;
                case 43:
                    return;
                case 48:
                    return;
                case 72:
                    return;
            }
        }

    }

    public static void g() {
        if (GameCanvas.u % 700 == 0 && mapID != 0 && mapID > 4 && (mapID < 16 || mapID > 18) && (mapID < 24 || mapID > 27) && mapID != 22 && mapID != 33 && mapID != 34 && mapID != 38 && mapID != 57 && mapID != 58 && mapID != 60 && mapID != 68 && (mapID < 70 || mapID > 75) && mapID != 81) {
            if (mapID >= 39 && mapID <= 44 || mapID >= 46 && mapID <= 48 || mapID == 56 || mapID >= 62 && mapID <= 65) {
                return;
            }

            if (mapID == 29 || mapID == 35) {
                return;
            }

            if (mapID == 50 || mapID == 51 || mapID == 52) {
                return;
            }

            if (mapID == 64) {
                if (Res.random(0, 8) % 2 == 0) {
                    return;
                }

                return;
            }
        }

    }

    public static boolean d(int var0) {
        return var0 == 10 || var0 == 17 || var0 == 22 || var0 == 32 || var0 == 38 || var0 == 43 || var0 == 48 || var0 == 138;
    }

    public static boolean e(int var0) {
        return var0 >= 134 && var0 <= 138;
    }

    public static boolean f(int var0) {
        return var0 == 1 || var0 == 27 || var0 == 72;
    }

    public static boolean g(int var0) {
        return var0 == 91 || var0 == 92 || var0 == 93 || var0 == 94 || var0 == 95 || var0 == 96 || var0 == 97 || var0 == 105 || var0 == 106 || var0 == 107 || var0 == 108 || var0 == 109 || var0 == 114 || var0 == 115 || var0 == 116 || var0 == 125 || var0 == 126 || var0 == 127 || var0 == 128 || var0 == 157 || var0 == 158 || var0 == 159;
    }

    public static int h(int var0) {
        if (g(var0)) {
            switch (var0) {
                case 91:
                    return 92;
                case 92:
                    return 93;
                case 93:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 153:
                case 154:
                case 155:
                case 156:
                default:
                    break;
                case 94:
                    return 95;
                case 95:
                    return 96;
                case 96:
                    return 97;
                case 105:
                    return 106;
                case 106:
                    return 107;
                case 107:
                    return 108;
                case 108:
                    return 109;
                case 114:
                    return 115;
                case 115:
                    return 116;
                case 125:
                    return 126;
                case 126:
                    return 127;
                case 127:
                    return 128;
                case 157:
                    return 158;
                case 158:
                    return 159;
                case 159:
                    return 157;
            }
        }

        return -1;
    }

    public static int i(int var0) {
        if (g(var0)) {
            switch (var0) {
                case 92:
                    return 91;
                case 93:
                    return 92;
                case 94:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 129:
                case 130:
                case 131:
                case 132:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                default:
                    break;
                case 95:
                    return 94;
                case 96:
                    return 95;
                case 97:
                    return 96;
                case 106:
                    return 105;
                case 107:
                    return 106;
                case 108:
                    return 107;
                case 109:
                    return 108;
                case 115:
                    return 114;
                case 116:
                    return 115;
                case 126:
                    return 125;
                case 127:
                    return 126;
                case 128:
                    return 127;
                case 158:
                    return 157;
                case 159:
                    return 158;
            }
        }

        return -1;
    }

    public static void j(int var0) {
        Waypoint var1;
        int var2 = (var1 = (Waypoint) vGo.elementAt(var0)).minX;
        int var3 = var1.minY;
        if (var1.minY != 0 && var1.maxY < d - 24) {
            if (var1.maxX <= c / 2) {
                var2 = var1.maxX + 12;
                var3 = var1.maxY;
            } else if (var1.minX >= c / 2) {
                var2 = var1.minX - 12;
                var3 = var1.maxY;
            }
        } else if (var1.maxY <= d / 2) {
            var2 = (var1.maxX + var1.minX) / 2;
            var3 = var1.maxY + 24;
        } else if (var1.minY >= d / 2) {
            var2 = (var1.maxX + var1.minX) / 2 + 24;
            var3 = var1.maxY - 48;
        }

        if (mapID != 114 && mapID != 115 && mapID != 116) {
            Char.b(var2, var3);
        } else {
            Char.d(var2, var3);
        }

        ThreadUtil.ThreadCatch(100L * (long) NSOT_MOB.u / 10L);
        Service.gI().requestChangeMap();
    }

    public static void h() {
        ah = true;
        synchronized (bf) {
            try {
                bf.wait(10000L);
            } catch (InterruptedException var3) {
            }

        }
    }
    public static void h1() {
        ah = true;
        synchronized (bf) {
            try {
                bf.wait(2000L); // fix khu từ 10000 thành 2000 - 2s 1 lần
            } catch (InterruptedException var3) {
            }

        }
    }
    public static void i() {
        if (ah) {
            ah = false;
            synchronized (bf) {
                bf.notifyAll();
            }
        }

    }

    public static boolean k(int var0) {
        short var1 = mapID;
        af = var0;
        int var2 = var0;
        short var3 = var1;
        int var4;
        int var5;
        int var6;
        MyVector var7;
        int var9;
        if (var1 >= 0 && var1 < bb.length && var0 >= 0 && var0 < bb.length) {
            if (bb[var1].length <= 0) {
                var7 = null;
            } else {
                TaskOrder var8 = Char.j(0);

                for (var4 = 0; var4 < bc.length; ++var4) {
                    bc[var4] = true;
                    bd[var4] = -1;
                    be[var4] = -1;
                }

                bd[var1] = 0;

                label344:
                while (true) {
                    do {
                        boolean var10;
                        do {
                            int var13;
                            if (!bc[var2]) {
                                MyVector var17;
                                (var17 = new MyVector()).addElement(new Integer(var2));

                                for (var6 = var2; var6 != var3; var6 = be[var6]) {
                                    byte var18;
                                    if (d(var9 = be[var6])) {
                                        if (d(var6)) {
                                            var18 = 1;
                                            if (var6 == 10) {
                                                var18 = 1;
                                            } else if (var6 == 17) {
                                                var18 = 2;
                                            } else if (var6 == 22) {
                                                var18 = 3;
                                            } else if (var6 == 32) {
                                                var18 = 4;
                                            } else if (var6 == 38) {
                                                var18 = 5;
                                            } else if (var6 == 43) {
                                                var18 = 6;
                                            } else if (var6 == 48) {
                                                var18 = 7;
                                            }

                                            var9 = var9 | Integer.MIN_VALUE | 117440512 | var18 << 20 & 15728640;
                                        } else if (var6 == 139) {
                                            var9 = var9 | Integer.MIN_VALUE | 83886080 | 2097152;
                                        }
                                    } else if (f(var9)) {
                                        if (f(var6)) {
                                            var18 = 0;
                                            if (var6 == 1) {
                                                var18 = 0;
                                            } else if (var6 == 27) {
                                                var18 = 1;
                                            } else if (var6 == 72) {
                                                var18 = 2;
                                            }

                                            var9 = var9 | Integer.MIN_VALUE | 134217728 | var18 << 20 & 15728640;
                                        } else if (var8 != null && var6 == var8.mapId) {
                                            var13 = GameScr.fi;
                                            var9 = var9 | Integer.MIN_VALUE | 419430400 | var13 << 20 & 15728640 | 196608;
                                        } else {
                                            switch (var6) {
                                                case 80:
                                                    var9 = var9 | Integer.MIN_VALUE | 1048576 | 65536;
                                                    break;
                                                case 91:
                                                    var9 = var9 | Integer.MIN_VALUE | 2097152 | 65536;
                                                    break;
                                                case 94:
                                                    var9 = var9 | Integer.MIN_VALUE | 2097152 | 131072;
                                                    break;
                                                case 98:
                                                    var13 = GameScr.fi + 2;
                                                    var9 = var9 | Integer.MIN_VALUE | 419430400 | var13 << 20 & 15728640;
                                                    break;
                                                case 104:
                                                    var13 = GameScr.fi + 2;
                                                    var9 = var9 | Integer.MIN_VALUE | 419430400 | var13 << 20 & 15728640 | 65536;
                                                    break;
                                                case 105:
                                                    var9 = var9 | Integer.MIN_VALUE | 2097152 | 196608;
                                                    break;
                                                case 113:
                                                    var13 = GameScr.fi + 3;
                                                    var9 = var9 | Integer.MIN_VALUE | 419430400 | var13 << 20 & 15728640;
                                                    break;
                                                case 114:
                                                    var9 = var9 | Integer.MIN_VALUE | 2097152 | 262144;
                                                    break;
                                                case 125:
                                                    var9 = var9 | Integer.MIN_VALUE | 2097152 | 327680;
                                                    break;
                                                case 139:
                                                    var9 = var9 | Integer.MIN_VALUE | 83886080 | 2097152;
                                                    break;
                                                case 157:
                                                    var9 = var9 | Integer.MIN_VALUE | 2097152 | 393216;
                                            }
                                        }
                                    }

                                    var17.addElement(new Integer(var9));
                                }

                                MyVector var19 = new MyVector();

                                for (var4 = var17.size() - 1; var4 >= 0; --var4) {
                                    var19.addElement(var17.elementAt(var4));
                                }

                                var7 = var19;
                                break label344;
                            }

                            var5 = -1;
                            var6 = -1;

                            for (var4 = 0; var4 < bb.length; ++var4) {
                                if (bc[var4] && bd[var4] != -1 && (bd[var4] < var5 || var5 == -1)) {
                                    var5 = bd[var4];
                                    var6 = (short) var4;
                                }
                            }

                            if (var6 == -1) {
                                var7 = null;
                                break label344;
                            }

                            bc[var6] = false;
                            var10 = f(var6);
                            short[] var11 = bb[var6];

                            for (var4 = 0; var4 < var11.length; ++var4) {
                                var9 = var11[var4];
                                if (bc[var9]) {
                                    boolean var12;
                                    label315:
                                    {
                                        if (Char.getMyChar().isHuman) {
                                            var13 = Char.getMyChar().ctaskId;
                                            if ((var9 == 1 || var9 == 27 || var9 == 72) && var13 < 6) {
                                                var12 = false;
                                                break label315;
                                            }

                                            if ((var9 == 10 || var9 == 32 || var9 == 48) && var13 < 17) {
                                                var12 = false;
                                                break label315;
                                            }

                                            if (var9 == 38 && var13 < 28) {
                                                var12 = false;
                                                break label315;
                                            }

                                            if (var9 == 43 && var13 < 33) {
                                                var12 = false;
                                                break label315;
                                            }

                                            if (var9 == 17 && var13 < 38) {
                                                var12 = false;
                                                break label315;
                                            }

                                            if (var9 == 7 && var13 < 15) {
                                                var12 = false;
                                                break label315;
                                            }
                                        }

                                        var12 = true;
                                    }

                                    if (var12 && (!var10 || !f(var9) || Char.getMyChar().ctaskId >= 9) && (bd[var9] == -1 || bd[var9] > bd[var6] + 1)) {
                                        bd[var9] = bd[var6] + 1;
                                        be[var9] = (short) var6;
                                    }
                                }
                            }

                            if (var10 && var8 != null && bc[var8.mapId] && (bd[var8.mapId] == -1 || bd[var8.mapId] > bd[var6] + 1)) {
                                bd[var8.mapId] = bd[var6] + 1;
                                be[var8.mapId] = (short) var6;
                            }
                        } while (!var10);

                        var9 = (short) (GameScr.fj ? 98 : 104);
                    } while (bd[var9] != -1 && bd[var9] <= bd[var6] + 1);

                    bd[var9] = bd[var6] + 1;
                    be[var9] = (short) var6;
                }
            }
        } else {
            var7 = null;
        }

        MyVector var15 = var7;
        if (var7 == null) {
            InfoMe.addInfo("Không thể chuyển map !", 50, mFont.tahoma_7_yellow);
            return false;
        } else {
            ag = true;

            try {
                var6 = mapID;

                for (var2 = 1; var2 < var15.size() && ag && var6 == mapID; ++var2) {
                    var5 = ((Integer) var15.elementAt(var2 - 1)).intValue();
                    var6 = ((Integer) var15.elementAt(var2)).intValue() & '\uffff';
                    if (var5 < 0) {
                        var9 = var5 >> 24 & 127;
                        var4 = var5 >> 20 & 15;
                        var5 = var5 >> 16 & 15;
                        GameScr.b(var9, var4, var5);
                    } else if ((var5 < 134 || var5 > 138) && var6 == 138) {
                        if (Char.getMyChar().cPk > 0) {
                            InfoMe.addInfo("Hi\u1ebfu chi\u1ebfn qu\u00e1 cao!", 50, mFont.tahoma_7_yellow);
                            return false;
                        }
                    } else if (var5 != 0 && var5 != 56 && var5 != 73) {
                        var4 = -1;

                        for (var9 = 0; var9 < bb[var5].length; ++var9) {
                            if (bb[var5][var9] == var6) {
                                var4 = var9;
                                break;
                            }
                        }

                        if (var4 == -1) {
                            InfoMe.addInfo("Không thể chuyển map!", 50, mFont.tahoma_7_yellow);
                            return false;
                        }

                        j(var4);
                    } else {
                        Npc var16;
                        if ((var16 = (Npc) GameScr.vSet.elementAt(0)) != null && var16.statusMe != 15) {
                            Char.b(var16.cx, var16.cy);
                            Char.getMyChar().npcFocus = var16;
                            Service.gI().requestItem(var16.template.npcTemplateId);
                            Service.gI().menu(var16.template.npcTemplateId, 0, 0);
                            Service.gI().getTask(var16.template.npcTemplateId, 0);
                        }
                    }

                    if (mapID != var6) {
                        h();
                    }
// tốc độ next map
                    Thread.sleep(1000L);
                }
            } catch (Exception var14) {
                var14.printStackTrace();
                return false;
            }

            ag = false;
            return mapID == var0;
        }
    }

    public static void l(int var0) {
        GameCanvas.p();
        (new Thread(new Class_bz(var0))).start();
    }

    public static void m(int var0) {
        GameCanvas.p();
        (new Thread(new Class_ca(var0))).start();
    }

    public static int d(int var0, int var1) {
        var1 = b(var1);
        if (!a(var0, var1, 2)) {
            for (int var2 = 0; var2 < 5; ++var2) {
                int var3;
                if ((var3 = var1 - 48 + var2 * 24) > 0 && var3 < d && a(var0, var3, 2)) {
                    return var3;
                }
            }
        }

        return var1;
    }

    public static int e(int var0, int var1) {
        if ((a(var0, var1 - 16) & 16386) != 0) {
            var1 = b(var1);

            int var2;
            int var3;
            for (var2 = 24; var2 < 240; var2 += 24) {
                var3 = a(var0, var1 - var2);
                if (var1 - var2 > 0 && (var3 & 16386) == 0) {
                    return var1 - var2 + 24;
                }
            }

            for (var2 = 24; var2 < 120; var2 += 24) {
                var3 = a(var0, var1 + var2);
                if (var1 + var2 < d && (var3 & 16386) == 0) {
                    return var1 + var2;
                }
            }
        }

        return var1;
    }

    public static boolean a(int var0, int var1, int[] var2) {
        var1 = b(var1);
        if (a(var0, var1, 2)) {
            var2[0] = var0;
            var2[1] = var1;
            return true;
        } else {
            for (int var3 = 0; var3 < 5; ++var3) {
                int var4 = var1 + var3 * 24;

                for (int var5 = 0; var5 < 5; ++var5) {
                    int var6 = var0 - 48 + var5 * 24;
                    if (var4 < d && var6 > 24 && var6 < c - 24 && a(var6, var4, 2)) {
                        var2[0] = var6;
                        var2[1] = var4;
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public static void a(int var0, InputStream var1) {
        try {
            if (bg.length <= var0) {
                byte[][] var2 = new byte[var0 + 10][];
                System.arraycopy(bg, 0, var2, 0, bg.length);
                bg = var2;
            }

            bg[var0] = new byte[var1.available()];
            var1.read(bg[var0]);
        } catch (Exception var3) {
        }

    }

    public static void loadMapFromResource() {
        ByteArrayInputStream var0 = new ByteArrayInputStream(bg[mapID]);

        try {
            DataInputStream var1;
            a = (char) (var1 = new DataInputStream(var0)).readUnsignedByte();
            b = (char) var1.readUnsignedByte();
            f = new char[var1.available()];

            for (int var2 = 0; var2 < a * b; ++var2) {
                f[var2] = (char) var1.readUnsignedByte();
            }

            g = new int[f.length];
        } catch (IOException var3) {
            var3.printStackTrace();
        }

    }

    public static void k() {
        for (int var0 = 1; var0 < bh.length; ++var0) {
            bh[var0] = GameCanvas.loadImage("/t/" + var0 + ".png");
            bi[var0] = GameCanvas.loadImage("/t/mini_" + var0 + ".png");
        }

    }

    public static void l() {
        ai = null;
        System.gc();
        ai = bh[tileID];
        aj = bi[tileID];
    }

    public static void m() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        tileID = 0;
        f = null;
        g = null;
        ai = null;
        aj = null;
        h = null;
        ak = null;
        al = null;
        am = null;
        an = null;
        ao = null;
        i = 0;
        ap = 0;
        aq = 0;
        j = null;
        mapName = null;
        zoneID = 0;
        bgID = 0;
        typeMap = 0;
        mapID = 0;
        p = 0;
        ar = 0;
        as = 0;
        at = 0;
        au = 0;
        av = 0;
        aw = 0;
        ax = 0;
        ay = 0;
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        vGo = null;
        v = null;
        w = null;
        x = null;
        az = 0;
        y = 0;
        z = 0;
        aa = 0;
        ab = 0;
        ac = 0;
        ad = 0;
        ae = 0;
        ba = null;
        bb = (short[][]) null;
        bc = null;
        bd = null;
        be = null;
        af = 0;
        ag = false;
        ah = false;
        bf = null;
        bg = (byte[][]) null;
        bh = null;
        bi = null;
    }

    static {
        Main.main(27);
        a();
    }
}

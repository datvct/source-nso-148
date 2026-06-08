import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public final class PK_AM_PANEL extends Form implements CommandListener {
   private TextField d;
   private TextField e;
   private TextField f;
   private TextField g;
   private TextField h;
   private TextField i;
   private Command j;
   private static PK_AM_PANEL k;
   public static long c = 50L;
   private ChoiceGroup l;
   private ChoiceGroup m;
   private ChoiceGroup n;
   public static boolean isShow = mResources.d("isShow") == 1; // on /off hien thong tin
   public PK_AM_PANEL() {
      super("Cài PK Âm NsoTien");
      this.append(this.l = new ChoiceGroup("Bật pk âm", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.m = new ChoiceGroup("Giữ kết nối", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.n = new ChoiceGroup("Hiện thông tin up", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.d = new TextField("Khu chờ pk", NSOT_MOB.nst_khuCho != -1 ? String.valueOf(NSOT_MOB.nst_khuCho) : "5", 5, 2));
      this.append(this.e = new TextField("Khu đánh pk", NSOT_MOB.nst_khuDanh != -1 ? String.valueOf(NSOT_MOB.nst_khuDanh) : "6", 5, 2));
      this.append(this.f = new TextField("ID map PK", NSOT_MOB.nst_idMap != -1 ? String.valueOf(NSOT_MOB.nst_idMap) : "6", 5, 2));
      this.append(this.g = new TextField("Tọa độ X", NSOT_MOB.nst_x != -1 ? String.valueOf(NSOT_MOB.nst_x) : "354", 5, 2));
      this.append(this.h = new TextField("Tọa độ Y", NSOT_MOB.nst_y != -1 ? String.valueOf(NSOT_MOB.nst_y) : "120", 5, 2));
      this.append(this.i = new TextField("Bao nhiêu % thì pk :", String.valueOf(c), 9, 2));
      append("Lưu ý: ae tự thay tọa độ của riêng mình vào trước khi bật pk");
      this.addCommand(this.j = new Command("Lưu", 4, 0));
      this.addCommand(new Command("Thoát", 7, 0));
      this.setCommandListener(this);
      this.l.setSelectedIndex(NSOT_MOB.ad ? 0 : 1, true);
      this.m.setSelectedIndex(NSOT_MOB.au ? 0 : 1, true);
      this.n.setSelectedIndex(isShow ? 0 : 1, true);
   }

   public static PK_AM_PANEL b() {
      if (k == null) {
         k = new PK_AM_PANEL();
      }

      return k;
   }

   public static void c() {
      byte[] var0 = mResources.b("tienpkam");
      if (var0 != null) {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         DataInputStream var2 = new DataInputStream(var1);

         try {
            NSOT_MOB.nst_khuCho = var2.readInt();
            NSOT_MOB.nst_khuDanh = var2.readInt();
            NSOT_MOB.nst_idMap = var2.readInt();
            NSOT_MOB.nst_x = var2.readInt();
            NSOT_MOB.nst_y = var2.readInt();
            c = var2.readLong();
            var1.close();
            var2.close();
         } catch (Exception var4) {
         }
      }

   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1 == this.j) {
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);

         try {
            NSOT_MOB.nst_khuCho = Integer.parseInt(this.d.getString());
            NSOT_MOB.nst_khuDanh = Integer.parseInt(this.e.getString());
            NSOT_MOB.nst_idMap = Integer.parseInt(this.f.getString());
            NSOT_MOB.nst_x = Integer.parseInt(this.g.getString());
            NSOT_MOB.nst_y = Integer.parseInt(this.h.getString());
            c = Long.parseLong(this.i.getString());
            NSOT_MOB.ad = this.l.getSelectedIndex() == 0;
            NSOT_MOB.au = this.m.getSelectedIndex() == 0;
            isShow = this.n.getSelectedIndex() == 0;
            mResources.a("nstglv", NSOT_MOB.ad ? 1 : -1);
            mResources.a("nstconnect", NSOT_MOB.au ? 1 : -1);
            mResources.a("isShow", isShow ? 1 : -1);
            var4.writeInt(NSOT_MOB.nst_khuCho);
            var4.writeInt(NSOT_MOB.nst_khuDanh);
            var4.writeInt(NSOT_MOB.nst_idMap);
            var4.writeInt(NSOT_MOB.nst_x);
            var4.writeInt(NSOT_MOB.nst_y);
            var4.writeLong(c);
            mResources.a("tienpkam", var3.toByteArray());
         } catch (Exception var6) {
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      MotherCanvas.instance.setFullScreenMode(true);
   }
}

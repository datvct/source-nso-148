import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public class MenuHangDong extends Form implements CommandListener{
	private TextField a;
	private TextField b;
	private TextField c;
	private TextField d;
	private Command z;
	private ChoiceGroup aa;
	public static boolean autodan = mResources.d("autodan") == 1;
	public static int phut_hd;
	public static int gio_hd;
	public static int phut_hd_lbhd;
	public static int gio_hd_lbhd;
	public static boolean autohd = mResources.d("autohd") == 1;
	public static boolean autohd_lbhd = mResources.d("autohd_lbhd") == 1;
	public MenuHangDong() {
		super("Cài đặt hang động");
		append(this.aa = new ChoiceGroup("Auto", 2, new String[] { "Đan", "Hang động", "LBHD" }, null));
		append(this.a = new TextField("Giờ hang động", String.valueOf(gio_hd), 9, 2));
		append(this.b = new TextField("Phút hang động", String.valueOf(phut_hd), 9, 2));
		append(this.c = new TextField("Giờ hang động (LBHD)", String.valueOf(gio_hd_lbhd), 9, 2));
		append(this.d = new TextField("Phút hang động (LBHD)", String.valueOf(phut_hd_lbhd), 9, 2));
		append("Lưu ý: hd9x không tích vào LBHD vì nó mẹo đi 2 lần, và time sẽ cài là 2h15p");
		this.addCommand(this.z = new Command("Save", 4, 0));
		this.addCommand(new Command("Cancel", 7, 0));
		this.setCommandListener(this);
		this.aa.setSelectedIndex(0, autodan);
		this.aa.setSelectedIndex(1, autohd);
		this.aa.setSelectedIndex(2, autohd_lbhd);
	}
	public void a() {
		Display.getDisplay(GameMidlet.instance).setCurrent(this);
	}
	public void commandAction(Command arg0, Displayable arg1) {
		if (arg0 == this.z) {
			try {
				gio_hd = Integer.parseInt(this.a.getString());
				phut_hd = Integer.parseInt(this.b.getString());
				gio_hd_lbhd = Integer.parseInt(this.c.getString());
				phut_hd_lbhd = Integer.parseInt(this.d.getString());
				autodan = this.aa.isSelected(0);
				autohd = this.aa.isSelected(1);
				autohd_lbhd = this.aa.isSelected(2);
				mResources.a("autodan", autodan ? 1 : -1);
				mResources.a("autohd", autohd ? 1 : -1);
				mResources.a("autohd_lbhd", autohd_lbhd ? 1 : -1);
				mResources.a("SettingCave", gio_hd + ";" + phut_hd + ";" + gio_hd_lbhd + ";" + phut_hd_lbhd);
				GameScr.addChatPopup("L\u01b0u c\u00e0i \u0111\u1eb7t th\u00e0nh c\u00f4ng");
			} catch (NumberFormatException var3) {
			}
		}

		Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
	
	}

}

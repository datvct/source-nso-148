import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public class GUIClient implements Runnable {
    private static GUIClient instance;
    private SocketConnection sc;
    private InputStream is;
    private OutputStream os;
    private boolean isRunning;
    private String username;
    private Thread thread;
    private long lastHeartbeat;

    public static GUIClient getInstance() {
        if (instance == null) {
            instance = new GUIClient();
        }
        return instance;
    }

    public void connect(String username) {
        if (isRunning) {
            if (this.username != null && this.username.equals(username)) {
                return; // Already connected for this user
            }
            disconnect();
        }
        this.username = username;
        this.isRunning = true;
        this.thread = new Thread(this);
        this.thread.start();
    }

    public void disconnect() {
        isRunning = false;
        try {
            if (is != null) is.close();
            if (os != null) os.close();
            if (sc != null) sc.close();
        } catch (Exception e) {}
        is = null;
        os = null;
        sc = null;
    }

    public void run() {
        try {
            sc = (SocketConnection) Connector.open("socket://127.0.0.1:8888");
            is = sc.openInputStream();
            os = sc.openOutputStream();

            // Send login packet
            send("{\"type\":\"login\",\"username\":\"" + username + "\"}");

            lastHeartbeat = System.currentTimeMillis();
            StringBuffer buffer = new StringBuffer();

            while (isRunning) {
                // Check heartbeat
                if (System.currentTimeMillis() - lastHeartbeat > 20000) {
                    send("{\"type\":\"heartbeat\",\"username\":\"" + username + "\"}");
                    
                    // Also send status update
                    String cName = "";
                    int level = 1;
                    if (Char.getMyChar() != null) {
                        cName = Char.getMyChar().cName;
                        level = Char.getMyChar().clevel;
                    }
                    send("{\"type\":\"status_update\",\"username\":\"" + username + "\",\"characterName\":\"" + cName + "\",\"level\":" + level + ",\"mapId\":" + TileMap.mapID + "}");
                    lastHeartbeat = System.currentTimeMillis();
                }

                if (is.available() > 0) {
                    int b = is.read();
                    if (b == -1) break;
                    if (b == '\n') {
                        String msg = buffer.toString().trim();
                        if (msg.length() > 0) {
                            handleMessage(msg);
                        }
                        buffer.setLength(0); // Clear buffer
                    } else {
                        buffer.append((char) b);
                    }
                } else {
                    Thread.sleep(50);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
            // Reconnect logic
            if (username != null) {
                try {
                    Thread.sleep(5000);
                } catch (Exception ex) {}
                if (Session_ME.getInstance().connected) {
                    connect(username);
                }
            }
        }
    }

    private void send(String msg) {
        try {
            if (os != null) {
                os.write((msg + "\n").getBytes("UTF-8"));
                os.flush();
            }
        } catch (Exception e) {
            disconnect();
        }
    }

    private void handleMessage(String msg) {
        System.out.println("GUIClient Received: " + msg);
        String cmd = SimpleJSON.getString(msg, "cmd");
        if (cmd == null) return;

        try {
            if (cmd.equals("setup_daily")) {
                AutoDailyPanel.isAutoDailyOn = SimpleJSON.getBoolean(msg, "enabled");
                AutoDailyPanel.autoDailyHour = SimpleJSON.getInt(msg, "startTime");
                mResources.a("auto_daily_on", AutoDailyPanel.isAutoDailyOn ? 1 : -1);
                mResources.a("auto_daily_time", String.valueOf(AutoDailyPanel.autoDailyHour));
                GameCanvas.a("Auto NV: " + (AutoDailyPanel.isAutoDailyOn ? "Bật" : "Tắt"));
            } 
            else if (cmd.equals("setup_party")) {
                AutoPartyPanel.isAutoPartyOn = SimpleJSON.getBoolean(msg, "enabled");
                String roleStr = SimpleJSON.getString(msg, "role");
                AutoPartyPanel.partyRole = (roleStr != null && roleStr.equals("leader")) ? 0 : 1;
                
                if (AutoPartyPanel.partyRole == 0) {
                    // Leader
                    String[] members = SimpleJSON.getArray(msg, "teamMembers");
                    if (members.length > 0) AutoPartyPanel.member1Name = members[0];
                    if (members.length > 1) AutoPartyPanel.member2Name = members[1];
                    if (members.length > 2) AutoPartyPanel.member3Name = members[2];
                    if (members.length > 3) AutoPartyPanel.member4Name = members[3];
                    if (members.length > 4) AutoPartyPanel.member5Name = members[4];
                } else {
                    // Member
                    AutoPartyPanel.leaderName = SimpleJSON.getString(msg, "leaderName");
                }
                
                mResources.a("auto_party_on", AutoPartyPanel.isAutoPartyOn ? 1 : -1);
                mResources.a("auto_party_role", AutoPartyPanel.partyRole);
                GameCanvas.a("Auto Party: " + (AutoPartyPanel.isAutoPartyOn ? "Bật" : "Tắt"));
            }
            else if (cmd.equals("move_to_map")) {
                int mapId = SimpleJSON.getInt(msg, "mapId");
                TileMap.l(mapId);
                GameCanvas.a("Chuyển map " + mapId);
            }
            else if (cmd.equals("start_auto")) {
                if (NSOT_MOB.mod_nst != null) {
                    NSOT_MOB.mod_nst.e(); // Trigger Auto Nhiệm Vụ (giống lệnh 'anv')
                    GameCanvas.a("Đã tự động Bật Auto từ Tool");
                }
            }
            else if (cmd.equals("logout")) {
                Session_ME.getInstance().close();
                Class_cl.ac();
                disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

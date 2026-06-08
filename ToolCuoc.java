public class ToolCuoc implements Runnable {
    public static ToolCuoc tool = new ToolCuoc();
    private long timeChat = 20000L;
    private static Thread thread;
    public static boolean start = false;
    private boolean autoChat = false;
    private long lastTimeChat = 0L;
    private static boolean aj = false;


    public void run() {
        try {
            long var1;
            for(; start; Thread.sleep((var1 = System.currentTimeMillis() - var1) < 100L ? 100L - var1 : 0L)) {
                var1 = System.currentTimeMillis();

                try {


                    autoChat();
                } catch (Exception var4) {
                    var4.printStackTrace();
                }


            }

        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    public final void startTool() {
        if (!start) {


            System.currentTimeMillis();
            start = true;
            (thread = new Thread(this)).start();
        }

    }

    public static void stopTool() {
        start = false;
        if (thread != null) {
            Class_cl.ac();
            thread.interrupt();
        }

    }

    public void autoChat() {
        
        if (System.currentTimeMillis() - this.lastTimeChat >= timeChat) {
            if (autoChat) {
                Service.gI().chat("Bot tự động của ...");
                autoChat = false;
                this.lastTimeChat = System.currentTimeMillis();
                return;
            }

            Service.gI().chat("Tự động...");
            autoChat = true;
            this.lastTimeChat = System.currentTimeMillis();
            return;
        }
    }
}

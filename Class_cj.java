import java.util.Calendar;

public final class Class_cj implements Runnable {
   private Session_ME a;

   Class_cj(Session_ME var1) {
      this.a = var1;
   }

   public final void run() {
      do {
         try {
            if (NSOT_MOB.ac > 0L && System.currentTimeMillis() - NSOT_MOB.ag < NSOT_MOB.ac) {
               GameCanvas.r();
               this.a.close();
               Thread.sleep(10000L);
               Session_ME.a(10000L);
            } else if (NSOT_MOB.as) {
               Calendar var1;
               int var2 = (var1 = Res.c()).get(11);
               int var3 = var1.get(12);
               if (NSOT_MOB.v == NSOT_MOB.x) {
                  if (var2 == NSOT_MOB.v && var3 >= NSOT_MOB.w && var3 <= NSOT_MOB.y) {
                     GameCanvas.q();
                     this.a.close();
                     Thread.sleep(10000L);
                     Session_ME.a(10000L);
                  } else {
                     GameCanvas.p();
                     this.a.close();
                     this.a.connect(Session_ME.host, Session_ME.port);
                     GameMidlet.serverLogin = Session_ME.serverLogin;
                     Thread.sleep(5000L);
                     Service.gI().login(SelectServerScr.uname, SelectServerScr.pass, "1.8.0");
                     NSOT_MOB.ac = 0L;
                     Session_ME.a(10000L);
                     Service.gI().selectCharToPlay(SelectCharScr.k);
                     Session_ME.a(5000L);
                  }
               } else if (var2 == NSOT_MOB.v && var3 >= NSOT_MOB.w || var2 > NSOT_MOB.v && var2 < NSOT_MOB.x || var2 == NSOT_MOB.x && var3 < NSOT_MOB.y) {
                  GameCanvas.q();
                  this.a.close();
                  Thread.sleep(10000L);
                  Session_ME.a(10000L);
               } else {
                  GameCanvas.p();
                  this.a.close();
                  this.a.connect(Session_ME.host, Session_ME.port);
                  GameMidlet.serverLogin = Session_ME.serverLogin;
                  Thread.sleep(5000L);
                  Service.gI().login(SelectServerScr.uname, SelectServerScr.pass, "1.8.0");
                  NSOT_MOB.ac = 0L;
                  Session_ME.a(10000L);
                  Service.gI().selectCharToPlay(SelectCharScr.k);
                  Session_ME.a(5000L);
               }
            } else {
               GameCanvas.p();
               this.a.close();
               this.a.connect(Session_ME.host, Session_ME.port);
               GameMidlet.serverLogin = Session_ME.serverLogin;
               Thread.sleep(5000L);
               Service.gI().login(SelectServerScr.uname, SelectServerScr.pass, "1.8.0");
               NSOT_MOB.ac = 0L;
               Session_ME.a(10000L);
               Service.gI().selectCharToPlay(SelectCharScr.k);
               Session_ME.a(5000L);
            }
         } catch (InterruptedException var4) {
            var4.printStackTrace();
         }
      } while(Session_ME.isCancel && GameCanvas.currentScreen != GameScr.instance);

   }
}

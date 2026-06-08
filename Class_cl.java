public final class Class_cl {
   private static boolean c;
   public static boolean a;
   public static boolean b;
   private static boolean d;
   private static boolean e;
   private static boolean f;
   private static boolean g;
   private static boolean h;
   private static boolean i;
   private static boolean j;
   private static boolean k;
   private static boolean l;
   private static boolean m;
   private static boolean n;
   private static boolean o;
   private static boolean p;
   private static Object q;
   private static int r;

   public static void a() {
      c = false;
      a = false;
      b = false;
      d = false;
      e = false;
      f = false;
      g = false;
      h = false;
      i = false;
      j = false;
      k = false;
      l = false;
      m = false;
      n = false;
      o = false;
      p = false;
      q = new Object();
   }

   public static void b() {
      c = true;
      synchronized(q) {
         try {
            q.wait(2000L);
         } catch (InterruptedException var3) {
         }

      }
   }

   public static void c() {
      if (c) {
         synchronized(q) {
            q.notifyAll();
         }

         c = false;
      }

   }

   public static boolean d() {
      b = true;
      long var0 = System.currentTimeMillis();
      synchronized(q) {
         try {
            q.wait(500L);
         } catch (InterruptedException var5) {
         }
      }

      return System.currentTimeMillis() - var0 < 500L;
   }

   public static void e() {
      if (b) {
         synchronized(q) {
            q.notifyAll();
         }

         b = false;
      }

   }

   public static void f() {
      d = true;
      synchronized(q) {
         try {
            q.wait(2000L);
         } catch (InterruptedException var3) {
         }

      }
   }

   public static void g() {
      if (d) {
         synchronized(q) {
            q.notifyAll();
         }

         d = false;
      }

   }

   public static void h() {
      e = true;
      synchronized(q) {
         try {
            q.wait(2000L);
         } catch (InterruptedException var3) {
         }

      }
   }

   public static void i() {
      if (e) {
         synchronized(q) {
            q.notifyAll();
         }

         e = false;
      }

   }

   public static void j() {
      j = true;
      synchronized(q) {
         try {
            q.wait();
         } catch (InterruptedException var3) {
         }

      }
   }

   public static void k() {
      if (j) {
         synchronized(q) {
            q.notifyAll();
         }

         j = false;
      }

   }

   public static void l() {
      f = true;
      synchronized(q) {
         try {
            q.wait(2000L);
         } catch (InterruptedException var3) {
         }

      }
   }

   public static void m() {
      if (f) {
         synchronized(q) {
            q.notifyAll();
         }

         f = false;
      }

   }

   public static void n() {
   }

   public static void o() {
   }

   public static void p() {
      i = true;
      synchronized(q) {
         try {
            q.wait(2000L);
         } catch (InterruptedException var3) {
         }

      }
   }

   public static void q() {
      if (i) {
         synchronized(q) {
            q.notifyAll();
         }

         i = false;
      }

   }

   public static boolean r() {
      k = true;
      long var0 = System.currentTimeMillis();
      synchronized(q) {
         try {
            q.wait(7000L);
         } catch (InterruptedException var5) {
         }
      }

      return System.currentTimeMillis() - var0 < 7000L;
   }

   public static void s() {
      if (k) {
         synchronized(q) {
            q.notifyAll();
         }

         k = false;
      }

   }

   public static boolean t() {
      r = Auto.g != null ? Auto.g.point : 0;
      l = true;
      synchronized(q) {
         try {
            q.wait(3000L);
         } catch (InterruptedException var3) {
         }
      }

      return Auto.g == null || Auto.g.point > r;
   }

   public static void u() {
      if (l) {
         synchronized(q) {
            q.notifyAll();
         }

         l = false;
      }

   }

   public static void v() {
      m = true;
      synchronized(q) {
         try {
            q.wait(3000L);
         } catch (InterruptedException var3) {
         }

      }
   }

   public static void w() {
      if (m) {
         synchronized(q) {
            q.notifyAll();
         }

         m = false;
      }

   }

   public static void x() {
   }

   public static boolean y() {
      int var0 = 0;

      label31:
      while(var0 < NSOT_MOB.e.size()) {
         String var1 = (String)NSOT_MOB.e.elementAt(var0);

         for(int var2 = 0; var2 < GameScr.vParty.size(); ++var2) {
            Party var3;
            if ((var3 = (Party)GameScr.vParty.elementAt(var2)).name.equals(var1)) {
               if (var3.c == null || Res.a(Char.getMyChar().cx, Char.getMyChar().cy, var3.c.cx, var3.c.cy) > 100) {
                  return false;
               }

               ++var0;
               continue label31;
            }
         }

         return false;
      }

      return true;
   }

   public static void z() {
   }

   public static boolean aa() {
      label24:
      for(int var0 = 0; var0 < NSOT_MOB.e.size(); ++var0) {
         String var1 = (String)NSOT_MOB.e.elementAt(var0);

         for(int var2 = 0; var2 < GameScr.vParty.size(); ++var2) {
            if (((Party)GameScr.vParty.elementAt(var2)).name.equals(var1)) {
               continue label24;
            }
         }

         return false;
      }

      return true;
   }

   public static void a(long var0) {
      if (NSOT_MOB.d != null) {
         long var2 = System.currentTimeMillis();

         while(!y() && System.currentTimeMillis() - var2 < 200000L) {
            ThreadUtil.ThreadCatch(2000L);
         }
      }

   }

   public static void ab() {
   }

   public static void ac() {
      synchronized(q) {
         q.notifyAll();
      }

      b = false;
      d = false;
      e = false;
      f = false;
      g = false;
      h = false;
      j = false;
      c = false;
      i = false;
      a = false;
      k = false;
      l = false;
      m = false;
      n = false;
      o = false;
      p = false;
      TileMap.ag = false;
      TileMap.i();
   }

   public static void ad() {
      c = false;
      a = false;
      b = false;
      d = false;
      e = false;
      f = false;
      g = false;
      h = false;
      i = false;
      j = false;
      k = false;
      l = false;
      m = false;
      n = false;
      o = false;
      p = false;
      q = null;
      r = 0;
   }

   static {
      Main.main(28);
      a();
   }
}

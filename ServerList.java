public class ServerList {
   public static String[] list = new String[]{"Bokken", "Shuriken", "Tessen", "Kunai", "Katana", "Tone", "Sanzu", "Sensha", "Fukiya", "Tekkan", "Daisho", "Hirosaki", "Haruna", "Bisento"};
   int b = 3;
   int c = 3;
   int d;

   public ServerList() {
      this.d = (this.b - this.c) * 3;
   }
}

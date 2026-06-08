public final class StaticObj {
   public static int TOP_HCENTER;
   public static int TOP_LEFT;
   public static int TOP_RIGHT;
   public static int BOTTOM_HCENTER;
   public static int BOTTOM_LEFT;
   public static int BOTTOM_RIGHT;
   public static int VCENTER_HCENTER;
   public static int VCENTER_LEFT;

   public static void a() {
      TOP_HCENTER = 17;
      TOP_LEFT = 20;
      TOP_RIGHT = 24;
      BOTTOM_HCENTER = 33;
      BOTTOM_LEFT = 36;
      BOTTOM_RIGHT = 40;
      VCENTER_HCENTER = 3;
      VCENTER_LEFT = 6;
      int[][] var10000 = new int[][]{new int[4], {1, 1, 1, 1}, new int[4], {2, 2, 2, 2}, {3, 3, 3, 3}, {4, -1, -1, 4}, {5, 5, 5, -1}, {6, 6, 6, 5}, {7, 7, -1, -1}, {8, 8, 8, 7}, {9, -1, -1, 8}, {10, -1, -1, 9}, {11, -1, -1, -1}, {13, 13, -1, -1}, {14, 14, 14, -1}, {15, 15, -1, -1}, {16, 16, 16, -1}};
      int[] var2 = new int[]{5614318, 4751608, 1052688, 2081781, 2081781, 0, 10541304, 2526662, 1513480, 16760764, 0, 1285290, 1285290, 0, 4882101, 3018762, 4352644};
   }

   public static void b() {
      TOP_HCENTER = 0;
      TOP_LEFT = 0;
      TOP_RIGHT = 0;
      BOTTOM_HCENTER = 0;
      BOTTOM_LEFT = 0;
      BOTTOM_RIGHT = 0;
      VCENTER_HCENTER = 0;
      VCENTER_LEFT = 0;
   }

   static {
      Main.main(31);
      a();
   }
}

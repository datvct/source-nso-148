public final class AutoDapDo extends Auto {
   private long lastOpenTime;

   public final void update() {
      if (!AutoDapDoPanel.isOn) {
         AutoDapDoPanel.finish((String)null);
         return;
      }

      if (Char.getMyChar() == null || Char.getMyChar().arrItemBag == null) {
         AutoDapDoPanel.finish("Chua vao game");
         return;
      }

      if (!TileMap.d(TileMap.mapID)) {
         this.a(getVillageMap(), -1, -1, -1);
         return;
      }

      openUpgradeUI();
      AutoDapDoPanel.processUpgrade();
   }

   private void openUpgradeUI() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.lastOpenTime < 5000L) {
         return;
      }

      this.lastOpenTime = var1;
      GameScr.gI().d(AutoDapDoPanel.useLuongInsurance ? 31 : 10);
   }

   private static int getVillageMap() {
      int var0 = Char.getMyChar().e();
      if (var0 == 2) {
         return 22;
      } else {
         return var0 == 3 ? 17 : 10;
      }
   }

   public final String toString() {
      return "Auto dap do";
   }
}

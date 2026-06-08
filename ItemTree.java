import javax.microedition.lcdui.Image;

public final class ItemTree {
   public int idTree;
   private int xTree;
   private int yTree;

   public ItemTree(int var1, int var2) {
      this.xTree = var1 * 24 + 12;
      this.yTree = var2 * 24 + 24 + 3;
   }

   private Object a() {
      Object var1;
      return (var1 = TileMap.x.get(String.valueOf(this.idTree))) != null ? var1 : null;
   }

   public final void a(mGraphics var1) {
      if (!GameCanvas.a && this.a() != null) {
         var1.a((Image)this.a(), this.xTree, this.yTree, 33);
      }

   }
}

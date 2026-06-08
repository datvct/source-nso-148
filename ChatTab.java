public final class ChatTab {
   public int type;
   public String ownerName;
   public MyVector contents = new MyVector();
   public long d = 0L;

   public ChatTab(String var1, int var2) {
      this.ownerName = var1;
      this.type = var2;
   }

   public final void addChat(String var1, String var2) {
      boolean var3 = false;
      if (GameScr.isPaintMessage && ChatManager.gI().getCurrentChatTab() == this && GameScr.indexRow == this.contents.size() - 1) {
         var3 = true;
      }

      this.contents.addElement("c3@" + var1);
      MyVector var4 = mFont.tahoma_7_white.a(var2, 160);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         this.contents.addElement("c0" + var4.elementAt(var5));
      }

      if (var3) {
         GameScr.gI().ai();
      }

      this.clear();
   }

   private void clear() {
      while(this.contents.size() > 50) {
         this.contents.removeElementAt(1);
      }

   }

   public final void addInfo(String var1) {
      boolean var2 = false;
      if (GameScr.isPaintMessage && ChatManager.gI().getCurrentChatTab() == this && GameScr.indexRow == this.contents.size() - 1) {
         var2 = true;
      }

      MyVector var3 = mFont.tahoma_7_white.a(var1, 160);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         this.contents.addElement(var3.elementAt(var4));
      }

      if (var2) {
         GameScr.gI().ai();
      }

      this.clear();
   }
}

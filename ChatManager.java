public final class ChatManager {
   public MyVector chatTabs = new MyVector();
   private static ChatManager instance;
   public int currentTabIndex = 0;
   public static boolean c;
   public static boolean d;
   public static boolean e;
   public static boolean f;
   public MyVector waitList = new MyVector();

   public final void switchToNextTab() {
      ++this.currentTabIndex;
      if (this.currentTabIndex > this.chatTabs.size() - 1) {
         this.currentTabIndex = 0;
      }

   }

   public final void switchToPreviousTab() {
      --this.currentTabIndex;
      if (this.currentTabIndex < 0) {
         this.currentTabIndex = this.chatTabs.size() - 1;
      }

   }

   public final void switchToTab(int var1) {
      this.currentTabIndex = var1;
   }

   public final void switchToTab(ChatTab var1) {
      this.currentTabIndex = this.chatTabs.indexOf(var1);
   }

   public final void switchToLastTab() {
      this.currentTabIndex = this.chatTabs.size() - 1;
   }

   public static ChatManager gI() {
      return instance == null ? (instance = new ChatManager()) : instance;
   }

   public ChatManager() {
      this.chatTabs.addElement(new ChatTab(mResources.or[0], 0));
      this.chatTabs.addElement(new ChatTab(mResources.os[0], 1));
      this.chatTabs.addElement(new ChatTab(mResources.ot[0], 3));
      this.chatTabs.addElement(new ChatTab(mResources.ou[0], 4));
      ChatTab var1;
      (var1 = this.findTab(mResources.ot[0])).addInfo("c8" + mResources.ot[1]);
      var1.addInfo("c8" + mResources.ot[2]);
      var1.addInfo("c8" + mResources.ot[3]);
      this.findTab(mResources.os[0]).addInfo("c8" + mResources.os[1]);
      this.findTab(mResources.ou[0]).addInfo("c8" + mResources.ou[1]);
      this.findTab(mResources.or[0]).addInfo("c8" + mResources.or[1]);
   }

   public final ChatTab findTab(String var1) {
      for(int var2 = 0; var2 < this.chatTabs.size(); ++var2) {
         ChatTab var3;
         if ((var3 = (ChatTab)this.chatTabs.elementAt(var2)).ownerName.equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public final void addChat(String var1, String var2, String var3) {
      ChatTab var4;
      if ((var4 = this.findTab(var1)) == null) {
         var4 = this.addNewTab(var1);
      }

      var4.addChat(var2, var3);
   }

   public final ChatTab getCurrentChatTab() {
      return (ChatTab)this.chatTabs.elementAt(this.currentTabIndex);
   }

   public final ChatTab addNewTab(String var1) {
      ChatTab var2 = new ChatTab(var1, 2);
      if (!GameCanvas.isTouch) {
         var2.addInfo("c2" + mResources.oq);
      }

      this.chatTabs.addElement(var2);
      return var2;
   }

   public final void addWaitList(String var1) {
      for(int var2 = 0; var2 < this.waitList.size(); ++var2) {
         if (((String)this.waitList.elementAt(var2)).equals(var1)) {
            return;
         }
      }

      this.waitList.addElement(var1);
   }

   public final boolean findWaitPerson(String var1) {
      for(int var2 = 0; var2 < this.waitList.size(); ++var2) {
         if (((String)this.waitList.elementAt(var2)).equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final void removeFromWaitList(String var1) {
      for(int var2 = 0; var2 < this.waitList.size(); ++var2) {
         if (((String)this.waitList.elementAt(var2)).equals(var1)) {
            this.waitList.removeElementAt(var2);
            return;
         }
      }

   }

   public static void clear() {
      instance = null;
   }

   public static void g() {
   }

   public static void h() {
      instance = null;
      c = false;
      d = false;
      e = false;
      f = false;
   }

   static {
      Main.main(58);
      g();
   }
}

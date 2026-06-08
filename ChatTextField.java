public final class ChatTextField implements IActionListener {
   private static ChatTextField instance;
   public TField tfChat;
   public boolean isShow = false;
   public IChatable parentScreen;
   private long lastChatTime = 0L;
   public Command1 left;
   public Command1 right;
   public Command1 cmdChat;
   public String g;

   public static ChatTextField gI() {
      return instance == null ? (instance = new ChatTextField()) : instance;
   }

   protected ChatTextField() {
      this.left = new Command1(mResources.cg, this, 8000, (Object)null, 1, GameCanvas.aa - mScreen.fp + 1);
      this.right = new Command1(mResources.bf, this, 8001, (Object)null, GameCanvas.z - 53, GameCanvas.aa - mScreen.fp + 1);
      this.cmdChat = null;
      this.tfChat = new TField();
      this.tfChat.j = "chat";
      this.tfChat.a = 16;
      GameCanvas var1 = GameCanvas.instance;
      this.tfChat.c = MotherCanvas.instance.getHeights() - 32;
      this.tfChat.d = mScreen.fn + 2;
      this.tfChat.e = true;
      this.tfChat.b(40);
   }

   public final void startChat(int var1, IChatable var2, String var3) {
      this.right.caption = mResources.aq;
      this.g = var3;
      this.tfChat.keyPress(var1);
      if (!this.tfChat.e().equals("") && GameCanvas.currentDialog == null) {
         this.parentScreen = var2;
         this.isShow = true;
      }

      this.tfChat.g = var3;
   }

   public final void startChat(String to) {
      this.right.caption = mResources.aq;
      this.g = to;
      if (GameCanvas.currentDialog == null) {
         this.isShow = true;
         if (GameCanvas.isTouch) {
            this.tfChat.b();
         }
      }

      this.tfChat.g = to;
   }

   public final void paint(mGraphics var1) {
      if (this.isShow) {
         this.tfChat.a(var1);
      }

   }

   public final void perform(int var1, Object var2) {
      switch (var1) {
         case 8000:
            if (this.parentScreen != null) {
               long var3;
               if ((var3 = System.currentTimeMillis()) - this.lastChatTime < 1000L) {
                  return;
               }

               this.lastChatTime = var3;
               this.parentScreen.onChatFromMe(this.tfChat.e(), this.g);
               this.tfChat.a("");
               this.right.caption = mResources.aq;
               return;
            }
            break;
         case 8001:
            this.tfChat.c();
            if (this.tfChat.e().equals("")) {
               this.isShow = false;
               this.parentScreen.onCancelChat();
            }
      }

   }

   public static void update() {
   }

   public static void c() {
      instance = null;
   }

   static {
      Main.main(6);
      update();
   }
}

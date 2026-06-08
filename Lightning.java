public final class Lightning extends Effect2 {
   private int[] color = new int[]{16579837, 11188220};
   private MyVector listPos = new MyVector();
   private MyVector[] list;
   private mResources h;
   private long timeDel = 0L;
   private boolean isContinue = false;
   private boolean isRemove = true;
   private int tick = 0;
   private int cou = 0;
   private int dem = 0;
   private int aa = 7;

   public static void addLight(MyVector var0, mResources var1, int var2) {
      Lightning var3;
      (var3 = new Lightning()).color[1] = var2;

      for(var2 = 0; var2 < var0.size(); ++var2) {
         mResources var4;
         if ((var4 = (mResources)var0.elementAt(var2)) != null && (Res.abs(var4.a - var1.a) >= 100 || Res.abs(var4.b - var1.b) >= 50)) {
            var0.removeElementAt(var2);
         }
      }

      var3.setInfo(var0, var1, true);
      Effect2.vEffect2.addElement(var3);
   }

   private void setInfo(MyVector var1, mResources var2, boolean var3) {
      if (var1.size() != 0) {
         this.isContinue = var3;
         MyVector var4;
         int var5;
         int var6;
         mResources var7;
         int var8;
         mResources var9;
         if (!var3) {
            var4 = var1;
            var5 = var1.size();

            for(var6 = 0; var6 < var5 - 1; ++var6) {
               var7 = (mResources)var4.elementAt(var6);

               for(var8 = var6 + 1; var8 < var5; ++var8) {
                  var9 = (mResources)var4.elementAt(var8);
                  if (var7.a > var9.a) {
                     var4.setElementAt(var7, var8);
                     var4.setElementAt(var9, var6);
                     var7 = var9;
                  }
               }
            }
         }

         this.listPos = var1;
         this.h = var2;
         this.list = new MyVector[var1.size()];

         int var10;
         for(var10 = 0; var10 < this.list.length; ++var10) {
            this.list[var10] = new MyVector();
         }

         var2.c = -1;
         this.list[0].addElement(var2);
         var10 = -1;

         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         mResources var16;
         int var17;
         int var18;
         mResources var19;
         for(var5 = 0; var5 < var1.size(); ++var5) {
            var11 = var2.a;
            int var20 = var2.b;
            if (var3 && var10 != -1) {
               var11 = (var16 = (mResources)var1.elementAt(var10)).a;
               var20 = var16.b;
            }

            if (var3) {
               ++var10;
            } else {
               var4 = var1;
               var6 = 0;

               for(var17 = 0; var17 < var4.size(); ++var17) {
                  if (((mResources)var4.elementAt(var17)).d == -1) {
                     ++var6;
                  }
               }

               int var21;
               label98: {
                  if (var6 != 0) {
                     var6 = Res.rnd(var6);
                     var17 = 0;

                     for(var8 = 0; var8 < var4.size(); ++var8) {
                        if ((var9 = (mResources)var4.elementAt(var8)).d == -1) {
                           if (var6 == var17) {
                              var9.d = 0;
                              var21 = var8;
                              break label98;
                           }

                           ++var17;
                        }
                     }
                  }

                  var21 = -1;
               }

               var10 = var21;
            }

            var6 = this.list[var10].size() - 1;
            var8 = Res.tan((var7 = (mResources)var1.elementAt(var10)).a - var11, -(var7.b - var20));
            var15 = Res.rnd(15) + 10;
            var18 = 0;

            while(true) {
               var12 = 0;
               if (var18 != 0) {
                  var12 = var8 - 5 + Res.rnd(10);
               }

               var12 = Res.fixangle(var12);
               var13 = var15 * var18 * Res.cos(var12) >> 10;
               var14 = -(var15 * var18 * Res.sin(var12)) >> 10;
               var19 = new mResources(var11 + var13, var20 + var14, var6++);
               this.list[var10].addElement(var19);
               if (Res.a(var11, var20, var11 + var13, var20 + var14) >= Res.a(var11, var20, var7.a, var7.b) - 20) {
                  break;
               }

               ++var18;
            }
         }

         for(var5 = 0; var5 < this.list.length; ++var5) {
            var11 = this.list[var5].size();
            mResources var22;
            (var22 = (mResources)var1.elementAt(var5)).c = (byte)(this.list[var5].size() - 1);
            var22.d = -1;
            (var16 = new mResources(var22.a, var22.b, var22.c)).d = -1;
            this.list[var5].addElement(var16);

            for(var17 = 1; var17 < var11; ++var17) {
               var19 = (mResources)this.list[var5].elementAt(var17);
               var15 = Res.rnd(2);

               for(var18 = 0; var18 < var15; ++var18) {
                  var12 = 180 + Res.rnd(180);
                  var14 = (var13 = 5 + Res.rnd(10)) * Res.cos(Res.fixangle(var12)) >> 10;
                  var12 = -(var13 * Res.sin(Res.fixangle(var12))) >> 10;
                  (var2 = new mResources(var19.a + var14, var19.b + var12, var17)).d = 0;
                  this.list[var5].addElement(var2);
               }
            }
         }
      }

   }

   public final void update() {
      if (this.h == null) {
         Effect2.vRemoveEffect2.addElement(this);
      } else {
         try {
            if (GameCanvas.u % 2 == 1) {
               this.h.c = -1;
               this.h.d = -1;

               for(int var1 = 0; var1 < this.listPos.size(); ++var1) {
                  mResources var2;
                  (var2 = (mResources)this.listPos.elementAt(var1)).d = -1;
                  var2.c = -1;
               }

               if (this.isContinue && this.isRemove && this.listPos.size() > 1 && System.currentTimeMillis() / 10L - this.timeDel > 30L) {
                  this.timeDel = System.currentTimeMillis() / 10L;
                  this.h = (mResources)this.listPos.elementAt(0);
                  this.listPos.removeElementAt(0);
               }

               this.setInfo(this.listPos, this.h, this.isContinue);
               if (this.tick > 3) {
                  this.aa = 7;
                  Effect2.vEffect2.removeElement(this);
               }

               ++this.tick;
               return;
            }
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

   }

   public final void paint(mGraphics var1) {
      this.dem = 0;
      if (++this.cou >= 12) {
         this.cou = 0;
      }

      if (this.list != null) {
         for(int var2 = 0; var2 < this.list.length; ++var2) {
            for(int var3 = 0; var3 < this.list[var2].size(); ++var3) {
               mResources var4;
               if ((var4 = (mResources)this.list[var2].elementAt(var3)).c >= 0 && var4.c < this.list[var2].size()) {
                  mResources var5 = (mResources)this.list[var2].elementAt(var4.c);
                  if (GameCanvas.e(var4.a, var4.b) && GameCanvas.e(var5.a, var5.b)) {
                     var1.a(this.color[0]);
                     var1.a(var4.a, var4.b, var5.a, var5.b);
                     if (var4.d == -1) {
                        var1.a(this.color[1]);
                        var1.a(var4.a - 1, var4.b, var5.a - 1, var5.b);
                        if (this.isContinue && this.isRemove) {
                           var1.a(var4.a + 1, var4.b, var5.a + 1, var5.b);
                        }
                     }
                  }

                  if (this.isContinue && this.isRemove) {
                     ++this.dem;
                     if (this.dem >= this.aa) {
                        this.aa += 7;
                        return;
                     }
                  }
               }
            }
         }
      }

   }
}

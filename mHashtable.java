import java.util.Hashtable;

public final class mHashtable extends Hashtable {
   public final synchronized Object put(Object var1, Object var2) {
      return super.put(var1, var2);
   }

   public final synchronized void clear() {
      super.clear();
   }

   public final synchronized Object remove(Object var1) {
      return super.remove(var1);
   }

   public final synchronized Object get(Object var1) {
      return super.get(var1);
   }
}

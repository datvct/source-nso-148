import java.util.Vector;

public class SimpleJSON {
    
    public static String getString(String json, String key) {
        String searchKey = "\"" + key + "\":";
        int index = json.indexOf(searchKey);
        if (index == -1) {
            return null;
        }
        int start = index + searchKey.length();
        while (start < json.length() && (json.charAt(start) == ' ' || json.charAt(start) == '\t')) {
            start++;
        }
        if (start >= json.length()) return null;
        
        if (json.charAt(start) == '\"') {
            start++;
            int end = json.indexOf("\"", start);
            if (end != -1) {
                return json.substring(start, end);
            }
        } else {
            int end = json.indexOf(",", start);
            if (end == -1) {
                end = json.indexOf("}", start);
            }
            if (end != -1) {
                return json.substring(start, end).trim();
            }
        }
        return null;
    }

    public static int getInt(String json, String key) {
        String val = getString(json, key);
        if (val == null) return 0;
        try {
            return Integer.parseInt(val);
        } catch (Exception e) {
            return 0;
        }
    }

    public static boolean getBoolean(String json, String key) {
        String val = getString(json, key);
        return val != null && val.equals("true");
    }

    public static String[] getArray(String json, String key) {
        String searchKey = "\"" + key + "\":";
        int index = json.indexOf(searchKey);
        if (index == -1) return new String[0];
        
        int start = json.indexOf("[", index);
        int end = json.indexOf("]", start);
        if (start == -1 || end == -1) return new String[0];
        
        String arrayStr = json.substring(start + 1, end).trim();
        if (arrayStr.length() == 0) return new String[0];
        
        Vector v = new Vector();
        int current = 0;
        while (current < arrayStr.length()) {
            int quote1 = arrayStr.indexOf("\"", current);
            if (quote1 == -1) break;
            int quote2 = arrayStr.indexOf("\"", quote1 + 1);
            if (quote2 == -1) break;
            
            v.addElement(arrayStr.substring(quote1 + 1, quote2));
            current = quote2 + 1;
        }
        
        String[] result = new String[v.size()];
        for (int i = 0; i < v.size(); i++) {
            result[i] = (String) v.elementAt(i);
        }
        return result;
    }
}

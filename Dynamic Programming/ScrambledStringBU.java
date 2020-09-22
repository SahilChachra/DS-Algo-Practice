import java.util.HashMap;

public class ScrambledStringBU {

    HashMap<String, Boolean> map;

    ScrambledStringBU() {
        map = new HashMap<>();
    }

    public boolean isScrambled(String a, String b) {
        if(a.equals(b))
            return true;

        if(a.length()<=1)
            return false;

        String key = a + " " + b;
        if(map.containsKey(key))
            return map.get(key);

        int n = a.length();
        boolean flag = false;

        for(int i = 1;i<=n-1;i++){
            if(((isScrambled(a.substring(0, i), b.substring(n - i))) && isScrambled(a.substring(i, n - i),
                    b.substring(0, n - 1))) || (isScrambled(a.substring(0,i), b.substring(0, i)) &&
                    isScrambled(a.substring(i,n-1), b.substring(i,n-i))))
            {
                flag = true;
                break;
            }
        }
        map.put(key, flag);
        return flag;
    }

    public static void main(String[] args) {
        ScrambledStringBU ssb = new ScrambledStringBU();
        System.out.println(ssb.isScrambled("great", "eatgr"));
    }

}

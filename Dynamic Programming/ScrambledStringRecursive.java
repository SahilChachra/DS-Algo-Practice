public class ScrambledStringRecursive {

    //Break into 2 child at once
    //Child should not be empty
    //

    public boolean isScrambled(String a, String b) {

        if(a.equals(b))
            return true;

        if(a.length()<=1)
            return false;

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
        return flag;
    }

}

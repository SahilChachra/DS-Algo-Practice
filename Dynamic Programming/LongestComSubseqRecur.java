public class LongestComSubseqRecur {

    public int longestSubSeq(String s1, String s2){

        int len = getLen(s1.toCharArray(),s2.toCharArray(), s1.length(), s2.length());
        return len;
    }

    private int getLen(char[]a, char []b,int len_a, int len_b){

        if(len_a==0 || len_b==0)
            return 0;

        if(a[len_a-1] == b[len_b-1])
            return 1 + getLen(a,b,len_a-1, len_b-1);

        else
            return Math.max(getLen(a, b, len_a, len_b-1), getLen(a, b, len_a-1, len_b));
    }

}

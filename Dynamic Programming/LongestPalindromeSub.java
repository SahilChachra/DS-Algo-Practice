public class LongestPalindromeSub {

    public int getLenLongestPalinSub(String a) {

        StringBuffer sb = new StringBuffer(a);
        String b = sb.reverse().toString();

        int lcs = getLCS(a.toCharArray(),b.toCharArray(), a.length(), b.length());

        return lcs;

    }

    private int getLCS(char[] a, char[] b, int n, int m) {
        int i,j;
        int [][]t = new int[n+1][m+1];

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==0 || j==0)
                    t[i][j]=0;
            }
        }

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(a[i-1]==b[i-1])
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        return t[n][m];
    }

}

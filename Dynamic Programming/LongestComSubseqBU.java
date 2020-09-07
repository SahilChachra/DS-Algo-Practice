public class LongestComSubseqBU {

    public int returnLCS(String s1, String s2){
        int l = LCS(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
        return l;
    }

    private int LCS(char[] a, char []b, int n, int m){
        int [][]t = new int[n+1][m+1];

        int i,j;

        for(i=0;i<=n;i++){
            t[i][0] = 0;
        }

        for(i=0;i<=m;i++){
            t[0][i] = 0;
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

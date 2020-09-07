public class LongestComSubseqMem {

    static int [][]t;

    LongestComSubseqMem(int n, int m){
        t = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++)
                t[i][j]=-1;
        }
    }

    public static int lcs(String s1, String s2){

        int l = getLCS(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
        return l;
    }

    private static int getLCS(char[] a, char[] b, int n, int m){

         if(n==0 || m==0)
             return 0;

         if(t[n][m]!=-1)
             return t[n][m];

         if(a[n-1]==b[n-1])
             return t[n][m] = 1 + getLCS(a, b, n-1, m-1);

         else
             return t[n][m] = Math.max(getLCS(a, b, n, m-1), getLCS(a, b, n-1, m));
    }

}

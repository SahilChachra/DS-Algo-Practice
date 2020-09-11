public class MiniInsertionPalin {

    public int miniInsert(String x) {

        StringBuffer sb = new StringBuffer(x);
        String y = sb.reverse().toString();
        char[] b = y.toCharArray();
        char[] a = x.toCharArray();
        int i,j;
        int n = a.length;
        int m = b.length;

        int [][]t = new int[n+1][m+1];

        for(i=0;i<=n;i++){
            t[i][0] = 0;
        }

        for(i=0;i<=m;i++){
            t[0][i] = 0;
        }

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(a[i-1]==b[j-1])
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        return b.length - t[n][m];
    }

}

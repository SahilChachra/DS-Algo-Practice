public class LongestRepeatingSubs {

    public int returnLength(String x){
        char[] a = x.toCharArray();
        char[] b = x.toCharArray();
        int i,j;
        int n = x.length();
        int m = n;

        int [][]t = new int[n+1][m+1];

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==0 || j==0)
                    t[i][j] = 0;
            }
        }

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(a[i-1]==b[j-1] && i!=j)
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        return t[n][m];
    }
}

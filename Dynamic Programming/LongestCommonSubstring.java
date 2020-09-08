public class LongestCommonSubstring {

    public int getLongestCSubstring(String a, String b){
        int max = getLCS(a.toCharArray() ,b.toCharArray() ,a.length(), b.length());
        return max;
    }

    private int getLCS(char[] a, char[] b, int n, int m) {
        int [][]t = new int[n+1][m+1];

        int i,j;

        for(i=0;i<=n;i++){
            for(j=0;j<=m;j++){
                if(i==0 || j==0)
                    t[i][j]=0;
            }
        }

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(a[i-1]==b[j-1]){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else
                    t[i][j]=0;
            }
        }
        return t[n][m];
    }

}

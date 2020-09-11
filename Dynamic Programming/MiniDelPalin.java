public class MiniDelPalin {

    public void printInsDel(String a) {

        StringBuffer sb = new StringBuffer(a);
        String b = sb.reverse().toString();

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int n = a.length();
        int m = b.length();

        int [][]t = new int[n+1][m+1];
        int i,j;

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==0 || j==0)
                    t[i][j] = 0;
            }
        }

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(x[i-1]==y[j-1])
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        System.out.println("Deletions : "+(a.length() - t[n][m]));

    }

    public static void main(String[] args) {
        MiniDelPalin mp = new MiniDelPalin();

        mp.printInsDel("ababba");
    }

}

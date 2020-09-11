public class PrintSCS {

    public void printSuper(String x, String y){
        int n = x.length();
        int m = y.length();
        int [][]t = new int[n+1][m+1];
        char []a = x.toCharArray();
        char[] b = y.toCharArray();
        int i,j;

        for(i=0;i<=n;i++){
            for(j=0;j<=m;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
            }
        }

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(a[i-1]==b[j-1]){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        i = n; j = m;
        String ans = "";
        while(i>0 && j>0) {
            if(a[i-1]==b[j-1]){
                ans = a[i-1] + ans;
                i--;
                j--;
            }
            else {
                if(t[i][j-1] > t[i-1][j]){
                    ans = b[j-1] + ans;
                    j--;
                }
                else {
                    ans = a[i-1] + ans;
                    i--;
                }
            }
        }
       while(i>0) {
            ans = a[i-1] + ans;
            i--;
        }
        while(j>0) {
            ans = b[j-1] + ans;
            j--;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        PrintSCS ps = new PrintSCS();
        ps.printSuper("abcdafg","acbcf");
    }

}

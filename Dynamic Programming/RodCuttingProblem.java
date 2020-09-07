public class RodCuttingProblem {

    public int maxProfit(int []price, int n, int size){
        int i,j=0;
        int []l = new int[size];
        for(i=0;i<n;i++)
            l[i]=i+1;

        int [][]t = new int[size+1][n+1];
        for(i=0;i<=size;i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        for(i=1;i<=size;i++){
            for(j=1;j<=n;j++){
                if(price[i-1]<=j){
                    t[i][j] = Math.max(t[i-1][j], price[i-1]+t[i][j - l[j - 1]]);
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[size][n];
    }
}

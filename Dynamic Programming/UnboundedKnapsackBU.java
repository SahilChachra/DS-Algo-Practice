public class UnboundedKnapsackBU {

    public int knapsackUnbounded(int val[], int wt[], int size, int w){
        int [][]t = new int[size+1][w+1];

        int i,j;

        for(i=0;i<=size;i++)
            t[i][0] = 1;
        for(i=1;i<=w;i++)
            t[0][i]=0;

        for(i=1;i<=size;i++){
            for(j=1;j<=w;j++){
                if(wt[i-1]<=j)
                    t[i][j] = Math.max(val[i-1] + t[i][j - wt[i-1]], t[i-1][j]);
                else
                    t[i][j] = t[i-1][j];
            }
        }

        return  t[size][w];
    }
}

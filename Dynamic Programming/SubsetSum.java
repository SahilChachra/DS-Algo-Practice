public class SubsetSum {

    public boolean checkSum(int arr[], int sum, int size){

        boolean t[][] = new boolean[size+1][sum+1];

        //i = array, j = sum


        int i,j;
        for(i=0;i<size+1;i++)
            t[i][0] = true;

        for(i=1;i<sum+1;i++)
            t[0][i]=false;

        //knapsack wt array = array in subset
        // w in knapsack = sum in subset
        // Max() becomes Logical OR

        for(i=1;i<=size;i++){
            for(j=1;j<=sum;j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j] || t[i-1][j - arr[i-1]];
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[size][sum];
    }

    private int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }

}

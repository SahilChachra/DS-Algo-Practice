public class CoinChangeMaxNumWays {

    public int countWays(int []coins, int sum, int size){
        int [][]t = new int[size+1][sum+1];
        int i,j;

        t[0][0]=1;

        for(i=1;i<=sum;i++){ //Size is 0, is any sum possible? No.
            t[0][i]=0;
        }

        for(i=1;i<=size;i++){
            t[i][0]=1;  //Size is given and sum 0 is possible? Yes = Null set
        }

        for(i=1;i<=size;i++){
            for(j=1;j<=sum;j++){
                if(coins[i-1]<=j){
                    t[i][j] = t[i-1][j] + t[i][j - coins[i -1]];
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }

        return t[size][sum];
    }



}

public class CoinChangeMiniNum {

    public int minNumberCoins(int []coins, int sum, int size){
        int [][]t = new int[size+1][sum+1];
        int i=0,j=0;

        for(i=0;i<=sum;i++){
            t[0][i] = Integer.MAX_VALUE-1;
        }

        for(i=1; i<=size;i++){
            t[i][0] = 0;
        }

        for(j=1;j<=sum;j++){
            if(j%coins[0]==0)
                t[1][j] = j/coins[0];
            else
                t[1][j] = Integer.MAX_VALUE-1;
        }

        for(i=1;i<=size;i++){
            for(j=1;j<=sum;j++){
                if(coins[i-1]<=j) {
                    t[i][j] = Math.min(t[i - 1][j],t[i - 1][j - coins[i - 1]]+1);
                } else
                    t[i][j] = t[i-1][j];
            }
        }

        return t[size][sum];
    }

}

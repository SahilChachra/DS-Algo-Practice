public class KnapsackBU { //BOTTOM UP

     public int knapsack(int wt[], int val[], int w, int size){
         int t[][] = new int[size+1][w+1];

         for(int i = 0;i<size+1;i++){
             for(int j=0;j<w+1;j++){
                 if(i==0 || j==0)
                     t[i][j]=0;
             }
         }

         for(int i=1;i<size+1;i++){
             for(int j=1;j<w+1;j++){
                 if(wt[i+1]<w){
                     t[i][j] = max(val[i-1]+t[i-1][w-wt[i-1]],t[i-1][j]);
                 }
                 else
                     t[i][j] = t[i-1][j];
             }
         }
        return t[size][w];
     }

    public int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }

}



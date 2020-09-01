public class KnapsackMemoization {

    int t[][];
    KnapsackMemoization(int size, int w){
        t = new int[size+1][w+1];
        for(int i=0;i<=size+1;i++){
            for(int j=0;j<=w+1;j++)
                t[i][j]=-1;
        }
    }

    public int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }

    public int knapsack(int wt[], int val[], int w, int size){
        if(size==0 || w==0)
            return 0; //returning profit

        if(t[size][w]!=-1)
            return t[size][w];

        if(wt[size-1]<=w)
            return t[size][w] = max(val[size-1]+knapsack(wt, val, w-wt[size-1], size-1),
                    knapsack(wt, val, w, size-1));
        else
            return t[size][w] = knapsack(wt, val, w, size-1);

    }

}

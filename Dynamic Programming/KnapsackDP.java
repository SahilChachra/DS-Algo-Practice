public class KnapsackDP {

    public int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }

    public int knapsack(int wt[], int val[], int w, int size){
        if(size==0 || w==0)
            return 0; //returning profit
        if(wt[size-1]<=w)
            return max(val[size-1]+knapsack(wt, val, w-wt[size-1], size-1),
                    knapsack(wt, val, w, size-1));
        else
            return knapsack(wt, val, w, size-1);

    }
}

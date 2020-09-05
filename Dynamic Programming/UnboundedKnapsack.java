public class UnboundedKnapsack {

    public int printUnbounded(int val[], int wt[], int size, int w){
        if(size==0)
            return 0;
        if(w==0)
            return 0;

        if(val[size-1]<=w){
            return printUnbounded(val, wt, size, w-wt[size-1]);
        }
        else
            return printUnbounded(val, wt, size-1, w);
    }

}



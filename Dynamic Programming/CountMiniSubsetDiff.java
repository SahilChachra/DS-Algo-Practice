public class CountMiniSubsetDiff {

    public int countMini(int arr[], int size, int d){
        int sum=0,i=0,j=0;

        for(i=0;i<size;i++)
            sum+=arr[i];
        int sum_set_1 = (d+sum)/2;
        int count = countSubset(arr, size, sum_set_1);
        return count;
    }

    private int countSubset(int arr[], int size, int sum) {
        int [][]t = new int[size+1][sum+1];

        int i=0,j=0;

        for(i=0;i<=size;i++)
            t[i][0]=1;

        for(i=1;i<=sum;i++)
            t[0][i]=0;

        for(i=1;i<=size;i++){
            for(j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j] + t[i-1][j - arr[i-1]];
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[size][sum];
    }

}

public class EqualSumPartition {

    public boolean equalPartition(int arr[], int size) {

        int i,sum=0;
        for(i=0;i<size;i++)
            sum = sum + arr[i];

        if(sum%2!=0)
            return false;

        else {
            // find subset for sum/2
            // problem solved. is sum was 22, if we get 11 means array can be divided into 2 parts!
            return subset(arr, size, sum/2);
        }
    }

    private boolean subset(int arr[], int size, int sum){
        if(sum==0)
            return true;
        if(size==0)
            return true;
        return subset(arr, size-1, sum-arr[size-1]);
    }

}

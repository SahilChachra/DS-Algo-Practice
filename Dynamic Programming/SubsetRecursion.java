public class SubsetRecursion {

    public boolean checkSum(int arr[], int size, int sum){
        if(sum==0)
            return true;
        if(size==0)
            return false;

        if(arr[size-1] > sum)
            return checkSum(arr, size-1, sum);

        return checkSum(arr, size-1, sum-arr[size-1]);
    }

}

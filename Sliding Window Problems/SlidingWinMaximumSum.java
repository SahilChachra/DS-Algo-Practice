public class SlidingWinMaximumSum {

    public int getMaxSum(int []arr, int k) {
        int i=0,j=0,sum=0;
        int max = Integer.MIN_VALUE;

        while(j< arr.length) {
            sum = sum + arr[j];

            if(j-i+1 < k)
                j++;

            else if(j-i+1 == k){
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        SlidingWinMaximumSum swms = new SlidingWinMaximumSum();
        int arr[] = {100,200,300,400};
        System.out.println(swms.getMaxSum(arr, 2));
    }

}

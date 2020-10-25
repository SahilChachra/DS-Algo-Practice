public class MinAndMax {

    class Pair {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
    }

    public Pair getMinMax(int []arr, int low, int high) {
        Pair minmax = new Pair(), minmaxl = new Pair(), minmaxr = new Pair();
        int mid=0;
        if(low==high){
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }

        else if(high==low+1){
            minmax.max = Math.max(arr[low], arr[high]);
            minmax.min = Math.min(arr[low], arr[high]);
        }

        mid = (low+high) / 2;
        minmaxl = getMinMax(arr, 0,mid);
        minmaxr = getMinMax(arr, mid+1, high);

        minmax.max = Math.max(minmaxr.max, minmaxl.max);
        minmax.min = Math.min(minmaxr.min, minmaxl.min);

        return minmax;

    }

    /*
    * Condition for 1 element
    * Condition for 2 elements
    * Else-
    * Find Minimum and Maximum in upper half
    * Find Minimum and Maximum in lower half
    * Compare minimum and maximum element from both the half
    * return the pair*/

    public static void main(String[] args) {
        int []arr = { 1000, 11, 445,
                1, 330, 3000 };
        int len = arr.length;
        MinAndMax mam = new MinAndMax();
        Pair ans = mam.getMinMax(arr, 0,len-1);
        System.out.println("Minimum is : "+ans.min+"\nMaximum is : "+ans.max);
    }

}

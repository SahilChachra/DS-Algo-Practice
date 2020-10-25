public class KthSmallest {

    public int partition(int []arr, int low, int high){
        int x = arr[high];
        int i = low;
        int t =0;
        for(int j = low; j<=high-1; j++) {
            if(arr[j]<=x) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;

                i++;
            }
        }

        t = arr[i];
        arr[i] = arr[high];
        arr[high] = t;

        return i;
    }

    public int getKSmallest(int []arr, int l, int r, int k){
        if(k>0 && k<=r-l+1){
            int pos = partition(arr, l ,r);
            if(pos-l==k-1)
                return arr[pos];
            if(pos - l > k - 1)
                return getKSmallest(arr, 0,pos-1, k);
            else
                return getKSmallest(arr, pos+1, r, k);
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        KthSmallest ks = new KthSmallest();
        int []arr = {30,120,6,10,1,90,5};
        System.out.println(ks.getKSmallest(arr, 0,arr.length-1, 3));
    }
}

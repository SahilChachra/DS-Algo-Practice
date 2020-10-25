public class ReverseArray {

    public int[] reverseArray(int []arr) {
        int len = arr.length;

        if(len==1) {
            return arr;
        }

        else if(len==2){
            int t=0;
            t=arr[0];
            arr[0]=arr[1];
            arr[1]=t;
            return arr;
        }

        else {
                int i = 0, j = len-1,t=0;
                for(i=0;i<len/2;i++){
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                    j--;
                }
            }
        return arr;

        /*
        * The loop runs till N/2
        * So we can reverse the array in O(N/2) time
        * */
    }

    public static void main(String[] args) {
        int []a = {1,2,6,7,10,3,8};
        int []b = {9,12,13,15,10,19};

        ReverseArray ra = new ReverseArray();
        int []arr = ra.reverseArray(b);
        System.out.println("Reversed Array is : ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

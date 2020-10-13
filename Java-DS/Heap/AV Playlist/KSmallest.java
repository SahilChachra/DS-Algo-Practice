import java.util.PriorityQueue;

public class KSmallest {

    public int getSmallestElement(int []arr, int k) {
        if(arr.length<k){
            return -1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0; i<arr.length;i++){
            pq.add(arr[i]);
        }
        int cnt = 1;
        while(pq.isEmpty()==false) {
            if(cnt==k)
                break;
            else {
                cnt+=1;
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int []arr = {100,200,40,50,90,10,5};
        int k = 3;
        KSmallest ks = new KSmallest();
        System.out.println("K ("+ k +") Smallest Element : "+ks.getSmallestElement(arr, k));
    }

}

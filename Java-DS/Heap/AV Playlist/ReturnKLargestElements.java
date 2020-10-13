import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Vector;

public class ReturnKLargestElements {

    public Vector getKLargest(int []arr, int k){
        Vector<Integer> v = new Vector<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0;i<arr.length;i++)
            pq.add(arr[i]);

        int cnt=1;
        while(cnt<=k)
        {
            cnt+=1;
            v.add(pq.poll());
        }
        return v;
    }

    public static void main(String[] args) {
        int []arr = {100,200,40,50,90,10,5};
        int k = 3;
        ReturnKLargestElements ks = new ReturnKLargestElements();
        Vector<Integer> v = ks.getKLargest(arr, k);
        System.out.println("K ("+ k +") Largest Elements : "+v.toString());
    }

}

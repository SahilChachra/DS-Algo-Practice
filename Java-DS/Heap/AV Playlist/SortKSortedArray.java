import java.util.PriorityQueue;
import java.util.Vector;

public class SortKSortedArray {

    public Vector getSortedArray(int []arr, int k){
        Vector<Integer> sortedArray = new Vector<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        while(i<=arr.length-1){
            if(pq.size()==k){
                sortedArray.add(pq.poll());
            }
            else {
                pq.add(arr[i]);
                i++;
            }

        }

        while(pq.size()>0){
            sortedArray.add(pq.poll());
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        SortKSortedArray ksa = new SortKSortedArray();
        int []arr = {6,5,2,3,8,10,9};
        int k = 3;
        Vector<Integer> ans = ksa.getSortedArray(arr, k);
        System.out.println("KSorted Array : "+ans.toString());
    }

}

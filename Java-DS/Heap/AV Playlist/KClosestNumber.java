import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestNumber {

    class Pair{
        int diff, number;
        Pair(int diff, int number){
            this.diff = diff;
            this.number = number;
        }

    }

    public ArrayList KClosest(int []arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k, new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                return (a.diff - b.diff);
            }
        });

        /**If we create min heap, the minimum values will go down the Heap and larger difference
        values will be above. and we need k minimum values which can be accessed using
        max heap**/

        ArrayList<Integer> ar = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            pq.add(new Pair(arr[i]-x, arr[i]));

            if(pq.size()>k)
                pq.poll();
        }
        int cnt=1;
        while(pq.size()!=0){
            ar.add(pq.poll().number);
        }

        return ar;
    }

    public static void main(String[] args) {
        int []arr = {5,6,7,8,9};
        int k = 3;
        int x = 7;
        KClosestNumber kcn = new KClosestNumber();
        ArrayList<Integer> ar = kcn.KClosest(arr, k, x);
        System.out.println(ar.toString());
    }

}

import java.lang.reflect.Array;
import java.util.*;

public class KFrequentNumber {

    class Pair{
        int num, freq;
        Pair(int freq, int num){
            this.num = num;
            this.freq = freq;
        }

    }

    public ArrayList<Integer> getKFreq(int []arr, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i=0;i< arr.length;i++){
            if(hm.get(arr[i])!=null)
                hm.put(arr[i], hm.get(arr[i])+1);
            else
                hm.put(arr[i], 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(k, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.freq - o2.freq;
            }
        });

        for(Map.Entry mapEle : hm.entrySet()) {
            int num = (int)mapEle.getKey();
            int fr = (int)mapEle.getValue();
            pq.add(new Pair(fr, num));
            if(pq.size()>k)
                pq.poll();
        }
        while(pq.isEmpty()==false){
            ar.add(pq.poll().num);
        }

        return ar;

    }

    public static void main(String[] args) {
        KFrequentNumber kfn = new KFrequentNumber();
        int []arr = {2,2,1,1,1,4,4,3,4,5,5,5,5};
        ArrayList<Integer> ar = kfn.getKFreq(arr, 3);
        System.out.println(ar.toString());

    }

}

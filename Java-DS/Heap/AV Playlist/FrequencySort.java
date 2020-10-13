import java.util.*;

public class FrequencySort {

    class Pair {
        int x,y;
        Pair(int x, int y) {
            this.x = x; this.y=y;
        }
    }

    public ArrayList<Integer> Sort(int []arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i< arr.length;i++){
            if(hm.get(arr[i])!=null){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else
                hm.put(arr[i], 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.y - o1.y;
            }
        });

        for(Map.Entry mapEle : hm.entrySet()) {
            int num = (int)mapEle.getKey();
            int fr = (int)mapEle.getValue();
            pq.add(new Pair(num, fr));
        }

        ArrayList<Integer> ar = new ArrayList<>();
        while(pq.size()!=0){
            int freq = pq.peek().y;
            int ele = pq.peek().x;

            for(int i = 0;i<freq;i++){
                ar.add(ele);
            }

            pq.poll();
        }
        return ar;
    }

    public static void main(String[] args) {
        FrequencySort fs = new FrequencySort();
        int []arr = {1,1,1,3,2,2,4};
        ArrayList<Integer> ar = fs.Sort(arr);
        System.out.println(ar.toString());
    }
}

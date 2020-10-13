import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsOrigin {

    class Pair {
        int x, y, d;
        Pair(int d, int x, int y){
            this.x=x; this.y=y; this.d = d;
        }
    }

    public int findDistance(int x1, int y1, int x2, int y2){
        return (int)Math.sqrt((int)Math.pow((x1-x2),2) + (int)Math.pow((y1-y2),2));
    }

    public void printPoints(int [][]arr, int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.d - o1.d;
            }
        });

        for(int i = 0; i<arr.length;i++){
                int d = findDistance(arr[i][0], arr[i][1], 0, 0);
                pq.add(new Pair(d, arr[i][0], arr[i][1]));
                if(pq.size()>k)
                    pq.poll();

        }
        while(pq.size()>0) {
            Pair p = pq.poll();
            System.out.println("Distance : "+p.d+", X : "+p.x+", Y : "+p.y);
        }
    }

    public static void main(String[] args) {
        KClosestPointsOrigin cpo = new KClosestPointsOrigin();
        int []ar1 = {1,2};
        int []ar2 = {-2,2};
        int []ar3 = {5,8};
        int []ar4 = {0,1};
        int [][]arr = {ar1, ar2, ar3, ar4};
        int k = 2;
        cpo.printPoints(arr, k);

    }
}

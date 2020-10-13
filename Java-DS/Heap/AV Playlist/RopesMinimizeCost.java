import java.util.Collections;
import java.util.PriorityQueue;

public class RopesMinimizeCost {

    public int returnCost(int []arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int totalSum = 0;
        int sum = 0;

        for(int i=0;i<arr.length;i++)
            pq.add(arr[i]);
        int c1=0, c2=0;
        while(pq.size()>1){
            c1 = pq.poll();
            c2 = pq.poll();
            sum = c1+c2;
            totalSum+=sum;
            pq.add(sum);
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        RopesMinimizeCost pmc = new RopesMinimizeCost();
        int sum = pmc.returnCost(arr);
        System.out.println(sum);
    }
}

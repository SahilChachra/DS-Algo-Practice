import java.util.PriorityQueue;

public class SumOfKthSmallest {

    public int getKthSmallest(int []arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cnt=1;
        for(int i = 0;i<arr.length;i++)
            pq.add(arr[i]);

        while(pq.size()>0){
            if(cnt==k)
                return pq.poll();
            else{
                cnt=cnt+1;
                pq.poll();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SumOfKthSmallest sos = new SumOfKthSmallest();
        int []arr = {1,3,12,5,15,11};
        int k1 = 4, k2=5;
        int ele1 = sos.getKthSmallest(arr, k1);
        int ele2 = sos.getKthSmallest(arr, k2);
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(ele1>=arr[i] && arr[i]<=ele2)
                sum+=arr[i];
        }
        System.out.println("Sum is : "+sum );
    }

}

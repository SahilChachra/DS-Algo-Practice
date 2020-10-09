import javafx.util.Pair;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class MaxAreaHistogram {

    public class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public Vector<Integer> NSL(int []arr) {
        int i;
        Vector<Integer> v = new Vector<>();
        Stack<Pair> st = new Stack<>();

        for(i=0;i<arr.length;i++){
            if(st.size()==0)
                v.add(-1);
            else if(st.size()!=0 && st.peek().first<arr[i])
                v.add(st.peek().second);
            else if(st.size()!=0 && st.peek().first>=arr[i]){
                while(st.size()!=0 && st.peek().first>=arr[i])
                    st.pop();
                if(st.size()==0)
                    v.add(-1);
                else
                    v.add(st.peek().second);
            }
            st.push(new Pair(arr[i], i));
        }
        return v;
    }

    public Vector<Integer> NSR(int []arr) {
        int i;
        Vector<Integer> v = new Vector<>();
        Stack<Pair> st = new Stack<>();

        for(i=arr.length-1;i>=0;i--){
            if(st.size()==0)
                v.add(arr.length);
            else if(st.size()!=0 && st.peek().first<arr[i])
                v.add(st.peek().second);
            else if(st.size()!=0 && st.peek().first>=arr[i]){
                while(st.size()!=0 && st.peek().first>=arr[i])
                    st.pop();
                if(st.size()==0)
                    v.add(arr.length);
                else
                    v.add(st.peek().second);
            }
            st.push(new Pair(arr[i], i));
        }
        Collections.reverse(v);
        return v;
    }

    public int getMaxArea(int []arr) {
            int i = 0;

            Vector<Integer> width = new Vector<>();
            Vector<Integer> left = NSL(arr);
            Vector<Integer> right = NSR(arr);
            for(i=0;i<arr.length;i++)
                width.add(right.get(i) - left.get(i)-1);

            Vector<Integer> area = new Vector<>();
            for(i=0;i<arr.length;i++)
                area.add(width.get(i)*arr[i]);

            /*System.out.println("Left : "+left.toString());
            System.out.println("Right : "+right.toString());
            System.out.println("Width : "+width.toString());
            System.out.println("Area: "+area.toString());*/

            return Collections.max(area);

    }

    public static void main(String[] args) {
        //int []a = {6,2,5,4,5,1,6};
        int []a = {2,3,3,2};
        MaxAreaHistogram mah = new MaxAreaHistogram();
        System.out.println(mah.getMaxArea(a));
    }

}

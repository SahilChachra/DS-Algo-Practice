import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NearestGreaterRight {

    public static void main(String[] args) {
        NearestGreaterRight ngr = new NearestGreaterRight();
        int []a = {1,3,2,4};
        ngr.returnNGR(a);
    }

    public void returnNGR(int []arr) {
        Stack<Integer> st = new Stack<>();
        Vector<Integer> v  = new Vector<>();
        int i;

        for(i=arr.length-1;i>=0;i--){
            if(st.size()==0)
                v.add(-1);

            else if(st.size()!=0 && st.peek()>arr[i])
                v.add(st.peek());

            else if(st.size()!=0 && st.peek()<=arr[i]){
                while(st.size()>0 && st.peek()<=arr[i])
                    st.pop();
                if(st.size()==0)
                    v.add(-1);
                else
                    v.add(st.peek());
            }

            st.push(arr[i]);
        }
        Collections.reverse(v);
        for (i=0;i<v.size();i++)
            System.out.print(v.get(i)+" ");
        System.out.println();
    }
}



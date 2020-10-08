import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NearestSmallerRight {

        public void returnNSR(int []arr) {
            int i;
            Vector<Integer> v = new Vector<>();
            Stack<Integer> st = new Stack<>();

            for(i=arr.length-1;i>=0;i--){
                if(st.size()==0)
                    v.add(-1);
                else if(st.size()!=0 && st.peek()<arr[i])
                    v.add(st.peek());
                else if(st.size()!=0 && st.peek()>=arr[i]){
                    while(st.size()!=0 && st.peek()>=arr[i])
                        st.pop();
                    if(st.size()==0)
                        v.add(-1);
                    else
                        v.add(st.peek());
                }
                st.push(arr[i]);
            }
            Collections.reverse(v);
            System.out.println(v.toString());
        }

        public static void main(String[] args) {
            int []a = {4,5,2,10,8};
            NearestSmallerRight nsl = new NearestSmallerRight();
            nsl.returnNSR(a);
        }
}

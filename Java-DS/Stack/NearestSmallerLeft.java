import java.util.Stack;
import java.util.Vector;

public class NearestSmallerLeft {

    public void returnNSL(int []arr) {
        int i;
        Vector<Integer> v = new Vector<>();
        Stack<Integer> st = new Stack<>();

        for(i=0;i<arr.length;i++){
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
        System.out.println(v.toString());
    }

    public static void main(String[] args) {
        int []a = {4,5,2,10,8};
        NearestSmallerLeft nsl = new NearestSmallerLeft();
        nsl.returnNSL(a);
    }

}

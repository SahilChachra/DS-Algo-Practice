import java.util.Stack;
import java.util.Vector;

public class NearestGreaterLeft {

    public void returnNGL(int []arr){
        Vector<Integer> v = new Vector<>();
        Stack<Integer> st = new Stack<>();
        int i =0;

        for(i=0;i<arr.length;i++){
            if(st.size()==0)
                v.add(-1);
            else if(st.size()>0 && st.peek()>arr[i]){
                v.add(st.peek());
            }
            else if(st.size()>0 && st.peek()<=arr[i]){
                while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.size()==0)
                    v.add(-1);
                else
                    v.add(st.peek());
            }
            st.push(arr[i]);
        }
        for(i=0;i<v.size();i++)
            System.out.print(v.get(i)+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        NearestGreaterLeft ngl = new NearestGreaterLeft();
        int []a = {1,3,2,4};
        ngl.returnNGL(a);
    }

}

import javafx.util.Pair;

import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class StockSpan {

    public void printStocks(int []arr) {
        Stack<Pair<Integer, Integer>> st= new Stack<>();
        int i;
        Vector<Integer> v = new Vector<>();

        for(i=0;i<arr.length;i++){
            if(st.size()==0)
                v.add(1);
            else if(st.size()>0 && st.peek().getKey()>arr[i])
                v.add(st.peek().getValue());
            else if(st.size()>0 && st.peek().getKey()<=arr[i]){
                while(st.size()!=0 && st.peek().getKey()<=arr[i])
                    st.pop();
                if(st.size()==0)
                    v.add(0);
                else
                    v.add(st.peek().getValue());
            }
            st.push(new Pair<Integer, Integer>(arr[i],i));
        }
        for(i=0;i<arr.length;i++){
            System.out.print(Math.abs(v.get(i)-i)+" ");
        }
    }

    public static void main(String[] args) {
        int []a = {100,80,60,70,60,75,85};
        StockSpan ss = new StockSpan();
        ss.printStocks(a);
    }
}

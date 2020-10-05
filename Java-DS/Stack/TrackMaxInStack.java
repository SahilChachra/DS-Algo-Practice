import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        Stack<Integer> s = new Stack<>();
        Stack<Integer> t = new Stack<>();

        for(int i = 0;i<n;i++){
            int ch = read.nextInt();

            if(ch==1){
                int x = read.nextInt();
                if(s.empty()){
                    s.push(x);
                    t.push(x);
                } else {
                    s.push(x);
                    t.push(Math.max(t.peek(), x));
                }
            }

            else if(ch==2){
                if(!s.empty()){
                    s.pop();
                    t.pop();
                }
            }

            else if(ch==3){
                System.out.println(t.peek());
            }

        }

    }
}
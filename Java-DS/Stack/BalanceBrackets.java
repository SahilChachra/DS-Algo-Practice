import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
            String y = "YES";
            String n = "NO";
            if(s==null)
                return y;
            if(s.length()%2!=0)
                return n;
            if(s.charAt(0)==']' || s.charAt(0)=='}' || s.charAt(0)==')' )
                return n;
            
            Stack<Character> st = new Stack<>();

            for(int i =0;i<s.length();i++){
                char ch = s.charAt(i);

                if(ch=='{'||ch=='('||ch=='[')
                    st.push(ch);
                else if(ch==']'||ch=='}'||ch==')'){
                    if(st.empty())
                        return n;
                    else if(st.peek()=='[' && ch==']') st.pop();
                    else if(st.peek()=='(' && ch==')') st.pop();
                    else if(st.peek()=='{' && ch=='}') st.pop();
                }
            }

            if(st.empty()) return y;
            else
                return n;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

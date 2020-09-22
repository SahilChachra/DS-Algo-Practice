import java.util.Arrays;

public class PalindromePartioningRecBU {

    int [][]t;

    PalindromePartioningRecBU(int n) {
        t = new int[n][n];
        Arrays.fill(t, -1);
    }

    public int solve(String s, int i, int j, int min){

        if(i==j || i>j)
            return 0;

        if(t[i][j]!=-1)
            return t[i][j];

        if(isPalindrome(s, i , j))
            return 0;

        for(int k=i;k<=j-1;k++) {

            int temp = solve(s, i , k, min) + solve(s, k+1, j, min) + 1;
            if(temp<min)
                min = temp;
        }
        t[i][j]=min;
        return min;
    }

    private boolean isPalindrome(String s, int i, int j) {
        if(i==j || i>j)
            return true;

        String s1 = s.substring(i,j+1);
        StringBuffer st = new StringBuffer(s1);
        String rev = st.reverse().toString();

        return s1.equals(rev);
    }

    public static void main(String[] args) {
        PalindromePartioningRecBU pprbu = new PalindromePartioningRecBU(5);
        System.out.println(pprbu.solve("nitib", 0, 5-1, Integer.MAX_VALUE));
    }

}

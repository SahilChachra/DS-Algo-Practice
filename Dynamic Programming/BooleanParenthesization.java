public class BooleanParenthesization {

    public int solve(String s, int i, int j, char isTrue){

        if(i>j)
            return 0;
        if(i==j){
            if(isTrue=='T') {
                if (s.charAt(i) == 'T')
                    return 1;
                else
                    return 0;
            }
            else {
                if(s.charAt(i)=='F')
                    return 1;
                else
                    return 0;
            }

        }

        int ans = 0;

        for(int k = i+1; k<=j-1;k+=2) {
            int lt = solve(s, i, k-1, 'T');
            int lf = solve(s, i, k-1, 'F');
            int rt = solve(s, k+1, j, 'T');
            int rf= solve(s, k+1, j, 'F');

            if(s.charAt(k)=='&'){
                if(isTrue=='T')
                    ans = ans + lt*rt;
                else
                    ans = ans + lf*rt + lt*rf + lf*rf;
            }
            else if(s.charAt(k)=='|'){
                if(isTrue=='T')
                    ans = ans + lt*rt + lt*rf + lf*rt;
                else
                    ans = ans + lf*rf;
            }
            else if(s.charAt(k)=='^'){
                if(isTrue=='T')
                    ans = ans + lf*rt + lt*rf;
                else
                    ans = ans + lt*rt + lf*rf;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        BooleanParenthesization bp = new BooleanParenthesization();
        String s = "T|F&T";
        System.out.println(bp.solve(s,0,s.length()-1,'T'));
    }

}

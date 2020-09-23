import java.util.Arrays;

public class EggDroppingMemoization {

    int t[][];

    EggDroppingMemoization(int e, int f){
        t = new int [e+1][f+1];
        Arrays.fill(t, -1);
    }

    public int attempts(int e, int f, int min) {

        if(f==0 || f==1)
            return f;

        if(e==1)
            return f;

        if(t[e][f]!=-1)
            return t[e][f];

        for(int k = 1;k<=f;k++) {
            int temp = 1 + Math.max(attempts(e-1,k-1, min), attempts(e, f-k,min));
            min = Math.min(min, temp);
        }
        t[e][f] = min;
        return min;
    }

    public static void main(String[] args) {
        EggDroppingMemoization edm = new EggDroppingMemoization(3, 10);
        System.out.println(edm.attempts(3, 10, Integer.MAX_VALUE));
    }

}

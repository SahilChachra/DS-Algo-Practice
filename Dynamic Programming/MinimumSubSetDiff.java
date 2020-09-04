import java.util.Vector;

public class MinimumSubSetDiff {
        //Difference of sum of subsets should be minimum
        // s2 = range - 2s1
        public static int miniDiff(int[] arr, int size){
            int i;
            int range=0;
            for(i=0;i<size;i++)
                range = range + arr[i];
            Vector<Integer> val= tableSubset(arr, range, size);
            int min = range;
            for(i=0;i<val.size();i++){
                min = Math.min(min, range-(2*val.get(i)));
            }
            return min;
        }


        private static Vector<Integer> tableSubset(int[] arr, int range, int size){
            boolean[][] t = new boolean[size+1][range+1];
            t[0][0] = true;

            int i,j;

            for(i=0;i<=size;i++){
                t[i][0] = true;
            }

            for(i=1;i<=range;i++){
                t[0][i] = false;
            }

            for(i=1;i<=size;i++){
                for(j=1;j<=range;j++){
                    if(arr[i-1]<=j){
                        t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
                    }
                    else
                        t[i][j] = t[i-1][j];
                }
            }
            Vector<Integer> vec = new Vector<>();
            for(i=0;i<=(range/2);i++){
                if(t[size][i])
                    vec.add(i);
            }
            return vec;
        }

    public static void main(String[] args) {
            int []arr = {1,2,7};
        System.out.println(miniDiff(arr, 3));
    }

}

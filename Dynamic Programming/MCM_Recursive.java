public class MCM_Recursive {

        public int solve(int []arr, int i, int j, int min) {
            if(i==j || i>j)
                return 0;

            for(int k = i; k<=j-1; k++){
                int temp = solve(arr, i , k, min) + solve(arr, k+1, j, min) + arr[i-1]*arr[k]*arr[j];

                if(temp<min)
                    min = temp;

            }
            return min;
        }

        public static void main(String[] args) {

            MCM_Recursive mr = new MCM_Recursive();

            int []arr = {40,30,20,10,50};
            int n = arr.length;
            System.out.println(mr.solve(arr, 1, n-1, Integer.MAX_VALUE));
    }
}

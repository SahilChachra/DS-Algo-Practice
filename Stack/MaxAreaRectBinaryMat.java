import javafx.util.Pair;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class MaxAreaRectBinaryMat {



    public int getArea(int [][]arr, int n, int m) {
        int []t = new int[m];
        MaxAreaHistogram mah = new MaxAreaHistogram();

        for(int j = 0;j<m;j++)
            t[j] = arr[0][j];
        int currMah = 0;
        int max = mah.getMaxArea(t);
        //printarr(t, max);
        for(int i = 1;i<n;i++){
            for(int j = 0;j<m;j++) {
                if(arr[i][j]==0){
                    t[j]=0;
                }
                else
                    t[j] = t[j] + arr[i][j];
            }

            currMah = mah.getMaxArea(t);
            //printarr(t, currMah);
            max = Math.max(max, currMah);
        }
        return max;
    }


    public void printarr(int []arr, int mah) {
        System.out.print("[");
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("] : "+mah);
    }

    public static void main(String[] args) {

        int []arr1 = {0,1,1,0};
        int []arr2 = {1,1,1,1};
        int []arr3 = {1,1,1,1};
        int []arr4 = {1,1,0,0};
        int [][]arr = {arr1, arr2, arr3, arr4};
        MaxAreaRectBinaryMat marbm = new MaxAreaRectBinaryMat();
        System.out.println(marbm.getArea(arr, 4, 4));
    }

}

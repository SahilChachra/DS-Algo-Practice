public class SortArray012 {


    public void sortArray(int []arr, int l) {
        int c0=0,c2=0,c1=0;
        for(int i = 0;i<l;i++){
            if(arr[i]==0)
                c0+=1;
            else if(arr[i]==1)
                c1+=1;
            else
                c2+=1;
        }
        int j = 1;

        int i =0;
        while(c0>0){
            arr[i]=0;
            i++;
            c0--;
        }
        while(c1>0){
            arr[i]=1;
            i++;
            c1--;
        }
        while(c2>0){
            arr[i]=2;
            i++;
            c2--;
        }

        for(i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortArray012 sa = new SortArray012();
        int []arr = {0, 1, 2, 0, 1, 2, 1, 2, 1,0, 0, 1, 2, 1, 0, 2, 0, 1, 2, 0, 1};
        int len = arr.length;
        sa.sortArray(arr, len);
    }

}

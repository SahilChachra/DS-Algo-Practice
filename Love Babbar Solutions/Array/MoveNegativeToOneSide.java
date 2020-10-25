public class MoveNegativeToOneSide {

    public void moveToOneSideDoublePointer(int []arr){
        int l = 0, r = arr.length-1;
        int t = 0;
        while(l<=r){
            if(arr[l]<0 && arr[r]<0){
                l+=1;
            }

            else if(arr[l]>0 && arr[r]<0){
                t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l+=1; r-=1;
            }

            else if(arr[l]>0 && arr[r]>0){
                r-=1;
            }
            else {
                l+=1; r-=1;
            }
        }
        System.out.println("Using Double Pointer Method");
        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public void moveToOneSidePartition(int []arr){
        int j =0;
        int t;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j]=t;
                }
                j++;
            }
        }
        System.out.println("Using Partition Method");
        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        MoveNegativeToOneSide mn = new MoveNegativeToOneSide();
        int []arr = {-1,4,5,-2,-5,10,199,-17,56,12,-190};
        mn.moveToOneSideDoublePointer(arr);
        mn.moveToOneSidePartition(arr);
    }

}

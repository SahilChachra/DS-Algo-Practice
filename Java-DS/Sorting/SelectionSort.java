public class SelectionSort {

    public static void main(String[] args) {

        int arr[]= {9,8,7,6,5,4,3,2,1,10};
        int i=0,j=0,min=0;
        for( i=0;i<10;i++)
            System.out.print(arr[i]+'\t');

        for(i=0;i<arr.length-1;i++) {
            min = i;

            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }

        for( i=0;i<10;i++)
            System.out.print(arr[i]+' ');

    }


    public static void sort(int arr[]){





    }

}

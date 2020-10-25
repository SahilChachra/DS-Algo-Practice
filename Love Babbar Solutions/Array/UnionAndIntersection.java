public class UnionAndIntersection {

    public void union(int []a, int []b){
        int []union = new int[10];
        int loopLen = Math.max(a.length, b.length);
        /*
         * a = 1 2 4 5 6 7
         * b = 1 3 5 6
         * a[i]==b[j], i++ j++
         * a[i]<b[j], i++
         * a[i]>b[j] j++
         * */

        int i = 0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                union[k]=a[i];
                a[i]=-1;
                b[j]=-1;
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
        }
        i=0;j=0;
        while(i<=a.length-1){
            if(a[i]==-1){
                i++;
                continue;
            }
            else
            {
                union[k]=a[i];
                k++;
                i++;
            }
        }
        while(j<b.length){
            if(b[j]==-1){
                j++;
                continue;
            }
            else
            {
                union[k]=b[j];
                k++;
                j++;
            }
        }
        System.out.println("Union of a and b : ");
        for(i=0;i<k;i++){
            System.out.print(union[i]+" ");
        }
        System.out.println();

    }

    public void intersection(int []a, int[]b) {

        int []inter = new int[10];
        /*
         * a = 1 2 4 5 6 7
         * b = 1 3 5 6
         * a[i]==b[j], i++ j++
         * a[i]<b[j], i++
         * a[i]>b[j] j++
         * */

        int i = 0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                inter[k]=a[i];
                i++;
                j++;
                k++;
                //System.out.println("Inter of k : "+inter[k]);
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
        }
        //System.out.println("Value of k : "+k);
        System.out.println("Intersection of a and b : ");
        for(i=0;i<k;i++){
            System.out.print(inter[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        UnionAndIntersection ui = new UnionAndIntersection();
        int []a = {1, 3, 4, 5, 7}; int []b = {2, 3, 5, 6};
        ui.union(a,b);
        int []c = new int[]{1, 3, 4, 5, 7}; int []d = new int[]{2, 3, 5, 6};
        ui.intersection(c,d);
    }

}
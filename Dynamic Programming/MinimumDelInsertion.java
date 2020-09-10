public class MinimumDelInsertion {

    public void printActions(String a, String b){

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        int n = x.length;
        int m = y.length;

        int [][]t = new int[n+1][m+1];

        int i,j;
        for(i=0;i<=n;i++){
            for(j=0; j<=m;j++){
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }


        for(i=1;i<=n;i++){
            for(j=1; j<=m;j++){
                if(x[i-1]==y[j-1])
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j] = t[i-1][j-1];
            }
        }

        int del = n - t[n][m];
        int ins = m - t[n][m];

        System.out.println("Insertion : "+ins);
        System.out.println("Deletion : "+del);

    }

}

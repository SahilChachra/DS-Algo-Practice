public class EggDroppingRecursive {

    //Critical floor above which egg is thrown, it breaks
    //No of attempts we take to find the critical floor using eggs
    //Throw egg from 1st floor. It won't break. Use that egg now throw from 2nd floor.
    //This process goes on till the egg breaks
    //Minimize number of attempts to get the threshold floor
    //Worst number we have to written

    public int attempts(int e, int f, int min) {

        if(f==0 || f==1)
            return f;

        if(e==1)
            return f;

        for(int k = 1;k<=f;k++) {
            int temp = 1 + Math.max(attempts(e-1,k-1, min), attempts(e, f-k,min));
            min = Math.min(min, temp);
        }
        return min;
    }

    public static void main(String[] args) {
        EggDroppingRecursive edr = new EggDroppingRecursive();
        System.out.println(edr.attempts(3,20, Integer.MAX_VALUE));
    }

}

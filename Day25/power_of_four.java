/*Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.
Input: n = 16
Output: true */
public class power_of_four {
    static boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n <= 0)
            return false;
        double x = Math.log(n) / Math.log(4);
        ;
        return (x == (int) x);
        // for(int i=0;i<=n/4;i++){
        // double powerOfFour=Math.pow(4,i);
        // if(powerOfFour==n) return true;
        // if(powerOfFour>n) return false;
        // }
        // return false;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
}

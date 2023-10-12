/*Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
Input: n = 1
Output: true
Explanation: 20 = 1
Input: n = 16
Output: true
Explanation: 24 = 16 */
public class Power_of_Two {
    static boolean isPowerOfTwo(int n) {
        int i = 0;
        while (true) {
            double m = Math.pow(2, i);
            if (m == n)
                return true;
            if (m > n)
                break;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
}

package Day27;

/*Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.
Input: n = 27
Output: true
Explanation: 27 = 33 */
public class power_of_three {
    static boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        while (n >= 2) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 243;
        System.out.println(isPowerOfThree(n));
    }
}

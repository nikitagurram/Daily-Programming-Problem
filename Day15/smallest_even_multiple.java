/*Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself. */
public class smallest_even_multiple {
    static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return 2 * n;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(smallestEvenMultiple(n));
    }
}

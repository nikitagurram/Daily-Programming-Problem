/*An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.
Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5. */
public class ugly_number {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 2; i < 6 && n > 0; i++) {
            while (n % i == 0)
                n /= i;
        }
        System.out.println(n == 1);
    }
}

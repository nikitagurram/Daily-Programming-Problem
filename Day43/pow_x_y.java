package Day43;

/**
 * pow_x_y
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * Example 2:
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * Example 3:
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */
public class pow_x_y {
    public static void main(String[] args) {
        int n = 10, x = 2;
        double ans = 1;
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        while (n != 0) {
            if ((n & 1) != 0) {
                ans *= x;
            }
            x = x * x;
            n >>>= 1;
        }
        System.out.println(ans);
    }

}
/*
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 *  such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 */
public class fibbonacci_number {
    static int fib(int n) {
        int f1 = 0;
        int f2 = 1;
        int f3;
        for (int i = 2; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        if (n == 0)
            return f1;
        return f2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
}

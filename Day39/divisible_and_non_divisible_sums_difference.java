package Day39;

/*You are given positive integers n and m.
Define two integers, num1 and num2, as follows:
num1: The sum of all integers in the range [1, n] that are not divisible by m.
num2: The sum of all integers in the range [1, n] that are divisible by m.
Return the integer num1 - num2.
Input: n = 10, m = 3
Output: 19
Explanation: In the given example:
- Integers in the range [1, 10] that are not divisible by 3 are [1,2,4,5,7,8,10], num1 is the sum of those integers = 37.
- Integers in the range [1, 10] that are divisible by 3 are [3,6,9], num2 is the sum of those integers = 18.
We return 37 - 18 = 19 as the answer. */
public class divisible_and_non_divisible_sums_difference {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        int nondivisible = 0;
        int divisible = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                divisible += i;
            } else {
                nondivisible += i;
            }
        }
        System.out.println(nondivisible - divisible);
    }
}

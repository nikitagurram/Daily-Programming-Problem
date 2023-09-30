/**
 * Subtract_product_&_sum_of_digits_of_Interger
 * Given an integer number n, return the difference between the product of its
 * digits and the sum of its digits.
 * 
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 * 
 */
public class Subtract_product_and_sum_of_digits_of_Interger {
    public static void main(String[] args) {
        int n = 234;
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            product = product * r;
            sum += r;
            n = n / 10;
        }
        int sub = product - sum;
        System.out.println(sub);
    }
}
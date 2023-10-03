/*
 * You are given a number 'N' and a query 'Q. 
 * If 'Q' is 1 then you have to return the sum of all integers from 1 to 'N.
 *  else if 'Q' is equal to 2 then you have to return the product of all integers from 1 to N.
 * Since the product can be very large return it modulo 10^9 +7 For example

Given 'N' = 4, 'Q' = 1. 
Then the answer is 10 because the sum of all integers between 1 and 4 are 1, 2, 3, and 4. Hence 1 + is equal to 10.
 */

public class Sum_or_product {
    public static void main(String[] args) {
        int n = 15;
        int q = 2;
        long sum = 0;
        long product = 1;
        long mod = 1000000007;
        if (q == 1) {
            sum = (n * (n + 1)) / 2;
            System.out.println(sum);
        }
        if (q == 2) {
            for (long i = 1; i <= n; i++) {
                product = (product * i) % mod;
                // System.out.print(product+" ");
            }
        }
        System.out.println(product);
    }
}

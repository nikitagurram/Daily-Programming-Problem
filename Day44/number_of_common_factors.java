package Day44;

/*
 * Given two positive integers a and b, return the number of common factors of a and b.
An integer x is a common factor of a and b if x divides both a and b.
Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
 */
public class number_of_common_factors {
    public static void main(String[] args) {
        int a = 12, b = 6;
        int count = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                count++;
        }
        System.out.println(count);
    }
}

package Day97;

/*You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
Return the minimum possible sum of new1 and new2.
Example 1:
Input: num = 2932
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
Example 2:
Input: num = 4009
Output: 13
Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc. 
The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13. */
public class minimum_sum_of_four_digit_number_after_splitting_digits {
    public static void main(String[] args) {
        int num = 2329;
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;
        int s3 = 0;
        int s4 = 0;
        while (num != 0) {
            int rem = num % 10;
            if (s1 > rem) {
                if (s2 >= s1) {
                    s4 = s3;
                    s3 = s2;
                    s2 = s1;
                    s1 = rem;
                }
            } else if (s2 > rem) {
                s4 = s3;
                s3 = s2;
                s2 = rem;
            } else {
                s4 = s3;
                s3 = rem;
            }
            num /= 10;
        }
        System.out.println((s1 * 10 + s3) + (s2 * 10 + s4));
    }
}

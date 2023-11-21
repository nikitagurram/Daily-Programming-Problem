package Day54;

/*You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:
0 <= i < j < nums.length
nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.
Input: nums = [42,11,1,97]
Output: 2
Explanation: The two pairs are:
 - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
 - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12. */
import java.util.Arrays;

public class count_nice_pair_in_array {
    public static void main(String[] args) {
        long count = 0;
        int nums[] = { 42, 11, 1, 97 };
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - reverse(nums[i]);
        }
        int mod = 1000000007;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            long c = 1;
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                c++;
                i++;
            }

            count = (count % mod + (c * (c - 1)) / 2) % mod;
        }
        System.out.println((int) count % mod);

    }

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}

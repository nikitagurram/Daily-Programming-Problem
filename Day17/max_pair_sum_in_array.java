package Day17;

/*You are given a 0-indexed integer array nums. You have to find the maximum sum of a pair of numbers from nums such that 
the maximum digit in both numbers are equal.
Return the maximum sum or -1 if no such pair exists.
Input: nums = [51,71,17,24,42]
Output: 88
Explanation: 
For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88. 
For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66.
It can be shown that there are no other pairs with equal maximum digits, so the answer is 88. */
public class max_pair_sum_in_array {
    public static void main(String[] args) {
        int max1 = -1;
        int nums[] = { 51, 17, 71, 24, 42 };
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (isReverse(nums[i], nums[j])) {
                    max1 = Math.max(max1, (nums[i] + nums[j]));
                }
            }
        }
        System.out.println(max1);
    }

    static boolean isReverse(int a, int b) {
        int x = -1;
        int y = -1;
        while (a != 0) {
            x = Math.max(x, a % 10);
            a /= 10;
        }
        while (b != 0) {
            y = Math.max(y, b % 10);
            b /= 10;
        }
        return x == y;
    }

}

/*Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array.
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is the missing number in the range since it does not appear in nums. */
public class missing_number {
    public static void main(String[] args) {
        int nums[] = { 1, 0, 3 };
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int exp_sum = n * (n + 1) / 2;
        System.out.println(exp_sum - sum);
    }
}

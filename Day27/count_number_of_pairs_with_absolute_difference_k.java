/*Given an integer array nums and an integer k, return the number of pairs (i, j) 
where i < j such that |nums[i] - nums[j]| == k.
The value of |x| is defined as:
x if x >= 0.
-x if x < 0.
Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1] */
public class count_number_of_pairs_with_absolute_difference_k {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 1 };
        int k = 1;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k)
                    count++;
            }
        }
        System.out.println(count);
    }
}

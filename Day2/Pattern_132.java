/*
 *Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] 
 such that i < j < k and nums[i] < nums[k] < nums[j]
 Example 1:

Input: nums = [1,2,3,4]
Output: false
Explanation: There is no 132 pattern in the sequence.
Example 2:

Input: nums = [3,1,4,2]
Output: true
Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
Example 3:

Input: nums = [-1,3,2,0]
Output: true
Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
 
 */
public class Pattern_132 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 4, 3 };
        boolean flag = false;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] >= nums[j])
                    break;
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[k] && nums[k] < nums[j]) {
                        flag = true;
                        break;
                    }
                    if (nums[k] >= nums[j] || nums[j] <= nums[i])
                        break;
                }
            }
        }
        System.out.println(flag);

    }
}

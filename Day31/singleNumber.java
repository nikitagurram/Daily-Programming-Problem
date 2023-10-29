import java.util.Arrays;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Input: nums = [2,2,1]
Output: 1
Input: nums = [4,1,2,1,2]
Output: 4
 */
public class singleNumber {
    static int single_Number(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i++;
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1 };
        System.out.println(single_Number(nums));
    }
}

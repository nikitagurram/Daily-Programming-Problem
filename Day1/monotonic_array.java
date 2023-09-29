package Day1;

/**
 * monotonic_array
 * An array is monotonic if it is either monotone increasing or monotone
 * decreasing.
 * Example 1:
 * Input: nums = [1,2,2,3]
 * Output: true
 * Example 2:
 * Input: nums = [6,5,4,4]
 * Output: true
 * Example 3:
 * Input: nums = [1,3,2]
 * Output: false
 * 
 */
public class monotonic_array {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 5, 7 };
        System.out.println(isMonotonic(nums));
    }

    static boolean isMonotonic(int[] nums) {
        boolean flag = true;
        boolean flag1 = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                flag1 = true;
            } else {
                flag1 = false;
                break;
            }
        }
        return flag || flag1;
    }
}
package Day37;

/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]. */
import java.util.Arrays;

public class Square_of_sorted_array {
    public static void main(String[] args) {
        int nums[] = { -2, -4, 0, 3, 5 };
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

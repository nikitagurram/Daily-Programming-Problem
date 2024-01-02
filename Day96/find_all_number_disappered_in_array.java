package Day96;

/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2] */
import java.util.ArrayList;
import java.util.List;

public class find_all_number_disappered_in_array {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 5, 3 };
        List<Integer> res = new ArrayList<>();
        int id = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                id = nums[i] * -1 - 1;
            } else {
                id = nums[i] - 1;
            }
            if (nums[id] > 0) {
                nums[id] = -nums[id];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        System.out.println(res);
    }
}

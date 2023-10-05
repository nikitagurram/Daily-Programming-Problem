import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
Example 1:
Input: nums = [3,2,3]
Output: [3]
Example 2:
Input: nums = [1]
Output: [1]
Example 3:
Input: nums = [1,2]
Output: [1,2]
 */
public class majority_element_2 {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 3, 4, 4, 5, 3, 4 };
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (list.contains(nums[i])) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
            if (count > (n / 3))
                list.add(nums[i]);
        }
        System.out.println(list);
    }
}

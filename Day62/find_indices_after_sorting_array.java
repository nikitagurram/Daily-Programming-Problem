package Day62;

import java.util.ArrayList;
import java.util.List;

/**
 * find_indices_after_sorting_array
 * You are given a 0-indexed integer array nums and a target element target.
 * A target index is an index i such that nums[i] == target.
 * Return a list of the target indices of nums after sorting nums in
 * non-decreasing order. If there are no target indices, return an empty list.
 * The returned list must be sorted in increasing order.
 * Example 1:
 * Input: nums = [1,2,5,2,3], target = 2
 * Output: [1,2]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The indices where nums[i] == 2 are 1 and 2.
 * Example 2:
 * Input: nums = [1,2,5,2,3], target = 3
 * Output: [3]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 3 is 3.
 * Example 3:
 * Input: nums = [1,2,5,2,3], target = 5
 * Output: [4]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 5 is 4.
 */
public class find_indices_after_sorting_array {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 2, 5, 4 };
        int target = 2;
        List<Integer> res = new ArrayList<>();
        int lesstarget = 0;
        int counttarget = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                counttarget++;
            if (nums[i] < target)
                lesstarget++;
        }
        for (int i = 0; i < counttarget; i++) {
            res.add(lesstarget + i);
        }
        System.out.println(res);
    }

}
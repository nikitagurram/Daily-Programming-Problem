package Day36;

import java.util.*;
/*Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1. */

public class third_maximum_number {
    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        if (nums.length < 3) {
            return nums[nums.length - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (!(arr.contains(nums[i]))) {
                arr.add(nums[i]);
            }
        }
        if (arr.size() < 3) {
            return arr.get(arr.size() - 1);
        }
        return arr.get(arr.size() - 3);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 2 };
        System.out.println(thirdMax(nums));
    }
}

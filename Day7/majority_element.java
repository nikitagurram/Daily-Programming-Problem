/*
 * Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class majority_element {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        int n = nums.length;
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > (n / 2))
                max = nums[i];
        }
        System.out.println(max);
    }
}

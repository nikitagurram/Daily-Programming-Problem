/*Given an integer array nums, return the most frequent even element.
If there is a tie, return the smallest one. If there is no such element, return -1.
Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.
Input: nums = [4,4,4,9,2,4]
Output: 4
Explanation: 4 is the even element appears the most.
Input: nums = [29,47,21,41,13,37,25,7]
Output: -1
Explanation: There is no even element.
*/
public class most_frequent_even_element {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 2, 4, 4, 2, 4 };
        int max = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0)
                continue;
            int c = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    c++;
            }
            if (count == c) {
                max = Math.min(max, nums[i]);
            } else if (count < c) {
                max = nums[i];
                count = c;
            }
        }
        System.out.println(max);
    }
}

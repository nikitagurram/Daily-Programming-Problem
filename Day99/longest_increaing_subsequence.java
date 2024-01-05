package Day99;

/*Given an integer array nums, return the length of the longest strictly increasing 
subsequence
Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:
Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:
Input: nums = [7,7,7,7,7,7,7]
Output: 1 */
public class longest_increaing_subsequence {
    public static void main(String[] args) {
        int nums[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int[] arr = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (arr[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            arr[i] = x;
            if (i == size)
                ++size;
        }
        System.out.println(size);
    }
}

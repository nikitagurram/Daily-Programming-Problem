package Day50;

/*The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.
For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:
Each element of nums is in exactly one pair, and
The maximum pair sum is minimized.
Return the minimized maximum pair sum after optimally pairing up the elements.
Input: nums = [3,5,2,3]
Output: 7
Explanation: The elements can be paired up into pairs (3,3) and (5,2).
The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7. */
import java.util.Arrays;

public class minimize_maximum_pair_sum_in_array {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 5, 3 };
        int arr[] = new int[nums.length / 2 + 1];
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length / 2; i++) {
            arr[i] = nums[i] + nums[nums.length - i - 1];
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}

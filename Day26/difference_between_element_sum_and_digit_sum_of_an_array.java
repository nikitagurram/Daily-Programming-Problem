/*You are given a positive integer array nums.
The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.
Note that the absolute difference between two integers x and y is defined as |x - y|.
Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
 */
public class difference_between_element_sum_and_digit_sum_of_an_array {
    static int digit(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 15, 4, 3 };
        int eleSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            eleSum += nums[i];
            digitSum += digit(nums[i]);
        }
        System.out.println(Math.abs(eleSum - digitSum));
    }
}

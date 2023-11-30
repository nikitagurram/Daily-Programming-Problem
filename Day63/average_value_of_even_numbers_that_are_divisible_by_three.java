package Day63;

/*
 * Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
Example 1:
Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
Example 2:
Input: nums = [1,2,4,7,10]
Output: 0
Explanation: There is no single number that satisfies the requirement, so return 0.
 */
public class average_value_of_even_numbers_that_are_divisible_by_three {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        int nums[] = { 3, 6, 10, 12, 15 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] % 3 == 0) {
                    sum += nums[i];
                    n++;
                }
            }
        }
        if (n == 0)
            System.out.println(0);
        System.out.println((int) sum / n);
    }
}

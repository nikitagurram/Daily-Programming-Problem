/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Input: nums = [], target = 0
Output: [-1,-1]
 */
public class first_last_position_of_element_in_sorted_array {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 5, 6, 8, 8, 8, 9 };
        int target = 8;
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                break;
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

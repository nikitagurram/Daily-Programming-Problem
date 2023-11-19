/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
  */
public class find_the_duplicate_numbers {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 4, 2 };
        // int repeat=0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        // if(nums[i]==nums[i+1]){
        // repeat=nums[i];
        // break;
        // }
        // }
        // return repeat;
        int count[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int i = 0;
        for (; i < count.length; i++) {
            if (count[i] > 1)
                break;
        }
        System.out.println(i);
    }
}

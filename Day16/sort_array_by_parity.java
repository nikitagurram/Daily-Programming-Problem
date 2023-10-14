import java.util.ArrayList;

/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted. */
public class sort_array_by_parity {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 4, 1 };
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < even.size()) {
                nums[i] = even.get(i);
            } else {
                nums[i] = odd.get(k);
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

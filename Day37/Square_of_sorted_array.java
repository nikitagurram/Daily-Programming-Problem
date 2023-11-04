package Day37;

import java.util.Arrays;

public class Square_of_sorted_array {
    public static void main(String[] args) {
        int nums[] = { -2, -4, 0, 3, 5 };
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

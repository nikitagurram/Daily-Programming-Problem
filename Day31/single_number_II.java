import java.util.Arrays;

public class single_number_II {
    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i += 2;
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int nums[]={1,2,2,2,1,3,1};
        System.out.println(singleNumber(nums));
    }
}

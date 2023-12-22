package Day85;

public class findGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int nums[] = { 2, 6, 4, 9, 10 };
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i])
                min = nums[i];
            if (max < nums[i])
                max = nums[i];
        }
        if (max % min == 0)
            return min;
        else {
            for (int i = min - 1; i >= 1; i--) {
                if (min % i == 0 && max % i == 0)
                    return i;
            }
        }
        return 1;
    }
}

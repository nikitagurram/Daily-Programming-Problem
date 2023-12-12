package Day75;

public class maximum_product_of_two_elements_in_an_array {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 2 };
        // Arrays.sort(nums);
        // int pro=(nums[nums.length-2]-1)*(nums[nums.length-1]-1);
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num >= max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        System.out.println((max1 - 1) * (max2 - 1));
    }
}

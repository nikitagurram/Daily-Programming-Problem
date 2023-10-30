package Day32;

public class how_many_numbers_are_smaller_than_the_current_number {
    public static void main(String[] args) {
        int nums[] = { 8, 2, 1, 1, 3 };
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}

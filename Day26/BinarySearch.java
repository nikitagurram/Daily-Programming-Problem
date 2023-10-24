public class BinarySearch {
    public static int search(int[] nums, int target) {
        // Write your code here.
        int s = 0;
        int e = nums.length - 1;
        while (e >= s) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 3;
        System.out.println(search(nums, target));
    }
}

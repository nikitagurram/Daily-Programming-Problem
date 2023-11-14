package Day47;

/**
 * merge_sorted_array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n.
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
 * from nums1.
 */
public class merge_sorted_array {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };
        int n1 = m - 1;
        int n2 = n - 1;
        int len = m + n - 1;
        while (n2 >= 0) {
            if (n1 >= 0 && nums1[n1] > nums2[n2]) {
                nums1[len--] = nums1[n1--];
            } else {
                nums1[len--] = nums2[n2--];
            }
        }
        for (int ele : nums1) {
            System.out.print(ele + " ");
        }
    }
}
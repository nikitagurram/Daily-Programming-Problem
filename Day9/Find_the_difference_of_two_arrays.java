
/*Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 */
import java.util.ArrayList;
import java.util.List;

public class Find_the_difference_of_two_arrays {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3 };
        int nums2[] = { 2, 3, 4 };
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        List<Integer> common = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int flag = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    flag = 1;
                    common.add(nums1[i]);
                    break;
                }
            }
            if (n1.contains(nums1[i]))
                continue;
            if (flag == 0)
                n1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (n1.contains(nums2[i]) || common.contains(nums2[i]) || n2.contains(nums2[i]))
                continue;
            else
                n2.add(nums2[i]);
        }
        list.add(n1);
        list.add(n2);
        System.out.println(list);

    }
}

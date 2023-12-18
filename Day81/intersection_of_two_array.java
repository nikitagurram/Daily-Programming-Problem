package Day81;

import java.util.HashSet;

public class intersection_of_two_array {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 2, 1 };
        int nums2[] = { 2, 2, 3 };
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            if (s1.contains(i)) {
                s2.add(i);
            }
        }
        int res[] = new int[s2.size()];
        int i = 0;
        for (int n : s2) {
            res[i] = n;
            System.out.println(res[i++]);
        }
    }
}

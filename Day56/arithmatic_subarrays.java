package Day56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every two consecutive elements is the same. More formally, a sequence s is arithmetic if and only if s[i+1] - s[i] == s[1] - s[0] for all valid i.
For example, these are arithmetic sequences:
1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
The following sequence is not arithmetic:
1, 1, 2, 5, 7
You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range queries, where the ith query is the range [l[i], r[i]]. All the arrays are 0-indexed.
Return a list of boolean elements answer, where answer[i] is true if the subarray nums[l[i]], nums[l[i]+1], ... , nums[r[i]] can be rearranged to form an arithmetic sequence, and false otherwise.
Input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
Output: [true,false,true]
Explanation:
In the 0th query, the subarray is [4,6,5]. This can be rearranged as [6,5,4], which is an arithmetic sequence.
In the 1st query, the subarray is [4,6,5,9]. This cannot be rearranged as an arithmetic sequence.
In the 2nd query, the subarray is [5,9,3,7]. This can be rearranged as [3,5,7,9], which is an arithmetic sequence. */
public class arithmatic_subarrays {
    public static void main(String[] args) {
        int nums[] = { 4, 6, 5, 9, 3, 7 };
        int l[] = { 0, 0, 2 };
        int r[] = { 2, 3, 5 };
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            boolean flag = true;
            int subarray[] = new int[r[i] - l[i] + 1];
            for (int j = 0; j < subarray.length; j++) {
                subarray[j] = nums[j + l[i]];
            }
            Arrays.sort(subarray);
            int n = subarray[1] - subarray[0];
            for (int j = 0; j < subarray.length - 1; j++) {
                if (subarray[j + 1] - subarray[j] != n) {
                    flag = false;
                    break;
                }
            }
            res.add(flag);
        }
        System.out.println(res);
    }
}

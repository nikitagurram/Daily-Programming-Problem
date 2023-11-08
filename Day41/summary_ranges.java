package Day41;

/*You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:
"a->b" if a != b
"a" if a == b
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7" */
import java.util.ArrayList;
import java.util.List;

public class summary_ranges {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5, 6, 8, 9 };
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1])
                i++;
            if (s != nums[i]) {
                ans.add("" + s + "->" + nums[i]);
            } else {
                ans.add("" + s);
            }
        }
        System.out.println(ans);
    }
}

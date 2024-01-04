package Day98;

import java.util.Arrays;
import java.util.HashMap;

/*You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
For each index i, names[i] and heights[i] denote the name and height of the ith person.
Return names sorted in descending order by the people's heights.
Example 1:
Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:
Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob. */
public class sort_the_people {
    public static void main(String[] args) {
        int heights[] = { 180, 165, 170, 175 };
        String names[] = { "Niki", "uma", "aishu", "ashwini" };
        int n = names.length;
        String ans[] = new String[n];
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int i = 0;
        for (int j = n - 1; j >= 0; j--) {
            ans[i] = map.get(heights[j]);
            System.out.print(ans[i++] + " ");
        }
    }
}

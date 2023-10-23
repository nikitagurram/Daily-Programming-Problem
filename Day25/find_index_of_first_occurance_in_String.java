/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 or -1 if needle is not part of haystack.
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0. */
public class find_index_of_first_occurance_in_String {
    static int strStr(String haystack, String needle) {
        int n = needle.length();
        for (int i = 0; i <= haystack.length() - n; i++) {
            String sub = haystack.substring(i, i + n);
            if (sub.equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leet";
        System.out.println(strStr(haystack, needle));
    }
}

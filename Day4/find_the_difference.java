
/*
 * Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:
Input: s = "", t = "y"
Output: "y"
 */
import java.util.Arrays;

public class find_the_difference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        for (; i < s.length(); i++) {
            if (arr1[i] != arr2[i]) {
                break;
            }
        }
        System.out.println(arr2[i]);
    }
}

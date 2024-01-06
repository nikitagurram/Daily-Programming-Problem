package Day100;

/*Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
An alphanumeric string is a string consisting of lowercase English letters and digits.
Example 1:
Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2:
Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit.  */
import java.util.ArrayList;
import java.util.Collections;

public class second_largest_digit_in_a_string {
    public static void main(String[] args) {
        String s = "abs12a34s2";
        System.out.println(secondHighest(s));
    }

    public static int secondHighest(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i) - '0';
            if (k >= 0 && k <= 9 && !arr.contains(k)) {
                arr.add(k);
            }
        }
        Collections.sort(arr);
        if (arr.size() <= 1)
            return -1;
        return arr.get(arr.size() - 2);
    }
}

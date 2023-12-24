package Day87;

/*You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.
The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.
Return the minimum number of operations needed to make s alternating.
Example 1:
Input: s = "0100"
Output: 1
Explanation: If you change the last character to '1', s will be "0101", which is alternating.
Example 2:
Input: s = "10"
Output: 0
Explanation: s is already alternating.
Example 3:
Input: s = "1111"
Output: 2
Explanation: You need two operations to reach "0101" or "1010". */
public class minimum_change_to_make_alternating_binary_string {
    public static void main(String[] args) {
        int zero = 0;
        int one = 0;
        String s = "1000";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0')
                    one++;
                else
                    zero++;
            } else {
                if (s.charAt(i) == '1')
                    one++;
                else
                    zero++;
            }
        }
        System.out.println(Math.min(zero, one));
    }
}

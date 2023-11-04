package Day37;

/*You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.
  */
public class largest_odd_number_in_String {
    public static void main(String[] args) {
        String ans = "";
        String num = "235647";
        for (int i = num.length() - 1; i >= 0; i--) {
            int num1 = (int) num.charAt(i) - '0';
            if (num1 % 2 != 0) {
                ans = ans + num.substring(0, i + 1);
                break;
            }
        }
        System.out.println(ans);
    }
}

package Day42;

/*You are given a binary string s that contains at least one '1'.
You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.
Return a string representing the maximum odd binary number that can be created from the given combination.
Note that the resulting string can have leading zeros.
Input: s = "010"
Output: "001"
Explanation: Because there is just one '1', it must be in the last position. So the answer is "001". */
public class maximum_odd_binary_number {
    public static void main(String[] args) {
        String s = "01010";
        int one = 0;
        int zero = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                zero++;
            else
                one++;
        }
        String res = "1";
        one--;
        for (int i = 1; i < s.length(); i++) {
            if (zero > 0) {
                res = "0" + res;
                zero--;
            } else if (one != 0) {
                res = "1" + res;
                one--;
            }
        }
        System.out.println(res);
    }
}

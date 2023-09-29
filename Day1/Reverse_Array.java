package Day1;

/* Reverse Array
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/
public class Reverse_Array {
    public static void main(String[] args) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        for (char i : s) {
            System.out.print(i + " ");
        }
    }

    static void reverseString(char[] s) {
        int n = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i];
            s[n - i] = temp;
        }
    }
}

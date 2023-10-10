/*You are given a string s and an integer array indices of the same length. 
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 */
public class Shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int indices[] = { 4, 5, 6, 7, 0, 2, 1, 3 };
        char ch[] = s.toCharArray();
        String str = "";
        for (int i = 0; i < indices.length; i++) {
            // char ch=s.charAt(indices[i]);
            ch[indices[i]] = s.charAt(i);
        }
        for (char e : ch) {
            str += e;
        }
        System.out.println(str);
    }
}

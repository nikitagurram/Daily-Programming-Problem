package Day53;

/*Example 1:
Input: sentence = "leetcode exercises sound delightful"
Output: true
Explanation: The words in sentence are ["leetcode", "exercises", "sound", "delightful"].
- leetcode's last character is equal to exercises's first character.
- exercises's last character is equal to sound's first character.
- sound's last character is equal to delightful's first character.
- delightful's last character is equal to leetcode's first character.
The sentence is circular.
Example 2:
Input: sentence = "eetcode"
Output: true
Explanation: The words in sentence are ["eetcode"].
- eetcode's last character is equal to eetcode's first character.
The sentence is circular. */
public class circular_sentence {
    public static void main(String[] args) {
        String str = "leetcode excel";
        System.out.println(isCircularSentence(str));
    }

    static boolean isCircularSentence(String sentence) {
        String str[] = sentence.split(" ");
        char ch = str[0].charAt(0);
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].charAt(str[i].length() - 1) != str[i + 1].charAt(0)) {
                return false;
            }
        }
        if (str[str.length - 1].charAt(str[str.length - 1].length() - 1) != ch)
            return false;
        return true;
    }
}

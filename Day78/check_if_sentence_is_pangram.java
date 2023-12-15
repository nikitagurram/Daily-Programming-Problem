package Day78;

/*A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:
Input: sentence = "leetcode"
Output: false */
public class check_if_sentence_is_pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        int alpha[] = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            int n = sentence.charAt(i) - 'a';
            alpha[n]++;
        }
        for (int j = 0; j < 26; j++) {
            if (alpha[j] == 0)
                return false;
        }
        return true;
    }
}

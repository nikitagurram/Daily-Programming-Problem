package Day96;

/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence
For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
Example 1:
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:
Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers. */
public class sorting_the_sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String list[] = s.split(" ");
        String str[] = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            int a = list[i].charAt(list[i].length() - 1) - '0';
            str[a - 1] = list[i].substring(0, list[i].length() - 1);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            res.append(str[i]).append(" ");
        }
        System.out.println(res.toString().trim());
    }
}

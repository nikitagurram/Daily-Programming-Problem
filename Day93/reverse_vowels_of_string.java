package Day93;

/**
 * reverse_vowels_of_string
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
 * and upper cases, more than once.
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class reverse_vowels_of_string {

    public static void main(String[] args) {
        String s = "Nikita";
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while (start < end) {
            while (start < end && vowels.indexOf(ch[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(ch[end]) == -1) {
                end--;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String reverse = new String(ch);
        System.out.println(reverse);
    }
}
package Day79;

import java.util.ArrayList;

/**
 * first_non_repeating_character
 * Sample Input 1 :
 * 2
 * aDcadhc
 * AabBcC
 * Sample Output 1:
 * D
 * A
 * Explanation for Sample Input 1:
 * In the first test case, ‘a’ is repeated.’ D’ is the first non-repeating
 * character in the string, so we return it.
 * In the second test case, all the characters are non-repeating, so we return
 * the first character.
 * Sample Input 2 :
 * 2
 * ABcd
 * AAAbcdb
 * Sample Output 2:
 * A
 * c
 */
public class first_non_repeating_character {
    public static void main(String[] args) {
        String str = "afjiebuhbfj";
        System.out.println(firstNonRepeatingCharacter(str));
    }

    public static char firstNonRepeatingCharacter(String str) {
        // Write your code here;
        ArrayList<Character> ch = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int flag = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = 0;
                    ch.add(str.charAt(i));
                    break;
                }
            }
            if (flag == 1 && !ch.contains(str.charAt(i)))
                return str.charAt(i);
        }
        return str.charAt(0);
    }
}
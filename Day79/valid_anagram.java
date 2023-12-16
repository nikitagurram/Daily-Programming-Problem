package Day79;

// import java.util.Arrays;

/**
 * valid_anagram
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 */
public class valid_anagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int set[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            set[a.charAt(i) - 'a']++;
            set[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (set[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagrama";
        System.out.println(isAnagram(a, b));
    }

    // public static boolean isAnagram(String a, String b) {
    // if (a.length() != b.length()) {
    // return false;
    // } else {
    // a = a.toLowerCase();
    // b = b.toLowerCase();
    // char[] S1 = a.toCharArray();
    // char[] S2 = b.toCharArray();
    // Arrays.sort(S1);
    // Arrays.sort(S2);
    // for (int i = 0; i < a.length(); i++) {
    // if (S1[i] != S2[i])
    // return false;

    // }
    // return true;
    // }
    // }

}
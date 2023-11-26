package Day59;

/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true. */
public class check_if_two_string_arrays_are_equivalent {
    public static void main(String[] args) {
        String word1[] = { "a", "bc" };
        String word2[] = { "ab", "c" };
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        for (int i = 1; i < word1.length; i++)
            word1[0] += word1[i];
        for (int i = 1; i < word2.length; i++)
            word2[0] += word2[i];
        if (word1[0].equals(word2[0]))
            return true;
        return false;
    }
}

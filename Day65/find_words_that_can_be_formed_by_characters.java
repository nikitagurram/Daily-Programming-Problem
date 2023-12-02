package Day65;

public class find_words_that_can_be_formed_by_characters {
    public static void main(String[] args) {
        int count[] = new int[26];
        String chars = "atahc";
        String words[] = { "cat", "bt", "hat", "tree" };
        for (int i = 0; i < chars.length(); i++) {
            count[chars.charAt(i) - 'a']++;
        }
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            if (wordInChars(words[i], count)) {
                ans += words[i].length();
            }
        }
        System.out.println(ans);
    }

    static boolean wordInChars(String s, int count[]) {
        int c[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            c[x]++;
            if (c[x] > count[x]) {
                return false;
            }
        }
        return true;
    }
}

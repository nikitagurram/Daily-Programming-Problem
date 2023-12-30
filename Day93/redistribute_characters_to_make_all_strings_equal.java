package Day93;

public class redistribute_characters_to_make_all_strings_equal {
    public static void main(String[] args) {
        String words[] = { "abc", "aabc", "bc" };
        System.out.println(makeEqual(words));
    }

    public static boolean makeEqual(String[] words) {
        int arr[] = new int[26];
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < words[i].length(); j++) {
                arr[s.charAt(j) - 'a']++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}

/*
557 : Reverse Word in String III
Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:
Input: s = "God Ding"
Output: "doG gniD"
 */
public class Reverse_Word_In_String_3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String str[] = s.split(" ");
        String str2 = "";
        str2 = reverse(str[0]);
        for (int i = 1; i < str.length; i++) {
            String str1 = reverse(str[i]);
            str2 = str2 + " " + str1;
        }
        System.out.println(str2);
    }

    static String reverse(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str1 = ch + str1;
        }
        return str1;
    }
}

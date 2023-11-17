package Day50;

/*Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
Return the final string that will be present on your laptop screen.
Input: s = "string"
Output: "rtsng"
Explanation: 
After typing first character, the text on the screen is "s".
After the second character, the text is "st". 
After the third character, the text is "str".
Since the fourth character is an 'i', the text gets reversed and becomes "rts".
After the fifth character, the text is "rtsn". 
After the sixth character, the text is "rtsng". 
Therefore, we return "rtsng". */
public class faulty_keyboard {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String s = "String";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                str.reverse();
            } else {
                str.append(s.charAt(i));
            }
        }
        System.out.println(str.toString());
    }
}

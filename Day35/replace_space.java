package Day35;

/*Coding Ninjas Is A Coding Platform
Hello World
Output 1:
Coding@40Ninjas@40Is@40A@40Coding@40Platform
Hello@40World */
public class replace_space {
    static StringBuilder replaceSpaces(StringBuilder str) {
        // Write your code here.
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str1 = str.replace(i, i + 1, "@40");
            }

        }
        if (str1.length() == 0) {
            return str;

        }
        return str1;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("I Love Myself");
        System.out.println(replaceSpaces(str));
    }
}

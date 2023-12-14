package Day77;

/*Sample Input 1 :
3
I love programming
they are playing cricket
good to see you
Sample Output 1 :
I Love Programming
They Are Playing Cricket
Good To See You
Explanation of The Sample Input 1:
For the first test case:
Given string is “I love programming” we will convert every letter after space to uppercase to give the output as ”I Love Programming”.
For the second test case:
Given string is “they are playing cricket” we will convert every letter after space to uppercase to give the output as  “They Are Playing Cricket”. 
For the third test case:
Given string is “good to see you” we will convert every letter after space to uppercase to give the output as “Good To See You”. 
Sample Input 2 :
3
why you are confused
Its a good day to be here
go and do your work
Sample Output 2 :
 Why You Are Confused
 Its A Good Day to Be Here
 Go And Do Your Work
 */
public class convert_String {
    public static void main(String[] args) {
        String str = "I love programming";
        String res = "";
        char ch = str.charAt(0);
        int i = 0;
        while (str.length() > i) {
            if (i == 0 && str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                res += ch;
            } else if (i == 0) {
                ch = (char) (ch - 'a' + 'A');
                res = res + ch;
            } else if (str.charAt(i - 1) == ' ' && str.charAt(i) >= 97) {
                ch = str.charAt(i);
                ch = (char) (ch - 'a' + 'A');
                res = res + ch;
            } else {
                res += str.charAt(i);
            }
            i++;
        }
        System.out.println(res);
    }
}

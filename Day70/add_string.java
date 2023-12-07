package Day70;

/*
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
 */
public class add_string {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "234";
        StringBuilder sum = new StringBuilder();
        int sum1 = 0, n1 = num1.length() - 1, n2 = num2.length() - 1, carry = 0;
        while (n1 >= 0 || n2 >= 0 || carry > 0) {
            int digit1 = (n1 >= 0) ? num1.charAt(n1--) - '0' : 0;
            int digit2 = (n2 >= 0) ? num2.charAt(n2--) - '0' : 0;
            sum1 = digit1 + digit2 + carry;
            sum.append(sum1 % 10);
            carry = sum1 / 10;
        }
        System.out.println(sum.reverse().toString());
    }
}

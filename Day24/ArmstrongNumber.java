/*Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes". */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int original = n;
        while (n != 0) {
            int rem = n % 10;
            sum += (rem * rem * rem);
            n /= 10;

        }
        if (original == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

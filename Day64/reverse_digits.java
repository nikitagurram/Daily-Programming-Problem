package Day64;

/*Input: 200
Output: 2
Explanation: By reversing the digts of 
number, number will change into 2.
Example 2:

Input : 122
Output: 221
Explanation: By reversing the digits of 
number, number will change into 221. */
public class reverse_digits {
    public static void main(String[] args) {
        long rev = 0;
        long n = 1231;
        while (n != 0) {
            long rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println(rev);
    }
}

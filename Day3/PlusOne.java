/* 66. Plus One
 * Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */
public class PlusOne {
    public static void main(String[] args) {
        int digits[] = { 4, 3, 2, 1 };
        int updateDigits[] = plusOne(digits);
        for (int i : updateDigits) {
            System.out.print(i + " ");
        }
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}

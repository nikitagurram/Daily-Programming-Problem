/**
 * count_the_digits_that_divide_number
 * Given an integer num, return the number of digits in num that divide num.
 * An integer val divides nums if nums % val == 0.
 * Input: num = 7
 * Output: 1
 * Explanation: 7 divides itself, hence the answer is 1
 * Input: num = 121
 * Output: 2
 * Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a
 * digit, we return 2.
 */
public class count_the_digits_that_divide_number {
    public static void main(String[] args) {
        int num = 121;
        int count = 0;
        int numcopy = num;
        while (num != 0) {
            int rem = num % 10;
            if (numcopy % rem == 0)
                count++;
            num /= 10;
        }
        System.out.println(count);
    }

}
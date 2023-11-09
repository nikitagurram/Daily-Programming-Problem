package Day42;

/**
 * find_MSB
 * You are given a positive integer 'N'. Your task is to find the greatest
 * integer less than or equal to 'N' which is a power of 2.
 * For Example:
 * If N 14, then the nearest integer that is less than or equal to 14 and is a
 * power of two is 8(2^3). So, the answer is 8.
 */
public class find_MSB {
    public static void main(String[] args) {
        int n = 14;
        int i = 0;
        double prev = 0;
        while (true) {
            if (Math.pow(2, i) > n) {
                break;
            }
            prev = Math.pow(2, i);
            i++;
        }
        System.out.println((int) prev);
    }

}
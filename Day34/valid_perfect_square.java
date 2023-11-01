/*
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 */
public class valid_perfect_square {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        if (n == (int) n)
            return true;
        return false;
    }
}

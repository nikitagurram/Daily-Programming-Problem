/*Given a number N. Count the number of digits in N which evenly divides N.
Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly */
public class count_digit {
    public static void main(String[] args) {
        int N = 12;
        int m = N;
        int count = 0;
        while (N != 0) {
            int rem = N % 10;
            if (rem != 0 && m % rem == 0)
                count++;
            N /= 10;
        }
        System.out.println(count);
    }
}

package Day55;

import java.util.Scanner;

/*White a program to input on integer n and print the sum of of its even digits and the sum of all its odd digits separately.1
Digits mean numbers, not places! That is, if the given integer is "132456" even digits are 2. 4, and 6, and odd digits are 1, 3. and 5.
Input: 'n' = 132456
Output: 129
Explanation:
The sum of even digits = 2+4+6=12
The sum of odd digits = 1+3+5=9 */
public class sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 == 0)
                even += rem;
            else
                odd += rem;
            n /= 10;
        }
        sc.close();
        System.out.println(even + " " + odd);
    }
}

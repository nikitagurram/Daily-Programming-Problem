/*Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) 
where function F(i) for the number i is defined as the sum of all divisors of i.
Input:
N = 4
Output:
15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
ans = F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7
    = 15 */
//(1 x (5/1) ) + (2 x(5/2)) + (3x(5/3)) + (4 x (5/4)) + (5x(5/5))
public class sum_of_all_divisors_from_1_to_n {
    public static void main(String[] args) {
        int N = 4;
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += (i * (N / i)); // ans = (1 x (N/1)) + (2 x (N/2)) + (3x(N/3)) + ... + (Nx(N/N)),
        }
        System.out.println(sum);
    }
}

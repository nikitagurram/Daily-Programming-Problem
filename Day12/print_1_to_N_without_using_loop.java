/*Print numbers from 1 to N without the help of loops
Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10
 */
public class print_1_to_N_without_using_loop {
    static void printNos(int N) {
        // Your code here
        if (N == 0)
            return;
        printNos(N - 1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        int N = 10;
        printNos(N);
    }
}

/*Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21,...
Input :
N = 4 
Output:
10
Explanation:
The 4th term of the Series is 10. */
public class Find_nth_term_of_series_1_3_6_10_15_21_ {
    static int findNthTerm(int N) {
        // code here
        // int k = 2;
        // int res = 1;
        // for (int i = 1; i < N; i++) {
        // res = res + k;
        // k++;
        // }
        // return res;
        return (N * (N + 1) / 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(findNthTerm(n));
    }
}

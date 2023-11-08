package Day41;

/*Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101 */
public class counting_bits {
    public static void main(String[] args) {
        int n = 10;
        int ans[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                ans[i] += temp & 1;
                temp >>= 1;
            }
            // ans[i]=Integer.bitCount(i);
            System.out.print(ans[i] + " ");
        }
    }
}

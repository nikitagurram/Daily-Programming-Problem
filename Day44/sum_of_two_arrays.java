package Day44;

/*Sample Input 1:
2
4 1 
1 2 3 4
6
3 2
1 2 3
9 9    
Sample Output 1:
1 2 4 0
2 2 2
Explanation For Sample Input 1:
For the first test case, the integer represented by the first array is 1234 and the second array is 6, so the sum is 1234 + 6 =  1240.
For the second test case, the integer represented by the first array is 123 and the second array is 99, so the sum is 123 + 99 = 222. */
import java.util.ArrayList;

public class sum_of_two_arrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 6 };
        int n = 4, m = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum * 10) + a[i];
        }
        int sum1 = 0;
        for (int i = 0; i < m; i++) {
            sum1 = sum1 * 10 + b[i];
        }
        sum += sum1;
        while (sum != 0) {
            int rem = sum % 10;
            arr.add(rem);
            sum /= 10;
        }
        int ans[] = new int[arr.size()];
        int j = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            ans[j] = arr.get(i);
            System.out.println(ans[j]);
            j++;
        }
    }
}

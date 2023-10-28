
/*2
4 2
3 4 2 1
5 1
2 2 3 3 1
Sample Output 1:
3 4
3
Explanation For Sample Input 1:
Test case 1:
If we sort the array then it will look like: [1, 2, 3, 4]. The 2 largest elements will be [3, 4].
Test case 2:
If we sort the array then it will look like: [1, 2, 2, 3, 3]. Then the largest element will be [3]. */
import java.util.*;

public class K_largest_element {
    public static void main(String[] args) {
        int k = 2;
        int a[] = { 1, 3, 2, 4 };
        int n = 4;
        int ans[] = new int[k];
        Arrays.sort(a);
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j] = a[i];
            j++;
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }

}

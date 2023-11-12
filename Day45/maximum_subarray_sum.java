package Day45;

/*

 input: 9
1 2 7 -4 3 2 -10 9 1
Sample Output 1 :
11
Explanation for Sample 1 :
The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2].
Sample Input 2 :
6
10 20 -30 40 -50 60
Sample Output 2 :
60
Sample Input 3 :
3
-3 -5 -6
Sample Output 3 :
0
 */
public class maximum_subarray_sum {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 1, 4, -6, 8, 2, 4 };
        int sum = 0;
        int finalSum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum < arr[i])
                sum = arr[i];
            if (finalSum < sum) {
                finalSum = sum;
            }
        }
        System.out.println(finalSum);
    }
}

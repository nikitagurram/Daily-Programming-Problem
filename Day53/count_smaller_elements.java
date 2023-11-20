package Day53;

/*Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.
Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output: 5 */
public class count_smaller_elements {
    public static void main(String[] args) {
        long count = 0;
        long arr[] = { 1, 2, 2, 2, 3, 4, 5 };
        long n = 7;
        long x = 3;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x)
                count++;
        }
        System.out.println(count);

    }
}

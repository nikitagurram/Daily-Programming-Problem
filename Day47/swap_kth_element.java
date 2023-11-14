package Day47;

/*Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.
Input:
N = 8, K = 3
Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
Output: 1 2 6 4 5 3 7 8
Explanation: Kth element from beginning is
3 and from end is 6. */
public class swap_kth_element {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        int k = 3;
        int m = n - k;
        int temp = arr[k - 1];
        arr[k - 1] = arr[m];
        arr[m] = temp;
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}

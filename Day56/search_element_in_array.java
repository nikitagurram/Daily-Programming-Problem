package Day56;

/*n = 4
arr[] = {1,2,3,4}
x = 3
Output: 2
Explanation: There is one test case 
with array as {1, 2, 3 4} and element 
to be searched as 3.  Since 3 is 
present at index 2, output is 2.
 */
public class search_element_in_array {
    static int search(int arr[], int N, int X) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 1, 2, 3, 4, 5 };
        int X = 3;
        System.out.println(search(arr, N, X));
    }
}

package Day65;

/*Given an unsorted array Arr[] of N integers and a Key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ).If the key does not exist in the array then return -1 for both start and end index in this case.
Input:
N = 6
arr[] = { 1, 2, 3, 4, 5, 5 }
Key = 5
Output:  4 5
Explanation:
5 appears first time at index 4 and
appears last time at index 5.
(0 based indexing)
  */
public class find_index {
    public static void main(String[] args) {
        int index[] = new int[2];
        int a[] = { 1, 3, 2, 4, 6, 5, 4 };
        int N = 7;
        int key = 4;
        index[0] = -1;
        index[1] = -1;
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                index[0] = i;
                break;
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            if (a[i] == key) {
                index[1] = i;
                break;
            }
        }

        System.out.println(index[0] + " " + index[1]);
    }
}

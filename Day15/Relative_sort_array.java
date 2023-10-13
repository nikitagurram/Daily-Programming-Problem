
/*Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. 
Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19] */
import java.util.Arrays;

public class Relative_sort_array {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 1, 4, 5, 9, 6 };
        int arr2[] = { 1, 2, 5, 6 };
        int arr[] = new int[arr1.length];
        int k = 0;
        Arrays.sort(arr1);
        for (int i : arr2) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == i) {
                    arr[k] = arr1[j];
                    arr1[j] = -1;
                    k++;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                arr[k] = arr1[i];
                k++;
            }
        }
    }
}

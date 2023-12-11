package Day74;

public class element_appearing_more_than_25_in_sorted_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 6, 6, 6, 6, 7, 9 };
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        int size = arr.length;
        int percent = size / 4;
        int count = 1;
        int res = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (count > percent) {
                    return arr[i];
                }
            } else {
                count = 1;
            }
        }
        return res;
    }
}

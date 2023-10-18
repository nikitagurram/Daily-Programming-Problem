package Day20;

/*Sample Input 1:
5 5
1 2 3 4 5
Sample Output 1:
1 4
2 3
Explaination For Sample Output 1:
Here, 1 + 4 = 5
      2 + 3 = 5
Hence the output will be, (1,4) , (2,3). */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pair_sum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int s = 5;
        Arrays.sort(arr);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    int a[] = { arr[i], arr[j] };
                    list.add(a);
                }
            }
        }
        System.out.println(list);
    }
}

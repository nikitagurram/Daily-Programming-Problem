package Day43;

import java.util.ArrayList;
import java.util.Arrays;

/*For the given array [13, 7, 6, 12].

There is no greater element for 13 on the right side.
The next greater element for 7 is 12. 
The next greater element for 6 is 12. 
There is no greater element for 12 on the right side.

So, the output is [-1, 12, 12, -1]. */
public class next_greater_number {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 2, 12, 23, 1));
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int num = -1;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    num = arr.get(j);
                    break;
                }
            }
            ans.add(num);
        }
        System.out.println(ans);
    }
}

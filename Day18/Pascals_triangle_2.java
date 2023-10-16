
/*Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Input: rowIndex = 3
Output: [1,3,3,1]
Input: rowIndex = 0
Output: [1] */
import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle_2 {
    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        for (int i = 0; i < rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1);
            prev = curr;
        }
        System.out.println(prev);
    }
}

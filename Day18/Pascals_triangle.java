package Day18;

/*Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]] */
import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        list.add(prev);
        for (int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1);
            list.add(curr);
            prev = curr;
        }
        System.out.println(list);

    }
}

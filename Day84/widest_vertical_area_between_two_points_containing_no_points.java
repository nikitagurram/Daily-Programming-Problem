package Day84;

import java.util.Arrays;

/*Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.
A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.
Note that points on the edge of a vertical area are not considered included in the area.
Example 1:
Input: points = [[8,7],[9,9],[7,4],[9,7]]
Output: 1
Explanation: Both the red and the blue area are optimal.
Example 2:
Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
Output: 3 */
public class widest_vertical_area_between_two_points_containing_no_points {
    public static void main(String[] args) {
        int points[][] = { { 8, 7 }, { 9, 9 }, { 7, 9 }, { 9, 8 } };
        int res = 0;
        int n = points.length;
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = points[i][0];
        }
        Arrays.sort(x);
        for (int i = 0; i < n - 1; i++) {
            int dist = x[i + 1] - x[i];
            res = Math.max(dist, res);
        }
        System.out.println(res);
    }
}

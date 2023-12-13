package Day76;

/*Given an m x n binary matrix mat, return the number of special positions in mat.
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
Example 1:
Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
Example 2:
Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
  */
public class special_position_in_binary_matrix {
    public static void main(String[] args) {
        int count = 0;
        int mat[][] = { { 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } };
        int row[] = new int[mat.length];
        int col[] = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    col[j]++;
                    row[i]++;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    if (row[i] == 1 && col[j] == 1)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}

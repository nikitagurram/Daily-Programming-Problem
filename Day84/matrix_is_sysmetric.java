package Day84;

/*Sample Input 1 :
1
3
1 2 3 2 4 5 3 5 8
Sample Output 1 :
Yes 
explanation:-
1 2 3       1 2 3
2 4 5   =   2 4 5
3 5 8       3 5 8 
*/
public class matrix_is_sysmetric {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2 }, { 2, 1 } };
        System.out.println(isMatrixSymmetric(matrix));
    }

    public static boolean isMatrixSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

package Day38;

/*You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
A row i is weaker than a row j if one of the following is true:
The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
Input: mat = 
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]], 
k = 3
Output: [2,0,3]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 2 
- Row 1: 4 
- Row 2: 1 
- Row 3: 2 
- Row 4: 5 
The rows ordered from weakest to strongest are [2,0,3,1,4]. */
public class the_k_weakest_row_in_matrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 0 }, { 1, 1 }, { 1, 0 } };
        int k = 2;
        int count[] = new int[mat.length];
        int ans[] = new int[k];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count[i]++;
                } else {
                    break;
                }
            }
        }
        int m = 0;
        for (int i = 0; i <= mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (m >= k) {
                    break;
                }
                if (count[j] == i) {
                    ans[m] = j;
                    m++;
                }
            }
        }
        for (int ele : ans) {
            System.out.println(ele + " ");
        }
    }
}

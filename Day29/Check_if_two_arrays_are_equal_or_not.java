import java.util.Arrays;

/* */
public class Check_if_two_arrays_are_equal_or_not {
    public static boolean check(long A[], long B[], int N) {
        // Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        if (A.length != B.length)
            return false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i])
                return false;
            // System.out.println(A[i]+" "+B[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        long A[] = { 0, 1, 2, 3, 4, 5 };
        long B[] = { 5, 4, 2, 3, 1, 0 };
        System.out.println(check(A, B, 0));
    }
}

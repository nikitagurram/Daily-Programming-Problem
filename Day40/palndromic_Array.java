package Day40;

/*Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
Example 1:
Input: 5
111 222 333 444 555
Output: 1
Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1. */
public class palndromic_Array {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (reverse(a[i]) != a[i])
                return 0;
        }
        return 1;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int a[] = { 111, 222, 333 };
        int n = 3;
        System.out.println(palinArray(a, n));
    }
}

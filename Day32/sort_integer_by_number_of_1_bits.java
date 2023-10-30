package Day32;

import java.util.Arrays;

public class sort_integer_by_number_of_1_bits {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int bitCount[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            bitCount[i] = countBit(arr[i]) * 10001 + arr[i];
        }
        Arrays.sort(bitCount);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(bitCount[i] % 10001 + " ");
        }
    }

    static int countBit(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }
}

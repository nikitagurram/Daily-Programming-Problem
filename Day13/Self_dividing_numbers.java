
/*A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.
Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
Input: left = 47, right = 85
Output: [48,55,66,77]
*/
import java.util.ArrayList;
import java.util.List;

public class Self_dividing_numbers {
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (divide(i)) {
                list.add(i);
            }
        }
        return list;
    }

    static boolean divide(int num) {
        int nums = num;
        while (num != 0) {
            int rem = num % 10;
            if (rem == 0 || nums % rem != 0)
                return false;
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }
}

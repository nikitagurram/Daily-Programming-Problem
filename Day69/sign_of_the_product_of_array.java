package Day69;

/*There is a function signFunc(x) that returns:
1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.
Return signFunc(product).
Example 1:
Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
Example 2:
Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0
Example 3:
Input: nums = [-1,1,-1,1,-1]
Output: -1
Explanation: The product of all values in the array is -1, and signFunc(-1) = -1 */
public class sign_of_the_product_of_array {
    public static void main(String[] args) {
        int nums[] = { -1, 3, -4, 6, -2 };
        System.out.println(arraySign(nums));
    }

    public static int arraySign(int[] nums) {
        int sign = 0;
        for (int i : nums) {
            if (i == 0)
                return 0;
            if (i < 0)
                sign++;
        }
        return (sign % 2 == 0) ? 1 : -1;
    }
}

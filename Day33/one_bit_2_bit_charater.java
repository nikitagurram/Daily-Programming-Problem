/*We have two special characters:
The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.
Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character. */
public class one_bit_2_bit_charater {
    static boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == 0 && i == bits.length - 1)
                return true;
            else if (bits[i] == 1)
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int bits[] = { 1, 0, 0 };
        System.out.println(isOneBitCharacter(bits));
    }
}

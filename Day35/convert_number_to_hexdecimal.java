package Day35;

/*
 * Example 1:
Input: num = 26
Output: "1a"
Example 2:
Input: num = -1
Output: "ffffffff"
 */
public class convert_number_to_hexdecimal {
    public static void main(String[] args) {
        int num = 161;
        System.out.println(toHex(num));
    }

    static String toHex(int num) {
        char hexdecimal[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        String hexdecNum = "";
        if (num == 0)
            return "0";
        while (num != 0) {
            hexdecNum = hexdecimal[(num & 15)] + hexdecNum;
            // System.out.println(num & 15);
            num = num >>> 4;
        }
        return hexdecNum;
    }
}

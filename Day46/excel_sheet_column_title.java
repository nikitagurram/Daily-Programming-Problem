package Day46;

/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
Example 1:
Input: columnNumber = 1
Output: "A"
Example 2:
Input: columnNumber = 28
Output: "AB"
Example 3:
Input: columnNumber = 701
Output: "ZY"
  */
public class excel_sheet_column_title {
    public static void main(String[] args) {
        String result = "";
        int columnNumber = 28;
        while (columnNumber > 0) {
            if (columnNumber % 26 == 0) {
                result = "Z" + result;
            } else {
                result = (char) ((columnNumber % 26) - 1 + 'A') + result;
            }
            columnNumber = (columnNumber - 1) / 26;
        }
        System.out.println(result);
    }
}

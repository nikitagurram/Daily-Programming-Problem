package Day46;

/*Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
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
Input: columnTitle = "A"
Output: 1
Example 2:
Input: columnTitle = "AB"
Output: 28
Example 3:
Input: columnTitle = "ZY"
Output: 701
explaination : ans=0*26=0 ans=0+25+1=26
               ans=26*26= 676 ans=676+24+1=701  */
public class excel_sheet_column_number {
    public static void main(String[] args) {
        int ans = 0;
        String columnTitle = "ZY";
        for (int i = 0; i < columnTitle.length(); i++) {
            ans *= 26;
            ans += columnTitle.charAt(i) - 'A' + 1;
        }
        System.out.println(ans);
    }
}

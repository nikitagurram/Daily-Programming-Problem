package Day69;

/*
 * Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
Example 1:
Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
Example 2:
Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
Example 3:
Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
 */
public class calculate_money_in_leetcode_bank {
    public static void main(String[] args) {
        int n = 20;
        int weeks = n / 7;
        int savedMoney = 0;
        int remainingDays = n % 7;
        savedMoney += 28 + (weeks - 1) * 7;
        savedMoney = weeks * (savedMoney + 28) / 2;
        savedMoney += (remainingDays * (remainingDays + 1)) / 2 + (weeks * remainingDays);
        System.out.println(savedMoney);
    }
}

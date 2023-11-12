package Day45;

/**
 * best_time_to_buy_and_sell_stocks
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
 * 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you
 * must buy before you sell.
 */
public class best_time_to_buy_and_sell_stocks {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int profit_today = 0;
        int profit = 0;
        int prices[] = { 7, 1, 3, 4, 6, 2 };

        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            profit_today = prices[i] - min;
            if (profit < profit_today) {
                profit = profit_today;
            }
        }
        System.out.println(profit);
    }

}
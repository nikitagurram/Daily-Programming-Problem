package Day83;

public class buy_two_chocolates {
    public static void main(String[] args) {
        int res = Integer.MAX_VALUE;
        int money = 3;
        int prices[] = { 1, 2, 2 };

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int sum = prices[i] + prices[j];
                res = Math.min(sum, res);
            }
        }
        if (money - res >= 0)
            System.out.println(money - res);
        else
            System.out.println(money);
        // int leftMoney=money;
        // Arrays.sort(prices);
        // for(int i=0;i<2;i++){
        // if(prices[i]>leftMoney) return money;
        // leftMoney-=prices[i];
        // }
        // return leftMoney;
    }
}

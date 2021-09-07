package coding;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStockMultiple {

    public static void main(String[] args) {

        System.out.println(new int[]{7,1,5,3,6,4});
    }

    public static int maxProfit(int[] prices) {

        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }
}

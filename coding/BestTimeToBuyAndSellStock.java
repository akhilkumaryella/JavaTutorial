package coding;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {

        int profit = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {

            profit = Math.max((prices[i] - min), profit);
            min = Math.min(prices[i], min);
        }

        return profit;
    }
}

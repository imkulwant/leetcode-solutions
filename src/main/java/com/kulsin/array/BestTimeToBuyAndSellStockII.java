package com.kulsin.array;

/**
 * 122. Best Time to Buy and Sell Stock II
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii">...</a>
 */
public class BestTimeToBuyAndSellStockII {

    /**
     * Runtime: 1ms
     * Memory: 45.38MB
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

}

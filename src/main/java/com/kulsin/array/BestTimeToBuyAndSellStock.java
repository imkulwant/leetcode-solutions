package com.kulsin.array;

/**
 * 121. Best Time to Buy and Sell Stock
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">...</a>
 */
public class BestTimeToBuyAndSellStock {

    /**
     * Runtime: 2ms
     * Memory: 61.85MB
     */
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int left = 1; left < prices.length; left++) {

            maxProfit = Math.max(maxProfit, prices[left] - minPrice);

            minPrice = Math.min(minPrice, prices[left]);

        }

        return maxProfit;

    }

}

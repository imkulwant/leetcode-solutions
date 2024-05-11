package com.kulsin.arrays;

/**
 * 122. Best Time to Buy and Sell Stock II
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii">...</a>
 */
public class BestTimeToBuyAndSellStockII {

    /**
     * Runtime: 
     * Memory: 
     */
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i< prices.length ; i++) {
            if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
                minPrice = prices[i];
                
            }
        }

    }

}

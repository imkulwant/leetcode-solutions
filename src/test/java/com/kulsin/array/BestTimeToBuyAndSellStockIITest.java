package com.kulsin.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockIITest {

    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    /**
     * 
     * Example 1:
     * 
     * Input: prices = [7,1,5,3,6,4]
     * Output: 7
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit =
     * 5-1 = 4.
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 =
     * 3.
     * Total profit is 4 + 3 = 7.
     * 
     */
    @Test
    void test1() {
        int[] inputPrices = new int[] { 7, 1, 5, 3, 6, 4 };
        Assertions.assertEquals(7, solution.maxProfit(inputPrices));
    }

    /**
     * 
     * Example 2:
     * 
     * Input: prices = [1,2,3,4,5]
     * Output: 4
     * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit =
     * 5-1 = 4.
     * Total profit is 4.
     * 
     */
    @Test
    void test2() {
        int[] inputPrices = new int[] { 1, 2, 3, 4, 5 };
        Assertions.assertEquals(4, solution.maxProfit(inputPrices));
    }

    /**
     * 
     * Example 3:
     * 
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: There is no way to make a positive profit, so we never buy the
     * stock to achieve the maximum profit of 0.
     * 
     */
    @Test
    void test3() {
        int[] inputPrices = new int[] { 7, 6, 4, 3, 1 };
        Assertions.assertEquals(0, solution.maxProfit(inputPrices));
    }

}
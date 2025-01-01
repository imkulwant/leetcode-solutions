package com.kulsin.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    /**
     * 
     * Example 1:
     * 
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
     * 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you
     * must buy before you sell.
     * 
     */
    @Test
    void test1() {
        int[] inputPrices = new int[] { 7, 1, 5, 3, 6, 4 };
        Assertions.assertEquals(5, solution.maxProfit(inputPrices));
    }

    /**
     * 
     * Example 2:
     * 
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transactions are done and the max profit = 0.
     * 
     */
    @Test
    void test2() {
        int[] inputPrices = new int[] { 7, 6, 4, 3, 1 };
        Assertions.assertEquals(0, solution.maxProfit(inputPrices));
    }

}
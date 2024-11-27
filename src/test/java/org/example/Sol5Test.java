package org.example;

import java.util.*;
import java.lang.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Sol5Test {

    private final Sol5 solution = new Sol5();

    @Test
    public void testMaxProfitEmptyArray() {
        int[] prices = {};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    public void testMaxProfitSingleElement() {
        int[] prices = {5};
        assertEquals(0, solution.maxProfit(prices)); // No transactions possible
    }

    @Test
    public void testMaxProfitTwoElementsNoProfit() {
        int[] prices = {5, 2};
        assertEquals(0, solution.maxProfit(prices)); // No profit, prices are decreasing
    }

    @Test
    public void testMaxProfitTwoElementsProfit() {
        int[] prices = {2, 5};
        assertEquals(3, solution.maxProfit(prices)); // Buy at 2, sell at 5
    }

    @Test
    public void testMaxProfitAllSamePrices() {
        int[] prices = {3, 3, 3, 3, 3};
        assertEquals(0, solution.maxProfit(prices)); // No profit can be made
    }

    @Test
    public void testMaxProfitDecreasingPrices() {
        int[] prices = {9, 7, 5, 3, 1};
        assertEquals(0, solution.maxProfit(prices)); // No profit, prices are always decreasing
    }

    @Test
    public void testMaxProfitIncreasingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, solution.maxProfit(prices)); // Buy at 1, sell at 5 (profit = 4)
    }

    @Test
    public void testMaxProfitWithMultipleTransactions() {
        int[] prices = {3, 2, 6, 5, 0, 3};
        assertEquals(7, solution.maxProfit(prices)); // Buy at 2, sell at 6, buy at 0, sell at 3
    }

    @Test
    public void testMaxProfitWithEarlyHighAndLow() {
        int[] prices = {10, 22, 5, 75, 65, 80};
        assertEquals(87, solution.maxProfit(prices)); // Buy at 5, sell at 75, buy at 65, sell at 80
    }

    @Test
    public void testMaxProfitExactTwoTransactions() {
        int[] prices = {1, 2, 4, 2, 5, 7, 2, 4, 9, 0};
        assertEquals(13, solution.maxProfit(prices)); // Buy at 1, sell at 4, buy at 2, sell at 9
    }

    @Test
    public void testMaxProfitNoProfit() {
        int[] prices = {5, 4, 3, 2, 1};
        assertEquals(0, solution.maxProfit(prices)); // No profit, prices are strictly decreasing
    }

    @Test
    public void testMaxProfitLargeInput() {
        int[] prices = new int[100000];
        for (int i = 0; i < 100000; i++) {
            prices[i] = (i % 1000); // Create a repeating pattern of stock prices
        }
        // The result will depend on the pattern, but we just check the result is >= 0 (no exceptions thrown)
        assertTrue(solution.maxProfit(prices) >= 0);
    }
}


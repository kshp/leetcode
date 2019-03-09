package com.pk.leetcode.recursion_dp;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BestTimeToBuyAndSellStock_121Test {

    private static int[] input1 = {7, 1, 5, 3, 6, 4};
    private static int result1 = 5;

    private static int[] input2 = {7, 6, 4, 3, 1};
    private static int result2 = 0;

    private static int[] input3 = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97};
    private static int result3 = 43;

    @Test
    public void maxProfit() {
        BestTimeToBuyAndSellStock_121 instance = new BestTimeToBuyAndSellStock_121();
        assertEquals(result1, instance.maxProfit(input1));
        assertEquals(result2, instance.maxProfit(input2));
        assertEquals(result3, instance.maxProfit(input3));

        assertEquals(result1, instance.maxProfit1(input1));
        assertEquals(result2, instance.maxProfit1(input2));
        assertEquals(result3, instance.maxProfit1(input3));

        assertEquals(result1, instance.maxProfit_Kadane(input1));
        assertEquals(result2, instance.maxProfit_Kadane(input2));
        assertEquals(result3, instance.maxProfit_Kadane(input3));

        assertEquals(result1, instance.maxProfit_DivideAndConquer(input1));
        assertEquals(result2, instance.maxProfit_DivideAndConquer(input2));
        assertEquals(result3, instance.maxProfit_DivideAndConquer(input3));
    }
}
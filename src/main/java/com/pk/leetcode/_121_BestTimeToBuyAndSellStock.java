package com.pk.leetcode;

public class _121_BestTimeToBuyAndSellStock {

    //O(n*n) time complexity
    public int maxProfit(int[] prices) {
        int result = 0;
        int buyIndex = 0;
        int sellIndex = buyIndex + 1;

        while (sellIndex < prices.length) {
            while (sellIndex < prices.length) {
                int buyPrice = prices[buyIndex];
                int sellPrice = prices[sellIndex];
                if (buyPrice < sellPrice && (sellPrice - buyPrice) > result)
                    result = sellPrice - buyPrice;
                sellIndex++;
            }
            buyIndex++;
            sellIndex = buyIndex + 1;
        }
        return result;
    }

    //O(n) time complexity
    public int maxProfit1(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (maxProfit < prices[i] - minPrice)
                maxProfit = prices[i] - minPrice;
        }

        return maxProfit;
    }

    //Kadane's Algorithm O(n) time complexity
    public int maxProfit_Kadane(int[] prices) {
        int maxCur = 0;
        int maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    //Divide and Conquer technique O(n log n) time complexity
    public int maxProfit_DivideAndConquer(int[] prices) {
        int[] diff = new int[prices.length + 1];
        for (int i = 1; i < prices.length; i++) {
            diff[i] = prices[i] - prices[i - 1];
        }
        return findMaximumSubArraySum(diff, 0, prices.length - 1);
    }

    private int findMaximumSubArraySum(int[] arr, int low, int high) {
        if (low == high)
            return arr[low];
        int mid = (low + high) / 2;
        int leftSum = findMaximumSubArraySum(arr, low, mid);
        int rightSum = findMaximumSubArraySum(arr, mid + 1, high);
        int crossingSum = findMaximumCrossingSubarraySum(arr, low, mid, high);

        return Math.max(Math.max(leftSum, rightSum), crossingSum);
    }

    private int findMaximumCrossingSubarraySum(int[] arr, int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += arr[i];
            if (sum > leftSum)
                leftSum = sum;
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += arr[i];
            if (sum > rightSum)
                rightSum = sum;
        }
        return leftSum + rightSum;
    }


}

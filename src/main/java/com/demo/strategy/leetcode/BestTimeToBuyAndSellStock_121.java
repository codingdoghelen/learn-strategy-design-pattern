package com.demo.strategy.leetcode;

public class BestTimeToBuyAndSellStock_121 {

    public static void main(String[] args) {
//        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
//        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
//        System.out.println(maxProfit(new int[]{1,2}));
        System.out.println(maxProfit(new int[]{2, 1, 4}));

    }

    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i=1; i < prices.length;i++) {
            if (prices[i] < buyPrice ) {
                buyPrice = prices[i];
            } else {
                int currentProfit = prices[i] - buyPrice;

                profit = Math.max(currentProfit, profit);
            }
        }

        return profit;
    }
}

package com.demo.strategy.leetcode;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfScores_1984 {
    public static void main(String[] args) {
//        System.out.println(minimumDifference(new int[]{9, 4, 1, 7}, 2));
        System.out.println(minimumDifference(new int[]{87063,61094,44530,21297,95857,93551,9918}, 6));

    }

    public static int minimumDifference(int[] nums, int k) {
        if (nums.length < 2) return 0;

        Arrays.sort(nums);

        int difference = Integer.MAX_VALUE;
        int x = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length-k; i++) {
            int low = nums[i];
            int high = nums[i+k-1];

            difference = Math.abs(high - low);
            x = Math.min(x, difference);

        }
        return x;
    }

}

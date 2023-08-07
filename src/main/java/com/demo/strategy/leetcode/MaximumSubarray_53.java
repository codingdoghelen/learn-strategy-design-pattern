package com.demo.strategy.leetcode;

public class MaximumSubarray_53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); // The subarray [4,-1,2,1] has the largest sum 6.
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8})); // The subarray [5,4,-1,7,8] has the largest sum 23.
        System.out.println(maxSubArray(new int[]{1})); // The subarray [5,4,-1,7,8] has the largest sum 23.

    }

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int n : nums) {
            sum+=n;
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;

        }

        return max;
    }
}

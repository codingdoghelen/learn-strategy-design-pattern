package com.demo.strategy.leetcode;

public class MinimumSizeSubarraySum_209 {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen(4, new int[]{1,4,4}));
        System.out.println(minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));

    }

    public static int minSubArrayLen(int target, int[] nums) {

        // Sliding window
        // For loop
        // While loop
        // Sum
        // min/max -> min
        // Left =0, Right =0
        // right - left + 1

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum = sum - nums[left];
                left++;
            }

        }

        return min == Integer.MAX_VALUE ? 0 : min;

    }

}

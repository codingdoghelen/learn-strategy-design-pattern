package com.demo.strategy.leetcode;

public class maxSumSub {
    public static void main(String[] args) {
        System.out.println(maxSumSub(new int[]{-3, 3, 1, -3, 2, 4, 7}, 3));
        System.out.println(findSumMaxSubArrayOfSizeK(new int[]{-3, 3, 1, -3, 2, 4, 7}, 3));


    }

    public static int maxSumSub(int[] nums, int n) {

        int maxSum = 0;
        int windowSum;

        if (n >= nums.length) return 0;

        for (int i = 0; i < n; i++) {
            maxSum += nums[i];
        }

        windowSum = maxSum;

        for (int i = n; i < nums.length; i++) {

            windowSum += nums[i] - nums[i - n];
            maxSum = Math.max(maxSum, windowSum);

        }

        return maxSum;

    }


    public static int findSumMaxSubArrayOfSizeK(int[] nums, int k) {

        int maxSum = 0;
        int windowStart = 0;
        int windowSum = 0;


        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {

            windowSum += nums[windowEnd];

            // if meet window size then update sum and slide the window
            if (windowEnd - windowStart + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - nums[windowStart];
                windowStart++;

            }


        }
        return maxSum;

    }

}

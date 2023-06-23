package com.demo.strategy.leetcode;

public class ThirdMaximumNumber_414 {
    public static void main(String[] args) {
//        System.out.println(thirdMax(new int[]{3, 2, 1})); // 1
//        System.out.println(thirdMax(new int[]{1,2})); // 2
//        System.out.println(thirdMax(new int[]{2,2,3,1})); // 1
//        System.out.println(thirdMax(new int[]{1,1,2})); // 2
//        System.out.println(thirdMax(new int[]{1,2,2,5,3,5})); // 2
        System.out.println(thirdMax(new int[]{1, 1, 1})); // 1

//        System.out.println();                  // [3,2,1]
    }

    public static int thirdMax(int[] nums) {
        if (nums.length < 2) return nums[0];
        if (nums.length < 3) return Math.max(nums[0], nums[1]);

        long firstMax = Long.MIN_VALUE,secondMax = Long.MIN_VALUE,thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax) {
                thirdMax = num;
            }
        }

        return (int) (thirdMax == Long.MIN_VALUE ? firstMax : thirdMax);
    }
}
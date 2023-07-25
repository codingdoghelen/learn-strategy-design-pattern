package com.demo.strategy.leetcode;

public class HeightChecker {

    public static void main(String[] args) {

//        System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));

        System.out.println(heightChecker(new int[]{5, 1, 2, 3, 4}));
        System.out.println(heightChecker(new int[]{1, 2, 3, 4, 5}));

//        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1})); // 2

    }

    public static int heightChecker(int[] heights) {

        int length = heights.length;
        int[] expected = new int[length];
        int max = 0;
        int min = 0;

        for (int h : heights) {
            max = Math.max(max, h);
            min = Math.min(min, h);
        }

        int[] counts = new int[max+1];

        // ** i <= counts.length
        // ** you need to loop through heights not counts becoz will cause array in-bounce issue
        for (int i = 0; i < heights.length; i++) {
            counts[heights[i]] += 1;
        }


        // ** i needs to be 1
        for (int i = 1; i < counts.length; i++) {  // [0, 3, 4, 4, 5]
            counts[i] += counts[i - 1];
        }


        for (int i = length - 1; i >= 0; i--) {
            // ** counts[heights[i]] - 1
            expected[counts[heights[i]] - 1] = heights[i];
            counts[heights[i]]--;

        }

        int notEqualsCounter = 0;

        for (int i = 0; i < length; i++) {
            if (heights[i] != expected[i]) notEqualsCounter++;
        }


        return notEqualsCounter;
    }
}

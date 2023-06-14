package com.demo.strategy.leetcode;

import java.util.Arrays;

public class HeightChecker_1051 {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));

    }

    public static int heightChecker(int[] heights) {
        int[] expected = heights;

//        int[] expected = new int[heights.length];

        int incorrectOrder = 0;
        Arrays.sort(expected);
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) {incorrectOrder++;}
        }
        return incorrectOrder;
//        for (int i = 0; i < expected.length; i++) {
//
//            System.out.println(expected[i]);
//        }
//
//        return expected.length;

    }
}

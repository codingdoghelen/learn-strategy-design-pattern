package com.demo.strategy.leetcode;

import java.util.Arrays;

public class TwoSum2InputArrayIsSorted_167 {

    public static void main(String[] args) {
        System.out.println(twoSums(new int[]{2, 7, 11, 15}, 9));
        System.out.println(twoSums(new int[]{2, 3, 4}, 6));
        System.out.println(twoSums(new int[]{-1, 0}, -1));

    }

    public static int[] twoSums(int[] numbers, int target) {

        // Two pointers
        // One at start, one at the end
        // Keep checking if start + end == target

        int left = 0;
        int right = numbers.length - 1;

        int numberLeft = 0;
        int numberRight = 0;

        while (left <= right) {
            numberLeft = numbers[left];
            numberRight = numbers[right];

            if (numberLeft + numberRight == target) break;

            if ((numberLeft + numberRight) > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{left + 1, right + 1};
    }


}

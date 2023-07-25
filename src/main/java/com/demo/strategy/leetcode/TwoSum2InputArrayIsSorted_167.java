package com.demo.strategy.leetcode;

public class TwoSum2InputArrayIsSorted_167 {

    public static void main(String[] args) {
        System.out.println(twoSums(new int[]{2, 7, 11, 15}, 9));
    }

    public static int twoSums(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;


        while (left <= right) {

            if (target > numbers[mid]) {
                left = mid + 1;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                return mid;

            }

        }
        return -1;
    }


}

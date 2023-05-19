package com.demo.strategy.leetcode;

public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {

//        System.out.println(com.demo.strategy.leetcode.RunningSumOf1dArray_1480(new int[]{1,2,3,4})); // [1,3,6,10]
//        System.out.println(com.demo.strategy.leetcode.RunningSumOf1dArray_1480(new int[]{1,1,1,1,1})); // [1,2,3,4,5]
//        System.out.println(com.demo.strategy.leetcode.RunningSumOf1dArray_1480(new int[]{3,1,2,10,1})); // [3,4,6,16,17]


        System.out.println(RunningSumOf1dArrayWithOneLineCode(new int[]{1, 2, 3, 4})); // [1,3,6,10]
        System.out.println(RunningSumOf1dArrayWithOneLineCode(new int[]{1, 1, 1, 1, 1})); // [1,2,3,4,5]
        System.out.println(RunningSumOf1dArrayWithOneLineCode(new int[]{3, 1, 2, 10, 1})); // [3,4,6,16,17]

    }

    private static int[] RunningSumOf1dArray(int[] nums) {
        int counter = 0;
        int sum = 0;
        int[] sumArray = new int[nums.length];

        while (counter < nums.length) {
            sum += nums[counter];
            sumArray[counter] = sum;
            counter += 1;
        }
        return sumArray;
    }


    private static int[] RunningSumOf1dArrayWithOneLineCode(int[] nums) {

        int[] sumArray = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumArray[i] = sum;
        }
        return sumArray;

    }
}

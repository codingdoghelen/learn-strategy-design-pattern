package com.demo.strategy.leetcode;

import java.util.Arrays;

public class Move_Zeroes_283 {

    public static void main(String[] args) {
//        moveZeroes(new int[]{3, 2, 2, 3});
//        moveZeroes(new int[]{0});
        System.out.println(Arrays.toString( moveZeroes(new int[]{0,1,0,3,12})));

    }

    public static int[] moveZeroes(int[] nums) {
        // Two pointers
        // Think: what if move all numbers in the front
        // num[i] != num[x]
        // Need to swap?
        if (nums.length <= 1) {
            return nums;
        }

        int j=0;
        int temp;
        for (int i=0; i< nums.length;i++){

            if (nums[i] != 0){
                temp = nums[j]  ;
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }


}

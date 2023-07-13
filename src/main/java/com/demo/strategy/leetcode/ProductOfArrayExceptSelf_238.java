package com.demo.strategy.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
//        System.out.println(productExceptSelf(new int[]{1, 2, 3, 4}));
        System.out.println(productExceptSelf(new int[]{-1,1,0,-3,3}));

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] rightRes = new int[nums.length];
        int[] leftRes = new int[nums.length];
        int[] res = new int[nums.length];

        // 0 0 -9 3 1
        leftRes[0]=1;
        for (int i = 1; i < nums.length; i++) {
            leftRes[i] = leftRes[i-1] * nums[i-1];
        }

        // 1 -1 -1 0 0
        rightRes[nums.length-1] =1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightRes[i] = rightRes[i+1] * nums[i+1];
        }

        for (int i=0; i< nums.length;i++){
            res[i] = leftRes[i] * rightRes[i];
        }

        return res;
    }
}

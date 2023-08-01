package com.demo.strategy.leetcode;

public class ConcatenationOfArray_1929 {
    public static void main(String[] args) {

        System.out.println(getConcatenation(new int[]{1, 2, 1}));
        System.out.println(getConcatenation(new int[]{1,3,2,1}));

    }

    public static int[] getConcatenation(int[] nums) {



        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;


//
//        int[] ans = new int[nums.length * 2];
//
//        for (int i = 0; i < ans.length; i++) {
//            if (i >= nums.length) {
//                ans[i] = nums[i - nums.length];
//            } else {
//                ans[i] = nums[i];
//            }
//        }
//
//
////        for (int i = 0; i < ans.length; i++) {
////            System.out.println(ans[i]);
////        }
//        return ans;
    }



}

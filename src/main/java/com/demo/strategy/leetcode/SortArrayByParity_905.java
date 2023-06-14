package com.demo.strategy.leetcode;

public class SortArrayByParity_905 {

    public static void main(String[] args) {
        System.out.println(sortArrayByParity(new int[]{3,1,2,4}));

    }

    public static int[] sortArrayByParity(int[] nums) {

        int j =0;
        for (int i=0; i< nums.length;i++){

            if (nums[i] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }


        }


//        for (int i=0; i< nums.length;i++) {
//            System.out.println(nums[i]);
//        }
        return nums;

    }

}

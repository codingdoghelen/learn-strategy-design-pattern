package com.demo.strategy.leetcode;

public class RemoveElement_27 {

    public static void main(String[] args) {
        removeElement(new int[]{3, 2, 2, 3}, 3);
    }

    public static int removeElement(int[] nums, int val) {
        // Two pointers

        if (nums.length <= 0) return 0;

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}

package com.demo.strategy.leetcode;

public class RemoveDuplicatesFromSortedArrayII_80 {
    public static void main(String[] args) {
//        removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}); // 1 1 2 2 3

        removeDuplicates2(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}); // 1 1 2 2 3

    }

    public static int removeDuplicates2(int[] nums) {

        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 2] != nums[i]) {
                nums[j++] = nums[i];
//                j++;
            }
        }
        return j;
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }

        return i;

    }

}

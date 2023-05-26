package com.demo.strategy.leetcode;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
//        removeDuplicates(new int[]{1,1,2}); // 2
        removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}); // 5

        // i=2 1 j=0

    }

    public static int removeDuplicates(int[] nums) {
        // Two pointers
        if (nums.length <= 0) return 0;

        int j = 1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[j - 1]) {

                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}


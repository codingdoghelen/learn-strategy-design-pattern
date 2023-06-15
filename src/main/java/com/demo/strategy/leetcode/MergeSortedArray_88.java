package com.demo.strategy.leetcode;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
//        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
//        merge(new int[]{1}, 1, new int[]{}, 0);
//        merge(new int[]{0}, 0, new int[]{1}, 1);
//        merge(new int[]{2, 0}, 1, new int[]{1}, 1);
        merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Sort
        // Merge sort
        // Array
        // while loop
        // two-pointers
        // Difficult part: when nums2 numbers are all smaller than nums1
        // Need to have a while loop to place the numbers in front of nums1

        // Time Complexity: O(n)
        // Space Complexity O(1)


        int lastIndex = m + n - 1;

        while (lastIndex > 0 && m > 0 && n > 0) {

            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[lastIndex] = nums2[n - 1];
                n--;
            } else {
                nums1[lastIndex] = nums1[m - 1];
                m--;
            }
            lastIndex--;
        }

        // If num2 is less then num1 then need a while loop and put all the figures in beginning of num1
        while (n > 0) {

            // n = 3, 1 2 3
            nums1[n - 1] = nums2[n - 1];
            n--;

        }


        for (int x = 0; x < nums1.length; x++) {
            System.out.println(nums1[x]);
        }

    }
}

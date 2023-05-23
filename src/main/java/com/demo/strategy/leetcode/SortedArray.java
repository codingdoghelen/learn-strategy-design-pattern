//package com.demo.strategy.leetcode;
//
//public class SortedArray {
//
//
//    public static void main(String[] args) {
//
//        System.out.println(sortedArray(new int[]{10, 5, 0, 3, 9}));
////        System.out.println(sortedArray(new int[]{-7, -3, 2, 3, 11})); // [4,9,9,49,121]
//
//    }
//
//    public static int[] sortedArray(int[] numsArray) {
//
//        // Sorting
//        // Two pointers
//
//        int i = 0; // Starting point
//        int j = numsArray.length - 1; // Ending point
//
//        int lastIndex = numsArray.length - 1;
//        int temp;
//
//        while (i <= j) {
//
//            if (numsArray[0] > numsArray[j]) {
//                temp = numsArray[j];
//                numsArray[lastIndex] = numsArray[i];
//                numsArray[0] = temp;
//                //i++; // When you move i to last index, take away the i
//                j--;
//            } else {
//                numsArray[lastIndex] = numsArray[j];
////                j--;
//
//            }
//
//            lastIndex--;
//
//        }
//
//        for (int x = 0; x < numsArray.length; x++) {
//            System.out.println(numsArray[x]);
//        }
//        return numsArray;
//
//    }
//
//
//}

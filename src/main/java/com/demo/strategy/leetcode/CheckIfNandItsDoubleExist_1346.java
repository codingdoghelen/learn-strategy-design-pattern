package com.demo.strategy.leetcode;

import java.util.*;

public class CheckIfNandItsDoubleExist_1346 {


    public static void main(String[] args) {
//        System.out.println(checkIfExist(new int[]{10, 2, 5, 3})); // True
//        System.out.println(checkIfExist(new int[]{3, 1, 7, 11})); // false
//        System.out.println( checkIfExist(new int[]{7, 1, 14, 11})); // True

        // i = 10; j = 2; 10 == 2 * 2 ? NO
        // i = 10; j = 5; 10 == 2 * 5 ? Yes
        System.out.println(checkIfExistBinarySearch(new int[]{10, 2, 5, 3})); // True
        System.out.println(checkIfExistBinarySearch(new int[]{3, 1, 7, 11})); // false
        System.out.println(checkIfExistBinarySearch(new int[]{7, 1, 14, 11})); // True

    }

    public static boolean checkIfExist(int[] arr) {
//        i != j
//        0 <= i, j < arr.length
//        arr[i] == 2 * arr[j]
        // while loop = brute force = time complexity is o(n^2)

        if (arr.length <= 1) return false;

        int i = 0, j = arr.length - 1;

        while (j >= 0 && i < arr.length - 1) {
            // Check if i==j, if equals, that means j need to drop by 1,
            // but if j is 0 -1 then will be -1
            // so we use a for loop to control j not to fall under 0
            if (i == j && i > 0) {
                j = i - 1;
            } else if (i == j && i == 0) {
                j = 0;
            }

            if (arr[i] == 2 * arr[j]) {
                return true;
            } else {
                j--;
            }

            if (j < 0) {
                i++;
                j = arr.length - 1;
            }

        }
        return false;
    }

    public static boolean checkIfExistBinarySearch(int[] arr) {
//        i != j
//        0 <= i, j < arr.length
//        arr[i] == 2 * arr[j]

        Arrays.sort(arr);
        if (arr.length <= 1) return false;
        for (int i = 0; i < arr.length; i++) {

            int result = binarySearch(arr, arr[i] * 2);

            if (result != i && result != -1) {
                return true;
            }
        }
        return false;
    }


    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
//            int target = 2 * arr[i];

            if (target > arr[mid]) {
//                mid++;
//                end -= 1;
                start = mid+1;


            } else if (target < arr[mid]) {
//                mid--;
//                start += 1;

                end = mid-1;

            } else {
                return mid;
            }
        }
        return -1;
    }

}

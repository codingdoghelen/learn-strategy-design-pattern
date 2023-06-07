package com.demo.strategy.leetcode;

public class ValidMountainArray_941 {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
        System.out.println( validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0}));

    }

    public static boolean validMountainArray(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        int i = 0;
        int j = arr.length - 1;

        for (i = 1; i < arr.length; i++) {
            if (arr[i-1] >= arr[i]) {
                i-=1;
                break;
            }
        }

        while (j > 0 && (arr[j] < arr[j - 1])) {
            j-=1;
        }

        if (i==0 || j==0  ) return false;

        return i==j;
    }
}

package com.demo.strategy.leetcode;

public class SquaresOfASortedArray_977 {

    public static void main(String[] args) {

        System.out.println(sortedSquares(new int[]{-4, -1, 0, 3, 10})); // [0,1,9,16,100]
        System.out.println(sortedSquares(new int[]{-7, -3, 2, 3, 11})); // [4,9,9,49,121]

    }

    public static int[] sortedSquares(int[] nums) {
        // Array
        // Sorted
        // Two pointers

        int[] squaredNumArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int squaredNumber = nums[i] * nums[i];
            squaredNumArray[i] = squaredNumber;
        }

        // Simple sorting dont care abt time complexity:
        // Use 2 for-loops j=i+1 and
        // a temp value = i
        for (int i = 0; i < squaredNumArray.length; i++) {

            for (int j = i + 1; j < squaredNumArray.length; j++) {
                int temp = 0;

                if (squaredNumArray[i] > squaredNumArray[j]) {
                    temp = squaredNumArray[i];
                    squaredNumArray[i] = squaredNumArray[j];
                    squaredNumArray[j] = temp;
                }
            }
        }

//        for (int i=0;i<squaredNumArray.length;i++) {
//            System.out.println(squaredNumArray[i]);
//        }
        return squaredNumArray;
    }

}

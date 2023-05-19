package com.demo.strategy.binarySearch;

public class BinarySearch {

    public static void main(String[] args) {


    }

    private static int binarySearch(int[] list, int numberToFind) {

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int middleNumberPosition = (low + high) / 2;
            int middleNumber = list[middleNumberPosition];

            if (middleNumber == numberToFind) return middleNumberPosition;

            if (numberToFind < middleNumber) {
                // Search left side
                high = middleNumberPosition - 1; // Need to minus one becoz needs to reduce the middle index as well
            } else if (numberToFind > middleNumber) {
                // Search right side
                low = middleNumberPosition + 1;
            }
        }

        return -1;

    }

}

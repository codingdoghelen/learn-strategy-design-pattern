package com.demo.strategy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSteps_1342 {
    public static void main(String[] args) {

        System.out.println(numberOfSteps(14)); // 6

        System.out.println(numberOfSteps(8)); // 4

        System.out.println(numberOfSteps(123)); // 12

    }

    public static int numberOfSteps(int num) {

        // Time Complexity: O(logn)
        // Space Complexity: O(1)

        int numOfSteps = 0;

        while (num > 0) {

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num-=1;
            }

            numOfSteps++;
        }
        return numOfSteps;

    }


}


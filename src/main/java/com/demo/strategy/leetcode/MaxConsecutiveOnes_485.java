package com.demo.strategy.leetcode;

public class MaxConsecutiveOnes_485 {
    public static void main(String[] args) {

        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1})); // 3

        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1})); // 2


    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        // array // for loop
        // counter
        // max
        // Time complexity: O(n)
        // Space complexity: O(1)

        int counter = 0;
        int maxCount = 0;

        for(int i=0; i<nums.length;i++){
            if (nums[i] == 1 ){
                counter +=1;
                maxCount=  Math.max(maxCount, counter);
            } else if (nums[i] ==0){
                counter = 0;
            }
        }

        return maxCount;
    }

}


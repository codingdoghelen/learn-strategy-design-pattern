package com.demo.strategy.leetcode;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
//        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
//        System.out.println(maxArea(new int[]{1, 8, 6, 2, 0, 0, 0, 0, 0}));
//        System.out.println(maxArea(new int[]{1, 1}));
//        System.out.println(maxArea(new int[]{1,2,4,3}));
//        System.out.println(maxArea(new int[]{1,0,0,0,0,0,0,2,2}));
//        System.out.println(maxArea(new int[]{1,3,2,5,25,24,5}));

    }

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;


        int maxArea = 0;
        while (left <= right && right < height.length) {

            int bottom = right - left;
            int h = Math.min(height[left], height[right]);
            int area = bottom * h;
            maxArea = Math.max(maxArea, area);

            if (height[left] > height[right]) {
                right--;

            } else {
                left++;

            }

        }
        return maxArea;

    }

}

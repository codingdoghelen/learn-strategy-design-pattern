package com.demo.strategy.leetcode;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
//        System.out.println(maxArea(new int[]{1, 8, 6, 2, 0, 0, 0, 0, 0}));
//        System.out.println(maxArea(new int[]{1, 1}));
//        System.out.println(maxArea(new int[]{1,2,4,3}));

    }

    public static int maxArea(int[] height) {

        if (height.length <= 2) return  Math.min(height[1], height[0]);

        int left = 0;
//        int right = height.length - 1;
        int right = left + 1;

        int point1 = height[left];

        int maxSum = 0;
        while (left <= right && right < height.length) {

            int point2 = height[right];


            point1 = Math.max(point1, height[left]);
//            point2 = Math.max(point2,height[right]);

            int bottom = right - left ;
            int h = Math.min(point1, point2);
            int sum = bottom * h;
            maxSum = Math.max(maxSum, sum);

            if (height[left] == point1 && maxSum==0 ) { // TODO
//                right--;
//                else if (sum < maxSum){
                left++;
                right++;

            }
//            else if (height[left] <= point1) {
//                left++;
//                right++;
//            }
            else {
                right++;

            }
        }
//        System.out.println(point1);
//        System.out.println(point2);

        return maxSum;
    }
}

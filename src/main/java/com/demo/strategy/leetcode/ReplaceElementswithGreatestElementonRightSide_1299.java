package com.demo.strategy.leetcode;

public class ReplaceElementswithGreatestElementonRightSide_1299 {
    public static void main(String[] args) {
        System.out.println(replaceElements(new int[]{17, 18, 5, 4, 6, 1})); // 2

    }


    public static int[] replaceElements(int[] arr) {
        // Two pointers

        if (arr.length <= 1) return new int[]{-1};


        int j = 1;
        int tempGreatestIndex =0;
        int tempGreatest =0;

        for (int i = 0; i  < arr.length ; i++) {



            while (j>i && j < arr.length-1 ) {
                if(arr[j] > tempGreatestIndex) {
                    tempGreatestIndex=j-1;
                }
                j++;

            }

            System.out.println(tempGreatestIndex);
//
//            System.out.println(j);

//            if(i== arr.length-1) {
//                arr[i] = -1;
//            }
//

//            if (arr[i] < arr[j]){
                arr[i] = arr[tempGreatestIndex];
            arr[i+1] = arr[i+2];
//            if(  i + 1 < arr.length-1) {
//
//                arr[i+1] = arr[i+2];
//            } else {
//                arr[i+1] = -1;
//            }



//            if(i== arr.length-1) {
//                arr[i] = -1;
//            }else if ( arr[j] < arr[i]) {
////                arr[i] = arr[j];
//                j+=1;
//            }  else if ( arr[j] > arr[i]) {
//                arr[i] = arr[j];
//                i+=1;
//            }  else {
//                arr[i]  = arr[i];
//            }
//
//            if (j < arr.length-1) {
//
//                j+=1;
//            }
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
        return arr;
    }
}

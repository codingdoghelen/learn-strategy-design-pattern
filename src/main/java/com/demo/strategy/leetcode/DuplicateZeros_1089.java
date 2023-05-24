package com.demo.strategy.leetcode;

public class DuplicateZeros_1089 {
    public static void main(String[] args) {
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0}); // [1,0,0,2,3,0,0,4]
//        duplicateZeros(new int[]{1, 2, 3}); // [1,2,3]
//        duplicateZeros(new int[]{0, 0, 0, 0, 0, 0, 0});
//        duplicateZeros(new int[]{8,4,5,0,0,0,0,7});

    }

     /*
        s = 0
        d = 0

        # Copy is performed until the destination array is full.
        for s in range(N):
           if source[s] == 0:
            # Copy zero twice.
            destination[d] = 0
            d += 1
            destination[d] = 0
           else:
            destination[d] = source[s]
            d += 1
*/

//        public static void duplicateZeros(int[] arr) {
//            int[] dup = new int[arr.length];
//            int j=0;
//            for (int i=0; i<= arr.length && j< dup.length;i++){
//                if (arr[i] == 0){
//                    dup[j] =0;
//                    j++;
//                    dup[j] =0;
//
//                } else {
//                    dup[j] = arr[i];
//                }
//
//
//                j++;
//            }
//
//
//
//}


    public static void duplicateZeros(int[] arr) {
        // Array
        // Two pointers
        // Create another pointer j
        // if it's 0, j+2

        int[] duplicateArr = new int[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length || j< arr.length; i++) {

            if (j >= duplicateArr.length) break;

            if (arr[i] != 0 ) {
                duplicateArr[j] = arr[i];
            } else if (arr[i] == 0 ) {
                duplicateArr[j] = 0;

                if (j < duplicateArr.length-1) {
                    duplicateArr[j + 1] = 0;
                    j++;
                }
            }
            j++;

        }


        for (int i = 0; i < duplicateArr.length; i++) {
            arr[i] = duplicateArr[i];
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
    }

}

//package com.devansh;
//import java.util.Arrays;
//import java.util.Scanner;
//public class MaxArray {
//    public static void main(String[] args) {
//        int[] array= {1,23,3};
//        System.out.println(max(array,1,2));
//    }
//    // range is specified
//    static int max(int[] arra,int start,int end){
//        int maxVal=arra[start];
//        for (int i = start; i <=end ; i++) {
//            if(arra[i]> maxVal) {
//                maxVal = arra[i];
//            }
//        }
//        return maxVal;
//    }
//
//}
//for specified given array
 package com.devansh;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int[] array= {1,23,3,4,8,45,4,8,8,5,14,8,5,5,4,74,7,788888};
        System.out.println(max(array));
    }
    static int max(int[] arra){
         int maxVal=arra[0];
        for (int i = 0; i <arra.length ; i++) {
            if(arra[i]> maxVal) {
                maxVal = arra[i];
            }
        }
        return maxVal;
    }

}


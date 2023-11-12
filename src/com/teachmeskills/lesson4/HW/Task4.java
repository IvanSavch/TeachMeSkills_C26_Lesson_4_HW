package com.teachmeskills.lesson4.HW;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        int[] array2 = new int[]{1,2,3,4,5,6,7,8,9};
        int sumArray = 0;
        int sumArray2 = 0;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            sumArray2 += array2[i];
        }
        sumArray = sumArray / array.length;
        sumArray2 = sumArray2 / array2.length;
        if (sumArray > sumArray2) {
            System.out.println("for array more");
        } else if (sumArray2 >sumArray) {
            System.out.println("for array2 more");
        }else System.out.println("equal");
    }
}

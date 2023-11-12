package com.teachmeskills.lesson4.HW.additionaltask;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i <= array.length; i = i +2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}

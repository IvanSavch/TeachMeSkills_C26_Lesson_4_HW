package com.teachmeskills.lesson4.HW.additionaltask;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[]{44, 22, 11, 991,2,2,3,43,22};
        int a;

        for (int i = 0; i < array.length- 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;

                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

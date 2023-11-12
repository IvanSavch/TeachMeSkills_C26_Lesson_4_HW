package com.teachmeskills.lesson4.HW;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("min " + array[0]);
        System.out.println("max " + array[array.length-1]);
        System.out.println("avg " + array[array.length/2]);
    }
}

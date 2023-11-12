package com.teachmeskills.lesson4.HW.additionaltask;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int length;
        int numbers;
        int counter = 0;
        while (true) {
            System.out.println("print length array");
            length = scanner.nextInt();
            if (length > 10 || length < 0) {
                System.out.println("wrong input");
            } else break;
        }
        int[] array1 = new int[length];
        while (counter < length) {
            System.out.println("print number array");
            numbers = scanner1.nextInt();
            array1[counter] = numbers;
            counter++;
        }

        int c = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                c++;
            } else array1[i - c] = array1[i];
        }
        int[] array2 = new int[array1.length - c];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}


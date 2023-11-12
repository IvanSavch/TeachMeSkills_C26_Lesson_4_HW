package com.teachmeskills.lesson4.HW;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredNumber = scanner.nextInt();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int length = array.length;
        int count = 0;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == requiredNumber) {
                count++;
            } else {
                array[i - count] = array[i];
            }
        }
        //Arrays.copyOf(array,length - count); не работает

        int[] newArray = new int[length - count];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        if (newArray.length == array.length) {
            System.out.println("number not found");
            System.out.println(Arrays.toString(newArray));
        } else {
            System.out.println(Arrays.toString(newArray));
        }
    }
}

package com.teachmeskills.lesson4.HW;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredNumber = scanner.nextInt();
        int count = 0;
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == requiredNumber) {
               count++;
            }
        }
        if (count == 0) {
            System.out.println("This number is not included in the array");
        }else {
            System.out.println("This number is included in the array");
        }
    }
}

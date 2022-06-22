package com.practice;

import java.util.Scanner;

public class task8_square {
    public static Scanner scanner = new Scanner(System.in);
    public static int size;
    public static void main(String[] args) {
        System.out.println("Enter the size of square, please:");
        size = scanner.nextInt();
        System.out.println("With for:");
        funcFOR();
        System.out.println("With while:");
        funcWHILE();
    }

    private static void funcFOR() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    private static void funcWHILE() {
        int i = 0;
        int j = 0;
        while (i < size) {
            while (j < size) {
                System.out.print(" * ");
                j++;
            }
            j = 0;
            System.out.println(" ");
            i++;
        }

    }
}

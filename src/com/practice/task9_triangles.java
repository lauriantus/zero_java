package com.practice;

import java.util.Scanner;

public class task9_triangles {
    public static Scanner scanner = new Scanner(System.in);
    public static int size;
    public static void main(String[] args) {
        System.out.println("Please, enter the size of triangle (0 < x > 40)");
        size = scanner.nextInt();
        part1();
        part2();
        part3();
        part4();
    }
    public static void part1() {
        int j;
        for (int i = 0; i < size; i++) {
            j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    public static void part2() {
        for (int i = size; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    public static void part3() {
        for (int i = 0; i < size; i++) {
            for ( int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = size - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    public static void part4() {
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}

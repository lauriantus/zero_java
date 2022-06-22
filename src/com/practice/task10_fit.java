package com.practice;

import java.util.Scanner;

public class task10_fit {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        fit
        System.out.println("Please, enter the high of fit:");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(" ");
            for (int j = size -1; j > i; j-- ) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i; j++) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
//        bot
    }
}

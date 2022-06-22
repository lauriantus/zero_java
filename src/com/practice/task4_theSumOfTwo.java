package com.practice;

import java.util.Scanner;

public class task4_theSumOfTwo {
    public static void main(String[] args) {
        int first, second;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number:");
        first = scanner.nextInt();
        System.out.println("Please, enter second number:");
        second = scanner.nextInt();
        int summary = first + second;
        System.out.println("Summary = " + summary);

    }
}

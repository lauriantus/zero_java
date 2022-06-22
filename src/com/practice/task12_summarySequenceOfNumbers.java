package com.practice;

import java.util.Scanner;

public class task12_summarySequenceOfNumbers {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int first, last, temp;
        System.out.println("Enter the number");
        first = scanner.nextInt();
        System.out.println("Enter the next number");
        last = scanner.nextInt();
        if (first > last) {
            temp = last;
            last = first;
            first = temp;
        }
        int summary = 0;
        for (int i = first; i <= last; i++) {
            summary += i;
        }
        System.out.println("Summary sequence of numbers = " + summary);

    }
}

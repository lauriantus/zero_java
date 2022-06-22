package com.practice;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class task11_theLargestEvenNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean stop = true;
        int largestNumber = MIN_VALUE;
        while (stop) {
            System.out.println("Please, enter the new number for condition:");
            int number = scanner.nextInt();
            if (largestNumber < number && number % 2 == 0 && number != 0) {
                largestNumber = number;
            } else if (number == 0) {
                stop = false;
            }
        }
        if (largestNumber > -2147483648) {
            System.out.println("The largest number from list -> " + largestNumber);
        } else {
            System.out.println("You not entered any even number");
        }
    }

}

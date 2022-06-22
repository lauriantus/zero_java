package com.practice;

import java.util.Scanner;

public class task3_theNextNumber {
    public static void main(String[] args) {
//        Спитати у людини число та вивести на консоль число на одиницю більше.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number:");
        int number = scanner.nextInt();
        number ++;
        System.out.println("New number:" + number);
    }
}

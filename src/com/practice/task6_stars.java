package com.practice;

import java.util.Scanner;

public class task6_stars {
    public static Scanner scanner = new Scanner(System.in);
    public static int i, size;

    public static void main(String[] args) {
        System.out.println("task1: 10 stars");
        System.out.println("task2: 1000 stars");
        System.out.println("task3: Need ask user how many stars need for its and use while");
        System.out.println("task4: Need ask user how many stars need for its and use for");
        System.out.println("Enter the number part of task, please(1-4):");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("You chosen part 1: 10 stars ");
                part1();
            case 2:
                System.out.println("You chosen part 2: 1000 stars ");
                part2();
            case 3:
                System.out.println("You chosen part 3: Need ask user how many stars need for its and use while");
                System.out.println("How many stars do you need?:");
                size = scanner.nextInt();
                part3();
            case 4:
                System.out.println("You chosen part 4: Need ask user how many stars need for its and use for");
                System.out.println("How many stars do you need?:");
                size = scanner.nextInt();
                part4();
        }
    }

    private static void part1() {
         i = 0;
        while (10 > i) {
            System.out.print(" * ");
            i++;
        }
    }

    private static void part2() {
         i = 0;
        while (1000 > i) {
            System.out.print(" * ");
            i++;
        }
    }

    private static void part3() {
         i = 0;
        while (size > i) {
            System.out.print(" * ");
            i++;
        }
    }

    private static void part4() {
        for (i = 0; size > i; i++) {
            System.out.print(" * ");
        }
    }
}

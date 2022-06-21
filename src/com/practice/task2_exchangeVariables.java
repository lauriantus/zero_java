package com.practice;

import java.util.Scanner;

public class task2_exchangeVariables {
    public static int first, second;
    public static void main(String[] args) {
        boolean flag = false;
        int select;
        Scanner scanner = new Scanner(System.in);
        do  {
            System.out.println("Please, select part of task(1-3):");
            select = scanner.nextInt();
        } while (select < 1 || select > 3);
        if (select > 0 && select < 4) {
            flag = true;
        }
        if (flag) {
            System.out.println("Enter first number, please:");
            first = scanner.nextInt();
            System.out.println("Enter second number, please:");
            second = scanner.nextInt();
            System.out.println("First = " + first + "\tSecond = " + second);
            switch (select) {
                case 1:
                    part1();
                    break;
                case 2:
                    part2();
                    break;
                case 3:
                    part3();
                    break;
            }
            output();
        }
    }

    // task2.part1 - use additional variables
    private static void part1() {
        int firstNew = second,
                secondNew = first;
        first = firstNew;
        second = secondNew;
    }
    // task2.part2 - use 1 additional variable as an intermediate container during exchange
    private static void part2() {
        int tempVariable;
        tempVariable = first;
        first = second;
        second = tempVariable;
    }
    // task2.part3 - don't use additional variables
    private static void part3() {
        first += second;
        second = first - second;
        first -= second;
    }
    //  output function
    private static void output() {
        System.out.println("After exchange:");
        System.out.println("First = " + first + "\tSecond = " + second + "\n\n");
    }


}
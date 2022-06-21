package com.practice;

import  java.util.Scanner;


public class task5_ifElse {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("task1:" + " Simple km/day" + "\ntask2?: Hard km/day");
        System.out.println("task3: \"Lift Empire State building\"");
        System.out.println("Enter the number of task, please(1-3):");
        Integer select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("You chosen part 1: Simple km/day ");
                part1();
                break;
            case 2:
                System.out.println("You chosen part 2: Hard km/day ");
                part2();
                break;
            case 3:
                System.out.println("You chosen part 3: \"Lift Empire State building\"");
//                part3();
                break;
        }
    }

    public static void part1() {
        System.out.println("Please, enter how many kilometers a day in the pass:");
        Integer distance = scanner.nextInt();
        if (distance <= 3) {
            System.out.println("This is so little... Need more...");
        } else if (distance > 3) {
            System.out.println("You are so cool. Perfect!");
        }
    }

    public static void part2() {
        System.out.println("&& and else - 1; only else - 2; without else and && - 3");
        System.out.println("And now select chose variant this program:");
        Integer variant = scanner.nextInt();
        System.out.println("Please, enter how many kilometers a day in the pass:");
        Integer distance = scanner.nextInt();
        switch (variant) {
            case 1:
                if (distance <= 3) {
                    System.out.println("This is so little... Need more...");
                } else if (distance > 3 && distance < 20) {
                    System.out.println("This is cool) Pretty");
                } else {
                    System.out.println("So cool. You are the best! Marathoner");
                }
                break;
            case 2:
                if (distance <= 3) {
                    System.out.println("This is so little... Need more...");
                } else if (distance >= 20) {
                    System.out.println("So cool. You are the best! Marathoner");
                } else {
                    System.out.println("This is cool) Pretty");
                }
                break;
            case 3:
                if (distance <= 3) {
                    System.out.println("This is so little... Need more...");
                }
                if (distance > 3) {
                    if (distance >= 20) {
                        System.out.println("So cool. You are the best! Marathoner");
                    }
                    if (distance < 20) {
                        System.out.println("This is cool) Pretty");
                    }
                }
                break;
        }
    }
}

package com.practice;

import  java.util.Scanner;

public class task5_ifElse {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("task1:" + " Simple km/day" + "\ntask2?: Hard km/day");
        System.out.println("task3: \"Lift Empire State building\"");
        System.out.println("Enter the number of task, please(1-3):");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("You chosen part 1: Simple km/day ");
                part1();
            case 2:
                System.out.println("You chosen part 2: Hard km/day ");
                part2();
            case 3:
                System.out.println("You chosen part 3: \"Lift Empire State building\"");
                part3();
        }
    }

    public static void part1() {
        System.out.println("Please, enter how many kilometers a day in the pass:");
        int distance = scanner.nextInt();
        if (distance <= 3) {
            System.out.println("This is so little... Need more...");
        } else {
            System.out.println("You are so cool. Perfect!");
        }
    }

    public static void part2() {
        System.out.println("&& and else - 1; only else - 2; without else and && - 3");
        System.out.println("And now select chose variant this program:");
        int variant = scanner.nextInt();
        System.out.println("Please, enter how many kilometers a day in the pass:");
        int distance = scanner.nextInt();
        switch (variant) {
            case 1 -> {
                if (distance > 3 &&  distance < 20) {
                    System.out.println("This is cool) Pretty");
                } else if (distance <= 3) {
                    System.out.println("This is so little... Need more...");
                } else {
                    System.out.println("So cool. You are the best! Marathoner");
                }
            }
            case 2 -> {
                if (distance <= 3) {
                    System.out.println("This is so little... Need more...");
                } else if (distance >= 20) {
                    System.out.println("So cool. You are the best! Marathoner");
                } else {
                    System.out.println("This is cool) Pretty");
                }
            }
            case 3 -> {
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
            }
        }
    }

    public static void part3() {
        System.out.println("Enter the stage please(1-102)");
        int stage = scanner.nextInt();
        if (stage < 102 && stage > 1) {
            if (stage > 23 && stage < 40) {
                System.out.println("Please, enter the pin-code");
                int pinCode = scanner.nextInt();
                if (pinCode != 1337) {
                    System.out.println("Wrong pin-code. Access blocked");
                } else {
                    System.out.println("ok");
                }
            } else {
                System.out.println("ok");
            }
        } else {
            System.out.println("Wrong stage number");
        }
    }
}

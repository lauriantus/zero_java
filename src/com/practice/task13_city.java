package com.practice;

import java.util.Scanner;

public class task13_city {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean flag;

    public static void main(String[] args) {
        String[] cities = new String[11];
        System.out.println("Please, enter the cities: ");
        for (int i = 0; i < 10; i++) {
            cities[i] = scanner.nextLine();
        }
        System.out.println("Enter the hometown: ");
        cities[10] = scanner.nextLine();
        for (int i = 0; !flag && i < cities.length; i++) {
            if (cities[10].equals(cities[i])){ //TODO: Need to improve(equals);
                System.out.println("I know your city!");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("\nI don`t know our city:(");
        }
    }
}

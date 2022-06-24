package com.practice;

import java.util.Scanner;

public class task15_figure {
    public static int max = 0;
    public static int size;
    public static Scanner in = new Scanner(System.in);
    public static int [] high = new int [20];

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter the number of stars in the row " + i + ":");
            high[i] = in.nextInt();

            if (high[i] < 0) {  //cancel iteration
                i--;
            }

            if (high[i] == 0) { //off
                size = i;
                break;
            }

            if (max < high[i]) { //max long
                max = high[i];
            }
        }
        for (int i = 0; i < size; i++) {
            int space = (max - high[i])/2;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < high[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

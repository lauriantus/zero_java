package com.practice;

import java.util.Scanner;

public class task15_figure {
    public static int max = 0;
    public static int size;
    public static Scanner in = new Scanner(System.in);
    public static int [] high = new int [20];

    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            System.out.println("Enter the number of stars in the row " + i + ":");
            high[i] = in.nextInt();

            if (high[i] <= 0 || high[i] % 2 == 0) {  //cancel iteration

                //if cancel
                if (high[i] == 0) {
                    size = i;
                    break;
                }

                //if wrong enter(pass)
                continue;
            }

            //max long
            if (max < high[i]) {
                max = high[i];
            }
            i++;
        }
        // print figure
        for (i = 0; i < size; i++) {
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

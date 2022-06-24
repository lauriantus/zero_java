package com.practice;

import java.util.Scanner;

public class task14_ATM {

    public static Scanner in = new Scanner(System.in);
    public static int transaction, select;
    public static boolean cancel = false;
    public static int [] card = {-123, 33, 0, 4500, -611, 44, 0, 0, -1, -85};
    public static int total = 0;

    public static void main(String[] args) {

        while (!cancel) {
            System.out.println("Select your card(0-9):");
            select = in.nextInt();
            if (select >= 0 && select < 10) {
                break;
            }
        }
        while (!cancel) {
            System.out.println("Please, enter the transaction (from -1000 to 1000 EUR):");
            transaction = in.nextInt();
            // cancel program
            if (transaction == 0) {
                cancel = true;
                break;
            }
            if (transaction <= 1000 && transaction >= -1000) {
                card[select] += transaction;
                break;
            }
        }
        for (int i = 0; i < card.length && !cancel; i++) {
            total += card[i];
        }
//OUTPUT:
        //TODO: Need to add clc window(how?)
        if (!cancel) {
            System.out.println("Active card: " + select);
            System.out.println("Transaction: " + transaction);
            int i = 0;
            while (i < card.length) {
                if (i == 0) {
                    System.out.print("Balances: [");
                } else if (i == card.length - 1) {
                    System.out.println(card[i] + "]");
                } else {
                    System.out.print(card[i] + ", ");
                }
                i++;
            }
            System.out.println("Total balance:" + total);
        } else {
            System.out.println("Canceled!");
        }
    }



}

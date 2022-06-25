package com.practice;

import  java.util.Scanner;

public class task16_howManyWordsInRow {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, enter the string: ");
        String str = in.nextLine();
        int i = 0, j = 0; // счетчик слов
        while (i < str.length() - 1) {
            while (i < str.length() - 1 && (str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 127)) {
                i++;
                if (!(str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 127)) {
                    j++;
                }
            }
            while ((i < str.length() - 1) && !(str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 127)) {
                i++;
            }
        }
        System.out.println(j + 1);
    }
}

//    String row = in.nextLine();
//    int i = 0;
//    int j = 0;
//    boolean flag = true;
//while (i < row.length()) {
//
//        int ascii = row.charAt(i);
//        String word = "";
//        boolean conditionASCII = ascii > 64 && ascii < 91 || ascii > 96 && ascii < 127;
//        if (conditionASCII) {
//        flag = true;
//        j++;
//        } else {
//        flag = false;
//        }
//        while (flag && conditionASCII) {
//        word += row.charAt(i);
//        i++;
//        ascii = row.charAt(i);
//        conditionASCII= ascii > 64 && ascii < 91 || ascii > 96 && ascii < 127;
//        }
//        System.out.println("j = " + j);
//
//        while (!flag && !conditionASCII) {
//        i++;
//        ascii = row.charAt(i);
//        conditionASCII= ascii > 64 && ascii < 91 || ascii > 96 && ascii < 127;
//        if (conditionASCII) break;
//        }
//        }
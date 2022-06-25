package com.practice;

import java.util.Scanner;

public class task17_longerWord {
    public static Scanner in = new Scanner(System.in);
    public static int maxWord = 0;

    public static void main(String[] args) {
        String str = "asdf asfd gfsdgffgdfgdgdx2sfd";
        int i = 0;
        while  (i < str.length()) {
            int temp = 0;
            while (i < str.length() && (str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 127)) {
                temp++;
                i++;
            }
            i++;
            if (maxWord < temp) {
                maxWord = temp;
            }
        }
        System.out.println("maxWord = " + maxWord);
    }
}

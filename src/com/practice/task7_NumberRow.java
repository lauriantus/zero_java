package com.practice;

import java.util.Scanner;

public class task7_NumberRow {
    public static Scanner scanner = new Scanner(System.in);
    public static int i, N;

    public static void main(String[] args) {
        System.out.println("With for:\t1: 1 to N; \t3: N to 1;\t5: 2 to N\t7: N to 2");
        System.out.println("With while:\t1: 1 to N; \t3: N to 1;\t5: 2 to N\t7: N to 2");
        System.out.println("Enter the number part of task, please(1-8):");
        int select = scanner.nextInt();
        if (select == 1 || select == 2 || select == 5 || select == 6) {
            System.out.println("Enter the last number:");
        } else if (select == 3 || select == 4 || select == 7 || select == 8) {
            System.out.println("Enter the first number:");
        }
        N = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("You chosen part 1: from 1 to N with for");
                for (i = 0; i < N; i++) {
                    System.out.print(i + 1);
                if (i != N - 1)
                    System.out.print(", ");
                }
            case 2:
                System.out.println("You chosen part 2: form 1 to N with while");
                i = 0;
                while (i < N) {
                    System.out.print(i + 1);
                    if (i != N - 1)
                        System.out.print(", ");
                    i++;
                }
            case 3:
                System.out.println("You chosen part 3: from N to 1 with for");
                for (i = 0; i < N; i++){
                    System.out.print(N - i);
                    if (i != N - 1)
                        System.out.print(", ");
                }
            case 4:
                System.out.println("You chosen part 4: from N to 1 with while");
                i = 0;
                while (i < N) {
                    System.out.print(N - i);
                    if (i != N - 1)
                        System.out.print(", ");
                    i++;
                }
            case 5:
                System.out.println("You chosen part 5: from 2 to N with for");
                for (i = 1; i < N; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i);
                        if (i != N - 2 && i != N - 1) {
                            System.out.print(", ");
                        }
                    }
                 }
            case 6:
                System.out.println("You chosen part 6: from 2 to N with while");
                i = 1;
                while (i < N) {
                    if (i % 2 == 0) {
                        System.out.print(i);
                        if (i != N - 2 && i != N - 1) {
                            System.out.print(", ");
                        }
                    }
                    i++;
                }
            case 7:
                System.out.println("You chosen part 7: from N to 2 with for");
                for (i = 1; i < N; i++) {
                    if ((N + i) % 2 == 0) {
                        System.out.print(N - i);
                        if (i != N - 2 && i != N - 1) {
                            System.out.print(", ");
                        }
                    }
                }
            case 8:
                System.out.println("You chosen part 8: from N to 2 with while");
                i = 1;
                while (i < N) {
                    if ((N + i) % 2 == 0) {
                        System.out.print(N - i);
                        if (i != N - 2 && i != N - 1) {
                            System.out.print(", ");
                        }
                    }
                    i++;
                }
        }
    }

}

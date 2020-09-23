package Bai2_Loop.Bai_tap;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("MENU:\n" +
                    "1. Print the rectangle\n" +
                    "2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "3. Print isosceles triangle\n" +
                    "4.Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("*\t");
                        }
                        System.out.print('\n');
                    }
                }
                break;
                case 2: {
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print('\n');
                    }
                    for (int i = 9; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print('\n');
                    }
                }
                break;
                case 3: {
                    for(int i = 1; i <= 9; i++) {
                        // in ky tu khoang trang
                        for(int j = i; j < 9; j++) {
                            System.out.print(" ");
                        }
                        // in ky tu ngoi sao
                        for(int j = 1; j <= (2*i-1); j++) {
                            System.out.print("*");
                        }
                        // xuong dong ke tiep
                        System.out.println();
                    }
                }
                break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Khong co su lua chọn nay");
                    break;
            }
        }while (choice!=0);
    }
}

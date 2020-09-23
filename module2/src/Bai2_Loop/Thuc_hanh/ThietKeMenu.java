package Bai2_Loop.Thuc_hanh;

import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("MENU:" +
                    "1. Draw the triangle\n" +
                    "2. Draw the square\n" +
                    "3. Draw the rectangle\n" +
                    "0.Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print('\n');
                    }
                }
                break;
                case 2: {
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print("*\t");
                        }
                        System.out.print('\n');
                    }
                }
                break;
                case 3: {
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print("*\t");
                        }
                        System.out.print('\n');
                    }
                }
                break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co su lua chọn nay");
                    break;
            }
        }while (choice!=0);
    }
}


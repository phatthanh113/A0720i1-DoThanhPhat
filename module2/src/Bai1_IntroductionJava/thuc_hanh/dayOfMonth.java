package Bai1_IntroductionJava.thuc_hanh;

import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input Month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            case 2:
                System.out.println("Có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Không có tháng này");
                break;
        }
    }
}

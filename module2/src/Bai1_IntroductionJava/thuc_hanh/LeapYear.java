package Bai1_IntroductionJava.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year");
        int year = scanner.nextInt();
        if((year % 4 ==0) && (year%100 !=0) ||  (year % 400 == 0)) {
            System.out.println("Đây là năm nhuận");
        }else {
            System.out.println("Đây không phải là năm nhuận");
        }
    }
}

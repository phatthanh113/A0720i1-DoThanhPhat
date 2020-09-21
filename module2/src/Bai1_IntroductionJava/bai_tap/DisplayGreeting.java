package Bai1_IntroductionJava.bai_tap;

import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}

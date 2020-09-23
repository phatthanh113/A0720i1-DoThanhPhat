package Bai1_IntroductionJava.bai_tap;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input USD");
        double usd =scanner.nextDouble();
        double vnd= usd * rate;
        System.out.println(vnd);
    }
}

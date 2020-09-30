package Bai3_Array.Thuc_hanh;

import java.util.Scanner;

public class Convert_CtoF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        double celsius,fahrenheit;
        do{
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập độ C");
                celsius=scanner.nextInt();
                System.out.println("Độ F là : "+celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.println("Nhập độ F");
                fahrenheit=scanner.nextInt();
                System.out.println("Độ C là : "+fahrenheitToCelsius(fahrenheit));
                break;
            case 0:
                System.exit(0);
        }
    }while(choice !=0);
    }

public static double celsiusToFahrenheit(double celsius) {
    double fahreheit= (9.0 / 5) * celsius + 32;
        return fahreheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

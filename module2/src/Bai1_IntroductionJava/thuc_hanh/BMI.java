package Bai1_IntroductionJava.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input weight");
        double weight = scanner.nextDouble();
        System.out.println("input height");
        double height = scanner.nextDouble();
        double bmi = weight/Math.pow(height,2);
        System.out.println("BMI của bạn là "+bmi);
        String result;
        if(bmi<18.0) {
            result="underweight";
        }
        else if(bmi<25.0) {
            result="normal";
        }
        else if(bmi<30.0) {
            result="overweight";
        }else {
            result="obese";
        }
        System.out.println(result);
    }
}

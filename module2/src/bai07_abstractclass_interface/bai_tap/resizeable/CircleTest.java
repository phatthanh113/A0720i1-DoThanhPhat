package bai07_abstractclass_interface.bai_tap.resizeable;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
        circle.setRadius(3);
        System.out.println("Diện tích trước khi tâng là "+circle.getArea());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn tăng bán kính bao nhiêu % ");
        double percent= scanner.nextDouble();
        circle.resize(percent);
        System.out.println("Diện tích hình tròn sau khi tăng là "+circle.getArea());
    }
}

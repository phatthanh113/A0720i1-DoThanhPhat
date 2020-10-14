package bai06_inheritance.bai_tap.triangle;

import bai06_inheritance.thuc_hanh.Shape;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input color");
        String color = scanner.nextLine();
        triangle.setColor(color);
        System.out.println("input side 1");
        double side1= scanner.nextDouble();
        triangle.setSide1(side1);
        System.out.println("input side 2");
        double side2= scanner.nextDouble();
        triangle.setSide2(side2);
        System.out.println("input side 3");
        double side3= scanner.nextDouble();
        triangle.setSide3(side3);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}

package Bai4_Class_Object.Bai_Tap.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    //    Khởi tạo
    public double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.pow(this.getDiscriminant(), 0.5)) / 2 * a;
    }

    //Hàm tìm nghiệm
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("Nhập hệ số a");
        double a = scanner.nextDouble();
        quadraticEquation.setA(a);
        System.out.println("Nhập hệ số b");
        double b = scanner.nextDouble();
        quadraticEquation.setB(b);
        System.out.println("Nhập hệ số a");
        double c = scanner.nextDouble();
        quadraticEquation.setC(c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép là " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.println("Nghiệm thứ nhất là " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai là " + quadraticEquation.getRoot2());
        }
    }
}

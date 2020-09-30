package Bai4_Class_Object.Thuc_hanh;

import java.util.Scanner;

public class DisplayRectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        double width=scanner.nextDouble();
        System.out.println("Nhập chiều rộng");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Diện tích hình chữ nhật "+ rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật "+ rectangle.getPerimeter());
    }
}

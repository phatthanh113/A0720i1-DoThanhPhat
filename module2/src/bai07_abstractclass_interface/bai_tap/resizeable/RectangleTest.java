package bai07_abstractclass_interface.bai_tap.resizeable;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
        rectangle.setLength(3);
        rectangle.setWidth(5);
        System.out.println("Diện tích trước khi tăng là "+rectangle.getArea());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn tăng bao nhiêu phần trăm");
        double percent = scanner.nextDouble();
        rectangle.resize(percent);
        System.out.println("Diện tích sau khi tăng " + rectangle.getArea());
    }
}

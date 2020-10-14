package bai06_inheritance.thuc_hanh;

public class SquareTest {
    public static void main(String[] args) {
        Rectangle square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square( "yellow", true,5.8);
        System.out.println(square);
        square.setHeight(5);
        System.out.println(square);
    }


}

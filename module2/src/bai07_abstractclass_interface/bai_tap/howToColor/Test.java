package bai07_abstractclass_interface.bai_tap.howToColor;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1]= new Rectangle(3,4);
        shapes[2]= new Square(5);
        for (Shape shape:shapes
             ) {
            System.out.println("Diện tích hình là "+shape.getArea());
        }
        Square square = (Square) shapes[2];
        square.howToColor("Red");
    }
}

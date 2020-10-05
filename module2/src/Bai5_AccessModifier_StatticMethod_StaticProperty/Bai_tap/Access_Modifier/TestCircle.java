package Bai5_AccessModifier_StatticMethod_StaticProperty.Bai_tap.Access_Modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Area: "+ circle.getArea());
    }
}

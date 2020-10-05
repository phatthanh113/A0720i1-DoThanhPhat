package Bai5_AccessModifier_StatticMethod_StaticProperty.Bai_tap.Access_Modifier;

public class Circle {
    private double radius=1.0;
    private String color ="red";

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea() {
        return Math.PI* Math.pow(radius,2);
    }
}

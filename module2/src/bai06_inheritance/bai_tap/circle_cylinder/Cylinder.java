package bai06_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder() {
        height=1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getCapacity() {
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+"which is subclass in "+super.toString();
    }
}

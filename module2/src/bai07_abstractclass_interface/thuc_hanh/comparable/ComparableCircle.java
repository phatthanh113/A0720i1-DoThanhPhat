package bai07_abstractclass_interface.thuc_hanh.comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle circle) {
        return getRadius()>=circle.getRadius() ? 1:-1;
    }

    @Override
    public String toString() {
        return "ComparableCircle{} " + super.toString();
    }
}

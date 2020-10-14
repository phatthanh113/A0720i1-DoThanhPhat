package bai07_abstractclass_interface.thuc_hanh.comparator;

import java.util.Comparator;

public class ComparatorCircle extends Circle implements Comparator<ComparatorCircle> {
    public ComparatorCircle() {
    }

    public ComparatorCircle(double radius) {
        super(radius);
    }

    @Override
    public int compare(ComparatorCircle comparatorCircle_1, ComparatorCircle comparatorCircle_2) {
        if(comparatorCircle_1.getRadius()>comparatorCircle_2.getRadius()) return 1;
        else if (comparatorCircle_1.getRadius()<comparatorCircle_2.getRadius()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "ComparatorCircle{} " + super.toString();
    }
}

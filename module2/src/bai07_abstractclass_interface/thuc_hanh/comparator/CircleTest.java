package bai07_abstractclass_interface.thuc_hanh.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
    ComparatorCircle[] comparatorCircles = new ComparatorCircle[3];
    comparatorCircles[0]= new ComparatorCircle(4);
    comparatorCircles[1]= new ComparatorCircle(3);
    comparatorCircles[2]= new ComparatorCircle(12);
    Comparator circleComparator = new ComparatorCircle();
    Arrays.sort(comparatorCircles,circleComparator);
        for (ComparatorCircle circle: comparatorCircles) {
            System.out.println(circle);
        }
    }
}

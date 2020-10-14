package bai07_abstractclass_interface.thuc_hanh.comparable;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circle = new ComparableCircle[3];
        circle[0]= new ComparableCircle(3);
        circle[1]= new ComparableCircle(1);
        circle[2]= new ComparableCircle(4);
        System.out.println("Before sort");
        for (ComparableCircle element:circle
             ) {
            System.out.println(element);
        }
        System.out.println("After sort");
        Arrays.sort(circle);
        for (ComparableCircle element:circle) {
            System.out.println(element);
        }
    }
}

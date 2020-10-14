package bai06_inheritance.bai_tap.point_moveablepoint;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.getX();
        movablePoint.setxSpeed(2.0f);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}

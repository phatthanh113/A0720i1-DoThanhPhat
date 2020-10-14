package bai06_inheritance.bai_tap.point2d_point3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        point3D.setXY(3,4);
        System.out.println(point3D);
        point3D.setXYZ(3,4,5);
        System.out.println(point3D);
    }
}

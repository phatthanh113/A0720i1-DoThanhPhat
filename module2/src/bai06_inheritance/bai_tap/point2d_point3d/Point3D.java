package bai06_inheritance.bai_tap.point2d_point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        z=0.0f;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z) {
        super.setXY(x,y);
        setZ(z);
    }
    public float[] getXYZ() {
        float[] array = new float[3];
        array[0]=super.getX();
        array[1]=super.getY();
        array[2]=getZ();
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +"which is subclass in " +super.toString()+
                '}';
    }
}

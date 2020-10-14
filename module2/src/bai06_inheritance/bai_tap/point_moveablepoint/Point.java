package bai06_inheritance.bai_tap.point_moveablepoint;

public class Point {
    protected float x;
    protected float y;

    public Point() {
        x= 0.0f;
        y=0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y) {
        setX(x);
        setY(y);
    }
    public float[] getXY(float x,float y) {
        float[] array = new float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

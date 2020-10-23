package bai06_inheritance.bai_tap.point_moveablepoint;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MovablePoint() {
        xSpeed=0.0f;
        ySpeed=0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float x,float y) {
        setxSpeed(x);
        setySpeed(y);
    }
    public float[] getSpeed() {
        return getXY(getxSpeed(),getySpeed());
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} " + super.toString();
    }
    public MovablePoint move() {
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
}

package Bai4_Class_Object.Bai_Tap.Fan;

import java.util.Scanner;

public class Fan {
    static final int SLOW =1;
    static final int MEDIUM =2;
    static final int FAST =3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius=5.0;
    private String color ="blue";
    public Fan() {

    }
    public int getSpeed() {
        return this.speed;
    }
    public boolean getOn() {
        return this.on;
    }
    public String getColor() {
        return this.color;
    }
    public void setSpeed(int speed) {
        this.speed=speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setColor(String color) {
        this.color=color;
    }
    void setRadius(double radius) {
        this.radius=radius;
    }
    public void display() {
        if(this.getOn()) {
            System.out.println("Speed +" +this.speed);
            System.out.println("Color "+ this.color);
            System.out.println("Radius "+ this.radius);
        }else {
            System.out.println("Color "+ this.color);
            System.out.println("Fan is off");
        }

    }
    public static void main(String[] args) {
//        Khởi tạo quạt 1
        Fan fan_1 =new Fan();
        fan_1.setSpeed(FAST);
        fan_1.setRadius(10);
        fan_1.setOn(true);
        System.out.println("Các tính chất của quạt 1");
        fan_1.display();
        System.out.println();
//        Khởi tạo quạt 2
        Fan fan_2=new Fan();
        fan_2.setSpeed(MEDIUM);
        fan_2.setRadius(5);
        fan_2.setOn(false);
        System.out.println("Các tính chất của quạt 2");
        fan_2.display();
    }
}

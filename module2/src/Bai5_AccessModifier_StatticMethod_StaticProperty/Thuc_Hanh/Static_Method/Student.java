package Bai5_AccessModifier_StatticMethod_StaticProperty.Thuc_Hanh.Static_Method;

public class Student {
    private int rollNumber;
    private String name;
    private static String school;
    private static int count=0;
    static {
        school="CodeGym";
    }

    public Student(int rollNumber, String name) {
        count++;
        this.rollNumber = rollNumber;
        this.name = name;
    }
    protected void display() {
        System.out.println(rollNumber + " " + name + " " + school+" "+count);
    }
    
}

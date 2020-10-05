package Bai5_AccessModifier_StatticMethod_StaticProperty.Thuc_Hanh.Static_Method;

public class TestStudent {
    public static void main(String[] args) {
        Student student_1= new Student(1,"Nam");
        Student student_2= new Student(2,"Ngoc");
        Student student_3= new Student(3,"Long");
        student_1.display();
        student_2.display();
        student_3.display();
    }
}


package bai10_dsa_list.bai_tap;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name ;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList= new MyLinkedList<>();
        Student student1= new Student(1,"Huy");
        Student student2= new Student(1,"Huy");
        Student student3= new Student(1,"Huy");
        Student student4= new Student(1,"Huy");
    }
}

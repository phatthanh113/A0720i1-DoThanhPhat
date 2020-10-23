package bai10_dsa_list.bai_tap;

public class TestMyArrayList {
    public static class Student{
        private int id=0;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student_1= new Student(1,"huy");
        Student student_2= new Student(2,"ngoc");
        Student student_3= new Student(3,"linh");
        Student student_4= new Student(4,"ngoc");
        Student student_5= new Student(5,"huong");
        Student student_6= new Student(6,"anh");
        MyArrayList<Student> studentMyArrayList= new MyArrayList<>();
        studentMyArrayList.add(student_1);
        studentMyArrayList.add(student_2);
        studentMyArrayList.add(student_3);
        studentMyArrayList.add(student_4);
        studentMyArrayList.add(student_5);
        studentMyArrayList.add(student_6);
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            System.out.println(studentMyArrayList.elements[i]);
        }

    }
}

package _12_map.pratice.map;

public class Student implements Comparable<Student> {
    private String name ;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + id +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return  this.id - student.getId();
    }
}

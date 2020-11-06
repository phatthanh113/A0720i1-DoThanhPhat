package _12_map.pratice.comparable_comparator;

public class Student implements Comparable<Student> {
    private String name ;
    private int id;
    private String address ;
    private int age ;

    public Student(String name, int id, String address, int age)  {
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    public int compareTo(Student student) {
        return this.id - student.getId();
    }
}

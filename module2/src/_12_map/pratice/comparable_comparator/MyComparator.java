package _12_map.pratice.comparable_comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student otherStudent ) {
        return student.getAge() - otherStudent.getAge();
    }
}

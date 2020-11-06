package _12_map.pratice.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("nam",1,"HN",22);
        Student student2 = new Student("nam",3,"HN",21);
        Student student3 = new Student("nam",2,"HN",25);
        Student student4 = new Student("nam",7,"HN",27);
        Student student5 = new Student("nam",6,"HN",20);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        Collections.sort(arrayList);
        for (Student student: arrayList) {
            System.out.println(student);
        }
        System.out.println("======================");
//
        MyComparator myComparator = new MyComparator();
        Collections.sort(arrayList,myComparator);
        for (Student student: arrayList) {
            System.out.println(student);
        }
    }
}

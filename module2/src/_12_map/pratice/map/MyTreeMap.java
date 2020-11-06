package _12_map.pratice.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Student, Integer> myTreeMap = new TreeMap<>();
        myTreeMap.put(new Student("Ngoc", 4), 29);
        myTreeMap.put(new Student("Nam", 2), 23);
        myTreeMap.put(new Student("Quan", 3), 24);
        myTreeMap.put(new Student("Phu", 1), 25);
        for (Student student : myTreeMap.keySet()) {
            System.out.println(student + " age : " + myTreeMap.get(student));
        }
    }
}

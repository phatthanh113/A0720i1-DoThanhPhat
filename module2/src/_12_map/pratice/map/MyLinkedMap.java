package _12_map.pratice.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedMap {
    public static void main(String[] args) {
        Map<Student,Integer> myLinkedHashMap = new LinkedHashMap<>();
        myLinkedHashMap.put(new Student("Ngoc",4),29);
        myLinkedHashMap.put(new Student("Nam",2),23);
        myLinkedHashMap.put(new Student("Quan",3),24);
        myLinkedHashMap.put(new Student("Phu",1),25);
        for (Student student : myLinkedHashMap.keySet()) {
            System.out.println(student + " age : " + myLinkedHashMap.get(student));
        }
    }
}

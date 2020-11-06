package _12_map.pratice.map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Student,Integer> myHashMap = new HashMap<>();
        myHashMap.put(new Student("Ngoc",4),29);
        myHashMap.put(new Student("Nam",2),23);
        myHashMap.put(new Student("Quan",1),24);
        myHashMap.put(new Student("Phu",3),25);
        for (Student student : myHashMap.keySet()) {
            System.out.println(student + " age : " + myHashMap.get(student));
        }
    }
}

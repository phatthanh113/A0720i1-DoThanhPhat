package Bai3_Array.Thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students= {"Ngoc", "Quan", "Huy", "Tram", "Phuong", "Anh", "Thanh", "Thu", "Vy", "Thang"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        String nameStudent=scanner.nextLine();
        boolean check=false;
        for(int i = 0; i < students.length; i++) {
            if(students[i].equals(nameStudent)) {
                System.out.println("Position of the students in the list " + nameStudent + " is: " + (i + 1));
                check=true;
                break;
            }
        }
        if (!check)
            System.out.println("Not found " + nameStudent + " in the list.");
    }
}

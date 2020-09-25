package Bai3_Array.Bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
//        Tạo mảng và in mảng
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số lượng mảng");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("phần tử phải nhỏ hơn 20");
            } else
                break;
        } while (true);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Các phần tử trong mảng là :");
        for (int element : array) {
            System.out.println(element + "\t");
        }//
//        Them PHan tu vao mảng
        int addIndex = 0;
        while (true) {
            System.out.println("Ban muon them vao vị trí nào");
            addIndex = scanner.nextInt();
            if (addIndex <= 1 || addIndex >= size - 1)
                System.out.println("không được thêm vào vị trí này của mảng");
            else
                break;
        }
        for (int i = size-1; i > addIndex; i--) {
            array[i]=array[i-1];
        }
        System.out.println("nhập giá trị phan tu ban muon them");
        int addElement = scanner.nextInt();
        array[addIndex] = addElement;

        System.out.println("Các phần tử trong mảng là :");
        for (int element : array) {
            System.out.println(element + "\t");
        }
        }
    }

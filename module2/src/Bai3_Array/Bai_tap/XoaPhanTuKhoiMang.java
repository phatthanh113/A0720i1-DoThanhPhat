package Bai3_Array.Bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
//        tạo mảng và in mẩng
        Scanner scanner=new Scanner(System.in);
        int size;
        do{
            System.out.println("Nhập số lượng mảng");
            size = scanner.nextInt();
            if(size > 20) {
                System.out.println("phần tử phải nhỏ hơn 20");
            }else
                break;
        }while (true);
        int[] array = new int[size];
        for(int i=0;i<array.length;i++) {
            System.out.println("Nhập phần tử thứ "+ (i+1));
            array[i]=scanner.nextInt();
        }
        System.out.println("Các phần tử trong mảng là :");
        for(int element : array) {
            System.out.println(element+"\t");
        } //
//        Xóa phần tử mảng
        System.out.println("nhập phân tử cần xóa");
        int deleteElement=scanner.nextInt();
        int indexDelete=0;
        boolean check=false;
        for(int i=0;i<size;i++) {
            if(array[i]==deleteElement) {
                array[i]=0;
                indexDelete=i;
                System.out.println("vị trí "+ indexDelete);
                check = true;
                break;
            }
        }
        if(!check) {
            System.out.println("Không có phần tử này trong mảng");
        }
        for (int i=indexDelete;i<size-1;i++) {
            int temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;

        }
        for(int element : array) {
            System.out.println(element+"\t");
        }
    }
}

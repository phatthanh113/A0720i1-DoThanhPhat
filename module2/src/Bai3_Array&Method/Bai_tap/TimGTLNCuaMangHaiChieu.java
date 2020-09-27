package Bai3_Array.Bai_tap;

import java.util.Scanner;

public class TimGTLNCuaMangHaiChieu {
    public static void main(String[] args) {
//Tạo mảng 2 chiều
        Scanner scanner=new Scanner(System.in);
        int size;
        int sizeElement;
        do{
            System.out.println("Nhập số lượng mảng");
            size = scanner.nextInt();
            System.out.println("Nhập số lượng mảng con");
            sizeElement=scanner.nextInt();
            if(size > 20 || sizeElement>20) {
                System.out.println("phần tử phải nhỏ hơn 20");
            }else
                break;
        }while (true);
        int[][] array = new int[size][sizeElement];
        for(int i=0;i<size;i++) {
            for(int j=0;j<sizeElement;j++) {
                System.out.println("Nhập phần tử thứ " + j +" của mảng con "+ i);
                array[i][j] = scanner.nextInt();
            }
        } //
        int max= array[0][0];
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<sizeElement;j++) {
                if(max<array[i][j])
                    max=array[i][j];
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận là "+max);
    }
}

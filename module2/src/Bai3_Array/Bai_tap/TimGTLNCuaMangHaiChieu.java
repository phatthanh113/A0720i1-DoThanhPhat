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
                System.out.print("Nhập phần tử thứ " + j +" của mảng con "+ i);
                array[i][j] = scanner.nextInt();
            }
        } //
//        int max= array[0][0];
//        for(int i=0;i<array.length;i++) {
//            for(int j=0;j<sizeElement;j++) {
//                if(max<array[i][j])
//                    max=array[i][j];
//            }
        getMaxInArray(array,array[0][0]);
        }

    private static void getMaxInArray(int[][] array,int maxElement) {
        int inputX=0;
        int inputY=0;
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                if(maxElement<array[i][j])
                    maxElement=array[i][j];
                inputX=i;
                inputY=j;
            }
        }
        System.out.println("Max "+maxElement);
        System.out.println("Tọa độ x : "+inputX);
        System.out.println("Tọa độ x : "+inputY);
    }
}

package Bai3_Array.Bai_tap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheo {
    public static void main(String[] args) {
//        int[][] array = {{2,3,4,5},{2,3,4,5},{2,3,4,5},{2,3,4,5}};
//        Tạo mảng 2 chiều
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập size của mảng");
        int size = scanner.nextInt();
        int[][] array= new int[size][size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.println("Nhập phần tử con thứ "+j+ "của mảng con thứ "+i);
                array[i][j]=scanner.nextInt();
            }
        }
//        Tính tổng hàng chéo
//        int sum=0;
//        for(int i=0;i<array.length;i++) {
//            sum+=array[i][i];
//        }
        System.out.println("Tổng bạn cần tìm là "+sumCross(array));
    }
    private static int sumCross(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            sum += array[i][i];
        }
        return sum;
    }
}

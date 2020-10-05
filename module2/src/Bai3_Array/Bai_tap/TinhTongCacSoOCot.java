package Bai3_Array.Bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOCot {
    public static void main(String[] args) {
        int[][] array ={{2,3,4},{2,3,4},{2,3,4}};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập cột bạn chọn");
        int choice=scanner.nextInt();
//        int sum=0;
//        for(int i=0;i<array.length;i++) {
//            sum+=array[i][choice];
//        }
        System.out.println("result : "+getSum(array,choice));
    }
    private static int getSum(int[][] array,int choice) {
        int sum=0;
        for(int i=0;i<array.length;i++) {
            sum+=array[i][choice];
        }
        return sum ;
    }
}

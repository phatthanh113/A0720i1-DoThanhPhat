package Bai3_Array.Thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacGiaTriCuaMang {
    public static void main(String[] args) {
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
        for(int j=0;j<array.length;j++) {
            System.out.println(array[j]+"\t");
        }
        for(int i=0;i<array.length/2;i++) {
            int temp = array[i];
            array[i]=array[size-1-i];
            array[size-1-i]=temp;
        }
        System.out.println("Các phần tử trong mảng sau khi đã đảo ngược là :");
        for(int j=0;j<array.length;j++) {
            System.out.println(array[j]+"\t");
        }
    }
}

package Bai3_Array.Bai_tap;

import java.sql.Array;

public class GopMang {
    public static void main(String[] args) {
        int[] array1={3,4,5,6};
        int[] array2={2,3,5,6,7,8,9,9};
        int[] array3= new int[array1.length+array2.length];
        System.out.println("độ dài mảng mới là"+array3.length);
        for(int i=0;i<array1.length;i++) {
            array3[i]=array1[i];
        }
        int count=0;
        for(int i=array1.length;i<array3.length;i++) {
            array3[i]=array2[count];
            count++;
        }
        for(int elment : array3)
            System.out.println(elment);
    }
}

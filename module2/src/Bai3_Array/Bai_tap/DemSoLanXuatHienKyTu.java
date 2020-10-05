package Bai3_Array.Bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string=scanner.nextLine();
        System.out.println("Nhập kí tự");
        char element = scanner.nextLine().charAt(0);
        System.out.println("Số ký tự xuất hiện của kí tự "+element+ " là "+ count(string.toLowerCase(),element));
    }
    public static int count(String string, char element ) {
        int count=0;
        for(int i=0;i<string.length();i++) {
            if(string.charAt(i) == element) {
                count++;
            }
        }
        return count;
    }
}

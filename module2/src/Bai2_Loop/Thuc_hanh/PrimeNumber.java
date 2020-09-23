package Bai2_Loop.Thuc_hanh;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số");
        int number=scanner.nextInt();
        String result =null;
        if(number<2) {
            result= number+ " is not a prime number";
        }else {
            boolean check=true;
            for(int i=2;i<=Math.sqrt(number);i++) {
                if(number%i==0) {
                    check=false;
                    break;
                }
            }
            if(check==true) {
                result= number+ " is  a prime number";
            }else {
                result = number + " is  not a prime number";
            }
            System.out.println(result);
        }
    }
}

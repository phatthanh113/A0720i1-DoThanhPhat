package Bai2_Loop.Bai_tap;

public class FirstPrimeNumber {
    public static void main(String[] args) {
        int number=20;
        int count=0;
        int primeNumber=2;
        while(count<number) {
            if(isPrimeNumber(primeNumber)) {
                System.out.println(primeNumber);
                count++;
            }
            primeNumber++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

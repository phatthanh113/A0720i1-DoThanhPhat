package Bai2_Loop.Bai_tap;

public class PrimeNumberNhoHon100 {
    public static void main(String[] args) {
        int number=2;
        while(number<100) {
            if(isPrimeNumber(number)){
                System.out.println(number);
            }
            number++;
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

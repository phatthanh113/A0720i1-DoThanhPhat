package Controllers;

import java.util.Scanner;

public class CheckInput {
    static Scanner scanner = new Scanner(System.in);
    public static int checkInputInterger() {
        int index;
        do {
            index = Integer.parseInt(scanner.nextLine());
            if(index > 0 && index < 100) {
                break;
            }
            System.out.println("bạn đã nhập sai định dạng");
        }while (true);
        return index;
    }
}

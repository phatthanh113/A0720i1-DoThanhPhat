package Commons.exception;

import Commons.MyRegex;

import java.util.Scanner;

public class IdException extends Exception {
    static Scanner scanner = new Scanner(System.in);
    public IdException(String message) {
        super(message);
    }
    //    get id dùng exception
    public static String getId() {
        String idNumber = scanner.nextLine();
        while (!idNumber.matches(MyRegex.REGEX_ID_NUMBER)) {
            try {
                throw new GenderException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
            }catch (GenderException e) {
                e.printStackTrace();
                System.out.println("Mời bạn nhập lại id number");
                idNumber= scanner.nextLine();
            }
        }
        return idNumber;
    }
}

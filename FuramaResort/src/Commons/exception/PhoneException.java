package Commons.exception;

import Commons.MyRegex;

import java.util.Scanner;

public class PhoneException extends Exception {

    static Scanner scanner = new Scanner(System.in);
    public PhoneException(String message) {
        super(message);
    }
    //    get phone number dùng exception
    public static String getPhone() {
        String phoneNumber = scanner.nextLine();
        while (!phoneNumber.matches(MyRegex.REGEX_PHONE)) {
            try {
                throw new PhoneException("Số điện thoại phải có dạng 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx");
            }catch (PhoneException e) {
                e.printStackTrace();
                System.out.println("Mời bạn nhập lại ");
                phoneNumber= scanner.nextLine();
            }
        }
        return phoneNumber;
    }
}

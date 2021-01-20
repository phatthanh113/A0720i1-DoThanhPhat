package Commons.exception;

import controllers.MyRegex;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthdayException extends Exception {
    static Scanner scanner = new Scanner(System.in);
    public BirthdayException(String message) {
        super(message);
    }

    //  Hàm lấy birthday
    public static String getBirthday() {
        System.out.println("Nhập ngày tháng");
        String birthDay = scanner.nextLine();

        while (!MyRegex.setValidate(birthDay, MyRegex.REGEX_BIRTHDAY)) {
            try {
                throw new BirthdayException("Ngày sinh phải có dạng xx/yy/zzzz");
            }
            catch (DateTimeException e) {
                e.printStackTrace();
                System.out.println("mời bạn nhập lại");
                birthDay = scanner.nextLine();
            }
            catch (BirthdayException e) {
                e.printStackTrace();
                System.out.println("mời bạn nhập ");
                birthDay = scanner.nextLine();
            }
        }
        return birthDay;
    }
}

package Commons;

import Commons.exception.EmailException;
import Commons.exception.GenderException;
import Commons.exception.NameException;
import Models.Villa;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class MyRegex {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_ID_VILLA = "^SVVL-\\d{4}$";
    public static final String REGEX_ID_HOUSE = "^SVHO-\\d{4}$";
    public static final String REGEX_ID_ROOM = "^SVRO-\\d{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    public static final String REGEX_POSITIVE_NUMBER = "^([1-9][\\d]*(\\.[\\d]*)?)|(0\\.[\\d]+)$";
    public static final String REGEX_POSITIVE_INTEGER = "^[1-9][\\d]*$";
    public static final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    public static final String REGEX_EMAIL = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";
    public static final String REGEX_GENDER ="^male$|^female$|^unknown$";
    public static final String REGEX_ID_NUMBER = "^[\\d]{9}$";
    public static final String REGEX_PHONE = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)[\\d]{7}$";

    public static boolean setValidate(String string, String regex) {
        return string.matches(regex);
    }

    //    Lấy thuộc tính name
    public static String getName() {
        String string = scanner.nextLine();
        while (!setValidate(string, REGEX_NAME)) {
            System.out.println("Invalid!! Chữ đầu tên phải viết hoa");
            string = scanner.nextLine();
            string.toLowerCase();
        }
        return string;
    }

    public static String getArea() {
        String string = scanner.nextLine();

        while (!setValidate(string, REGEX_POSITIVE_NUMBER) || Double.parseDouble(string) < 30) {
            System.out.println("Invalid !! Phải lớn hơn 30");
            string = scanner.nextLine();
        }
        return string;
    }

    public static String getPrice() {
        String string = scanner.nextLine();
        while (!setValidate(string, REGEX_POSITIVE_NUMBER) || Double.parseDouble(string) < 0) {
            System.out.println("Invalid !! Phải là số dương");
            string = scanner.nextLine();
        }
        return string;
    }

    public static String getNumberPeople() {
        String string = scanner.nextLine();
        int number = Integer.parseInt(string);
        while (!setValidate(string, REGEX_POSITIVE_INTEGER) || number > 20 || number < 0) {
            System.out.println("Invalid  !! Trên 0 dưới 20");
            string = scanner.nextLine();
        }
        return string;
    }

    public static String getId(String regex) {
        String string = scanner.nextLine();
        while (!setValidate(string, regex)) {
            System.out.println("Invalid !! (Ex : SVXX-YYYY, XX là VI hoặc HO hoặc RO ,YYYY là 4 số");
            string = scanner.nextLine();
            string.toUpperCase();
        }
        return string;
    }

    public static String getFloor() {
        String string = scanner.nextLine();
        while (!setValidate(string, REGEX_POSITIVE_INTEGER)) {
            System.out.println("Invalid");
            string = scanner.nextLine();
        }
        return string;
    }
}

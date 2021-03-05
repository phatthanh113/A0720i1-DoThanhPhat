package controllers;

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
    public static final String REGEX_NAME_ACCOMPANY_SERVICES="^massage$|^karaoke$|^food$|^drink$|^car$";
//set validate
    public static boolean setValidate(String string, String regex) {
        return string.matches(regex);
    }

    //    Lấy thuộc tính name
    public static String getName() {
        String string = scanner.nextLine();
        while (!setValidate(string, REGEX_NAME)) {
            System.out.println("Sai định dạng !! Chữ đầu tên các từ phải viết hoa");
            string = scanner.nextLine();
            string.toLowerCase();
        }
        return string;
    }

    public static String getArea() {
        String string = scanner.nextLine();

        while (!setValidate(string, REGEX_POSITIVE_NUMBER) || Double.parseDouble(string) < 30) {
            System.out.println("Sai định dạng !! Phải lớn hơn 30");
            string = scanner.nextLine();
        }
        return string;
    }

    public static String getPrice() {
        String string = scanner.nextLine();
        while (!setValidate(string, REGEX_POSITIVE_NUMBER) || Double.parseDouble(string) < 0) {
            System.out.println("Sai định dạng !! Phải là số dương");
            string = scanner.nextLine();
        }
        return string;
    }

    public static String getNumberPeople() {
        String string = scanner.nextLine();
        int number = Integer.parseInt(string);
        while (!setValidate(string, REGEX_POSITIVE_INTEGER) || number > 20 || number < 0) {
            System.out.println("Sai định dạng  !! Trên 0 dưới 20");
            string = scanner.nextLine();
        }
        return string;
    }

    public static String getId(String regex) {
        String string = scanner.nextLine();
        while (!setValidate(string, regex)) {
            System.out.println("Sai định dạng !! (Ví dụ : SVXX-YYYY, XX là VI hoặc HO hoặc RO ,YYYY là 4 số");
            string = scanner.nextLine();
            string.toUpperCase();
        }
        return string;
    }

    public static String getFloor() {
        String string = scanner.nextLine();
        while (!setValidate(string, REGEX_POSITIVE_INTEGER)) {
            System.out.println("Sai định dạng || Phải là số dương ");
            string = scanner.nextLine();
        }
        return string;
    }
    public static String getNameAccompanyServices() {
        String string = scanner.nextLine();
        while (!setValidate(string, REGEX_NAME_ACCOMPANY_SERVICES)) {
            System.out.println("Sai dịnh dạng !! Chỉ được nhập massage, karaoke, food, drink, car");
            string = scanner.nextLine();
        }
        return string;
    }
}

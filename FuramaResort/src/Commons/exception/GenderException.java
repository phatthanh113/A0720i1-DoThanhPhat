package Commons.exception;

import Commons.MyRegex;

import java.util.Scanner;

public class GenderException extends Exception{
    static Scanner scanner = new Scanner(System.in);
    public GenderException(String message) {
        super(message);
    }
//    get gender dùng exception
    public static String getGender() {
        String gender = scanner.nextLine();
        while (!gender.matches(MyRegex.REGEX_GENDER)) {
            try {
                throw new GenderException("male or female or unknown");
            }catch (GenderException e) {
                e.printStackTrace();
                System.out.println("Mời bạn nhập lại gender");
                gender= scanner.nextLine();
            }
        }
        return gender;
    }
}

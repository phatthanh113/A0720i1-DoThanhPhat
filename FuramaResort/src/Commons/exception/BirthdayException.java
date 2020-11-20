package Commons.exception;

import Commons.MyRegex;

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
        String birthDay = scanner.nextLine();

        while (!MyRegex.setValidate(birthDay, MyRegex.REGEX_BIRTHDAY)) {
            try {
                throw new BirthdayException("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
            } catch (BirthdayException e) {
                e.printStackTrace();
                System.out.println("mời bạn nhập lại ngày sinh");
                birthDay = scanner.nextLine();
            }
        }
//        Cắt ngày,tháng,năm
        int getDate = Integer.parseInt(birthDay.substring(0, 2));
        int getMonth = Integer.parseInt(birthDay.substring(3, 5));
        int getYear = Integer.parseInt(birthDay.substring(6, 10));
        LocalDate birthday = LocalDate.of(getYear, getMonth, getDate);
        while (calculateAge(birthday) < 18) {
            try {
                throw new BirthdayException("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
            } catch (BirthdayException e) {
                e.printStackTrace();
                System.out.println("mời bạn nhập lại ngày sinh");
                birthDay = scanner.nextLine();
            }
        }
        return birthDay;
    }
    //    Hàm tính tuổi
    public static int calculateAge(LocalDate birthDate) {
        if ((birthDate != null)) {
            return Period.between(birthDate, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }
}

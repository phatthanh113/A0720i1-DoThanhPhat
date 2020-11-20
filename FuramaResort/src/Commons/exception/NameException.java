package Commons.exception;


import Commons.MyRegex;

import java.util.Scanner;

public class NameException extends Exception {
    static Scanner scanner = new Scanner(System.in);
    public NameException(String message) {
        super(message);
    }
//    Hàm lấy name dùng exception
    public static String getNamePerson() {
        String name = scanner.nextLine();
        while (!name.matches(MyRegex.REGEX_NAME)) {
            try {
                throw new NameException("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ (Ex : Nguyen Van A)");
            } catch (NameException e) {
                e.printStackTrace();
                System.out.println("mời bạn nhập lại tên");
                name = scanner.nextLine();
            }
        }
        return name;
    }

    public static void main(String[] args) {
        getNamePerson();
    }
}

package Commons.exception;

import Commons.MyRegex;

import java.util.Scanner;

public class EmailException extends Exception{
    static Scanner scanner = new Scanner(System.in);
    public EmailException(String message) {
        super(message);
    }
//    Hàm lấy email dùng exception
    public static String getEmail() {
        String email = scanner.nextLine();
        while (!email.matches(MyRegex.REGEX_EMAIL)){
            try {
                throw new EmailException("Email phải đúng định dạng abc@abc.abc");
            }catch (EmailException e) {
                e.printStackTrace();
                System.out.println("Mời bạn nhập lại email");
                email= scanner.nextLine();
            }
        }
        return email;
    }
}

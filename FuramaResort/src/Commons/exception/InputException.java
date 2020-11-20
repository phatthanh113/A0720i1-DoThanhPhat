package Commons.exception;

import Commons.MyRegex;
import Controllers.MainController;

import java.util.List;
import java.util.Scanner;

public class InputException extends Exception {
    static Scanner scanner= new Scanner(System.in);
    public InputException(String message) {
        super(message);
    }
    public static int getInputList(List<?> list) {
        String input = scanner.nextLine();
//        Kiểm tra list rỗng
        if(list.size() == 0) {
            System.out.println("List rỗng !! Bạn cần phải thêm phần tử vào list đầu tiên");
            MainController.displayMainMenu();
        }
        while (!input.matches(MyRegex.REGEX_POSITIVE_INTEGER) || Integer.parseInt(input) > list.size() || Integer.parseInt(input) < 0) {
            try {
                throw new InputException("Phải là số nguyên dương và số nhập vào phải bé hơn " + list.size());
            } catch (InputException e) {
                e.printStackTrace();
                System.out.println("Mời bạn nhập lại");
                input = scanner.nextLine();
            }
        }
        return Integer.parseInt(input);
    }
}

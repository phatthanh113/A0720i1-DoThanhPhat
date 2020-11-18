package Views;

import Commons.MethodFileCustomerCSV;
import Commons.MethodFileHouseCSV;
import Controllers.CheckInput;
import Models.Customer;
import Models.House;

import java.awt.*;
import java.util.*;
import java.util.List;

public class FilmController {
//    số vé được phát hành
    static Scanner scanner= new Scanner(System.in);
//    Số vé phát hành
    private static int numberTicket = 2 ;
//    Hàm thông tin khách hàng
    static List<Customer> arrayListCustomer = MethodFileCustomerCSV.getFileCSV();
//    Queue chứa khách hàng
    static Queue<Customer> customerQueue = new LinkedList<>();


    public static void displayMenuCustomerBuyTicket() {
        System.out.println("nhap su lua chon cua ban\n" +
                "1.\tCustomer buy ticket\n" +
                "2.\tDisplay number chair\n" +
                "3.\tBack to menu\n" +
                "4.\tExit\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 :
                buyTicket();
                break;
            case 2 :
                showListCustomerBuyTicket(customerQueue);
                break;
            case 3 :
                displayMenuCustomerBuyTicket();
            case 4 :
                System.exit(0);
                break;
            default:
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                displayMenuCustomerBuyTicket();
        }
    }
// Hàm mua vé : lựa chọn 1
    private static void buyTicket() {
        if(numberTicket == 0) {
            System.out.println("Đã hết vé");
            return;
        }
        System.out.println("Số vé còn lại là " + numberTicket);
        System.out.println("Bạn muốn mua vé cho khách hàng nào");
        int i = 1;
        for (Customer customer: arrayListCustomer) {
            if(customer.getName().equals("name")) continue;
            System.out.println(i + ". "+customer.getName());
            i++;
        }
        int choice = CheckInput.checkInputInterger();
       customerQueue.add(arrayListCustomer.get(choice));
       numberTicket--;
       displayMenuCustomerBuyTicket();
    }
    //    Hàm in thông tin số ghế : lựa chọn 2
    public static void showListCustomerBuyTicket(Queue<Customer> queue) {
        int indexChair = 1;
        for (Customer customer : queue) {
            System.out.println("Ghế của bạn ở vị trí số "+ indexChair + ";Thông tin khách hàng "+customer.toString());
            indexChair++;
        }
    }
    public static void main(String[] args) {
        displayMenuCustomerBuyTicket();
    }
}

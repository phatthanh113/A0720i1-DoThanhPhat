package Controllers;

import Commons.MethodFileCustomerCSV;
import Commons.exception.*;
import Models.Customer;

import java.util.*;

public class CustomerController {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> listCustomer = MethodFileCustomerCSV.getFileCSV();
    //    Hàm write Customer
    static void addNewCustomer() {
        Customer customer = new Customer();
            System.out.println("Input Name ");
            customer.setName(NameException.getNamePerson());
            System.out.println("Input Day Of Birth");
            customer.setDayOfBirth(BirthdayException.getBirthday());
            System.out.println("Input Gender");
            customer.setGender(GenderException.getGender());
            System.out.println("Input id Number");
            customer.setIdNumber(IdException.getId());
            System.out.println("Input phone number");
            customer.setPhoneNumber(PhoneException.getPhone());
            System.out.println("Input Customer Type");
            customer.setCustomerType(scanner.nextLine());
            System.out.println("Input Address");
            customer.setAddress(scanner.nextLine());
// Add customer
        listCustomer.add(customer);
        MethodFileCustomerCSV.writeToCSV(listCustomer);
//
        System.out.println("add new villa completed");
        MainController.displayMainMenu();
    }
    //    Hàm show Tất cả customer
    public static void showAllCustomer()  {

        for (Customer customer : listCustomer) {
            System.out.println(customer);
            System.out.println("--------------------");
        }
        MainController.displayMainMenu();
    }
//    Hàm show thông tin khách hàng
    public static void showInfomationCustomer() {
        if(listCustomer.get(0).getName().equals("name")) listCustomer.remove(0);
        Collections.sort(listCustomer);
        System.out.println("bạn muốn xem thông tin khách hàng nào");
        int i = 1;
        for (Customer customer : listCustomer) {
            System.out.println(i + ". " + customer.getName());
            i++;
        }
                int choice = InputException.getInputList(listCustomer);
        System.out.println(listCustomer.get(choice-1));
        //        Trở về màn hình chính
        MainController.displayMainMenu();
    }
}

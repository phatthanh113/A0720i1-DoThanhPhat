package Controllers;

import Commons.MethodFileCustomerCSV;
import Models.Customer;

import java.util.*;

public class CustomerController {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Customer> listCustomer = MethodFileCustomerCSV.getFileCSV();
    //    Hàm write Customer
    static void addNewCustomer() {
        Customer customer = new Customer();
        try {
            System.out.println("Input Name ");
            customer.setName(scanner.nextLine());
            System.out.println("Input Day Of Birth");
            customer.setDayOfBirth(scanner.nextLine());
            System.out.println("Input Gender");
            customer.setGender(scanner.nextLine());
            System.out.println("Input id Number");
            customer.setIdNumber(scanner.nextLine());
            System.out.println("Input phone number");
            customer.setPhoneNumber(scanner.nextLine());
            System.out.println("Input Customer Type");
            customer.setCustomerType(scanner.nextLine());
            System.out.println("Input Address");
            customer.setAddress(scanner.nextLine());
        }catch (Exception e) {
            System.out.println("error input");
        }
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
            System.out.println("================");
            System.out.println("Name  :" + customer.getName());
            System.out.println("Day of birth :" + customer.getDayOfBirth());
            System.out.println("Gender :" + customer.getGender());
            System.out.println("ID number :" + customer.getIdNumber());
            System.out.println("Phone number :" + customer.getPhoneNumber());
            System.out.println("Customer Type :" + customer.getCustomerType());
            System.out.println("Address:" + customer.getAddress());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }
//    Hàm show thông tin khách hàng
    public static void showInfomationCustomer() {
        ArrayList<Customer> listCustomerSorted = new ArrayList<>();
        for (Customer customer : listCustomer) {
            if (customer.getName().equals("name")) {
                continue;
            }
            listCustomerSorted.add(customer);
        }
        Collections.sort(listCustomerSorted);
        System.out.println("bạn muốn xem thông tin khách hàng nào");
        int i = 1;
        for (Customer customer : listCustomerSorted) {
            System.out.println(i + ". " + customer.getName());
            i++;
        }
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println(listCustomerSorted.get(choice-1));
        //        Trở về màn hình chính
        MainController.displayMainMenu();
        scanner.nextLine();
    }
}

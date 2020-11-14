package Controllers;

import Commons.MethodFileCustomerCSV;
import Commons.MethodFileHouseCSV;
import Models.Customer;
import Models.House;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CustomerController {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Customer> listCustomer = new ArrayList<>();
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
    public static void showAllCustomer() throws Exception {
        listCustomer = MethodFileCustomerCSV.getFileCSV();
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
    public static void showInfomationCustomer(){
        listCustomer = MethodFileCustomerCSV.getFileCSV();
        Collections.sort(listCustomer, (customer, oCustomer) -> {
//                Điều kiện name
            int tempName = customer.getName().compareTo(oCustomer.getName());
            if (tempName != 0) {
                return tempName;
            } else {
//                    Điều kiện year
                int tempYear = Integer.parseInt(customer.getDayOfBirth().substring(6, 10)) - Integer.parseInt(oCustomer.getDayOfBirth().substring(6, 10));
                return tempYear;
            }
        });
        ArrayList listNameCustomer = new ArrayList();
        for (Customer customer : listCustomer) {
            listNameCustomer.add(customer.getName());
        }
        System.out.println("Bạn muốn xem thông tin của khách hàng nào");
        for (int i = 1; i <listNameCustomer.size() ; i++) {
            System.out.println(i+". "+listNameCustomer.get(i));
        }
//        Nhớ tạo exception
        int choice = scanner.nextInt();
        System.out.println(listCustomer.get(choice));
    }
}

package Controllers;

import Commons.*;
import Models.*;
import javafx.concurrent.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class BookingController {
    static Scanner scanner= new Scanner(System.in);
    static Services services;
    static List<Customer> listBookingCustomer = MethodFileBookingCSV.getFileCSV(services);
    static List<Customer> listCustomer = MethodFileCustomerCSV.getFileCSV();;
    static List<Villa> listVilla= MethodFileVillaCSV.getFileCSV();
    static List<House> listHouse = MethodFileHouseCSV.getFileCSV();
    static List<Room> listRoom = MethodFileRoomCSV.getFileCSV();
    public static void addNewBooking() {
        System.out.println("Bạn muốn booking cho khách hàng nào");
        for (int i = 1; i < listCustomer.size(); i++) {
            System.out.println(i+ ". "+listCustomer.get(i).getName());
        }
//        Chọn khách hàng muốn booking
        int choice = Integer.parseInt(scanner.nextLine());
//        Chọn loại dịch vụ cần booking
        System.out.println("Bạn muốn booking loại dịch vụ nào"+
                "1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n");
        int choiceService = Integer.parseInt(scanner.nextLine());
        switch (choiceService) {
            case 1 :
                Villa villa = bookingVilla();
//                Thêm khách hàng vào list booking
                listBookingCustomer.add(listCustomer.get(choice));
//                Ghi khách hàng vào danh sách booking
                MethodFileBookingCSV.writeToCSV(listBookingCustomer,listCustomer.get(choice).useServices(bookingVilla()));
                break;
            case 2 :
                //                Thêm khách hàng vào list booking house
                listBookingCustomer.add(listCustomer.get(choice));
                MethodFileBookingCSV.writeToCSV(listBookingCustomer,listCustomer.get(choice).useServices(bookingHouse()));
                break;
            case 3 :
                //                Thêm khách hàng vào list booking room
                listBookingCustomer.add(listCustomer.get(choice));
                MethodFileBookingCSV.writeToCSV(listBookingCustomer,listCustomer.get(choice).useServices(bookingRoom()));
                break;
        }
        MainController.displayMainMenu();
    }
//    Hàm booking villa
    private static Villa bookingVilla() {
        System.out.println("Danh sách các villa có trong hệ thống");
        for (int i = 1; i < listVilla.size(); i++) {
            System.out.println(i+ ". "+listVilla.get(i).getNameService());
        }
        System.out.println("Bạn muốn chọn căn villa nào");
        int choiceVilla = Integer.parseInt(scanner.nextLine());
        return listVilla.get(choiceVilla);
    }
//    Hàm booking house
    private static House bookingHouse() {
        System.out.println("Danh sách các house có trong hệ thống");
        for (int i = 0; i < listHouse.size(); i++) {
            System.out.println(i+ ". "+listHouse.get(i).getNameService());
        }
        System.out.println("Bạn muốn chọn căn house nào");
        int choiceHouse = Integer.parseInt(scanner.nextLine());
        return listHouse.get(choiceHouse);
    }
//    Hàm booking room
    private static Room bookingRoom() {
        System.out.println("Danh sách các room có trong hệ thống");
        for (int i = 0; i < listRoom.size(); i++) {
            System.out.println(i+ ". "+listRoom.get(i).getNameService());
        }
        System.out.println("Bạn muốn chọn căn villa nào");
        int choiceRoom = Integer.parseInt(scanner.nextLine());
        return listRoom.get(choiceRoom);
    }
}

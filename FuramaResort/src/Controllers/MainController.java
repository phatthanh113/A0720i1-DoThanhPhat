package Controllers;

import Models.Villa;
import Views.FilmController;
import Views.StorageEmployee;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);

    //    Ham hien thi menu
    public static void displayMainMenu(){
        System.out.println("Ban chon lua chon nao\n" +
                "1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tBooking ticket for customer\n" +
                "8.\tSearch Employee\n" +
                "9.\tExit\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                CustomerController.addNewCustomer();
                break;
            case 4:
                CustomerController.showInfomationCustomer();
                break;
            case 5:
                BookingController.addNewBooking();
                break;
            case 6:
                EmployeeController.showInformationEmployee();
                break;
            case 7:
                FilmController.displayMenuCustomerBuyTicket();
                break;
            case 8:
                StorageEmployee.searchEmployee();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                displayMainMenu();
        }
    }


    //Ham them dich vu
    public static void addNewServices() {
        System.out.println("nhap su lua chon cua ban\n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                VillaController.addNewVilla();
                break;
            case 2:
                HouseController.addNewHouse();
                break;
            case 3:
                RoomController.addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                addNewServices();
        }
    }

    //Ham hien thi dich vu
    private static void showServices() {
        System.out.println("nhap su lua chon cua ban\n" +
                "1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                VillaController.showAllVilla();
                break;
            case 2:
                HouseController.showAllHouse();
                break;
            case 3:
                RoomController.showAllRoom();
                break;
            case 4:
                VillaController.showAllVillaNotDuplicate();
                break;
            case 5:
                HouseController.showAllHouseNotDuplicate();
                break;
            case 6:
                RoomController.showAllRoomNotDuplicate();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                showServices();
                break;
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}


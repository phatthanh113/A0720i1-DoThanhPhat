package controllers;

import models.SoTietKiemCoThoiHan;
import models.SoTietKiemDaiHan;
import models.SoTietKiemVoThoiHan;

import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    //    Ham hien thi menu
    public static void displayMainMenu(){
        System.out.println("Ban chon lua chon nao\n" +
                "1.\t Them Moi STK\n" +
                "2.\t Xoa So Tiet Kiem\n" +
                "3.\tXem Danh sach STK\n" +
                "4.\tXem Thong tin Khach hang\n" +
                "5.\tTìm kiem so tiet kiem\n" +
                "6.\tThoat\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
            addSoTietKiem();
                break;
            case 2:
            deleteSoTietKiem();
                break;
            case 3:
            displayMainMenu();
                break;
            case 4:

                break;
            case 5:
                searchSoTietKiem();
                break;

            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                displayMainMenu();
        }
    }
    public static void addSoTietKiem() {
        System.out.println("Ban chon lua chon nao\n" +
                "1.\t STKDH\n" +
                "2.\t STKCTH\n" +
                "3.\tSTKVTH\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                SoTietKiemDaiHanController.addNewSTKDH();
                displayMainMenu();
                break;
            case 2:
                SoTietKiemCoThoiHanController.addNewSTKCTH();
                displayMainMenu();
                break;
            case 3:
                SoTietKiemVoThoiHanController.addNewSTKVTH();
                displayMainMenu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                addSoTietKiem();
        }
    }
        public static void deleteSoTietKiem() {
            System.out.println("Ban chon lua chon nao\n" +
                    "1.\t Delete STKDH\n" +
                    "2.\t Delete STKCTH\n" +
                    "3.\t Delete STKVTH\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    SoTietKiemDaiHanController.deleteSTKDH();
                    displayMainMenu();
                    break;
                case 2:
                    SoTietKiemCoThoiHanController.deleteSTKCTH();
                    displayMainMenu();
                    break;
                case 3:
                    SoTietKiemVoThoiHanController.deleteSTKCTH();
                    displayMainMenu();
                    break;
                default:
                    System.out.println("fail !press enter to again");
                    scanner.nextLine();
                    searchSoTietKiem();
            }
    }
    public static void searchSoTietKiem() {
        System.out.println("Ban chon lua chon nao\n" +
                "1.\t STKDH\n" +
                "2.\t STKCTH\n" +
                "3.\tSTKVTH\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                SoTietKiemDaiHanController.setSTKDH_List();
                displayMainMenu();
                break;
            case 2:
                SoTietKiemCoThoiHanController.setSTCTH_List();
                displayMainMenu();
                break;
            case 3:
                SoTietKiemVoThoiHanController.setSTKVTH_List();
                displayMainMenu();
                break;
            default:
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                addSoTietKiem();
        }
    }
    public static String getString() {
        System.out.println("mời bạn nhập");
        String string = scanner.nextLine();
        return string;
    }
    public static void main(String[] args) {
        displayMainMenu();
    }
}

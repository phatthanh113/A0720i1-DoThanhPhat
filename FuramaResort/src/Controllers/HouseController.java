package Controllers;

import Commons.MethodFileHouseCSV;
import Commons.MethodFileVillaCSV;
import Models.House;
import Models.Services;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseController {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<House> listHouse = new ArrayList<>();
    //    Hàm write villa
    static void addNewHouse() {
        Services house = new House(null,0,0,0,0,0);

        try {
            System.out.println("Input Name Services");
            house.setNameService(scanner.nextLine());
            System.out.println("Input UsedArea");
            house.setUsedArea(scanner.nextDouble());
            System.out.println("Input priceRent");
            house.setPriceRent(scanner.nextDouble());
            System.out.println("Input NumberPeople");
            house.setNumberPeople(scanner.nextInt());
            System.out.println("Input RentType");
            house.setRentType(scanner.nextInt());
            System.out.println("Input Id");
            house.setId(scanner.nextInt());
            System.out.println("Input Standards Room");
            scanner.skip("\n");
            ((House) house).setStandardsRoom(scanner.nextLine());
            System.out.println("Input Facilities");
            ((House) house).setFacilities(scanner.nextLine());
            System.out.println("Input Floor");
            ((House) house).setFloor(scanner.nextInt());
        }catch (Exception e) {
            System.out.println("error input");
        }
// Add house
        listHouse.add((House) house);
        MethodFileHouseCSV.writeToCSV(listHouse);

//
        System.out.println("add new villa completed");
        MainController.displayMainMenu();
    }
    //    Hàm show House
    public static void showAllHouse() {
        listHouse = MethodFileHouseCSV.getFileCSV();
        for (House house : listHouse) {
            System.out.println("================");
            System.out.println("Name Services :" + house.getNameService());
            System.out.println("Used Area :" + house.getUsedArea());
            System.out.println("Price Rent :" + house.getPriceRent());
            System.out.println("NumberPeople :" + house.getNumberPeople());
            System.out.println("RentType :" + house.getRentType());
            System.out.println("ID :" + house.getId());
            System.out.println("StardRoom :" + house.getStandardsRoom());
            System.out.println("Facilities :" + house.getFacilities());
            System.out.println("Floor :" + house.getFloor());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }
}

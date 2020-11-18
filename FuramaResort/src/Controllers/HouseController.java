package Controllers;

import Commons.MethodFileHouseCSV;
import Models.House;
import Models.Services;


import java.util.*;

public class HouseController {
    static Scanner scanner = new Scanner(System.in);
    static List<House> listHouse = MethodFileHouseCSV.getFileCSV();

    //    Hàm write villa
    static void addNewHouse() {
        Services house = new House(null, 0, 0, 0, 0, 0);

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
            scanner.skip("\n");
        } catch (Exception e) {
            System.out.println("error input");
        }
// Ghi house vào file CSV
        listHouse.add((House) house);
        MethodFileHouseCSV.writeToCSV((ArrayList<House>) listHouse);

//
        System.out.println("add new villa completed");
        MainController.displayMainMenu();
    }

    //    Hàm show House
    public static void showAllHouse() {
        for (House house : listHouse) {
            System.out.println("================");
            System.out.println(house.toString());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }

    public static void showAllHouseNotDuplicate() {
        Set<House> listHouseNotDuplicate = new TreeSet<>();
        for (House house : listHouseNotDuplicate) {
            if (house.getNameService().equals("nameServices")) continue;
            listHouseNotDuplicate.add(house);
        }
        System.out.println("Danh sách các villa không bị trùng tên");
        int i = 0;
        for (House house : listHouseNotDuplicate) {
            System.out.println(i + ". " + house.getNameService());
            i++;
        }
    }
}

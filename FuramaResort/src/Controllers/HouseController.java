package Controllers;

import Commons.MethodFileHouseCSV;
import Commons.MyRegex;
import Models.House;
import Models.Services;


import java.util.*;

public class HouseController {
    static Scanner scanner = new Scanner(System.in);
    static List<House> listHouse = MethodFileHouseCSV.getFileCSV();

    //    Hàm write villa
    static void addNewHouse() {
        Services house = new House();
        //       Set các thuộc tính của house
            System.out.println("Input Name Services");
            house.setNameService(MyRegex.getName());
            System.out.println("Input UsedArea");
            house.setUsedArea(Double.parseDouble(MyRegex.getArea()));
            System.out.println("Input priceRent");
            house.setPriceRent(Double.parseDouble(MyRegex.getPrice()));
            System.out.println("Input NumberPeople");
            house.setNumberPeople(Integer.parseInt(MyRegex.getNumberPeople()));
            System.out.println("Input RentType");
            house.setRentType(MyRegex.getName());
            System.out.println("Input Id");
            house.setId(MyRegex.getId(MyRegex.REGEX_ID_HOUSE));
            System.out.println("Input Standards Room");
            ((House) house).setStandardsRoom(MyRegex.getName());
            System.out.println("Input Facilities");
            ((House) house).setFacilities(MyRegex.getName());
            System.out.println("Input Floor");
            ((House) house).setFloor(Integer.parseInt(MyRegex.getFloor()));
// Ghi house vào file CSV
        listHouse.add((House) house);
        MethodFileHouseCSV.writeToCSV(listHouse);

//
        System.out.println("add new house completed");
        MainController.displayMainMenu();
    }

    //    Hàm show House
    public static void showAllHouse() {
        for (House house : listHouse) {
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
        System.out.println("Danh sách các house không bị trùng tên");
        int i = 0;
        for (House house : listHouseNotDuplicate) {
            System.out.println(i + ". " + house.getNameService());
            i++;
        }
    }
}

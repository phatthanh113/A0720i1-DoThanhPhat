package Controllers;

import Commons.MethodFileVillaCSV;
import Commons.MyRegex;
import Models.Services;
import Models.Villa;


import java.util.*;
import java.util.zip.DeflaterOutputStream;

public class VillaController {
    static Scanner scanner = new Scanner(System.in);
    static List<Villa> listVilla = MethodFileVillaCSV.getFileCSV();

    //            Hàm write villa
    static void addNewVilla() {
        Services villa = new Villa();
//       Set các thuộc tính của VIlla
        System.out.println("Input Name Services");
        villa.setNameService(MyRegex.getName());
        System.out.println("Input UsedArea (Must > 30)(m2)");
        villa.setUsedArea(Double.parseDouble(MyRegex.getArea()));
        System.out.println("Input priceRent");
        villa.setPriceRent(Double.parseDouble(MyRegex.getPrice()));
        System.out.println("Input NumberPeople");
        villa.setNumberPeople(Integer.parseInt(MyRegex.getNumberPeople()));
        System.out.println("Input RentType");
        villa.setRentType(MyRegex.getName());
        System.out.println("Input Id");
        villa.setId(MyRegex.getId(MyRegex.REGEX_ID_VILLA));
        System.out.println("Input Standards Room");
        ((Villa) villa).setStandardsRoom(MyRegex.getName());
        System.out.println("Input Facilities");
        ((Villa) villa).setFacilities(MyRegex.getName());
        System.out.println("Input Area Pool");
        ((Villa) villa).setAreaPool(Double.parseDouble(MyRegex.getArea()));
        System.out.println("Input Floor");
        ((Villa) villa).setFloor(Integer.parseInt(MyRegex.getFloor()));
//      Ghi villa vào file CSV
        listVilla.add((Villa) villa);
        MethodFileVillaCSV.writeToCSV(listVilla);
//
        System.out.println("add new villa completed");
        MainController.displayMainMenu();
    }

    //       Hàm show Villa
    public static void showAllVilla() {
        for (Villa villa : listVilla) {
            System.out.println(villa.toString());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }

    //    Hàm show Villa không bị lặp tên
    public static void showAllVillaNotDuplicate() {
        Set<Villa> listVillaNotDuplicate = new TreeSet<>();
        for (Villa villa : listVilla) {
            if (villa.getNameService().equals("nameServices")) continue;
            listVillaNotDuplicate.add(villa);
        }
        int i = 1;
        System.out.println("Danh sách các villa không bị trùng tên");
        for (Villa villa : listVillaNotDuplicate) {
            System.out.println(i + ". " + villa.getNameService());
            i++;
        }
    }

    public static void main(String[] args) {
        listVilla.remove(1);
        MethodFileVillaCSV.writeToCSV(listVilla);
    }
}
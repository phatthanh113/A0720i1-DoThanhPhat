package Controllers;

import Commons.MethodFileVillaCSV;
import Models.Services;
import Models.Villa;

import java.util.*;

public class VillaController {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Villa> listVilla = MethodFileVillaCSV.getFileCSV();;
//    Hàm write villa
    static void addNewVilla() {
        Services villa = new Villa(null,0,0,0,0,0);
        try {
            System.out.println("Input Name Services");
            villa.setNameService(scanner.nextLine());
            System.out.println("Input UsedArea");
            villa.setUsedArea(scanner.nextDouble());
            System.out.println("Input priceRent");
            villa.setPriceRent(scanner.nextDouble());
            System.out.println("Input NumberPeople");
            villa.setNumberPeople(scanner.nextInt());
            System.out.println("Input RentType");
            scanner.skip("\n");
            villa.setRentType(scanner.nextInt());
            System.out.println("Input Id");
            villa.setId(scanner.nextInt());
            System.out.println("Input Standards Room");
            ((Villa) villa).setStandardsRoom(scanner.nextLine());
            System.out.println("Input Facilities");
            ((Villa) villa).setFacilities(scanner.nextLine());
            System.out.println("Input Area Pool");
            ((Villa) villa).setAreaPool(scanner.nextDouble());
            System.out.println("Input Floor");
            ((Villa) villa).setFloor(scanner.nextInt());
        }catch (Exception e) {
            System.out.println("error input");
        }
//
        listVilla.add((Villa) villa);
        MethodFileVillaCSV.writeToCSV(listVilla);

//
        System.out.println("add new villa completed");
        MainController.displayMainMenu();
    }
//    Hàm show Villa
    public static void showAllVilla() {
        for (Villa villa : listVilla) {
            System.out.println("================");
            System.out.println("Name Services :" + villa.getNameService());
            System.out.println("Used Area :" + villa.getUsedArea());
            System.out.println("Price Rent :" + villa.getPriceRent());
            System.out.println("NumberPeople :" + villa.getNumberPeople());
            System.out.println("RentType :" + villa.getRentType());
            System.out.println("ID :" + villa.getId());
            System.out.println("StardRoom :" + villa.getStandardsRoom());
            System.out.println("Facilities :" + villa.getFacilities());
            System.out.println("getAreaPool :" + villa.getAreaPool());
            System.out.println("Floor :" + villa.getFloor());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }
    public static void showAllVillaNotDuplicate() {
        Set<Villa> listVillaNotDuplicate = new TreeSet<>();
        for (Villa villa: listVilla) {
            if(villa.getNameService().equals("nameServices")) continue;
            listVillaNotDuplicate.add(villa);
        }
        int i = 1 ;
        System.out.println("Danh sách các villa không bị trùng tên");
        for (Villa villa : listVillaNotDuplicate) {
            System.out.println(i+ ". "+villa.getNameService());
            i++;
        }
    }
}

package Controllers;

import Commons.MethodFileRoomCSV;
import Commons.MethodFileVillaCSV;
import Models.Services;
import Models.Villa;
import Models.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomController {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Room> listRoom = new ArrayList<>();
    //    Hàm write villa
    static void addNewRoom() {
        Services room = new Room(null,0,0,0,0,0);
        try {
            System.out.println("Input Name Services");
            room.setNameService(scanner.nextLine());
            System.out.println("Input UsedArea");
            room.setUsedArea(scanner.nextDouble());
            System.out.println("Input priceRent");
            room.setPriceRent(scanner.nextDouble());
            System.out.println("Input NumberPeople");
            room.setNumberPeople(scanner.nextInt());
            System.out.println("Input RentType");
            room.setRentType(scanner.nextInt());
            System.out.println("Input Id");
            room.setId(scanner.nextInt());
            System.out.println("Input Free Services");
            ((Room) room).setFreeServices(scanner.nextLine());

        }catch (Exception e) {
            System.out.println("error input");
        }
//
        listRoom.add((Room) room);
        MethodFileRoomCSV.writeToCSV(listRoom);

//
        System.out.println("add new villa completed");
        MainController.displayMainMenu();
    }
    //    Hàm show Villa
    public static void showAllRoom() {
        listRoom = MethodFileRoomCSV.getFileCSV();
        for (Room room : listRoom) {
            System.out.println("================");
            System.out.println("Name Services :" + room.getNameService());
            System.out.println("Used Area :" + room.getUsedArea());
            System.out.println("Price Rent :" + room.getPriceRent());
            System.out.println("NumberPeople :" + room.getNumberPeople());
            System.out.println("RentType :" + room.getRentType());
            System.out.println("ID :" + room.getId());
            System.out.println("Free Services :" + room.getFreeServices());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }
}

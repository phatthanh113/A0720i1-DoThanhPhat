package Controllers;

import Commons.MethodFileRoomCSV;
import Commons.MethodFileVillaCSV;
import Commons.MyRegex;
import Models.House;
import Models.Services;
import Models.Villa;
import Models.Room;

import java.util.*;

public class RoomController {
    static Scanner scanner = new Scanner(System.in);
    static List<Room> listRoom = new ArrayList<>();
    //    Hàm write villa
    static void addNewRoom() {
        Services room = new Room();
//       Set các thuộc tính của room
            System.out.println("Input Name Services");
            room.setNameService(MyRegex.getName());
            System.out.println("Input UsedArea");
            room.setUsedArea(Double.parseDouble(MyRegex.getArea()));
            System.out.println("Input priceRent");
            room.setPriceRent(Double.parseDouble(MyRegex.getPrice()));
            System.out.println("Input NumberPeople");
            room.setNumberPeople(Integer.parseInt(MyRegex.getNumberPeople()));
            System.out.println("Input RentType");
            room.setRentType(MyRegex.getName());
            System.out.println("Input Id");
            room.setId(MyRegex.getId(MyRegex.REGEX_ID_ROOM));
            System.out.println("Input Free Services");
            ((Room) room).setFreeServices(MyRegex.getName());

//
        listRoom.add((Room) room);
        MethodFileRoomCSV.writeToCSV(listRoom);

//
        System.out.println("add new room completed");
        MainController.displayMainMenu();
    }
    //    Hàm show Villa
    public static void showAllRoom() {
        listRoom = MethodFileRoomCSV.getFileCSV();
        for (Room room : listRoom) {
            System.out.println(room.toString());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }
    public static void showAllRoomNotDuplicate() {
        Set<Room> listRoomNotDuplicate = new TreeSet<>();
        for (Room room: listRoomNotDuplicate) {
            if(room.getNameService().equals("nameServices")) continue;
            listRoomNotDuplicate.add(room);
        }
        int i = 0 ;
        System.out.println("Danh sách các room không bị trùng tên");
        for (Room room : listRoomNotDuplicate) {
            System.out.println(i+ ". "+room.getNameService());
            i++;
        }
    }
}

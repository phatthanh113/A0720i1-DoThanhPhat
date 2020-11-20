package Models;

public class Room extends Services implements Comparable<Room>{
    private String freeServices ;


    @Override
    public void showInfo() {

    }

    public Room() {
    }

    public Room(String nameService, double usedArea, double priceRent, int numberPeople, String rentType, String id) {
        super(nameService, usedArea, priceRent, numberPeople, rentType, id);
    }

    public Room(String nameService, double usedArea, double priceRent, int numberPeople, String rentType, String id, String freeServices) {
        super(nameService, usedArea, priceRent, numberPeople, rentType, id);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                "} " + super.toString();
    }
    @Override
    public int compareTo(Room room) {
        return this.getNameService().compareTo(room.getNameService());
    }
}

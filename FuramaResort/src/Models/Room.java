package Models;

public class Room extends Services{
    private String freeServices ;


    @Override
    public void showInfo() {

    }

    public Room(String nameService, double usedArea, double priceRent, int numberPeople, int rentType, int id) {
        super(nameService, usedArea, priceRent, numberPeople, rentType, id);
    }

    public Room(String nameService, double usedArea, double priceRent, int numberPeople, int rentType, int id, String freeServices) {
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

}

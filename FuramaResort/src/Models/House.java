package Models;

public class House extends Services implements Comparable<House>{
    private String standardsRoom;
    private String facilities ;
    private int floor ;


    @Override
    public void showInfo() {

    }

    public House() {
    }

    public House(String nameService, double usedArea, double priceRent, int numberPeople, String rentType, String id) {
        super(nameService, usedArea, priceRent, numberPeople, rentType, id);
    }

    public House(String nameService, double usedArea, double priceRent, int numberPeople, String rentType, String id, String standardsRoom, String facilities, int floor) {
        super(nameService, usedArea, priceRent, numberPeople, rentType, id);
        this.standardsRoom = standardsRoom;
        this.facilities = facilities;
        this.floor = floor;
    }

    public String getStandardsRoom() {
        return standardsRoom;
    }

    public void setStandardsRoom(String standardsRoom) {
        this.standardsRoom = standardsRoom;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "stadardRoom='" + standardsRoom + '\'' +
                ", facilities='" + facilities + '\'' +
                ", floor=" + floor +
                "} " + super.toString();
    }
    @Override
    public int compareTo(House house) {
        return this.getNameService().compareTo(house.getNameService());
    }

}

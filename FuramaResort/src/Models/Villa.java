package Models;

public class Villa extends Services {
    private String standardsRoom;
    private String facilities ;
    private double areaPool ;
    private int floor ;

    public Villa(String nameService, double usedArea, double priceRent, int numberPeople, int rentType, int id) {
        super(nameService, usedArea, priceRent, numberPeople, rentType, id);
    }

    public Villa(String nameService, double usedArea, double priceRent, int numberPeople, int rentType, int id, String standardsRoom, String facilities, double areaPool, int floor) {
        super(nameService, usedArea, priceRent, numberPeople, rentType, id);
        this.standardsRoom = standardsRoom;
        this.facilities = facilities;
        this.areaPool = areaPool;
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public String toString() {
        return "Villa{" +
                "stadardRoom='" + standardsRoom + '\'' +
                ", facilities='" + facilities + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                "} " + super.toString();
    }
}

package model.entity;

public class House extends Service {
    private String stardardRoom ;
    private String descriptionOtherConvenience ;
    private String numberOfFloor ;

    public House() {
    }

    public House(String name, String area, String cost, String maxPeople, String rentType, String rentTypeId, String stardardRoom, String descriptionOtherConvenience, String numberOfFloor) {
        super(name, area, cost, maxPeople, rentType, rentTypeId);
        this.stardardRoom = stardardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStardardRoom() {
        return stardardRoom;
    }

    public void setStardardRoom(String stardardRoom) {
        this.stardardRoom = stardardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}

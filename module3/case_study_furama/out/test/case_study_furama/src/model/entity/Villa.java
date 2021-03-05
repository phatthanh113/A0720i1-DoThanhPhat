package model.entity;

public class Villa extends House {
    private String areaPool ;

    public Villa() {
    }

    public Villa(String name, String area, String cost, String maxPeople, String rentType, String rentTypeId, String stardardRoom, String descriptionOtherConvenience, String numberOfFloor, String areaPool) {
        super(name, area, cost, maxPeople, rentType, rentTypeId, stardardRoom, descriptionOtherConvenience, numberOfFloor);
        this.areaPool = areaPool;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }
}

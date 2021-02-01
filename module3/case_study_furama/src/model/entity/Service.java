package model.entity;

public abstract class Service {
    private String name ;
    private String area ;
    private String cost ;
    private String maxPeople ;
    private String rentType ;
    private String rentTypeId ;

    public Service() {
    }

    public Service(String name, String area, String cost, String maxPeople, String rentType, String rentTypeId) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.rentTypeId = rentTypeId;
    }
}

package Models;

public abstract class Services {
        private String nameService ;
        private double usedArea ;
        private double priceRent ;
        private int numberPeople ;
        private String rentType ;
        private String id ;
        private AccompanyServices accompanyServices;
        public abstract void showInfo() ;

    public Services(String nameService, double usedArea, double priceRent, int numberPeople, String rentType, String id) {
        this.nameService = nameService;
        this.usedArea = usedArea;
        this.priceRent = priceRent;
        this.numberPeople = numberPeople;
        this.rentType = rentType;
        this.id = id;
    }

    public Services(AccompanyServices accompanyServices) {
        this.accompanyServices = accompanyServices;
    }

    public AccompanyServices getAccompanyServices() {
        return accompanyServices;
    }

    public void setAccompanyServices(AccompanyServices accompanyServices) {
        this.accompanyServices = accompanyServices;
    }

    public Services() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(double priceRent) {
        this.priceRent = priceRent;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Services{" +
                "nameService='" + nameService + '\'' +
                ", usedArea=" + usedArea +
                ", priceRent=" + priceRent +
                ", numberPeople=" + numberPeople +
                ", rentType=" + rentType +
                ", id=" + id +
                '}';
    }
}

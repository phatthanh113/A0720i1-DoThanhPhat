package Models;

public abstract class Services {
        private String nameService ;
        private double usedArea ;
        private double priceRent ;
        private int numberPeople ;
        private int rentType ;
        private int id ;
        public abstract void showInfo() ;

    public Services(String nameService, double usedArea, double priceRent, int numberPeople, int rentType, int id) {
        this.nameService = nameService;
        this.usedArea = usedArea;
        this.priceRent = priceRent;
        this.numberPeople = numberPeople;
        this.rentType = rentType;
        this.id = id;
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

    public int getRentType() {
        return rentType;
    }

    public void setRentType(int rentType) {
        this.rentType = rentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

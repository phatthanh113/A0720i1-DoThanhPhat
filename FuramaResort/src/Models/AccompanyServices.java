package Models;

public class AccompanyServices {
    private String nameService ;
    private int number ;
    private double priceService ;

    public AccompanyServices() {
    }

    public AccompanyServices(String nameService, int number, double priceService) {
        this.nameService = nameService;
        this.number = number;
        this.priceService = priceService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPriceService() {
        return priceService;
    }

    public void setPriceService(double priceService) {
        this.priceService = priceService;
    }
}

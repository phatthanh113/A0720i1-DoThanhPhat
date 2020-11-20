package Models;

public class AccompanyServices {
    private String nameService ;
    private String number ;
    private String priceService ;

    public AccompanyServices() {
    }

    public AccompanyServices(String nameService, String number, String priceService) {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPriceService() {
        return priceService;
    }

    public void setPriceService(String priceService) {
        this.priceService = priceService;
    }
}

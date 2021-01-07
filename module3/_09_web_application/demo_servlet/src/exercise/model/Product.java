package exercise.model;

public class Product {
    private String name;
    private String listPrice ;
    private String percentDiscount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public String getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(String percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public Product(String name, String listPrice, String percentDiscount) {
        this.name = name;
        this.listPrice = listPrice;
        this.percentDiscount = percentDiscount;
    }

}

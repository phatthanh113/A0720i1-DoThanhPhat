package model;

public class ShopDTO {
    private String id;
    private String name;
    private String productName;
    private String price;

    public ShopDTO() {
    }

    public ShopDTO(String id, String name, String productName, String price) {
        this.id = id;
        this.name = name;
        this.productName = productName;
        this.price = price;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}

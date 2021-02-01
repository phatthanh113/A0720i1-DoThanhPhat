package model.entity;

public class Customer {
    private int id ;
    private int idProduct ;
    private String name ;
    private String birthday ;

    public Customer() {
    }

    public Customer(int id, int idProduct, String name, String birthday) {
        this.id = id;
        this.idProduct = idProduct;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

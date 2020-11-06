package _12_map.exercise.array_list;

public class Product implements Comparable<Product> {
    private String name ;
    private int id ;
    private int price ;

    public Product() {
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public Product(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Product product) {
        return this.price- product.getPrice() ;
    }
}

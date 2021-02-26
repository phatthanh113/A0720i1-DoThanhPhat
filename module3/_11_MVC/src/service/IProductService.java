package service;

import model.Customer;
import model.Product;
import model.ShopDTO;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(String id);

    List<Product> findByName(String name);

    void update(String id, Product product);

    void remove(String id);

    List<ShopDTO> getCustomer();
}

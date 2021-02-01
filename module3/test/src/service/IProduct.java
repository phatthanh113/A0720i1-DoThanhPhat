package service;

import model.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProduct {
    void insertProduct(Product product) ;

    Product getProduct(int id) ;

    List<Product> getAllProduct();

    void deleteProduct(int id) ;

    void updateProduct(Product product) ;

    List<Product> searchProductByName(String name);
}

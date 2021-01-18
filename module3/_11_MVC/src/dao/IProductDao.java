package dao;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao {
    void insertProduct(Product product) throws SQLException;

    Product getProduct(String id) throws SQLException;

    List<Product> getAllProduct() throws SQLException;

    boolean deleteProduct(String id) throws SQLException;

    boolean updateProduct(Product product) throws SQLException;

}


package service.impl;


import dao.IProductDao;
import dao.impl.ProductDaoImpl;
import model.entity.Customer;
import model.entity.Product;
import service.IProduct;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class ProductImpl implements IProduct {
    IProductDao productDao = new ProductDaoImpl();
    @Override
    public void insertProduct(Product product) {
        try {
            productDao.insertProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product getProduct(int id) {
        try {
          return   productDao.getProduct(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        try {
           return productDao.getAllProduct();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteProduct(int id) {
        try {
            productDao.deleteProduct(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateProduct(Product product) {
        try {
            productDao.updateProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> searchProductByName(String name) {
        return  this.getAllProduct()
                .stream()
                .filter(product-> product.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}

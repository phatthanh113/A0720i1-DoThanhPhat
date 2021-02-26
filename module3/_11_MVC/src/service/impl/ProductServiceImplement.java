package service.impl;

import dao.IProductDao;
import dao.product.ProductDaoImplement;
import model.Customer;
import model.Product;
import model.ShopDTO;
import service.ICustomerService;
import service.IProductService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductServiceImplement implements IProductService {
//    public static Map<String,Product> productMap = new HashMap<>();
//    static {
//        productMap.put("1",new Product("1","Sữa","20000","Sữa","Nhà"));
//        productMap.put("2",new Product("2","Đường","20000","Đường","Nhà"));
//        productMap.put("3",new Product("3","Nước","20000","Nước","Nhà"));
//    }
    public static IProductDao productDaoImplement = new ProductDaoImplement();
    public static ICustomerService customerService = new CustomerServiceImplement();
    @Override
    public List<Product> findAll() {
        try {
            return productDaoImplement.getAllProduct();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(Product product) {
        try {
            productDaoImplement.insertProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product findById(String id) {
        try {
            return productDaoImplement.getProduct(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        return this.findAll().stream().filter(product -> product.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public void update(String id, Product product) {
        try {
            productDaoImplement.updateProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(String id) {
        try {
            productDaoImplement.deleteProduct(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ShopDTO> getCustomer() {
        List<ShopDTO> shopDTOList = new ArrayList<>();
        List<Customer> customerList = customerService.findAll();
        List<Product> productList = this.findAll();
        for (Customer customer : customerList) {
            ShopDTO shopDTO = new ShopDTO();
            shopDTO.setId(customer.getId());
            shopDTO.setName(customer.getName());
            shopDTO.setProductName(this.findById(customerService.getIdProduct(customer.getId())).getName());
            shopDTO.setPrice(this.findById(customerService.getIdProduct(customer.getId())).getPrice());
            shopDTOList.add(shopDTO);
        }
        return shopDTOList;
    }

}

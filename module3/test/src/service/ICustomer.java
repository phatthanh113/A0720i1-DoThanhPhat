package service;

import model.entity.Customer;
import model.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ICustomer {
    void insertCustomer(Customer customer);

    Customer getCustomer(int id);

    List<Customer> getAllCustomer();

    void deleteCustomer(int id);

    void updateCustomer(Customer customer);

    List<Customer> searchCustomerByName(String name);

}

package vn.phatdo.services;

import vn.phatdo.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer getById(int id);
    void save(Customer customer);
    void edit(Customer customer);
    void delete(Customer customer);
}

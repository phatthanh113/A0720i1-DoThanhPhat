package com.codegym.repository;

import com.codegym.models.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAllCustomer() ;
    Customer getCustomerById(int id) ;
    void saveCustomer(Customer customer);
    void deleteCustomer(int id);
    void updateCustomer(Customer customer);
}

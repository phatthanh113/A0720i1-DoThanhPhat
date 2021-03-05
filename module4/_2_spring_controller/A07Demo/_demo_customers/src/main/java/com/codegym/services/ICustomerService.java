package com.codegym.services;

import com.codegym.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomer() ;
    Customer getCustomerById(int id) ;
    void saveCustomer(Customer customer);
    void deleteCustomer(int id);
    void updateCustomer(Customer customer);
    List<Customer> searchCustomer(String word);
}

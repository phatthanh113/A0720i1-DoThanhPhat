package com.a07.demo.services;

import com.a07.demo.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
}

package com.codegym.repository.impl;

import com.codegym.models.Customer;
import org.springframework.stereotype.Repository;
import com.codegym.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class CustomerRepositoryImpl implements ICustomerRepository {
    static Map<Integer,Customer> listCustomer = new HashMap<>();
    static {
        listCustomer.put(1,new Customer(1,"nam","12"));
        listCustomer.put(2,new Customer(2,"viet","12"));
        listCustomer.put(3,new Customer(3,"dat","12"));
    }
    @Override
    public List<Customer> getAllCustomer() {
        return new ArrayList<>(listCustomer.values());
    }

    @Override
    public Customer getCustomerById(int id) {
        return listCustomer.get(id);
    }
    @Override
    public void saveCustomer(Customer customer) {
        listCustomer.put(customer.getId(),customer);
    }

    @Override
    public void deleteCustomer(int id) {
        listCustomer.remove(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        listCustomer.replace(customer.getId(),customer);
    }
}

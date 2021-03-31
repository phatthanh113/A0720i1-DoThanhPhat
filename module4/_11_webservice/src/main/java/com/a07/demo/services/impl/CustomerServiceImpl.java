package com.a07.demo.services.impl;

import com.a07.demo.models.Customer;
import com.a07.demo.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    static Map<Integer,Customer> customerMap = new HashMap<>();
    static {
        customerMap.put(1,new Customer(1,"Dat"));
        customerMap.put(2,new Customer(2,"Nam"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}

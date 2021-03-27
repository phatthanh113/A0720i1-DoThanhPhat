package vn.phatdo.services.impl;

import org.springframework.stereotype.Service;
import vn.phatdo.models.Customer;
import vn.phatdo.services.ICustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements ICustomerService {
    static Map<Integer,Customer> customerMap ;
    static {
        customerMap = new HashMap<>();
        customerMap.put(1,new Customer(1,"Viet","male","sugar"));
        customerMap.put(2,new Customer(2,"Nam","male","sugar"));
        customerMap.put(3,new Customer(3,"Hung","male","sugar"));
        customerMap.put(4,new Customer(4,"Dat","male","sugar"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public void edit(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public void delete(Customer customer) {
        customerMap.remove(customer.getId());
    }
}

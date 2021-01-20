package service.impl;

import dao.ICustomerDAO;
import dao.customer.CustomerDAOImpl;
import model.Customer;
import service.ICustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImplement implements ICustomerService {
    public static Map<Integer,Customer> customerMap;
   private ICustomerDAO customerDAO = new CustomerDAOImpl();
//    static {
//        customerMap= new HashMap<>();
//        customerMap.put(1,new Customer("1","Dat","datmaster@codegym","Dalat"));
//        customerMap.put(2,new Customer("2","Nam","Nam2000@codegym","Dalat"));
//        customerMap.put(3,new Customer("3","Sang","ChayDoAn@codegym","Dalat"));
//    }
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            customerList = customerDAO.getAllCustomer();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(Integer.parseInt(customer.getId()),customer);
    }

    @Override
    public Customer findById(int id){
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }

    @Override
    public Customer findByName(Customer customer,String name) {
       if(customer.getName().contains("name")) {
           return customer;
       }return null;
    }

    @Override
    public String getIdProduct(String id) {
        try {
           return customerDAO.getIdProduct(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

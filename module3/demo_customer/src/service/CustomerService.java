package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public static List<Customer> listCustomer = new ArrayList<>();

    public List<Customer> getListCustomer() {
        return listCustomer;
    }

    public void addCustomer(Customer customer) {
        listCustomer.add(customer);
    }
    public boolean checkLogin(String username , String password) {
        if("phat".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }
}

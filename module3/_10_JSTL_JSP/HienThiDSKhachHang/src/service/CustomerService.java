package service;

import Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public static List<Customer> listCustomer = new ArrayList<>();

    public List<Customer> getListCustomer() {
        return listCustomer;
    }

    public void addCustomer(Customer cus) {
        listCustomer.add(cus);
    }

    public boolean checkLogin(String username, String password) {
        if ("Linh".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }

}

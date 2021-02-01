package service.impl;


import dao.ICustomerDao;
import dao.impl.CustomerDaoImpl;
import model.entity.Customer;
import service.ICustomer;


import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerImpl implements ICustomer {
    ICustomerDao customerDao = new CustomerDaoImpl();
    @Override
    public void insertCustomer(Customer customer) {
        try {
            customerDao.insertCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer getCustomer(int id){
        try {
           return customerDao.getCustomer(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Customer();
    }

    @Override
    public List<Customer> getAllCustomer() {
        try {
            return customerDao.getAllCustomer();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteCustomer(int id) {
        try {
            customerDao.deleteCustomer(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        try {
            customerDao.updateCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> searchCustomerByName(String name) {
        return  this.getAllCustomer()
                .stream()
                .filter(customer -> customer.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}

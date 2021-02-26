package service.customer;

import model.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    public void insertCustomer(Customer customer) throws SQLException;

    public Customer getCustomer(String id) throws SQLException;

    public List<Customer> getAllCustomer() throws SQLException;

    public boolean deleteCustomer(String id) throws SQLException;

    public boolean updateCustomer(Customer customer) throws SQLException;

    public String getIdProduct(String id) throws SQLException;
}

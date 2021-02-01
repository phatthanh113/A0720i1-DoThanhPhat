package service.customer;

import dao.ICustomerDao;
import dao.customer.CustomerDaoImpl;
import model.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService{
    ICustomerDao customerDao = new CustomerDaoImpl();
    @Override
    public void insertCustomer(Customer customer) throws SQLException {

    }

    @Override
    public Customer getCustomer(String id) throws SQLException {
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() throws SQLException {
        return  customerDao.getAllCustomer();
    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        return false;
    }

    @Override
    public String getIdProduct(String id) throws SQLException {
        return null;
    }
}

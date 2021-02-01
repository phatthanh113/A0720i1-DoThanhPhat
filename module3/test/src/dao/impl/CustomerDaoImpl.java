package dao.impl;

import dao.ICustomerDao;
import model.entity.Customer;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDaoImpl implements ICustomerDao {
    private static final String INSERT_CUSTOMER_SQL = "Insert into Customer(id, id_product, name, birthday) values (?, ?, ?, ?)";
    private static final String SELECT_CUSTOMER_BY_ID = "Select * from Customer where id = ?";
    private static final String SELECT_ALL_CUSTOMER = "Select * from Customer";
    private static final String DELETE_USER_BY_ID = "Delete from Customer where id = ?";
    private static final String UPDATE_USER = "Update Customer set  id_product = ?,name = ?, birthday = ? where id = ?";
    private static final String MAX_ID_CUSTOMER = "Select max(id) from customer";
    private static Connection connection = DBConnection.getConnection();
    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
        PreparedStatement preparedStatement1 = connection.prepareStatement(MAX_ID_CUSTOMER);
        ResultSet resultSet = preparedStatement1.executeQuery();
        resultSet.next();
        int id = (resultSet.getInt("max(id)") + 1);
        preparedStatement.setInt(1,id);
        preparedStatement.setInt(2,customer.getIdProduct());
        preparedStatement.setString(3,customer.getName());
        preparedStatement.setString(4,customer.getBirthday());
        preparedStatement.executeUpdate();
    }

    @Override
    public Customer getCustomer(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Customer customer= null ;
        if(resultSet.next()) {
            int idProduct = resultSet.getInt("id_product");
            String name = resultSet.getString("name");
            String date = resultSet.getString("birthday");
            customer = new Customer(id,idProduct,name,date);
        }
        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
        List<Customer> customerList = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int idProduct = resultSet.getInt("id_product");
            String name = resultSet.getString("name");
            java.sql.Date date = resultSet.getDate("birthday");
            Customer customer = new Customer(id,idProduct,name,String.valueOf(date));
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_BY_ID);
        preparedStatement.setInt(1,id);
        return preparedStatement.executeUpdate() > 0;

    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
        preparedStatement.setInt(1,customer.getIdProduct());
        preparedStatement.setString(2,customer.getName());
        preparedStatement.setString(3,customer.getBirthday());
        preparedStatement.setInt(4,customer.getId());
       return preparedStatement.executeUpdate() > 0 ;
    }

}

package dao.customer;

import dao.ICustomerDao;
import model.entity.Customer;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements ICustomerDao {
    private static final String SELECT_ALL_CUSTOMER = "Select * from furama.cs_customer";
    static Connection connection = DBConnection.getConnection();
    @Override
    public void insertCustomer(Customer customer) throws SQLException {

    }

    @Override
    public Customer getCustomer(String id) throws SQLException {
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String id = String.valueOf(resultSet.getInt("id"));
            String name = resultSet.getString("name");
            String birthday = resultSet.getString("birthday");
            String gender = resultSet.getString("gender");
            String identity = resultSet.getString("identity");
            String phone = resultSet.getString("phone_number");
            String email = resultSet.getString("email");
            String typeId = String.valueOf(resultSet.getInt("id_type_customer"));
            String address = resultSet.getString("address");

            customerList.add(new Customer(id,name,birthday,gender,identity,phone,email,typeId,address));
        }

        return customerList;
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

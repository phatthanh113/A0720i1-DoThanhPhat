package dao.impl;

import dao.IProductDao;
import model.entity.Customer;
import model.entity.Product;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements IProductDao{
    private static final String INSERT_PRODUCT_SQL = "Insert into Product(id ,name ) values (?, ?)";
    private static final String SELECT_PRODUCT_BY_ID = "Select * from Product where id = ?";
    private static final String SELECT_ALL_PRODUCT = "Select * from Product";
    private static final String DELETE_PRODUCT_BY_ID = "Delete from Product where id = ?";
    private static final String UPDATE_PRODUCT = "Update Product set  name = ? where id = ?";
    private static final String MAX_ID_PRODUCT = "Select max(id) from product";
    private static Connection connection = DBConnection.getConnection();
    @Override
    public void insertProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL);
        PreparedStatement preparedStatement1 = connection.prepareStatement(MAX_ID_PRODUCT);
        ResultSet resultSet = preparedStatement1.executeQuery();
        int id  = resultSet.next() ? 0 : resultSet.getInt("id");
        preparedStatement.setInt(1,id+1);
        preparedStatement.setString(2,product.getName());
        preparedStatement.executeQuery();
    }

    @Override
    public Product getProduct(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Product product = null;
        if(resultSet.next()) {
            String name = resultSet.getString("name");
            product = new Product(id,name);
        }
        return product;
    }

    @Override
    public List<Product> getAllProduct() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
        List<Product> productList = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            Product product = new Product(id,name);
            productList.add(product);
        }
        return productList ;
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_BY_ID);
        preparedStatement.setInt(1,id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT);
        preparedStatement.setInt(1,product.getId());
        preparedStatement.setString(2,product.getName());
        return preparedStatement.executeUpdate() > 0;
    }
}

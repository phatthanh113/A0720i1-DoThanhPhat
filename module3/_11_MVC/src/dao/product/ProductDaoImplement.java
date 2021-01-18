package dao.product;

import dao.IProductDao;
import model.Customer;
import model.Product;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImplement implements IProductDao {
    private static final String INSERT_PRODUCT_SQL = "Insert into PRODUCT(id, name, price, description,producer) values (?, ?, ?, ?, ?)";
    private static final String SELECT_PRODUCT_BY_ID = "Select * from PRODUCT where id = ?";
    private static final String SELECT_PRODUCT_BY_NAME = "Select * from PRODUCT where name = ? ";
    private static final String SELECT_MAX_ID = "Select max(id)  from PRODUCT";
    private static final String SELECT_ALL_PRODUCT = "Select * from product order by id";
    private static final String DELETE_PRODUCT_BY_ID = "Delete from PRODUCT where id = ?";
    private static final String UPDATE_PRODUCT = "Update PRODUCT set name = ?, price = ?, description = ?, producer = ? where id = ?";
    private static final String SELECT_PRODUCT_BY_ID_PS = "{call get_product(?)}";
    static Connection connection = DBConnection.getConnection();

    @Override
    public void insertProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_SQL);
//
        int maxId = this.getMaxId() == null ? 0 : Integer.parseInt(this.getMaxId());
        preparedStatement.setString(1, String.valueOf(maxId + 1));
        preparedStatement.setString(2, product.getName());
        preparedStatement.setString(3, product.getPrice());
        preparedStatement.setString(4, product.getDescription());
        preparedStatement.setString(5, product.getProducer());
//
        preparedStatement.executeUpdate();
    }
    public String getMaxId() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MAX_ID);
        ResultSet resultSet = preparedStatement.executeQuery();
//        Nếu có resultSet.next() thì trả về id lớn nhất ,ko thì trả về 0
        resultSet.next();
        return resultSet.getString(1);
    }
    @Override
    public Product getProduct(String id) throws SQLException {
//        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
//        preparedStatement.setString(1,id);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        Product product = null;
//        if(resultSet.next()) {
//            String name = resultSet.getString("name");
//            String price = resultSet.getString("price");
//            String description = resultSet.getString("description");
//            String producer = resultSet.getString("producer");
//            product = new Product(id,name,price,description,producer);
//        }
//        return product;
        CallableStatement callableStatement = connection.prepareCall(SELECT_PRODUCT_BY_ID_PS);
        callableStatement.setString(1, id);
        ResultSet resultSet = callableStatement.executeQuery();
                Product product = null;
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String price = resultSet.getString("price");
            String description = resultSet.getString("description");
            String producer = resultSet.getString("producer");
            product = new Product(id, name, price, description, producer);
        }
        return product;
    }

    @Override
    public List<Product> getAllProduct() throws SQLException {
        List<Product> productList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String price = resultSet.getString("price");
            String description = resultSet.getString("description");
            String producer = resultSet.getString("producer");
            productList.add(new Product(id,name,price,description,producer));
        }
        return productList;
    }

    @Override
    public boolean deleteProduct(String id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_BY_ID);
        preparedStatement.setString(1,id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT);
        preparedStatement.setString(1,product.getName());
        preparedStatement.setString(2,product.getPrice());
        preparedStatement.setString(3,product.getDescription());
        preparedStatement.setString(4,product.getProducer());
        preparedStatement.setString(5,product.getId());
        return preparedStatement.executeUpdate() > 0 ;
    }
}

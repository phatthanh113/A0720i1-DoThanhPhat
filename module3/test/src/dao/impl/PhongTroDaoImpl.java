package dao.impl;

import dao.IPhongTroDao;
import model.entity.Payment;
import model.entity.PhongTro;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhongTroDaoImpl implements IPhongTroDao {
    private static final String INSERT_PHONGTRO_SQL = "Insert into PHONGTRO(id, name_person, phone, date_open,payment_id,note) values (?, ?, ?, ? , ? ,?)";
    private static final String SELECT_PHONGTRO_BY_ID = "Select * from PHONGTRO where id = ?";
    private static final String SELECT_ALL_PHONGTRO = "Select * from PHONGTRO";
    private static final String DELETE_PHONGTRO_BY_ID = "Delete from PHONGTRO where id = ?";
    private static final String UPDATE_PHONGTRO = "Update PHONGTRO set  name_person = ?,phone = ?, date_open = ? ,payment_id =? ,note =? where id = ?";
    private static final String MAX_ID_PHONGTRO = "Select max(id) from PHONGTRO";
    private static final String SELECT_ALL_PAYMENT = "Select * from payment";
    private static final String SELECT_PAYMENT = "Select * from payment where id = ?";

    private static Connection connection = DBConnection.getConnection();
    @Override
    public void insertPhongTro(PhongTro phongTro) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PHONGTRO_SQL);
        PreparedStatement preparedStatement1 = connection.prepareStatement(MAX_ID_PHONGTRO);
        ResultSet resultSet = preparedStatement1.executeQuery();
        resultSet.next();
        int id = (resultSet.getInt("max(id)") + 1);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,phongTro.getNamePerson());
        preparedStatement.setString(3,phongTro.getPhone());
        preparedStatement.setString(4,phongTro.getDateOpen());
        preparedStatement.setInt(5,phongTro.getPaymentId());
        preparedStatement.setString(6,phongTro.getNote());
        preparedStatement.executeUpdate();
    }

    @Override
    public PhongTro getPhongTro(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PHONGTRO_BY_ID);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        PhongTro phongTro= null ;
        if(resultSet.next()) {
            String name = resultSet.getString("name_person");
            String phone = resultSet.getString("phone");
            String date = resultSet.getString("date_open");
            int idPayment = resultSet.getInt("payment_id");
            String note = resultSet.getString("note");
            phongTro = new PhongTro(id,name,phone,date,idPayment,note);
        }
        return phongTro;
    }

    @Override
    public List<PhongTro> getAllPhongTro() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PHONGTRO);
        List<PhongTro> phongTroList = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name_person");
            String phone = resultSet.getString("phone");
            String date = resultSet.getString("date_open");
            int idPayment = resultSet.getInt("payment_id");
            String note = resultSet.getString("note");
            PhongTro phongTro = new PhongTro(id,name,phone,date,idPayment,note);
            phongTroList.add(phongTro);
        }
        return phongTroList;
    }

    @Override
    public boolean deletePhongTro(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PHONGTRO_BY_ID);
        preparedStatement.setInt(1,id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updatePhongTro(PhongTro phongTro) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PHONGTRO);
        preparedStatement.setString(1,phongTro.getNamePerson());
        preparedStatement.setString(2,phongTro.getPhone());
        preparedStatement.setString(3,phongTro.getDateOpen());
        preparedStatement.setInt(4,phongTro.getPaymentId());
        preparedStatement.setString(5,phongTro.getNote());
        preparedStatement.setInt(1,phongTro.getId());
        return preparedStatement.executeUpdate() > 0 ;
    }

    @Override
    public Payment getPayment(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PAYMENT);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Payment payment= null;
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            payment = new Payment(id,name);
        }
        return payment ;
    }

    @Override
    public List<Payment> getAllPayment() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PAYMENT);
        List<Payment> paymentList= new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            Payment payment = new Payment(id,name);
            paymentList.add(payment);
        }
        return paymentList ;
    }

}

package dao;

import model.entity.Payment;
import model.entity.PhongTro;

import java.sql.SQLException;
import java.util.List;

public interface IPhongTroDao {
    void insertPhongTro(PhongTro phongTro) throws SQLException;

    PhongTro getPhongTro(int id) throws SQLException;

    List<PhongTro> getAllPhongTro() throws SQLException;

    boolean deletePhongTro(int id) throws SQLException;

    boolean updatePhongTro(PhongTro phongTro) throws SQLException;

    Payment getPayment(int id) throws SQLException ;

    List<Payment> getAllPayment() throws SQLException ;
}

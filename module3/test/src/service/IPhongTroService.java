package service;

import model.entity.Payment;
import model.entity.PhongTro;

import java.util.List;

public interface IPhongTroService {
    void insertPhongTro(PhongTro phongTro);

    PhongTro getPhongTro(int id);

    List<PhongTro> getAllPhongTro();

    void deletePhongTro(int id);

    void updatePhongTro(PhongTro phongTro);

    List<Payment> getAllPayment() ;

    Payment getPayment(int id) ;

    List<PhongTro> searchPhongTroByName(String name);
}

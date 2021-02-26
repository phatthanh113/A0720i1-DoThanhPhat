package service.impl;

import dao.IPhongTroDao;
import dao.impl.PhongTroDaoImpl;
import model.entity.Payment;
import model.entity.PhongTro;
import service.IPhongTroService;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class PhongTroImpl implements IPhongTroService {
    IPhongTroDao phongTroDao = new PhongTroDaoImpl();
    @Override
    public void insertPhongTro(PhongTro phongTro) {
        try {
            phongTroDao.insertPhongTro(phongTro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PhongTro getPhongTro(int id){
        try {
            return phongTroDao.getPhongTro(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new PhongTro();
    }

    @Override
    public List<PhongTro> getAllPhongTro() {
        try {
            return phongTroDao.getAllPhongTro();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deletePhongTro(int id) {
        try {
            phongTroDao.deletePhongTro(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePhongTro(PhongTro phongTro) {
        try {
           phongTroDao.updatePhongTro(phongTro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Payment> getAllPayment() {
        try {
       return      phongTroDao.getAllPayment();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null ;
    }

    @Override
    public Payment getPayment(int id) {
        try {
          return   phongTroDao.getPayment(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null ;
    }

    @Override
    public List<PhongTro> searchPhongTroByName(String name) {
        return  this.getAllPhongTro()
                .stream()
                .filter(phongTro -> phongTro.getNamePerson().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}

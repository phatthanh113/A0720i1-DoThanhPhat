package vn.phatdo.demo.services;

import vn.phatdo.demo.models.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void save(User user);
    void delele(int id);
    void findById(int id);
}

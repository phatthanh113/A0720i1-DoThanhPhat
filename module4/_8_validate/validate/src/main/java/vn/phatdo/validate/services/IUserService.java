package vn.phatdo.validate.services;

import vn.phatdo.validate.models.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    void save(User user);
    void delele(int id);
    void findById(int id);
}

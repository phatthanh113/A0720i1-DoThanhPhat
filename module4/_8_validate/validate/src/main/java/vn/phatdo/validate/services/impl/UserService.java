package vn.phatdo.validate.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.phatdo.validate.models.entity.User;
import vn.phatdo.validate.repositories.IUserRepository;
import vn.phatdo.validate.services.IUserService;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository userRepository ;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delele(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void findById(int id) {
        userRepository.findById(id);
    }
}

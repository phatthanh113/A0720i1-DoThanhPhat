package vn.phatdo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.phatdo.demo.models.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {

}

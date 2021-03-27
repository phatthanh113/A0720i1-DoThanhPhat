package vn.phatdo.my_demo_project.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.phatdo.my_demo_project.models.Cart;
@Repository
public interface ICartRepository extends JpaRepository<Cart,Integer> {
    Page<Cart> findAll(Pageable pageable);
}

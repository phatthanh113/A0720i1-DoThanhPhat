package vn.phatdo.my_demo_project.repositories;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.phatdo.my_demo_project.models.Product;
@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {
    Page<Product> findAll(Pageable pageable);
}

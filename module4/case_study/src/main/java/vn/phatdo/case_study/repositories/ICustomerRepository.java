package vn.phatdo.case_study.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.phatdo.case_study.models.entity.customer.Customer;
import vn.phatdo.case_study.models.entity.customer.CustomerType;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAll(Pageable pageable);
    @Query("select ct from CustomerType ct")
    List<CustomerType> findAllCustomerType();
    @Query("select c from Customer c where "
            +"concat(c.name,'')"
            +"like %?1%"
    )
    Page<Customer> findCustomerByName(String name,Pageable pageable);
    Customer findById(String id);

    @Modifying
    @Transactional
    @Query("delete from Customer c where c.id = ?1")
    void deleteCustomerById(String id);
}

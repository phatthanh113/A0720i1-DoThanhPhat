package vn.phatdo.case_study.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.phatdo.case_study.models.entity.customer.Customer;
import vn.phatdo.case_study.models.entity.customer.CustomerType;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAll(Pageable pageable);
    @Query("select ct from CustomerType ct")
    List<CustomerType> findAllCustomerType();
}

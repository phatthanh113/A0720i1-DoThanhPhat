package vn.phatdo.case_study.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.phatdo.case_study.models.entity.customer.Customer;
import vn.phatdo.case_study.models.entity.customer.CustomerType;

import java.util.List;

public interface ICustomerService extends IService<Customer> {
    List<CustomerType> getListCusType() ;
    Page<Customer> findByName(String name, Pageable pageable);
    Customer findById(String id);
    void deleteById(String id);
}

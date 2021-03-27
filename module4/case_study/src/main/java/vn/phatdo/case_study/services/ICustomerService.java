package vn.phatdo.case_study.services;

import vn.phatdo.case_study.models.entity.customer.Customer;
import vn.phatdo.case_study.models.entity.customer.CustomerType;

import java.util.List;

public interface ICustomerService extends IService<Customer> {
    List<CustomerType> getListCusType() ;
}

package vn.phatdo.case_study.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.phatdo.case_study.models.entity.customer.Customer;
import vn.phatdo.case_study.models.entity.customer.CustomerType;
import vn.phatdo.case_study.repositories.ICustomerRepository;
import vn.phatdo.case_study.repositories.ICustomerTypeRepository;
import vn.phatdo.case_study.services.ICustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    ICustomerRepository customerRepository ;
    @Autowired
    ICustomerTypeRepository customerTypeRepository ;

    @Override
    public List<CustomerType> getListCusType() {
        return customerTypeRepository.findAll();
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }
}

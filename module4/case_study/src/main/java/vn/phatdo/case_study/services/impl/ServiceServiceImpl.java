package vn.phatdo.case_study.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.phatdo.case_study.models.entity.service.RentType;
import vn.phatdo.case_study.models.entity.service.Service;
import vn.phatdo.case_study.models.entity.service.ServiceType;
import vn.phatdo.case_study.repositories.IServiceRepository;
import vn.phatdo.case_study.services.IServiceService;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements IServiceService {
    @Autowired
    IServiceRepository serviceRepository ;
    @Override
    public List<ServiceType> getListServiceType() {
       return serviceRepository.findAllServiceType();
    }

    @Override
    public List<RentType> getListRentType() {
        return serviceRepository.findAllRentType();
    }

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void delete(int id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Service findById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }
}

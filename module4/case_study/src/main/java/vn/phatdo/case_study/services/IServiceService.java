package vn.phatdo.case_study.services;

import vn.phatdo.case_study.models.entity.service.RentType;
import vn.phatdo.case_study.models.entity.service.Service;
import vn.phatdo.case_study.models.entity.service.ServiceType;

import java.util.List;

public interface IServiceService extends IService<Service> {
    List<ServiceType> getListServiceType() ;
    List<RentType> getListRentType() ;
    Service findById(String id);
}

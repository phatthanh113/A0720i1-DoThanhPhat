package vn.phatdo.case_study.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.phatdo.case_study.models.entity.service.RentType;
import vn.phatdo.case_study.models.entity.service.Service;
import vn.phatdo.case_study.models.entity.service.ServiceType;

import java.util.List;

@Repository
public interface IServiceRepository extends JpaRepository<Service,Integer> {
    Page<Service> findAll(Pageable pageable);
    @Query("select ct from ServiceType ct")
    List<ServiceType> findAllServiceType();
    @Query("select ct from RentType ct")
    List<RentType> findAllRentType();
    Service findById(String id);

}

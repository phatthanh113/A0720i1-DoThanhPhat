package vn.phatdo.case_study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.phatdo.case_study.models.entity.service.RentType;

@Repository
public interface IRentTypeRepository extends JpaRepository<RentType,Integer> {
}

package vn.phatdo.case_study.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.phatdo.case_study.models.entity.employee.Division;
import vn.phatdo.case_study.models.entity.employee.EducationDegree;
import vn.phatdo.case_study.models.entity.employee.Employee;
import vn.phatdo.case_study.models.entity.employee.Position;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findAll(Pageable pageable);
    @Query("select pt from Position pt")
    List<Position> findAllPositon();
    @Query("select ed from EducationDegree ed")
    List<EducationDegree> findAllEduDegree();
    @Query("select dv from Division dv")
    List<Division> findAllDivision();
}

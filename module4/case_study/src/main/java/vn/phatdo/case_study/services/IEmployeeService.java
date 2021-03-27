package vn.phatdo.case_study.services;

import vn.phatdo.case_study.models.entity.employee.Division;
import vn.phatdo.case_study.models.entity.employee.EducationDegree;
import vn.phatdo.case_study.models.entity.employee.Employee;
import vn.phatdo.case_study.models.entity.employee.Position;

import java.util.List;

public interface IEmployeeService extends IService<Employee> {
    List<Position> getListPosition() ;
    List<EducationDegree> getListEducationDegree() ;
    List<Division> getListDivision();
}

package vn.phatdo.case_study.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.phatdo.case_study.models.entity.employee.Division;
import vn.phatdo.case_study.models.entity.employee.EducationDegree;
import vn.phatdo.case_study.models.entity.employee.Employee;
import vn.phatdo.case_study.models.entity.employee.Position;
import vn.phatdo.case_study.repositories.IEmployeeRepository;
import vn.phatdo.case_study.services.IEmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository ;
    @Override
    public List<Position> getListPosition() {
        return employeeRepository.findAllPositon();
    }

    @Override
    public List<EducationDegree> getListEducationDegree() {
        return employeeRepository.findAllEduDegree();
    }

    @Override
    public List<Division> getListDivision() {
        return employeeRepository.findAllDivision();
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
}

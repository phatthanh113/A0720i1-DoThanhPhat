package vn.phatdo.case_study.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.phatdo.case_study.services.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService ;
    @GetMapping("")
    public String getListEmployee(Model model,
                                  Pageable pageable) {
        model.addAttribute("employees",employeeService.findAll(pageable));
        return "/employee/list";
    }
}

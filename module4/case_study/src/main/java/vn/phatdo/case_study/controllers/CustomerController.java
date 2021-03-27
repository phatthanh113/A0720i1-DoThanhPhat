package vn.phatdo.case_study.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.phatdo.case_study.models.entity.customer.Customer;
import vn.phatdo.case_study.services.ICustomerService;

import java.util.Arrays;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService ;

    @GetMapping("/")
    public ModelAndView getList(@PageableDefault(size = 3) Pageable pageable) {
        return new ModelAndView("customer/list", "customers", customerService.findAll(pageable));
    }
    @GetMapping("/{action}")
    public ModelAndView getFormAddCustomer(Model model,
                                           @PathVariable String action,
                                           @RequestParam(required = false,defaultValue = "0") int id) {
        if(action.equals("create")){
            model.addAttribute("customer",new Customer());
        }else {
            model.addAttribute("customer",customerService.findById(id));
        }
        model.addAttribute("customerTypes",customerService.getListCusType());
        model.addAttribute("genders", Arrays.asList("Male","Female","Others"));
        return new ModelAndView("customer/form");
    }
    @PostMapping("/create-edit")
    public String submitCustomer(@ModelAttribute Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/";
    }
    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam int id) {
        customerService.delete(id) ;
        return new ModelAndView("redirect:/customer/");
    }
    @GetMapping("view")
    public ModelAndView view(@RequestParam int id) {
        return new ModelAndView("/customer/view","customer",customerService.findById(id));
    }
}

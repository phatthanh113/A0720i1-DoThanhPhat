package vn.phatdo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.phatdo.models.Customer;
import vn.phatdo.services.ICustomerService;
import vn.phatdo.services.IListService;
import vn.phatdo.services.impl.CustomerServiceImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;
    @Autowired
    IListService listService ;
    @GetMapping("/")
    public ModelAndView getIndex() {
        return new ModelAndView("index","customers",customerService.findAll());
    }
    @GetMapping("/{id}/delete")
    public ModelAndView deleteCustomer(@PathVariable int id) {
        System.out.println(customerService.getById(id).getName());
        customerService.delete(customerService.getById(id));
        return new ModelAndView("redirect:/customer/");
    }
    @GetMapping("/{id}/view")
    public ModelAndView viewCustomer(@PathVariable int id) {
        return new ModelAndView("view","customer",customerService.getById(id));
    }
    @GetMapping("/{id}/edit")
    public ModelAndView formEditCustomer(@PathVariable int id, Model model) {
        model.addAttribute("products",listService.productList());
        model.addAttribute("genders",listService.genderList());
        model.addAttribute("action","edit");
        return new ModelAndView("edit_add","customer",customerService.getById(id));
    }
    @GetMapping("/add")
    public ModelAndView formAddCustomer( Model model) {
        model.addAttribute("products",listService.productList());
        model.addAttribute("genders",listService.genderList());
        model.addAttribute("action","add");
        return new ModelAndView("edit_add","customer",new Customer());
    }
    @PostMapping("/add")
    public ModelAndView addCustomer(@ModelAttribute Customer customer) {
        customerService.save(customer);
        return new ModelAndView("redirect:/customer/");
    }
    @PostMapping("/edit")
    public ModelAndView editCustomer(@ModelAttribute Customer customer) {
        customerService.edit(customer);
        return new ModelAndView("redirect:/customer/");
    }
}

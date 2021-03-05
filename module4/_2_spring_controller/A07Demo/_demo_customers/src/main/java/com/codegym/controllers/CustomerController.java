package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping("/customer")
@Controller
public class CustomerController {
    @Autowired
    public ICustomerService customerService;
    @GetMapping("/")
    public ModelAndView getIndex() {
        return new ModelAndView("index","listCustomer",customerService.getAllCustomer());
    }
    @GetMapping("/add")
    public ModelAndView formAddCustomer(Model model) {
        model.addAttribute("customer",new Customer());
        return new ModelAndView("add_edit","action","add");
    }
    @PostMapping("/add")
    public ModelAndView addCustomer(
                                   @ModelAttribute("customer") Customer customer,
                                   RedirectAttributes redirectAttributes,
                                   BindingResult result) {
        redirectAttributes.addFlashAttribute("messages","created");
        customerService.saveCustomer(customer);
        return new ModelAndView("redirect:/customer/");
    }
    @GetMapping("/edit")
    public ModelAndView formEditCustomer(@RequestParam(value = "id",required = false) int id , Model model) {
        model.addAttribute("action","edit");
        return new ModelAndView("add_edit","customer",customerService.getCustomerById(id));
    }
    @PostMapping("/edit")
    public ModelAndView editCustomer( @ModelAttribute("customer") Customer customer,
                                      RedirectAttributes redirectAttributes,
                                      BindingResult result) {
        redirectAttributes.addFlashAttribute("messages","edited");
        customerService.updateCustomer(customer);
        return new ModelAndView("redirect:/customer/");
    }

    @GetMapping("/delete")
    public ModelAndView deleteCustomer(@RequestParam(value = "id",required = false) int id,
                                  RedirectAttributes redirectAttributes){
        customerService.deleteCustomer(id);
        redirectAttributes.addFlashAttribute("messages","deleted");
        return new ModelAndView("redirect:/customer/") ;
    }
}

package com.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.codegym.services.ICustomerService;
@Controller
public class CustomerController {
    @Autowired
    public ICustomerService customerService;
    @GetMapping("/")
    public String getAllCustomer(Model model) {
        return "index";
    }
}

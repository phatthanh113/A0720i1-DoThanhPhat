package vn.phatdo.case_study.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public ModelAndView getIndex() {
        return new ModelAndView("/customer/form_cs");
    }
}

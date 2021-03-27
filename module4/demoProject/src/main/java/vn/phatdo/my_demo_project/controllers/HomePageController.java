package vn.phatdo.my_demo_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.phatdo.my_demo_project.services.ICartService;
import vn.phatdo.my_demo_project.services.IProductService;

@Controller
public class HomePageController {
    @Autowired
    ICartService cartService ;
    @Autowired
    IProductService productService ;
    @GetMapping("/")
    public ModelAndView getIndex() {
        return new ModelAndView("index","message","2412121212121222113");
    }
}

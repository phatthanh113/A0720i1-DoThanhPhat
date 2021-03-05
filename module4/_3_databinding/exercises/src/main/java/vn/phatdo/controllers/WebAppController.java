package vn.phatdo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.phatdo.models.WebApp;
import vn.phatdo.services.IWebAppService;

@Controller
public class WebAppController {
    @Autowired
    private IWebAppService webAppService;
    @GetMapping("/")
    public ModelAndView getIndex() {
        return new ModelAndView("index","listWebApp",webAppService.findAll());
    }
    @GetMapping("/add")
    public ModelAndView getFormIndex(Model model) {
        model.addAttribute("webApp",new WebApp());
        model.addAttribute("listPageSize",webAppService.getPageList());
       return new ModelAndView("add_edit");
    }
//    @PostMapping("/webapp")
//    public ModelAndView getInfoWebApp() {
//
//    }
}

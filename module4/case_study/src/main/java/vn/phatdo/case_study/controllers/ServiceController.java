package vn.phatdo.case_study.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.phatdo.case_study.models.entity.service.Service;
import vn.phatdo.case_study.services.IServiceService;

import javax.validation.Valid;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    IServiceService serviceSV;
    @GetMapping("/form")
    public String showForm(Model model) {
            if(!model.containsAttribute("service")){
                model.addAttribute("service",new Service());
            }
            model.addAttribute("rentTypes",serviceSV.getListRentType());
            model.addAttribute("serviceTypes",serviceSV.getListServiceType());
            return "service/form";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("service") Service service,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.service",bindingResult);
            redirectAttributes.addFlashAttribute("service", service);
            return "redirect:/service/form";
        }
        serviceSV.save(service);
        return "redirect:/customer/";
    }
}

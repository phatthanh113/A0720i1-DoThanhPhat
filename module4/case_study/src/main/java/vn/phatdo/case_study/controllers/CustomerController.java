package vn.phatdo.case_study.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.phatdo.case_study.models.entity.customer.Customer;
import vn.phatdo.case_study.services.ICustomerService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService ;

    @GetMapping("/")
    public ModelAndView getList(@PageableDefault(size = 2) Pageable pageable,
                                @RequestParam(value = "search",defaultValue = "") String search,
                                Model model) {
        model.addAttribute("search",search);
        return new ModelAndView("customer/list", "customers", customerService.findByName(search.trim(),pageable));
    }
    @GetMapping("/{action}")
    public ModelAndView getFormAddCustomer(Model model,
                                           @PathVariable String action,
                                           @RequestParam(required = false,defaultValue = "") String id) {
        if(action.equals("create") && !model.containsAttribute("customer")){
            model.addAttribute("customer",new Customer());
        }
        else if(action.equals("edit") && !model.containsAttribute("customer")){
            model.addAttribute("customer",customerService.findById(id));
        }
        model.addAttribute("customerTypes",customerService.getListCusType());
        model.addAttribute("genders", Arrays.asList("Male","Female","Others"));
        return new ModelAndView("customer/form");
    }
    @PostMapping("/create-edit")
    public String submitCustomer(@ModelAttribute("action") String action,
                                 @Valid @ModelAttribute("customer") Customer customer,
                                 BindingResult bindingResult,
                                 Model model,
                                 RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.customer",bindingResult);
            redirectAttributes.addFlashAttribute("customer", customer);
            return "redirect:/customer/"+action+"?id="+customer.getId();
        }
        customerService.save(customer);
        return "redirect:/customer/";
    }
    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam("id") String id,
                               Model model) {
        model.addAttribute("id",id);
        return new ModelAndView("/customer/form-delete");
    }
    @GetMapping("/deleteCustomer")
    public ModelAndView deleteCustomer(@RequestParam("id")String id) {
        customerService.deleteById(id);
        return new ModelAndView("redirect:/customer/");
    }
    @GetMapping("/view")
    public ModelAndView view(@RequestParam String id,
                             HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return new ModelAndView("/customer/view","customer",customerService.findById(id));
    }
}

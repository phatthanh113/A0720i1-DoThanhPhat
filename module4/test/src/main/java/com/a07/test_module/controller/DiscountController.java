package com.a07.test_module.controller;

import com.a07.test_module.model.entity.Discount;
import com.a07.test_module.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping(value = {"/","/discount"})
public class DiscountController {
    @Autowired
    DiscountService discountService ;
    @GetMapping("")
    public ModelAndView getList(@RequestParam(value = "search",defaultValue = "") String search) {
        return new ModelAndView("discount/list", "discounts", discountService.findDiscount(search));
    }
    @GetMapping("/{action}")
    public ModelAndView getForm(Model model,
                                @PathVariable String action,
                                @RequestParam(required = false,defaultValue = "0") int id) {
        if(action.equals("create")){
            model.addAttribute("discount",new Discount());
        }
        if(action.equals("edit")){
            model.addAttribute("discount",discountService.findById(id));
        }
        return new ModelAndView("/discount/form");
    }
    @PostMapping("/create-edit")
    public String submitCustomer(@ModelAttribute("action") String action,
                                 @Valid @ModelAttribute("discount") Discount discount,
                                 BindingResult bindingResult
                                ) {
        if(bindingResult.hasErrors()){
          return "/discount/form";
        }
        discountService.save(discount);
        return "redirect:/discount/";
    }
    @GetMapping("/delete")
    public ModelAndView delete(@RequestParam("id") int id,
                               Model model) {
        model.addAttribute("discount",discountService.findById(id));
        model.addAttribute("id",id);
        return new ModelAndView("/discount/form-delete");
    }
    @GetMapping("/deleteDiscount")
    public ModelAndView deleteCustomer(@RequestParam("id")int id) {
        discountService.delete(id);
        return new ModelAndView("redirect:/discount/");
    }
}

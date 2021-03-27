package vn.phatdo.validate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.phatdo.validate.models.dto.UserDTO;
import vn.phatdo.validate.services.IUserService;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    IUserService userService ;
    @GetMapping("/")
    public ModelAndView getFormSignUp() {
        return new ModelAndView("index","user",new UserDTO());
    }
    @PostMapping("/signup")
    public ModelAndView signUpUser(@Valid @ModelAttribute UserDTO user,BindingResult result) {
        if(result.hasErrors()) {
            return new ModelAndView("index");
        }
        return new ModelAndView("success");
    }
}

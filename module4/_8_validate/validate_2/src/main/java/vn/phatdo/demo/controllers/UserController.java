package vn.phatdo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.phatdo.demo.models.dto.UserDTO;
import vn.phatdo.demo.models.entity.User;
import vn.phatdo.demo.services.IUserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService ;
    @GetMapping("/")
    public ModelAndView getFormSignUp() {
        return new ModelAndView("index","userDTO",new UserDTO());
    }
    @PostMapping("/signup")
    public ModelAndView signUpUser(@Valid @ModelAttribute UserDTO userDTO, BindingResult result) {
        if(result.hasErrors()) {
            return new ModelAndView("index");
        }
        userService.save(userDTO.getUser());
        return new ModelAndView("success");
    }
}

package vn.phatdo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
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
    public ModelAndView getFormSignUp(Model model) {
        if (!model.containsAttribute("userDTO")) {
            model.addAttribute("userDTO", new UserDTO());
        }
        return new ModelAndView("index");
    }
    @PostMapping("/signup")
    public ModelAndView signUpUser(@Valid @ModelAttribute UserDTO userDTO,
                                   BindingResult result,
                                   RedirectAttributes redirectAttributes) {
        if(result.hasErrors()) {
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userDTO",result);
            redirectAttributes.addFlashAttribute("userDTO", userDTO);
            return new ModelAndView("redirect:/user/");
        }
        userService.save(userDTO.getUser());
        return new ModelAndView("success");
    }
}

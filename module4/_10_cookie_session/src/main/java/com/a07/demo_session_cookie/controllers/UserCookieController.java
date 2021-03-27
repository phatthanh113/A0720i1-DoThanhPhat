package com.a07.demo_session_cookie.controllers;

import com.a07.demo_session_cookie.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
@RequestMapping("/login")
public class UserCookieController {
    @ModelAttribute("user")
    public User user(){
        return new User();
    }
    @GetMapping("")
    public ModelAndView getIndex(@CookieValue(name = "username",defaultValue = "")String username,
                                 Model model){
        model.addAttribute("username",username);
        return new ModelAndView("login");
    }
    @PostMapping("/")
    public ModelAndView doLogin(@ModelAttribute("user") User user,
                                @CookieValue(value = "username",defaultValue = "")String username,
                                HttpServletResponse response,
                                HttpServletRequest request,
                                Model model){
        Cookie cookie = new Cookie("username",user.getUsername());
        response.addCookie(cookie);
        cookie.setMaxAge(60);
        if("phat".equals(user.getUsername()) && "123".equals(user.getPassword())){
//            get all cookies
            Cookie[] cookies = request.getCookies();
            for (Cookie ck : cookies) {
                if("username".equals(ck.getName())){
                    model.addAttribute("username",username);
                    break;
                }
            }
            model.addAttribute("message", "Login success. Welcome ");
            return new ModelAndView("success");
        }else {
            model.addAttribute("username",username);
            model.addAttribute("message", "Login failed. Try again.");
        }
        return new ModelAndView("login");
    }
}

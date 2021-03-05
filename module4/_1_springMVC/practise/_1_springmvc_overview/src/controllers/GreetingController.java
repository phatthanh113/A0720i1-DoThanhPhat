package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping(value = "/greeting")
    public String greeting(Model model) {
        model.addAttribute("username","username");
        return "greeting";
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam String username,@RequestParam String password) {
        return username.equals("phat") && password.equals("123") ? "result" : "greeting" ;
    }
    @RequestMapping(value = "/abc")
    public String abc() {
        return "abc";
    }
}

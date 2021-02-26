package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @GetMapping("/")
    public String formCheckBox() {
        return "sandwich/index";
    }
    @PostMapping("/result")
    public String resultCheckBox(@RequestParam(required = false) String[] condiments, Model model) {
        if(condiments != null) {
            model.addAttribute("message","Your Choose");
            model.addAttribute("results",condiments);
        }else {
            model.addAttribute("message","không có sự lựa chọn nào");
        }
        return "sandwich/index";
    }
}

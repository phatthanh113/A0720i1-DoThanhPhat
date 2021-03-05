package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("calculate")
public class CalculatorController {
    @GetMapping("/")
    public String getCalculateForm() {
        return "calculator/index";
    }
    @PostMapping("/calculate")
    public String getCalculateResult(@RequestParam double first
            , @RequestParam(required = false) double second
            ,@RequestParam String sign
            , Model model){
        switch (sign) {
            case "+":  model.addAttribute("result",first+second); break;
            case "-":  model.addAttribute("result",first-second); break;
            case "*":  model.addAttribute("result",first*second); break;
            case "/":  model.addAttribute("result",first/second); break;
        }
        return "calculator/index";
    }
}

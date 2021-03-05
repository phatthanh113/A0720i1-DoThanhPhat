package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ConvertMoney {
    @GetMapping("/")
    public ModelAndView convertMoney() {
        return new ModelAndView("convert");
    }
    @PostMapping("/convert")
    public String convertVND(Model model , @RequestParam String usd , @RequestParam String rate, RedirectAttributes redirectAttributes) {
       if(usd.equals("")) {
           redirectAttributes.addFlashAttribute("message","it's null");
           return "redirect:/";
       }
        Double vnd = Double.parseDouble(usd) * Double.parseDouble(rate);
        model.addAttribute("vnd",vnd);
        return "convert";
    }
}

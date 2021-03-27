package com.a07.demo_session_cookie.controllers;

import com.a07.demo_session_cookie.models.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("count")
@RequestMapping("/count")
public class CountController {
    @ModelAttribute("count")
    public Counter setCount() {
        return new Counter();
    }
    @GetMapping("")
    public ModelAndView getCount(@ModelAttribute("count") Counter counter) {
        counter.increament();
        return new ModelAndView("count");
    }
}

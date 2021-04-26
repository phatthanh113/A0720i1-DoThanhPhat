package com.a07.demo_.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class BaseController {
//    @Autowired
//    private MessageSource messageSource;
    @RequestMapping("")
    public String index() {
//        String message = messageSource.getMessage("hello", null, "default message", request.getLocale());
//        model.addAttribute("message", message);
        return "language";
    }
}

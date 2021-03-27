package com.codegym.demospringjpa.controllers;

import com.codegym.demospringjpa.models.Student;
import com.codegym.demospringjpa.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

//    @GetMapping("/")
//    public ModelAndView getStudentList(@RequestParam String search,PageableDefault(size = 5) Pageable pageable){
//        Page<Student> students = search==null ? studentService.findAll(pageable) : studentService.findByName(search,pageable);
//        return new ModelAndView("list", "students", studentService.findAll(pageable));
//    }

    @GetMapping("/create")
    public ModelAndView getFormCreate(){
       return new ModelAndView("create", "student", new Student());
    }

    @PostMapping("/create")
    public String saveStudent(@ModelAttribute Student student){
        studentService.save(student);
        return "redirect:/";
    }
//    @GetMapping("/")
//    public ModelAndView getStudentList(@PageableDefault(size = 5) Pageable pageable,Model model){
//        model.addAttribute("fields", Arrays.asList("id","name"));
//        return new ModelAndView("listStudent", "students", studentService.findAll(pageable));
//    }
    @GetMapping("/")
    public ModelAndView searchStudent(@RequestParam(required = false) String search,
                                      @PageableDefault(size = 5) Pageable pageable,
                                      Model model){

        Page<Student> students = search==null ? studentService.findAll(pageable) : studentService.findByName(search,pageable);
        model.addAttribute("search",search);
        return new ModelAndView("list", "students", students);
    }
}

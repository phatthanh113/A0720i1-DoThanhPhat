package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Student;
import vn.codegym.services.StudentService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping({"/student",""})
public class StudentController {

    @Autowired
    StudentService studentService ;

    @GetMapping("")
    public ModelAndView searchByText(@RequestParam(value = "search",required = false) String search,
                                     @PageableDefault(value = 2)Pageable pageable,
                                     Model model){
        model.addAttribute("search",search);
        Page<Student> studentList =  search == null ?
                studentService.findAll(pageable) : studentService.findByInputText(search,pageable);
        return new ModelAndView("student/list","studentList",studentList);
    }


    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "/student/create";
    }

    @PostMapping(value = "/create")
    public String createStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes) {
        studentService.save(student);
        redirectAttributes.addFlashAttribute("successMsg", "Create student: "+student.getName() +" success!");
        return "redirect:/student";
//        return "forward:/student";
    }
//
    @GetMapping(value = "/edit/{id}")
    public String showEditPage(@PathVariable int id, Model model){
        System.out.println(id);
        model.addAttribute("student", studentService.findById(id));
        return "/student/edit";
    }

    @PostMapping(value = "/edit")
    public String editStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes){
        studentService.update(student);
        redirectAttributes.addFlashAttribute("successMsg", "Update student: "+student.getName() +" success!");
        return "redirect:/student";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.delete(id);
        return "redirect:/student";
    }
}

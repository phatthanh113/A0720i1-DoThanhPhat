package vn.phatdo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.phatdo.demo.models.Blog;
import vn.phatdo.demo.services.IBlogService;
@Controller
public class BlogController {
    @Autowired
    IBlogService blogService ;

    @GetMapping("/")
    public ModelAndView getListBlog(@PageableDefault(size = 5) Pageable pageable, Model model) {
        return new ModelAndView("list","blog",new Blog());
    }
}

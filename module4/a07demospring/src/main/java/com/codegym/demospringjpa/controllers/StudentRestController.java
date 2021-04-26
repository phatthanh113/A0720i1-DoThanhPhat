package com.codegym.demospringjpa.controllers;

import com.codegym.demospringjpa.models.Student;
import com.codegym.demospringjpa.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/rest-student",""})
public class StudentRestController {
    @Autowired
    StudentService studentService;
    @GetMapping("")
    public ResponseEntity<List<Student>> findAll() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Void> add(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/view/{id}")
    public ResponseEntity<Student> view(@PathVariable String id) {
        return new ResponseEntity<>(studentService.findById(id),HttpStatus.OK);
    }
}

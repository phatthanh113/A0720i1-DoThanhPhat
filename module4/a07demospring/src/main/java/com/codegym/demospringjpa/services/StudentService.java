package com.codegym.demospringjpa.services;

import com.codegym.demospringjpa.models.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface StudentService {
    List<Student> findAll();
    Page<Student> findAll(Pageable pageable);
    void save(Student student);
    void delete(int id);
    Student findById(int id);
    Student findById(String id);
    Page<Student> findByName(String name ,Pageable pageable);
}

package com.codegym.demospringjpa.models;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(generator = "id")
    @GenericGenerator(name = "id",
            strategy = "com.codegym.demospringjpa.models.generator.MyGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "prefix", value = "STU-"),
                    @org.hibernate.annotations.Parameter(name = "sequence", value = "student_sequence")})
    private String id;

    private String name;

    @ManyToOne
    private School school;
    @ManyToOne
    private Batch batch;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}

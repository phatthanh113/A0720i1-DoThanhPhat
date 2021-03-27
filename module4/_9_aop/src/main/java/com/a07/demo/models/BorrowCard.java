package com.a07.demo.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class BorrowCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @OneToOne
    private Book book ;
}

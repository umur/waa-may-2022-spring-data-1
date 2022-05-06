package com.example.lab2.Spring.Data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

    @JoinColumn
    @OneToOne
    private Review review;
}

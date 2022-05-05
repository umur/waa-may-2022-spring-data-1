package com.example.lab2.Spring.Data.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float price;
    private int rating;

//    @JoinColumn
//    @ManyToOne
//    private Category category;

    @ManyToOne
    private Category category;
}

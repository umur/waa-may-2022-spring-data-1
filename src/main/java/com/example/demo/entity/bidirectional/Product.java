package com.example.demo.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double price;
    private int rating;


    @ManyToOne
    private Category category;
}

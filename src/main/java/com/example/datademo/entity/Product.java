package com.example.datademo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private Double price;

    private Double rating;

    @JsonIgnoreProperties("products")
    @ManyToOne( fetch = FetchType.EAGER)
    private Category category;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonIgnoreProperties("products")
    private User user;
}

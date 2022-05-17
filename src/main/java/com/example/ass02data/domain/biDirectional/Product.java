package com.example.ass02data.domain.biDirectional;

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
    private String rating;

    @ManyToOne
    private Category category;
}

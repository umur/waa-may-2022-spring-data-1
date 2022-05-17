package com.example.ass02data.domain.uniDirectional;

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

    private Category category;
}

package com.example.springdata.unidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UniProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Double price;

    private Double rating;

}

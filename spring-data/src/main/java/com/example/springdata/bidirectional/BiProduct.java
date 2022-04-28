package com.example.springdata.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BiProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Double price;

    private Double rating;

    @ManyToOne
    private BiCategory category;
}

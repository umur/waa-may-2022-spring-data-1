package com.example.springdata.jointable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class JoinTableProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Double price;

    private Double rating;

    @ManyToOne
    private JoinTableCategory category;
}
